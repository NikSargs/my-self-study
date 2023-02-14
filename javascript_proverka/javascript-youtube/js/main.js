// =====TO DO список задач

const todoList = document.querySelector('#todo-list');
const todoForm = document.querySelector('#todo-form');
const todoInput = document.querySelector('#todo-input');

todoForm.addEventListener('submit', formHandler);

function formHandler (e) {
	e.preventDefault();
	

	const taskText = todoInput.value;

	// Создаём тег ли через разметку

	// const li = `<li>${taskText}</li>`;

	// // Добавляем разметку на страницу

	// todoList.insertAdjacentHTML('beforeend', li);

	// Создаём тег с помощью создания элемента

	const newTask = document.createElement('li');
	
	newTask.innerText = taskText;

	// Создаем кнопку удалить

	const deletBtn = document.createElement('button');

	deletBtn.setAttribute('role', 'button');

	deletBtn.innerText = 'Delete';

	newTask.append(deletBtn);


	// Добавляем событие по клику

	deletBtn.addEventListener('click', function(){
		this.closest('li').remove();
	});


	todoList.append(newTask);

	// Очитить поле ввода

	todoInput.value = '';

	// Фокус на поле ввода

	todoInput.focus();
}

