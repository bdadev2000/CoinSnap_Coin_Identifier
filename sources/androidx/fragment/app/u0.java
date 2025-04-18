package androidx.fragment.app;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u0 implements a1 {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1722b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f1723c;

    public /* synthetic */ u0(FragmentManager fragmentManager, String str, int i10) {
        this.a = i10;
        this.f1723c = fragmentManager;
        this.f1722b = str;
    }

    @Override // androidx.fragment.app.a1
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        int i10 = this.a;
        String str = this.f1722b;
        FragmentManager fragmentManager = this.f1723c;
        switch (i10) {
            case 0:
                return fragmentManager.clearBackStackState(arrayList, arrayList2, str);
            case 1:
                return fragmentManager.restoreBackStackState(arrayList, arrayList2, str);
            default:
                return fragmentManager.saveBackStackState(arrayList, arrayList2, str);
        }
    }
}
