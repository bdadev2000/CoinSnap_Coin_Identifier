package androidx.fragment.app;

/* renamed from: androidx.fragment.app.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0456c0 implements s0 {
    public final /* synthetic */ Fragment b;

    public C0456c0(Fragment fragment) {
        this.b = fragment;
    }

    @Override // androidx.fragment.app.s0
    public final void a(Fragment fragment) {
        this.b.onAttachFragment(fragment);
    }
}
