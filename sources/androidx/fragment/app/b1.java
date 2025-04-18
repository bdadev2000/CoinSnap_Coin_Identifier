package androidx.fragment.app;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b1 implements a1 {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1584b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1585c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f1586d;

    public b1(FragmentManager fragmentManager, String str, int i10, int i11) {
        this.f1586d = fragmentManager;
        this.a = str;
        this.f1584b = i10;
        this.f1585c = i11;
    }

    @Override // androidx.fragment.app.a1
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        Fragment fragment = this.f1586d.mPrimaryNav;
        if (fragment != null && this.f1584b < 0 && this.a == null && fragment.getChildFragmentManager().popBackStackImmediate()) {
            return false;
        }
        return this.f1586d.popBackStackState(arrayList, arrayList2, this.a, this.f1584b, this.f1585c);
    }
}
