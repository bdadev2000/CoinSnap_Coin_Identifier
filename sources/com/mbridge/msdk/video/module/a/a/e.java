package com.mbridge.msdk.video.module.a.a;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.z;

/* loaded from: classes4.dex */
public class e implements com.mbridge.msdk.foundation.same.c.c {
    private CampaignEx a;

    /* renamed from: b, reason: collision with root package name */
    protected ImageView f16030b;

    /* renamed from: c, reason: collision with root package name */
    private String f16031c;

    public e(ImageView imageView) {
        this.f16030b = imageView;
    }

    @Override // com.mbridge.msdk.foundation.same.c.c
    public void onFailedLoad(final String str, String str2) {
        Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.video.module.a.a.e.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    com.mbridge.msdk.foundation.db.o a = com.mbridge.msdk.foundation.db.o.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                    if (e.this.a == null) {
                        ad.a("ImageLoaderListener", "campaign is null");
                        return;
                    }
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                    nVar.a("2000044");
                    nVar.a(z.l(com.mbridge.msdk.foundation.controller.c.m().c()));
                    nVar.e(e.this.a.getId());
                    nVar.p(e.this.a.getImageUrl());
                    nVar.f(e.this.a.getRequestId());
                    nVar.g(e.this.a.getRequestIdNotice());
                    nVar.c(e.this.f16031c);
                    nVar.h(str);
                    a.a(nVar);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        };
        com.mbridge.msdk.foundation.controller.d.a();
        com.mbridge.msdk.foundation.same.f.b.b().execute(runnable);
        ad.b("ImageLoaderListener", "desc:" + str);
    }

    @Override // com.mbridge.msdk.foundation.same.c.c
    public void onSuccessLoad(Bitmap bitmap, String str) {
        try {
            if (bitmap == null) {
                ad.b("ImageLoaderListener", "bitmap=null");
            } else if (this.f16030b != null && !bitmap.isRecycled()) {
                this.f16030b.setImageBitmap(bitmap);
                this.f16030b.setVisibility(0);
            }
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                th2.printStackTrace();
            }
        }
    }

    public e(ImageView imageView, CampaignEx campaignEx, String str) {
        this.f16030b = imageView;
        this.a = campaignEx;
        this.f16031c = str;
    }
}
