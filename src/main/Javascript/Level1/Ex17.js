function solution(n) {
    let answer = 0;
    let nums = [];
    do {
        nums.push(n % 10);
        n = Math.floor(n / 10);
    } while (n > 0);
    console.log(nums);
    for (let i = 0; i < nums.length; i++) {
        answer += nums[i];
    }
    return answer;
}

console.log(solution(123));
console.log(solution(987));