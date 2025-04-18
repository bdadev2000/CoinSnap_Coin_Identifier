package com.mbridge.msdk.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.c.b;
import com.mbridge.msdk.foundation.same.net.e.d;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.out.Campaign;

/* loaded from: classes4.dex */
public class MBAdChoice extends MBImageView {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private String f16456b;

    /* renamed from: c, reason: collision with root package name */
    private String f16457c;

    /* renamed from: d, reason: collision with root package name */
    private String f16458d;

    /* renamed from: e, reason: collision with root package name */
    private CampaignEx f16459e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.foundation.d.a f16460f;

    public MBAdChoice(Context context) {
        super(context);
        this.f16456b = "";
        this.f16457c = "";
        this.f16458d = "";
        this.a = context;
        a();
    }

    private void a() {
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        setClickable(true);
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f16460f == null) {
            this.f16460f = new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.widget.MBAdChoice.1
                @Override // com.mbridge.msdk.foundation.d.a
                public final void a() {
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void b() {
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void a(String str) {
                }
            };
        }
        ai.a(this.f16459e, this.f16460f, 4, "");
        return true;
    }

    public void setCampaign(Campaign campaign) {
        boolean z10;
        if (campaign instanceof CampaignEx) {
            CampaignEx campaignEx = (CampaignEx) campaign;
            this.f16459e = campaignEx;
            g d10 = e.d(h.a());
            this.f16459e = campaignEx;
            if (campaignEx != null) {
                String privacyUrl = campaignEx.getPrivacyUrl();
                this.f16457c = privacyUrl;
                if (TextUtils.isEmpty(privacyUrl)) {
                    CampaignEx.a adchoice = campaignEx.getAdchoice();
                    if (adchoice != null) {
                        this.f16457c = adchoice.c();
                    }
                    if (TextUtils.isEmpty(this.f16457c) && d10 != null) {
                        this.f16457c = d10.g();
                    }
                    if (TextUtils.isEmpty(this.f16457c)) {
                        this.f16457c = d.f().f13396f;
                    }
                }
            } else if (d10 != null) {
                this.f16457c = d10.g();
            }
            this.f16459e = campaignEx;
            if (campaignEx != null) {
                CampaignEx.a adchoice2 = campaignEx.getAdchoice();
                if (adchoice2 != null) {
                    this.f16456b = adchoice2.b();
                }
                if (TextUtils.isEmpty(this.f16456b) && d10 != null) {
                    this.f16456b = d10.f();
                }
            } else if (d10 != null) {
                this.f16456b = d10.f();
            }
            this.f16459e = campaignEx;
            if (campaignEx != null) {
                CampaignEx.a adchoice3 = campaignEx.getAdchoice();
                if (adchoice3 != null) {
                    this.f16458d = adchoice3.d();
                }
                if (TextUtils.isEmpty(this.f16458d) && d10 != null) {
                    this.f16458d = d10.h();
                }
            } else if (d10 != null) {
                this.f16458d = d10.h();
            }
            if (!TextUtils.isEmpty(this.f16456b) && !TextUtils.isEmpty(this.f16457c) && !TextUtils.isEmpty(this.f16458d)) {
                z10 = true;
            } else {
                z10 = false;
            }
            setImageUrl(this.f16456b);
            if (z10 && this.a != null) {
                b.a(c.m().c()).a(this.f16456b, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.widget.MBAdChoice.2
                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public final void onFailedLoad(String str, String str2) {
                    }

                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public final void onSuccessLoad(Bitmap bitmap, String str) {
                        MBAdChoice.this.setImageBitmap(bitmap);
                    }
                });
                return;
            }
            return;
        }
        this.f16459e = null;
    }

    public void setFeedbackDialogEventListener(com.mbridge.msdk.foundation.d.a aVar) {
        this.f16460f = aVar;
    }

    public MBAdChoice(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16456b = "";
        this.f16457c = "";
        this.f16458d = "";
        this.a = context;
        a();
    }

    public MBAdChoice(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16456b = "";
        this.f16457c = "";
        this.f16458d = "";
        this.a = context;
        a();
    }
}
