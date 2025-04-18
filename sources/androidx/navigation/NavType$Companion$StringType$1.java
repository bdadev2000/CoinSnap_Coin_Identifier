package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;

/* loaded from: classes.dex */
public final class NavType$Companion$StringType$1 extends NavType<String> {
    @Override // androidx.navigation.NavType
    public final Object a(Bundle bundle, String str) {
        return (String) androidx.compose.foundation.text.input.a.f(bundle, "bundle", str, SDKConstants.PARAM_KEY, str);
    }

    @Override // androidx.navigation.NavType
    public final String b() {
        return "string";
    }

    @Override // androidx.navigation.NavType
    /* renamed from: d */
    public final Object h(String str) {
        if (p0.a.g(str, "null")) {
            return null;
        }
        return str;
    }

    @Override // androidx.navigation.NavType
    public final void e(Bundle bundle, String str, Object obj) {
        p0.a.s(str, SDKConstants.PARAM_KEY);
        bundle.putString(str, (String) obj);
    }

    @Override // androidx.navigation.NavType
    public final String f(Object obj) {
        String str = (String) obj;
        String encode = str != null ? Uri.encode(str) : null;
        return encode == null ? "null" : encode;
    }
}
