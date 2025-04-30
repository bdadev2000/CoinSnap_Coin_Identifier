package com.mbridge.msdk.click;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes3.dex */
public final class d extends e {

    /* renamed from: d, reason: collision with root package name */
    private int f14803d;

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.e.b f14806g;

    /* renamed from: h, reason: collision with root package name */
    private n f14807h;

    /* renamed from: a, reason: collision with root package name */
    JumpLoaderResult f14801a = null;
    private int b = 0;

    /* renamed from: c, reason: collision with root package name */
    private String f14802c = null;

    /* renamed from: e, reason: collision with root package name */
    private f f14804e = null;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14805f = true;

    /* renamed from: i, reason: collision with root package name */
    private Handler f14808i = new Handler(Looper.getMainLooper());

    public d(Context context) {
        this.f14806g = new com.mbridge.msdk.foundation.same.e.b(context);
        this.f14807h = new n(context);
    }

    public final void a(String str, CampaignEx campaignEx, f fVar, String str2, boolean z8, boolean z9, int i9) {
        String str3;
        this.f14802c = str2;
        this.f14804e = fVar;
        this.f14801a = null;
        this.f14803d = i9;
        if (campaignEx != null) {
            r1 = CampaignEx.CLICKMODE_ON.equals(campaignEx.getClick_mode()) || "6".equals(campaignEx.getClick_mode());
            str3 = campaignEx.getId();
        } else {
            str3 = "";
        }
        this.f14807h.a(str2, fVar, r1, str3, str, campaignEx, z8, z9, i9);
    }

    public final void a(String str, CampaignEx campaignEx, f fVar) {
        this.f14802c = new String(campaignEx.getClickURL());
        this.f14804e = fVar;
        this.f14801a = null;
        this.f14807h.a(campaignEx.getClickURL(), fVar, CampaignEx.CLICKMODE_ON.equals(campaignEx.getClick_mode()) || "6".equals(campaignEx.getClick_mode()), campaignEx.getId(), str, campaignEx, true, false, com.mbridge.msdk.click.a.a.f14774j);
    }

    @Override // com.mbridge.msdk.click.e
    public final void a() {
        this.f14805f = false;
    }
}
