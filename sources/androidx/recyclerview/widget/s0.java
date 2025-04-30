package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public final class s0 extends AbstractC0519b0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5089a = false;
    public final /* synthetic */ E b;

    public s0(E e4) {
        this.b = e4;
    }

    @Override // androidx.recyclerview.widget.AbstractC0519b0
    public final void a(RecyclerView recyclerView, int i9) {
        if (i9 == 0 && this.f5089a) {
            this.f5089a = false;
            this.b.h();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0519b0
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        if (i9 != 0 || i10 != 0) {
            this.f5089a = true;
        }
    }
}
