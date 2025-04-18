package f2;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class l0 extends j0 {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f17611g = true;

    @Override // com.facebook.appevents.o
    public void x(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.x(view, i10);
        } else if (f17611g) {
            try {
                k0.a(view, i10);
            } catch (NoSuchMethodError unused) {
                f17611g = false;
            }
        }
    }
}
