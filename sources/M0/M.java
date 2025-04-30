package M0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import w4.v0;

/* loaded from: classes.dex */
public class M extends v0 {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f1848d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f1849e = true;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f1850f = true;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f1851g = true;

    @Override // w4.v0
    public void B(View view, int i9) {
        if (Build.VERSION.SDK_INT == 28) {
            super.B(view, i9);
        } else if (f1851g) {
            try {
                L.a(view, i9);
            } catch (NoSuchMethodError unused) {
                f1851g = false;
            }
        }
    }

    public void F(View view, int i9, int i10, int i11, int i12) {
        if (f1850f) {
            try {
                K.a(view, i9, i10, i11, i12);
            } catch (NoSuchMethodError unused) {
                f1850f = false;
            }
        }
    }

    public void G(View view, Matrix matrix) {
        if (f1848d) {
            try {
                J.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f1848d = false;
            }
        }
    }

    public void H(View view, Matrix matrix) {
        if (f1849e) {
            try {
                J.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f1849e = false;
            }
        }
    }
}
