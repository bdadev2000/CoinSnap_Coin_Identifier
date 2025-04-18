package j2;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class g extends j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19730b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19731c;

    public /* synthetic */ g(Object obj, int i10) {
        this.f19730b = i10;
        this.f19731c = obj;
    }

    @Override // androidx.recyclerview.widget.l0
    public final void onChanged() {
        int i10 = this.f19730b;
        Object obj = this.f19731c;
        switch (i10) {
            case 0:
                ViewPager2 viewPager2 = (ViewPager2) obj;
                viewPager2.f2151g = true;
                viewPager2.f2158n.f19728l = true;
                return;
            default:
                ((m) obj).r();
                return;
        }
    }
}
