package T;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class J implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
    public final WeakHashMap b = new WeakHashMap();

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean z8;
        int i9;
        if (Build.VERSION.SDK_INT < 28) {
            for (Map.Entry entry : this.b.entrySet()) {
                View view = (View) entry.getKey();
                boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
                if (view.isShown() && view.getWindowVisibility() == 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (booleanValue != z8) {
                    if (z8) {
                        i9 = 16;
                    } else {
                        i9 = 32;
                    }
                    ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(view, i9);
                    entry.setValue(Boolean.valueOf(z8));
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
