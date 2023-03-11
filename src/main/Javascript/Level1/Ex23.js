function solution(n, m) {
    var answer = [];

    for (let i = 1; i <= Math.min(n, m); i++) {
        if (n % i === 0 && m % i === 0) {
            answer[0] = i;
        }
    }

    for (let i = 1; i < 1000000; i++) {
        if ((n * i) % m === 0) {
            answer[1] = n * i;
            break;
        }
    }

    return answer;
}

console.log(solution(3, 12));
console.log(solution(2, 5));