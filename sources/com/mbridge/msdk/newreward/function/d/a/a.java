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

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final b f17155a;
    private CampaignEx b;

    /* renamed from: c, reason: collision with root package name */
    private String f17156c;

    /* renamed from: d, reason: collision with root package name */
    private String f17157d;

    /* renamed from: e, reason: collision with root package name */
    private String f17158e;

    /* renamed from: f, reason: collision with root package name */
    private d<?> f17159f;

    /* renamed from: g, reason: collision with root package name */
    private n f17160g;

    /* renamed from: h, reason: collision with root package name */
    private d<?> f17161h;

    /* renamed from: i, reason: collision with root package name */
    private l f17162i;

    /* renamed from: j, reason: collision with root package name */
    private h f17163j;

    /* renamed from: k, reason: collision with root package name */
    private m f17164k;
    private boolean l = false;

    public a(b bVar) {
        this.f17155a = bVar;
    }

    public final m a() {
        CampaignEx.c rewardTemplateMode;
        m mVar = this.f17164k;
        if (mVar != null) {
            return mVar;
        }
        CampaignEx campaignEx = this.b;
        if (campaignEx == null || (rewardTemplateMode = campaignEx.getRewardTemplateMode()) == null) {
            return null;
        }
        String c9 = rewardTemplateMode.c();
        if (TextUtils.isEmpty(c9)) {
            return null;
        }
        if (this.f17164k == null) {
            this.f17164k = new m(this.f17155a, this, c9);
        }
        return this.f17164k;
    }

    public final h b() {
        h hVar = this.f17163j;
        if (hVar != null) {
            return hVar;
        }
        CampaignEx campaignEx = this.b;
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getEndScreenUrl())) {
            return null;
        }
        if (this.f17163j == null) {
            this.f17163j = new h(this.f17155a, this);
        }
        return this.f17163j;
    }

    public final d<?> c() {
        d<?> dVar = this.f17159f;
        if (dVar != null) {
            return dVar;
        }
        CampaignEx campaignEx = this.b;
        if (campaignEx == null || campaignEx.getRewardTemplateMode() == null) {
            return null;
        }
        String e4 = campaignEx.getRewardTemplateMode().e();
        if (TextUtils.isEmpty(e4)) {
            return null;
        }
        if (this.f17159f == null) {
            if (com.mbridge.msdk.newreward.function.h.a.b(e4)) {
                this.f17159f = new g(this.f17155a, this);
            } else {
                this.f17159f = new k(this.f17155a, this);
            }
        }
        return this.f17159f;
    }

    public final n d() {
        n nVar = this.f17160g;
        if (nVar != null) {
            return nVar;
        }
        CampaignEx campaignEx = this.b;
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            return null;
        }
        if (this.f17160g == null) {
            this.f17160g = new n(this.f17155a, this);
        }
        return this.f17160g;
    }

    public final l e() {
        l lVar = this.f17162i;
        if (lVar != null) {
            return lVar;
        }
        CampaignEx campaignEx = this.b;
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getMraid())) {
            return null;
        }
        if (this.f17162i == null) {
            this.f17162i = new l(this.f17155a, this);
        }
        return this.f17162i;
    }

    public final d<?> f() {
        d<?> dVar = this.f17161h;
        if (dVar != null) {
            return dVar;
        }
        CampaignEx campaignEx = this.b;
        if (campaignEx == null) {
            return null;
        }
        String str = campaignEx.getendcard_url();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f17161h == null) {
            if (com.mbridge.msdk.newreward.function.h.a.b(str)) {
                if (ai.l(str)) {
                    this.f17161h = new j(this.f17155a, this);
                } else {
                    this.f17161h = new f(this.f17155a, this);
                }
            } else {
                this.f17161h = new j(this.f17155a, this);
            }
        }
        return this.f17161h;
    }

    public final CampaignEx g() {
        return this.b;
    }

    public final b h() {
        return this.f17155a;
    }

    public final boolean i() {
        CampaignEx campaignEx = this.b;
        if (campaignEx != null) {
            return campaignEx.isMraid();
        }
        return false;
    }

    public final boolean j() {
        return this.l;
    }

    public final void b(String str) {
        this.f17157d = str;
    }

    public final void a(String str) {
        this.f17156c = str;
    }

    public final void a(CampaignEx campaignEx) {
        this.b = campaignEx;
    }

    public final void a(boolean z8) {
        this.l = z8;
    }

    public final void c(String str) {
        this.f17158e = str;
    }
}
