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
import com.applovin.impl.mediation.ads.e;
import com.facebook.internal.i;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
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

/* loaded from: classes4.dex */
public class d {
    private float B;
    private float C;
    protected com.mbridge.msdk.mbbanner.common.b.c a;

    /* renamed from: b, reason: collision with root package name */
    protected CampaignEx f13840b;

    /* renamed from: c, reason: collision with root package name */
    protected final MBBannerView f13841c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f13842d;

    /* renamed from: e, reason: collision with root package name */
    protected final String f13843e;

    /* renamed from: f, reason: collision with root package name */
    com.mbridge.msdk.click.a f13844f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f13845g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f13846h;

    /* renamed from: i, reason: collision with root package name */
    private MBBannerWebView f13847i;

    /* renamed from: j, reason: collision with root package name */
    private ImageView f13848j;

    /* renamed from: k, reason: collision with root package name */
    private ImageView f13849k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f13850l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f13851m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f13852n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f13853o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f13854p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f13855q;

    /* renamed from: r, reason: collision with root package name */
    private final String f13856r;

    /* renamed from: s, reason: collision with root package name */
    private List<CampaignEx> f13857s;
    private int u;

    /* renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.communication.a f13860w;

    /* renamed from: x, reason: collision with root package name */
    private kd.b f13861x;

    /* renamed from: y, reason: collision with root package name */
    private kd.a f13862y;

    /* renamed from: t, reason: collision with root package name */
    private int f13858t = 1;

    /* renamed from: v, reason: collision with root package name */
    private final long f13859v = 15000;

    /* renamed from: z, reason: collision with root package name */
    private final Handler f13863z = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.mbbanner.common.c.d.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                try {
                    if (d.this.f13861x != null) {
                        d dVar = d.this;
                        dVar.f13862y = kd.a.a(dVar.f13861x);
                        if (d.this.f13862y != null) {
                            d.this.f13862y.c();
                            d.this.f13862y.b();
                        }
                    }
                } catch (Throwable th2) {
                    ad.a("BannerShowManager", th2.getMessage());
                }
            }
        }
    };
    private final com.mbridge.msdk.foundation.same.e.a A = new com.mbridge.msdk.foundation.same.e.a() { // from class: com.mbridge.msdk.mbbanner.common.c.d.6
        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void pauseTask(boolean z10) {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void runTask() {
            d.this.a("banner render failed because render is timeout");
        }
    };
    private final View.OnClickListener D = new View.OnClickListener() { // from class: com.mbridge.msdk.mbbanner.common.c.d.7
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            d dVar = d.this;
            if (dVar.f13842d) {
                d.c(dVar);
            }
        }
    };
    private com.mbridge.msdk.mbbanner.common.b.a E = new com.mbridge.msdk.mbbanner.common.b.a() { // from class: com.mbridge.msdk.mbbanner.common.c.d.8
        @Override // com.mbridge.msdk.mbbanner.common.b.a
        public final void a(int i10) {
            if (i10 == 2) {
                d.d(d.this);
            } else {
                d.this.f();
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.a
        public final void b(int i10) {
            if (i10 == 1) {
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
        public final void a(boolean z10) {
            d dVar = d.this;
            if (dVar.a != null) {
                dVar.f13855q = z10;
                if (z10) {
                    d.this.a.c();
                } else {
                    d.this.a.d();
                }
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.a
        public final void a(boolean z10, String str) {
            try {
                if (d.this.a != null) {
                    if (TextUtils.isEmpty(str)) {
                        d.this.a.a();
                        d.this.a.b();
                    } else {
                        CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(CampaignEx.campaignToJsonObject(d.this.f13840b));
                        parseCampaignWithBackData.setClickURL(str);
                        d.this.a(parseCampaignWithBackData, z10, str);
                    }
                }
            } catch (Exception e2) {
                ad.b("BannerShowManager", e2.getMessage());
            }
        }
    };
    private com.mbridge.msdk.mbsignalcommon.b.b F = new com.mbridge.msdk.mbsignalcommon.b.b() { // from class: com.mbridge.msdk.mbbanner.common.c.d.4
        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, String str) {
            d.this.f13852n = true;
            ad.b("BannerCallJS", "fireOnJSBridgeConnected");
            g.a().a(webView);
            d.this.f13854p = true;
            CampaignEx campaignEx = d.this.f13840b;
            if (campaignEx == null || campaignEx.isHasMBTplMark()) {
                return;
            }
            d.this.d();
            d.this.a("", 1);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, int i10, String str, String str2) {
            d.this.a(str);
            d.this.a(str, 2);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView) {
            d.this.c();
        }
    };

    public d(MBBannerView mBBannerView, com.mbridge.msdk.mbbanner.common.b.c cVar, String str, String str2, boolean z10, k kVar) {
        this.f13845g = z10;
        this.f13841c = mBBannerView;
        this.f13843e = str2;
        this.f13856r = str;
        this.a = new f(cVar, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:131:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x022a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d() {
        /*
            Method dump skipped, instructions count: 1061
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbbanner.common.c.d.d():void");
    }

    public static /* synthetic */ void m(d dVar) {
        if (dVar.f13846h != null) {
            MBBannerWebView mBBannerWebView = dVar.f13847i;
            if (mBBannerWebView != null) {
                mBBannerWebView.setVisibility(8);
            }
            if (dVar.f13846h.getVisibility() != 0) {
                dVar.f13846h.setVisibility(0);
            }
            if (dVar.f13841c != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(10);
                dVar.f13846h.setScaleType(ImageView.ScaleType.FIT_XY);
                if (dVar.f13846h.getParent() == null) {
                    dVar.f13841c.addView(dVar.f13846h, layoutParams);
                }
                dVar.d(true);
            }
        }
    }

    public void a(CampaignEx campaignEx, boolean z10, String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.f13841c != null) {
            MBBannerWebView mBBannerWebView = this.f13847i;
            if (mBBannerWebView != null && mBBannerWebView.getParent() != null) {
                this.f13841c.removeView(this.f13847i);
            }
            if (this.f13846h == null) {
                ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.m().c());
                this.f13846h = imageView;
                imageView.setOnTouchListener(new View.OnTouchListener() { // from class: com.mbridge.msdk.mbbanner.common.c.d.10
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        d.this.B = motionEvent.getRawX();
                        d.this.C = motionEvent.getRawY();
                        ad.b("BannerShowManager", d.this.B + "  " + d.this.C);
                        return false;
                    }
                });
                this.f13846h.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.mbbanner.common.c.d.11
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        d.this.a(BannerUtils.managerCampaignEX(com.mbridge.msdk.mbsignalcommon.communication.d.a(d.this.B, d.this.C), d.this.f13840b), false, "");
                    }
                });
            }
            String imageUrl = this.f13840b.getImageUrl();
            if (!TextUtils.isEmpty(imageUrl)) {
                com.mbridge.msdk.foundation.same.c.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(imageUrl, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.mbbanner.common.c.d.12
                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public final void onFailedLoad(String str, String str2) {
                        d.this.a("banner show failed because banner default view is exception");
                    }

                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public final void onSuccessLoad(Bitmap bitmap, String str) {
                        if (d.this.f13846h != null) {
                            d.this.f13846h.setImageBitmap(bitmap);
                        }
                        d.this.f13852n = true;
                        d.m(d.this);
                        d.this.f();
                        d.this.g();
                        d dVar = d.this;
                        if (!dVar.f13842d) {
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
        isReport = this.f13840b.isReport();
        if (!isReport) {
            this.f13840b.setReport(true);
        }
        return isReport;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        ImageView imageView;
        if (!this.f13845g || (imageView = this.f13848j) == null) {
            return;
        }
        if (imageView.getVisibility() != 0) {
            this.f13848j.setVisibility(0);
            this.f13848j.setOnClickListener(this.D);
        }
        if (this.f13848j.getParent() != null || this.f13841c == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(e.a(12.0f), e.a(12.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        this.f13841c.addView(this.f13848j, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f13841c == null) {
            return;
        }
        CampaignEx campaignEx = this.f13840b;
        if (campaignEx != null) {
            if (!(campaignEx.getPrivacyButtonTemplateVisibility() == 1)) {
                return;
            }
        }
        MBAdChoice mBAdChoice = new MBAdChoice(com.mbridge.msdk.foundation.controller.c.m().c());
        mBAdChoice.setCampaign(this.f13840b);
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
                } catch (Throwable th2) {
                    ad.b("BannerShowManager", th2.getMessage(), th2);
                    str = "";
                }
                g.a().a((WebView) d.this.f13847i, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
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
                } catch (Throwable th2) {
                    ad.b("BannerShowManager", th2.getMessage(), th2);
                    str = "";
                }
                g.a().a((WebView) d.this.f13847i, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
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
                } catch (Throwable th2) {
                    ad.b("BannerShowManager", th2.getMessage(), th2);
                    str2 = "";
                }
                g.a().a((WebView) d.this.f13847i, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
            }
        });
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(e.a(6.0f), e.a(6.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(12);
        this.f13841c.addView(mBAdChoice, layoutParams);
    }

    private void h() {
        kd.b bVar = this.f13861x;
        if (bVar != null) {
            bVar.c();
            this.f13861x = null;
            ad.a("omsdk", " adSession.finish() ");
        }
    }

    private boolean b() {
        String a = a(this.f13840b);
        if (TextUtils.isEmpty(a)) {
            return false;
        }
        if (this.f13841c != null) {
            if (this.f13847i == null) {
                try {
                    MBBannerWebView mBBannerWebView = new MBBannerWebView(com.mbridge.msdk.foundation.controller.c.m().c());
                    this.f13847i = mBBannerWebView;
                    mBBannerWebView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                    this.f13847i.setWebViewClient(new com.mbridge.msdk.mbbanner.view.a(this.f13843e, this.f13857s, this.E));
                } catch (Throwable unused) {
                    a("banner show failed because WebView is not available and try to show default", 1);
                    return false;
                }
            }
            ImageView imageView = this.f13846h;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (this.f13847i.getVisibility() != 0) {
                this.f13847i.setVisibility(0);
            }
            if (this.f13847i.getParent() == null) {
                this.f13841c.addView(this.f13847i);
                d(this.f13840b.isMraid());
            }
            if (this.f13840b.isMraid()) {
                g();
            }
            f();
            com.mbridge.msdk.mbbanner.common.communication.a aVar = new com.mbridge.msdk.mbbanner.common.communication.a(this.f13841c.getContext(), this.f13856r, this.f13843e);
            this.f13860w = aVar;
            aVar.a(this.f13857s);
            this.f13860w.a(this.E);
            this.f13860w.a(this.u);
            this.f13847i.setWebViewListener(this.F);
            this.f13847i.setObject(this.f13860w);
            if (!a.startsWith("file")) {
                if (this.f13840b.isActiveOm()) {
                    a = com.mbridge.msdk.a.b.c(a);
                }
                this.f13847i.loadDataWithBaseURL(this.f13840b.getBannerUrl(), a, "text/html", "utf-8", null);
            } else {
                this.f13847i.loadUrl(a);
            }
            MBBannerWebView mBBannerWebView2 = this.f13847i;
            if (mBBannerWebView2 != null) {
                mBBannerWebView2.postDelayed(new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.c.d.9
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        try {
                            if (d.this.f13847i != null) {
                                if (d.this.f13858t == 2) {
                                    str = "false";
                                } else {
                                    str = "true";
                                }
                                d.this.f13847i.evaluateJavascript("(function() {\n    var videos = document.getElementsByTagName('video');\n    for (var i = 0; i < videos.length; i++) {\n    videos[i].muted = " + str + ";\n    }\n    var audios = document.getElementsByTagName('audio');\n    for (var i = 0; i < audios.length; i++) {\n    audios[i].muted = " + str + ";\n    }\n    })()", null);
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
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

    public final void a(boolean z10, int i10) {
        this.u = i10;
        if (i10 == 0) {
            k d10 = h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), this.f13843e);
            if (d10 == null) {
                return;
            } else {
                z10 = d10.f() == 1;
            }
        }
        this.f13845g = z10;
    }

    public final void a(boolean z10) {
        this.f13845g = z10;
    }

    private String a(CampaignEx campaignEx) {
        String e2;
        if (campaignEx == null) {
            return "";
        }
        String htmlContentFromUrl = HTMLResourceManager.getInstance().getHtmlContentFromUrl(campaignEx.getBannerUrl());
        if (TextUtils.isEmpty(htmlContentFromUrl)) {
            String bannerHtml = campaignEx.getBannerHtml();
            if (campaignEx.isActiveOm()) {
                try {
                    File file = new File(bannerHtml);
                    e2 = i.z(MBridgeConstans.OMID_JS_SERVICE_CONTENT, file.exists() ? ab.b(file) : "");
                } catch (Exception unused) {
                    File file2 = new File(bannerHtml);
                    if (file2.exists() && file2.isFile() && file2.canRead()) {
                        e2 = vd.e.e("file:////", bannerHtml);
                    }
                }
                return e2;
            }
            File file3 = new File(bannerHtml);
            if (file3.exists() && file3.isFile() && file3.canRead()) {
                e2 = vd.e.e("file:////", bannerHtml);
                return e2;
            }
            return bannerHtml;
        }
        return i.z(MBridgeConstans.OMID_JS_SERVICE_CONTENT, htmlContentFromUrl);
    }

    public final void c(boolean z10) {
        this.f13851m = z10;
        d();
    }

    private void c(final CampaignEx campaignEx, final Context context, String str) {
        if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
            new Thread(new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.c.d.3
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        j.a(com.mbridge.msdk.foundation.db.g.a(context)).a(campaignEx.getId());
                    } catch (Exception e2) {
                        ad.b("BannerShowManager", e2.getMessage());
                    }
                }
            }).start();
            com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.a.a.f12480g);
        }
        if (TextUtils.isEmpty(str) || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().p() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getNativeVideoTracking().p(), false, false);
    }

    public static /* synthetic */ void c(d dVar) {
        MBBannerWebView mBBannerWebView = dVar.f13847i;
        if (mBBannerWebView != null && mBBannerWebView.getParent() != null) {
            dVar.f13841c.removeView(dVar.f13847i);
        }
        ImageView imageView = dVar.f13846h;
        if (imageView != null && imageView.getParent() != null) {
            dVar.f13846h.setVisibility(8);
            dVar.f13841c.removeView(dVar.f13846h);
        }
        ImageView imageView2 = dVar.f13848j;
        if (imageView2 != null && imageView2.getParent() != null) {
            dVar.f13841c.removeView(dVar.f13848j);
            dVar.f13848j.setVisibility(8);
        }
        com.mbridge.msdk.foundation.d.b.a().c(dVar.f13843e);
        ImageView imageView3 = dVar.f13849k;
        if (imageView3 != null && imageView3.getParent() != null) {
            dVar.f13841c.removeView(dVar.f13849k);
            dVar.f13849k.setVisibility(8);
        }
        com.mbridge.msdk.mbbanner.common.a.a a = com.mbridge.msdk.mbbanner.common.a.a.a().b(dVar.f13843e).d(dVar.f13840b.getRequestId()).e(dVar.f13840b.getRequestIdNotice()).c(dVar.f13840b.getId()).f(dVar.f13840b.getCreativeId() + "").a(dVar.f13840b.isBidCampaign());
        String str = dVar.f13843e;
        if (a != null) {
            a.a("2000069");
            com.mbridge.msdk.foundation.same.report.g.a(a.b(), com.mbridge.msdk.foundation.controller.c.m().c(), str);
        }
        BannerUtils.inserCloseId(dVar.f13843e, dVar.f13857s);
        com.mbridge.msdk.mbbanner.common.b.c cVar = dVar.a;
        if (cVar != null) {
            cVar.e();
        }
        dVar.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.f13840b == null || e()) {
            return;
        }
        this.f13863z.removeCallbacks(this.A);
        com.mbridge.msdk.mbbanner.common.b.c cVar = this.a;
        if (cVar != null) {
            cVar.a(str);
        }
        com.mbridge.msdk.foundation.same.report.i.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f13840b, this.f13843e, str);
    }

    public final void b(boolean z10) {
        this.f13850l = z10;
        d();
        if (z10) {
            return;
        }
        CampaignEx campaignEx = this.f13840b;
        String str = this.f13843e;
        if (campaignEx != null) {
            String a = com.mbridge.msdk.mbsignalcommon.mraid.c.a(campaignEx.getId());
            if (TextUtils.isEmpty(a)) {
                return;
            }
            new com.mbridge.msdk.foundation.same.report.h(com.mbridge.msdk.foundation.controller.c.m().c()).b(campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), str, a, campaignEx.isBidCampaign());
            com.mbridge.msdk.mbsignalcommon.mraid.c.b(campaignEx.getId());
        }
    }

    public final void a() {
        h();
        if (this.a != null) {
            this.a = null;
        }
        MBBannerWebView mBBannerWebView = this.f13847i;
        if (mBBannerWebView != null) {
            mBBannerWebView.setWebViewListener(null);
        }
        if (this.F != null) {
            this.F = null;
        }
        ImageView imageView = this.f13848j;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
        ImageView imageView2 = this.f13846h;
        if (imageView2 != null) {
            imageView2.setOnClickListener(null);
        }
        MBBannerView mBBannerView = this.f13841c;
        if (mBBannerView != null) {
            mBBannerView.removeAllViews();
        }
        MBBannerWebView mBBannerWebView2 = this.f13847i;
        if (mBBannerWebView2 != null) {
            mBBannerWebView2.release();
        }
        com.mbridge.msdk.mbbanner.common.communication.a aVar = this.f13860w;
        if (aVar != null) {
            aVar.a();
        }
        if (this.E != null) {
            this.E = null;
        }
        com.mbridge.msdk.foundation.d.b.a().c(this.f13843e);
    }

    private void b(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(campaignEx.getOnlyImpressionURL())) {
                    return;
                }
                com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, com.mbridge.msdk.click.a.a.f12481h);
            } catch (Throwable th2) {
                ad.b("BannerShowManager", th2.getMessage());
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
            } catch (Throwable th2) {
                ad.b("BannerShowManager", th2.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i10) {
        if (this.f13840b != null) {
            com.mbridge.msdk.mbbanner.common.d.a.a(com.mbridge.msdk.mbbanner.common.a.a.a().c(this.f13840b.getId()).b(this.f13843e).d(this.f13840b.getRequestId()).e(this.f13840b.getRequestIdNotice()).g(str).a(i10).a(this.f13840b.isBidCampaign()), this.f13843e);
        }
    }

    public final void a(int i10, int i11, int i12, int i13) {
        if (i10 == i12 && i11 == i13) {
            return;
        }
        MBBannerWebView mBBannerWebView = this.f13847i;
        ad.b("BannerCallJS", "fireOnBannerViewSizeChange");
        try {
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(mBBannerWebView, i10, i11);
        } catch (Throwable th2) {
            ad.b("BannerCallJS", "fireOnBannerViewSizeChange", th2);
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
            r4.f13857s = r5
            if (r5 == 0) goto L1a
            int r5 = r5.size()
            if (r5 <= 0) goto L1a
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r5 = r4.f13857s
            java.lang.Object r5 = r5.get(r0)
            com.mbridge.msdk.foundation.entity.CampaignEx r5 = (com.mbridge.msdk.foundation.entity.CampaignEx) r5
            goto L1b
        L1a:
            r5 = 0
        L1b:
            r4.f13840b = r5
            if (r5 != 0) goto L25
            java.lang.String r5 = "banner show failed because campain is exception"
            r4.a(r5)
            return
        L25:
            android.os.Handler r5 = r4.f13863z
            com.mbridge.msdk.foundation.same.e.a r1 = r4.A
            r5.removeCallbacks(r1)
            boolean r5 = r4.f13845g
            if (r5 == 0) goto L64
            android.widget.ImageView r5 = r4.f13848j
            if (r5 != 0) goto L64
            android.widget.ImageView r5 = new android.widget.ImageView
            com.mbridge.msdk.foundation.controller.c r1 = com.mbridge.msdk.foundation.controller.c.m()
            android.content.Context r1 = r1.c()
            r5.<init>(r1)
            r4.f13848j = r5
            com.mbridge.msdk.foundation.controller.c r1 = com.mbridge.msdk.foundation.controller.c.m()
            android.content.Context r1 = r1.c()
            java.lang.String r2 = "mbridge_banner_close"
            java.lang.String r3 = "drawable"
            int r1 = com.mbridge.msdk.foundation.tools.v.a(r1, r2, r3)
            r5.setBackgroundResource(r1)
            android.widget.ImageView r5 = r4.f13848j
            r1 = 8
            r5.setVisibility(r1)
            android.widget.ImageView r5 = r4.f13848j
            java.lang.String r1 = "closeButton"
            r5.setContentDescription(r1)
        L64:
            r4.f13852n = r0
            r4.f13853o = r0
            r4.f13842d = r0
            com.mbridge.msdk.foundation.entity.CampaignEx r5 = r4.f13840b
            java.lang.String r5 = r5.getBannerHtml()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L82
            com.mbridge.msdk.foundation.entity.CampaignEx r5 = r4.f13840b
            java.lang.String r5 = r5.getBannerUrl()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto Lcc
        L82:
            com.mbridge.msdk.mbbanner.common.a.a r5 = com.mbridge.msdk.mbbanner.common.a.a.a()
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r4.f13840b
            java.lang.String r0 = r0.getId()
            com.mbridge.msdk.mbbanner.common.a.a r5 = r5.c(r0)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r4.f13840b
            java.lang.String r0 = r0.getRequestId()
            com.mbridge.msdk.mbbanner.common.a.a r5 = r5.d(r0)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r4.f13840b
            java.lang.String r0 = r0.getRequestIdNotice()
            com.mbridge.msdk.mbbanner.common.a.a r5 = r5.e(r0)
            java.lang.String r0 = r4.f13843e
            com.mbridge.msdk.mbbanner.common.a.a r5 = r5.b(r0)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r4.f13840b
            boolean r0 = r0.isBidCampaign()
            com.mbridge.msdk.mbbanner.common.a.a r5 = r5.a(r0)
            java.lang.String r0 = r4.f13843e
            if (r5 == 0) goto Lcc
            java.lang.String r1 = "2000067"
            r5.a(r1)
            java.lang.String r5 = r5.b()
            com.mbridge.msdk.foundation.controller.c r1 = com.mbridge.msdk.foundation.controller.c.m()
            android.content.Context r1 = r1.c()
            com.mbridge.msdk.foundation.same.report.g.a(r5, r1, r0)
        Lcc:
            android.os.Handler r5 = r4.f13863z
            com.mbridge.msdk.foundation.same.e.a r0 = r4.A
            r1 = 15000(0x3a98, double:7.411E-320)
            r5.postDelayed(r0, r1)
            boolean r5 = r4.b()
            if (r5 != 0) goto Lfc
            com.mbridge.msdk.foundation.entity.CampaignEx r5 = r4.f13840b
            java.lang.String r5 = r5.getBannerHtml()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto Lf3
            com.mbridge.msdk.foundation.entity.CampaignEx r5 = r4.f13840b
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

    private void d(boolean z10) {
        if (this.f13841c != null) {
            View b3 = com.mbridge.msdk.foundation.d.b.a().b(this.f13843e);
            if (com.mbridge.msdk.foundation.d.b.a().b() && z10 && b3 != null) {
                ViewGroup viewGroup = (ViewGroup) b3.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(b3);
                }
                b3.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) b3.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new RelativeLayout.LayoutParams(com.mbridge.msdk.foundation.d.b.f13102b, com.mbridge.msdk.foundation.d.b.a);
                }
                layoutParams.addRule(12);
                b3.setLayoutParams(layoutParams);
                this.f13841c.addView(b3);
            }
            com.mbridge.msdk.foundation.d.b.a().a(this.f13843e, new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.mbbanner.common.c.d.5
                @Override // com.mbridge.msdk.foundation.d.a
                public final void a() {
                    String str;
                    d.this.f13841c.onPause();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                            jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
                        }
                        str = jSONObject.toString();
                    } catch (Throwable th2) {
                        ad.b("BannerShowManager", th2.getMessage(), th2);
                        str = "";
                    }
                    g.a().a((WebView) d.this.f13847i, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void b() {
                    String str;
                    d.this.f13841c.onResume();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                            jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                        }
                        str = jSONObject.toString();
                    } catch (Throwable th2) {
                        ad.b("BannerShowManager", th2.getMessage(), th2);
                        str = "";
                    }
                    g.a().a((WebView) d.this.f13847i, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void a(String str) {
                    String str2;
                    d.this.f13841c.onResume();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                            jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                        }
                        str2 = jSONObject.toString();
                    } catch (Throwable th2) {
                        ad.b("BannerShowManager", th2.getMessage(), th2);
                        str2 = "";
                    }
                    g.a().a((WebView) d.this.f13847i, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
                }
            });
            this.f13840b.setCampaignUnitId(this.f13843e);
            com.mbridge.msdk.foundation.d.b.a().a(this.f13843e, this.f13840b);
        }
    }

    public static /* synthetic */ void d(d dVar) {
        ImageView imageView;
        if (dVar.f13845g && (imageView = dVar.f13848j) != null && imageView.getVisibility() == 0) {
            dVar.f13848j.setVisibility(8);
            dVar.f13848j.setOnClickListener(null);
            if (dVar.f13841c == null || dVar.f13848j.getParent() == null) {
                return;
            }
            dVar.f13841c.removeView(dVar.f13848j);
        }
    }
}
