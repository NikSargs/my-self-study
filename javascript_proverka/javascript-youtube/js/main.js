

// const person = {
// 	userName : 'Jo',
// 	age : 30,
// 	isMarried : false,
// 	sayHi: function (name) {
// 		console.log(this);
// 		console.log( `Hi ${name}! My name is ${this.userName}` );
// 	}


// };

// person.sayHi("Mark");

// const person = {
// 	userName : 'Jo',
// 	age : 30,
// 	isMarried : false,
// 	sayHi: function (name) {
// 		console.log(this);
// 		console.log( `Hi ${name}! My name is ${this.userName}` );
// 	}
// };


// for (let key in person) {
// 	console.log(key, ':', person[key]);
// }

// const person1 = {
// 	userName : 'Jo',
// 	age : 30,
// 	isMarried : false,
// 	sayHi: function (name) {
// 		console.log(this);
// 		console.log( `Hi ${name}! My name is ${this.userName}` );
// 	}
// };



class Person {
	constructor(userName, age, isMarried) {
		this.userName = userName;
		this.age = age;
		this.isMarried = isMarried;
	}
	sayHi(name) {
		console.log(`Hi ${name}! My name is ${this.userName}`);
	}
}


const person1 = new Person('Jo', 30, false);
const person2 = new Person('Bob', 28, true);

console.log(person1);
console.log(person2);

person2.sayHi('Lee');