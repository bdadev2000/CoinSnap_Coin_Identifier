package t0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public final class h extends n0.b {
    @Override // n0.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        boolean z10;
        super.c(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        if (nestedScrollView.getScrollRange() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityEvent.setScrollable(z10);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
    }

    @Override // n0.b
    public final void d(View view, o0.j jVar) {
        int scrollRange;
        this.a.onInitializeAccessibilityNodeInfo(view, jVar.a);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        jVar.i(ScrollView.class.getName());
        if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
            jVar.m(true);
            if (nestedScrollView.getScrollY() > 0) {
                jVar.b(o0.c.f22958g);
                jVar.b(o0.c.f22962k);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                jVar.b(o0.c.f22957f);
                jVar.b(o0.c.f22963l);
            }
        }
    }

    @Override // n0.b
    public final boolean g(View view, int i10, Bundle bundle) {
        if (super.g(view, i10, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        int height = nestedScrollView.getHeight();
        Rect rect = new Rect();
        if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
            height = rect.height();
        }
        if (i10 != 4096) {
            if (i10 != 8192 && i10 != 16908344) {
                if (i10 != 16908346) {
                    return false;
                }
            } else {
                int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.u(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                return true;
            }
        }
        int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
        if (min == nestedScrollView.getScrollY()) {
            return false;
        }
        nestedScrollView.u(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
        return true;
    }
}
