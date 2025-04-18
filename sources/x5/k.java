package x5;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.g0;
import com.facebook.internal.d0;
import com.facebook.internal.m;
import com.facebook.k0;
import com.facebook.m0;
import com.facebook.r0;
import com.facebook.x;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.concurrent.RejectedExecutionException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    public static final String f27404e;
    public final Handler a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f27405b;

    /* renamed from: c, reason: collision with root package name */
    public Timer f27406c;

    /* renamed from: d, reason: collision with root package name */
    public String f27407d;

    static {
        String canonicalName = k.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        f27404e = canonicalName;
    }

    public k(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f27405b = new WeakReference(activity);
        this.f27407d = null;
        this.a = new Handler(Looper.getMainLooper());
    }

    public static final /* synthetic */ String a() {
        if (m6.a.b(k.class)) {
            return null;
        }
        try {
            return f27404e;
        } catch (Throwable th2) {
            m6.a.a(k.class, th2);
            return null;
        }
    }

    public final void b(g0 g0Var, String str) {
        String str2 = f27404e;
        if (m6.a.b(this) || g0Var == null) {
            return;
        }
        try {
            k0 c10 = g0Var.c();
            try {
                JSONObject jSONObject = c10.f11167b;
                if (jSONObject != null) {
                    if (Intrinsics.areEqual("true", jSONObject.optString("success"))) {
                        m mVar = d0.f11030d;
                        m.n(m0.APP_EVENTS, str2, "Successfully send UI component tree to server");
                        this.f27407d = str;
                    }
                    if (jSONObject.has("is_app_indexing_enabled")) {
                        boolean z10 = jSONObject.getBoolean("is_app_indexing_enabled");
                        d dVar = d.a;
                        if (!m6.a.b(d.class)) {
                            try {
                                d.f27380g.set(z10);
                                return;
                            } catch (Throwable th2) {
                                m6.a.a(d.class, th2);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                Log.e(str2, Intrinsics.stringPlus("Error sending UI component tree to Facebook: ", c10.f11168c));
            } catch (JSONException e2) {
                Log.e(str2, "Error decoding server response.", e2);
            }
        } catch (Throwable th3) {
            m6.a.a(this, th3);
        }
    }

    public final void c() {
        if (m6.a.b(this)) {
            return;
        }
        try {
            try {
                x.c().execute(new r0(7, this, new j(this)));
            } catch (RejectedExecutionException e2) {
                Log.e(f27404e, "Error scheduling indexing job", e2);
            }
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }
}
