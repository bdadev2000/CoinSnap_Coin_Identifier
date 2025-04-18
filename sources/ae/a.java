package ae;

import a4.j;
import a6.k;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.WindowManager;
import androidx.emoji2.text.q;
import com.facebook.internal.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s2.h;

/* loaded from: classes4.dex */
public final class a implements xd.a {

    /* renamed from: g, reason: collision with root package name */
    public static final a f464g = new a();

    /* renamed from: h, reason: collision with root package name */
    public static final Handler f465h = new Handler(Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public static Handler f466i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final q f467j = new q(3);

    /* renamed from: k, reason: collision with root package name */
    public static final q f468k = new q(4);

    /* renamed from: f, reason: collision with root package name */
    public long f473f;
    public final ArrayList a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f469b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final b f471d = new b();

    /* renamed from: c, reason: collision with root package name */
    public final qa.a f470c = new qa.a(17);

    /* renamed from: e, reason: collision with root package name */
    public final qa.a f472e = new qa.a(new h(11), 18);

    public static void c() {
        if (f466i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f466i = handler;
            handler.post(f467j);
            f466i.postDelayed(f468k, 200L);
        }
    }

    public final void a(View view, xd.b bVar, JSONObject jSONObject, boolean z10) {
        boolean z11;
        int i10;
        String str;
        boolean z12 = false;
        if (k.a(view) == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return;
        }
        b bVar2 = this.f471d;
        if (bVar2.f476d.contains(view)) {
            i10 = 1;
        } else if (bVar2.f481i) {
            i10 = 2;
        } else {
            i10 = 3;
        }
        if (i10 == 3) {
            return;
        }
        JSONObject a = bVar.a(view);
        WindowManager windowManager = zd.b.a;
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
        HashMap hashMap = bVar2.a;
        if (hashMap.size() == 0) {
            str = null;
        } else {
            String str2 = (String) hashMap.get(view);
            if (str2 != null) {
                hashMap.remove(view);
            }
            str = str2;
        }
        if (str != null) {
            try {
                a.put("adSessionId", str);
            } catch (JSONException e10) {
                i.b("Error with setting ad session id", e10);
            }
            WeakHashMap weakHashMap = bVar2.f480h;
            if (weakHashMap.containsKey(view)) {
                weakHashMap.put(view, Boolean.TRUE);
            } else {
                z12 = true;
            }
            try {
                a.put("hasWindowFocus", Boolean.valueOf(z12));
            } catch (JSONException e11) {
                i.b("Error with setting has window focus", e11);
            }
            bVar2.f481i = true;
            z12 = true;
        }
        if (!z12) {
            j.t(bVar2.f474b.get(view));
            b(view, bVar, a, i10, z10);
        }
    }

    public final void b(View view, xd.b bVar, JSONObject jSONObject, int i10, boolean z10) {
        bVar.d(view, jSONObject, this, i10 == 1, z10);
    }
}
