package org.jacoco.core.runtime;

import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class WildcardMatcher {
    private final Pattern pattern;

    public WildcardMatcher(String str) {
        String[] split = str.split("\\:");
        StringBuilder sb = new StringBuilder(str.length() * 2);
        int length = split.length;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < length) {
            String str2 = split[i2];
            if (z2) {
                sb.append('|');
            }
            sb.append('(');
            sb.append(toRegex(str2));
            sb.append(')');
            i2++;
            z2 = true;
        }
        this.pattern = Pattern.compile(sb.toString());
    }

    private static CharSequence toRegex(String str) {
        StringBuilder sb = new StringBuilder(str.length() * 2);
        for (char c2 : str.toCharArray()) {
            if (c2 == '*') {
                sb.append(".*");
            } else if (c2 != '?') {
                sb.append(Pattern.quote(String.valueOf(c2)));
            } else {
                sb.append(".");
            }
        }
        return sb;
    }

    public boolean matches(String str) {
        return this.pattern.matcher(str).matches();
    }
}
