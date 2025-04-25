package com.glority.utils.data;

import com.glority.utils.constant.RegexConstants;
import java.util.regex.Pattern;

/* loaded from: classes9.dex */
public final class RegexUtils {
    public static boolean isMobileSimple(CharSequence charSequence) {
        return isMatch(RegexConstants.REGEX_MOBILE_SIMPLE, charSequence);
    }

    public static boolean isMobileExact(CharSequence charSequence) {
        return isMatch(RegexConstants.REGEX_MOBILE_EXACT, charSequence);
    }

    public static boolean isEmail(CharSequence charSequence) {
        return isMatch(RegexConstants.REGEX_EMAIL, charSequence);
    }

    public static boolean isMatch(String str, CharSequence charSequence) {
        return charSequence != null && charSequence.length() > 0 && Pattern.matches(str, charSequence);
    }

    private RegexUtils() {
        throw new UnsupportedOperationException("u can't initialize me!");
    }
}
