function solution(n) {
    var answer = 0;
    let arr = [];
    for (let i = 2; i <= n; ++i) {
        if (arr[i] === 1) continue;
        for (let j = i + i; j <= n; j += i) {
            arr[j] = 1;
        }
        ++answer;
    }
    return answer;
}

console.log(solution(10));
console.log(solution(5));