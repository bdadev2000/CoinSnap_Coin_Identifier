package S0;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class h extends k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2787a;
    public final /* synthetic */ ViewPager2 b;

    public /* synthetic */ h(ViewPager2 viewPager2, int i9) {
        this.f2787a = i9;
        this.b = viewPager2;
    }

    @Override // S0.k
    public void a(int i9) {
        switch (this.f2787a) {
            case 0:
                if (i9 == 0) {
                    this.b.c();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // S0.k
    public final void c(int i9) {
        switch (this.f2787a) {
            case 0:
                ViewPager2 viewPager2 = this.b;
                if (viewPager2.f5169f != i9) {
                    viewPager2.f5169f = i9;
                    viewPager2.f5183v.m();
                    return;
                }
                return;
            default:
                ViewPager2 viewPager22 = this.b;
                viewPager22.clearFocus();
                if (viewPager22.hasFocus()) {
                    viewPager22.l.requestFocus(2);
                    return;
                }
                return;
        }
    }
}
