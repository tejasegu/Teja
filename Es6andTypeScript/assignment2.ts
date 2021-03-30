const previousNo=Symbol()
const currentNo=Symbol()


class MyClass {
    constructor(curr: number) {
      this[previousNo] = fibo(curr - 1);
      this[currentNo] = curr;
    }
    next() {
      return fibo(this[currentNo] + 1);
    }
  }
  var fibo = function (n: number) {
    var a = 0,
      b = 1,
      f = 1;
    for (var i = 2; i <= n; i++) {
      f = a + b;
      a = b;
      b = f;
    }
    return f;
  };
  let myClass = new MyClass(8);
  console.log(myClass.next());

  //Q2
  let lowNumber = 10;
console.log("Armstrong Numbers:");
function armstong() {
  for (let i = lowNumber; i > 0; i++) {
    let numberOfDigits = i.toString().length;

    let sum = 0;

    let temp = i.toString();

    for (let char of temp) {
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
let lowNumber2 = 9;
console.log("Armstrong Numbers:");
function armstong2() {
  for (let i = lowNumber2; i > 0; i++) {
    let numberOfDigits = i.toString().length;

    let sum = 0;

    let temp = i.toString();

    for (let char of temp) {
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
class User {
    name: string;
    message: Map<string, string>;
    constructor(name: string, message: Map<string, string>) {
      this.name = name;
      this.message = message;
    }
  }
  
  let msgUser1 = new Map();
  msgUser1.set("message1", "This is the message 1");
  msgUser1.set("message2", "This is the message 2");
  let user1 = new User("Alpha", msgUser1);
  
  let msgUser2 = new Map();
  msgUser2.set("message1", "This is the message 1");
  msgUser2.set("message2", "This is the message 2");
  let user2 = new User("Bravo", msgUser2);
  
  let msgUser3 = new Map();
  msgUser3.set("message1", "This is the message 1");
  msgUser3.set("message2", "This is the message 2");
  let user3 = new User("Chralie", msgUser3);
  
  let msgUser4 = new Map();
  msgUser4.set("message1", "This is the message 1");
  msgUser4.set("message2", "This is the message 2");
  let user4 = new User("Delta", msgUser4);
  
  let msgUser5 = new Map();
  msgUser5.set("message1", "This is the message 1");
  msgUser5.set("message2", "This is the message 2");
  let user5 = new User("Echo", msgUser5);
  
  let msgUser6 = new Map();
  msgUser6.set("message1", "This is the message 1");
  msgUser6.set("message2", "This is the message 2");
  let user6 = new User("Foxtrot", msgUser6);
  
  let usersSet = new Set<User>();
  let usersSet2 = new Set<User>();
  
  usersSet.add(user1);
  usersSet.add(user2);
  usersSet.add(user3);
  
  function addUserRoom2(user: User) {
    if (!usersSet.has(user) && usersSet2.size < 3) {
      usersSet2.add(user);
    }
  }
  addUserRoom2(user4);
  addUserRoom2(user5);
  addUserRoom2(user1);
  addUserRoom2(user6);
  
  let chatroom = new Map<String, Set<User>>();
  
  chatroom.set("chatroom1", usersSet);
  
  chatroom.set("chatroom2", usersSet2);
  
  console.log(chatroom);