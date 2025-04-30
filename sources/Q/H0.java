package q;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p.C2535n;
import p.MenuC2533l;

/* loaded from: classes.dex */
public final class H0 extends C0 implements D0 {

    /* renamed from: F, reason: collision with root package name */
    public static final Method f22547F;

    /* renamed from: E, reason: collision with root package name */
    public D0 f22548E;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f22547F = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // q.D0
    public final void c(MenuC2533l menuC2533l, C2535n c2535n) {
        D0 d02 = this.f22548E;
        if (d02 != null) {
            d02.c(menuC2533l, c2535n);
        }
    }

    @Override // q.D0
    public final void n(MenuC2533l menuC2533l, C2535n c2535n) {
        D0 d02 = this.f22548E;
        if (d02 != null) {
            d02.n(menuC2533l, c2535n);
        }
    }

    @Override // q.C0
    public final C2621r0 p(Context context, boolean z8) {
        G0 g02 = new G0(context, z8);
        g02.setHoverListener(this);
        return g02;
    }
}
