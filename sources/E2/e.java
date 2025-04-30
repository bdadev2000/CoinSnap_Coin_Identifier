package E2;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class e {
    public static final String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i9 = 0;
        while (i9 < length) {
            byte b = bArr[i9];
            i9++;
            stringBuffer.append(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
        }
        String stringBuffer2 = stringBuffer.toString();
        G7.j.d(stringBuffer2, "sb.toString()");
        return stringBuffer2;
    }

    public static final View b(Activity activity) {
        if (O2.a.b(e.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            O2.a.a(e.class, th);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        if (O7.o.C(r0, "generic", false) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean c() {
        /*
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = "FINGERPRINT"
            G7.j.d(r0, r1)
            java.lang.String r1 = "generic"
            r2 = 0
            boolean r3 = O7.o.C(r0, r1, r2)
            if (r3 != 0) goto L68
            java.lang.String r3 = "unknown"
            boolean r0 = O7.o.C(r0, r3, r2)
            if (r0 != 0) goto L68
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r3 = "MODEL"
            G7.j.d(r0, r3)
            java.lang.String r3 = "google_sdk"
            boolean r4 = O7.g.E(r3, r0)
            if (r4 != 0) goto L68
            java.lang.String r4 = "Emulator"
            boolean r4 = O7.g.E(r4, r0)
            if (r4 != 0) goto L68
            java.lang.String r4 = "Android SDK built for x86"
            boolean r0 = O7.g.E(r4, r0)
            if (r0 != 0) goto L68
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r4 = "MANUFACTURER"
            G7.j.d(r0, r4)
            java.lang.String r4 = "Genymotion"
            boolean r0 = O7.g.E(r4, r0)
            if (r0 != 0) goto L68
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r4 = "BRAND"
            G7.j.d(r0, r4)
            boolean r0 = O7.o.C(r0, r1, r2)
            if (r0 == 0) goto L60
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r4 = "DEVICE"
            G7.j.d(r0, r4)
            boolean r0 = O7.o.C(r0, r1, r2)
            if (r0 != 0) goto L68
        L60:
            java.lang.String r0 = android.os.Build.PRODUCT
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L69
        L68:
            r2 = 1
        L69:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: E2.e.c():boolean");
    }
}
