package H2;

import G7.j;
import android.util.Log;
import com.facebook.internal.H;
import com.facebook.internal.t;
import com.facebook.internal.w;
import com.facebook.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {
    public static boolean b;

    /* renamed from: a, reason: collision with root package name */
    public static final b f1372a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f1373c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static final CopyOnWriteArraySet f1374d = new CopyOnWriteArraySet();

    public final String a(String str, String str2) {
        if (O2.a.b(this)) {
            return null;
        }
        try {
            try {
                Iterator it = new ArrayList(f1373c).iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    if (aVar != null && j.a(str, aVar.f1371a)) {
                        for (String str3 : aVar.b.keySet()) {
                            if (j.a(str2, str3)) {
                                return (String) aVar.b.get(str3);
                            }
                        }
                    }
                }
            } catch (Exception e4) {
                Log.w("H2.b", "getMatchedRuleType failed", e4);
            }
            return null;
        } catch (Throwable th) {
            O2.a.a(this, th);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, H2.a] */
    public final void b() {
        String str;
        if (O2.a.b(this)) {
            return;
        }
        try {
            w wVar = w.f13674a;
            t f9 = w.f(r.b(), false);
            if (f9 != null && (str = f9.l) != null && str.length() != 0) {
                JSONObject jSONObject = new JSONObject(str);
                ArrayList arrayList = f1373c;
                arrayList.clear();
                CopyOnWriteArraySet copyOnWriteArraySet = f1374d;
                copyOnWriteArraySet.clear();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    if (jSONObject2 != null) {
                        JSONObject optJSONObject = jSONObject2.optJSONObject("restrictive_param");
                        j.d(next, "key");
                        HashMap hashMap = new HashMap();
                        ?? obj = new Object();
                        obj.f1371a = next;
                        obj.b = hashMap;
                        if (optJSONObject != null) {
                            obj.b = H.h(optJSONObject);
                            arrayList.add(obj);
                        }
                        if (jSONObject2.has("process_event_name")) {
                            copyOnWriteArraySet.add(next);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }
}
