package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public final class r1 extends a1 {
    public boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f2024b;

    public r1(f0 f0Var) {
        this.f2024b = f0Var;
    }

    @Override // androidx.recyclerview.widget.a1
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0 && this.a) {
            this.a = false;
            this.f2024b.h();
        }
    }

    @Override // androidx.recyclerview.widget.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return;
        }
        this.a = true;
    }
}
