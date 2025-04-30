package V5;

import C2.m;
import R5.f;
import a.AbstractC0325a;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b implements S5.a {

    /* renamed from: g, reason: collision with root package name */
    public static final b f3483g = new b();

    /* renamed from: h, reason: collision with root package name */
    public static final Handler f3484h = new Handler(Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public static Handler f3485i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final a f3486j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f3487k = new a(1);

    /* renamed from: f, reason: collision with root package name */
    public long f3492f;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3488a = new ArrayList();
    public final ArrayList b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final d f3490d = new d();

    /* renamed from: c, reason: collision with root package name */
    public final a7.b f3489c = new a7.b(11);

    /* renamed from: e, reason: collision with root package name */
    public final a7.b f3491e = new a7.b(new C.c((byte) 0, 11), 13);

    public static void b() {
        if (f3485i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f3485i = handler;
            handler.post(f3486j);
            f3485i.postDelayed(f3487k, 200L);
        }
    }

    public final void a(View view, S5.b bVar, JSONObject jSONObject, boolean z8) {
        char c9;
        Object obj;
        boolean z9;
        boolean z10;
        boolean z11;
        if (AbstractC0325a.a(view) == null) {
            d dVar = this.f3490d;
            if (dVar.f3496d.contains(view)) {
                c9 = 1;
            } else if (dVar.f3502j) {
                c9 = 2;
            } else {
                c9 = 3;
            }
            if (c9 == 3) {
                return;
            }
            JSONObject a6 = bVar.a(view);
            U5.b.c(jSONObject, a6);
            HashMap hashMap = dVar.f3494a;
            if (hashMap.size() == 0) {
                obj = null;
            } else {
                Object obj2 = (String) hashMap.get(view);
                if (obj2 != null) {
                    hashMap.remove(view);
                }
                obj = obj2;
            }
            boolean z12 = false;
            if (obj != null) {
                try {
                    a6.put("adSessionId", obj);
                } catch (JSONException e4) {
                    m.c("Error with setting ad session id", e4);
                }
                WeakHashMap weakHashMap = dVar.f3501i;
                if (weakHashMap.containsKey(view)) {
                    weakHashMap.put(view, Boolean.TRUE);
                } else {
                    z12 = true;
                }
                try {
                    a6.put("hasWindowFocus", Boolean.valueOf(z12));
                } catch (JSONException e9) {
                    m.c("Error with setting has window focus", e9);
                }
                boolean contains = dVar.f3500h.contains(obj);
                Object valueOf = Boolean.valueOf(contains);
                if (contains) {
                    try {
                        a6.put("isPipActive", valueOf);
                    } catch (JSONException e10) {
                        m.c("Error with setting is picture-in-picture active", e10);
                    }
                }
                dVar.f3502j = true;
                return;
            }
            HashMap hashMap2 = dVar.b;
            c cVar = (c) hashMap2.get(view);
            if (cVar != null) {
                hashMap2.remove(view);
            }
            if (cVar != null) {
                f fVar = cVar.f3493a;
                JSONArray jSONArray = new JSONArray();
                Iterator it = cVar.b.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                try {
                    a6.put("isFriendlyObstructionFor", jSONArray);
                    a6.put("friendlyObstructionClass", fVar.b);
                    a6.put("friendlyObstructionPurpose", fVar.f2747c);
                    a6.put("friendlyObstructionReason", fVar.f2748d);
                } catch (JSONException e11) {
                    m.c("Error with setting friendly obstruction", e11);
                }
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z8 && !z9) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (c9 == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            bVar.d(view, a6, this, z11, z10);
        }
    }
}
