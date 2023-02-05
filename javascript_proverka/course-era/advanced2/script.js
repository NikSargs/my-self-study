(function () {

		"use strict";

		let converType = "miles";
    	const heading = document.querySelector('h1');
    	const intro = document.querySelector('p');

    	const answerDiv = document.getElementById('answer');
    	const form = document.getElementById('convert'); 
    	
    	document.addEventListener('keydown', function(event){
    		let key = event.code;

    		if (key === 'KeyK') {
    			converType = 'kilometers';
    			heading.innerHTML = "Kilometers to Miles Conventer";
    			intro.innerHTML = "Type in a number of kilometers and click the button to convert the distance to miles.";
    		}
    		else if (key === 'KeyM'){
    			converType = 'miles';
    			heading.innerHTML = 'Miles to Kilometers Conventer';
    			intro.innerHTML = 'Type in a number of miles and click the button to convert the distance to Kilometers';
    		}
    	});
    	form.addEventListener('submit', function(event){
    		
    		event.preventDefault();

    		const distance = parseFloat(document.getElementById('distance').value) ;

    		if(distance) {
    			if (converType =="miles") {

    				const converted = (distance * 1.609344).toFixed(3);
    			answer.innerHTML = `${distance} miles converts to ${converted} kilometers`;
    			}
    			else {
    				const converted = (distance * 0.621371192).toFixed(3);
    			answer.innerHTML = `${distance} kilometers converts to ${converted} miles`;
    			}
    			

    		}
    		else {
    			answer.innerHTML = "<h2>Please provide a number!</h2>"; 
    		}
    	});

})()