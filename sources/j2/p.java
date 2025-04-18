package j2;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class p extends RecyclerView {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f19738b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ViewPager2 viewPager2, Context context) {
        super(context);
        this.f19738b = viewPager2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        this.f19738b.f2165v.getClass();
        return super.getAccessibilityClassName();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ViewPager2 viewPager2 = this.f19738b;
        accessibilityEvent.setFromIndex(viewPager2.f2150f);
        accessibilityEvent.setToIndex(viewPager2.f2150f);
        viewPager2.f2165v.q(accessibilityEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f19738b.f2164t && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f19738b.f2164t && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
