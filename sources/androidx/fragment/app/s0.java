package androidx.fragment.app;

/* loaded from: classes.dex */
public final class s0 implements h1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f1715b;

    public s0(Fragment fragment) {
        this.f1715b = fragment;
    }

    @Override // androidx.fragment.app.h1
    public final void a(Fragment fragment) {
        this.f1715b.onAttachFragment(fragment);
    }
}
