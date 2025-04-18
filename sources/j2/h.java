package j2;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class h extends l {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f19732b;

    public /* synthetic */ h(ViewPager2 viewPager2, int i10) {
        this.a = i10;
        this.f19732b = viewPager2;
    }

    @Override // j2.l
    public final void a(int i10) {
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    this.f19732b.d();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // j2.l
    public final void c(int i10) {
        int i11 = this.a;
        ViewPager2 viewPager2 = this.f19732b;
        switch (i11) {
            case 0:
                if (viewPager2.f2150f != i10) {
                    viewPager2.f2150f = i10;
                    viewPager2.f2165v.r();
                    return;
                }
                return;
            default:
                viewPager2.clearFocus();
                if (viewPager2.hasFocus()) {
                    viewPager2.f2156l.requestFocus(2);
                    return;
                }
                return;
        }
    }
}
