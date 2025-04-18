package z5;

import com.facebook.appevents.e;
import com.facebook.internal.m0;
import com.facebook.internal.x;
import com.facebook.internal.z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f28521b;
    public static final b a = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f28522c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static final HashSet f28523d = new HashSet();

    public static final void b(List events) {
        if (m6.a.b(b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(events, "events");
            if (!f28521b) {
                return;
            }
            Iterator it = events.iterator();
            while (it.hasNext()) {
                if (f28523d.contains(((e) it.next()).f10935f)) {
                    it.remove();
                }
            }
        } catch (Throwable th2) {
            m6.a.a(b.class, th2);
        }
    }

    public final synchronized void a() {
        boolean z10;
        x f10;
        if (m6.a.b(this)) {
            return;
        }
        try {
            z zVar = z.a;
            z10 = false;
            f10 = z.f(com.facebook.x.b(), false);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return;
        }
        if (f10 == null) {
            return;
        }
        String str = f10.f11132m;
        if (str != null) {
            if (str.length() > 0) {
                z10 = true;
            }
            if (z10) {
                JSONObject jSONObject = new JSONObject(str);
                f28522c.clear();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String key = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                    if (jSONObject2 != null) {
                        if (jSONObject2.optBoolean("is_deprecated_event")) {
                            HashSet hashSet = f28523d;
                            Intrinsics.checkNotNullExpressionValue(key, "key");
                            hashSet.add(key);
                        } else {
                            JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                            Intrinsics.checkNotNullExpressionValue(key, "key");
                            a aVar = new a(key, new ArrayList());
                            if (optJSONArray != null) {
                                ArrayList f11 = m0.f(optJSONArray);
                                Intrinsics.checkNotNullParameter(f11, "<set-?>");
                                aVar.f28520b = f11;
                            }
                            f28522c.add(aVar);
                        }
                    }
                }
            }
        }
    }
}
