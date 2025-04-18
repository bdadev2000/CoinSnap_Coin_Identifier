package n0;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class n0 implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f22327b = new WeakHashMap();

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean z10;
        int i10;
        if (Build.VERSION.SDK_INT < 28) {
            for (Map.Entry entry : this.f22327b.entrySet()) {
                View view = (View) entry.getKey();
                boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
                if (view.isShown() && view.getWindowVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (booleanValue != z10) {
                    if (z10) {
                        i10 = 16;
                    } else {
                        i10 = 32;
                    }
                    ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(view, i10);
                    entry.setValue(Boolean.valueOf(z10));
                }
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
