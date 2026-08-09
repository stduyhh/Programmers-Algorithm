def solution(s1, s2):
    answer = 0
    
    for letter in s1:
        for sa_letter in s2:
            if letter == sa_letter :
                answer += 1
    
    return answer