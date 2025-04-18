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
public final class NavType$Companion$IntArrayType$1 extends CollectionNavType<int[]> {
    public static int[] j(String str) {
        return new int[]{((Number) NavType.f20492b.h(str)).intValue()};
    }

    @Override // androidx.navigation.NavType
    public final Object a(Bundle bundle, String str) {
        return (int[]) androidx.compose.foundation.text.input.a.f(bundle, "bundle", str, SDKConstants.PARAM_KEY, str);
    }

    @Override // androidx.navigation.NavType
    public final String b() {
        return "integer[]";
    }

    @Override // androidx.navigation.NavType
    public final Object c(Object obj, String str) {
        int[] iArr = (int[]) obj;
        if (iArr == null) {
            return j(str);
        }
        int[] j2 = j(str);
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, length + 1);
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
        bundle.putIntArray(str, (int[]) obj);
    }

    @Override // androidx.navigation.NavType
    public final boolean g(Object obj, Object obj2) {
        Integer[] numArr;
        int[] iArr = (int[]) obj;
        int[] iArr2 = (int[]) obj2;
        Integer[] numArr2 = null;
        if (iArr != null) {
            numArr = new Integer[iArr.length];
            int length = iArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                numArr[i2] = Integer.valueOf(iArr[i2]);
            }
        } else {
            numArr = null;
        }
        if (iArr2 != null) {
            numArr2 = new Integer[iArr2.length];
            int length2 = iArr2.length;
            for (int i3 = 0; i3 < length2; i3++) {
                numArr2[i3] = Integer.valueOf(iArr2[i3]);
            }
        }
        return f0.g(numArr, numArr2);
    }

    @Override // androidx.navigation.CollectionNavType
    public final Object h() {
        return new int[0];
    }

    @Override // androidx.navigation.CollectionNavType
    public final List i(Object obj) {
        int[] iArr = (int[]) obj;
        if (iArr == null) {
            return w.f30218a;
        }
        List l02 = q.l0(iArr);
        ArrayList arrayList = new ArrayList(q.M(l02, 10));
        Iterator it = l02.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        return arrayList;
    }
}
