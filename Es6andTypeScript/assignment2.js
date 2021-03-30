var previousNo = Symbol();
var currentNo = Symbol();
var MyClass = /** @class */ (function () {
    function MyClass(curr) {
        this[previousNo] = fibo(curr - 1);
        this[currentNo] = curr;
    }
    MyClass.prototype.next = function () {
        return fibo(this[currentNo] + 1);
    };
    return MyClass;
}());
var fibo = function (n) {
    var a = 0, b = 1, f = 1;
    for (var i = 2; i <= n; i++) {
        f = a + b;
        a = b;
        b = f;
    }
    return f;
};
var myClass = new MyClass(8);
console.log(myClass.next());
//Q2
var lowNumber = 10;
console.log("Armstrong Numbers:");
function armstong() {
    for (var i = lowNumber; i > 0; i++) {
        var numberOfDigits = i.toString().length;
        var sum = 0;
        var temp = i.toString();
        for (var _i = 0, temp_1 = temp; _i < temp_1.length; _i++) {
            var char = temp_1[_i];
            sum += Math.pow(parseInt(char), numberOfDigits);
        }
        if (sum == i) {
            console.log(i);
            lowNumber = i;
            break;
        }
    }
}
function getNextArmstrong() {
    lowNumber++;
    armstong();
}
armstong();
getNextArmstrong();
getNextArmstrong();
getNextArmstrong();
getNextArmstrong();
//Q3
var lowNumber2 = 9;
console.log("Armstrong Numbers:");
function armstong2() {
    for (var i = lowNumber2; i > 0; i++) {
        var numberOfDigits = i.toString().length;
        var sum = 0;
        var temp = i.toString();
        for (var _i = 0, temp_2 = temp; _i < temp_2.length; _i++) {
            var char = temp_2[_i];
            sum += Math.pow(parseInt(char), numberOfDigits);
        }
        if (sum == i) {
            console.log(i);
            lowNumber2 = i;
            break;
        }
    }
}
function getNextArmstrong2() {
    lowNumber2++;
    armstong2();
}
function reset() {
    lowNumber2 = 9;
}
armstong2();
getNextArmstrong2();
getNextArmstrong2();
getNextArmstrong2();
reset();
armstong2();
getNextArmstrong2();
getNextArmstrong2();
getNextArmstrong2();
//Q4
var User = /** @class */ (function () {
    function User(name, message) {
        this.name = name;
        this.message = message;
    }
    return User;
}());
var msgUser1 = new Map();
msgUser1.set("message1", "This is the message 1");
msgUser1.set("message2", "This is the message 2");
var user1 = new User("Alpha", msgUser1);
var msgUser2 = new Map();
msgUser2.set("message1", "This is the message 1");
msgUser2.set("message2", "This is the message 2");
var user2 = new User("Bravo", msgUser2);
var msgUser3 = new Map();
msgUser3.set("message1", "This is the message 1");
msgUser3.set("message2", "This is the message 2");
var user3 = new User("Chralie", msgUser3);
var msgUser4 = new Map();
msgUser4.set("message1", "This is the message 1");
msgUser4.set("message2", "This is the message 2");
var user4 = new User("Delta", msgUser4);
var msgUser5 = new Map();
msgUser5.set("message1", "This is the message 1");
msgUser5.set("message2", "This is the message 2");
var user5 = new User("Echo", msgUser5);
var msgUser6 = new Map();
msgUser6.set("message1", "This is the message 1");
msgUser6.set("message2", "This is the message 2");
var user6 = new User("Foxtrot", msgUser6);
var usersSet = new Set();
var usersSet2 = new Set();
usersSet.add(user1);
usersSet.add(user2);
usersSet.add(user3);
function addUserRoom2(user) {
    if (!usersSet.has(user) && usersSet2.size < 3) {
        usersSet2.add(user);
    }
}
addUserRoom2(user4);
addUserRoom2(user5);
addUserRoom2(user1);
addUserRoom2(user6);
var chatroom = new Map();
chatroom.set("chatroom1", usersSet);
chatroom.set("chatroom2", usersSet2);
console.log(chatroom);
