package com.mbridge.msdk.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.applovin.impl.L;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.c.b;
import com.mbridge.msdk.foundation.same.net.e.d;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.out.Campaign;

/* loaded from: classes3.dex */
public class MBAdChoice extends MBImageView {

    /* renamed from: a, reason: collision with root package name */
    private final Context f19490a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f19491c;

    /* renamed from: d, reason: collision with root package name */
    private String f19492d;

    /* renamed from: e, reason: collision with root package name */
    private CampaignEx f19493e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.foundation.d.a f19494f;

    public MBAdChoice(Context context) {
        super(context);
        this.b = "";
        this.f19491c = "";
        this.f19492d = "";
        this.f19490a = context;
        a();
    }

    private void a() {
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        setClickable(true);
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f19494f == null) {
            this.f19494f = new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.widget.MBAdChoice.1
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
        ai.a(this.f19493e, this.f19494f, 4, "");
        return true;
    }

    public void setCampaign(Campaign campaign) {
        boolean z8;
        if (campaign instanceof CampaignEx) {
            CampaignEx campaignEx = (CampaignEx) campaign;
            this.f19493e = campaignEx;
            g f9 = L.f(h.a());
            this.f19493e = campaignEx;
            if (campaignEx != null) {
                String privacyUrl = campaignEx.getPrivacyUrl();
                this.f19491c = privacyUrl;
                if (TextUtils.isEmpty(privacyUrl)) {
                    CampaignEx.a adchoice = campaignEx.getAdchoice();
                    if (adchoice != null) {
                        this.f19491c = adchoice.c();
                    }
                    if (TextUtils.isEmpty(this.f19491c) && f9 != null) {
                        this.f19491c = f9.g();
                    }
                    if (TextUtils.isEmpty(this.f19491c)) {
                        this.f19491c = d.f().f15830f;
                    }
                }
            } else if (f9 != null) {
                this.f19491c = f9.g();
            }
            this.f19493e = campaignEx;
            if (campaignEx != null) {
                CampaignEx.a adchoice2 = campaignEx.getAdchoice();
                if (adchoice2 != null) {
                    this.b = adchoice2.b();
                }
                if (TextUtils.isEmpty(this.b) && f9 != null) {
                    this.b = f9.f();
                }
            } else if (f9 != null) {
                this.b = f9.f();
            }
            this.f19493e = campaignEx;
            if (campaignEx != null) {
                CampaignEx.a adchoice3 = campaignEx.getAdchoice();
                if (adchoice3 != null) {
                    this.f19492d = adchoice3.d();
                }
                if (TextUtils.isEmpty(this.f19492d) && f9 != null) {
                    this.f19492d = f9.h();
                }
            } else if (f9 != null) {
                this.f19492d = f9.h();
            }
            if (!TextUtils.isEmpty(this.b) && !TextUtils.isEmpty(this.f19491c) && !TextUtils.isEmpty(this.f19492d)) {
                z8 = true;
            } else {
                z8 = false;
            }
            setImageUrl(this.b);
            if (z8 && this.f19490a != null) {
                b.a(c.m().c()).a(this.b, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.widget.MBAdChoice.2
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
        this.f19493e = null;
    }

    public void setFeedbackDialogEventListener(com.mbridge.msdk.foundation.d.a aVar) {
        this.f19494f = aVar;
    }

    public MBAdChoice(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = "";
        this.f19491c = "";
        this.f19492d = "";
        this.f19490a = context;
        a();
    }

    public MBAdChoice(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.b = "";
        this.f19491c = "";
        this.f19492d = "";
        this.f19490a = context;
        a();
    }
}
