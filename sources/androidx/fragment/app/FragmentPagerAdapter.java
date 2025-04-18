package androidx.fragment.app;

import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;

@Deprecated
/* loaded from: classes2.dex */
public abstract class FragmentPagerAdapter extends PagerAdapter {
    @Override // androidx.viewpager.widget.PagerAdapter
    public final void b(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Parcelable c() {
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void d(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }
}
