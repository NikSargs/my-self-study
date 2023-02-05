let detailsForm = document.querySelector('#destination_details_form');


detailsForm.addEventListener('submit', handleFormSubmit);

function handleFormSubmit(event) {
	event.preventDefault();

	let destName = event.target.elements['name'].value;
	let destLocation = event.target.elements['location'].value; 
	let destPhoto = event.target.elements['photo'].value;
	let destDescription = event.target.elements['description'].value;

	for (let i = 0; i < detailsForm.length; i++){
		detailsForm.elements[i].value = "";

	}

	let destCard = createDestinationCard(destName, destLocation, destPhoto, destDescription);

	let whishListContainer = document.getElementById('destination_container');

	if (whishListContainer.children.length === 0){
		document.getElementById('title').innerHTML = "My wish list";
	}

	document.querySelector('#destination_container').appendChild(destCard);
}

function createDestinationCard(name, location, photoURL, description) {

	let card = document.createElement("div");
	card.className = 'card';

	let img = document.createElement('img');
	img.setAttribute('alt', name);

	let constantPhotoURL = "images/signpost.jpg";

	if(photoURL.length === 0 ){
		img.setAttribute('src', constantPhotoURL); 
	}
	else {
		img.setAttribute('src', photoURL);
	}

	card.appendChild(img);


	let cardBody = document.createElement("div");
	cardBody.className = "card-body";

	let cardTitle = document.createElement("h3");
	cardTitle.innerText = name;
	cardBody.appendChild(cardTitle);

	let cardSubtitle = document.createElement("h4");
	cardSubtitle.innerText = location;
	cardBody.appendChild(cardSubtitle);

	if (description.length !== 0) {
		let cardText = document.createElement("p");
		cardText.className = "card-text";
		cardText.innerText = description;
		cardBody.appendChild(cardText);
	}

	let cardDeleteBtn = document.createElement("button");
	cardDeleteBtn.innerText = "Remove";

	cardDeleteBtn = addEventListener("click",  removeDestination);
	cardBody.appendChild(cardDeleteBtn);

	card.appendChild(cardBody);

	return card;
}

function removeDestination(event) {
	let card = event.target.parentElement.parentElement;
	card.remove();


}