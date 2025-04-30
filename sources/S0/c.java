package S0;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class c implements l {

    /* renamed from: a, reason: collision with root package name */
    public final int f2772a = 100;

    @Override // S0.l
    public final void a(View view, float f9) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if ((parent instanceof RecyclerView) && (parent2 instanceof ViewPager2)) {
            ViewPager2 viewPager2 = (ViewPager2) parent2;
            float f10 = this.f2772a * f9;
            if (viewPager2.getOrientation() == 0) {
                if (viewPager2.f5172i.getLayoutDirection() == 1) {
                    f10 = -f10;
                }
                view.setTranslationX(f10);
                return;
            }
            view.setTranslationY(f10);
            return;
        }
        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }
}
