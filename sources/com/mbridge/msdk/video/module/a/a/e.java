package com.mbridge.msdk.video.module.a.a;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.z;

/* loaded from: classes3.dex */
public class e implements com.mbridge.msdk.foundation.same.c.c {

    /* renamed from: a, reason: collision with root package name */
    private CampaignEx f19014a;
    protected ImageView b;

    /* renamed from: c, reason: collision with root package name */
    private String f19015c;

    public e(ImageView imageView) {
        this.b = imageView;
    }

    @Override // com.mbridge.msdk.foundation.same.c.c
    public void onFailedLoad(final String str, String str2) {
        Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.video.module.a.a.e.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    com.mbridge.msdk.foundation.db.o a6 = com.mbridge.msdk.foundation.db.o.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                    if (e.this.f19014a == null) {
                        ad.a("ImageLoaderListener", "campaign is null");
                        return;
                    }
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                    nVar.a("2000044");
                    nVar.a(z.l(com.mbridge.msdk.foundation.controller.c.m().c()));
                    nVar.e(e.this.f19014a.getId());
                    nVar.p(e.this.f19014a.getImageUrl());
                    nVar.f(e.this.f19014a.getRequestId());
                    nVar.g(e.this.f19014a.getRequestIdNotice());
                    nVar.c(e.this.f19015c);
                    nVar.h(str);
                    a6.a(nVar);
                } catch (Exception e4) {
                    e4.printStackTrace();
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
            } else if (this.b != null && !bitmap.isRecycled()) {
                this.b.setImageBitmap(bitmap);
                this.b.setVisibility(0);
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }

    public e(ImageView imageView, CampaignEx campaignEx, String str) {
        this.b = imageView;
        this.f19014a = campaignEx;
        this.f19015c = str;
    }
}
