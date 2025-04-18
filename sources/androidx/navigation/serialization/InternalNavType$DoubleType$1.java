package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.compose.foundation.text.input.a;
import androidx.navigation.NavType;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;

/* loaded from: classes.dex */
public final class InternalNavType$DoubleType$1 extends NavType<Double> {
    @Override // androidx.navigation.NavType
    public final Object a(Bundle bundle, String str) {
        Object f2 = a.f(bundle, "bundle", str, SDKConstants.PARAM_KEY, str);
        p0.a.q(f2, "null cannot be cast to non-null type kotlin.Double");
        return (Double) f2;
    }

    @Override // androidx.navigation.NavType
    public final String b() {
        return "double";
    }

    @Override // androidx.navigation.NavType
    /* renamed from: d */
    public final Object h(String str) {
        return Double.valueOf(Double.parseDouble(str));
    }

    @Override // androidx.navigation.NavType
    public final void e(Bundle bundle, String str, Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        p0.a.s(str, SDKConstants.PARAM_KEY);
        bundle.putDouble(str, doubleValue);
    }
}
