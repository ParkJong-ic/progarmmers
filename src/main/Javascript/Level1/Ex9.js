function solution(s) {
    var answer = false;
    if ((s.length === 4 || s.length === 6) && /^\d*$/.test(s)) {
        answer = true;
    }
    return answer;
}

console.log(solution("a234"));
console.log(solution("1234"))