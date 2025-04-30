package com.mbridge.msdk.splash.c;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.L;
import com.mbridge.msdk.click.i;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.splash.view.MBSplashView;
import com.mbridge.msdk.splash.view.MBSplashWebview;
import com.mbridge.msdk.widget.FeedBackButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b {
    protected MBSplashView b;

    /* renamed from: c, reason: collision with root package name */
    protected com.mbridge.msdk.splash.d.d f17800c;

    /* renamed from: d, reason: collision with root package name */
    protected com.mbridge.msdk.click.a f17801d;

    /* renamed from: e, reason: collision with root package name */
    protected String f17802e;

    /* renamed from: f, reason: collision with root package name */
    protected MBridgeIds f17803f;

    /* renamed from: h, reason: collision with root package name */
    protected String f17805h;

    /* renamed from: i, reason: collision with root package name */
    protected String f17806i;

    /* renamed from: j, reason: collision with root package name */
    protected String f17807j;

    /* renamed from: k, reason: collision with root package name */
    protected String f17808k;
    protected boolean l;
    protected Context m;

    /* renamed from: q, reason: collision with root package name */
    private CampaignEx f17812q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f17813r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f17814s;

    /* renamed from: t, reason: collision with root package name */
    private View f17815t;

    /* renamed from: u, reason: collision with root package name */
    private String f17816u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f17817v;

    /* renamed from: w, reason: collision with root package name */
    private ImageView f17818w;

    /* renamed from: x, reason: collision with root package name */
    private a f17819x;

    /* renamed from: a, reason: collision with root package name */
    protected final String f17799a = "SplashShowManager";

    /* renamed from: g, reason: collision with root package name */
    protected int f17804g = 5;

    /* renamed from: n, reason: collision with root package name */
    protected boolean f17809n = true;

    /* renamed from: y, reason: collision with root package name */
    private View.OnClickListener f17820y = new View.OnClickListener() { // from class: com.mbridge.msdk.splash.c.b.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (b.this.f17813r) {
                b.this.b(1);
                b.a(b.this, -1);
            }
        }
    };

    /* renamed from: o, reason: collision with root package name */
    public Handler f17810o = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.splash.c.b.2
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            MBSplashView mBSplashView;
            MBSplashWebview splashWebview;
            super.handleMessage(message);
            int i9 = message.what;
            if (i9 != 1) {
                if (i9 == 2 && b.this.f17812q != null && b.this.f17812q.isActiveOm() && (mBSplashView = b.this.b) != null && (splashWebview = mBSplashView.getSplashWebview()) != null) {
                    try {
                        O5.b adSession = splashWebview.getAdSession();
                        if (adSession != null) {
                            O5.a a6 = O5.a.a(adSession);
                            a6.c();
                            a6.b();
                        }
                        ad.a("OMSDK", "adSession.impressionOccurred()");
                        return;
                    } catch (Throwable th) {
                        ad.a("OMSDK", th.getMessage());
                        if (b.this.f17812q != null) {
                            String requestId = b.this.f17812q.getRequestId();
                            String requestIdNotice = b.this.f17812q.getRequestIdNotice();
                            String id = b.this.f17812q.getId();
                            new h(splashWebview.getContext()).a(requestId, requestIdNotice, id, b.this.f17802e, "fetch OM failed, exception" + th.getMessage());
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (!b.this.f17817v) {
                b.this.f();
            }
            b bVar = b.this;
            if (bVar.f17804g > 0) {
                if (!com.mbridge.msdk.foundation.d.b.f15467c) {
                    b bVar2 = b.this;
                    if (!bVar2.l) {
                        int i10 = bVar2.f17804g - 1;
                        bVar2.f17804g = i10;
                        b.a(bVar2, i10);
                        b bVar3 = b.this;
                        if (!bVar3.f17809n) {
                            bVar3.c();
                        }
                        b.this.f17810o.removeMessages(1);
                        sendEmptyMessageDelayed(1, 1000L);
                        return;
                    }
                }
                b.this.d();
                b.this.f17810o.removeMessages(1);
                sendEmptyMessageDelayed(1, 1000L);
                return;
            }
            bVar.b(2);
        }
    };

    /* renamed from: p, reason: collision with root package name */
    protected i f17811p = new i() { // from class: com.mbridge.msdk.splash.c.b.4
        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public final void onFinishRedirection(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            ah.a(campaign, b.this.b);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public final void onRedirectionFailed(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            ah.a(campaign, b.this.b);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public final void onStartRedirection(Campaign campaign, String str) {
            ah.b(campaign, b.this.b);
        }
    };

    public b(Context context, String str, String str2) {
        this.f17805h = "点击跳过|";
        this.f17806i = "点击跳过|";
        this.f17807j = "秒";
        this.f17808k = "秒后自动关闭";
        this.f17802e = str2;
        this.f17816u = str;
        this.f17803f = new MBridgeIds(str, str2);
        this.m = context;
        if (this.f17814s == null) {
            TextView textView = new TextView(context);
            this.f17814s = textView;
            textView.setGravity(1);
            this.f17814s.setTextIsSelectable(false);
            this.f17814s.setPadding(ai.a(context, 5.0f), ai.a(context, 5.0f), ai.a(context, 5.0f), ai.a(context, 5.0f));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f17814s.getLayoutParams();
            this.f17814s.setLayoutParams(layoutParams == null ? new RelativeLayout.LayoutParams(ai.a(context, 100.0f), ai.a(context, 50.0f)) : layoutParams);
            Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
            if (c9 != null) {
                String g9 = com.mbridge.msdk.foundation.controller.c.m().g();
                int identifier = c9.getResources().getIdentifier("mbridge_splash_count_time_can_skip", "string", g9);
                int identifier2 = c9.getResources().getIdentifier("mbridge_splash_count_time_can_skip_not", "string", g9);
                int identifier3 = c9.getResources().getIdentifier("mbridge_splash_count_time_can_skip_s", "string", g9);
                this.f17806i = c9.getResources().getString(identifier);
                String string = c9.getResources().getString(identifier2);
                this.f17808k = string;
                this.f17805h = string;
                this.f17807j = c9.getResources().getString(identifier3);
                this.f17814s.setBackgroundResource(c9.getResources().getIdentifier("mbridge_splash_close_bg", "drawable", com.mbridge.msdk.foundation.controller.c.m().g()));
                this.f17814s.setTextColor(c9.getResources().getColor(c9.getResources().getIdentifier("mbridge_splash_count_time_skip_text_color", TtmlNode.ATTR_TTS_COLOR, g9)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void f() {
        int i9;
        MBSplashView mBSplashView;
        if (this.f17812q == null) {
            return;
        }
        this.f17817v = true;
        if (this.f17800c != null && (mBSplashView = this.b) != null) {
            if (mBSplashView.getContext() != null && (this.b.getContext() instanceof Activity) && ((Activity) this.b.getContext()).isFinishing()) {
                this.f17800c.a(this.f17803f, "Activity is finishing");
                return;
            } else if (this.b.isShown()) {
                this.f17800c.a(this.f17803f);
            } else {
                this.f17800c.a(this.f17803f, "SplashView or container is not visibility");
            }
        }
        if (!this.f17812q.isReport()) {
            MBSplashView mBSplashView2 = this.b;
            if (mBSplashView2 != null && !mBSplashView2.isDynamicView()) {
                CampaignEx campaignEx = this.f17812q;
                if (!campaignEx.isHasMBTplMark()) {
                    c(campaignEx, com.mbridge.msdk.foundation.controller.c.m().c(), this.f17802e);
                    campaignEx.setReport(true);
                    com.mbridge.msdk.foundation.same.a.b.a(this.f17802e, campaignEx, "splash");
                    b(campaignEx, com.mbridge.msdk.foundation.controller.c.m().c(), this.f17802e);
                    a(campaignEx, com.mbridge.msdk.foundation.controller.c.m().c(), this.f17802e);
                }
            } else {
                CampaignEx campaignEx2 = this.f17812q;
                b(campaignEx2, com.mbridge.msdk.foundation.controller.c.m().c(), this.f17802e);
                c(campaignEx2, com.mbridge.msdk.foundation.controller.c.m().c(), this.f17802e);
                a(campaignEx2, com.mbridge.msdk.foundation.controller.c.m().c(), this.f17802e);
                campaignEx2.setReport(true);
                com.mbridge.msdk.foundation.same.a.b.a(this.f17802e, campaignEx2, "splash");
            }
            Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
            CampaignEx campaignEx3 = this.f17812q;
            String str = this.f17802e;
            if (campaignEx3 != null) {
                try {
                    if (campaignEx3.isMraid()) {
                        n nVar = new n();
                        nVar.f(campaignEx3.getRequestId());
                        nVar.g(campaignEx3.getRequestIdNotice());
                        nVar.e(campaignEx3.getId());
                        if (campaignEx3.isMraid()) {
                            i9 = n.f15616a;
                        } else {
                            i9 = n.b;
                        }
                        nVar.d(i9);
                        com.mbridge.msdk.foundation.same.report.g.d(nVar, c9.getApplicationContext(), str);
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        }
    }

    private void g() {
        String str;
        if (this.f17813r) {
            str = this.f17806i + this.f17804g + this.f17807j;
        } else {
            str = this.f17804g + this.f17808k;
        }
        this.f17814s.setText(str);
    }

    public void a(CampaignEx campaignEx, boolean z8, String str) {
    }

    public final void e() {
        if (this.f17800c != null) {
            this.f17800c = null;
        }
        if (this.f17819x != null) {
            this.f17819x = null;
        }
        if (this.f17820y != null) {
            this.f17820y = null;
        }
        MBSplashView mBSplashView = this.b;
        if (mBSplashView != null) {
            mBSplashView.destroy();
        }
        com.mbridge.msdk.foundation.d.b.a().c(this.f17802e);
    }

    /* loaded from: classes3.dex */
    public class a implements com.mbridge.msdk.splash.d.a {
        private a() {
        }

        @Override // com.mbridge.msdk.splash.d.a
        public final void a(int i9) {
            MBSplashView mBSplashView = b.this.b;
            if (mBSplashView != null) {
                mBSplashView.changeCloseBtnState(i9);
            }
        }

        @Override // com.mbridge.msdk.splash.d.a
        public final void b(int i9) {
            ad.b("SplashShowManager", "resetCountdown" + i9);
            b bVar = b.this;
            bVar.f17804g = i9;
            bVar.f17810o.removeMessages(1);
            b.this.f17810o.sendEmptyMessageDelayed(1, 1000L);
        }

        @Override // com.mbridge.msdk.splash.d.a
        public final void a(Object obj, String str) {
            b.this.b(1);
        }

        @Override // com.mbridge.msdk.splash.d.a
        public final void a(CampaignEx campaignEx) {
            b.this.a(campaignEx, false, "");
        }

        @Override // com.mbridge.msdk.splash.d.a
        public final void a() {
            b.this.b(1);
        }

        @Override // com.mbridge.msdk.splash.d.a
        public final void a(boolean z8) {
            if (z8) {
                b.this.f17810o.removeMessages(1);
            }
        }

        @Override // com.mbridge.msdk.splash.d.a
        public final void a(boolean z8, String str) {
            try {
                if (b.this.f17800c != null) {
                    if (TextUtils.isEmpty(str)) {
                        b bVar = b.this;
                        bVar.f17800c.b(bVar.f17803f);
                    } else {
                        CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(CampaignEx.campaignToJsonObject(b.this.f17812q));
                        parseCampaignWithBackData.setClickURL(str);
                        b.this.a(parseCampaignWithBackData, true, str);
                    }
                }
            } catch (Exception e4) {
                ad.b("SplashShowManager", e4.getMessage());
            }
        }

        @Override // com.mbridge.msdk.splash.d.a
        public final void a(int i9, int i10) {
            if (i9 == 1) {
                b.this.f17810o.removeMessages(1);
            }
            if (i9 == 2) {
                b bVar = b.this;
                bVar.f17804g = i10;
                bVar.f17810o.removeMessages(1);
                b.this.f17810o.sendEmptyMessageDelayed(1, 1000L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i9) {
        com.mbridge.msdk.splash.a.c cVar;
        MBSplashView mBSplashView;
        try {
            com.mbridge.msdk.splash.d.d dVar = this.f17800c;
            if (dVar != null) {
                dVar.a(this.f17803f, i9);
                this.f17800c = null;
                com.mbridge.msdk.splash.e.a.a(this.f17802e, this.f17812q);
            }
            ImageView imageView = this.f17818w;
            if (imageView != null && imageView.getParent() != null && (mBSplashView = this.b) != null) {
                mBSplashView.removeView(this.f17818w);
                this.f17818w.setVisibility(8);
            }
            this.f17817v = false;
            if (this.f17812q != null) {
                cVar = com.mbridge.msdk.splash.a.c.a().b(this.f17802e).d(this.f17812q.getRequestId()).g(this.f17812q.getRequestIdNotice()).c(this.f17812q.getId()).e(this.f17812q.getCreativeId() + "").a(this.f17812q.isBidCampaign());
            } else {
                cVar = null;
            }
            com.mbridge.msdk.splash.e.a.a(cVar, this.f17802e, i9);
            Handler handler = this.f17810o;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Exception e4) {
            ad.b("SplashShowManager", e4.getMessage());
        }
    }

    public final void d() {
        Handler handler;
        this.f17809n = false;
        if (this.b != null && this.f17804g > 0 && (handler = this.f17810o) != null) {
            handler.removeMessages(1);
        }
        MBSplashView mBSplashView = this.b;
        if (mBSplashView != null) {
            mBSplashView.onPause();
            MBSplashWebview splashWebview = this.b.getSplashWebview();
            if (splashWebview == null || splashWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.splash.signal.d.a(splashWebview, "onSystemPause", "");
        }
    }

    public final void a(com.mbridge.msdk.splash.d.d dVar) {
        this.f17800c = dVar;
    }

    public final String b() {
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = this.f17812q;
        if (campaignEx != null) {
            arrayList.add(campaignEx);
        }
        return com.mbridge.msdk.foundation.same.c.a(arrayList);
    }

    public final void a(int i9) {
        this.f17804g = i9;
    }

    public final void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.setOnClickListener(this.f17820y);
        }
        this.f17815t = viewGroup;
    }

    public final void a(CampaignEx campaignEx, MBSplashView mBSplashView) {
        MBSplashView mBSplashView2;
        MBSplashView mBSplashView3;
        Context context;
        MBSplashWebview splashWebview;
        a(this.f17813r);
        this.f17812q = campaignEx;
        this.b = mBSplashView;
        com.mbridge.msdk.splash.signal.c splashSignalCommunicationImpl = mBSplashView.getSplashSignalCommunicationImpl();
        com.mbridge.msdk.splash.signal.c cVar = splashSignalCommunicationImpl;
        if (splashSignalCommunicationImpl == null) {
            com.mbridge.msdk.splash.signal.c cVar2 = new com.mbridge.msdk.splash.signal.c(mBSplashView.getContext(), this.f17816u, this.f17802e);
            ArrayList arrayList = new ArrayList();
            arrayList.add(campaignEx);
            cVar2.a(arrayList);
            cVar = cVar2;
        }
        cVar.b(this.f17804g);
        cVar.a(this.f17813r ? 1 : 0);
        RelativeLayout.LayoutParams layoutParams = null;
        boolean z8 = false;
        if (this.f17819x == null) {
            this.f17819x = new a();
        }
        cVar.a(this.f17819x);
        mBSplashView.setSplashSignalCommunicationImpl(cVar);
        boolean isHasMBTplMark = campaignEx.isHasMBTplMark();
        View view = this.f17815t;
        if (view == null) {
            if (isHasMBTplMark) {
                this.f17814s.setVisibility(8);
            }
            g();
            a(this.f17814s);
            mBSplashView.setCloseView(this.f17814s);
        } else {
            if (isHasMBTplMark) {
                view.setVisibility(8);
            }
            a(this.f17815t);
            mBSplashView.setCloseView(this.f17815t);
        }
        mBSplashView.show();
        CampaignEx campaignEx2 = this.f17812q;
        if (campaignEx2 != null && campaignEx2.isActiveOm() && (splashWebview = mBSplashView.getSplashWebview()) != null) {
            try {
                O5.b a6 = com.mbridge.msdk.a.b.a(com.mbridge.msdk.foundation.controller.c.m().c(), splashWebview, splashWebview.getUrl(), this.f17812q);
                if (a6 != null) {
                    splashWebview.setAdSession(a6);
                    a6.d(splashWebview);
                    a6.f();
                }
                ad.a("OMSDK", "adSession.start()");
            } catch (Throwable th) {
                ad.a("OMSDK", th.getMessage());
                CampaignEx campaignEx3 = this.f17812q;
                if (campaignEx3 != null) {
                    String requestId = campaignEx3.getRequestId();
                    String requestIdNotice = this.f17812q.getRequestIdNotice();
                    String id = this.f17812q.getId();
                    new h(splashWebview.getContext()).a(requestId, requestIdNotice, id, this.f17802e, "fetch OM failed, exception" + th.getMessage());
                }
            }
        }
        d.a(this.f17802e);
        this.f17810o.removeMessages(1);
        this.f17810o.sendEmptyMessageDelayed(1, 1000L);
        this.f17810o.sendEmptyMessageDelayed(2, 1000L);
        CampaignEx campaignEx4 = this.f17812q;
        if (campaignEx4 != null && campaignEx4.getPrivacyButtonTemplateVisibility() == 1 && (mBSplashView3 = this.b) != null && mBSplashView3.getSplashWebview() != null && !this.b.isDynamicView() && this.f17812q.isMraid() && (context = this.b.getContext()) != null) {
            try {
                int a9 = v.a(context, "mbridge_splash_notice", "drawable");
                int a10 = ai.a(context, 35.0f);
                int a11 = ai.a(context, 9.0f);
                ImageView imageView = new ImageView(context);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a10, a10);
                layoutParams2.addRule(9);
                layoutParams2.addRule(10);
                layoutParams2.setMargins(a11, a11, a11, a11);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setBackgroundResource(a9);
                ai.a(3, imageView, this.f17812q, context, true, new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.splash.c.b.7
                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void a() {
                        b.this.d();
                    }

                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void b() {
                        b.this.c();
                    }

                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void a(String str) {
                        b.this.c();
                    }
                });
                this.b.addView(imageView);
            } catch (Throwable th2) {
                ad.b("SplashShowManager", th2.getMessage());
            }
        }
        if (!this.f17812q.isMraid()) {
            CampaignEx campaignEx5 = this.f17812q;
            if (campaignEx5 != null) {
                campaignEx5.setCampaignUnitId(this.f17802e);
                com.mbridge.msdk.foundation.d.b.a().a(this.f17802e, 3);
                com.mbridge.msdk.foundation.d.b.a().a(this.f17802e, this.f17812q);
            }
            if (com.mbridge.msdk.foundation.d.b.a().b() && ((mBSplashView2 = this.b) == null || !mBSplashView2.isDynamicView())) {
                com.mbridge.msdk.foundation.d.b.a().a(this.f17802e, new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.splash.c.b.3
                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void a() {
                        String str;
                        b.this.d();
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                                jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
                            }
                            str = jSONObject.toString();
                        } catch (Throwable th3) {
                            ad.b("SplashShowManager", th3.getMessage(), th3);
                            str = "";
                        }
                        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) b.this.b.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                    }

                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void b() {
                        String str;
                        b.this.c();
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                                jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                            }
                            str = jSONObject.toString();
                        } catch (Throwable th3) {
                            ad.b("SplashShowManager", th3.getMessage(), th3);
                            str = "";
                        }
                        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) b.this.b.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                    }

                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void a(String str) {
                        String str2;
                        b.this.c();
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                                jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                            }
                            str2 = jSONObject.toString();
                        } catch (Throwable th3) {
                            ad.b("SplashShowManager", th3.getMessage(), th3);
                            str2 = "";
                        }
                        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) b.this.b.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
                    }
                });
                FeedBackButton b = com.mbridge.msdk.foundation.d.b.a().b(this.f17802e);
                if (b != null) {
                    try {
                        layoutParams = (RelativeLayout.LayoutParams) b.getLayoutParams();
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                    if (layoutParams == null) {
                        layoutParams = new RelativeLayout.LayoutParams(com.mbridge.msdk.foundation.d.b.b, com.mbridge.msdk.foundation.d.b.f15466a);
                    }
                    layoutParams.topMargin = L.a(10.0f);
                    layoutParams.leftMargin = L.a(10.0f);
                    ViewGroup viewGroup = (ViewGroup) b.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(b);
                    }
                    MBSplashView mBSplashView4 = this.b;
                    if (mBSplashView4 != null) {
                        mBSplashView4.addView(b, layoutParams);
                    }
                }
            }
        }
        com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f17812q.getMaitve(), this.f17812q.getMaitve_src());
        try {
            BitmapDrawable a12 = com.mbridge.msdk.foundation.controller.c.m().a(this.f17802e, this.f17812q.getAdType());
            if (a12 != null) {
                if (this.f17818w == null) {
                    this.f17818w = new ImageView(com.mbridge.msdk.foundation.controller.c.m().c());
                }
                if (this.f17818w.getVisibility() != 0) {
                    this.f17818w.setVisibility(0);
                }
                ai.a(this.f17818w, a12, mBSplashView.getResources().getDisplayMetrics());
                if (this.f17818w.getParent() == null) {
                    mBSplashView.addView(this.f17818w, new ViewGroup.LayoutParams(-1, -1));
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final void b(CampaignEx campaignEx, boolean z8, String str) {
        if (this.f17801d == null) {
            com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f17802e);
            this.f17801d = aVar;
            aVar.a(this.f17811p);
        }
        campaignEx.setCampaignUnitId(this.f17802e);
        this.f17801d.a(campaignEx);
        if (!this.f17812q.isReportClick()) {
            this.f17812q.setReportClick(true);
            com.mbridge.msdk.splash.e.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx);
        }
        com.mbridge.msdk.splash.d.d dVar = this.f17800c;
        if (dVar != null) {
            dVar.b(this.f17803f);
            b(3);
        }
        if (!z8 || TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = this.f17802e;
        try {
            if (TextUtils.isEmpty(str) || !campaignEx.isMraid()) {
                return;
            }
            new h(com.mbridge.msdk.foundation.controller.c.m().c()).a(campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), str2, str, campaignEx.isBidCampaign());
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    private void c(final CampaignEx campaignEx, final Context context, String str) {
        com.mbridge.msdk.foundation.controller.c.m().a(context);
        if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
            new Thread(new Runnable() { // from class: com.mbridge.msdk.splash.c.b.6
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        j.a(com.mbridge.msdk.foundation.db.g.a(context)).a(campaignEx.getId());
                    } catch (Exception unused) {
                        ad.b("SplashShowManager", "campain can't insert db");
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

    public final void c() {
        MBSplashView mBSplashView;
        Handler handler;
        this.f17809n = true;
        if (this.b != null && this.f17804g > 0 && (handler = this.f17810o) != null) {
            handler.removeMessages(1);
            this.f17810o.sendEmptyMessageDelayed(1, 1000L);
        }
        if (com.mbridge.msdk.foundation.d.b.f15467c || (mBSplashView = this.b) == null) {
            return;
        }
        mBSplashView.onResume();
        MBSplashWebview splashWebview = this.b.getSplashWebview();
        if (splashWebview == null || splashWebview.isDestoryed()) {
            return;
        }
        com.mbridge.msdk.splash.signal.d.a(splashWebview, "onSystemPause", "");
    }

    public final void b(final int i9) {
        CampaignEx campaignEx;
        MBSplashWebview splashWebview;
        MBSplashView mBSplashView = this.b;
        if (mBSplashView != null && (splashWebview = mBSplashView.getSplashWebview()) != null) {
            splashWebview.finishAdSession();
        }
        if (this.f17810o != null && (campaignEx = this.f17812q) != null && campaignEx.isActiveOm()) {
            this.f17810o.postDelayed(new Runnable() { // from class: com.mbridge.msdk.splash.c.b.5
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.c(i9);
                }
            }, 1500L);
        } else {
            c(i9);
        }
    }

    private void b(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(campaignEx.getOnlyImpressionURL())) {
                    return;
                }
                com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, com.mbridge.msdk.click.a.a.f14772h);
            } catch (Throwable th) {
                ad.b("SplashShowManager", th.getMessage());
            }
        }
    }

    public final String a() {
        CampaignEx campaignEx = this.f17812q;
        if (campaignEx != null && campaignEx.getRequestId() != null) {
            return this.f17812q.getRequestId();
        }
        return "";
    }

    public final void a(boolean z8) {
        this.f17813r = z8;
        if (z8) {
            this.f17805h = this.f17806i;
        } else {
            this.f17805h = this.f17808k;
        }
    }

    private void a(View view) {
        if (view != null) {
            view.setOnClickListener(this.f17820y);
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
                ad.b("SplashShowManager", th.getMessage());
            }
        }
    }

    public static /* synthetic */ void a(b bVar, int i9) {
        MBSplashView mBSplashView = bVar.b;
        if (mBSplashView != null) {
            mBSplashView.updateCountdown(i9);
            if (bVar.b.getSplashSignalCommunicationImpl() != null) {
                bVar.b.getSplashSignalCommunicationImpl().c(i9);
            }
        }
        if (i9 < 0) {
            bVar.f17804g = i9;
            return;
        }
        com.mbridge.msdk.splash.d.d dVar = bVar.f17800c;
        if (dVar != null) {
            dVar.a(bVar.f17803f, i9 * 1000);
        }
        if (bVar.f17815t == null) {
            bVar.g();
        }
    }
}
