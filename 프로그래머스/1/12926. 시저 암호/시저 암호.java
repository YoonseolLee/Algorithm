class Solution {
    public String solution(String s, int n) {
        String answer = ""; // 암호화된 문자열을 저장할 변수 초기화
        
        // 주어진 문자열 s의 각 문자에 대해 반복
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i); // 현재 문자를 ch 변수에 저장
            
            // 현재 문자가 소문자인 경우
            if(Character.isLowerCase(ch)) {
                // 'a'에서부터의 거리에 n을 더한 후 26으로 나눈 나머지를 계산하여 알파벳 순서를 결정
                // 이후 다시 'a'를 더하여 ASCII 코드상의 문자로 변환
                ch = (char) ((ch - 'a' + n) % 26 + 'a');
            }
            // 현재 문자가 대문자인 경우
            else if(Character.isUpperCase(ch)) {
                // 'A'에서부터의 거리에 n을 더한 후 26으로 나눈 나머지를 계산하여 알파벳 순서를 결정
                // 이후 다시 'A'를 더하여 ASCII 코드상의 문자로 변환
                ch = (char) ((ch - 'A' + n) % 26 + 'A');
            }
            
            // 변환된 문자를 결과 문자열에 추가
            answer += ch;
        }
        
        // 암호화된 문자열 반환
        return answer;
    }
}
