package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0533m extends AbstractC0519b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0536p f5037a;

    public C0533m(C0536p c0536p) {
        this.f5037a = c0536p;
    }

    @Override // androidx.recyclerview.widget.AbstractC0519b0
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        boolean z8;
        boolean z9;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0536p c0536p = this.f5037a;
        int computeVerticalScrollRange = c0536p.f5065s.computeVerticalScrollRange();
        int i11 = c0536p.f5064r;
        int i12 = computeVerticalScrollRange - i11;
        int i13 = c0536p.f5050a;
        if (i12 > 0 && i11 >= i13) {
            z8 = true;
        } else {
            z8 = false;
        }
        c0536p.f5066t = z8;
        int computeHorizontalScrollRange = c0536p.f5065s.computeHorizontalScrollRange();
        int i14 = c0536p.f5063q;
        if (computeHorizontalScrollRange - i14 > 0 && i14 >= i13) {
            z9 = true;
        } else {
            z9 = false;
        }
        c0536p.f5067u = z9;
        boolean z10 = c0536p.f5066t;
        if (!z10 && !z9) {
            if (c0536p.f5068v != 0) {
                c0536p.d(0);
                return;
            }
            return;
        }
        if (z10) {
            float f9 = i11;
            c0536p.l = (int) ((((f9 / 2.0f) + computeVerticalScrollOffset) * f9) / computeVerticalScrollRange);
            c0536p.f5059k = Math.min(i11, (i11 * i11) / computeVerticalScrollRange);
        }
        if (c0536p.f5067u) {
            float f10 = computeHorizontalScrollOffset;
            float f11 = i14;
            c0536p.f5061o = (int) ((((f11 / 2.0f) + f10) * f11) / computeHorizontalScrollRange);
            c0536p.f5060n = Math.min(i14, (i14 * i14) / computeHorizontalScrollRange);
        }
        int i15 = c0536p.f5068v;
        if (i15 == 0 || i15 == 1) {
            c0536p.d(1);
        }
    }
}
