package androidx.navigation;

import android.os.Bundle;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;

/* loaded from: classes.dex */
public final class NavType$Companion$FloatType$1 extends NavType<Float> {
    @Override // androidx.navigation.NavType
    public final Object a(Bundle bundle, String str) {
        Object f2 = androidx.compose.foundation.text.input.a.f(bundle, "bundle", str, SDKConstants.PARAM_KEY, str);
        p0.a.q(f2, "null cannot be cast to non-null type kotlin.Float");
        return (Float) f2;
    }

    @Override // androidx.navigation.NavType
    public final String b() {
        return "float";
    }

    @Override // androidx.navigation.NavType
    /* renamed from: d */
    public final Object h(String str) {
        return Float.valueOf(Float.parseFloat(str));
    }

    @Override // androidx.navigation.NavType
    public final void e(Bundle bundle, String str, Object obj) {
        float floatValue = ((Number) obj).floatValue();
        p0.a.s(str, SDKConstants.PARAM_KEY);
        bundle.putFloat(str, floatValue);
    }
}
