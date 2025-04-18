package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.NavType;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import p0.a;

/* loaded from: classes2.dex */
public final class UNKNOWN extends NavType<String> {

    /* renamed from: q, reason: collision with root package name */
    public static final UNKNOWN f20797q = new NavType(false);

    @Override // androidx.navigation.NavType
    public final Object a(Bundle bundle, String str) {
        a.s(bundle, "bundle");
        a.s(str, SDKConstants.PARAM_KEY);
        return null;
    }

    @Override // androidx.navigation.NavType
    public final String b() {
        return "unknown";
    }

    @Override // androidx.navigation.NavType
    /* renamed from: d */
    public final Object h(String str) {
        return "null";
    }

    @Override // androidx.navigation.NavType
    public final void e(Bundle bundle, String str, Object obj) {
        a.s(str, SDKConstants.PARAM_KEY);
        a.s((String) obj, "value");
    }
}
