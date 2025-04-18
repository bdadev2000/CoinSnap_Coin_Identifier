package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public final class m extends a1 {
    public final /* synthetic */ p a;

    public m(p pVar) {
        this.a = pVar;
    }

    @Override // androidx.recyclerview.widget.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        boolean z11;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        p pVar = this.a;
        int computeVerticalScrollRange = pVar.f2000s.computeVerticalScrollRange();
        int i12 = pVar.f1999r;
        int i13 = computeVerticalScrollRange - i12;
        int i14 = pVar.a;
        if (i13 > 0 && i12 >= i14) {
            z10 = true;
        } else {
            z10 = false;
        }
        pVar.f2001t = z10;
        int computeHorizontalScrollRange = pVar.f2000s.computeHorizontalScrollRange();
        int i15 = pVar.f1998q;
        if (computeHorizontalScrollRange - i15 > 0 && i15 >= i14) {
            z11 = true;
        } else {
            z11 = false;
        }
        pVar.u = z11;
        boolean z12 = pVar.f2001t;
        if (!z12 && !z11) {
            if (pVar.f2002v != 0) {
                pVar.c(0);
                return;
            }
            return;
        }
        if (z12) {
            float f10 = i12;
            pVar.f1993l = (int) ((((f10 / 2.0f) + computeVerticalScrollOffset) * f10) / computeVerticalScrollRange);
            pVar.f1992k = Math.min(i12, (i12 * i12) / computeVerticalScrollRange);
        }
        if (pVar.u) {
            float f11 = computeHorizontalScrollOffset;
            float f12 = i15;
            pVar.f1996o = (int) ((((f12 / 2.0f) + f11) * f12) / computeHorizontalScrollRange);
            pVar.f1995n = Math.min(i15, (i15 * i15) / computeHorizontalScrollRange);
        }
        int i16 = pVar.f2002v;
        if (i16 == 0 || i16 == 1) {
            pVar.c(1);
        }
    }
}
