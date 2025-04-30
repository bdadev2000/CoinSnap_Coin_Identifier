package S0;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class n extends RecyclerView {
    public final /* synthetic */ ViewPager2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ViewPager2 viewPager2, Context context) {
        super(context);
        this.b = viewPager2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        this.b.f5183v.getClass();
        return super.getAccessibilityClassName();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ViewPager2 viewPager2 = this.b;
        accessibilityEvent.setFromIndex(viewPager2.f5169f);
        accessibilityEvent.setToIndex(viewPager2.f5169f);
        accessibilityEvent.setSource((ViewPager2) viewPager2.f5183v.f5272f);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.b.f5181t && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.b.f5181t && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
