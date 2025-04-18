package j9;

import java.util.regex.Pattern;
import n9.h0;

/* loaded from: classes3.dex */
public abstract class j {
    public static final /* synthetic */ int a = 0;

    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    public static float a(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long b(String str) {
        int i10 = h0.a;
        String[] split = str.split("\\.", 2);
        long j3 = 0;
        for (String str2 : split[0].split(":", -1)) {
            j3 = (j3 * 60) + Long.parseLong(str2);
        }
        long j10 = j3 * 1000;
        if (split.length == 2) {
            j10 += Long.parseLong(split[1]);
        }
        return j10 * 1000;
    }
}
