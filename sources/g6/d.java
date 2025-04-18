package g6;

import android.app.Activity;
import com.applovin.impl.sdk.g0;
import com.facebook.internal.z;
import com.facebook.x;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class d {
    public static final d a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f18215b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashSet f18216c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashSet f18217d = new LinkedHashSet();

    public static final synchronized void a() {
        synchronized (d.class) {
            if (m6.a.b(d.class)) {
                return;
            }
            try {
                x.c().execute(new g0(14));
            } catch (Throwable th2) {
                m6.a.a(d.class, th2);
            }
        }
    }

    public static final void d(Activity activity) {
        boolean z10;
        if (m6.a.b(d.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                if (f18215b.get()) {
                    if (!m6.a.b(a.class)) {
                        try {
                            z10 = a.f18207h;
                        } catch (Throwable th2) {
                            m6.a.a(a.class, th2);
                        }
                        if (z10 && (!f18216c.isEmpty() || !f18217d.isEmpty())) {
                            e.f18218f.L(activity);
                            return;
                        }
                    }
                    z10 = false;
                    if (z10) {
                        e.f18218f.L(activity);
                        return;
                    }
                }
                com.facebook.b bVar = e.f18218f;
                com.facebook.b.M(activity);
            } catch (Exception unused) {
            }
        } catch (Throwable th3) {
            m6.a.a(d.class, th3);
        }
    }

    public final void b() {
        String str;
        File d10;
        Activity activity;
        if (m6.a.b(this)) {
            return;
        }
        try {
            z zVar = z.a;
            com.facebook.internal.x f10 = z.f(x.b(), false);
            if (f10 == null || (str = f10.f11131l) == null) {
                return;
            }
            c(str);
            if ((!(!f18216c.isEmpty()) && !(!f18217d.isEmpty())) || (d10 = d6.f.d()) == null) {
                return;
            }
            a.e(d10);
            WeakReference weakReference = c6.b.f2626k;
            if (weakReference != null) {
                activity = (Activity) weakReference.get();
            } else {
                activity = null;
            }
            if (activity != null) {
                d(activity);
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }

    public final void c(String str) {
        JSONArray jSONArray;
        int length;
        JSONArray jSONArray2;
        int length2;
        if (m6.a.b(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i10 = 0;
            if (jSONObject.has("production_events") && (length2 = (jSONArray2 = jSONObject.getJSONArray("production_events")).length()) > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    LinkedHashSet linkedHashSet = f18216c;
                    String string = jSONArray2.getString(i11);
                    Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                    linkedHashSet.add(string);
                    if (i12 >= length2) {
                        break;
                    } else {
                        i11 = i12;
                    }
                }
            }
            if (!jSONObject.has("eligible_for_prediction_events") || (length = (jSONArray = jSONObject.getJSONArray("eligible_for_prediction_events")).length()) <= 0) {
                return;
            }
            while (true) {
                int i13 = i10 + 1;
                LinkedHashSet linkedHashSet2 = f18217d;
                String string2 = jSONArray.getString(i10);
                Intrinsics.checkNotNullExpressionValue(string2, "jsonArray.getString(i)");
                linkedHashSet2.add(string2);
                if (i13 < length) {
                    i10 = i13;
                } else {
                    return;
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }
}
