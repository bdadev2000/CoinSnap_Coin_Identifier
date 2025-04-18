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
public final class NavType$Companion$FloatArrayType$1 extends CollectionNavType<float[]> {
    public static float[] j(String str) {
        return new float[]{Float.valueOf(Float.parseFloat(str)).floatValue()};
    }

    @Override // androidx.navigation.NavType
    public final Object a(Bundle bundle, String str) {
        return (float[]) androidx.compose.foundation.text.input.a.f(bundle, "bundle", str, SDKConstants.PARAM_KEY, str);
    }

    @Override // androidx.navigation.NavType
    public final String b() {
        return "float[]";
    }

    @Override // androidx.navigation.NavType
    public final Object c(Object obj, String str) {
        float[] fArr = (float[]) obj;
        if (fArr == null) {
            return j(str);
        }
        float[] j2 = j(str);
        int length = fArr.length;
        float[] copyOf = Arrays.copyOf(fArr, length + 1);
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
        bundle.putFloatArray(str, (float[]) obj);
    }

    @Override // androidx.navigation.NavType
    public final boolean g(Object obj, Object obj2) {
        Float[] fArr;
        float[] fArr2 = (float[]) obj;
        float[] fArr3 = (float[]) obj2;
        Float[] fArr4 = null;
        if (fArr2 != null) {
            fArr = new Float[fArr2.length];
            int length = fArr2.length;
            for (int i2 = 0; i2 < length; i2++) {
                fArr[i2] = Float.valueOf(fArr2[i2]);
            }
        } else {
            fArr = null;
        }
        if (fArr3 != null) {
            fArr4 = new Float[fArr3.length];
            int length2 = fArr3.length;
            for (int i3 = 0; i3 < length2; i3++) {
                fArr4[i3] = Float.valueOf(fArr3[i3]);
            }
        }
        return f0.g(fArr, fArr4);
    }

    @Override // androidx.navigation.CollectionNavType
    public final Object h() {
        return new float[0];
    }

    @Override // androidx.navigation.CollectionNavType
    public final List i(Object obj) {
        float[] fArr = (float[]) obj;
        if (fArr == null) {
            return w.f30218a;
        }
        List k02 = q.k0(fArr);
        ArrayList arrayList = new ArrayList(q.M(k02, 10));
        Iterator it = k02.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).floatValue()));
        }
        return arrayList;
    }
}
