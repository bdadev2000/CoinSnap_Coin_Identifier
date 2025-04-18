package qc;

import android.util.Base64;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public abstract class v {
    public static final String a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f23885b;

    static {
        String encodeToString = Base64.encodeToString(StringsKt.encodeToByteArray(w5.d.e()), 10);
        a = com.applovin.impl.mediation.ads.e.f("firebase_session_", encodeToString, "_data");
        f23885b = com.applovin.impl.mediation.ads.e.f("firebase_session_", encodeToString, "_settings");
    }
}
