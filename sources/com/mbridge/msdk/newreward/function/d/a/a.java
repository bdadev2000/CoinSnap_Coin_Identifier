package com.mbridge.msdk.newreward.function.d.a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.newreward.function.d.c.d;
import com.mbridge.msdk.newreward.function.d.c.f;
import com.mbridge.msdk.newreward.function.d.c.g;
import com.mbridge.msdk.newreward.function.d.c.h;
import com.mbridge.msdk.newreward.function.d.c.j;
import com.mbridge.msdk.newreward.function.d.c.k;
import com.mbridge.msdk.newreward.function.d.c.l;
import com.mbridge.msdk.newreward.function.d.c.m;
import com.mbridge.msdk.newreward.function.d.c.n;

/* loaded from: classes4.dex */
public final class a {
    private final b a;

    /* renamed from: b, reason: collision with root package name */
    private CampaignEx f14525b;

    /* renamed from: c, reason: collision with root package name */
    private String f14526c;

    /* renamed from: d, reason: collision with root package name */
    private String f14527d;

    /* renamed from: e, reason: collision with root package name */
    private String f14528e;

    /* renamed from: f, reason: collision with root package name */
    private d<?> f14529f;

    /* renamed from: g, reason: collision with root package name */
    private n f14530g;

    /* renamed from: h, reason: collision with root package name */
    private d<?> f14531h;

    /* renamed from: i, reason: collision with root package name */
    private l f14532i;

    /* renamed from: j, reason: collision with root package name */
    private h f14533j;

    /* renamed from: k, reason: collision with root package name */
    private m f14534k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f14535l = false;

    public a(b bVar) {
        this.a = bVar;
    }

    public final m a() {
        CampaignEx.c rewardTemplateMode;
        m mVar = this.f14534k;
        if (mVar != null) {
            return mVar;
        }
        CampaignEx campaignEx = this.f14525b;
        if (campaignEx == null || (rewardTemplateMode = campaignEx.getRewardTemplateMode()) == null) {
            return null;
        }
        String c10 = rewardTemplateMode.c();
        if (TextUtils.isEmpty(c10)) {
            return null;
        }
        if (this.f14534k == null) {
            this.f14534k = new m(this.a, this, c10);
        }
        return this.f14534k;
    }

    public final h b() {
        h hVar = this.f14533j;
        if (hVar != null) {
            return hVar;
        }
        CampaignEx campaignEx = this.f14525b;
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getEndScreenUrl())) {
            return null;
        }
        if (this.f14533j == null) {
            this.f14533j = new h(this.a, this);
        }
        return this.f14533j;
    }

    public final d<?> c() {
        d<?> dVar = this.f14529f;
        if (dVar != null) {
            return dVar;
        }
        CampaignEx campaignEx = this.f14525b;
        if (campaignEx == null || campaignEx.getRewardTemplateMode() == null) {
            return null;
        }
        String e2 = campaignEx.getRewardTemplateMode().e();
        if (TextUtils.isEmpty(e2)) {
            return null;
        }
        if (this.f14529f == null) {
            if (com.mbridge.msdk.newreward.function.h.a.b(e2)) {
                this.f14529f = new g(this.a, this);
            } else {
                this.f14529f = new k(this.a, this);
            }
        }
        return this.f14529f;
    }

    public final n d() {
        n nVar = this.f14530g;
        if (nVar != null) {
            return nVar;
        }
        CampaignEx campaignEx = this.f14525b;
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            return null;
        }
        if (this.f14530g == null) {
            this.f14530g = new n(this.a, this);
        }
        return this.f14530g;
    }

    public final l e() {
        l lVar = this.f14532i;
        if (lVar != null) {
            return lVar;
        }
        CampaignEx campaignEx = this.f14525b;
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getMraid())) {
            return null;
        }
        if (this.f14532i == null) {
            this.f14532i = new l(this.a, this);
        }
        return this.f14532i;
    }

    public final d<?> f() {
        d<?> dVar = this.f14531h;
        if (dVar != null) {
            return dVar;
        }
        CampaignEx campaignEx = this.f14525b;
        if (campaignEx == null) {
            return null;
        }
        String str = campaignEx.getendcard_url();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f14531h == null) {
            if (com.mbridge.msdk.newreward.function.h.a.b(str)) {
                if (ai.l(str)) {
                    this.f14531h = new j(this.a, this);
                } else {
                    this.f14531h = new f(this.a, this);
                }
            } else {
                this.f14531h = new j(this.a, this);
            }
        }
        return this.f14531h;
    }

    public final CampaignEx g() {
        return this.f14525b;
    }

    public final b h() {
        return this.a;
    }

    public final boolean i() {
        CampaignEx campaignEx = this.f14525b;
        if (campaignEx != null) {
            return campaignEx.isMraid();
        }
        return false;
    }

    public final boolean j() {
        return this.f14535l;
    }

    public final void b(String str) {
        this.f14527d = str;
    }

    public final void a(String str) {
        this.f14526c = str;
    }

    public final void a(CampaignEx campaignEx) {
        this.f14525b = campaignEx;
    }

    public final void a(boolean z10) {
        this.f14535l = z10;
    }

    public final void c(String str) {
        this.f14528e = str;
    }
}
