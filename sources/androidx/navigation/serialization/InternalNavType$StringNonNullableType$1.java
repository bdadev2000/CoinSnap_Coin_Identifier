package androidx.navigation.serialization;

import android.net.Uri;
import android.os.Bundle;
import androidx.navigation.NavType;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import p0.a;

/* loaded from: classes.dex */
public final class InternalNavType$StringNonNullableType$1 extends NavType<String> {
    @Override // androidx.navigation.NavType
    public final Object a(Bundle bundle, String str) {
        a.s(bundle, "bundle");
        a.s(str, SDKConstants.PARAM_KEY);
        String string = bundle.getString(str);
        return string == null ? "null" : string;
    }

    @Override // androidx.navigation.NavType
    public final String b() {
        return "string_non_nullable";
    }

    @Override // androidx.navigation.NavType
    /* renamed from: d */
    public final Object h(String str) {
        return str;
    }

    @Override // androidx.navigation.NavType
    public final void e(Bundle bundle, String str, Object obj) {
        String str2 = (String) obj;
        a.s(str, SDKConstants.PARAM_KEY);
        a.s(str2, "value");
        bundle.putString(str, str2);
    }

    @Override // androidx.navigation.NavType
    public final String f(Object obj) {
        String str = (String) obj;
        a.s(str, "value");
        String encode = Uri.encode(str);
        a.r(encode, "encode(value)");
        return encode;
    }
}
