function solution(arr) {
    var answer = [];

    if (arr.length === 1) {
        return answer = [-1];
    } else {
        arr.splice(arr.indexOf(Math.min(...arr)), 1);
        answer = arr;
    }

    return answer;
}

console.log(solution([4, 3, 2, 1]));
console.log(solution([10]));