package z2;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.C;
import com.facebook.F;
import com.facebook.H;
import com.facebook.internal.z;
import com.facebook.r;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    public static final String f24530e;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f24531a;
    public final WeakReference b;

    /* renamed from: c, reason: collision with root package name */
    public Timer f24532c;

    /* renamed from: d, reason: collision with root package name */
    public String f24533d;

    static {
        String canonicalName = k.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        f24530e = canonicalName;
    }

    public k(Activity activity) {
        G7.j.e(activity, "activity");
        this.b = new WeakReference(activity);
        this.f24533d = null;
        this.f24531a = new Handler(Looper.getMainLooper());
    }

    public static final /* synthetic */ String a() {
        if (O2.a.b(k.class)) {
            return null;
        }
        try {
            return f24530e;
        } catch (Throwable th) {
            O2.a.a(k.class, th);
            return null;
        }
    }

    public final void b(C c9, String str) {
        String str2 = f24530e;
        if (O2.a.b(this) || c9 == null) {
            return;
        }
        try {
            F c10 = c9.c();
            try {
                JSONObject jSONObject = c10.b;
                if (jSONObject != null) {
                    if ("true".equals(jSONObject.optString("success"))) {
                        L4.f fVar = z.f13680c;
                        L4.f.l(H.f13413f, str2, "Successfully send UI component tree to server");
                        this.f24533d = str;
                    }
                    if (jSONObject.has("is_app_indexing_enabled")) {
                        boolean z8 = jSONObject.getBoolean("is_app_indexing_enabled");
                        d dVar = d.f24508a;
                        if (!O2.a.b(d.class)) {
                            try {
                                d.f24513g.set(z8);
                                return;
                            } catch (Throwable th) {
                                O2.a.a(d.class, th);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                Log.e(str2, G7.j.j(c10.f13407c, "Error sending UI component tree to Facebook: "));
            } catch (JSONException e4) {
                Log.e(str2, "Error decoding server response.", e4);
            }
        } catch (Throwable th2) {
            O2.a.a(this, th2);
        }
    }

    public final void c() {
        if (O2.a.b(this)) {
            return;
        }
        try {
            try {
                r.c().execute(new com.facebook.appevents.k(25, this, new j(this)));
            } catch (RejectedExecutionException e4) {
                Log.e(f24530e, "Error scheduling indexing job", e4);
            }
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }
}
