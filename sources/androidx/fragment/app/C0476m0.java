package androidx.fragment.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: androidx.fragment.app.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0476m0 implements InterfaceC0472k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f4740a;

    public C0476m0(FragmentManager fragmentManager) {
        this.f4740a = fragmentManager;
    }

    @Override // androidx.fragment.app.InterfaceC0472k0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        FragmentManager fragmentManager = this.f4740a;
        boolean prepareBackStackState = fragmentManager.prepareBackStackState(arrayList, arrayList2);
        fragmentManager.mBackStarted = true;
        if (!fragmentManager.mBackStackChangeListeners.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).booleanValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedHashSet.addAll(fragmentManager.fragmentsFromRecord((C0451a) it.next()));
            }
            Iterator<InterfaceC0470j0> it2 = fragmentManager.mBackStackChangeListeners.iterator();
            while (it2.hasNext()) {
                com.mbridge.msdk.foundation.entity.o.v(it2.next());
                Iterator it3 = linkedHashSet.iterator();
                if (it3.hasNext()) {
                    throw null;
                }
            }
        }
        return prepareBackStackState;
    }
}
