package T5;

import J1.p;
import O5.j;
import O5.k;
import R5.h;
import android.app.UiModeManager;
import android.os.Build;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;
import z2.i;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3019a;

    /* renamed from: c, reason: collision with root package name */
    public O5.a f3020c;

    /* renamed from: d, reason: collision with root package name */
    public P5.b f3021d;

    /* renamed from: f, reason: collision with root package name */
    public long f3023f = System.nanoTime();

    /* renamed from: e, reason: collision with root package name */
    public int f3022e = 1;
    public X5.a b = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r3v1, types: [X5.a, java.lang.ref.WeakReference] */
    public a(String str) {
        this.f3019a = str;
    }

    public void a(k kVar, O5.d dVar) {
        b(kVar, dVar, null);
    }

    public final void b(k kVar, O5.d dVar, JSONObject jSONObject) {
        String str;
        String str2 = kVar.f2235h;
        JSONObject jSONObject2 = new JSONObject();
        U5.b.b(jSONObject2, "environment", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        U5.b.b(jSONObject2, "adSessionType", (O5.e) dVar.f2208h);
        JSONObject jSONObject3 = new JSONObject();
        U5.b.b(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        U5.b.b(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        U5.b.b(jSONObject3, "os", "Android");
        U5.b.b(jSONObject2, "deviceInfo", jSONObject3);
        UiModeManager uiModeManager = i.f24529a;
        char c9 = 3;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            if (currentModeType != 1) {
                if (currentModeType == 4) {
                    c9 = 1;
                }
            } else {
                c9 = 2;
            }
        }
        if (c9 != 1) {
            if (c9 != 2) {
                if (c9 == 3) {
                    str = "other";
                } else {
                    throw null;
                }
            } else {
                str = "mobile";
            }
        } else {
            str = "ctv";
        }
        U5.b.b(jSONObject2, "deviceCategory", str);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        U5.b.b(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        p pVar = (p) dVar.f2207g;
        U5.b.b(jSONObject4, "partnerName", pVar.f1537a);
        U5.b.b(jSONObject4, "partnerVersion", pVar.b);
        U5.b.b(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        U5.b.b(jSONObject5, "libraryVersion", "1.4.13-Mmadbridge");
        U5.b.b(jSONObject5, "appId", h.b.f2750a.getApplicationContext().getPackageName());
        U5.b.b(jSONObject2, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject5);
        String str3 = dVar.f2206f;
        if (str3 != null) {
            U5.b.b(jSONObject2, "contentUrl", str3);
        }
        String str4 = dVar.f2205e;
        if (str4 != null) {
            U5.b.b(jSONObject2, "customReferenceData", str4);
        }
        JSONObject jSONObject6 = new JSONObject();
        for (j jVar : Collections.unmodifiableList((ArrayList) dVar.b)) {
            U5.b.b(jSONObject6, jVar.f2227a, jVar.f2228c);
        }
        R5.i.f2751a.a(f(), "startSession", str2, jSONObject2, jSONObject6, jSONObject);
    }

    public final void c(String str, JSONObject jSONObject) {
        R5.i.f2751a.a(f(), "publishMediaEvent", str, jSONObject, this.f3019a);
    }

    public final void d(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        U5.b.b(jSONObject, CampaignEx.JSON_KEY_TIMESTAMP, Long.valueOf(date.getTime()));
        R5.i.f2751a.a(f(), "setLastActivity", jSONObject);
    }

    public void e() {
        this.b.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView f() {
        return (WebView) this.b.get();
    }

    public void g() {
    }
}
