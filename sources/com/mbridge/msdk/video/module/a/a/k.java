package com.mbridge.msdk.video.module.a.a;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.foundation.tools.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class k extends f {
    protected boolean a;

    /* renamed from: b, reason: collision with root package name */
    protected CampaignEx f16034b;

    /* renamed from: c, reason: collision with root package name */
    protected List<CampaignEx> f16035c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f16036d;

    /* renamed from: e, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.download.a f16037e;

    /* renamed from: f, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.b.c f16038f;

    /* renamed from: g, reason: collision with root package name */
    protected String f16039g;

    /* renamed from: h, reason: collision with root package name */
    protected String f16040h;

    /* renamed from: i, reason: collision with root package name */
    protected com.mbridge.msdk.video.module.a.a f16041i;

    /* renamed from: j, reason: collision with root package name */
    protected int f16042j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16043k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f16044l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f16045m = false;

    public k(CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar, com.mbridge.msdk.videocommon.b.c cVar, String str, String str2, com.mbridge.msdk.video.module.a.a aVar2, int i10, boolean z10) {
        this.f16036d = false;
        this.f16041i = new f();
        this.f16042j = 1;
        if (!z10 && campaignEx != null && an.b(str2) && aVar != null && aVar2 != null) {
            this.f16034b = campaignEx;
            this.f16040h = str;
            this.f16039g = str2;
            this.f16037e = aVar;
            this.f16038f = cVar;
            this.f16041i = aVar2;
            this.a = true;
            this.f16042j = i10;
            this.f16036d = false;
            return;
        }
        if (z10 && campaignEx != null && an.b(str2) && aVar2 != null) {
            this.f16034b = campaignEx;
            this.f16040h = str;
            this.f16039g = str2;
            this.f16037e = aVar;
            this.f16038f = cVar;
            this.f16041i = aVar2;
            this.a = true;
            this.f16042j = i10;
            this.f16036d = true;
        }
    }

    public final void a(CampaignEx campaignEx) {
        this.f16034b = campaignEx;
    }

    public final void b(int i10) {
        CampaignEx campaignEx = this.f16034b;
        if (campaignEx != null) {
            String noticeUrl = campaignEx.getNoticeUrl();
            if (TextUtils.isEmpty(noticeUrl)) {
                return;
            }
            if (i10 == 1 || i10 == 2) {
                if (!noticeUrl.contains("endscreen_type")) {
                    StringBuilder sb2 = new StringBuilder(noticeUrl);
                    if (noticeUrl.contains("?")) {
                        sb2.append("&endscreen_type=");
                        sb2.append(i10);
                    } else {
                        sb2.append("?endscreen_type=");
                        sb2.append(i10);
                    }
                    noticeUrl = sb2.toString();
                } else if (i10 == 2) {
                    if (noticeUrl.contains("endscreen_type=1")) {
                        noticeUrl = noticeUrl.replace("endscreen_type=1", "endscreen_type=2");
                    }
                } else if (noticeUrl.contains("endscreen_type=2")) {
                    noticeUrl = noticeUrl.replace("endscreen_type=2", "endscreen_type=1");
                }
                this.f16034b.setNoticeUrl(noticeUrl);
            }
        }
    }

    public final void c() {
        try {
            Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.video.module.a.a.k.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        k kVar = k.this;
                        if (kVar.a && kVar.f16034b != null && an.b(kVar.f16039g)) {
                            com.mbridge.msdk.videocommon.a.a a = com.mbridge.msdk.videocommon.a.a.a();
                            k kVar2 = k.this;
                            a.a(kVar2.f16034b, kVar2.f16039g);
                        }
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            e2.printStackTrace();
                        }
                    }
                    try {
                        com.mbridge.msdk.videocommon.a.a a10 = com.mbridge.msdk.videocommon.a.a.a();
                        k kVar3 = k.this;
                        a10.c(kVar3.f16040h, kVar3.f16034b.getAdType());
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            e10.printStackTrace();
                        }
                    } catch (Throwable th2) {
                        ad.a("NotifyListener", th2.getMessage());
                    }
                }
            };
            com.mbridge.msdk.foundation.controller.d.a();
            com.mbridge.msdk.foundation.same.f.b.b().execute(runnable);
        } catch (Throwable th2) {
            ad.b("NotifyListener", th2.getMessage(), th2);
        }
    }

    public final void d() {
        com.mbridge.msdk.videocommon.download.a aVar = this.f16037e;
        if (aVar != null) {
            aVar.f(true);
        }
    }

    public final void e() {
        CampaignEx campaignEx;
        Map<String, Long> map;
        String str;
        try {
            CampaignEx campaignEx2 = this.f16034b;
            if (campaignEx2 != null && campaignEx2.isDynamicView() && this.f16036d && !this.f16034b.isCampaignIsFiltered()) {
                this.f16044l = true;
                return;
            }
            if (this.a && (campaignEx = this.f16034b) != null && !TextUtils.isEmpty(campaignEx.getOnlyImpressionURL()) && (map = com.mbridge.msdk.foundation.same.a.b.f13306k) != null && !map.containsKey(this.f16034b.getOnlyImpressionURL()) && !this.f16044l) {
                com.mbridge.msdk.foundation.same.a.b.f13306k.put(this.f16034b.getOnlyImpressionURL(), Long.valueOf(System.currentTimeMillis()));
                String onlyImpressionURL = this.f16034b.getOnlyImpressionURL();
                if (this.f16034b.getSpareOfferFlag() == 1) {
                    str = onlyImpressionURL + "&to=1&cbt=" + this.f16034b.getCbt() + "&tmorl=" + this.f16042j;
                } else {
                    str = onlyImpressionURL + "&to=0&cbt=" + this.f16034b.getCbt() + "&tmorl=" + this.f16042j;
                }
                String str2 = str;
                if (!this.f16036d || this.f16034b.isCampaignIsFiltered()) {
                    com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f16034b, this.f16039g, str2, false, true, com.mbridge.msdk.click.a.a.f12481h);
                    c();
                }
                this.f16044l = true;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void f() {
        String str;
        try {
            if (this.a && !this.f16043k && !TextUtils.isEmpty(this.f16034b.getImpressionURL())) {
                this.f16043k = true;
                if (this.f16034b.isBidCampaign() && this.f16034b != null) {
                    try {
                        HashMap hashMap = new HashMap();
                        List<com.mbridge.msdk.foundation.entity.d> a = com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(this.f16034b.getCampaignUnitId(), this.f16034b.getRequestId());
                        if (a != null && a.size() > 0 && a.get(0) != null) {
                            if (a.get(0).c() == 1) {
                                hashMap.put("encrypt_p=", "encrypt_p=" + a.get(0).b());
                                hashMap.put("irlfa=", "irlfa=1");
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    String str2 = (String) entry.getKey();
                                    String str3 = (String) entry.getValue();
                                    CampaignEx campaignEx = this.f16034b;
                                    campaignEx.setImpressionURL(campaignEx.getImpressionURL().replaceAll(str2, str3));
                                    CampaignEx campaignEx2 = this.f16034b;
                                    campaignEx2.setOnlyImpressionURL(campaignEx2.getOnlyImpressionURL().replaceAll(str2, str3));
                                }
                            }
                            ad.a("BidReplaceCampignDao", "removeReplace count " + com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(this.f16034b.getRequestId()));
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                String impressionURL = this.f16034b.getImpressionURL();
                if (this.f16034b.getSpareOfferFlag() == 1) {
                    str = impressionURL + "&to=1&cbt=" + this.f16034b.getCbt() + "&tmorl=" + this.f16042j;
                } else {
                    str = impressionURL + "&to=0&cbt=" + this.f16034b.getCbt() + "&tmorl=" + this.f16042j;
                }
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f16034b, this.f16039g, str, false, true, com.mbridge.msdk.click.a.a.f12480g);
                com.mbridge.msdk.video.module.b.b.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f16034b);
                new Thread(new Runnable() { // from class: com.mbridge.msdk.video.module.a.a.k.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c())).a(k.this.f16034b.getId());
                        } catch (Throwable th2) {
                            ad.b("NotifyListener", th2.getMessage(), th2);
                        }
                    }
                }).start();
                if (this.a && com.mbridge.msdk.foundation.same.a.b.f13305j != null && !TextUtils.isEmpty(this.f16034b.getId())) {
                    com.mbridge.msdk.foundation.same.a.b.a(this.f16039g, this.f16034b, "reward");
                }
            }
        } catch (Throwable th2) {
            ad.b("NotifyListener", th2.getMessage(), th2);
        }
    }

    public final void g() {
        CampaignEx campaignEx;
        List<String> pv_urls;
        try {
            if (this.a && !this.f16045m && (campaignEx = this.f16034b) != null) {
                this.f16045m = true;
                if ((!campaignEx.isDynamicView() || !this.f16036d || this.f16034b.isCampaignIsFiltered()) && (pv_urls = this.f16034b.getPv_urls()) != null && pv_urls.size() > 0) {
                    Iterator<String> it = pv_urls.iterator();
                    while (it.hasNext()) {
                        com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f16034b, this.f16039g, it.next(), false, true);
                    }
                }
            }
        } catch (Throwable th2) {
            ad.b("NotifyListener", th2.getMessage());
        }
    }

    public final void h() {
        CampaignEx campaignEx = this.f16034b;
        if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getCampaignUnitId()) && this.f16034b.getNativeVideoTracking() != null && this.f16034b.getNativeVideoTracking().o() != null) {
            Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
            CampaignEx campaignEx2 = this.f16034b;
            com.mbridge.msdk.click.a.a(c10, campaignEx2, campaignEx2.getCampaignUnitId(), this.f16034b.getNativeVideoTracking().o(), false, false);
        }
    }

    public final void a(List<CampaignEx> list) {
        this.f16035c = list;
    }

    @Override // com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public void a(int i10, Object obj) {
        super.a(i10, obj);
        this.f16041i.a(i10, obj);
    }

    public final void a(int i10) {
        if (this.f16034b != null) {
            if (i10 == 1 || i10 == 2) {
                com.mbridge.msdk.video.module.b.b.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f16034b, i10, this.f16042j);
            }
        }
    }

    public final void a() {
        if (!this.a || this.f16034b == null) {
            return;
        }
        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000061", this.f16034b.getId(), this.f16034b.getRequestId(), this.f16034b.getRequestIdNotice(), this.f16039g, z.l(com.mbridge.msdk.foundation.controller.c.m().c()));
        nVar.d(this.f16034b.isMraid() ? com.mbridge.msdk.foundation.entity.n.a : com.mbridge.msdk.foundation.entity.n.f13247b);
        com.mbridge.msdk.foundation.same.report.g.b(nVar, com.mbridge.msdk.foundation.controller.c.m().c(), this.f16039g);
    }

    public final void a(int i10, String str) {
        if (this.f16034b != null) {
            com.mbridge.msdk.foundation.same.report.g.c(new com.mbridge.msdk.foundation.entity.n("2000062", this.f16034b.getId(), this.f16034b.getRequestId(), this.f16034b.getRequestIdNotice(), this.f16039g, z.l(com.mbridge.msdk.foundation.controller.c.m().c()), i10, str), com.mbridge.msdk.foundation.controller.c.m().c(), this.f16039g);
        }
    }

    public final void b() {
        Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.video.module.a.a.k.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    k kVar = k.this;
                    if (kVar.a && kVar.f16034b != null && an.b(kVar.f16039g) && com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                        com.mbridge.msdk.foundation.db.i a = com.mbridge.msdk.foundation.db.i.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                        com.mbridge.msdk.foundation.entity.f fVar = new com.mbridge.msdk.foundation.entity.f();
                        fVar.a(System.currentTimeMillis());
                        fVar.b(k.this.f16039g);
                        fVar.a(k.this.f16034b.getId());
                        a.a(fVar);
                    }
                } catch (Throwable th2) {
                    ad.b("NotifyListener", th2.getMessage(), th2);
                }
            }
        };
        com.mbridge.msdk.foundation.controller.d.a();
        com.mbridge.msdk.foundation.same.f.b.b().execute(runnable);
    }

    public final void a(String str) {
        try {
            if (this.f16034b != null) {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("url", this.f16034b.getVideoUrlEncode());
                dVar.a("reason", str);
                String noticeUrl = this.f16034b.getNoticeUrl();
                String clickURL = this.f16034b.getClickURL();
                if (TextUtils.isEmpty(noticeUrl)) {
                    if (!TextUtils.isEmpty(clickURL)) {
                        dVar.a("offer_url", clickURL);
                    }
                } else {
                    dVar.a("offer_url", noticeUrl);
                }
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000021", this.f16034b, dVar);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void b(String str) {
        List<CampaignEx> list;
        if (this.f16034b == null || (list = this.f16035c) == null || list.size() == 0 || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("camp_position")) {
                this.f16034b = this.f16035c.get(jSONObject.getInt("camp_position"));
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("NotifyListener", e2.getMessage());
            }
        }
    }
}
