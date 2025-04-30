package d6;

import J1.p;
import O5.d;
import Z5.g;
import Z5.h;
import android.app.UiModeManager;
import android.os.Build;
import android.webkit.WebView;
import b6.f;
import com.facebook.appevents.n;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import e6.AbstractC2224b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: d6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2191a {

    /* renamed from: a, reason: collision with root package name */
    public final String f19912a;

    /* renamed from: c, reason: collision with root package name */
    public Z5.a f19913c;

    /* renamed from: e, reason: collision with root package name */
    public long f19915e = System.nanoTime();

    /* renamed from: d, reason: collision with root package name */
    public int f19914d = 1;
    public X5.a b = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r3v1, types: [X5.a, java.lang.ref.WeakReference] */
    public AbstractC2191a(String str) {
        this.f19912a = str;
    }

    public void a(h hVar, d dVar) {
        b(hVar, dVar, null);
    }

    public final void b(h hVar, d dVar, JSONObject jSONObject) {
        String str;
        String str2 = hVar.f3904h;
        JSONObject jSONObject2 = new JSONObject();
        AbstractC2224b.b(jSONObject2, "environment", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        AbstractC2224b.b(jSONObject2, "adSessionType", (Z5.c) dVar.f2208h);
        JSONObject jSONObject3 = new JSONObject();
        AbstractC2224b.b(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        AbstractC2224b.b(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        AbstractC2224b.b(jSONObject3, "os", "Android");
        AbstractC2224b.b(jSONObject2, "deviceInfo", jSONObject3);
        UiModeManager uiModeManager = n.f13498a;
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
        AbstractC2224b.b(jSONObject2, "deviceCategory", str);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        AbstractC2224b.b(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        p pVar = (p) dVar.f2207g;
        AbstractC2224b.b(jSONObject4, "partnerName", pVar.f1537a);
        AbstractC2224b.b(jSONObject4, "partnerVersion", pVar.b);
        AbstractC2224b.b(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        AbstractC2224b.b(jSONObject5, "libraryVersion", "1.4.12-Vungle");
        AbstractC2224b.b(jSONObject5, "appId", f.b.f5340a.getApplicationContext().getPackageName());
        AbstractC2224b.b(jSONObject2, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject5);
        String str3 = dVar.f2206f;
        if (str3 != null) {
            AbstractC2224b.b(jSONObject2, "contentUrl", str3);
        }
        String str4 = dVar.f2205e;
        if (str4 != null) {
            AbstractC2224b.b(jSONObject2, "customReferenceData", str4);
        }
        JSONObject jSONObject6 = new JSONObject();
        for (g gVar : Collections.unmodifiableList((ArrayList) dVar.b)) {
            AbstractC2224b.b(jSONObject6, gVar.f3896a, gVar.f3897c);
        }
        b6.g.f5341a.a(e(), "startSession", str2, jSONObject2, jSONObject6, jSONObject);
    }

    public final void c(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        AbstractC2224b.b(jSONObject, CampaignEx.JSON_KEY_TIMESTAMP, Long.valueOf(date.getTime()));
        b6.g.f5341a.a(e(), "setLastActivity", jSONObject);
    }

    public void d() {
        this.b.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView e() {
        return (WebView) this.b.get();
    }

    public void f() {
    }
}
