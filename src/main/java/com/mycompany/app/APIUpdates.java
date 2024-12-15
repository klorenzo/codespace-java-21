package com.mycompany.app;

public class APIUpdates {

    public static void main(String[] args) {
        
        // String .repeat
        System.out.println();

        System.out.println("Java ".repeat(3)); // Since Java 11

        var builder = new StringBuilder(); // Since Java 21
        builder.repeat("Java ", 3);
        System.out.println(builder);

        var buffer = new StringBuffer(); // Since Java 21
        buffer.repeat("Java ", 3);
        System.out.println(buffer);

        // Character .isEmoji (😀) Read more about Unicode Emojis Specification
        System.out.println();

        System.out.println("😀".codePointAt(0));
        System.out.println(Character.isEmoji("😀".codePointAt(0)));
        System.out.println(":)".codePointAt(0));
        System.out.println(Character.isEmoji(":)".codePointAt(0)));

        // Math .clamp
        System.out.println();

        System.out.println(bounded(30, 40, 120));
        System.out.println(bounded(200, 40, 120));
        System.out.println(bounded(50, 40, 120));

        System.out.println(Math.clamp(30, 40, 120));
        System.out.println(Math.clamp(200, 40, 120));
        System.out.println(Math.clamp(50, 40, 120));

    }

    public static int bounded(int i, int min, int max) {
        if (i < min) {
            return min;
        }
        if (i > max) {
            return max;
        }
        return i;
    }
    
}
