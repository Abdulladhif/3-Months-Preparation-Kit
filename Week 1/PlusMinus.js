'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', function(inputStdin) {
    inputString += inputStdin;
});

process.stdin.on('end', function() {
    inputString = inputString.split('\n');

    main();
});

function readLine() {
    return inputString[currentLine++];
}

// solustion
function plusMinus(arr) {
    let postive =0;
    let negative =0;
    let zero =0;
    let total = arr.length;
    
    for(let num of arr){
        if(num > 0){
            postive++;
        }else if(num < 0){
            negative++;
        }else{
            zero++;
        }
    }
   //calculate the ratio
    let postiveRatio = postive/total;
    let negativeRatio = negative/total;
    let zeroRatio = zero/total;

    //print the ratio
    console.log(postiveRatio.toFixed(6));
    console.log(negativeRatio.toFixed(6));
    console.log(zeroRatio.toFixed(6));  
}
function main() {
    const n = parseInt(readLine().trim(), 10);

    const arr = readLine().replace(/\s+$/g, '').split(' ').map(arrTemp => parseInt(arrTemp, 10));

    plusMinus(arr);
}