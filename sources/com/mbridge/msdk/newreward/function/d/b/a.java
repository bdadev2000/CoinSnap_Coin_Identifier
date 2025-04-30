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

/* loaded from: classes3.dex */
public class a extends u<JSONObject> implements w.a {

    /* renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.newreward.function.d.a.b f17198a;
    protected Context b;

    /* renamed from: c, reason: collision with root package name */
    protected int f17199c;

    /* renamed from: d, reason: collision with root package name */
    protected String f17200d;

    /* renamed from: e, reason: collision with root package name */
    protected String f17201e;

    /* renamed from: f, reason: collision with root package name */
    protected String f17202f;

    /* renamed from: g, reason: collision with root package name */
    private Map<String, String> f17203g;

    /* renamed from: h, reason: collision with root package name */
    private c f17204h;

    /* renamed from: i, reason: collision with root package name */
    private z f17205i;

    /* renamed from: j, reason: collision with root package name */
    private long f17206j;

    /* renamed from: k, reason: collision with root package name */
    private long f17207k;
    private String l;
    private String m;

    /* renamed from: n, reason: collision with root package name */
    private String f17208n;

    /* renamed from: o, reason: collision with root package name */
    private String f17209o;

    /* renamed from: p, reason: collision with root package name */
    private Map<String, String> f17210p;

    /* renamed from: q, reason: collision with root package name */
    private long f17211q;

    /* renamed from: com.mbridge.msdk.newreward.function.d.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0177a implements a.InterfaceC0173a {

        /* renamed from: a, reason: collision with root package name */
        private final a f17212a;
        private final com.mbridge.msdk.newreward.function.d.a.b b;

        public C0177a(a aVar, com.mbridge.msdk.newreward.function.d.a.b bVar) {
            this.f17212a = aVar;
            this.b = bVar;
        }

        @Override // com.mbridge.msdk.newreward.a.c.a.InterfaceC0173a
        public final void a(String str, long j7) {
            ad.a("BaseCampaignRequest", "onTimeout taskID = " + str + ", timeout = " + j7);
            a.a(this.f17212a, this.b, j7);
        }
    }

    public a(int i9, String str, String str2, String str3, long j7, String str4, String str5) {
        super(0, str4, 0, str5);
        this.b = com.mbridge.msdk.foundation.controller.c.m().c();
        this.f17199c = i9;
        this.f17200d = str;
        this.f17201e = str2;
        this.f17202f = str3;
        this.l = UUID.randomUUID().toString();
        this.f17206j = SystemClock.elapsedRealtime();
        this.f17209o = str4;
        this.f17198a = new com.mbridge.msdk.newreward.function.d.a.b(this.f17199c, this.f17200d, this.f17201e, this.f17202f);
        a((w.a) this);
        d(true);
        c(true);
        this.f17211q = j7 <= 0 ? 30000L : j7;
        com.mbridge.msdk.newreward.a.c.a.a().a(this.l, this.f17211q, new C0177a(this, this.f17198a));
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final /* synthetic */ void a(JSONObject jSONObject) {
        c cVar;
        JSONObject jSONObject2 = jSONObject;
        if (MBridgeConstans.DEBUG) {
            ad.a("BaseCampaignRequest", "deliverResponse: " + jSONObject2);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.l);
        int optInt = jSONObject2.optInt(NotificationCompat.CATEGORY_STATUS);
        if (optInt == 1) {
            JSONObject optJSONObject = jSONObject2.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject != null) {
                CampaignUnit parseCampaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(optJSONObject, this.m);
                this.f17198a.a(optJSONObject);
                this.f17198a.f(optJSONObject.optString(com.mbridge.msdk.foundation.controller.a.f15376a));
                this.f17198a.e(optJSONObject.optString(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B));
                this.f17198a.d(optJSONObject.optString("a"));
                this.f17198a.b(optJSONObject.optInt("template"));
                this.f17198a.a(System.currentTimeMillis());
                this.f17198a.c(this.m);
                this.f17198a.g(optJSONObject.optString(com.mbridge.msdk.foundation.same.a.f15671S));
                this.f17198a.a(1);
                this.f17198a.c(0);
                this.f17198a.a(parseCampaignUnit.getRequestId());
                this.f17198a.a(parseCampaignUnit.getEcppv());
                this.f17198a.i(this.f17209o);
                MBridgeGlobalCommon.handlerCampaigns(this.f17208n, this.f17198a, parseCampaignUnit.getAds(), new ArrayList());
                com.mbridge.msdk.newreward.function.d.a.b bVar = this.f17198a;
                if (bVar != null && (cVar = this.f17204h) != null) {
                    try {
                        cVar.a(bVar, this);
                    } catch (Exception e4) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("BaseCampaignRequest", "handlerOnSuccessEvent Exception: ", e4);
                        }
                    }
                }
            } else {
                a(this, this.f17198a, new b(7, "data is null"));
            }
        } else {
            b bVar2 = new b(9);
            bVar2.a(jSONObject2.optString(NotificationCompat.CATEGORY_MESSAGE, ""));
            bVar2.a(optInt);
            bVar2.c(jSONObject2.toString());
            a(this, this.f17198a, bVar2);
        }
        this.f17207k = SystemClock.elapsedRealtime();
    }

    public final void b(String str) {
        c("local_id", str);
        c("ad_type", String.valueOf(this.f17199c));
        this.f17208n = str;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final Map<String, String> c() {
        if (this.f17210p == null) {
            this.f17210p = new HashMap();
        }
        this.f17210p.put("Charset", "UTF-8");
        return this.f17210p;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final boolean d() {
        return true;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final z b() {
        if (this.f17205i == null) {
            this.f17205i = new com.mbridge.msdk.tracker.network.e(10000, this.f17211q, 5);
        }
        return this.f17205i;
    }

    public final void b(String str, String str2) {
        if (this.f17210p == null) {
            this.f17210p = new HashMap();
        }
        this.f17210p.put(str, str2);
    }

    public final void a(c cVar) {
        this.f17204h = cVar;
    }

    public final void a(String str, String str2) {
        if (this.f17203g == null) {
            this.f17203g = new HashMap();
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Map<String, String> map = this.f17203g;
        if (str2 == null) {
            str2 = "";
        }
        map.put(str, str2);
    }

    public final void a(String str) {
        this.m = str;
    }

    public final void a(Map<String, String> map) {
        if (this.f17203g == null) {
            this.f17203g = new HashMap();
        }
        if (map == null || map.size() == 0) {
            return;
        }
        this.f17203g.putAll(map);
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final Map<String, String> a() {
        if (this.f17203g == null) {
            this.f17203g = new HashMap();
        }
        return this.f17203g;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final w<JSONObject> a(r rVar) {
        if (rVar != null) {
            try {
                byte[] bArr = rVar.b;
                if (bArr != null && bArr.length != 0) {
                    return w.a(new JSONObject(new String(bArr, StandardCharsets.UTF_8)), com.mbridge.msdk.tracker.network.toolbox.f.a(rVar));
                }
            } catch (JSONException e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("BaseCampaignRequest", "parseNetworkResponse JSONException: ", e4);
                }
                return w.a(new t(e4));
            } catch (Exception e9) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("BaseCampaignRequest", "parseNetworkResponse Exception: ", e9);
                }
                return w.a(new ac(e9));
            }
        }
        return w.a(new y());
    }

    @Override // com.mbridge.msdk.tracker.network.w.a
    public final void a(com.mbridge.msdk.tracker.network.ad adVar) {
        c cVar;
        com.mbridge.msdk.newreward.a.c.a.a().a(this.l);
        if (MBridgeConstans.DEBUG) {
            ad.b("BaseCampaignRequest", "onErrorResponse: " + adVar.getMessage());
        }
        com.mbridge.msdk.newreward.function.d.a.b bVar = this.f17198a;
        if (bVar == null || (cVar = this.f17204h) == null) {
            return;
        }
        try {
            cVar.b(bVar, this, VolleyErrorUtils.parseVolleyError(adVar));
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("BaseCampaignRequest", "onError Exception: ", e4);
            }
        }
    }

    private static void a(a aVar, com.mbridge.msdk.newreward.function.d.a.b bVar, b bVar2) {
        c cVar;
        if (aVar == null || bVar == null || (cVar = aVar.f17204h) == null) {
            return;
        }
        try {
            cVar.a(bVar, aVar, bVar2);
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("BaseCampaignRequest", "handlerOnFailedEvent Exception: ", e4);
            }
        }
    }

    public static /* synthetic */ void a(a aVar, com.mbridge.msdk.newreward.function.d.a.b bVar, long j7) {
        c cVar;
        if (aVar == null || bVar == null || (cVar = aVar.f17204h) == null) {
            return;
        }
        try {
            cVar.a(bVar, aVar, j7, new b(10, "v3 is timeout"));
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("BaseCampaignRequest", "onTimeout Exception: ", e4);
            }
        }
    }
}
