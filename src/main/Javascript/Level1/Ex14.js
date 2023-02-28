function solutoion(s, n) {
    var answer = '';
    let upper = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
    let lowwer = 'abcdefghijklmnopqrstuvwxyz'
    let location;
    for (let i = 0; i < s.length; i++) {
        if (s[i] === " ") {
            answer += s[i];
            continue;
        }
        if (upper.includes(s[i])) {
            location = upper.indexOf(s[i]);
            if (location + n <= 25) {
                answer += upper.charAt(location + n);
            } else {
                answer += upper.charAt(location + n - 26);
            }
        } else {
            location = lowwer.indexOf(s[i]);
            if (location + n <= 25) {
                answer += lowwer.charAt(location + n);
            } else {
                answer += lowwer.charAt(location + n - 26);
            }
        }
    }
    return answer;
}

console.log(solutoion("AB", 1));
console.log(solutoion("z", 1));
console.log(solutoion("a B z", 4));