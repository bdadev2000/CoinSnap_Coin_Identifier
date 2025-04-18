package androidx.navigation;

import android.os.Bundle;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import z0.m;

/* loaded from: classes.dex */
public final class NavType$Companion$ReferenceType$1 extends NavType<Integer> {
    @Override // androidx.navigation.NavType
    public final Object a(Bundle bundle, String str) {
        Object f2 = androidx.compose.foundation.text.input.a.f(bundle, "bundle", str, SDKConstants.PARAM_KEY, str);
        p0.a.q(f2, "null cannot be cast to non-null type kotlin.Int");
        return (Integer) f2;
    }

    @Override // androidx.navigation.NavType
    public final String b() {
        return "reference";
    }

    @Override // androidx.navigation.NavType
    /* renamed from: d */
    public final Object h(String str) {
        int parseInt;
        if (m.q1(str, "0x", false)) {
            String substring = str.substring(2);
            p0.a.r(substring, "substring(...)");
            p0.a.u(16);
            parseInt = Integer.parseInt(substring, 16);
        } else {
            parseInt = Integer.parseInt(str);
        }
        return Integer.valueOf(parseInt);
    }

    @Override // androidx.navigation.NavType
    public final void e(Bundle bundle, String str, Object obj) {
        int intValue = ((Number) obj).intValue();
        p0.a.s(str, SDKConstants.PARAM_KEY);
        bundle.putInt(str, intValue);
    }
}
