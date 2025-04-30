package I2;

import C2.m;
import G7.j;
import android.app.Activity;
import com.facebook.internal.t;
import com.facebook.internal.w;
import com.facebook.r;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1437a = new Object();
    public static final AtomicBoolean b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashSet f1438c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashSet f1439d = new LinkedHashSet();

    public static final synchronized void a() {
        synchronized (d.class) {
            if (O2.a.b(d.class)) {
                return;
            }
            try {
                r.c().execute(new C2.b(8));
            } catch (Throwable th) {
                O2.a.a(d.class, th);
            }
        }
    }

    public static final void d(Activity activity) {
        if (O2.a.b(d.class)) {
            return;
        }
        try {
            j.e(activity, "activity");
            try {
                if (b.get()) {
                    boolean z8 = false;
                    if (!O2.a.b(a.class)) {
                        try {
                            z8 = a.f1432f;
                        } catch (Throwable th) {
                            O2.a.a(a.class, th);
                        }
                    }
                    if (z8) {
                        if (f1438c.isEmpty()) {
                            if (!f1439d.isEmpty()) {
                            }
                        }
                        HashMap hashMap = e.f1440f;
                        m.w(activity);
                        return;
                    }
                }
                HashMap hashMap2 = e.f1440f;
                m.x(activity);
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            O2.a.a(d.class, th2);
        }
    }

    public final void b() {
        String str;
        Activity activity;
        if (O2.a.b(this)) {
            return;
        }
        try {
            w wVar = w.f13674a;
            t f9 = w.f(r.b(), false);
            if (f9 == null || (str = f9.f13667k) == null) {
                return;
            }
            c(str);
            if (!(!f1438c.isEmpty()) && !(!f1439d.isEmpty())) {
                return;
            }
            File d2 = F2.g.d();
            if (d2 == null) {
                return;
            }
            a.f(d2);
            WeakReference weakReference = E2.d.f989k;
            if (weakReference != null) {
                activity = (Activity) weakReference.get();
            } else {
                activity = null;
            }
            if (activity != null) {
                d(activity);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }

    public final void c(String str) {
        JSONArray jSONArray;
        int length;
        JSONArray jSONArray2;
        int length2;
        if (O2.a.b(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i9 = 0;
            if (jSONObject.has("production_events") && (length2 = (jSONArray2 = jSONObject.getJSONArray("production_events")).length()) > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    LinkedHashSet linkedHashSet = f1438c;
                    String string = jSONArray2.getString(i10);
                    j.d(string, "jsonArray.getString(i)");
                    linkedHashSet.add(string);
                    if (i11 >= length2) {
                        break;
                    } else {
                        i10 = i11;
                    }
                }
            }
            if (!jSONObject.has("eligible_for_prediction_events") || (length = (jSONArray = jSONObject.getJSONArray("eligible_for_prediction_events")).length()) <= 0) {
                return;
            }
            while (true) {
                int i12 = i9 + 1;
                LinkedHashSet linkedHashSet2 = f1439d;
                String string2 = jSONArray.getString(i9);
                j.d(string2, "jsonArray.getString(i)");
                linkedHashSet2.add(string2);
                if (i12 < length) {
                    i9 = i12;
                } else {
                    return;
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }
}
