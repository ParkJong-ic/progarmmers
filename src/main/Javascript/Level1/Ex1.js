function solution(a, b) {
    let week = ["FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"];
    let month = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
    let x = 0;
    for (let i = 0; i < a - 1; i++) {
        x += month[i];
    }
    x += b -1;
    return week[x % 7];
}

console.log(solution(5, 24))