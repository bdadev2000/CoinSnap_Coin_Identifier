package x1;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class a {
    public static boolean a(String current, String str) {
        boolean z10;
        boolean z11;
        Intrinsics.checkNotNullParameter(current, "current");
        if (Intrinsics.areEqual(current, str)) {
            return true;
        }
        if (current.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i10 < current.length()) {
                    char charAt = current.charAt(i10);
                    int i13 = i12 + 1;
                    if (i12 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt == '(') {
                        i11++;
                    } else if (charAt == ')' && i11 - 1 == 0 && i12 != current.length() - 1) {
                        break;
                    }
                    i10++;
                    i12 = i13;
                } else if (i11 == 0) {
                    z11 = true;
                }
            }
        }
        z11 = false;
        if (!z11) {
            return false;
        }
        String substring = current.substring(1, current.length() - 1);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return Intrinsics.areEqual(StringsKt.trim((CharSequence) substring).toString(), str);
    }
}
