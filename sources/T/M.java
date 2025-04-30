package T;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public final class M implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public G0 f2870a = null;
    public final /* synthetic */ View b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0292x f2871c;

    public M(View view, InterfaceC0292x interfaceC0292x) {
        this.b = view;
        this.f2871c = interfaceC0292x;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        G0 h6 = G0.h(view, windowInsets);
        int i9 = Build.VERSION.SDK_INT;
        InterfaceC0292x interfaceC0292x = this.f2871c;
        if (i9 < 30) {
            N.a(windowInsets, this.b);
            if (h6.equals(this.f2870a)) {
                return interfaceC0292x.j(view, h6).g();
            }
        }
        this.f2870a = h6;
        G0 j7 = interfaceC0292x.j(view, h6);
        if (i9 >= 30) {
            return j7.g();
        }
        ViewCompat.requestApplyInsets(view);
        return j7.g();
    }
}
