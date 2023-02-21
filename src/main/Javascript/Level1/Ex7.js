function solution(s) {
    var answer = true;
    let str = s.split("");
    let pCount = 0;
    let yCount = 0;
    for (let i = 0; i < str.length; i++) {
        if (str[i] === 'p' || str[i] === 'P') {
            pCount++;
        }
        if (str[i] === 'y' || str[i] === 'Y') {
            yCount++;
        }
    }
    if (pCount !== yCount) {
        answer = false;
    }
    return answer;
}

console.log(solution("pPoooyY"));
console.log(solution("Pyy"));