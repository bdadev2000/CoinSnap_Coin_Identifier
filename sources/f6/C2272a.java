package f6;

import C.c;
import E1.d;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import c6.InterfaceC0613a;
import c6.InterfaceC0614b;
import com.mbridge.msdk.foundation.entity.o;
import e1.f;
import e6.AbstractC2224b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import r8.k;

/* renamed from: f6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2272a implements InterfaceC0613a {

    /* renamed from: g, reason: collision with root package name */
    public static final C2272a f20351g = new C2272a();

    /* renamed from: h, reason: collision with root package name */
    public static final Handler f20352h = new Handler(Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public static Handler f20353i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final V5.a f20354j = new V5.a(2);

    /* renamed from: k, reason: collision with root package name */
    public static final V5.a f20355k = new V5.a(3);

    /* renamed from: f, reason: collision with root package name */
    public long f20360f;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f20356a = new ArrayList();
    public final ArrayList b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final C2273b f20358d = new C2273b();

    /* renamed from: c, reason: collision with root package name */
    public final d f20357c = new d(21);

    /* renamed from: e, reason: collision with root package name */
    public final a7.b f20359e = new a7.b(new c((byte) 0, 23), 24);

    public static void b() {
        if (f20353i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f20353i = handler;
            handler.post(f20354j);
            f20353i.postDelayed(f20355k, 200L);
        }
    }

    public final void a(View view, InterfaceC0614b interfaceC0614b, JSONObject jSONObject, boolean z8) {
        char c9;
        String str;
        boolean z9;
        if (k.a(view) == null) {
            C2273b c2273b = this.f20358d;
            if (c2273b.f20363d.contains(view)) {
                c9 = 1;
            } else if (c2273b.f20368i) {
                c9 = 2;
            } else {
                c9 = 3;
            }
            if (c9 == 3) {
                return;
            }
            JSONObject a6 = interfaceC0614b.a(view);
            AbstractC2224b.c(jSONObject, a6);
            HashMap hashMap = c2273b.f20361a;
            if (hashMap.size() == 0) {
                str = null;
            } else {
                String str2 = (String) hashMap.get(view);
                if (str2 != null) {
                    hashMap.remove(view);
                }
                str = str2;
            }
            boolean z10 = false;
            if (str != null) {
                try {
                    a6.put("adSessionId", str);
                } catch (JSONException e4) {
                    f.a("Error with setting ad session id", e4);
                }
                WeakHashMap weakHashMap = c2273b.f20367h;
                if (weakHashMap.containsKey(view)) {
                    weakHashMap.put(view, Boolean.TRUE);
                } else {
                    z10 = true;
                }
                try {
                    a6.put("hasWindowFocus", Boolean.valueOf(z10));
                } catch (JSONException e9) {
                    f.a("Error with setting has window focus", e9);
                }
                c2273b.f20368i = true;
                return;
            }
            o.v(c2273b.b.get(view));
            if (c9 == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            interfaceC0614b.l(view, a6, this, z9, z8);
        }
    }
}
