package androidx.fragment.app;

import java.util.ArrayList;

/* renamed from: androidx.fragment.app.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0474l0 implements InterfaceC0472k0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4734a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4735c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f4736d;

    public C0474l0(FragmentManager fragmentManager, String str, int i9, int i10) {
        this.f4736d = fragmentManager;
        this.f4734a = str;
        this.b = i9;
        this.f4735c = i10;
    }

    @Override // androidx.fragment.app.InterfaceC0472k0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        Fragment fragment = this.f4736d.mPrimaryNav;
        if (fragment != null && this.b < 0 && this.f4734a == null && fragment.getChildFragmentManager().popBackStackImmediate()) {
            return false;
        }
        return this.f4736d.popBackStackState(arrayList, arrayList2, this.f4734a, this.b, this.f4735c);
    }
}
