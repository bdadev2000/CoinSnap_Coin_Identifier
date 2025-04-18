package com.mbridge.msdk.newreward.function.d.b;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.a.c.a;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.newreward.function.common.VolleyErrorUtils;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.tracker.network.ac;
import com.mbridge.msdk.tracker.network.r;
import com.mbridge.msdk.tracker.network.t;
import com.mbridge.msdk.tracker.network.u;
import com.mbridge.msdk.tracker.network.w;
import com.mbridge.msdk.tracker.network.y;
import com.mbridge.msdk.tracker.network.z;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a extends u<JSONObject> implements w.a {
    protected com.mbridge.msdk.newreward.function.d.a.b a;

    /* renamed from: b, reason: collision with root package name */
    protected Context f14560b;

    /* renamed from: c, reason: collision with root package name */
    protected int f14561c;

    /* renamed from: d, reason: collision with root package name */
    protected String f14562d;

    /* renamed from: e, reason: collision with root package name */
    protected String f14563e;

    /* renamed from: f, reason: collision with root package name */
    protected String f14564f;

    /* renamed from: g, reason: collision with root package name */
    private Map<String, String> f14565g;

    /* renamed from: h, reason: collision with root package name */
    private c f14566h;

    /* renamed from: i, reason: collision with root package name */
    private z f14567i;

    /* renamed from: j, reason: collision with root package name */
    private long f14568j;

    /* renamed from: k, reason: collision with root package name */
    private long f14569k;

    /* renamed from: l, reason: collision with root package name */
    private String f14570l;

    /* renamed from: m, reason: collision with root package name */
    private String f14571m;

    /* renamed from: n, reason: collision with root package name */
    private String f14572n;

    /* renamed from: o, reason: collision with root package name */
    private String f14573o;

    /* renamed from: p, reason: collision with root package name */
    private Map<String, String> f14574p;

    /* renamed from: q, reason: collision with root package name */
    private long f14575q;

    /* renamed from: com.mbridge.msdk.newreward.function.d.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0189a implements a.InterfaceC0185a {
        private final a a;

        /* renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.function.d.a.b f14576b;

        public C0189a(a aVar, com.mbridge.msdk.newreward.function.d.a.b bVar) {
            this.a = aVar;
            this.f14576b = bVar;
        }

        @Override // com.mbridge.msdk.newreward.a.c.a.InterfaceC0185a
        public final void a(String str, long j3) {
            ad.a("BaseCampaignRequest", "onTimeout taskID = " + str + ", timeout = " + j3);
            a.a(this.a, this.f14576b, j3);
        }
    }

    public a(int i10, String str, String str2, String str3, long j3, String str4, String str5) {
        super(0, str4, 0, str5);
        this.f14560b = com.mbridge.msdk.foundation.controller.c.m().c();
        this.f14561c = i10;
        this.f14562d = str;
        this.f14563e = str2;
        this.f14564f = str3;
        this.f14570l = UUID.randomUUID().toString();
        this.f14568j = SystemClock.elapsedRealtime();
        this.f14573o = str4;
        this.a = new com.mbridge.msdk.newreward.function.d.a.b(this.f14561c, this.f14562d, this.f14563e, this.f14564f);
        a((w.a) this);
        d(true);
        c(true);
        this.f14575q = j3 <= 0 ? 30000L : j3;
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f14570l, this.f14575q, new C0189a(this, this.a));
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final /* synthetic */ void a(JSONObject jSONObject) {
        c cVar;
        JSONObject jSONObject2 = jSONObject;
        if (MBridgeConstans.DEBUG) {
            ad.a("BaseCampaignRequest", "deliverResponse: " + jSONObject2);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f14570l);
        int optInt = jSONObject2.optInt(NotificationCompat.CATEGORY_STATUS);
        if (optInt == 1) {
            JSONObject optJSONObject = jSONObject2.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject != null) {
                CampaignUnit parseCampaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(optJSONObject, this.f14571m);
                this.a.a(optJSONObject);
                this.a.f(optJSONObject.optString(com.mbridge.msdk.foundation.controller.a.a));
                this.a.e(optJSONObject.optString(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B));
                this.a.d(optJSONObject.optString("a"));
                this.a.b(optJSONObject.optInt("template"));
                this.a.a(System.currentTimeMillis());
                this.a.c(this.f14571m);
                this.a.g(optJSONObject.optString(com.mbridge.msdk.foundation.same.a.S));
                this.a.a(1);
                this.a.c(0);
                this.a.a(parseCampaignUnit.getRequestId());
                this.a.a(parseCampaignUnit.getEcppv());
                this.a.i(this.f14573o);
                MBridgeGlobalCommon.handlerCampaigns(this.f14572n, this.a, parseCampaignUnit.getAds(), new ArrayList());
                com.mbridge.msdk.newreward.function.d.a.b bVar = this.a;
                if (bVar != null && (cVar = this.f14566h) != null) {
                    try {
                        cVar.a(bVar, this);
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("BaseCampaignRequest", "handlerOnSuccessEvent Exception: ", e2);
                        }
                    }
                }
            } else {
                a(this, this.a, new b(7, "data is null"));
            }
        } else {
            b bVar2 = new b(9);
            bVar2.a(jSONObject2.optString(NotificationCompat.CATEGORY_MESSAGE, ""));
            bVar2.a(optInt);
            bVar2.c(jSONObject2.toString());
            a(this, this.a, bVar2);
        }
        this.f14569k = SystemClock.elapsedRealtime();
    }

    public final void b(String str) {
        c("local_id", str);
        c("ad_type", String.valueOf(this.f14561c));
        this.f14572n = str;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final Map<String, String> c() {
        if (this.f14574p == null) {
            this.f14574p = new HashMap();
        }
        this.f14574p.put("Charset", "UTF-8");
        return this.f14574p;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final boolean d() {
        return true;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final z b() {
        if (this.f14567i == null) {
            this.f14567i = new com.mbridge.msdk.tracker.network.e(10000, this.f14575q, 5);
        }
        return this.f14567i;
    }

    public final void b(String str, String str2) {
        if (this.f14574p == null) {
            this.f14574p = new HashMap();
        }
        this.f14574p.put(str, str2);
    }

    public final void a(c cVar) {
        this.f14566h = cVar;
    }

    public final void a(String str, String str2) {
        if (this.f14565g == null) {
            this.f14565g = new HashMap();
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Map<String, String> map = this.f14565g;
        if (str2 == null) {
            str2 = "";
        }
        map.put(str, str2);
    }

    public final void a(String str) {
        this.f14571m = str;
    }

    public final void a(Map<String, String> map) {
        if (this.f14565g == null) {
            this.f14565g = new HashMap();
        }
        if (map == null || map.size() == 0) {
            return;
        }
        this.f14565g.putAll(map);
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final Map<String, String> a() {
        if (this.f14565g == null) {
            this.f14565g = new HashMap();
        }
        return this.f14565g;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final w<JSONObject> a(r rVar) {
        if (rVar != null) {
            try {
                byte[] bArr = rVar.f15471b;
                if (bArr != null && bArr.length != 0) {
                    return w.a(new JSONObject(new String(bArr, StandardCharsets.UTF_8)), com.mbridge.msdk.tracker.network.toolbox.f.a(rVar));
                }
            } catch (JSONException e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("BaseCampaignRequest", "parseNetworkResponse JSONException: ", e2);
                }
                return w.a(new t(e2));
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("BaseCampaignRequest", "parseNetworkResponse Exception: ", e10);
                }
                return w.a(new ac(e10));
            }
        }
        return w.a(new y());
    }

    @Override // com.mbridge.msdk.tracker.network.w.a
    public final void a(com.mbridge.msdk.tracker.network.ad adVar) {
        c cVar;
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f14570l);
        if (MBridgeConstans.DEBUG) {
            ad.b("BaseCampaignRequest", "onErrorResponse: " + adVar.getMessage());
        }
        com.mbridge.msdk.newreward.function.d.a.b bVar = this.a;
        if (bVar == null || (cVar = this.f14566h) == null) {
            return;
        }
        try {
            cVar.b(bVar, this, VolleyErrorUtils.parseVolleyError(adVar));
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("BaseCampaignRequest", "onError Exception: ", e2);
            }
        }
    }

    private static void a(a aVar, com.mbridge.msdk.newreward.function.d.a.b bVar, b bVar2) {
        c cVar;
        if (aVar == null || bVar == null || (cVar = aVar.f14566h) == null) {
            return;
        }
        try {
            cVar.a(bVar, aVar, bVar2);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("BaseCampaignRequest", "handlerOnFailedEvent Exception: ", e2);
            }
        }
    }

    public static /* synthetic */ void a(a aVar, com.mbridge.msdk.newreward.function.d.a.b bVar, long j3) {
        c cVar;
        if (aVar == null || bVar == null || (cVar = aVar.f14566h) == null) {
            return;
        }
        try {
            cVar.a(bVar, aVar, j3, new b(10, "v3 is timeout"));
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("BaseCampaignRequest", "onTimeout Exception: ", e2);
            }
        }
    }
}
