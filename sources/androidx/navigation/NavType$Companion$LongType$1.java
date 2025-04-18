package androidx.navigation;

import android.os.Bundle;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import z0.m;

/* loaded from: classes.dex */
public final class NavType$Companion$LongType$1 extends NavType<Long> {
    @Override // androidx.navigation.NavType
    public final Object a(Bundle bundle, String str) {
        Object f2 = androidx.compose.foundation.text.input.a.f(bundle, "bundle", str, SDKConstants.PARAM_KEY, str);
        p0.a.q(f2, "null cannot be cast to non-null type kotlin.Long");
        return (Long) f2;
    }

    @Override // androidx.navigation.NavType
    public final String b() {
        return "long";
    }

    @Override // androidx.navigation.NavType
    /* renamed from: d */
    public final Object h(String str) {
        String str2;
        long parseLong;
        if (m.P0(str, "L", false)) {
            str2 = str.substring(0, str.length() - 1);
            p0.a.r(str2, "substring(...)");
        } else {
            str2 = str;
        }
        if (m.q1(str, "0x", false)) {
            String substring = str2.substring(2);
            p0.a.r(substring, "substring(...)");
            p0.a.u(16);
            parseLong = Long.parseLong(substring, 16);
        } else {
            parseLong = Long.parseLong(str2);
        }
        return Long.valueOf(parseLong);
    }

    @Override // androidx.navigation.NavType
    public final void e(Bundle bundle, String str, Object obj) {
        long longValue = ((Number) obj).longValue();
        p0.a.s(str, SDKConstants.PARAM_KEY);
        bundle.putLong(str, longValue);
    }
}
