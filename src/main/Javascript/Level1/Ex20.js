function solution(n) {
    var answer = 0;
    for (let i = 0; i < Math.sqrt(n) + 1; i++) {
        if (Math.sqrt(n) === i) {
            answer = Math.pow(i + 1, 2);
        } else {
            answer = -1
        }
    }
    return answer;
}

console.log(solution(121));
console.log(solution(3));