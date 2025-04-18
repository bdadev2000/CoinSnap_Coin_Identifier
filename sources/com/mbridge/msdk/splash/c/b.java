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

/* loaded from: classes4.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    protected MBSplashView f15117b;

    /* renamed from: c, reason: collision with root package name */
    protected com.mbridge.msdk.splash.d.d f15118c;

    /* renamed from: d, reason: collision with root package name */
    protected com.mbridge.msdk.click.a f15119d;

    /* renamed from: e, reason: collision with root package name */
    protected String f15120e;

    /* renamed from: f, reason: collision with root package name */
    protected MBridgeIds f15121f;

    /* renamed from: h, reason: collision with root package name */
    protected String f15123h;

    /* renamed from: i, reason: collision with root package name */
    protected String f15124i;

    /* renamed from: j, reason: collision with root package name */
    protected String f15125j;

    /* renamed from: k, reason: collision with root package name */
    protected String f15126k;

    /* renamed from: l, reason: collision with root package name */
    protected boolean f15127l;

    /* renamed from: m, reason: collision with root package name */
    protected Context f15128m;

    /* renamed from: q, reason: collision with root package name */
    private CampaignEx f15132q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f15133r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f15134s;

    /* renamed from: t, reason: collision with root package name */
    private View f15135t;
    private String u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f15136v;

    /* renamed from: w, reason: collision with root package name */
    private ImageView f15137w;

    /* renamed from: x, reason: collision with root package name */
    private a f15138x;
    protected final String a = "SplashShowManager";

    /* renamed from: g, reason: collision with root package name */
    protected int f15122g = 5;

    /* renamed from: n, reason: collision with root package name */
    protected boolean f15129n = true;

    /* renamed from: y, reason: collision with root package name */
    private View.OnClickListener f15139y = new View.OnClickListener() { // from class: com.mbridge.msdk.splash.c.b.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (b.this.f15133r) {
                b.this.b(1);
                b.a(b.this, -1);
            }
        }
    };

    /* renamed from: o, reason: collision with root package name */
    public Handler f15130o = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.splash.c.b.2
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            MBSplashView mBSplashView;
            MBSplashWebview splashWebview;
            super.handleMessage(message);
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 == 2 && b.this.f15132q != null && b.this.f15132q.isActiveOm() && (mBSplashView = b.this.f15117b) != null && (splashWebview = mBSplashView.getSplashWebview()) != null) {
                    try {
                        kd.b adSession = splashWebview.getAdSession();
                        if (adSession != null) {
                            kd.a a10 = kd.a.a(adSession);
                            a10.c();
                            a10.b();
                        }
                        ad.a("OMSDK", "adSession.impressionOccurred()");
                        return;
                    } catch (Throwable th2) {
                        ad.a("OMSDK", th2.getMessage());
                        if (b.this.f15132q != null) {
                            String requestId = b.this.f15132q.getRequestId();
                            String requestIdNotice = b.this.f15132q.getRequestIdNotice();
                            String id2 = b.this.f15132q.getId();
                            new h(splashWebview.getContext()).a(requestId, requestIdNotice, id2, b.this.f15120e, "fetch OM failed, exception" + th2.getMessage());
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (!b.this.f15136v) {
                b.this.f();
            }
            b bVar = b.this;
            if (bVar.f15122g > 0) {
                if (!com.mbridge.msdk.foundation.d.b.f13103c) {
                    b bVar2 = b.this;
                    if (!bVar2.f15127l) {
                        int i11 = bVar2.f15122g - 1;
                        bVar2.f15122g = i11;
                        b.a(bVar2, i11);
                        b bVar3 = b.this;
                        if (!bVar3.f15129n) {
                            bVar3.c();
                        }
                        b.this.f15130o.removeMessages(1);
                        sendEmptyMessageDelayed(1, 1000L);
                        return;
                    }
                }
                b.this.d();
                b.this.f15130o.removeMessages(1);
                sendEmptyMessageDelayed(1, 1000L);
                return;
            }
            bVar.b(2);
        }
    };

    /* renamed from: p, reason: collision with root package name */
    protected i f15131p = new i() { // from class: com.mbridge.msdk.splash.c.b.4
        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public final void onFinishRedirection(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            ah.a(campaign, b.this.f15117b);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public final void onRedirectionFailed(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            ah.a(campaign, b.this.f15117b);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public final void onStartRedirection(Campaign campaign, String str) {
            ah.b(campaign, b.this.f15117b);
        }
    };

    public b(Context context, String str, String str2) {
        this.f15123h = "点击跳过|";
        this.f15124i = "点击跳过|";
        this.f15125j = "秒";
        this.f15126k = "秒后自动关闭";
        this.f15120e = str2;
        this.u = str;
        this.f15121f = new MBridgeIds(str, str2);
        this.f15128m = context;
        if (this.f15134s == null) {
            TextView textView = new TextView(context);
            this.f15134s = textView;
            textView.setGravity(1);
            this.f15134s.setTextIsSelectable(false);
            this.f15134s.setPadding(ai.a(context, 5.0f), ai.a(context, 5.0f), ai.a(context, 5.0f), ai.a(context, 5.0f));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f15134s.getLayoutParams();
            this.f15134s.setLayoutParams(layoutParams == null ? new RelativeLayout.LayoutParams(ai.a(context, 100.0f), ai.a(context, 50.0f)) : layoutParams);
            Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
            if (c10 != null) {
                String g10 = com.mbridge.msdk.foundation.controller.c.m().g();
                int identifier = c10.getResources().getIdentifier("mbridge_splash_count_time_can_skip", "string", g10);
                int identifier2 = c10.getResources().getIdentifier("mbridge_splash_count_time_can_skip_not", "string", g10);
                int identifier3 = c10.getResources().getIdentifier("mbridge_splash_count_time_can_skip_s", "string", g10);
                this.f15124i = c10.getResources().getString(identifier);
                String string = c10.getResources().getString(identifier2);
                this.f15126k = string;
                this.f15123h = string;
                this.f15125j = c10.getResources().getString(identifier3);
                this.f15134s.setBackgroundResource(c10.getResources().getIdentifier("mbridge_splash_close_bg", "drawable", com.mbridge.msdk.foundation.controller.c.m().g()));
                this.f15134s.setTextColor(c10.getResources().getColor(c10.getResources().getIdentifier("mbridge_splash_count_time_skip_text_color", TtmlNode.ATTR_TTS_COLOR, g10)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void f() {
        int i10;
        MBSplashView mBSplashView;
        if (this.f15132q == null) {
            return;
        }
        boolean z10 = true;
        this.f15136v = true;
        if (this.f15118c != null && (mBSplashView = this.f15117b) != null) {
            if (mBSplashView.getContext() != null && (this.f15117b.getContext() instanceof Activity) && ((Activity) this.f15117b.getContext()).isFinishing()) {
                this.f15118c.a(this.f15121f, "Activity is finishing");
                return;
            } else if (this.f15117b.isShown()) {
                this.f15118c.a(this.f15121f);
            } else {
                this.f15118c.a(this.f15121f, "SplashView or container is not visibility");
            }
        }
        if (!this.f15132q.isReport()) {
            MBSplashView mBSplashView2 = this.f15117b;
            if (mBSplashView2 != null && !mBSplashView2.isDynamicView()) {
                CampaignEx campaignEx = this.f15132q;
                if (!campaignEx.isHasMBTplMark()) {
                    c(campaignEx, com.mbridge.msdk.foundation.controller.c.m().c(), this.f15120e);
                    campaignEx.setReport(true);
                    com.mbridge.msdk.foundation.same.a.b.a(this.f15120e, campaignEx, "splash");
                } else {
                    z10 = false;
                }
                if (z10) {
                    b(campaignEx, com.mbridge.msdk.foundation.controller.c.m().c(), this.f15120e);
                    a(campaignEx, com.mbridge.msdk.foundation.controller.c.m().c(), this.f15120e);
                }
            } else {
                CampaignEx campaignEx2 = this.f15132q;
                b(campaignEx2, com.mbridge.msdk.foundation.controller.c.m().c(), this.f15120e);
                c(campaignEx2, com.mbridge.msdk.foundation.controller.c.m().c(), this.f15120e);
                a(campaignEx2, com.mbridge.msdk.foundation.controller.c.m().c(), this.f15120e);
                campaignEx2.setReport(true);
                com.mbridge.msdk.foundation.same.a.b.a(this.f15120e, campaignEx2, "splash");
            }
            Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
            CampaignEx campaignEx3 = this.f15132q;
            String str = this.f15120e;
            if (campaignEx3 != null) {
                try {
                    if (campaignEx3.isMraid()) {
                        n nVar = new n();
                        nVar.f(campaignEx3.getRequestId());
                        nVar.g(campaignEx3.getRequestIdNotice());
                        nVar.e(campaignEx3.getId());
                        if (campaignEx3.isMraid()) {
                            i10 = n.a;
                        } else {
                            i10 = n.f13247b;
                        }
                        nVar.d(i10);
                        com.mbridge.msdk.foundation.same.report.g.d(nVar, c10.getApplicationContext(), str);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    private void g() {
        String str;
        if (this.f15133r) {
            str = this.f15124i + this.f15122g + this.f15125j;
        } else {
            str = this.f15122g + this.f15126k;
        }
        this.f15134s.setText(str);
    }

    public void a(CampaignEx campaignEx, boolean z10, String str) {
    }

    public final void e() {
        if (this.f15118c != null) {
            this.f15118c = null;
        }
        if (this.f15138x != null) {
            this.f15138x = null;
        }
        if (this.f15139y != null) {
            this.f15139y = null;
        }
        MBSplashView mBSplashView = this.f15117b;
        if (mBSplashView != null) {
            mBSplashView.destroy();
        }
        com.mbridge.msdk.foundation.d.b.a().c(this.f15120e);
    }

    /* loaded from: classes4.dex */
    public class a implements com.mbridge.msdk.splash.d.a {
        private a() {
        }

        @Override // com.mbridge.msdk.splash.d.a
        public final void a(int i10) {
            MBSplashView mBSplashView = b.this.f15117b;
            if (mBSplashView != null) {
                mBSplashView.changeCloseBtnState(i10);
            }
        }

        @Override // com.mbridge.msdk.splash.d.a
        public final void b(int i10) {
            ad.b("SplashShowManager", "resetCountdown" + i10);
            b bVar = b.this;
            bVar.f15122g = i10;
            bVar.f15130o.removeMessages(1);
            b.this.f15130o.sendEmptyMessageDelayed(1, 1000L);
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
        public final void a(boolean z10) {
            if (z10) {
                b.this.f15130o.removeMessages(1);
            }
        }

        @Override // com.mbridge.msdk.splash.d.a
        public final void a(boolean z10, String str) {
            try {
                if (b.this.f15118c != null) {
                    if (TextUtils.isEmpty(str)) {
                        b bVar = b.this;
                        bVar.f15118c.b(bVar.f15121f);
                    } else {
                        CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(CampaignEx.campaignToJsonObject(b.this.f15132q));
                        parseCampaignWithBackData.setClickURL(str);
                        b.this.a(parseCampaignWithBackData, true, str);
                    }
                }
            } catch (Exception e2) {
                ad.b("SplashShowManager", e2.getMessage());
            }
        }

        @Override // com.mbridge.msdk.splash.d.a
        public final void a(int i10, int i11) {
            if (i10 == 1) {
                b.this.f15130o.removeMessages(1);
            }
            if (i10 == 2) {
                b bVar = b.this;
                bVar.f15122g = i11;
                bVar.f15130o.removeMessages(1);
                b.this.f15130o.sendEmptyMessageDelayed(1, 1000L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i10) {
        com.mbridge.msdk.splash.a.c cVar;
        MBSplashView mBSplashView;
        try {
            com.mbridge.msdk.splash.d.d dVar = this.f15118c;
            if (dVar != null) {
                dVar.a(this.f15121f, i10);
                this.f15118c = null;
                com.mbridge.msdk.splash.e.a.a(this.f15120e, this.f15132q);
            }
            ImageView imageView = this.f15137w;
            if (imageView != null && imageView.getParent() != null && (mBSplashView = this.f15117b) != null) {
                mBSplashView.removeView(this.f15137w);
                this.f15137w.setVisibility(8);
            }
            this.f15136v = false;
            if (this.f15132q != null) {
                cVar = com.mbridge.msdk.splash.a.c.a().b(this.f15120e).d(this.f15132q.getRequestId()).g(this.f15132q.getRequestIdNotice()).c(this.f15132q.getId()).e(this.f15132q.getCreativeId() + "").a(this.f15132q.isBidCampaign());
            } else {
                cVar = null;
            }
            com.mbridge.msdk.splash.e.a.a(cVar, this.f15120e, i10);
            Handler handler = this.f15130o;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Exception e2) {
            ad.b("SplashShowManager", e2.getMessage());
        }
    }

    public final void d() {
        Handler handler;
        this.f15129n = false;
        if (this.f15117b != null && this.f15122g > 0 && (handler = this.f15130o) != null) {
            handler.removeMessages(1);
        }
        MBSplashView mBSplashView = this.f15117b;
        if (mBSplashView != null) {
            mBSplashView.onPause();
            MBSplashWebview splashWebview = this.f15117b.getSplashWebview();
            if (splashWebview == null || splashWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.splash.signal.d.a(splashWebview, "onSystemPause", "");
        }
    }

    public final void a(com.mbridge.msdk.splash.d.d dVar) {
        this.f15118c = dVar;
    }

    public final String b() {
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = this.f15132q;
        if (campaignEx != null) {
            arrayList.add(campaignEx);
        }
        return com.mbridge.msdk.foundation.same.c.a(arrayList);
    }

    public final void a(int i10) {
        this.f15122g = i10;
    }

    public final void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.setOnClickListener(this.f15139y);
        }
        this.f15135t = viewGroup;
    }

    public final void a(CampaignEx campaignEx, MBSplashView mBSplashView) {
        MBSplashView mBSplashView2;
        MBSplashView mBSplashView3;
        Context context;
        MBSplashWebview splashWebview;
        a(this.f15133r);
        this.f15132q = campaignEx;
        this.f15117b = mBSplashView;
        com.mbridge.msdk.splash.signal.c splashSignalCommunicationImpl = mBSplashView.getSplashSignalCommunicationImpl();
        com.mbridge.msdk.splash.signal.c cVar = splashSignalCommunicationImpl;
        if (splashSignalCommunicationImpl == null) {
            com.mbridge.msdk.splash.signal.c cVar2 = new com.mbridge.msdk.splash.signal.c(mBSplashView.getContext(), this.u, this.f15120e);
            ArrayList arrayList = new ArrayList();
            arrayList.add(campaignEx);
            cVar2.a(arrayList);
            cVar = cVar2;
        }
        cVar.b(this.f15122g);
        cVar.a(this.f15133r ? 1 : 0);
        RelativeLayout.LayoutParams layoutParams = null;
        boolean z10 = false;
        if (this.f15138x == null) {
            this.f15138x = new a();
        }
        cVar.a(this.f15138x);
        mBSplashView.setSplashSignalCommunicationImpl(cVar);
        boolean isHasMBTplMark = campaignEx.isHasMBTplMark();
        View view = this.f15135t;
        if (view == null) {
            if (isHasMBTplMark) {
                this.f15134s.setVisibility(8);
            }
            g();
            a(this.f15134s);
            mBSplashView.setCloseView(this.f15134s);
        } else {
            if (isHasMBTplMark) {
                view.setVisibility(8);
            }
            a(this.f15135t);
            mBSplashView.setCloseView(this.f15135t);
        }
        mBSplashView.show();
        CampaignEx campaignEx2 = this.f15132q;
        if (campaignEx2 != null && campaignEx2.isActiveOm() && (splashWebview = mBSplashView.getSplashWebview()) != null) {
            try {
                kd.b a10 = com.mbridge.msdk.a.b.a(com.mbridge.msdk.foundation.controller.c.m().c(), splashWebview, splashWebview.getUrl(), this.f15132q);
                if (a10 != null) {
                    splashWebview.setAdSession(a10);
                    a10.d(splashWebview);
                    a10.f();
                }
                ad.a("OMSDK", "adSession.start()");
            } catch (Throwable th2) {
                ad.a("OMSDK", th2.getMessage());
                CampaignEx campaignEx3 = this.f15132q;
                if (campaignEx3 != null) {
                    String requestId = campaignEx3.getRequestId();
                    String requestIdNotice = this.f15132q.getRequestIdNotice();
                    String id2 = this.f15132q.getId();
                    new h(splashWebview.getContext()).a(requestId, requestIdNotice, id2, this.f15120e, "fetch OM failed, exception" + th2.getMessage());
                }
            }
        }
        d.a(this.f15120e);
        this.f15130o.removeMessages(1);
        this.f15130o.sendEmptyMessageDelayed(1, 1000L);
        this.f15130o.sendEmptyMessageDelayed(2, 1000L);
        CampaignEx campaignEx4 = this.f15132q;
        if (campaignEx4 != null) {
            if ((campaignEx4.getPrivacyButtonTemplateVisibility() == 1) && (mBSplashView3 = this.f15117b) != null && mBSplashView3.getSplashWebview() != null && !this.f15117b.isDynamicView() && this.f15132q.isMraid() && (context = this.f15117b.getContext()) != null) {
                try {
                    int a11 = v.a(context, "mbridge_splash_notice", "drawable");
                    int a12 = ai.a(context, 35.0f);
                    int a13 = ai.a(context, 9.0f);
                    ImageView imageView = new ImageView(context);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a12, a12);
                    layoutParams2.addRule(9);
                    layoutParams2.addRule(10);
                    layoutParams2.setMargins(a13, a13, a13, a13);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    imageView.setBackgroundResource(a11);
                    ai.a(3, imageView, this.f15132q, context, true, new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.splash.c.b.7
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
                    this.f15117b.addView(imageView);
                } catch (Throwable th3) {
                    ad.b("SplashShowManager", th3.getMessage());
                }
            }
        }
        if (!this.f15132q.isMraid()) {
            CampaignEx campaignEx5 = this.f15132q;
            if (campaignEx5 != null) {
                campaignEx5.setCampaignUnitId(this.f15120e);
                com.mbridge.msdk.foundation.d.b.a().a(this.f15120e, 3);
                com.mbridge.msdk.foundation.d.b.a().a(this.f15120e, this.f15132q);
            }
            if (com.mbridge.msdk.foundation.d.b.a().b() && ((mBSplashView2 = this.f15117b) == null || !mBSplashView2.isDynamicView())) {
                com.mbridge.msdk.foundation.d.b.a().a(this.f15120e, new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.splash.c.b.3
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
                        } catch (Throwable th4) {
                            ad.b("SplashShowManager", th4.getMessage(), th4);
                            str = "";
                        }
                        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) b.this.f15117b.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
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
                        } catch (Throwable th4) {
                            ad.b("SplashShowManager", th4.getMessage(), th4);
                            str = "";
                        }
                        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) b.this.f15117b.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
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
                        } catch (Throwable th4) {
                            ad.b("SplashShowManager", th4.getMessage(), th4);
                            str2 = "";
                        }
                        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) b.this.f15117b.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
                    }
                });
                FeedBackButton b3 = com.mbridge.msdk.foundation.d.b.a().b(this.f15120e);
                if (b3 != null) {
                    try {
                        layoutParams = (RelativeLayout.LayoutParams) b3.getLayoutParams();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    if (layoutParams == null) {
                        layoutParams = new RelativeLayout.LayoutParams(com.mbridge.msdk.foundation.d.b.f13102b, com.mbridge.msdk.foundation.d.b.a);
                    }
                    layoutParams.topMargin = com.applovin.impl.mediation.ads.e.a(10.0f);
                    layoutParams.leftMargin = com.applovin.impl.mediation.ads.e.a(10.0f);
                    ViewGroup viewGroup = (ViewGroup) b3.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(b3);
                    }
                    MBSplashView mBSplashView4 = this.f15117b;
                    if (mBSplashView4 != null) {
                        mBSplashView4.addView(b3, layoutParams);
                    }
                }
            }
        }
        com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f15132q.getMaitve(), this.f15132q.getMaitve_src());
        try {
            BitmapDrawable a14 = com.mbridge.msdk.foundation.controller.c.m().a(this.f15120e, this.f15132q.getAdType());
            if (a14 != null) {
                if (this.f15137w == null) {
                    this.f15137w = new ImageView(com.mbridge.msdk.foundation.controller.c.m().c());
                }
                if (this.f15137w.getVisibility() != 0) {
                    this.f15137w.setVisibility(0);
                }
                ai.a(this.f15137w, a14, mBSplashView.getResources().getDisplayMetrics());
                if (this.f15137w.getParent() == null) {
                    mBSplashView.addView(this.f15137w, new ViewGroup.LayoutParams(-1, -1));
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void b(CampaignEx campaignEx, boolean z10, String str) {
        if (this.f15119d == null) {
            com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f15120e);
            this.f15119d = aVar;
            aVar.a(this.f15131p);
        }
        campaignEx.setCampaignUnitId(this.f15120e);
        this.f15119d.a(campaignEx);
        if (!this.f15132q.isReportClick()) {
            this.f15132q.setReportClick(true);
            com.mbridge.msdk.splash.e.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx);
        }
        com.mbridge.msdk.splash.d.d dVar = this.f15118c;
        if (dVar != null) {
            dVar.b(this.f15121f);
            b(3);
        }
        if (!z10 || TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = this.f15120e;
        try {
            if (TextUtils.isEmpty(str) || !campaignEx.isMraid()) {
                return;
            }
            new h(com.mbridge.msdk.foundation.controller.c.m().c()).a(campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), str2, str, campaignEx.isBidCampaign());
        } catch (Exception e2) {
            e2.printStackTrace();
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
            com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.a.a.f12480g);
        }
        if (TextUtils.isEmpty(str) || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().p() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getNativeVideoTracking().p(), false, false);
    }

    public final void c() {
        MBSplashView mBSplashView;
        Handler handler;
        this.f15129n = true;
        if (this.f15117b != null && this.f15122g > 0 && (handler = this.f15130o) != null) {
            handler.removeMessages(1);
            this.f15130o.sendEmptyMessageDelayed(1, 1000L);
        }
        if (com.mbridge.msdk.foundation.d.b.f13103c || (mBSplashView = this.f15117b) == null) {
            return;
        }
        mBSplashView.onResume();
        MBSplashWebview splashWebview = this.f15117b.getSplashWebview();
        if (splashWebview == null || splashWebview.isDestoryed()) {
            return;
        }
        com.mbridge.msdk.splash.signal.d.a(splashWebview, "onSystemPause", "");
    }

    public final void b(final int i10) {
        CampaignEx campaignEx;
        MBSplashWebview splashWebview;
        MBSplashView mBSplashView = this.f15117b;
        if (mBSplashView != null && (splashWebview = mBSplashView.getSplashWebview()) != null) {
            splashWebview.finishAdSession();
        }
        if (this.f15130o != null && (campaignEx = this.f15132q) != null && campaignEx.isActiveOm()) {
            this.f15130o.postDelayed(new Runnable() { // from class: com.mbridge.msdk.splash.c.b.5
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.c(i10);
                }
            }, 1500L);
        } else {
            c(i10);
        }
    }

    private void b(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(campaignEx.getOnlyImpressionURL())) {
                    return;
                }
                com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, com.mbridge.msdk.click.a.a.f12481h);
            } catch (Throwable th2) {
                ad.b("SplashShowManager", th2.getMessage());
            }
        }
    }

    public final String a() {
        CampaignEx campaignEx = this.f15132q;
        return (campaignEx == null || campaignEx.getRequestId() == null) ? "" : this.f15132q.getRequestId();
    }

    public final void a(boolean z10) {
        this.f15133r = z10;
        if (z10) {
            this.f15123h = this.f15124i;
        } else {
            this.f15123h = this.f15126k;
        }
    }

    private void a(View view) {
        if (view != null) {
            view.setOnClickListener(this.f15139y);
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
                ad.b("SplashShowManager", th2.getMessage());
            }
        }
    }

    public static /* synthetic */ void a(b bVar, int i10) {
        MBSplashView mBSplashView = bVar.f15117b;
        if (mBSplashView != null) {
            mBSplashView.updateCountdown(i10);
            if (bVar.f15117b.getSplashSignalCommunicationImpl() != null) {
                bVar.f15117b.getSplashSignalCommunicationImpl().c(i10);
            }
        }
        if (i10 < 0) {
            bVar.f15122g = i10;
            return;
        }
        com.mbridge.msdk.splash.d.d dVar = bVar.f15118c;
        if (dVar != null) {
            dVar.a(bVar.f15121f, i10 * 1000);
        }
        if (bVar.f15135t == null) {
            bVar.g();
        }
    }
}
