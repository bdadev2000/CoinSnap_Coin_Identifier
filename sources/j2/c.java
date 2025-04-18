package j2;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class c implements n {
    public final int a;

    public c(int i10) {
        if (i10 >= 0) {
            this.a = i10;
            return;
        }
        throw new IllegalArgumentException("Margin must be non-negative");
    }

    @Override // j2.n
    public final void a(View view, float f10) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if ((parent instanceof RecyclerView) && (parent2 instanceof ViewPager2)) {
            ViewPager2 viewPager2 = (ViewPager2) parent2;
            float f11 = this.a * f10;
            if (viewPager2.getOrientation() == 0) {
                int layoutDirection = viewPager2.f2153i.getLayoutDirection();
                boolean z10 = true;
                if (layoutDirection != 1) {
                    z10 = false;
                }
                if (z10) {
                    f11 = -f11;
                }
                view.setTranslationX(f11);
                return;
            }
            view.setTranslationY(f11);
            return;
        }
        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }
}
