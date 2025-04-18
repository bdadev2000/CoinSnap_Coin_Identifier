package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.compose.foundation.text.input.a;
import androidx.navigation.NavType;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;

/* loaded from: classes.dex */
public final class InternalNavType$BoolNullableType$1 extends NavType<Boolean> {
    @Override // androidx.navigation.NavType
    public final Object a(Bundle bundle, String str) {
        Object f2 = a.f(bundle, "bundle", str, SDKConstants.PARAM_KEY, str);
        if (f2 instanceof Boolean) {
            return (Boolean) f2;
        }
        return null;
    }

    @Override // androidx.navigation.NavType
    public final String b() {
        return "boolean_nullable";
    }

    @Override // androidx.navigation.NavType
    /* renamed from: d */
    public final Object h(String str) {
        if (p0.a.g(str, "null")) {
            return null;
        }
        return (Boolean) NavType.f20499k.h(str);
    }

    @Override // androidx.navigation.NavType
    public final void e(Bundle bundle, String str, Object obj) {
        Boolean bool = (Boolean) obj;
        p0.a.s(str, SDKConstants.PARAM_KEY);
        if (bool == null) {
            bundle.putSerializable(str, null);
        } else {
            NavType.f20499k.e(bundle, str, bool);
        }
    }
}
