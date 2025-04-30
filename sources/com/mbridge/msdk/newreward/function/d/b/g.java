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

/* loaded from: classes3.dex */
public final class g extends u<JSONObject> implements w.a {

    /* renamed from: a, reason: collision with root package name */
    public static int f17220a = 0;
    public static int b = 1;

    /* renamed from: c, reason: collision with root package name */
    private e f17221c;

    /* renamed from: d, reason: collision with root package name */
    private HashMap<String, String> f17222d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, String> f17223e;

    public g(String str) {
        super(0, str, 0, "setting");
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final /* synthetic */ void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        e eVar = this.f17221c;
        if (eVar == null) {
            return;
        }
        try {
            if (jSONObject2 == null) {
                eVar.a(this, new d(-1));
            } else {
                eVar.a(jSONObject2, this);
            }
        } catch (Exception e4) {
            ad.b("RewardSettingRequest", "onError Exception: ", e4);
        }
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final Map<String, String> c() {
        Map<String, String> map = this.f17223e;
        if (map == null) {
            HashMap hashMap = new HashMap();
            this.f17223e = hashMap;
            return hashMap;
        }
        map.put("Charset", "UTF-8");
        return this.f17223e;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final boolean d() {
        return true;
    }

    public final void a(e eVar) {
        this.f17221c = eVar;
    }

    public final void a(Map<String, String> map) {
        if (this.f17222d == null) {
            this.f17222d = new HashMap<>();
        }
        if (map == null || map.isEmpty()) {
            return;
        }
        this.f17222d.putAll(map);
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final Map<String, String> a() {
        if (this.f17222d == null) {
            this.f17222d = new HashMap<>();
        }
        return this.f17222d;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final w<JSONObject> a(r rVar) {
        if (rVar != null) {
            try {
                byte[] bArr = rVar.b;
                if (bArr != null && bArr.length != 0) {
                    return w.a(new JSONObject(new String(bArr, com.mbridge.msdk.tracker.network.toolbox.f.a(rVar.f18232c))), com.mbridge.msdk.tracker.network.toolbox.f.a(rVar));
                }
            } catch (UnsupportedEncodingException e4) {
                ad.b("RewardSettingRequest", "parseNetworkResponse UnsupportedEncodingException: ", e4);
                return w.a(new com.mbridge.msdk.tracker.network.f(e4));
            } catch (Exception e9) {
                ad.b("RewardSettingRequest", "parseNetworkResponse Exception: ", e9);
                return w.a(new ac(e9));
            }
        }
        return w.a(new y());
    }

    public final void a(String str, String str2) {
        if (this.f17223e == null) {
            this.f17223e = new HashMap();
        }
        this.f17223e.put(str, str2);
    }

    @Override // com.mbridge.msdk.tracker.network.w.a
    public final void a(com.mbridge.msdk.tracker.network.ad adVar) {
        this.f17221c.a(this, new d(-1, adVar.getMessage()));
    }
}
