//Q1
const a='teja';
// a=20; cannot change
//Q2
 if(a==='teja'){
     let b=1;
     console.log(b);
 }
 // console.log(b); cannot access outside if block
 //Q3
 const order={
     id:1,
     title:'choclate',
     price:10,
     printorder(){
         return this.id , this.title , this.price
     },
     getprice(){ return this.price}

 };
 const rr={ price:20};
//const abc= Object.assign(order,rr);
 //console.log(abc.getprice(),abc.printorder());
//Q4
let khali=[];
let names = ["Tom", "Ivan", "Jerry"];
var xyz=(names)=>{
    for(let i in names){
        let z="{"+"names: "+names[i]+",length: "+names[i].length+"}";
        khali.push(z);
    } 
};
xyz(names);
console.log(khali);
console.log();
//Q5
//a
function add(a=5,b=5){
    return a+b;
};
console.log(add())
//b
let userName="Teja";
let friends=["Segu","Venkata","Nagesh"];
function userFriends(userName, ...friends){
    console.log("Name is: "+userName +"\n the Friends are: ");
    for(let i in friends){
        
        console.log(friends[i]);  
    }
}
userFriends(userName,friends);
//c
let Names=["Teja","Venkata","Nagesh","Segu","Uday"];
function capitalNames(...fiveNames){
    for (let i in fiveNames) {
        
        console.log(fiveNames[i].toUpperCase());
    }
}
capitalNames(...Names);
//Q6
let lap_model="Lenovo Idepad";
let desktop_No=320;
let urName="Teja";
console.log(`The Name of the Customer is: ${urName}
The Desktop Number of the Customer is: ${desktop_No}
and The Laptop model of the Customer laptop is: ${lap_model}`);
//Q7
//a
let ab=[1,2,3,4,5];
let [,,,v,,]=ab;
console.log(v);
//b
let pin={
    name: "teja",
    address:{
        street: "XYZ",
        city: "pko",
        pincode: 534260,
        state: "ap",
        country: "INDIA"
    }
};
let { address:{pincode}}=pin; 
console.log("The Pincode of city is: "+pincode);
//Q8
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