package androidx.navigation;

import android.os.Bundle;
import b1.f0;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import e0.q;
import e0.u;
import e0.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class NavType$Companion$IntListType$1 extends CollectionNavType<List<? extends Integer>> {
    @Override // androidx.navigation.NavType
    public final Object a(Bundle bundle, String str) {
        int[] iArr = (int[]) androidx.compose.foundation.text.input.a.f(bundle, "bundle", str, SDKConstants.PARAM_KEY, str);
        if (iArr != null) {
            return q.l0(iArr);
        }
        return null;
    }

    @Override // androidx.navigation.NavType
    public final String b() {
        return "List<Int>";
    }

    @Override // androidx.navigation.NavType
    public final Object c(Object obj, String str) {
        List list = (List) obj;
        NavType$Companion$IntType$1 navType$Companion$IntType$1 = NavType.f20492b;
        if (list == null) {
            return f0.u(navType$Companion$IntType$1.h(str));
        }
        return u.P0(f0.u(navType$Companion$IntType$1.h(str)), list);
    }

    @Override // androidx.navigation.NavType
    /* renamed from: d */
    public final Object h(String str) {
        return f0.u(NavType.f20492b.h(str));
    }

    @Override // androidx.navigation.NavType
    public final void e(Bundle bundle, String str, Object obj) {
        List list = (List) obj;
        p0.a.s(str, SDKConstants.PARAM_KEY);
        bundle.putIntArray(str, list != null ? u.Y0(list) : null);
    }

    @Override // androidx.navigation.NavType
    public final boolean g(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        return f0.g(list != null ? (Integer[]) list.toArray(new Integer[0]) : null, list2 != null ? (Integer[]) list2.toArray(new Integer[0]) : null);
    }

    @Override // androidx.navigation.CollectionNavType
    public final /* bridge */ /* synthetic */ Object h() {
        return w.f30218a;
    }

    @Override // androidx.navigation.CollectionNavType
    public final List i(Object obj) {
        List list = (List) obj;
        if (list == null) {
            return w.f30218a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(q.M(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        return arrayList;
    }
}
