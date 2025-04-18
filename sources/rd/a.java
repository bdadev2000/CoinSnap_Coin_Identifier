package rd;

import a6.k;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.WindowManager;
import androidx.emoji2.text.q;
import com.bumptech.glide.e;
import ic.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import nd.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a implements od.a {

    /* renamed from: g, reason: collision with root package name */
    public static final a f24088g = new a();

    /* renamed from: h, reason: collision with root package name */
    public static final Handler f24089h = new Handler(Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public static Handler f24090i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final q f24091j = new q(1);

    /* renamed from: k, reason: collision with root package name */
    public static final q f24092k = new q(2);

    /* renamed from: f, reason: collision with root package name */
    public long f24097f;
    public final ArrayList a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f24093b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final c f24095d = new c();

    /* renamed from: c, reason: collision with root package name */
    public final qa.a f24094c = new qa.a(15);

    /* renamed from: e, reason: collision with root package name */
    public final qa.a f24096e = new qa.a(new t(10), 16);

    public static void c() {
        if (f24090i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f24090i = handler;
            handler.post(f24091j);
            f24090i.postDelayed(f24092k, 200L);
        }
    }

    public final void a(View view, od.b bVar, JSONObject jSONObject, boolean z10) {
        boolean z11;
        int i10;
        Object obj;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        if (e.b(view) == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return;
        }
        c cVar = this.f24095d;
        if (cVar.f24101d.contains(view)) {
            i10 = 1;
        } else if (cVar.f24107j) {
            i10 = 2;
        } else {
            i10 = 3;
        }
        if (i10 == 3) {
            return;
        }
        JSONObject a = bVar.a(view);
        WindowManager windowManager = qd.c.a;
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(a);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        HashMap hashMap = cVar.a;
        if (hashMap.size() == 0) {
            obj = null;
        } else {
            Object obj2 = (String) hashMap.get(view);
            if (obj2 != null) {
                hashMap.remove(view);
            }
            obj = obj2;
        }
        if (obj != null) {
            try {
                a.put("adSessionId", obj);
            } catch (JSONException e10) {
                k.b("Error with setting ad session id", e10);
            }
            WeakHashMap weakHashMap = cVar.f24106i;
            if (weakHashMap.containsKey(view)) {
                weakHashMap.put(view, Boolean.TRUE);
                z12 = false;
            } else {
                z12 = true;
            }
            try {
                a.put("hasWindowFocus", Boolean.valueOf(z12));
            } catch (JSONException e11) {
                k.b("Error with setting has window focus", e11);
            }
            Boolean valueOf = Boolean.valueOf(cVar.f24105h.contains(obj));
            if (valueOf.booleanValue()) {
                try {
                    a.put("isPipActive", valueOf);
                } catch (JSONException e12) {
                    k.b("Error with setting is picture-in-picture active", e12);
                }
            }
            cVar.f24107j = true;
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13) {
            HashMap hashMap2 = cVar.f24099b;
            b bVar2 = (b) hashMap2.get(view);
            if (bVar2 != null) {
                hashMap2.remove(view);
            }
            if (bVar2 != null) {
                WindowManager windowManager2 = qd.c.a;
                f fVar = bVar2.a;
                JSONArray jSONArray = new JSONArray();
                Iterator it = bVar2.f24098b.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                try {
                    a.put("isFriendlyObstructionFor", jSONArray);
                    a.put("friendlyObstructionClass", fVar.f22733b);
                    a.put("friendlyObstructionPurpose", fVar.f22734c);
                    a.put("friendlyObstructionReason", fVar.f22735d);
                } catch (JSONException e13) {
                    k.b("Error with setting friendly obstruction", e13);
                }
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z10 && !z14) {
                z15 = false;
            } else {
                z15 = true;
            }
            b(view, bVar, a, i10, z15);
        }
    }

    public final void b(View view, od.b bVar, JSONObject jSONObject, int i10, boolean z10) {
        bVar.a(view, jSONObject, this, i10 == 1, z10);
    }
}
