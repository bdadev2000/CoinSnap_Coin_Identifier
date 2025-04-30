package com.mbridge.msdk.mbbanner.common.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.L;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbbanner.common.b.f;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.mbbanner.view.MBBannerWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.widget.MBAdChoice;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: B, reason: collision with root package name */
    private float f16295B;

    /* renamed from: C, reason: collision with root package name */
    private float f16296C;

    /* renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.mbbanner.common.b.c f16300a;
    protected CampaignEx b;

    /* renamed from: c, reason: collision with root package name */
    protected final MBBannerView f16301c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f16302d;

    /* renamed from: e, reason: collision with root package name */
    protected final String f16303e;

    /* renamed from: f, reason: collision with root package name */
    com.mbridge.msdk.click.a f16304f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16305g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f16306h;

    /* renamed from: i, reason: collision with root package name */
    private MBBannerWebView f16307i;

    /* renamed from: j, reason: collision with root package name */
    private ImageView f16308j;

    /* renamed from: k, reason: collision with root package name */
    private ImageView f16309k;
    private boolean l;
    private boolean m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f16310n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f16311o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f16312p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f16313q;

    /* renamed from: r, reason: collision with root package name */
    private final String f16314r;

    /* renamed from: s, reason: collision with root package name */
    private List<CampaignEx> f16315s;

    /* renamed from: u, reason: collision with root package name */
    private int f16317u;

    /* renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.communication.a f16319w;

    /* renamed from: x, reason: collision with root package name */
    private O5.b f16320x;

    /* renamed from: y, reason: collision with root package name */
    private O5.a f16321y;

    /* renamed from: t, reason: collision with root package name */
    private int f16316t = 1;

    /* renamed from: v, reason: collision with root package name */
    private final long f16318v = 15000;

    /* renamed from: z, reason: collision with root package name */
    private final Handler f16322z = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.mbbanner.common.c.d.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                try {
                    if (d.this.f16320x != null) {
                        d dVar = d.this;
                        dVar.f16321y = O5.a.a(dVar.f16320x);
                        if (d.this.f16321y != null) {
                            d.this.f16321y.c();
                            d.this.f16321y.b();
                        }
                    }
                } catch (Throwable th) {
                    ad.a("BannerShowManager", th.getMessage());
                }
            }
        }
    };

    /* renamed from: A, reason: collision with root package name */
    private final com.mbridge.msdk.foundation.same.e.a f16294A = new com.mbridge.msdk.foundation.same.e.a() { // from class: com.mbridge.msdk.mbbanner.common.c.d.6
        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void pauseTask(boolean z8) {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void runTask() {
            d.this.a("banner render failed because render is timeout");
        }
    };

    /* renamed from: D, reason: collision with root package name */
    private final View.OnClickListener f16297D = new View.OnClickListener() { // from class: com.mbridge.msdk.mbbanner.common.c.d.7
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            d dVar = d.this;
            if (dVar.f16302d) {
                d.c(dVar);
            }
        }
    };

    /* renamed from: E, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.b.a f16298E = new com.mbridge.msdk.mbbanner.common.b.a() { // from class: com.mbridge.msdk.mbbanner.common.c.d.8
        @Override // com.mbridge.msdk.mbbanner.common.b.a
        public final void a(int i9) {
            if (i9 == 2) {
                d.d(d.this);
            } else {
                d.this.f();
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.a
        public final void b(int i9) {
            if (i9 == 1) {
                d.this.d();
                d.this.a("", 1);
            } else {
                d.this.c();
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.a
        public final void a(String str) {
            d.c(d.this);
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.a
        public final void a() {
            d.c(d.this);
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.a
        public final void a(CampaignEx campaignEx) {
            d.this.a(campaignEx, false, "");
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.a
        public final void a(boolean z8) {
            d dVar = d.this;
            if (dVar.f16300a != null) {
                dVar.f16313q = z8;
                if (z8) {
                    d.this.f16300a.c();
                } else {
                    d.this.f16300a.d();
                }
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.a
        public final void a(boolean z8, String str) {
            try {
                if (d.this.f16300a != null) {
                    if (TextUtils.isEmpty(str)) {
                        d.this.f16300a.a();
                        d.this.f16300a.b();
                    } else {
                        CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(CampaignEx.campaignToJsonObject(d.this.b));
                        parseCampaignWithBackData.setClickURL(str);
                        d.this.a(parseCampaignWithBackData, z8, str);
                    }
                }
            } catch (Exception e4) {
                ad.b("BannerShowManager", e4.getMessage());
            }
        }
    };

    /* renamed from: F, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.b.b f16299F = new com.mbridge.msdk.mbsignalcommon.b.b() { // from class: com.mbridge.msdk.mbbanner.common.c.d.4
        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, String str) {
            d.this.f16310n = true;
            ad.b("BannerCallJS", "fireOnJSBridgeConnected");
            g.a().a(webView);
            d.this.f16312p = true;
            CampaignEx campaignEx = d.this.b;
            if (campaignEx == null || campaignEx.isHasMBTplMark()) {
                return;
            }
            d.this.d();
            d.this.a("", 1);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, int i9, String str, String str2) {
            d.this.a(str);
            d.this.a(str, 2);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView) {
            d.this.c();
        }
    };

    public d(MBBannerView mBBannerView, com.mbridge.msdk.mbbanner.common.b.c cVar, String str, String str2, boolean z8, k kVar) {
        this.f16305g = z8;
        this.f16301c = mBBannerView;
        this.f16303e = str2;
        this.f16314r = str;
        this.f16300a = new f(cVar, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d() {
        /*
            Method dump skipped, instructions count: 1068
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbbanner.common.c.d.d():void");
    }

    public static /* synthetic */ void m(d dVar) {
        if (dVar.f16306h != null) {
            MBBannerWebView mBBannerWebView = dVar.f16307i;
            if (mBBannerWebView != null) {
                mBBannerWebView.setVisibility(8);
            }
            if (dVar.f16306h.getVisibility() != 0) {
                dVar.f16306h.setVisibility(0);
            }
            if (dVar.f16301c != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(10);
                dVar.f16306h.setScaleType(ImageView.ScaleType.FIT_XY);
                if (dVar.f16306h.getParent() == null) {
                    dVar.f16301c.addView(dVar.f16306h, layoutParams);
                }
                dVar.d(true);
            }
        }
    }

    public void a(CampaignEx campaignEx, boolean z8, String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.f16301c != null) {
            MBBannerWebView mBBannerWebView = this.f16307i;
            if (mBBannerWebView != null && mBBannerWebView.getParent() != null) {
                this.f16301c.removeView(this.f16307i);
            }
            if (this.f16306h == null) {
                ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.m().c());
                this.f16306h = imageView;
                imageView.setOnTouchListener(new View.OnTouchListener() { // from class: com.mbridge.msdk.mbbanner.common.c.d.10
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        d.this.f16295B = motionEvent.getRawX();
                        d.this.f16296C = motionEvent.getRawY();
                        ad.b("BannerShowManager", d.this.f16295B + "  " + d.this.f16296C);
                        return false;
                    }
                });
                this.f16306h.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.mbbanner.common.c.d.11
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        d.this.a(BannerUtils.managerCampaignEX(com.mbridge.msdk.mbsignalcommon.communication.d.a(d.this.f16295B, d.this.f16296C), d.this.b), false, "");
                    }
                });
            }
            String imageUrl = this.b.getImageUrl();
            if (!TextUtils.isEmpty(imageUrl)) {
                com.mbridge.msdk.foundation.same.c.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(imageUrl, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.mbbanner.common.c.d.12
                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public final void onFailedLoad(String str, String str2) {
                        d.this.a("banner show failed because banner default view is exception");
                    }

                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public final void onSuccessLoad(Bitmap bitmap, String str) {
                        if (d.this.f16306h != null) {
                            d.this.f16306h.setImageBitmap(bitmap);
                        }
                        d.this.f16310n = true;
                        d.m(d.this);
                        d.this.f();
                        d.this.g();
                        d dVar = d.this;
                        if (!dVar.f16302d) {
                            dVar.d();
                        }
                    }
                });
                return;
            } else {
                a("banner show failed because campain is exception");
                return;
            }
        }
        a("banner show failed because banner view is exception");
    }

    private synchronized boolean e() {
        boolean isReport;
        isReport = this.b.isReport();
        if (!isReport) {
            this.b.setReport(true);
        }
        return isReport;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        ImageView imageView;
        if (!this.f16305g || (imageView = this.f16308j) == null) {
            return;
        }
        if (imageView.getVisibility() != 0) {
            this.f16308j.setVisibility(0);
            this.f16308j.setOnClickListener(this.f16297D);
        }
        if (this.f16308j.getParent() != null || this.f16301c == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(L.a(12.0f), L.a(12.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        this.f16301c.addView(this.f16308j, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f16301c == null) {
            return;
        }
        CampaignEx campaignEx = this.b;
        if (campaignEx == null || campaignEx.getPrivacyButtonTemplateVisibility() == 1) {
            MBAdChoice mBAdChoice = new MBAdChoice(com.mbridge.msdk.foundation.controller.c.m().c());
            mBAdChoice.setCampaign(this.b);
            mBAdChoice.setFeedbackDialogEventListener(new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.mbbanner.common.c.d.2
                @Override // com.mbridge.msdk.foundation.d.a
                public final void a() {
                    String str;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                            jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
                        }
                        str = jSONObject.toString();
                    } catch (Throwable th) {
                        ad.b("BannerShowManager", th.getMessage(), th);
                        str = "";
                    }
                    g.a().a((WebView) d.this.f16307i, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void b() {
                    String str;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                            jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                        }
                        str = jSONObject.toString();
                    } catch (Throwable th) {
                        ad.b("BannerShowManager", th.getMessage(), th);
                        str = "";
                    }
                    g.a().a((WebView) d.this.f16307i, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void a(String str) {
                    String str2;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                            jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
                        }
                        str2 = jSONObject.toString();
                    } catch (Throwable th) {
                        ad.b("BannerShowManager", th.getMessage(), th);
                        str2 = "";
                    }
                    g.a().a((WebView) d.this.f16307i, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
                }
            });
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(L.a(6.0f), L.a(6.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            this.f16301c.addView(mBAdChoice, layoutParams);
        }
    }

    private void h() {
        O5.b bVar = this.f16320x;
        if (bVar != null) {
            bVar.c();
            this.f16320x = null;
            ad.a("omsdk", " adSession.finish() ");
        }
    }

    private boolean b() {
        String a6 = a(this.b);
        if (TextUtils.isEmpty(a6)) {
            return false;
        }
        if (this.f16301c != null) {
            if (this.f16307i == null) {
                try {
                    MBBannerWebView mBBannerWebView = new MBBannerWebView(com.mbridge.msdk.foundation.controller.c.m().c());
                    this.f16307i = mBBannerWebView;
                    mBBannerWebView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                    this.f16307i.setWebViewClient(new com.mbridge.msdk.mbbanner.view.a(this.f16303e, this.f16315s, this.f16298E));
                } catch (Throwable unused) {
                    a("banner show failed because WebView is not available and try to show default", 1);
                    return false;
                }
            }
            ImageView imageView = this.f16306h;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (this.f16307i.getVisibility() != 0) {
                this.f16307i.setVisibility(0);
            }
            if (this.f16307i.getParent() == null) {
                this.f16301c.addView(this.f16307i);
                d(this.b.isMraid());
            }
            if (this.b.isMraid()) {
                g();
            }
            f();
            com.mbridge.msdk.mbbanner.common.communication.a aVar = new com.mbridge.msdk.mbbanner.common.communication.a(this.f16301c.getContext(), this.f16314r, this.f16303e);
            this.f16319w = aVar;
            aVar.a(this.f16315s);
            this.f16319w.a(this.f16298E);
            this.f16319w.a(this.f16317u);
            this.f16307i.setWebViewListener(this.f16299F);
            this.f16307i.setObject(this.f16319w);
            if (!a6.startsWith("file")) {
                if (this.b.isActiveOm()) {
                    a6 = com.mbridge.msdk.a.b.c(a6);
                }
                this.f16307i.loadDataWithBaseURL(this.b.getBannerUrl(), a6, "text/html", "utf-8", null);
            } else {
                this.f16307i.loadUrl(a6);
            }
            MBBannerWebView mBBannerWebView2 = this.f16307i;
            if (mBBannerWebView2 != null) {
                mBBannerWebView2.postDelayed(new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.c.d.9
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        try {
                            if (d.this.f16307i != null) {
                                if (d.this.f16316t == 2) {
                                    str = "false";
                                } else {
                                    str = "true";
                                }
                                d.this.f16307i.evaluateJavascript("(function() {\n    var videos = document.getElementsByTagName('video');\n    for (var i = 0; i < videos.length; i++) {\n    videos[i].muted = " + str + ";\n    }\n    var audios = document.getElementsByTagName('audio');\n    for (var i = 0; i < audios.length; i++) {\n    audios[i].muted = " + str + ";\n    }\n    })()", null);
                            }
                        } catch (Exception e4) {
                            e4.printStackTrace();
                        }
                    }
                }, 1000L);
            }
        } else {
            a("banner render failed because banner view is null", 2);
            a("banner show failed because banner view is exception");
        }
        return true;
    }

    public final void a(boolean z8, int i9) {
        this.f16317u = i9;
        if (i9 == 0) {
            k d2 = h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), this.f16303e);
            if (d2 == null) {
                return;
            } else {
                z8 = d2.f() == 1;
            }
        }
        this.f16305g = z8;
    }

    public final void a(boolean z8) {
        this.f16305g = z8;
    }

    private String a(CampaignEx campaignEx) {
        String d2;
        String str = "";
        if (campaignEx == null) {
            return "";
        }
        String htmlContentFromUrl = HTMLResourceManager.getInstance().getHtmlContentFromUrl(campaignEx.getBannerUrl());
        if (TextUtils.isEmpty(htmlContentFromUrl)) {
            String bannerHtml = campaignEx.getBannerHtml();
            if (campaignEx.isActiveOm()) {
                try {
                    File file = new File(bannerHtml);
                    if (file.exists()) {
                        str = ab.b(file);
                    }
                    d2 = N5.a.a(MBridgeConstans.OMID_JS_SERVICE_CONTENT, str);
                } catch (Exception unused) {
                    File file2 = new File(bannerHtml);
                    if (file2.exists() && file2.isFile() && file2.canRead()) {
                        d2 = AbstractC2914a.d("file:////", bannerHtml);
                    }
                }
                return d2;
            }
            File file3 = new File(bannerHtml);
            if (file3.exists() && file3.isFile() && file3.canRead()) {
                d2 = AbstractC2914a.d("file:////", bannerHtml);
                return d2;
            }
            return bannerHtml;
        }
        return N5.a.a(MBridgeConstans.OMID_JS_SERVICE_CONTENT, htmlContentFromUrl);
    }

    public final void c(boolean z8) {
        this.m = z8;
        d();
    }

    private void c(final CampaignEx campaignEx, final Context context, String str) {
        if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
            new Thread(new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.c.d.3
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        j.a(com.mbridge.msdk.foundation.db.g.a(context)).a(campaignEx.getId());
                    } catch (Exception e4) {
                        ad.b("BannerShowManager", e4.getMessage());
                    }
                }
            }).start();
            com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.a.a.f14771g);
        }
        if (TextUtils.isEmpty(str) || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().p() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getNativeVideoTracking().p(), false, false);
    }

    public static /* synthetic */ void c(d dVar) {
        MBBannerWebView mBBannerWebView = dVar.f16307i;
        if (mBBannerWebView != null && mBBannerWebView.getParent() != null) {
            dVar.f16301c.removeView(dVar.f16307i);
        }
        ImageView imageView = dVar.f16306h;
        if (imageView != null && imageView.getParent() != null) {
            dVar.f16306h.setVisibility(8);
            dVar.f16301c.removeView(dVar.f16306h);
        }
        ImageView imageView2 = dVar.f16308j;
        if (imageView2 != null && imageView2.getParent() != null) {
            dVar.f16301c.removeView(dVar.f16308j);
            dVar.f16308j.setVisibility(8);
        }
        com.mbridge.msdk.foundation.d.b.a().c(dVar.f16303e);
        ImageView imageView3 = dVar.f16309k;
        if (imageView3 != null && imageView3.getParent() != null) {
            dVar.f16301c.removeView(dVar.f16309k);
            dVar.f16309k.setVisibility(8);
        }
        com.mbridge.msdk.mbbanner.common.a.a a6 = com.mbridge.msdk.mbbanner.common.a.a.a().b(dVar.f16303e).d(dVar.b.getRequestId()).e(dVar.b.getRequestIdNotice()).c(dVar.b.getId()).f(dVar.b.getCreativeId() + "").a(dVar.b.isBidCampaign());
        String str = dVar.f16303e;
        if (a6 != null) {
            a6.a("2000069");
            com.mbridge.msdk.foundation.same.report.g.a(a6.b(), com.mbridge.msdk.foundation.controller.c.m().c(), str);
        }
        BannerUtils.inserCloseId(dVar.f16303e, dVar.f16315s);
        com.mbridge.msdk.mbbanner.common.b.c cVar = dVar.f16300a;
        if (cVar != null) {
            cVar.e();
        }
        dVar.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.b == null || e()) {
            return;
        }
        this.f16322z.removeCallbacks(this.f16294A);
        com.mbridge.msdk.mbbanner.common.b.c cVar = this.f16300a;
        if (cVar != null) {
            cVar.a(str);
        }
        i.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.b, this.f16303e, str);
    }

    public final void b(boolean z8) {
        this.l = z8;
        d();
        if (z8) {
            return;
        }
        CampaignEx campaignEx = this.b;
        String str = this.f16303e;
        if (campaignEx != null) {
            String a6 = com.mbridge.msdk.mbsignalcommon.mraid.c.a(campaignEx.getId());
            if (TextUtils.isEmpty(a6)) {
                return;
            }
            new com.mbridge.msdk.foundation.same.report.h(com.mbridge.msdk.foundation.controller.c.m().c()).b(campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), str, a6, campaignEx.isBidCampaign());
            com.mbridge.msdk.mbsignalcommon.mraid.c.b(campaignEx.getId());
        }
    }

    public final void a() {
        h();
        if (this.f16300a != null) {
            this.f16300a = null;
        }
        MBBannerWebView mBBannerWebView = this.f16307i;
        if (mBBannerWebView != null) {
            mBBannerWebView.setWebViewListener(null);
        }
        if (this.f16299F != null) {
            this.f16299F = null;
        }
        ImageView imageView = this.f16308j;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
        ImageView imageView2 = this.f16306h;
        if (imageView2 != null) {
            imageView2.setOnClickListener(null);
        }
        MBBannerView mBBannerView = this.f16301c;
        if (mBBannerView != null) {
            mBBannerView.removeAllViews();
        }
        MBBannerWebView mBBannerWebView2 = this.f16307i;
        if (mBBannerWebView2 != null) {
            mBBannerWebView2.release();
        }
        com.mbridge.msdk.mbbanner.common.communication.a aVar = this.f16319w;
        if (aVar != null) {
            aVar.a();
        }
        if (this.f16298E != null) {
            this.f16298E = null;
        }
        com.mbridge.msdk.foundation.d.b.a().c(this.f16303e);
    }

    private void b(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(campaignEx.getOnlyImpressionURL())) {
                    return;
                }
                com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, com.mbridge.msdk.click.a.a.f14772h);
            } catch (Throwable th) {
                ad.b("BannerShowManager", th.getMessage());
            }
        }
    }

    private void a(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                List<String> pv_urls = campaignEx.getPv_urls();
                if (pv_urls == null || pv_urls.size() <= 0) {
                    return;
                }
                Iterator<String> it = pv_urls.iterator();
                while (it.hasNext()) {
                    com.mbridge.msdk.click.a.a(context, campaignEx, str, it.next(), false, true);
                }
            } catch (Throwable th) {
                ad.b("BannerShowManager", th.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i9) {
        if (this.b != null) {
            com.mbridge.msdk.mbbanner.common.d.a.a(com.mbridge.msdk.mbbanner.common.a.a.a().c(this.b.getId()).b(this.f16303e).d(this.b.getRequestId()).e(this.b.getRequestIdNotice()).g(str).a(i9).a(this.b.isBidCampaign()), this.f16303e);
        }
    }

    public final void a(int i9, int i10, int i11, int i12) {
        if (i9 == i11 && i10 == i12) {
            return;
        }
        MBBannerWebView mBBannerWebView = this.f16307i;
        ad.b("BannerCallJS", "fireOnBannerViewSizeChange");
        try {
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(mBBannerWebView, i9, i10);
        } catch (Throwable th) {
            ad.b("BannerCallJS", "fireOnBannerViewSizeChange", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.mbridge.msdk.foundation.entity.CampaignUnit r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L1a
            java.util.ArrayList r5 = r5.getAds()
            r4.f16315s = r5
            if (r5 == 0) goto L1a
            int r5 = r5.size()
            if (r5 <= 0) goto L1a
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r5 = r4.f16315s
            java.lang.Object r5 = r5.get(r0)
            com.mbridge.msdk.foundation.entity.CampaignEx r5 = (com.mbridge.msdk.foundation.entity.CampaignEx) r5
            goto L1b
        L1a:
            r5 = 0
        L1b:
            r4.b = r5
            if (r5 != 0) goto L25
            java.lang.String r5 = "banner show failed because campain is exception"
            r4.a(r5)
            return
        L25:
            android.os.Handler r5 = r4.f16322z
            com.mbridge.msdk.foundation.same.e.a r1 = r4.f16294A
            r5.removeCallbacks(r1)
            boolean r5 = r4.f16305g
            if (r5 == 0) goto L64
            android.widget.ImageView r5 = r4.f16308j
            if (r5 != 0) goto L64
            android.widget.ImageView r5 = new android.widget.ImageView
            com.mbridge.msdk.foundation.controller.c r1 = com.mbridge.msdk.foundation.controller.c.m()
            android.content.Context r1 = r1.c()
            r5.<init>(r1)
            r4.f16308j = r5
            com.mbridge.msdk.foundation.controller.c r1 = com.mbridge.msdk.foundation.controller.c.m()
            android.content.Context r1 = r1.c()
            java.lang.String r2 = "mbridge_banner_close"
            java.lang.String r3 = "drawable"
            int r1 = com.mbridge.msdk.foundation.tools.v.a(r1, r2, r3)
            r5.setBackgroundResource(r1)
            android.widget.ImageView r5 = r4.f16308j
            r1 = 8
            r5.setVisibility(r1)
            android.widget.ImageView r5 = r4.f16308j
            java.lang.String r1 = "closeButton"
            r5.setContentDescription(r1)
        L64:
            r4.f16310n = r0
            r4.f16311o = r0
            r4.f16302d = r0
            com.mbridge.msdk.foundation.entity.CampaignEx r5 = r4.b
            java.lang.String r5 = r5.getBannerHtml()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L82
            com.mbridge.msdk.foundation.entity.CampaignEx r5 = r4.b
            java.lang.String r5 = r5.getBannerUrl()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto Lcc
        L82:
            com.mbridge.msdk.mbbanner.common.a.a r5 = com.mbridge.msdk.mbbanner.common.a.a.a()
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r4.b
            java.lang.String r0 = r0.getId()
            com.mbridge.msdk.mbbanner.common.a.a r5 = r5.c(r0)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r4.b
            java.lang.String r0 = r0.getRequestId()
            com.mbridge.msdk.mbbanner.common.a.a r5 = r5.d(r0)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r4.b
            java.lang.String r0 = r0.getRequestIdNotice()
            com.mbridge.msdk.mbbanner.common.a.a r5 = r5.e(r0)
            java.lang.String r0 = r4.f16303e
            com.mbridge.msdk.mbbanner.common.a.a r5 = r5.b(r0)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r4.b
            boolean r0 = r0.isBidCampaign()
            com.mbridge.msdk.mbbanner.common.a.a r5 = r5.a(r0)
            java.lang.String r0 = r4.f16303e
            if (r5 == 0) goto Lcc
            java.lang.String r1 = "2000067"
            r5.a(r1)
            java.lang.String r5 = r5.b()
            com.mbridge.msdk.foundation.controller.c r1 = com.mbridge.msdk.foundation.controller.c.m()
            android.content.Context r1 = r1.c()
            com.mbridge.msdk.foundation.same.report.g.a(r5, r1, r0)
        Lcc:
            android.os.Handler r5 = r4.f16322z
            com.mbridge.msdk.foundation.same.e.a r0 = r4.f16294A
            r1 = 15000(0x3a98, double:7.411E-320)
            r5.postDelayed(r0, r1)
            boolean r5 = r4.b()
            if (r5 != 0) goto Lfc
            com.mbridge.msdk.foundation.entity.CampaignEx r5 = r4.b
            java.lang.String r5 = r5.getBannerHtml()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto Lf3
            com.mbridge.msdk.foundation.entity.CampaignEx r5 = r4.b
            java.lang.String r5 = r5.getBannerUrl()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto Lf9
        Lf3:
            java.lang.String r5 = "banner render failed because res load failed"
            r0 = 2
            r4.a(r5, r0)
        Lf9:
            r4.c()
        Lfc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbbanner.common.c.d.a(com.mbridge.msdk.foundation.entity.CampaignUnit):void");
    }

    private void d(boolean z8) {
        if (this.f16301c != null) {
            View b = com.mbridge.msdk.foundation.d.b.a().b(this.f16303e);
            if (com.mbridge.msdk.foundation.d.b.a().b() && z8 && b != null) {
                ViewGroup viewGroup = (ViewGroup) b.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(b);
                }
                b.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) b.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new RelativeLayout.LayoutParams(com.mbridge.msdk.foundation.d.b.b, com.mbridge.msdk.foundation.d.b.f15466a);
                }
                layoutParams.addRule(12);
                b.setLayoutParams(layoutParams);
                this.f16301c.addView(b);
            }
            com.mbridge.msdk.foundation.d.b.a().a(this.f16303e, new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.mbbanner.common.c.d.5
                @Override // com.mbridge.msdk.foundation.d.a
                public final void a() {
                    String str;
                    d.this.f16301c.onPause();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                            jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
                        }
                        str = jSONObject.toString();
                    } catch (Throwable th) {
                        ad.b("BannerShowManager", th.getMessage(), th);
                        str = "";
                    }
                    g.a().a((WebView) d.this.f16307i, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void b() {
                    String str;
                    d.this.f16301c.onResume();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                            jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                        }
                        str = jSONObject.toString();
                    } catch (Throwable th) {
                        ad.b("BannerShowManager", th.getMessage(), th);
                        str = "";
                    }
                    g.a().a((WebView) d.this.f16307i, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void a(String str) {
                    String str2;
                    d.this.f16301c.onResume();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                            jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                        }
                        str2 = jSONObject.toString();
                    } catch (Throwable th) {
                        ad.b("BannerShowManager", th.getMessage(), th);
                        str2 = "";
                    }
                    g.a().a((WebView) d.this.f16307i, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
                }
            });
            this.b.setCampaignUnitId(this.f16303e);
            com.mbridge.msdk.foundation.d.b.a().a(this.f16303e, this.b);
        }
    }

    public static /* synthetic */ void d(d dVar) {
        ImageView imageView;
        if (dVar.f16305g && (imageView = dVar.f16308j) != null && imageView.getVisibility() == 0) {
            dVar.f16308j.setVisibility(8);
            dVar.f16308j.setOnClickListener(null);
            if (dVar.f16301c == null || dVar.f16308j.getParent() == null) {
                return;
            }
            dVar.f16301c.removeView(dVar.f16308j);
        }
    }
}
