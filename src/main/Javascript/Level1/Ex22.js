function solution(num) {
    var answer = '';
    num % 2 === 0 ? answer = "Even" : answer = "Odd";
    return answer;
}

console.log(solution(3));
console.log(solution(4));