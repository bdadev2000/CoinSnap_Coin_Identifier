package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class q2 extends k2 implements l2 {
    public static final Method F;
    public l2 E;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                F = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public q2(Context context, int i10, int i11) {
        super(context, null, i10, i11);
    }

    @Override // androidx.appcompat.widget.l2
    public final void h(k.o oVar, MenuItem menuItem) {
        l2 l2Var = this.E;
        if (l2Var != null) {
            l2Var.h(oVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.k2
    public final y1 o(Context context, boolean z10) {
        p2 p2Var = new p2(context, z10);
        p2Var.setHoverListener(this);
        return p2Var;
    }

    @Override // androidx.appcompat.widget.l2
    public final void q(k.o oVar, k.q qVar) {
        l2 l2Var = this.E;
        if (l2Var != null) {
            l2Var.q(oVar, qVar);
        }
    }
}
