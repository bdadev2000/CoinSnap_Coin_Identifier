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
public final class NavType$Companion$LongArrayType$1 extends CollectionNavType<long[]> {
    public static long[] j(String str) {
        return new long[]{((Number) NavType.e.h(str)).longValue()};
    }

    @Override // androidx.navigation.NavType
    public final Object a(Bundle bundle, String str) {
        return (long[]) androidx.compose.foundation.text.input.a.f(bundle, "bundle", str, SDKConstants.PARAM_KEY, str);
    }

    @Override // androidx.navigation.NavType
    public final String b() {
        return "long[]";
    }

    @Override // androidx.navigation.NavType
    public final Object c(Object obj, String str) {
        long[] jArr = (long[]) obj;
        if (jArr == null) {
            return j(str);
        }
        long[] j2 = j(str);
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, length + 1);
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
        bundle.putLongArray(str, (long[]) obj);
    }

    @Override // androidx.navigation.NavType
    public final boolean g(Object obj, Object obj2) {
        Long[] lArr;
        long[] jArr = (long[]) obj;
        long[] jArr2 = (long[]) obj2;
        Long[] lArr2 = null;
        if (jArr != null) {
            lArr = new Long[jArr.length];
            int length = jArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                lArr[i2] = Long.valueOf(jArr[i2]);
            }
        } else {
            lArr = null;
        }
        if (jArr2 != null) {
            lArr2 = new Long[jArr2.length];
            int length2 = jArr2.length;
            for (int i3 = 0; i3 < length2; i3++) {
                lArr2[i3] = Long.valueOf(jArr2[i3]);
            }
        }
        return f0.g(lArr, lArr2);
    }

    @Override // androidx.navigation.CollectionNavType
    public final Object h() {
        return new long[0];
    }

    @Override // androidx.navigation.CollectionNavType
    public final List i(Object obj) {
        long[] jArr = (long[]) obj;
        if (jArr == null) {
            return w.f30218a;
        }
        List m02 = q.m0(jArr);
        ArrayList arrayList = new ArrayList(q.M(m02, 10));
        Iterator it = m02.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        return arrayList;
    }
}
