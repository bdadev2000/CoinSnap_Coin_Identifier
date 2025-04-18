package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.compose.foundation.text.input.a;
import androidx.navigation.CollectionNavType;
import b1.f0;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import e0.q;
import e0.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class InternalNavType$DoubleArrayType$1 extends CollectionNavType<double[]> {
    public static double[] j(String str) {
        InternalNavType.f20754c.getClass();
        return new double[]{Double.valueOf(Double.parseDouble(str)).doubleValue()};
    }

    @Override // androidx.navigation.NavType
    public final Object a(Bundle bundle, String str) {
        return (double[]) a.f(bundle, "bundle", str, SDKConstants.PARAM_KEY, str);
    }

    @Override // androidx.navigation.NavType
    public final String b() {
        return "double[]";
    }

    @Override // androidx.navigation.NavType
    public final Object c(Object obj, String str) {
        double[] dArr = (double[]) obj;
        if (dArr == null) {
            return j(str);
        }
        double[] j2 = j(str);
        int length = dArr.length;
        double[] copyOf = Arrays.copyOf(dArr, length + 1);
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
        bundle.putDoubleArray(str, (double[]) obj);
    }

    @Override // androidx.navigation.NavType
    public final boolean g(Object obj, Object obj2) {
        Double[] dArr;
        double[] dArr2 = (double[]) obj;
        double[] dArr3 = (double[]) obj2;
        Double[] dArr4 = null;
        if (dArr2 != null) {
            dArr = new Double[dArr2.length];
            int length = dArr2.length;
            for (int i2 = 0; i2 < length; i2++) {
                dArr[i2] = Double.valueOf(dArr2[i2]);
            }
        } else {
            dArr = null;
        }
        if (dArr3 != null) {
            dArr4 = new Double[dArr3.length];
            int length2 = dArr3.length;
            for (int i3 = 0; i3 < length2; i3++) {
                dArr4[i3] = Double.valueOf(dArr3[i3]);
            }
        }
        return f0.g(dArr, dArr4);
    }

    @Override // androidx.navigation.CollectionNavType
    public final Object h() {
        return new double[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, e0.w] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    @Override // androidx.navigation.CollectionNavType
    public final List i(Object obj) {
        double[] dArr = (double[]) obj;
        ?? r02 = w.f30218a;
        if (dArr == null) {
            return r02;
        }
        int length = dArr.length;
        if (length != 0) {
            if (length != 1) {
                r02 = new ArrayList(dArr.length);
                for (double d : dArr) {
                    r02.add(Double.valueOf(d));
                }
            } else {
                r02 = f0.u(Double.valueOf(dArr[0]));
            }
        }
        Iterable iterable = (Iterable) r02;
        ArrayList arrayList = new ArrayList(q.M(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).doubleValue()));
        }
        return arrayList;
    }
}
