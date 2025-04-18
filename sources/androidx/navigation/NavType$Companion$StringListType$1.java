package androidx.navigation;

import android.net.Uri;
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
public final class NavType$Companion$StringListType$1 extends CollectionNavType<List<? extends String>> {
    @Override // androidx.navigation.NavType
    public final Object a(Bundle bundle, String str) {
        String[] strArr = (String[]) androidx.compose.foundation.text.input.a.f(bundle, "bundle", str, SDKConstants.PARAM_KEY, str);
        if (strArr != null) {
            return q.n0(strArr);
        }
        return null;
    }

    @Override // androidx.navigation.NavType
    public final String b() {
        return "List<String>";
    }

    @Override // androidx.navigation.NavType
    public final Object c(Object obj, String str) {
        List list = (List) obj;
        if (list == null) {
            return f0.u(str);
        }
        return u.P0(f0.u(str), list);
    }

    @Override // androidx.navigation.NavType
    /* renamed from: d */
    public final Object h(String str) {
        return f0.u(str);
    }

    @Override // androidx.navigation.NavType
    public final void e(Bundle bundle, String str, Object obj) {
        List list = (List) obj;
        p0.a.s(str, SDKConstants.PARAM_KEY);
        bundle.putStringArray(str, list != null ? (String[]) list.toArray(new String[0]) : null);
    }

    @Override // androidx.navigation.NavType
    public final boolean g(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        return f0.g(list != null ? (String[]) list.toArray(new String[0]) : null, list2 != null ? (String[]) list2.toArray(new String[0]) : null);
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
            arrayList.add(Uri.encode((String) it.next()));
        }
        return arrayList;
    }
}
