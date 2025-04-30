package A2;

import G7.j;
import android.widget.TextView;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f39a = new Object();

    /* JADX WARN: Removed duplicated region for block: B:20:0x0059 A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #1 {all -> 0x00c4, blocks: (B:6:0x000a, B:9:0x0010, B:14:0x0034, B:16:0x003d, B:20:0x0059, B:24:0x0075, B:28:0x0090, B:45:0x00bd, B:53:0x008a, B:61:0x006f, B:69:0x0053, B:79:0x002e, B:63:0x0048, B:47:0x0080, B:34:0x009a, B:37:0x00a4, B:39:0x00aa, B:42:0x00b1, B:73:0x001c, B:76:0x0026, B:55:0x0064), top: B:5:0x000a, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075 A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #1 {all -> 0x00c4, blocks: (B:6:0x000a, B:9:0x0010, B:14:0x0034, B:16:0x003d, B:20:0x0059, B:24:0x0075, B:28:0x0090, B:45:0x00bd, B:53:0x008a, B:61:0x006f, B:69:0x0053, B:79:0x002e, B:63:0x0048, B:47:0x0080, B:34:0x009a, B:37:0x00a4, B:39:0x00aa, B:42:0x00b1, B:73:0x001c, B:76:0x0026, B:55:0x0064), top: B:5:0x000a, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090 A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #1 {all -> 0x00c4, blocks: (B:6:0x000a, B:9:0x0010, B:14:0x0034, B:16:0x003d, B:20:0x0059, B:24:0x0075, B:28:0x0090, B:45:0x00bd, B:53:0x008a, B:61:0x006f, B:69:0x0053, B:79:0x002e, B:63:0x0048, B:47:0x0080, B:34:0x009a, B:37:0x00a4, B:39:0x00aa, B:42:0x00b1, B:73:0x001c, B:76:0x0026, B:55:0x0064), top: B:5:0x000a, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean b(android.view.View r7) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.f.b(android.view.View):boolean");
    }

    public final boolean a(TextView textView) {
        int i9;
        if (O2.a.b(this)) {
            return false;
        }
        try {
            String i10 = g.i(textView);
            Pattern compile = Pattern.compile("\\s");
            j.d(compile, "compile(...)");
            j.e(i10, "input");
            String replaceAll = compile.matcher(i10).replaceAll("");
            j.d(replaceAll, "replaceAll(...)");
            int length = replaceAll.length();
            if (length >= 12 && length <= 19) {
                int i11 = length - 1;
                if (i11 >= 0) {
                    boolean z8 = false;
                    i9 = 0;
                    while (true) {
                        int i12 = i11 - 1;
                        char charAt = replaceAll.charAt(i11);
                        if (!Character.isDigit(charAt)) {
                            return false;
                        }
                        int digit = Character.digit((int) charAt, 10);
                        if (digit >= 0) {
                            if (z8 && (digit = digit * 2) > 9) {
                                digit = (digit % 10) + 1;
                            }
                            i9 += digit;
                            z8 = !z8;
                            if (i12 < 0) {
                                break;
                            }
                            i11 = i12;
                        } else {
                            throw new IllegalArgumentException("Char " + charAt + " is not a decimal digit");
                        }
                    }
                } else {
                    i9 = 0;
                }
                if (i9 % 10 != 0) {
                    return false;
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            O2.a.a(this, th);
            return false;
        }
    }
}
