package com.mbridge.msdk.click;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes4.dex */
public final class d extends e {

    /* renamed from: d, reason: collision with root package name */
    private int f12512d;

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.e.b f12515g;

    /* renamed from: h, reason: collision with root package name */
    private n f12516h;
    JumpLoaderResult a = null;

    /* renamed from: b, reason: collision with root package name */
    private int f12510b = 0;

    /* renamed from: c, reason: collision with root package name */
    private String f12511c = null;

    /* renamed from: e, reason: collision with root package name */
    private f f12513e = null;

    /* renamed from: f, reason: collision with root package name */
    private boolean f12514f = true;

    /* renamed from: i, reason: collision with root package name */
    private Handler f12517i = new Handler(Looper.getMainLooper());

    public d(Context context) {
        this.f12515g = new com.mbridge.msdk.foundation.same.e.b(context);
        this.f12516h = new n(context);
    }

    public final void a(String str, CampaignEx campaignEx, f fVar, String str2, boolean z10, boolean z11, int i10) {
        String str3;
        this.f12511c = str2;
        this.f12513e = fVar;
        this.a = null;
        this.f12512d = i10;
        if (campaignEx != null) {
            r1 = CampaignEx.CLICKMODE_ON.equals(campaignEx.getClick_mode()) || "6".equals(campaignEx.getClick_mode());
            str3 = campaignEx.getId();
        } else {
            str3 = "";
        }
        this.f12516h.a(str2, fVar, r1, str3, str, campaignEx, z10, z11, i10);
    }

    public final void a(String str, CampaignEx campaignEx, f fVar) {
        this.f12511c = new String(campaignEx.getClickURL());
        this.f12513e = fVar;
        this.a = null;
        this.f12516h.a(campaignEx.getClickURL(), fVar, CampaignEx.CLICKMODE_ON.equals(campaignEx.getClick_mode()) || "6".equals(campaignEx.getClick_mode()), campaignEx.getId(), str, campaignEx, true, false, com.mbridge.msdk.click.a.a.f12483j);
    }

    @Override // com.mbridge.msdk.click.e
    public final void a() {
        this.f12514f = false;
    }
}
