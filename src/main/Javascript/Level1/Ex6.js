function solution(strings, n) {
    var answer = [];
    answer = strings.sort(function (a, b) {
        if (a[n] > b[n]) {
            return 1;
        } else if (a[n] < b[n]) {
            return -1;
        } else if (a > b) {
            return 1;
        } else {
            return -1;
        }
    });
    return answer;
}

console.log(solution(["sun", "bed", "car"], 1));
console.log(solution(["abce", "abcd", "cdx"], 2));