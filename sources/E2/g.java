package E2;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.facebook.N;
import com.facebook.appevents.t;
import com.facebook.internal.C1834c;
import com.facebook.internal.H;
import com.facebook.internal.p;
import com.facebook.internal.r;
import com.facebook.internal.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;
import t7.C2720i;
import u7.AbstractC2829t;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f992a = AbstractC2829t.X(new C2720i(f.b, "MOBILE_APP_INSTALL"), new C2720i(f.f990c, "CUSTOM_APP_EVENTS"));

    public static final JSONObject a(f fVar, C1834c c1834c, String str, boolean z8, Context context) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(NotificationCompat.CATEGORY_EVENT, f992a.get(fVar));
        ReentrantReadWriteLock reentrantReadWriteLock = com.facebook.appevents.c.f13472a;
        if (!com.facebook.appevents.c.f13473c) {
            Log.w(com.mbridge.msdk.foundation.controller.a.f15376a, "initStore should have been called before calling setUserID");
            com.facebook.appevents.c.a();
        }
        ReentrantReadWriteLock reentrantReadWriteLock2 = com.facebook.appevents.c.f13472a;
        reentrantReadWriteLock2.readLock().lock();
        try {
            String str2 = com.facebook.appevents.c.b;
            reentrantReadWriteLock2.readLock().unlock();
            if (str2 != null) {
                jSONObject.put("app_user_id", str2);
            }
            r rVar = r.f13653a;
            p pVar = p.ServiceUpdateCompliance;
            if (!r.b(pVar)) {
                jSONObject.put("anon_id", str);
            }
            jSONObject.put("application_tracking_enabled", !z8);
            com.facebook.r rVar2 = com.facebook.r.f13801a;
            jSONObject.put("advertiser_id_collection_enabled", N.a());
            if (c1834c != null) {
                if (r.b(pVar)) {
                    if (Build.VERSION.SDK_INT >= 31 && H.A(context)) {
                        if (!c1834c.f13609e) {
                            jSONObject.put("anon_id", str);
                        }
                    } else {
                        jSONObject.put("anon_id", str);
                    }
                }
                if (c1834c.f13607c != null) {
                    if (r.b(pVar)) {
                        if (Build.VERSION.SDK_INT >= 31 && H.A(context)) {
                            if (!c1834c.f13609e) {
                                jSONObject.put("attribution", c1834c.f13607c);
                            }
                        } else {
                            jSONObject.put("attribution", c1834c.f13607c);
                        }
                    } else {
                        jSONObject.put("attribution", c1834c.f13607c);
                    }
                }
                if (c1834c.a() != null) {
                    jSONObject.put("advertiser_id", c1834c.a());
                    jSONObject.put("advertiser_tracking_enabled", !c1834c.f13609e);
                }
                if (!c1834c.f13609e) {
                    t tVar = t.f13517a;
                    String str3 = null;
                    if (!O2.a.b(t.class)) {
                        try {
                            boolean z9 = t.f13518c.get();
                            t tVar2 = t.f13517a;
                            if (!z9) {
                                tVar2.b();
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.putAll(t.f13519d);
                            hashMap.putAll(tVar2.a());
                            str3 = H.F(hashMap);
                        } catch (Throwable th) {
                            O2.a.a(t.class, th);
                        }
                    }
                    if (str3.length() != 0) {
                        jSONObject.put("ud", str3);
                    }
                }
                String str4 = c1834c.f13608d;
                if (str4 != null) {
                    jSONObject.put("installer_package", str4);
                }
            }
            try {
                H.L(jSONObject, context);
            } catch (Exception e4) {
                L4.f fVar2 = z.f13680c;
                com.facebook.H h6 = com.facebook.H.f13413f;
                e4.toString();
                com.facebook.r.h(h6);
            }
            JSONObject n2 = H.n();
            if (n2 != null) {
                Iterator<String> keys = n2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, n2.get(next));
                }
            }
            jSONObject.put("application_package_name", context.getPackageName());
            return jSONObject;
        } catch (Throwable th2) {
            com.facebook.appevents.c.f13472a.readLock().unlock();
            throw th2;
        }
    }
}
