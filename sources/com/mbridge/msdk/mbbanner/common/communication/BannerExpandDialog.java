package com.mbridge.msdk.mbbanner.common.communication;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.impl.L;
import com.google.android.gms.ads.AdError;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbsignalcommon.mraid.b;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.widget.MBAdChoice;
import com.vungle.ads.internal.presenter.q;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class BannerExpandDialog extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private final String f16337a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16338c;

    /* renamed from: d, reason: collision with root package name */
    private FrameLayout f16339d;

    /* renamed from: e, reason: collision with root package name */
    private WindVaneWebView f16340e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f16341f;

    /* renamed from: g, reason: collision with root package name */
    private String f16342g;

    /* renamed from: h, reason: collision with root package name */
    private List<CampaignEx> f16343h;

    /* renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.b.a f16344i;

    /* renamed from: j, reason: collision with root package name */
    private b f16345j;

    public BannerExpandDialog(Context context, Bundle bundle, com.mbridge.msdk.mbbanner.common.b.a aVar) {
        super(context);
        this.f16337a = "BannerExpandDialog";
        this.f16345j = new b() { // from class: com.mbridge.msdk.mbbanner.common.communication.BannerExpandDialog.5
            @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
            public final void close() {
                BannerExpandDialog.this.dismiss();
            }

            @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
            public final void expand(String str, boolean z8) {
            }

            @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
            public final CampaignEx getMraidCampaign() {
                return null;
            }

            @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
            public final void open(String str) {
                try {
                    if (BannerExpandDialog.this.f16340e != null && System.currentTimeMillis() - BannerExpandDialog.this.f16340e.lastTouchTime > com.mbridge.msdk.click.b.a.f14796c && com.mbridge.msdk.click.b.a.a((CampaignEx) BannerExpandDialog.this.f16343h.get(0), BannerExpandDialog.this.f16340e.getUrl(), com.mbridge.msdk.click.b.a.f14795a)) {
                        return;
                    }
                    ad.b("BannerExpandDialog", str);
                    if (BannerExpandDialog.this.f16343h.size() > 1) {
                        c.m().c().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        str = null;
                    }
                    if (BannerExpandDialog.this.f16344i != null) {
                        BannerExpandDialog.this.f16344i.a(true, str);
                    }
                } catch (Throwable th) {
                    ad.b("BannerExpandDialog", q.OPEN, th);
                }
            }

            @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
            public final void unload() {
                close();
            }

            @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
            public final void useCustomClose(boolean z8) {
                int i9;
                try {
                    TextView textView = BannerExpandDialog.this.f16341f;
                    if (z8) {
                        i9 = 4;
                    } else {
                        i9 = 0;
                    }
                    textView.setVisibility(i9);
                } catch (Throwable th) {
                    ad.b("BannerExpandDialog", "useCustomClose", th);
                }
            }
        };
        if (bundle != null) {
            this.b = bundle.getString("url");
            this.f16338c = bundle.getBoolean("shouldUseCustomClose");
        }
        this.f16344i = aVar;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i9;
        CampaignEx campaignEx;
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCanceledOnTouchOutside(false);
        setCancelable(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f16339d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f16340e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f16339d.addView(this.f16340e);
        TextView textView = new TextView(getContext());
        this.f16341f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f16341f.setLayoutParams(layoutParams);
        TextView textView2 = this.f16341f;
        if (this.f16338c) {
            i9 = 4;
        } else {
            i9 = 0;
        }
        textView2.setVisibility(i9);
        this.f16341f.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.mbbanner.common.communication.BannerExpandDialog.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BannerExpandDialog.this.dismiss();
            }
        });
        BitmapDrawable a6 = c.m().a(this.f16342g, 296);
        if (a6 != null) {
            ImageView imageView = new ImageView(c.m().c());
            ai.a(imageView, a6, this.f16339d.getResources().getDisplayMetrics());
            this.f16339d.addView(imageView, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f16339d.addView(this.f16341f);
        setContentView(this.f16339d);
        a();
        this.f16340e.setWebViewListener(new com.mbridge.msdk.mbsignalcommon.b.b() { // from class: com.mbridge.msdk.mbbanner.common.communication.BannerExpandDialog.2
            @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
            public final void a(WebView webView, String str) {
                super.a(webView, str);
                webView.evaluateJavascript("javascript:" + com.mbridge.msdk.c.b.a.a().b(), new ValueCallback<String>() { // from class: com.mbridge.msdk.mbbanner.common.communication.BannerExpandDialog.2.1
                    @Override // android.webkit.ValueCallback
                    public final /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                    }
                });
                BannerExpandDialog.a(BannerExpandDialog.this);
            }
        });
        this.f16340e.setObject(this.f16345j);
        this.f16340e.loadUrl(this.b);
        List<CampaignEx> list = this.f16343h;
        if (list != null && list.size() > 0 && (campaignEx = this.f16343h.get(0)) != null && campaignEx.getPrivacyButtonTemplateVisibility() != 0) {
            MBAdChoice mBAdChoice = new MBAdChoice(c.m().c());
            mBAdChoice.setCampaign(campaignEx);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(L.a(12.0f), L.a(12.0f));
            layoutParams2.gravity = 85;
            layoutParams2.bottomMargin = layoutParams.topMargin;
            layoutParams2.rightMargin = layoutParams.rightMargin;
            mBAdChoice.setFeedbackDialogEventListener(new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.mbbanner.common.communication.BannerExpandDialog.3
                @Override // com.mbridge.msdk.foundation.d.a
                public final void a() {
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void b() {
                    BannerExpandDialog.this.a();
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void a(String str) {
                    BannerExpandDialog.this.a();
                }
            });
            this.f16339d.addView(mBAdChoice, layoutParams2);
        }
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.mbridge.msdk.mbbanner.common.communication.BannerExpandDialog.4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                if (BannerExpandDialog.this.f16344i != null) {
                    BannerExpandDialog.this.f16344i.a(false);
                }
                BannerExpandDialog.this.f16340e.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
                BannerExpandDialog.this.f16339d.removeView(BannerExpandDialog.this.f16340e);
                BannerExpandDialog.this.f16340e.release();
                BannerExpandDialog.this.f16340e = null;
                BannerExpandDialog.this.f16344i = null;
            }
        });
    }

    public void setCampaignList(String str, List<CampaignEx> list) {
        this.f16342g = str;
        this.f16343h = list;
    }

    public static /* synthetic */ void a(BannerExpandDialog bannerExpandDialog) {
        String str;
        try {
            int i9 = c.m().c().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            if (i9 == 2) {
                str = "landscape";
            } else {
                str = i9 == 1 ? "portrait" : AdError.UNDEFINED_DOMAIN;
            }
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
            float i10 = z.i(c.m().c());
            float g9 = z.g(c.m().c());
            HashMap h6 = z.h(c.m().c());
            int intValue = ((Integer) h6.get("width")).intValue();
            int intValue2 = ((Integer) h6.get("height")).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put("placementType", "Interstitial");
            hashMap.put("state", "expanded");
            hashMap.put("viewable", "true");
            hashMap.put("currentAppOrientation", jSONObject);
            bannerExpandDialog.f16340e.getLocationInWindow(new int[2]);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(bannerExpandDialog.f16340e, r1[0], r1[1], r11.getWidth(), bannerExpandDialog.f16340e.getHeight());
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(bannerExpandDialog.f16340e, r1[0], r1[1], r5.getWidth(), bannerExpandDialog.f16340e.getHeight());
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(bannerExpandDialog.f16340e, i10, g9);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(bannerExpandDialog.f16340e, intValue, intValue2);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(bannerExpandDialog.f16340e, hashMap);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(bannerExpandDialog.f16340e);
        } catch (Throwable th) {
            ad.b("BannerExpandDialog", "notifyMraid", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setSystemUiVisibility(4615);
        }
    }
}
