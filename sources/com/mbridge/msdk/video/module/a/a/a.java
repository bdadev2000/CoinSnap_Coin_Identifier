package com.mbridge.msdk.video.module.a.a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public class a extends f {
    private Activity a;

    /* renamed from: b, reason: collision with root package name */
    private CampaignEx f16026b;

    public a(Activity activity, CampaignEx campaignEx) {
        this.a = activity;
        this.f16026b = campaignEx;
    }

    @Override // com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public void a(int i10, Object obj) {
        super.a(i10, obj);
        if (i10 == 106 && this.a != null && this.f16026b != null) {
            try {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                String a = com.mbridge.msdk.click.c.a(this.f16026b.getClickURL(), "-999", "-999");
                if (!TextUtils.isEmpty(a)) {
                    intent.setData(Uri.parse(a));
                    this.a.startActivity(intent);
                }
            } catch (Throwable th2) {
                ad.b("NotifyListener", th2.getMessage(), th2);
            }
            this.a.finish();
        }
    }
}
