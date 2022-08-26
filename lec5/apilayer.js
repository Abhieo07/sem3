var myHeaders = new Headers();
myHeaders.append("apikey", "RvDyxzzenuuofpN5rbePBGtI9ELBC5Qk");

var requestOptions = {
  method: 'GET',
  redirect: 'follow',
  headers: myHeaders
};

fetch("https://api.apilayer.com/exchangerates_data/latest?symbols={symbols}&base={base}", requestOptions)
  .then(response => response.text())
  .then(result => console.log(result))
  .catch(error => console.log('error', error));