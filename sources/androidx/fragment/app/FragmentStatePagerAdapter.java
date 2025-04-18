package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;

@Deprecated
/* loaded from: classes3.dex */
public abstract class FragmentStatePagerAdapter extends PagerAdapter {
    @Override // androidx.viewpager.widget.PagerAdapter
    public final void b(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable == null) {
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        bundle.setClassLoader(classLoader);
        bundle.getParcelableArray("states");
        throw null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Parcelable c() {
        throw null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void d(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }
}
