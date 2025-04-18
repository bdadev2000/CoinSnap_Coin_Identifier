package f2;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public abstract class h0 extends com.facebook.appevents.o {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f17596d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f17597e = true;

    public void A(View view, Matrix matrix) {
        if (f17596d) {
            try {
                g0.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f17596d = false;
            }
        }
    }

    public void B(View view, Matrix matrix) {
        if (f17597e) {
            try {
                g0.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f17597e = false;
            }
        }
    }
}
