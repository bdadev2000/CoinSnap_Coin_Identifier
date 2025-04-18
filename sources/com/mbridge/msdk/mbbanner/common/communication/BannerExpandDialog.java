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
import com.applovin.impl.mediation.ads.e;
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

/* loaded from: classes4.dex */
public class BannerExpandDialog extends Dialog {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private String f13866b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13867c;

    /* renamed from: d, reason: collision with root package name */
    private FrameLayout f13868d;

    /* renamed from: e, reason: collision with root package name */
    private WindVaneWebView f13869e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f13870f;

    /* renamed from: g, reason: collision with root package name */
    private String f13871g;

    /* renamed from: h, reason: collision with root package name */
    private List<CampaignEx> f13872h;

    /* renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.b.a f13873i;

    /* renamed from: j, reason: collision with root package name */
    private b f13874j;

    public BannerExpandDialog(Context context, Bundle bundle, com.mbridge.msdk.mbbanner.common.b.a aVar) {
        super(context);
        this.a = "BannerExpandDialog";
        this.f13874j = new b() { // from class: com.mbridge.msdk.mbbanner.common.communication.BannerExpandDialog.5
            @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
            public final void close() {
                BannerExpandDialog.this.dismiss();
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
                    if (BannerExpandDialog.this.f13869e != null && System.currentTimeMillis() - BannerExpandDialog.this.f13869e.lastTouchTime > com.mbridge.msdk.click.b.a.f12506c && com.mbridge.msdk.click.b.a.a((CampaignEx) BannerExpandDialog.this.f13872h.get(0), BannerExpandDialog.this.f13869e.getUrl(), com.mbridge.msdk.click.b.a.a)) {
                        return;
                    }
                    ad.b("BannerExpandDialog", str);
                    if (BannerExpandDialog.this.f13872h.size() > 1) {
                        c.m().c().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        str = null;
                    }
                    if (BannerExpandDialog.this.f13873i != null) {
                        BannerExpandDialog.this.f13873i.a(true, str);
                    }
                } catch (Throwable th2) {
                    ad.b("BannerExpandDialog", q.OPEN, th2);
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
                    TextView textView = BannerExpandDialog.this.f13870f;
                    if (z10) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                    textView.setVisibility(i10);
                } catch (Throwable th2) {
                    ad.b("BannerExpandDialog", "useCustomClose", th2);
                }
            }
        };
        if (bundle != null) {
            this.f13866b = bundle.getString("url");
            this.f13867c = bundle.getBoolean("shouldUseCustomClose");
        }
        this.f13873i = aVar;
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
        this.f13868d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f13869e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f13868d.addView(this.f13869e);
        TextView textView = new TextView(getContext());
        this.f13870f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f13870f.setLayoutParams(layoutParams);
        TextView textView2 = this.f13870f;
        if (this.f13867c) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        textView2.setVisibility(i10);
        this.f13870f.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.mbbanner.common.communication.BannerExpandDialog.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BannerExpandDialog.this.dismiss();
            }
        });
        BitmapDrawable a = c.m().a(this.f13871g, 296);
        if (a != null) {
            ImageView imageView = new ImageView(c.m().c());
            ai.a(imageView, a, this.f13868d.getResources().getDisplayMetrics());
            this.f13868d.addView(imageView, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f13868d.addView(this.f13870f);
        setContentView(this.f13868d);
        a();
        this.f13869e.setWebViewListener(new com.mbridge.msdk.mbsignalcommon.b.b() { // from class: com.mbridge.msdk.mbbanner.common.communication.BannerExpandDialog.2
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
        this.f13869e.setObject(this.f13874j);
        this.f13869e.loadUrl(this.f13866b);
        List<CampaignEx> list = this.f13872h;
        if (list != null && list.size() > 0 && (campaignEx = this.f13872h.get(0)) != null && campaignEx.getPrivacyButtonTemplateVisibility() != 0) {
            MBAdChoice mBAdChoice = new MBAdChoice(c.m().c());
            mBAdChoice.setCampaign(campaignEx);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(e.a(12.0f), e.a(12.0f));
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
            this.f13868d.addView(mBAdChoice, layoutParams2);
        }
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.mbridge.msdk.mbbanner.common.communication.BannerExpandDialog.4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                if (BannerExpandDialog.this.f13873i != null) {
                    BannerExpandDialog.this.f13873i.a(false);
                }
                BannerExpandDialog.this.f13869e.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
                BannerExpandDialog.this.f13868d.removeView(BannerExpandDialog.this.f13869e);
                BannerExpandDialog.this.f13869e.release();
                BannerExpandDialog.this.f13869e = null;
                BannerExpandDialog.this.f13873i = null;
            }
        });
    }

    public void setCampaignList(String str, List<CampaignEx> list) {
        this.f13871g = str;
        this.f13872h = list;
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

    public static /* synthetic */ void a(BannerExpandDialog bannerExpandDialog) {
        try {
            int i10 = c.m().c().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orientation", i10 == 2 ? "landscape" : i10 == 1 ? "portrait" : AdError.UNDEFINED_DOMAIN);
            jSONObject.put("locked", "true");
            float i11 = z.i(c.m().c());
            float g10 = z.g(c.m().c());
            HashMap h10 = z.h(c.m().c());
            int intValue = ((Integer) h10.get("width")).intValue();
            int intValue2 = ((Integer) h10.get("height")).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put("placementType", "Interstitial");
            hashMap.put("state", "expanded");
            hashMap.put("viewable", "true");
            hashMap.put("currentAppOrientation", jSONObject);
            bannerExpandDialog.f13869e.getLocationInWindow(new int[2]);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(bannerExpandDialog.f13869e, r1[0], r1[1], r11.getWidth(), bannerExpandDialog.f13869e.getHeight());
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(bannerExpandDialog.f13869e, r1[0], r1[1], r5.getWidth(), bannerExpandDialog.f13869e.getHeight());
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(bannerExpandDialog.f13869e, i11, g10);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(bannerExpandDialog.f13869e, intValue, intValue2);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(bannerExpandDialog.f13869e, hashMap);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(bannerExpandDialog.f13869e);
        } catch (Throwable th2) {
            ad.b("BannerExpandDialog", "notifyMraid", th2);
        }
    }
}
