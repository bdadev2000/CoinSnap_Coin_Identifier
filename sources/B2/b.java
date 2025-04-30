package B2;

import G7.j;
import com.facebook.appevents.e;
import com.facebook.internal.H;
import com.facebook.internal.t;
import com.facebook.internal.w;
import com.facebook.r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {
    public static boolean b;

    /* renamed from: a, reason: collision with root package name */
    public static final b f275a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f276c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static final HashSet f277d = new HashSet();

    public static final void b(List list) {
        if (O2.a.b(b.class)) {
            return;
        }
        try {
            j.e(list, "events");
            if (!b) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (f277d.contains(((e) it.next()).f13480f)) {
                    it.remove();
                }
            }
        } catch (Throwable th) {
            O2.a.a(b.class, th);
        }
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, B2.a] */
    public final synchronized void a() {
        t f9;
        if (O2.a.b(this)) {
            return;
        }
        try {
            w wVar = w.f13674a;
            f9 = w.f(r.b(), false);
        } catch (Exception unused) {
        } catch (Throwable th) {
            O2.a.a(this, th);
            return;
        }
        if (f9 == null) {
            return;
        }
        String str = f9.l;
        if (str != null && str.length() > 0) {
            JSONObject jSONObject = new JSONObject(str);
            f276c.clear();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (jSONObject2 != null) {
                    if (jSONObject2.optBoolean("is_deprecated_event")) {
                        HashSet hashSet = f277d;
                        j.d(next, "key");
                        hashSet.add(next);
                    } else {
                        JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                        j.d(next, "key");
                        ArrayList arrayList = new ArrayList();
                        ?? obj = new Object();
                        obj.f274a = next;
                        obj.b = arrayList;
                        if (optJSONArray != null) {
                            obj.b = H.f(optJSONArray);
                        }
                        f276c.add(obj);
                    }
                }
            }
        }
    }
}
