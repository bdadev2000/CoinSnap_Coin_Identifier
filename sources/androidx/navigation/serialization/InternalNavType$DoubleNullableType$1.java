package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.compose.foundation.text.input.a;
import androidx.navigation.NavType;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;

/* loaded from: classes.dex */
public final class InternalNavType$DoubleNullableType$1 extends NavType<Double> {
    @Override // androidx.navigation.NavType
    public final Object a(Bundle bundle, String str) {
        Object f2 = a.f(bundle, "bundle", str, SDKConstants.PARAM_KEY, str);
        if (f2 instanceof Double) {
            return (Double) f2;
        }
        return null;
    }

    @Override // androidx.navigation.NavType
    public final String b() {
        return "double_nullable";
    }

    @Override // androidx.navigation.NavType
    /* renamed from: d */
    public final Object h(String str) {
        if (p0.a.g(str, "null")) {
            return null;
        }
        InternalNavType.f20754c.getClass();
        return Double.valueOf(Double.parseDouble(str));
    }

    @Override // androidx.navigation.NavType
    public final void e(Bundle bundle, String str, Object obj) {
        Double d = (Double) obj;
        p0.a.s(str, SDKConstants.PARAM_KEY);
        if (d == null) {
            bundle.putSerializable(str, null);
        } else {
            InternalNavType.f20754c.e(bundle, str, d);
        }
    }
}
