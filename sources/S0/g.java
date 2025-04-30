package S0;

import androidx.recyclerview.widget.L;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class g extends L {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2786c;

    public /* synthetic */ g(Object obj, int i9) {
        this.b = i9;
        this.f2786c = obj;
    }

    @Override // androidx.recyclerview.widget.L
    public final void onChanged() {
        switch (this.b) {
            case 0:
                ViewPager2 viewPager2 = (ViewPager2) this.f2786c;
                viewPager2.f5170g = true;
                viewPager2.f5175n.l = true;
                return;
            default:
                ((b1.h) this.f2786c).m();
                return;
        }
    }

    @Override // androidx.recyclerview.widget.L
    public final void onItemRangeChanged(int i9, int i10) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.L
    public final void onItemRangeInserted(int i9, int i10) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.L
    public final void onItemRangeMoved(int i9, int i10, int i11) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.L
    public final void onItemRangeRemoved(int i9, int i10) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.L
    public final void onItemRangeChanged(int i9, int i10, Object obj) {
        onChanged();
    }
}
