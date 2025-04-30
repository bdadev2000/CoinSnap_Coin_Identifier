package L;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final android.support.v4.media.session.a f1674a;
    public static final x.g b;

    static {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 29) {
            f1674a = new android.support.v4.media.session.a();
        } else if (i9 >= 28) {
            f1674a = new m();
        } else if (i9 >= 26) {
            f1674a = new m();
        } else {
            Method method = l.f1680d;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f1674a = new android.support.v4.media.session.a();
            } else {
                f1674a = new android.support.v4.media.session.a();
            }
        }
        b = new x.g(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (r6.equals(r12) == false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface a(android.content.Context r16, K.e r17, android.content.res.Resources r18, int r19, java.lang.String r20, int r21, int r22, K.b r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: L.j.a(android.content.Context, K.e, android.content.res.Resources, int, java.lang.String, int, int, K.b, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i9, String str, int i10, int i11) {
        return resources.getResourcePackageName(i9) + '-' + str + '-' + i10 + '-' + i9 + '-' + i11;
    }
}
