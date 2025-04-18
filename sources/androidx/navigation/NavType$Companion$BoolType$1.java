package androidx.navigation;

import android.os.Bundle;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.ServerProtocol;

/* loaded from: classes.dex */
public final class NavType$Companion$BoolType$1 extends NavType<Boolean> {
    @Override // androidx.navigation.NavType
    public final Object a(Bundle bundle, String str) {
        return (Boolean) androidx.compose.foundation.text.input.a.f(bundle, "bundle", str, SDKConstants.PARAM_KEY, str);
    }

    @Override // androidx.navigation.NavType
    public final String b() {
        return "boolean";
    }

    @Override // androidx.navigation.NavType
    /* renamed from: d */
    public final Object h(String str) {
        boolean z2;
        if (p0.a.g(str, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
            z2 = true;
        } else {
            if (!p0.a.g(str, "false")) {
                throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
            }
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    @Override // androidx.navigation.NavType
    public final void e(Bundle bundle, String str, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        p0.a.s(str, SDKConstants.PARAM_KEY);
        bundle.putBoolean(str, booleanValue);
    }
}
