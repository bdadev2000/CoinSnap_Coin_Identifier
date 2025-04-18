package androidx.appcompat.widget;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes.dex */
class TooltipCompatHandler implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public static TooltipCompatHandler f1287b;

    /* renamed from: c, reason: collision with root package name */
    public static TooltipCompatHandler f1288c;

    /* renamed from: a, reason: collision with root package name */
    public TooltipPopup f1289a;

    public static void b(TooltipCompatHandler tooltipCompatHandler) {
        if (f1287b != null) {
            throw null;
        }
        f1287b = tooltipCompatHandler;
        if (tooltipCompatHandler == null) {
            return;
        }
        ViewConfiguration.getLongPressTimeout();
        throw null;
    }

    public final void a() {
        if (f1288c == this) {
            f1288c = null;
            TooltipPopup tooltipPopup = this.f1289a;
            if (tooltipPopup != null) {
                tooltipPopup.getClass();
                throw null;
            }
            Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
        }
        if (f1287b != this) {
            throw null;
        }
        b(null);
        throw null;
    }

    public final void c(boolean z2) {
        throw null;
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        throw null;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int width = view.getWidth() / 2;
        int height = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }
}
