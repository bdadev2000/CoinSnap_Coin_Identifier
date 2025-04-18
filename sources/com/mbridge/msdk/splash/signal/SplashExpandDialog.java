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
import com.applovin.impl.mediation.ads.e;
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

/* loaded from: classes4.dex */
public class SplashExpandDialog extends Dialog {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private String f15245b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f15246c;

    /* renamed from: d, reason: collision with root package name */
    private FrameLayout f15247d;

    /* renamed from: e, reason: collision with root package name */
    private WindVaneWebView f15248e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f15249f;

    /* renamed from: g, reason: collision with root package name */
    private String f15250g;

    /* renamed from: h, reason: collision with root package name */
    private List<CampaignEx> f15251h;

    /* renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.splash.d.a f15252i;

    /* renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.mraid.b f15253j;

    public SplashExpandDialog(Context context, Bundle bundle, com.mbridge.msdk.splash.d.a aVar) {
        super(context);
        this.a = "SplashExpandDialog";
        this.f15253j = new com.mbridge.msdk.mbsignalcommon.mraid.b() { // from class: com.mbridge.msdk.splash.signal.SplashExpandDialog.5
            @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
            public final void close() {
                SplashExpandDialog.this.dismiss();
            }

            @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
            public final void expand(String str, boolean z10) {
            }

            @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
            public final CampaignEx getMraidCampaign() {
                return null;
            }

            @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
            public final void open(String str) {
                try {
                    if (SplashExpandDialog.this.f15248e != null && System.currentTimeMillis() - SplashExpandDialog.this.f15248e.lastTouchTime > com.mbridge.msdk.click.b.a.f12506c && com.mbridge.msdk.click.b.a.a((CampaignEx) SplashExpandDialog.this.f15251h.get(0), SplashExpandDialog.this.f15248e.getUrl(), com.mbridge.msdk.click.b.a.a)) {
                        return;
                    }
                    ad.b("SplashExpandDialog", str);
                    if (SplashExpandDialog.this.f15251h.size() > 1) {
                        com.mbridge.msdk.foundation.controller.c.m().c().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        str = null;
                    }
                    if (SplashExpandDialog.this.f15252i != null) {
                        SplashExpandDialog.this.f15252i.a(true, str);
                    }
                } catch (Throwable th2) {
                    ad.b("SplashExpandDialog", q.OPEN, th2);
                }
            }

            @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
            public final void unload() {
                close();
            }

            @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
            public final void useCustomClose(boolean z10) {
                int i10;
                try {
                    TextView textView = SplashExpandDialog.this.f15249f;
                    if (z10) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                    textView.setVisibility(i10);
                } catch (Throwable th2) {
                    ad.b("SplashExpandDialog", "useCustomClose", th2);
                }
            }
        };
        if (bundle != null) {
            this.f15245b = bundle.getString("url");
            this.f15246c = bundle.getBoolean("shouldUseCustomClose");
        }
        this.f15252i = aVar;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i10;
        CampaignEx campaignEx;
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCanceledOnTouchOutside(false);
        setCancelable(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f15247d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f15248e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f15247d.addView(this.f15248e);
        TextView textView = new TextView(getContext());
        this.f15249f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f15249f.setLayoutParams(layoutParams);
        TextView textView2 = this.f15249f;
        if (this.f15246c) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        textView2.setVisibility(i10);
        this.f15249f.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.splash.signal.SplashExpandDialog.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SplashExpandDialog.this.dismiss();
            }
        });
        this.f15247d.addView(this.f15249f);
        setContentView(this.f15247d);
        a();
        this.f15248e.setWebViewListener(new com.mbridge.msdk.mbsignalcommon.b.b() { // from class: com.mbridge.msdk.splash.signal.SplashExpandDialog.2
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
        this.f15248e.setObject(this.f15253j);
        this.f15248e.loadUrl(this.f15245b);
        List<CampaignEx> list = this.f15251h;
        if (list != null && !list.isEmpty() && (campaignEx = this.f15251h.get(0)) != null && campaignEx.getPrivacyButtonTemplateVisibility() != 0) {
            MBAdChoice mBAdChoice = new MBAdChoice(com.mbridge.msdk.foundation.controller.c.m().c());
            mBAdChoice.setCampaign(campaignEx);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(e.a(12.0f), e.a(12.0f));
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
            this.f15247d.addView(mBAdChoice, layoutParams2);
        }
        BitmapDrawable a = com.mbridge.msdk.foundation.controller.c.m().a(this.f15250g, 297);
        if (a != null) {
            ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.m().c());
            ai.a(imageView, a, this.f15247d.getResources().getDisplayMetrics());
            this.f15247d.addView(imageView, new ViewGroup.LayoutParams(-1, -1));
        }
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.mbridge.msdk.splash.signal.SplashExpandDialog.4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                if (SplashExpandDialog.this.f15252i != null) {
                    SplashExpandDialog.this.f15252i.a(false);
                    SplashExpandDialog.this.f15252i.a();
                }
                SplashExpandDialog.this.f15248e.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
                SplashExpandDialog.this.f15247d.removeView(SplashExpandDialog.this.f15248e);
                SplashExpandDialog.this.f15248e.release();
                SplashExpandDialog.this.f15248e = null;
                SplashExpandDialog.this.f15252i = null;
            }
        });
    }

    public void setCampaignList(String str, List<CampaignEx> list) {
        this.f15250g = str;
        this.f15251h = list;
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

    public static /* synthetic */ void a(SplashExpandDialog splashExpandDialog) {
        try {
            int i10 = com.mbridge.msdk.foundation.controller.c.m().c().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orientation", i10 == 2 ? "landscape" : i10 == 1 ? "portrait" : AdError.UNDEFINED_DOMAIN);
            jSONObject.put("locked", "true");
            float i11 = z.i(com.mbridge.msdk.foundation.controller.c.m().c());
            float g10 = z.g(com.mbridge.msdk.foundation.controller.c.m().c());
            HashMap h10 = z.h(com.mbridge.msdk.foundation.controller.c.m().c());
            int intValue = ((Integer) h10.get("width")).intValue();
            int intValue2 = ((Integer) h10.get("height")).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put("placementType", "Interstitial");
            hashMap.put("state", "expanded");
            hashMap.put("viewable", "true");
            hashMap.put("currentAppOrientation", jSONObject);
            splashExpandDialog.f15248e.getLocationInWindow(new int[2]);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(splashExpandDialog.f15248e, r1[0], r1[1], r11.getWidth(), splashExpandDialog.f15248e.getHeight());
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(splashExpandDialog.f15248e, r1[0], r1[1], r5.getWidth(), splashExpandDialog.f15248e.getHeight());
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(splashExpandDialog.f15248e, i11, g10);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(splashExpandDialog.f15248e, intValue, intValue2);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(splashExpandDialog.f15248e, hashMap);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(splashExpandDialog.f15248e);
        } catch (Throwable th2) {
            ad.b("SplashExpandDialog", "notifyMraid", th2);
        }
    }
}
