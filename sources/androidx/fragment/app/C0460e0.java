package androidx.fragment.app;

import java.util.ArrayList;

/* renamed from: androidx.fragment.app.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0460e0 implements InterfaceC0472k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4715a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f4716c;

    public /* synthetic */ C0460e0(FragmentManager fragmentManager, String str, int i9) {
        this.f4715a = i9;
        this.f4716c = fragmentManager;
        this.b = str;
    }

    @Override // androidx.fragment.app.InterfaceC0472k0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        switch (this.f4715a) {
            case 0:
                return this.f4716c.clearBackStackState(arrayList, arrayList2, this.b);
            case 1:
                return this.f4716c.restoreBackStackState(arrayList, arrayList2, this.b);
            default:
                return this.f4716c.saveBackStackState(arrayList, arrayList2, this.b);
        }
    }
}
