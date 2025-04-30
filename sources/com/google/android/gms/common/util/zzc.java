package com.google.android.gms.common.util;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
final class zzc {
    private static final Pattern zza = Pattern.compile("\\\\u[0-9a-fA-F]{4}");

    public static String zza(String str) {
        if (!TextUtils.isEmpty(str)) {
            Matcher matcher = zza.matcher(str);
            StringBuilder sb = null;
            int i9 = 0;
            while (matcher.find()) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                int start = matcher.start();
                int i10 = start;
                while (i10 >= 0 && str.charAt(i10) == '\\') {
                    i10--;
                }
                if ((start - i10) % 2 != 0) {
                    int parseInt = Integer.parseInt(matcher.group().substring(2), 16);
                    sb.append((CharSequence) str, i9, matcher.start());
                    if (parseInt == 92) {
                        sb.append("\\\\");
                    } else {
                        sb.append(Character.toChars(parseInt));
                    }
                    i9 = matcher.end();
                }
            }
            if (sb != null) {
                if (i9 < matcher.regionEnd()) {
                    sb.append((CharSequence) str, i9, matcher.regionEnd());
                }
                return sb.toString();
            }
            return str;
        }
        return str;
    }
}
