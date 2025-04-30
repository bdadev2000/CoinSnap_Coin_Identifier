package com.mbridge.msdk.video.module.a.a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes3.dex */
public class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private Activity f19011a;
    private CampaignEx b;

    public a(Activity activity, CampaignEx campaignEx) {
        this.f19011a = activity;
        this.b = campaignEx;
    }

    @Override // com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public void a(int i9, Object obj) {
        super.a(i9, obj);
        if (i9 == 106 && this.f19011a != null && this.b != null) {
            try {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                String a6 = com.mbridge.msdk.click.c.a(this.b.getClickURL(), "-999", "-999");
                if (!TextUtils.isEmpty(a6)) {
                    intent.setData(Uri.parse(a6));
                    this.f19011a.startActivity(intent);
                }
            } catch (Throwable th) {
                ad.b("NotifyListener", th.getMessage(), th);
            }
            this.f19011a.finish();
        }
    }
}
