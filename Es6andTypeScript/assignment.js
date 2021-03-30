var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
//Q1
var a = 'teja';
// a=20; cannot change
//Q2
if (a === 'teja') {
    var b = 1;
    console.log(b);
}
// console.log(b); cannot access outside if block
//Q3
var order = {
    id: 1,
    title: 'choclate',
    price: 10,
    printorder: function () {
        return this.id, this.title, this.price;
    },
    getprice: function () { return this.price; }
};
var rr = { price: 20 };
//const abc= Object.assign(order,rr);
//console.log(abc.getprice(),abc.printorder());
//Q4
var khali = [];
var names = ["Tom", "Ivan", "Jerry"];
var xyz = function (names) {
    for (var i in names) {
        var z = "{" + "names: " + names[i] + ",length: " + names[i].length + "}";
        khali.push(z);
    }
};
xyz(names);
console.log(khali);
console.log();
//Q5
//a
function add(a, b) {
    if (a === void 0) { a = 5; }
    if (b === void 0) { b = 5; }
    return a + b;
}
;
console.log(add());
//b
var userName = "Teja";
var friends = ["Segu", "Venkata", "Nagesh"];
function userFriends(userName) {
    var friends = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        friends[_i - 1] = arguments[_i];
    }
    console.log("Name is: " + userName + "\n the Friends are: ");
    for (var i in friends) {
        console.log(friends[i]);
    }
}
userFriends(userName, friends);
//c
var Names = ["Teja", "Venkata", "Nagesh", "Segu", "Uday"];
function capitalNames() {
    var fiveNames = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        fiveNames[_i] = arguments[_i];
    }
    for (var i in fiveNames) {
        console.log(fiveNames[i].toUpperCase());
    }
}
capitalNames.apply(void 0, Names);
//Q6
var lap_model = "Lenovo Idepad";
var desktop_No = 320;
var urName = "Teja";
console.log("The Name of the Customer is: " + urName + "\nThe Desktop Number of the Customer is: " + desktop_No + "\nand The Laptop model of the Customer laptop is: " + lap_model);
//Q7
//a
var ab = [1, 2, 3, 4, 5];
var v = ab[3];
console.log(v);
//b
var pin = {
    name: "teja",
    address: {
        street: "XYZ",
        city: "pko",
        pincode: 534260,
        state: "ap",
        country: "INDIA"
    }
};
var pincode = pin.address.pincode;
console.log("The Pincode of city is: " + pincode);
//Q8
var Account = /** @class */ (function () {
    function Account(accountId, accountName, accountBalance) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
        console.log(accountId, accountName, accountBalance);
    }
    return Account;
}());
var SavingAccount = /** @class */ (function (_super) {
    __extends(SavingAccount, _super);
    function SavingAccount(interest, accountId, accountName, accountBalance) {
        return _super.call(this, accountId, accountName, accountBalance) || this;
    }
    SavingAccount.prototype.getaccountBalance = function () {
        return this.accountBalance;
    };
    return SavingAccount;
}(Account));
var CurrentAccount = /** @class */ (function (_super) {
    __extends(CurrentAccount, _super);
    function CurrentAccount(cash_credit, accountId, accountName, accountBalance) {
        return _super.call(this, accountId, accountName, accountBalance) || this;
    }
    return CurrentAccount;
}(Account));
var ac = new SavingAccount(1, 2222, "teja", 3000);
var ad = new CurrentAccount(2000, 111, "te", 5000);
var acc = ac.accountBalance + ad.accountBalance;
console.log(acc);
