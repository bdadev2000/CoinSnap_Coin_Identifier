package f2;

import android.view.View;

/* loaded from: classes.dex */
public abstract class j0 extends h0 {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f17603f = true;

    public void C(View view, int i10, int i11, int i12, int i13) {
        if (f17603f) {
            try {
                i0.a(view, i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f17603f = false;
            }
        }
    }
}
