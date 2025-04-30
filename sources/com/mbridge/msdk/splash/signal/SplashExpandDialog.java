package com.mbridge.msdk.splash.signal;

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
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.widget.MBAdChoice;
import com.vungle.ads.internal.presenter.q;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class SplashExpandDialog extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private final String f17943a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f17944c;

    /* renamed from: d, reason: collision with root package name */
    private FrameLayout f17945d;

    /* renamed from: e, reason: collision with root package name */
    private WindVaneWebView f17946e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f17947f;

    /* renamed from: g, reason: collision with root package name */
    private String f17948g;

    /* renamed from: h, reason: collision with root package name */
    private List<CampaignEx> f17949h;

    /* renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.splash.d.a f17950i;

    /* renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.mraid.b f17951j;

    public SplashExpandDialog(Context context, Bundle bundle, com.mbridge.msdk.splash.d.a aVar) {
        super(context);
        this.f17943a = "SplashExpandDialog";
        this.f17951j = new com.mbridge.msdk.mbsignalcommon.mraid.b() { // from class: com.mbridge.msdk.splash.signal.SplashExpandDialog.5
            @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
            public final void close() {
                SplashExpandDialog.this.dismiss();
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
                    if (SplashExpandDialog.this.f17946e != null && System.currentTimeMillis() - SplashExpandDialog.this.f17946e.lastTouchTime > com.mbridge.msdk.click.b.a.f14796c && com.mbridge.msdk.click.b.a.a((CampaignEx) SplashExpandDialog.this.f17949h.get(0), SplashExpandDialog.this.f17946e.getUrl(), com.mbridge.msdk.click.b.a.f14795a)) {
                        return;
                    }
                    ad.b("SplashExpandDialog", str);
                    if (SplashExpandDialog.this.f17949h.size() > 1) {
                        com.mbridge.msdk.foundation.controller.c.m().c().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        str = null;
                    }
                    if (SplashExpandDialog.this.f17950i != null) {
                        SplashExpandDialog.this.f17950i.a(true, str);
                    }
                } catch (Throwable th) {
                    ad.b("SplashExpandDialog", q.OPEN, th);
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
                    TextView textView = SplashExpandDialog.this.f17947f;
                    if (z8) {
                        i9 = 4;
                    } else {
                        i9 = 0;
                    }
                    textView.setVisibility(i9);
                } catch (Throwable th) {
                    ad.b("SplashExpandDialog", "useCustomClose", th);
                }
            }
        };
        if (bundle != null) {
            this.b = bundle.getString("url");
            this.f17944c = bundle.getBoolean("shouldUseCustomClose");
        }
        this.f17950i = aVar;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
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
        this.f17945d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f17946e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f17945d.addView(this.f17946e);
        TextView textView = new TextView(getContext());
        this.f17947f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f17947f.setLayoutParams(layoutParams);
        TextView textView2 = this.f17947f;
        if (this.f17944c) {
            i9 = 4;
        } else {
            i9 = 0;
        }
        textView2.setVisibility(i9);
        this.f17947f.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.splash.signal.SplashExpandDialog.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SplashExpandDialog.this.dismiss();
            }
        });
        this.f17945d.addView(this.f17947f);
        setContentView(this.f17945d);
        a();
        this.f17946e.setWebViewListener(new com.mbridge.msdk.mbsignalcommon.b.b() { // from class: com.mbridge.msdk.splash.signal.SplashExpandDialog.2
            @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
            public final void a(WebView webView, String str) {
                super.a(webView, str);
                webView.evaluateJavascript("javascript:" + com.mbridge.msdk.c.b.a.a().b(), new ValueCallback<String>() { // from class: com.mbridge.msdk.splash.signal.SplashExpandDialog.2.1
                    @Override // android.webkit.ValueCallback
                    public final /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                    }
                });
                SplashExpandDialog.a(SplashExpandDialog.this);
            }
        });
        this.f17946e.setObject(this.f17951j);
        this.f17946e.loadUrl(this.b);
        List<CampaignEx> list = this.f17949h;
        if (list != null && !list.isEmpty() && (campaignEx = this.f17949h.get(0)) != null && campaignEx.getPrivacyButtonTemplateVisibility() != 0) {
            MBAdChoice mBAdChoice = new MBAdChoice(com.mbridge.msdk.foundation.controller.c.m().c());
            mBAdChoice.setCampaign(campaignEx);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(L.a(12.0f), L.a(12.0f));
            layoutParams2.gravity = 85;
            layoutParams2.bottomMargin = layoutParams.topMargin;
            layoutParams2.rightMargin = layoutParams.rightMargin;
            mBAdChoice.setFeedbackDialogEventListener(new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.splash.signal.SplashExpandDialog.3
                @Override // com.mbridge.msdk.foundation.d.a
                public final void a() {
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void b() {
                    SplashExpandDialog.this.a();
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void a(String str) {
                    SplashExpandDialog.this.a();
                }
            });
            this.f17945d.addView(mBAdChoice, layoutParams2);
        }
        BitmapDrawable a6 = com.mbridge.msdk.foundation.controller.c.m().a(this.f17948g, 297);
        if (a6 != null) {
            ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.m().c());
            ai.a(imageView, a6, this.f17945d.getResources().getDisplayMetrics());
            this.f17945d.addView(imageView, new ViewGroup.LayoutParams(-1, -1));
        }
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.mbridge.msdk.splash.signal.SplashExpandDialog.4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                if (SplashExpandDialog.this.f17950i != null) {
                    SplashExpandDialog.this.f17950i.a(false);
                    SplashExpandDialog.this.f17950i.a();
                }
                SplashExpandDialog.this.f17946e.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
                SplashExpandDialog.this.f17945d.removeView(SplashExpandDialog.this.f17946e);
                SplashExpandDialog.this.f17946e.release();
                SplashExpandDialog.this.f17946e = null;
                SplashExpandDialog.this.f17950i = null;
            }
        });
    }

    public void setCampaignList(String str, List<CampaignEx> list) {
        this.f17948g = str;
        this.f17949h = list;
    }

    public static /* synthetic */ void a(SplashExpandDialog splashExpandDialog) {
        String str;
        try {
            int i9 = com.mbridge.msdk.foundation.controller.c.m().c().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            if (i9 == 2) {
                str = "landscape";
            } else {
                str = i9 == 1 ? "portrait" : AdError.UNDEFINED_DOMAIN;
            }
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
            float i10 = z.i(com.mbridge.msdk.foundation.controller.c.m().c());
            float g9 = z.g(com.mbridge.msdk.foundation.controller.c.m().c());
            HashMap h6 = z.h(com.mbridge.msdk.foundation.controller.c.m().c());
            int intValue = ((Integer) h6.get("width")).intValue();
            int intValue2 = ((Integer) h6.get("height")).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put("placementType", "Interstitial");
            hashMap.put("state", "expanded");
            hashMap.put("viewable", "true");
            hashMap.put("currentAppOrientation", jSONObject);
            splashExpandDialog.f17946e.getLocationInWindow(new int[2]);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(splashExpandDialog.f17946e, r1[0], r1[1], r11.getWidth(), splashExpandDialog.f17946e.getHeight());
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(splashExpandDialog.f17946e, r1[0], r1[1], r5.getWidth(), splashExpandDialog.f17946e.getHeight());
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(splashExpandDialog.f17946e, i10, g9);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(splashExpandDialog.f17946e, intValue, intValue2);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(splashExpandDialog.f17946e, hashMap);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(splashExpandDialog.f17946e);
        } catch (Throwable th) {
            ad.b("SplashExpandDialog", "notifyMraid", th);
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
