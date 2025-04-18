package v5;

import com.facebook.internal.z;
import com.facebook.x;
import e4.m;
import g4.g0;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a implements q4.a {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f26028c;

    /* renamed from: b, reason: collision with root package name */
    public static final a f26027b = new a();

    /* renamed from: d, reason: collision with root package name */
    public static final a f26029d = new a();

    public static final void a() {
        x.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
    }

    public void b() {
        String rulesFromServer;
        if (m6.a.b(this)) {
            return;
        }
        try {
            z zVar = z.a;
            com.facebook.internal.x f10 = z.f(x.b(), false);
            if (f10 == null || (rulesFromServer = f10.f11130k) == null) {
                return;
            }
            CopyOnWriteArraySet copyOnWriteArraySet = c.f26033d;
            Intrinsics.checkNotNullParameter(rulesFromServer, "rulesFromServer");
            try {
                c.a().clear();
                com.facebook.c.g(new JSONObject(rulesFromServer));
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }

    @Override // q4.a
    public g0 i(g0 g0Var, m mVar) {
        return g0Var;
    }
}
