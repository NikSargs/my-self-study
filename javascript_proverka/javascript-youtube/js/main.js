// выбор одного элеметна DOM по селектору

// document.querySelector('selector');

//document.querySelector('h2').classList.add('red');

//const heading2 = document.querySelector("h2");
//heading2.classList.add('red');

// const headings = document.querySelectorAll('h2');

// console.log(headings);

// for (let heading of headings) {
// 	heading.classList.add('red-text');
// }

// const paragraphs = document.querySelectorAll('p');

// for (p of paragraphs) {
// 	p.classList.add('green-text');
// }

// const button = document.querySelector('#button');
// const img = document.querySelector('#logo');

// button.value = 'Delete';

// button.addEventListener('click', function () {
// 	console.log('click!');
// 	img.remove();
// })

// button.onclick = function () {
// 	console.log('click');
// 	img.remove();
// }

// const inputText = document.querySelector('#input-text');
// const textBlock = document.querySelector('#text-block');

// inputText.addEventListener('input', function() {
// 	console.log(inputText.value);
// 	textBlock.innerText = inputText.value;
// })

// ====OBJECT======= 

// const list = document.querySelector('#list');

// list.addEventListener('click', function(e) {
// 	//console.log(this);
// 	console.log(e.target);
// })


//==== Работа с элементами =====

const container = document.querySelector('#elementsContainer');

const newHeader = document.createElement('h1');

newHeader.innerText = 'Hello there';

container.append(newHeader);

// const mainHeader = document.querySelector('header');

// const headerCopy = mainHeader.cloneNode(true); // -- Для копирования 

// container.append(headerCopy);


// ==== Вставка через строки ===

// const htmlex = '<h2>one more title</h2>';

// container.insertAdjacentHTML('beforeend', htmlex);

// ===== Вставка разметки через шаблонные строки =====

// const title = 'title text';

// const htmlex = `<h2>${title}</h2>`;

// container.insertAdjacentHTML('beforeend', htmlex);