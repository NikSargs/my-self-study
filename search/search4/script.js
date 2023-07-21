
const partnerTable = document.getElementById('partnerTable');
const searchName = document.getElementById('searchName');
const searchAddress = document.getElementById('searchAddress');
const searchCity = document.getElementById('searchCity');

let demirPartners = [];

searchName.addEventListener('keyup', (e) => {
    const searchString = e.target.value.toLowerCase();
    const filteredPartners = demirPartners.filter( partner => {
        return (

            partner.name.toLowerCase().includes(searchString)
        );
        
    });
    displayPartners(filteredPartners);
});

searchCity.addEventListener('keyup', (e) => {
    let city = searchCity.options[searchCity.selectedIndex].text;
    console.log(city);
    let filteredPartners = demirPartners.filter( partner => {
        return (

            partner.branches[0].city.name.includes(city)
        );
        
    });
    displayPartners(filteredPartners);
});

searchAddress.addEventListener('keyup', (e) => {
    const searchString = e.target.value.toLowerCase();
    const filteredPartners = demirPartners.filter( partner => {
        return (

            partner.branches[0].address.toLowerCase().includes(searchString)
        );
        
    });
    displayPartners(filteredPartners);
});

const loadPartners = async () => {
    try {
        const res = await fetch('https://cardplus.demirbank.kg/api/partner/groupedList?lang=ru');
        demirPartners = await res.json();
        displayPartners(demirPartners);
    } catch (err) {
        console.error(err);
    }
};

const displayPartners = (partners) => {
    const htmlString = partners
        .map((partner) => {
            return "<tr>"+
            "<td class='pl-0 py-8'><span class='text-dark-75 d-block font-size-lg'>" 
            + partner.name +"</span></td>" +
             "<td>" + partner.branches[0].city.name + "</td>" + 
             "<td>" + partner.branches[0].address + "</td>" +
            "<td>" + partner.branches[0].category.name + "</td>" +
            "</tr>";})
        .join('');
    partnerTable.innerHTML = htmlString;
};

loadPartners();