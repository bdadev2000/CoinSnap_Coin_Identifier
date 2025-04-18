package androidx.navigation;

import android.os.Bundle;
import b1.f0;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import e0.q;
import e0.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class NavType$Companion$BoolArrayType$1 extends CollectionNavType<boolean[]> {
    public static boolean[] j(String str) {
        return new boolean[]{((Boolean) NavType.f20499k.h(str)).booleanValue()};
    }

    @Override // androidx.navigation.NavType
    public final Object a(Bundle bundle, String str) {
        return (boolean[]) androidx.compose.foundation.text.input.a.f(bundle, "bundle", str, SDKConstants.PARAM_KEY, str);
    }

    @Override // androidx.navigation.NavType
    public final String b() {
        return "boolean[]";
    }

    @Override // androidx.navigation.NavType
    public final Object c(Object obj, String str) {
        boolean[] zArr = (boolean[]) obj;
        if (zArr == null) {
            return j(str);
        }
        boolean[] j2 = j(str);
        int length = zArr.length;
        boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
        System.arraycopy(j2, 0, copyOf, length, 1);
        p0.a.p(copyOf);
        return copyOf;
    }

    @Override // androidx.navigation.NavType
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object h(String str) {
        return j(str);
    }

    @Override // androidx.navigation.NavType
    public final void e(Bundle bundle, String str, Object obj) {
        p0.a.s(str, SDKConstants.PARAM_KEY);
        bundle.putBooleanArray(str, (boolean[]) obj);
    }

    @Override // androidx.navigation.NavType
    public final boolean g(Object obj, Object obj2) {
        Boolean[] boolArr;
        boolean[] zArr = (boolean[]) obj;
        boolean[] zArr2 = (boolean[]) obj2;
        Boolean[] boolArr2 = null;
        if (zArr != null) {
            boolArr = new Boolean[zArr.length];
            int length = zArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                boolArr[i2] = Boolean.valueOf(zArr[i2]);
            }
        } else {
            boolArr = null;
        }
        if (zArr2 != null) {
            boolArr2 = new Boolean[zArr2.length];
            int length2 = zArr2.length;
            for (int i3 = 0; i3 < length2; i3++) {
                boolArr2[i3] = Boolean.valueOf(zArr2[i3]);
            }
        }
        return f0.g(boolArr, boolArr2);
    }

    @Override // androidx.navigation.CollectionNavType
    public final Object h() {
        return new boolean[0];
    }

    @Override // androidx.navigation.CollectionNavType
    public final List i(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        if (zArr == null) {
            return w.f30218a;
        }
        List o02 = q.o0(zArr);
        ArrayList arrayList = new ArrayList(q.M(o02, 10));
        Iterator it = o02.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
        }
        return arrayList;
    }
}
