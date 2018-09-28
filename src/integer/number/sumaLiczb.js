function sumaLiczb() {
    var field_number = document.forms['suma_cyfr'].number;
    var number = field_number.value;

    if (number != ''){
        var result = 0;
        while (number != 0){
            result += number%10;
            number = Math.floor(number / 10);
        }

        alert('suma cyfr podanej liczby wynosi: ' + result);
    }
    else {
        alert('Nie wpisano poprawnej wartości!');
        field_number.focus();
    }
    return false;
}