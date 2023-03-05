function solution(n) {
    var answer = 0;
    answer = Number(n.toString().split("").sort((a, b) => b - a).join(""));
    return answer;
}

console.log(solution(118372));