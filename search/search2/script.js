
const charactersList = document.getElementById('charactersList');
const searchBar = document.getElementById('searchBar');

let hpCharacters = [];

console.log(searchBar);

searchBar.addEventListener('keyup', (e) => {
    const searchString = e.target.value.toLowerCase();
    const filteredCharacters = hpCharacters.filter( character => {
        return (

            character.name.toLowerCase().includes(searchString)
        );
        
    });
    displayCharacters(filteredCharacters);
});

const loadCharacters = async () => {
    try {
        const res = await fetch('https://hp-api.onrender.com/api/characters');
        hpCharacters = await res.json();
        displayCharacters(hpCharacters);
    } catch (err) {
        console.error(err);
    }
};

const displayCharacters = (characters) => {
    const htmlString = characters
        .map((character) => {
            return `
            <li class="character">
                <h2>${character.name}</h2>
                <p>House: ${character.house}</p>
            </li>
        `;
        })
        .join('');
    charactersList.innerHTML = htmlString;
};

loadCharacters();