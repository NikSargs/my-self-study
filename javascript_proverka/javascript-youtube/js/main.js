

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



//const header = document.querySelector('h2').classList.add('red');

const headings = document.querySelectorAll('h2');


for (let heading of headings) {
	heading.classList.add('red-text')
}