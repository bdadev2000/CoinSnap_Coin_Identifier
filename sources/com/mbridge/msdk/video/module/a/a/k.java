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

/* loaded from: classes3.dex */
public class k extends f {

    /* renamed from: a, reason: collision with root package name */
    protected boolean f19019a;
    protected CampaignEx b;

    /* renamed from: c, reason: collision with root package name */
    protected List<CampaignEx> f19020c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f19021d;

    /* renamed from: e, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.download.a f19022e;

    /* renamed from: f, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.b.c f19023f;

    /* renamed from: g, reason: collision with root package name */
    protected String f19024g;

    /* renamed from: h, reason: collision with root package name */
    protected String f19025h;

    /* renamed from: i, reason: collision with root package name */
    protected com.mbridge.msdk.video.module.a.a f19026i;

    /* renamed from: j, reason: collision with root package name */
    protected int f19027j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f19028k = false;
    private boolean l = false;
    private boolean m = false;

    public k(CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar, com.mbridge.msdk.videocommon.b.c cVar, String str, String str2, com.mbridge.msdk.video.module.a.a aVar2, int i9, boolean z8) {
        this.f19021d = false;
        this.f19026i = new f();
        this.f19027j = 1;
        if (!z8 && campaignEx != null && an.b(str2) && aVar != null && aVar2 != null) {
            this.b = campaignEx;
            this.f19025h = str;
            this.f19024g = str2;
            this.f19022e = aVar;
            this.f19023f = cVar;
            this.f19026i = aVar2;
            this.f19019a = true;
            this.f19027j = i9;
            this.f19021d = false;
            return;
        }
        if (z8 && campaignEx != null && an.b(str2) && aVar2 != null) {
            this.b = campaignEx;
            this.f19025h = str;
            this.f19024g = str2;
            this.f19022e = aVar;
            this.f19023f = cVar;
            this.f19026i = aVar2;
            this.f19019a = true;
            this.f19027j = i9;
            this.f19021d = true;
        }
    }

    public final void a(CampaignEx campaignEx) {
        this.b = campaignEx;
    }

    public final void b(int i9) {
        CampaignEx campaignEx = this.b;
        if (campaignEx != null) {
            String noticeUrl = campaignEx.getNoticeUrl();
            if (TextUtils.isEmpty(noticeUrl)) {
                return;
            }
            if (i9 == 1 || i9 == 2) {
                if (!noticeUrl.contains("endscreen_type")) {
                    StringBuilder sb = new StringBuilder(noticeUrl);
                    if (noticeUrl.contains("?")) {
                        sb.append("&endscreen_type=");
                        sb.append(i9);
                    } else {
                        sb.append("?endscreen_type=");
                        sb.append(i9);
                    }
                    noticeUrl = sb.toString();
                } else if (i9 == 2) {
                    if (noticeUrl.contains("endscreen_type=1")) {
                        noticeUrl = noticeUrl.replace("endscreen_type=1", "endscreen_type=2");
                    }
                } else if (noticeUrl.contains("endscreen_type=2")) {
                    noticeUrl = noticeUrl.replace("endscreen_type=2", "endscreen_type=1");
                }
                this.b.setNoticeUrl(noticeUrl);
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
                        if (kVar.f19019a && kVar.b != null && an.b(kVar.f19024g)) {
                            com.mbridge.msdk.videocommon.a.a a6 = com.mbridge.msdk.videocommon.a.a.a();
                            k kVar2 = k.this;
                            a6.a(kVar2.b, kVar2.f19024g);
                        }
                    } catch (Exception e4) {
                        if (MBridgeConstans.DEBUG) {
                            e4.printStackTrace();
                        }
                    }
                    try {
                        com.mbridge.msdk.videocommon.a.a a9 = com.mbridge.msdk.videocommon.a.a.a();
                        k kVar3 = k.this;
                        a9.c(kVar3.f19025h, kVar3.b.getAdType());
                    } catch (Exception e9) {
                        if (MBridgeConstans.DEBUG) {
                            e9.printStackTrace();
                        }
                    } catch (Throwable th) {
                        ad.a("NotifyListener", th.getMessage());
                    }
                }
            };
            com.mbridge.msdk.foundation.controller.d.a();
            com.mbridge.msdk.foundation.same.f.b.b().execute(runnable);
        } catch (Throwable th) {
            ad.b("NotifyListener", th.getMessage(), th);
        }
    }

    public final void d() {
        com.mbridge.msdk.videocommon.download.a aVar = this.f19022e;
        if (aVar != null) {
            aVar.f(true);
        }
    }

    public final void e() {
        CampaignEx campaignEx;
        Map<String, Long> map;
        String str;
        try {
            CampaignEx campaignEx2 = this.b;
            if (campaignEx2 != null && campaignEx2.isDynamicView() && this.f19021d && !this.b.isCampaignIsFiltered()) {
                this.l = true;
                return;
            }
            if (this.f19019a && (campaignEx = this.b) != null && !TextUtils.isEmpty(campaignEx.getOnlyImpressionURL()) && (map = com.mbridge.msdk.foundation.same.a.b.f15710k) != null && !map.containsKey(this.b.getOnlyImpressionURL()) && !this.l) {
                com.mbridge.msdk.foundation.same.a.b.f15710k.put(this.b.getOnlyImpressionURL(), Long.valueOf(System.currentTimeMillis()));
                String onlyImpressionURL = this.b.getOnlyImpressionURL();
                if (this.b.getSpareOfferFlag() == 1) {
                    str = onlyImpressionURL + "&to=1&cbt=" + this.b.getCbt() + "&tmorl=" + this.f19027j;
                } else {
                    str = onlyImpressionURL + "&to=0&cbt=" + this.b.getCbt() + "&tmorl=" + this.f19027j;
                }
                String str2 = str;
                if (!this.f19021d || this.b.isCampaignIsFiltered()) {
                    com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.b, this.f19024g, str2, false, true, com.mbridge.msdk.click.a.a.f14772h);
                    c();
                }
                this.l = true;
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public final void f() {
        String str;
        try {
            if (this.f19019a && !this.f19028k && !TextUtils.isEmpty(this.b.getImpressionURL())) {
                this.f19028k = true;
                if (this.b.isBidCampaign() && this.b != null) {
                    try {
                        HashMap hashMap = new HashMap();
                        List<com.mbridge.msdk.foundation.entity.d> a6 = com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(this.b.getCampaignUnitId(), this.b.getRequestId());
                        if (a6 != null && a6.size() > 0 && a6.get(0) != null) {
                            if (a6.get(0).c() == 1) {
                                hashMap.put("encrypt_p=", "encrypt_p=" + a6.get(0).b());
                                hashMap.put("irlfa=", "irlfa=1");
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    String str2 = (String) entry.getKey();
                                    String str3 = (String) entry.getValue();
                                    CampaignEx campaignEx = this.b;
                                    campaignEx.setImpressionURL(campaignEx.getImpressionURL().replaceAll(str2, str3));
                                    CampaignEx campaignEx2 = this.b;
                                    campaignEx2.setOnlyImpressionURL(campaignEx2.getOnlyImpressionURL().replaceAll(str2, str3));
                                }
                            }
                            ad.a("BidReplaceCampignDao", "removeReplace count " + com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(this.b.getRequestId()));
                        }
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                }
                String impressionURL = this.b.getImpressionURL();
                if (this.b.getSpareOfferFlag() == 1) {
                    str = impressionURL + "&to=1&cbt=" + this.b.getCbt() + "&tmorl=" + this.f19027j;
                } else {
                    str = impressionURL + "&to=0&cbt=" + this.b.getCbt() + "&tmorl=" + this.f19027j;
                }
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.b, this.f19024g, str, false, true, com.mbridge.msdk.click.a.a.f14771g);
                com.mbridge.msdk.video.module.b.b.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.b);
                new Thread(new Runnable() { // from class: com.mbridge.msdk.video.module.a.a.k.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c())).a(k.this.b.getId());
                        } catch (Throwable th) {
                            ad.b("NotifyListener", th.getMessage(), th);
                        }
                    }
                }).start();
                if (this.f19019a && com.mbridge.msdk.foundation.same.a.b.f15709j != null && !TextUtils.isEmpty(this.b.getId())) {
                    com.mbridge.msdk.foundation.same.a.b.a(this.f19024g, this.b, "reward");
                }
            }
        } catch (Throwable th) {
            ad.b("NotifyListener", th.getMessage(), th);
        }
    }

    public final void g() {
        CampaignEx campaignEx;
        List<String> pv_urls;
        try {
            if (this.f19019a && !this.m && (campaignEx = this.b) != null) {
                this.m = true;
                if ((!campaignEx.isDynamicView() || !this.f19021d || this.b.isCampaignIsFiltered()) && (pv_urls = this.b.getPv_urls()) != null && pv_urls.size() > 0) {
                    Iterator<String> it = pv_urls.iterator();
                    while (it.hasNext()) {
                        com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.b, this.f19024g, it.next(), false, true);
                    }
                }
            }
        } catch (Throwable th) {
            ad.b("NotifyListener", th.getMessage());
        }
    }

    public final void h() {
        CampaignEx campaignEx = this.b;
        if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getCampaignUnitId()) && this.b.getNativeVideoTracking() != null && this.b.getNativeVideoTracking().o() != null) {
            Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
            CampaignEx campaignEx2 = this.b;
            com.mbridge.msdk.click.a.a(c9, campaignEx2, campaignEx2.getCampaignUnitId(), this.b.getNativeVideoTracking().o(), false, false);
        }
    }

    public final void a(List<CampaignEx> list) {
        this.f19020c = list;
    }

    @Override // com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public void a(int i9, Object obj) {
        super.a(i9, obj);
        this.f19026i.a(i9, obj);
    }

    public final void a(int i9) {
        if (this.b != null) {
            if (i9 == 1 || i9 == 2) {
                com.mbridge.msdk.video.module.b.b.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.b, i9, this.f19027j);
            }
        }
    }

    public final void a() {
        if (!this.f19019a || this.b == null) {
            return;
        }
        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000061", this.b.getId(), this.b.getRequestId(), this.b.getRequestIdNotice(), this.f19024g, z.l(com.mbridge.msdk.foundation.controller.c.m().c()));
        nVar.d(this.b.isMraid() ? com.mbridge.msdk.foundation.entity.n.f15616a : com.mbridge.msdk.foundation.entity.n.b);
        com.mbridge.msdk.foundation.same.report.g.b(nVar, com.mbridge.msdk.foundation.controller.c.m().c(), this.f19024g);
    }

    public final void a(int i9, String str) {
        if (this.b != null) {
            com.mbridge.msdk.foundation.same.report.g.c(new com.mbridge.msdk.foundation.entity.n("2000062", this.b.getId(), this.b.getRequestId(), this.b.getRequestIdNotice(), this.f19024g, z.l(com.mbridge.msdk.foundation.controller.c.m().c()), i9, str), com.mbridge.msdk.foundation.controller.c.m().c(), this.f19024g);
        }
    }

    public final void a(String str) {
        try {
            if (this.b != null) {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("url", this.b.getVideoUrlEncode());
                dVar.a("reason", str);
                String noticeUrl = this.b.getNoticeUrl();
                String clickURL = this.b.getClickURL();
                if (TextUtils.isEmpty(noticeUrl)) {
                    if (!TextUtils.isEmpty(clickURL)) {
                        dVar.a("offer_url", clickURL);
                    }
                } else {
                    dVar.a("offer_url", noticeUrl);
                }
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000021", this.b, dVar);
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public final void b() {
        Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.video.module.a.a.k.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    k kVar = k.this;
                    if (kVar.f19019a && kVar.b != null && an.b(kVar.f19024g) && com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                        com.mbridge.msdk.foundation.db.i a6 = com.mbridge.msdk.foundation.db.i.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                        com.mbridge.msdk.foundation.entity.f fVar = new com.mbridge.msdk.foundation.entity.f();
                        fVar.a(System.currentTimeMillis());
                        fVar.b(k.this.f19024g);
                        fVar.a(k.this.b.getId());
                        a6.a(fVar);
                    }
                } catch (Throwable th) {
                    ad.b("NotifyListener", th.getMessage(), th);
                }
            }
        };
        com.mbridge.msdk.foundation.controller.d.a();
        com.mbridge.msdk.foundation.same.f.b.b().execute(runnable);
    }

    public final void b(String str) {
        List<CampaignEx> list;
        if (this.b == null || (list = this.f19020c) == null || list.size() == 0 || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("camp_position")) {
                this.b = this.f19020c.get(jSONObject.getInt("camp_position"));
            }
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("NotifyListener", e4.getMessage());
            }
        }
    }
}
