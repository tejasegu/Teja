//Q1
let p1=Promise.resolve(2);
let p2=Promise.resolve(3);
Promise.all([p1,p2]).then(res=>{var a=res.reduce((x,y)=>x+y); console.log(a)})
//Q2
class Account{
    accountId: any;
    accountBalance: any;
    accountName: any;
    
    constructor(accountId,accountName,accountBalance){
       this.accountId=accountId;
       this.accountName=accountName;
       this.accountBalance=accountBalance;
        console.log(accountId,accountName,accountBalance);
        
    }
    
    
}
class SavingAccount extends Account{

   constructor(interest,accountId,accountName,accountBalance){
       super(accountId,accountName,accountBalance);
   }
   public getaccountBalance(){
       return this.accountBalance
   }
}
class CurrentAccount extends Account{
   constructor(cash_credit,accountId,accountName,accountBalance){
       super(accountId,accountName,accountBalance);
   }
}

let ac =new SavingAccount(1,2222,"teja",3000);
let ad=new CurrentAccount(2000,111,"te",5000);
let acc=ac.accountBalance+ad.accountBalance

console.log(acc);

//Q3
interface printable{
PrintAll:()=>string
}
var circle:printable={
    PrintAll:():string=>{return "Im in circle"}
}
var employee:printable={
    PrintAll:():string=>{return "Im in Employee"}
}
console.log(circle.PrintAll())
console.log(employee.PrintAll())