function solution(s) {
    var answer = '';
    let ss = s.split("");
    let idx = 0;
    for (let i = 0; i < ss.length; i++) {
        if (ss[i] === " ") {
            idx = 0;
            answer += " ";
        } else if (idx % 2 === 0) {
            answer += ss[i].toUpperCase();
            idx++;
        } else {
            answer += ss[i].toLowerCase();
            idx++;
        }
    }
    return answer;
}

console.log(solution("try hello world"));