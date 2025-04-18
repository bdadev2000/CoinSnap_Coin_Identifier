package com.mbridge.msdk.newreward.function.d.b;

import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.tracker.network.ac;
import com.mbridge.msdk.tracker.network.r;
import com.mbridge.msdk.tracker.network.u;
import com.mbridge.msdk.tracker.network.w;
import com.mbridge.msdk.tracker.network.y;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class g extends u<JSONObject> implements w.a {
    public static int a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static int f14584b = 1;

    /* renamed from: c, reason: collision with root package name */
    private e f14585c;

    /* renamed from: d, reason: collision with root package name */
    private HashMap<String, String> f14586d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, String> f14587e;

    public g(String str) {
        super(0, str, 0, "setting");
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final /* synthetic */ void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        e eVar = this.f14585c;
        if (eVar == null) {
            return;
        }
        try {
            if (jSONObject2 == null) {
                eVar.a(this, new d(-1));
            } else {
                eVar.a(jSONObject2, this);
            }
        } catch (Exception e2) {
            ad.b("RewardSettingRequest", "onError Exception: ", e2);
        }
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final Map<String, String> c() {
        Map<String, String> map = this.f14587e;
        if (map == null) {
            HashMap hashMap = new HashMap();
            this.f14587e = hashMap;
            return hashMap;
        }
        map.put("Charset", "UTF-8");
        return this.f14587e;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final boolean d() {
        return true;
    }

    public final void a(e eVar) {
        this.f14585c = eVar;
    }

    public final void a(Map<String, String> map) {
        if (this.f14586d == null) {
            this.f14586d = new HashMap<>();
        }
        if (map == null || map.isEmpty()) {
            return;
        }
        this.f14586d.putAll(map);
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final Map<String, String> a() {
        if (this.f14586d == null) {
            this.f14586d = new HashMap<>();
        }
        return this.f14586d;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final w<JSONObject> a(r rVar) {
        if (rVar != null) {
            try {
                byte[] bArr = rVar.f15471b;
                if (bArr != null && bArr.length != 0) {
                    return w.a(new JSONObject(new String(bArr, com.mbridge.msdk.tracker.network.toolbox.f.a(rVar.f15472c))), com.mbridge.msdk.tracker.network.toolbox.f.a(rVar));
                }
            } catch (UnsupportedEncodingException e2) {
                ad.b("RewardSettingRequest", "parseNetworkResponse UnsupportedEncodingException: ", e2);
                return w.a(new com.mbridge.msdk.tracker.network.f(e2));
            } catch (Exception e10) {
                ad.b("RewardSettingRequest", "parseNetworkResponse Exception: ", e10);
                return w.a(new ac(e10));
            }
        }
        return w.a(new y());
    }

    public final void a(String str, String str2) {
        if (this.f14587e == null) {
            this.f14587e = new HashMap();
        }
        this.f14587e.put(str, str2);
    }

    @Override // com.mbridge.msdk.tracker.network.w.a
    public final void a(com.mbridge.msdk.tracker.network.ad adVar) {
        this.f14585c.a(this, new d(-1, adVar.getMessage()));
    }
}
