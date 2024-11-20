package com.mycompany.app;

import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class ParenthesesValidator {

    public boolean isValid(String s) {

        Set<Character> validChars = Set.of(']', '[', '}', '{', ')', '(');

        Map<Character, Character> closeToOpen = Map.of(
            ']', '[',
            '}', '{',
            ')', '('
        );

        Stack<Character> visited = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (!validChars.contains(current)) {
                continue;
            }
            boolean closing = closeToOpen.containsKey(current);
            if (closing) {
                if (visited.isEmpty()) {
                    return false;
                }
                char opening = closeToOpen.get(current);
                char last = visited.pop();
                if (opening != last) {
                    return false;
                }
            } else {
                visited.push(current);
            }
        }

        return visited.isEmpty();
    }

}
