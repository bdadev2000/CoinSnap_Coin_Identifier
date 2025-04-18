package g0;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class l {
    public static final v3.c a;

    /* renamed from: b, reason: collision with root package name */
    public static final r.f f17916b;

    static {
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            a = new r();
        } else if (i10 >= 28) {
            a = new p();
        } else if (i10 >= 26) {
            a = new o();
        } else {
            Method method = n.f17924g;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                a = new n();
            } else {
                a = new m();
            }
        }
        f17916b = new r.f(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r3.equals(r5) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface a(android.content.Context r15, f0.e r16, android.content.res.Resources r17, int r18, java.lang.String r19, int r20, int r21, s.a r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.l.a(android.content.Context, f0.e, android.content.res.Resources, int, java.lang.String, int, int, s.a, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }
}
