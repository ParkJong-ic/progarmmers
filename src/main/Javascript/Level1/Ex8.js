function solution(s) {
    var answer = '';
    let str = s.split("");
    str.sort(function (a, b) {
        if (a > b) {
            return -1;
        } else if (b > a) {
            return 1;
        } else return 0;
    });
    for (let i = 0; i < str.length; i++) {
        answer += str[i];
    }
    return answer;
}

console.log(solution("Zbcdefg"));