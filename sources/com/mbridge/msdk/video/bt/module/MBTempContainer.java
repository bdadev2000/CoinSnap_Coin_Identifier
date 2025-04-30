package com.mbridge.msdk.video.bt.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.r;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbsignalcommon.mraid.d;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.mbridge.msdk.scheme.applet.AppletModelManager;
import com.mbridge.msdk.scheme.applet.AppletSchemeCallBack;
import com.mbridge.msdk.scheme.applet.AppletsModel;
import com.mbridge.msdk.video.bt.module.b.h;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.module.a.a.m;
import com.mbridge.msdk.video.module.a.a.n;
import com.mbridge.msdk.video.signal.a.a;
import com.mbridge.msdk.video.signal.a.k;
import com.mbridge.msdk.video.signal.container.AbstractJSContainer;
import com.mbridge.msdk.videocommon.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class MBTempContainer extends MBTempContainerDiff {

    /* renamed from: x, reason: collision with root package name */
    private static final String f18377x = "MBTempContainer";

    /* renamed from: A, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.download.a f18378A;

    /* renamed from: B, reason: collision with root package name */
    private h f18379B;

    /* renamed from: C, reason: collision with root package name */
    private com.mbridge.msdk.video.bt.module.a.b f18380C;

    /* renamed from: D, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.e.a f18381D;

    /* renamed from: E, reason: collision with root package name */
    private int f18382E;

    /* renamed from: F, reason: collision with root package name */
    private String f18383F;

    /* renamed from: G, reason: collision with root package name */
    private com.mbridge.msdk.video.signal.factory.b f18384G;

    /* renamed from: H, reason: collision with root package name */
    private int f18385H;

    /* renamed from: I, reason: collision with root package name */
    private int f18386I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f18387J;

    /* renamed from: K, reason: collision with root package name */
    private int f18388K;

    /* renamed from: L, reason: collision with root package name */
    private int f18389L;

    /* renamed from: M, reason: collision with root package name */
    private int f18390M;

    /* renamed from: N, reason: collision with root package name */
    private int f18391N;
    private int O;

    /* renamed from: P, reason: collision with root package name */
    private String f18392P;

    /* renamed from: Q, reason: collision with root package name */
    private String f18393Q;

    /* renamed from: R, reason: collision with root package name */
    private List<CampaignEx> f18394R;

    /* renamed from: S, reason: collision with root package name */
    private int f18395S;

    /* renamed from: T, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.d.b f18396T;

    /* renamed from: U, reason: collision with root package name */
    private LayoutInflater f18397U;

    /* renamed from: V, reason: collision with root package name */
    private int f18398V;

    /* renamed from: W, reason: collision with root package name */
    private int f18399W;

    /* renamed from: a, reason: collision with root package name */
    protected boolean f18400a;
    private View aa;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private boolean ae;
    private boolean af;
    private boolean ag;
    private boolean ah;
    private boolean ai;
    private boolean aj;
    private boolean ak;
    private com.mbridge.msdk.mbsignalcommon.mraid.d al;
    private O5.b am;
    private P5.b an;
    private O5.a ao;
    private Runnable ap;
    private boolean aq;
    protected boolean b;

    /* renamed from: c, reason: collision with root package name */
    protected a f18401c;

    /* renamed from: d, reason: collision with root package name */
    protected WindVaneWebView f18402d;

    /* renamed from: e, reason: collision with root package name */
    protected MBridgeContainerView f18403e;

    /* renamed from: f, reason: collision with root package name */
    protected Handler f18404f;

    /* renamed from: g, reason: collision with root package name */
    protected Runnable f18405g;

    /* renamed from: h, reason: collision with root package name */
    protected Runnable f18406h;

    /* renamed from: y, reason: collision with root package name */
    private View f18407y;

    /* renamed from: z, reason: collision with root package name */
    private CampaignEx f18408z;

    /* loaded from: classes3.dex */
    public interface a {
        void a(String str);

        void a(boolean z8);

        /* renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0193a implements a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f18419a = false;

            @Override // com.mbridge.msdk.video.bt.module.MBTempContainer.a
            public void a(String str) {
                ad.b("ActivityErrorListener", str);
                this.f18419a = true;
            }

            @Override // com.mbridge.msdk.video.bt.module.MBTempContainer.a
            public final void a(boolean z8) {
                this.f18419a = z8;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends AppletSchemeCallBack {

        /* renamed from: a, reason: collision with root package name */
        private CampaignEx f18420a;

        public b(CampaignEx campaignEx) {
            this.f18420a = campaignEx;
        }

        @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
        public final void onRequestFailed(int i9, String str, String str2) {
            if (MBridgeConstans.DEBUG) {
                ad.a(MBTempContainer.f18377x, "request wx scheme failed: errorCode: " + i9 + " errorMessage: " + str);
            }
            try {
                CampaignEx campaignEx = this.f18420a;
                if (campaignEx != null) {
                    campaignEx.setClickURL(str2);
                }
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b(MBTempContainer.f18377x, e4.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
        public final void onRequestStart() {
            if (MBridgeConstans.DEBUG) {
                ad.a(MBTempContainer.f18377x, "start request wx scheme");
            }
        }

        @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
        public final void onRequestSuccess(String str) {
            if (MBridgeConstans.DEBUG) {
                ad.a(MBTempContainer.f18377x, "request wx scheme success");
            }
            try {
                CampaignEx campaignEx = this.f18420a;
                if (campaignEx != null) {
                    campaignEx.setDeepLinkUrl(str);
                }
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b(MBTempContainer.f18377x, e4.getMessage());
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class c extends com.mbridge.msdk.video.module.a.a.a {
        public c(Activity activity, CampaignEx campaignEx) {
            super(activity, campaignEx);
        }

        @Override // com.mbridge.msdk.video.module.a.a.a, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
        public final void a(int i9, Object obj) {
            if (com.mbridge.msdk.e.b.a()) {
                MBTempContainer.this.setChinaJsCommonContext();
            }
            String str = "";
            if (i9 != 108) {
                if (i9 != 113) {
                    if (i9 != 117) {
                        if (i9 != 126 && i9 != 128) {
                            if (i9 != 131) {
                                switch (i9) {
                                    case 103:
                                    case 104:
                                        MBTempContainer.r(MBTempContainer.this);
                                        break;
                                    case 105:
                                        if (com.mbridge.msdk.e.b.a()) {
                                            MBTempContainer.this.setChinaCTACallBack();
                                        }
                                        com.mbridge.msdk.video.signal.d jSCommon = MBTempContainer.this.getJSCommon();
                                        if (obj != null) {
                                            str = obj.toString();
                                        }
                                        jSCommon.click(1, str);
                                        break;
                                    case 106:
                                        if (com.mbridge.msdk.e.b.a()) {
                                            MBTempContainer mBTempContainer = MBTempContainer.this;
                                            mBTempContainer.setChinaBrowserCallBack(mBTempContainer.f18380C, MBTempContainer.this.f18383F, MBTempContainer.this.f18379B, MBTempContainer.this.f18408z);
                                            if (((AbstractJSContainer) MBTempContainer.this).f19286i != null && MBTempContainer.this.f18408z != null) {
                                                MBTempContainer.r(MBTempContainer.this);
                                                break;
                                            }
                                        }
                                        break;
                                }
                            } else {
                                MBTempContainer.this.f18379B.a(true, ((AbstractJSContainer) MBTempContainer.this).f19288k, ((AbstractJSContainer) MBTempContainer.this).f19287j);
                            }
                        } else {
                            MBTempContainer.this.f18379B.a(false, ((AbstractJSContainer) MBTempContainer.this).f19288k, ((AbstractJSContainer) MBTempContainer.this).f19287j);
                        }
                    } else {
                        MBridgeVideoView mBridgeVideoView = MBTempContainer.this.mbridgeVideoView;
                        if (mBridgeVideoView != null) {
                            mBridgeVideoView.setVisible(4);
                        }
                        MBTempContainer.this.ai = true;
                        MBTempContainer.this.f18379B.b(((AbstractJSContainer) MBTempContainer.this).f19288k, ((AbstractJSContainer) MBTempContainer.this).f19287j);
                    }
                }
                MBTempContainer.this.f18379B.a(true, ((AbstractJSContainer) MBTempContainer.this).f19288k, ((AbstractJSContainer) MBTempContainer.this).f19287j);
            } else {
                if (com.mbridge.msdk.e.b.a()) {
                    MBTempContainer mBTempContainer2 = MBTempContainer.this;
                    mBTempContainer2.setChinaCallBackStatus(mBTempContainer2.f18402d);
                }
                MBTempContainer.this.getJSCommon().a(new a.b(MBTempContainer.this.getJSCommon(), new e()));
                com.mbridge.msdk.video.signal.d jSCommon2 = MBTempContainer.this.getJSCommon();
                if (obj != null) {
                    str = obj.toString();
                }
                jSCommon2.click(1, str);
            }
            super.a(i9, obj);
        }
    }

    /* loaded from: classes3.dex */
    public final class d extends com.mbridge.msdk.video.module.a.a.f {
        private d() {
        }

        @Override // com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
        public final void a(int i9, Object obj) {
            String str;
            super.a(i9, obj);
            try {
                if (obj instanceof JSONObject) {
                    str = obj.toString();
                } else {
                    str = (String) obj;
                }
                if (((AbstractJSContainer) MBTempContainer.this).f19292q && !TextUtils.isEmpty(str)) {
                    JSONObject jSONObject = new JSONObject(str);
                    int optInt = jSONObject.optInt("type");
                    int optInt2 = jSONObject.optInt(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE);
                    if (optInt != 2) {
                        if (optInt != 3) {
                            MBTempContainer.this.f18385H = com.mbridge.msdk.foundation.same.a.f15659F;
                        } else {
                            MBTempContainer.this.f18385H = com.mbridge.msdk.foundation.same.a.f15658E;
                        }
                    } else {
                        MBTempContainer.this.f18385H = com.mbridge.msdk.foundation.same.a.f15657D;
                    }
                    MBTempContainer.this.f18386I = optInt2;
                }
            } catch (Exception unused) {
                ad.b("NotifyListener", "PlayableResultListener ERROR");
            }
            if (i9 != 120) {
                String str2 = "";
                if (i9 != 131) {
                    if (i9 != 126) {
                        if (i9 != 127) {
                            switch (i9) {
                                case 100:
                                    MBTempContainer.this.aj = true;
                                    MBTempContainer mBTempContainer = MBTempContainer.this;
                                    mBTempContainer.f18404f.postDelayed(mBTempContainer.ap, 250L);
                                    MBTempContainer.this.f18379B.a(MBTempContainer.this.f18396T);
                                    return;
                                case 101:
                                case 102:
                                    MBTempContainer.this.getJSCommon().d();
                                    return;
                                case 103:
                                    MBTempContainer.this.ac = true;
                                    if (MBTempContainer.this.f18408z.isMraid()) {
                                        MBTempContainer.r(MBTempContainer.this);
                                        return;
                                    } else {
                                        MBTempContainer.this.getJSCommon().d();
                                        return;
                                    }
                                case 104:
                                    MBTempContainer.r(MBTempContainer.this);
                                    return;
                                case 105:
                                    if (com.mbridge.msdk.e.b.a()) {
                                        MBTempContainer.this.setChinaCTACallBack();
                                    }
                                    com.mbridge.msdk.video.signal.d jSCommon = MBTempContainer.this.getJSCommon();
                                    if (obj != null) {
                                        str2 = obj.toString();
                                    }
                                    jSCommon.click(1, str2);
                                    return;
                                default:
                                    return;
                            }
                        }
                        MBTempContainer.this.ac = true;
                        MBTempContainer.this.f18379B.a(MBTempContainer.this.f18396T);
                        MBTempContainer.this.f18379B.b(((AbstractJSContainer) MBTempContainer.this).f19288k, ((AbstractJSContainer) MBTempContainer.this).f19287j);
                        MBTempContainer.this.getJSContainerModule().showEndcard(100);
                        return;
                    }
                    MBTempContainer.this.f18379B.a(false, ((AbstractJSContainer) MBTempContainer.this).f19288k, ((AbstractJSContainer) MBTempContainer.this).f19287j);
                    return;
                }
                com.mbridge.msdk.video.signal.d jSCommon2 = MBTempContainer.this.getJSCommon();
                if (obj != null) {
                    str2 = obj.toString();
                }
                jSCommon2.click(4, str2);
                return;
            }
            MBTempContainer.this.f18379B.b(((AbstractJSContainer) MBTempContainer.this).f19288k, ((AbstractJSContainer) MBTempContainer.this).f19287j);
        }
    }

    /* loaded from: classes3.dex */
    public final class f extends com.mbridge.msdk.video.module.a.a.f {
        private f() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0090, code lost:
        
            if (r6.f18424a.f18408z.isCampaignIsFiltered() != false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x01a5, code lost:
        
            if (r6.f18424a.f18408z.isCampaignIsFiltered() != false) goto L69;
         */
        @Override // com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(int r7, java.lang.Object r8) {
            /*
                Method dump skipped, instructions count: 530
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.bt.module.MBTempContainer.f.a(int, java.lang.Object):void");
        }
    }

    public MBTempContainer(Context context) {
        super(context);
        this.f18382E = 1;
        this.f18383F = "";
        this.f18385H = com.mbridge.msdk.foundation.same.a.f15659F;
        this.f18387J = false;
        this.f18392P = "";
        this.f18394R = new ArrayList();
        this.f18395S = 0;
        this.f18400a = false;
        this.b = false;
        this.f18401c = new a.C0193a();
        this.f18404f = new Handler();
        this.f18398V = 0;
        this.f18399W = 0;
        this.f18405g = new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.1
            @Override // java.lang.Runnable
            public final void run() {
                if (MBTempContainer.this.getActivityProxy().h() != 0) {
                    MBTempContainer.this.f18398V = -3;
                } else {
                    MBTempContainer.this.defaultLoad(-1, "WebView load timeout");
                }
            }
        };
        this.f18406h = new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.3
            @Override // java.lang.Runnable
            public final void run() {
                if (MBTempContainer.this.getActivityProxy().h() != 0) {
                    MBTempContainer.this.f18398V = -4;
                } else {
                    MBTempContainer.this.defaultLoad(-3, "Signal Communication connect timeout");
                }
            }
        };
        this.ab = false;
        this.ac = false;
        this.ad = false;
        this.af = false;
        this.ag = false;
        this.ah = false;
        this.ai = false;
        this.aj = false;
        this.ak = false;
        this.am = null;
        this.an = null;
        this.ao = null;
        this.ap = new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.6
            @Override // java.lang.Runnable
            public final void run() {
                if (MBTempContainer.this.aa != null) {
                    MBTempContainer.this.aa.setVisibility(8);
                }
            }
        };
        this.aq = false;
        init(context);
    }

    public static /* synthetic */ void P(MBTempContainer mBTempContainer) {
        if (mBTempContainer.isLoadSuccess()) {
            mBTempContainer.f19286i.runOnUiThread(new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.10
                @Override // java.lang.Runnable
                public final void run() {
                    MBTempContainer.this.aa.setBackgroundColor(0);
                    MBTempContainer.this.aa.setVisibility(0);
                    MBTempContainer.this.aa.bringToFront();
                }
            });
        }
    }

    public static /* synthetic */ void R(MBTempContainer mBTempContainer) {
        if (mBTempContainer.isLoadSuccess()) {
            mBTempContainer.f19286i.runOnUiThread(new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.2
                @Override // java.lang.Runnable
                public final void run() {
                    MBTempContainer.this.aa.setVisibility(8);
                }
            });
        }
    }

    public static /* synthetic */ void h(MBTempContainer mBTempContainer) {
        try {
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a("temp_container", mBTempContainer.getWidth() + "x" + mBTempContainer.getHeight());
            if (mBTempContainer.f18402d != null) {
                dVar.a("web_view", mBTempContainer.f18402d.getWidth() + "x" + mBTempContainer.f18402d.getHeight());
            }
            if (mBTempContainer.mbridgeVideoView != null) {
                dVar.a("mbridge_video_view", mBTempContainer.mbridgeVideoView.getWidth() + "x" + mBTempContainer.mbridgeVideoView.getHeight());
                if (mBTempContainer.mbridgeVideoView.mPlayerView != null) {
                    dVar.a("player_view", mBTempContainer.mbridgeVideoView.mPlayerView.getWidth() + "x" + mBTempContainer.mbridgeVideoView.mPlayerView.getHeight());
                }
            }
            com.mbridge.msdk.foundation.same.report.d.b bVar = mBTempContainer.f18396T;
            if (bVar != null) {
                bVar.a("2000136", dVar);
            }
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
        }
    }

    public static /* synthetic */ void r(MBTempContainer mBTempContainer) {
        int i9;
        try {
            com.mbridge.msdk.video.bt.module.a.b bVar = mBTempContainer.f18380C;
            if (bVar != null) {
                if (mBTempContainer.f19292q && ((i9 = mBTempContainer.f19294s) == com.mbridge.msdk.foundation.same.a.f15660G || i9 == com.mbridge.msdk.foundation.same.a.f15661H)) {
                    boolean z8 = true;
                    if (mBTempContainer.f18386I != 1) {
                        z8 = false;
                    }
                    bVar.a(z8, mBTempContainer.f18385H);
                }
                mBTempContainer.f18380C.a(mBTempContainer.f18383F, mBTempContainer.ac, mBTempContainer.f19289n);
                return;
            }
            Activity activity = mBTempContainer.f19286i;
            if (activity != null) {
                activity.finish();
            }
        } catch (Exception unused) {
            Activity activity2 = mBTempContainer.f19286i;
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    public boolean canBackPress() {
        MBridgeContainerView mBridgeContainerView = this.f18403e;
        if (mBridgeContainerView != null && !mBridgeContainerView.canBackPress()) {
            return false;
        }
        return true;
    }

    public void defaultLoad(int i9, String str) {
        int i10;
        int e4;
        int i11;
        superDefaultLoad(i9, str);
        CampaignEx campaignEx = this.f18408z;
        if (campaignEx != null && !campaignEx.isDynamicView()) {
            this.f18408z.setTemplateRenderSucc(false);
        }
        if (isLoadSuccess()) {
            if (this.f18408z.getPlayable_ads_without_video() == 2) {
                this.f18403e.setCampaign(this.f18408z);
                this.f18403e.addOrderViewData(this.f18394R);
                this.f18403e.setUnitID(this.f19287j);
                this.f18403e.setCloseDelayTime(i());
                this.f18403e.setPlayCloseBtnTm(this.l.h());
                this.f18403e.setNotifyListener(new com.mbridge.msdk.video.module.a.a.h(this.f18408z, this.f18378A, this.f19289n, b(), this.f19287j, new d(), this.l.y(), this.f19297v));
                this.f18403e.preLoadData(this.f18384G);
                this.f18403e.showPlayableView();
            } else {
                a(i9, str);
                this.aa.setVisibility(8);
                loadModuleDatas();
                int f9 = this.l.f();
                int c9 = c();
                if (c9 != 0) {
                    i10 = c9;
                } else {
                    i10 = f9;
                }
                CampaignEx campaignEx2 = this.f18408z;
                if (campaignEx2 != null && campaignEx2.isDynamicView()) {
                    this.mbridgeVideoView.setContainerViewOnNotifyListener(new c(this.f19286i, this.f18408z));
                }
                CampaignEx campaignEx3 = this.f18408z;
                if (campaignEx3 != null && campaignEx3.getVst() > -2) {
                    e4 = this.f18408z.getVst();
                } else {
                    e4 = this.l.e();
                }
                CampaignEx campaignEx4 = this.f18408z;
                if (campaignEx4 != null && campaignEx4.getDynamicTempCode() == 5 && (i11 = this.f18382E) > 1) {
                    e4 = a(e4, i11);
                    this.f18408z.setVst(e4);
                }
                int i12 = e4;
                this.mbridgeVideoView.setVideoSkipTime(i12);
                MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
                mBridgeVideoView.setNotifyListener(new m(mBridgeVideoView, this.f18403e, this.f18408z, this.f19289n, this.f18378A, b(), this.f19287j, i10, i12, new f(), this.l.y(), this.f19297v, this.l.C()));
                this.mbridgeVideoView.setAdSession(this.am);
                this.mbridgeVideoView.setVideoEvents(this.an);
                this.mbridgeVideoView.defaultShow();
                MBridgeContainerView mBridgeContainerView = this.f18403e;
                mBridgeContainerView.setNotifyListener(new com.mbridge.msdk.video.module.a.a.b(this.mbridgeVideoView, mBridgeContainerView, this.f18408z, this.f19289n, this.f18378A, b(), this.f19287j, new c(this.f19286i, this.f18408z), this.l.y(), this.f19297v));
                this.f18403e.defaultShow();
            }
            g();
            return;
        }
        a(i9, str);
        Activity activity = this.f19286i;
        if (activity != null) {
            activity.finish();
        }
    }

    public int findID(String str) {
        return v.a(getContext(), str, "id");
    }

    public int findLayout(String str) {
        return v.a(getContext(), str, TtmlNode.TAG_LAYOUT);
    }

    public MBridgeContainerView findMBridgeContainerView() {
        return (MBridgeContainerView) findViewById(findID("mbridge_video_templete_container"));
    }

    public MBridgeVideoView findMBridgeVideoView() {
        return (MBridgeVideoView) findViewById(findID("mbridge_video_templete_videoview"));
    }

    public WindVaneWebView findWindVaneWebView() {
        a.C0202a a6;
        try {
            if (this.f19297v) {
                CampaignEx campaignEx = this.f18408z;
                if (campaignEx != null && campaignEx.getRewardTemplateMode() != null) {
                    a.C0202a a9 = com.mbridge.msdk.videocommon.a.a(this.f19287j + "_" + this.f18408z.getId() + "_" + this.f18408z.getRequestId() + "_" + this.f18408z.getRewardTemplateMode().e());
                    if (a9 != null) {
                        return a9.a();
                    }
                    return null;
                }
                return null;
            }
            if (this.f19292q) {
                a6 = com.mbridge.msdk.videocommon.a.a(287, this.f18408z);
            } else {
                a6 = com.mbridge.msdk.videocommon.a.a(94, this.f18408z);
            }
            if (a6 != null && a6.c()) {
                if (this.f19292q) {
                    com.mbridge.msdk.videocommon.a.b(287, this.f18408z);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.f18408z);
                }
                WindVaneWebView a10 = a6.a();
                if (this.af) {
                    a10.setWebViewTransparent();
                }
                return a10;
            }
            return null;
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
                return null;
            }
            return null;
        }
    }

    public O5.a getAdEvents() {
        return this.ao;
    }

    public O5.b getAdSession() {
        return this.am;
    }

    public CampaignEx getCampaign() {
        return this.f18408z;
    }

    public String getInstanceId() {
        return this.f18383F;
    }

    public int getLayoutID() {
        String str;
        if (this.af) {
            str = "mbridge_reward_activity_video_templete_transparent";
        } else {
            str = "mbridge_reward_activity_video_templete";
        }
        return findLayout(str);
    }

    public P5.b getVideoEvents() {
        return this.an;
    }

    public void init(Context context) {
        this.f18397U = LayoutInflater.from(context);
    }

    public boolean initViews() {
        View findViewById = findViewById(findID("mbridge_video_templete_progressbar"));
        this.aa = findViewById;
        if (findViewById != null) {
            return true;
        }
        return false;
    }

    public boolean isLoadSuccess() {
        return this.b;
    }

    public void loadModuleDatas() {
        int i9;
        int i10;
        int e4;
        int i11;
        int i12;
        int i13;
        k b8 = b(this.f18408z);
        if (b8 != null) {
            i9 = b8.n();
        } else {
            i9 = 0;
        }
        if (i9 != 0) {
            this.f19291p = i9;
        }
        int f9 = this.l.f();
        int c9 = c();
        if (c9 != 0) {
            i10 = c9;
        } else {
            i10 = f9;
        }
        this.mbridgeVideoView.setSoundState(this.f19291p);
        this.mbridgeVideoView.setCampaign(this.f18408z);
        this.mbridgeVideoView.setPlayURL(this.f18378A.t());
        CampaignEx campaignEx = this.f18408z;
        if (campaignEx != null && campaignEx.getVst() > -2) {
            e4 = this.f18408z.getVst();
        } else {
            e4 = this.l.e();
        }
        CampaignEx campaignEx2 = this.f18408z;
        if (campaignEx2 != null && campaignEx2.getDynamicTempCode() == 5 && (i13 = this.f18382E) > 1) {
            e4 = a(e4, i13);
            this.f18408z.setVst(e4);
        }
        this.mbridgeVideoView.setVideoSkipTime(e4);
        this.mbridgeVideoView.setCloseAlert(this.l.i());
        this.mbridgeVideoView.setBufferTimeout(h());
        int i14 = e4;
        this.mbridgeVideoView.setNotifyListener(new n(this.f18384G, this.f18408z, this.f19289n, this.f18378A, b(), this.f19287j, i10, e4, new f(), this.l.y(), this.f19297v, this.l.C()));
        this.mbridgeVideoView.setShowingTransparent(this.af);
        this.mbridgeVideoView.setAdSession(this.am);
        if (this.f19292q && ((i11 = this.f19294s) == com.mbridge.msdk.foundation.same.a.f15660G || i11 == com.mbridge.msdk.foundation.same.a.f15661H)) {
            this.mbridgeVideoView.setIVRewardEnable(i11, this.f19295t, this.f19296u);
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            if (getJSCommon() != null) {
                i12 = getJSCommon().h();
            } else {
                i12 = 1;
            }
            mBridgeVideoView.setDialogRole(i12);
        }
        this.f18403e.setCampaign(this.f18408z);
        this.f18403e.addOrderViewData(this.f18394R);
        this.f18403e.setUnitID(this.f19287j);
        this.f18403e.setCloseDelayTime(i());
        this.f18403e.setPlayCloseBtnTm(this.l.h());
        this.f18403e.setVideoInteractiveType(this.l.g());
        this.f18403e.setEndscreenType(this.l.q());
        this.f18403e.setVideoSkipTime(i14);
        this.f18403e.setShowingTransparent(this.af);
        this.f18403e.setJSFactory(this.f18384G);
        if (this.f18408z.getPlayable_ads_without_video() == 2) {
            this.f18403e.setNotifyListener(new com.mbridge.msdk.video.module.a.a.h(this.f18408z, this.f18378A, this.f19289n, b(), this.f19287j, new d(), this.l.y(), this.f19297v));
            this.f18403e.preLoadData(this.f18384G);
            this.f18403e.showPlayableView();
        } else {
            this.f18403e.setNotifyListener(new com.mbridge.msdk.video.module.a.a.c(this.f18384G, this.f18408z, this.f19289n, this.f18378A, b(), this.f19287j, new c(this.f19286i, this.f18408z), this.l.y(), this.f19297v));
            this.f18403e.preLoadData(this.f18384G);
            this.mbridgeVideoView.preLoadData(this.f18384G);
        }
        if (this.af) {
            this.f18403e.setMBridgeClickMiniCardViewTransparent();
        }
    }

    public void onBackPressed() {
        MBridgeContainerView mBridgeContainerView;
        MBridgeContainerView mBridgeContainerView2;
        MBridgeVideoView mBridgeVideoView;
        MBridgeVideoView mBridgeVideoView2;
        if (this.af && (mBridgeVideoView2 = this.mbridgeVideoView) != null) {
            mBridgeVideoView2.notifyVideoClose();
            return;
        }
        CampaignEx campaignEx = this.f18408z;
        if (((campaignEx != null && campaignEx.getRewardTemplateMode() != null && this.f18408z.getRewardTemplateMode().f() == 5002010) || this.ah) && (mBridgeVideoView = this.mbridgeVideoView) != null) {
            if (mBridgeVideoView.isMiniCardShowing()) {
                MBridgeContainerView mBridgeContainerView3 = this.f18403e;
                if (mBridgeContainerView3 != null) {
                    mBridgeContainerView3.onMiniEndcardBackPress();
                    return;
                }
                return;
            }
            this.mbridgeVideoView.onBackPress();
            return;
        }
        if (this.aj && (mBridgeContainerView2 = this.f18403e) != null) {
            mBridgeContainerView2.onPlayableBackPress();
            return;
        }
        if (this.ai && (mBridgeContainerView = this.f18403e) != null) {
            mBridgeContainerView.onEndcardBackPress();
        }
        if (getJSCommon().b()) {
            if (getJSContainerModule() == null || !getJSContainerModule().miniCardShowing()) {
                getActivityProxy().g();
                return;
            }
            return;
        }
        if (canBackPress()) {
            Activity activity = this.f19286i;
            if (activity != null && !this.f19297v && !this.ak) {
                this.ak = true;
                activity.onBackPressed();
                return;
            }
            return;
        }
        ad.a(f18377x, "onBackPressed can't excute");
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate() {
        ViewGroup viewGroup;
        int f9;
        int e4;
        List<CampaignEx> list;
        AppletsModel appletsModel;
        if (this.l == null) {
            this.l = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f19287j, this.f19292q);
        }
        try {
            if (this.f18408z != null) {
                try {
                    appletsModel = AppletModelManager.getInstance().get(this.f18408z);
                } catch (Exception e9) {
                    if (MBridgeConstans.DEBUG) {
                        e9.printStackTrace();
                    }
                    appletsModel = null;
                }
                if (appletsModel != null) {
                    try {
                        if (appletsModel.can(0)) {
                            appletsModel.setUserClick(false);
                            appletsModel.requestWxAppletsScheme(0, new b(this.f18408z));
                        }
                    } catch (Exception e10) {
                        appletsModel.clearRequestState();
                        if (MBridgeConstans.DEBUG) {
                            e10.printStackTrace();
                        }
                    }
                }
            }
        } catch (Exception e11) {
            if (MBridgeConstans.DEBUG) {
                e11.printStackTrace();
            }
        }
        this.ak = false;
        try {
            if (this.f19297v) {
                CampaignEx campaignEx = this.f18408z;
                if (campaignEx != null && campaignEx.isDynamicView()) {
                    this.f18379B = new com.mbridge.msdk.video.bt.module.b.d(getContext(), this.f19292q, this.l, this.f18408z, this.f18379B, b(), this.f19287j);
                } else {
                    this.f18379B = new com.mbridge.msdk.video.bt.module.b.c(this.f18380C, this.f18383F);
                }
            } else {
                this.f18379B = new com.mbridge.msdk.video.bt.module.b.d(getContext(), this.f19292q, this.l, this.f18408z, this.f18379B, b(), this.f19287j);
            }
            registerErrorListener(new com.mbridge.msdk.video.bt.module.b.e(this.f18396T, this.f18379B));
            a(this.l, this.f18408z);
            setShowingTransparent();
            int layoutID = getLayoutID();
            if (layoutID <= 0) {
                a("layoutID not found");
                return;
            }
            View inflate = this.f18397U.inflate(layoutID, (ViewGroup) null);
            this.f18407y = inflate;
            addView(inflate, new RelativeLayout.LayoutParams(-1, -1));
            if (this.f18400a) {
                setMatchParent();
            }
            this.f18402d = findWindVaneWebView();
            MBridgeVideoView findMBridgeVideoView = findMBridgeVideoView();
            this.mbridgeVideoView = findMBridgeVideoView;
            findMBridgeVideoView.setVideoLayout(this.f18408z);
            this.mbridgeVideoView.setIsIV(this.f19292q);
            this.mbridgeVideoView.setUnitId(this.f19287j);
            this.mbridgeVideoView.setCamPlayOrderCallback(this.f18381D, this.f18394R, this.f18382E, this.f18395S);
            if (this.f19297v) {
                this.mbridgeVideoView.setNotchPadding(this.f18389L, this.f18390M, this.f18391N, this.O);
            }
            MBridgeContainerView findMBridgeContainerView = findMBridgeContainerView();
            this.f18403e = findMBridgeContainerView;
            if (this.f19297v) {
                findMBridgeContainerView.setNotchPadding(this.f18388K, this.f18389L, this.f18390M, this.f18391N, this.O);
            }
            if (af.a().a("i_l_s_t_r_i", false)) {
                this.mbridgeVideoView.setPlayerViewAttachListener(new MBridgeVideoView.a() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.4
                    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
                    
                        if (r4.f18413a.f18408z.isCampaignIsFiltered() != false) goto L12;
                     */
                    @Override // com.mbridge.msdk.video.module.MBridgeVideoView.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void a() {
                        /*
                            r4 = this;
                            com.mbridge.msdk.video.bt.module.MBTempContainer r0 = com.mbridge.msdk.video.bt.module.MBTempContainer.this
                            com.mbridge.msdk.foundation.entity.CampaignEx r0 = com.mbridge.msdk.video.bt.module.MBTempContainer.a(r0)
                            if (r0 == 0) goto L68
                            com.mbridge.msdk.video.bt.module.MBTempContainer r0 = com.mbridge.msdk.video.bt.module.MBTempContainer.this
                            com.mbridge.msdk.video.bt.module.MBTempContainer.b(r0)
                            com.mbridge.msdk.video.bt.module.MBTempContainer r0 = com.mbridge.msdk.video.bt.module.MBTempContainer.this
                            com.mbridge.msdk.foundation.entity.CampaignEx r0 = com.mbridge.msdk.video.bt.module.MBTempContainer.a(r0)
                            boolean r0 = r0.isDynamicView()
                            if (r0 == 0) goto L3e
                            com.mbridge.msdk.video.bt.module.MBTempContainer r0 = com.mbridge.msdk.video.bt.module.MBTempContainer.this
                            boolean r0 = com.mbridge.msdk.video.bt.module.MBTempContainer.c(r0)
                            if (r0 == 0) goto L2e
                            com.mbridge.msdk.video.bt.module.MBTempContainer r0 = com.mbridge.msdk.video.bt.module.MBTempContainer.this
                            com.mbridge.msdk.foundation.entity.CampaignEx r0 = com.mbridge.msdk.video.bt.module.MBTempContainer.a(r0)
                            boolean r0 = r0.isCampaignIsFiltered()
                            if (r0 == 0) goto L4d
                            goto L3e
                        L2e:
                            com.mbridge.msdk.video.bt.module.MBTempContainer r0 = com.mbridge.msdk.video.bt.module.MBTempContainer.this
                            com.mbridge.msdk.video.bt.module.b.h r0 = com.mbridge.msdk.video.bt.module.MBTempContainer.e(r0)
                            com.mbridge.msdk.video.bt.module.MBTempContainer r1 = com.mbridge.msdk.video.bt.module.MBTempContainer.this
                            com.mbridge.msdk.foundation.same.report.d.b r1 = com.mbridge.msdk.video.bt.module.MBTempContainer.d(r1)
                            r0.a(r1)
                            goto L4d
                        L3e:
                            com.mbridge.msdk.video.bt.module.MBTempContainer r0 = com.mbridge.msdk.video.bt.module.MBTempContainer.this
                            com.mbridge.msdk.video.bt.module.b.h r0 = com.mbridge.msdk.video.bt.module.MBTempContainer.e(r0)
                            com.mbridge.msdk.video.bt.module.MBTempContainer r1 = com.mbridge.msdk.video.bt.module.MBTempContainer.this
                            com.mbridge.msdk.foundation.same.report.d.b r1 = com.mbridge.msdk.video.bt.module.MBTempContainer.d(r1)
                            r0.a(r1)
                        L4d:
                            com.mbridge.msdk.video.bt.module.MBTempContainer r0 = com.mbridge.msdk.video.bt.module.MBTempContainer.this
                            android.content.Context r0 = r0.getContext()
                            com.mbridge.msdk.video.bt.module.MBTempContainer r1 = com.mbridge.msdk.video.bt.module.MBTempContainer.this
                            com.mbridge.msdk.foundation.entity.CampaignEx r1 = com.mbridge.msdk.video.bt.module.MBTempContainer.a(r1)
                            com.mbridge.msdk.video.bt.module.MBTempContainer r2 = com.mbridge.msdk.video.bt.module.MBTempContainer.this
                            java.lang.String r2 = com.mbridge.msdk.video.bt.module.MBTempContainer.f(r2)
                            com.mbridge.msdk.video.bt.module.MBTempContainer r3 = com.mbridge.msdk.video.bt.module.MBTempContainer.this
                            int r3 = com.mbridge.msdk.video.bt.module.MBTempContainer.g(r3)
                            com.mbridge.msdk.video.bt.module.b.f.a(r0, r1, r2, r3)
                        L68:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.bt.module.MBTempContainer.AnonymousClass4.a():void");
                    }
                });
            }
            this.mbridgeVideoView.setIPlayVideoViewLayoutCallBack(new com.mbridge.msdk.video.dynview.e.f() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.5
                @Override // com.mbridge.msdk.video.dynview.e.f
                public final void a() {
                    MBTempContainer.h(MBTempContainer.this);
                }
            });
            if (this.mbridgeVideoView != null && this.f18403e != null && initViews()) {
                this.b = true;
                WindVaneWebView windVaneWebView = this.f18402d;
                this.f18384G = new com.mbridge.msdk.video.signal.factory.b(this.f19286i, windVaneWebView, this.mbridgeVideoView, this.f18403e, this.f18408z, new e());
                CampaignEx campaignEx2 = this.f18408z;
                if (campaignEx2 != null && campaignEx2.getDynamicTempCode() == 5 && (list = this.f18394R) != null) {
                    this.f18384G.a(list);
                }
                registerJsFactory(this.f18384G);
                com.mbridge.msdk.foundation.d.b.a().a(this.f19287j + "_1", new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.8
                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void a() {
                        String str;
                        MBTempContainer.this.onPause();
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                                jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
                            }
                            str = jSONObject.toString();
                        } catch (Throwable th) {
                            ad.b(MBTempContainer.f18377x, th.getMessage(), th);
                            str = "";
                        }
                        g.a().a((WebView) MBTempContainer.this.f18402d, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                    }

                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void b() {
                        String str;
                        MBTempContainer.this.onResume();
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                                jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                            }
                            str = jSONObject.toString();
                        } catch (Throwable th) {
                            ad.b(MBTempContainer.f18377x, th.getMessage(), th);
                            str = "";
                        }
                        g.a().a((WebView) MBTempContainer.this.f18402d, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                    }

                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void a(String str) {
                        String str2;
                        MBTempContainer.this.onResume();
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                                jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                            }
                            str2 = jSONObject.toString();
                        } catch (Throwable th) {
                            ad.b(MBTempContainer.f18377x, th.getMessage(), th);
                            str2 = "";
                        }
                        g.a().a((WebView) MBTempContainer.this.f18402d, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
                    }
                });
                g();
                if (windVaneWebView != null) {
                    ViewGroup viewGroup2 = (ViewGroup) this.f18407y.findViewById(v.a(getContext(), "mbridge_video_templete_webview_parent", "id"));
                    windVaneWebView.setApiManagerJSFactory(this.f18384G);
                    if (windVaneWebView.getParent() != null) {
                        defaultLoad(0, "preload template webview is null or load error");
                        return;
                    }
                    if (windVaneWebView.getObject() instanceof k) {
                        getJSCommon().a(this.ao);
                        getJSCommon().a(this.am);
                        getJSCommon().a(this.an);
                        getJSCommon().a(this.f19291p);
                        getJSCommon().a(this.f19287j);
                        getJSCommon().a(this.l);
                        getJSCommon().a(new e());
                        CampaignEx campaignEx3 = this.f18408z;
                        if (campaignEx3 != null && (campaignEx3.isMraid() || this.f18408z.isActiveOm())) {
                            com.mbridge.msdk.mbsignalcommon.mraid.d dVar = new com.mbridge.msdk.mbsignalcommon.mraid.d(getContext());
                            this.al = dVar;
                            dVar.c();
                            this.al.a();
                            this.al.a(new d.b() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.9
                                @Override // com.mbridge.msdk.mbsignalcommon.mraid.d.b
                                public final void a(double d2) {
                                    MBridgeContainerView mBridgeContainerView;
                                    ad.b(MBTempContainer.f18377x, "volume is : " + d2);
                                    try {
                                        if (MBTempContainer.this.f18408z.isMraid() && (mBridgeContainerView = MBTempContainer.this.f18403e) != null && mBridgeContainerView.getH5EndCardView() != null) {
                                            MBTempContainer.this.f18403e.getH5EndCardView().volumeChange(d2);
                                        }
                                    } catch (Exception e12) {
                                        ad.b(MBTempContainer.f18377x, e12.getMessage());
                                    }
                                }
                            });
                        }
                        getJSContainerModule().readyStatus(((k) windVaneWebView.getObject()).r());
                        try {
                            if (this.f18402d != null) {
                                int i9 = getResources().getConfiguration().orientation;
                                if (d()) {
                                    f9 = ai.h(getContext());
                                    e4 = ai.g(getContext());
                                    if (com.mbridge.msdk.foundation.tools.d.a(getContext())) {
                                        int c9 = ai.c(getContext());
                                        if (i9 == 2) {
                                            f9 += c9;
                                        } else {
                                            e4 += c9;
                                        }
                                    }
                                } else {
                                    f9 = ai.f(getContext());
                                    e4 = ai.e(getContext());
                                }
                                int b8 = this.f18408z.getRewardTemplateMode().b();
                                if (c(this.f18408z) == 1) {
                                    b8 = i9;
                                }
                                getJSNotifyProxy().a(i9, b8, f9, e4);
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put(com.mbridge.msdk.foundation.same.a.l, ai.d(getContext()));
                                try {
                                    if (this.f19289n != null) {
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put("name", this.f19289n.a());
                                        jSONObject2.put("amount", this.f19289n.b());
                                        jSONObject2.put("id", this.f19290o);
                                        jSONObject.put("userId", this.m);
                                        jSONObject.put("reward", jSONObject2);
                                        jSONObject.put("playVideoMute", this.f19291p);
                                        jSONObject.put("extra", this.f18393Q);
                                    }
                                } catch (JSONException e12) {
                                    ad.a(f18377x, e12.getMessage());
                                } catch (Exception e13) {
                                    ad.a(f18377x, e13.getMessage());
                                }
                                String jSONObject3 = jSONObject.toString();
                                com.mbridge.msdk.foundation.same.report.d.d dVar2 = new com.mbridge.msdk.foundation.same.report.d.d();
                                dVar2.a("type", 2);
                                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000133", this.f18408z, dVar2);
                                getJSNotifyProxy().a(jSONObject3);
                                g.a().a((WebView) this.f18402d, "oncutoutfetched", Base64.encodeToString(this.f18392P.getBytes(), 0));
                                getJSCommon().b(true);
                                if (com.mbridge.msdk.e.b.a()) {
                                    setChinaCallBackStatus(this.f18402d);
                                }
                                loadModuleDatas();
                                this.f18404f.postDelayed(this.f18405g, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
                            }
                        } catch (Exception e14) {
                            if (MBridgeConstans.DEBUG) {
                                e14.printStackTrace();
                            }
                        }
                        ((k) windVaneWebView.getObject()).m.a();
                        if (this.f19297v) {
                            getJSCommon().e(this.f18399W);
                        }
                    }
                    if (getJSCommon().a() == 1 && (viewGroup = (ViewGroup) this.f18407y.findViewById(v.a(getContext(), "mbridge_video_templete_webview_parent", "id"))) != null) {
                        ((ViewGroup) this.f18407y).removeView(viewGroup);
                        ((ViewGroup) this.f18407y).addView(viewGroup, 1);
                    }
                    viewGroup2.addView(windVaneWebView, new ViewGroup.LayoutParams(-1, -1));
                    return;
                }
                defaultLoad(0, "preload template webview is null or load error");
                return;
            }
            this.f18401c.a("not found View IDS");
            Activity activity = this.f19286i;
            if (activity != null) {
                activity.finish();
            }
        } catch (Throwable th) {
            th.printStackTrace();
            a("onCreate error" + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onDestroy() {
        CampaignEx campaignEx;
        int i9;
        if (this.f18387J) {
            return;
        }
        boolean z8 = true;
        this.f18387J = true;
        super.onDestroy();
        try {
            if (com.mbridge.msdk.e.b.a()) {
                setChinaDestroy();
            }
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.releasePlayer();
            }
            WindVaneWebView windVaneWebView = this.f18402d;
            if (windVaneWebView != null) {
                ViewGroup viewGroup = (ViewGroup) windVaneWebView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                this.f18402d.clearWebView();
                this.f18402d.release();
            }
            if (this.f18380C != null) {
                this.f18380C = null;
            }
            this.f18404f.removeCallbacks(this.f18405g);
            this.f18404f.removeCallbacks(this.f18406h);
            getJSCommon().e();
            if (this.f19292q) {
                com.mbridge.msdk.c.h.a().e(this.f19287j);
            }
            if (!this.ab) {
                try {
                    this.ab = true;
                    CampaignEx campaignEx2 = this.f18408z;
                    if (campaignEx2 != null && campaignEx2.getPlayable_ads_without_video() == 2) {
                        this.ac = true;
                    }
                    P5.b bVar = this.an;
                    if (bVar != null && !this.ac) {
                        try {
                            O5.k kVar = bVar.f2431a;
                            R2.b.b(kVar);
                            kVar.f2232e.c("skipped", null);
                        } catch (Exception e4) {
                            ad.a("omsdk", e4.getMessage());
                        }
                    }
                    h hVar = this.f18379B;
                    if (hVar != null) {
                        if (this.f19292q && ((i9 = this.f19294s) == com.mbridge.msdk.foundation.same.a.f15660G || i9 == com.mbridge.msdk.foundation.same.a.f15661H)) {
                            if (this.f18386I != 1) {
                                z8 = false;
                            }
                            hVar.a(z8, this.f18385H);
                        }
                        if (!this.ac) {
                            this.f19289n.a(0);
                        }
                        this.f18396T.a(this.f18408z);
                        this.f18379B.a(this.f18396T, this.ac, this.f19289n);
                    }
                    this.f18404f.removeCallbacks(this.ap);
                    if (((!this.f19292q && !this.f19297v) || ((campaignEx = this.f18408z) != null && campaignEx.isDynamicView())) && this.ac && (!com.mbridge.msdk.e.b.a() || !checkChinaSendToServerDiff(this.f18379B))) {
                        ad.a(f18377x, "sendToServerRewardInfo");
                        com.mbridge.msdk.video.module.b.b.a(this.f18408z, this.f19289n, this.f19287j, this.m, this.f18393Q);
                    }
                    if (!this.f19297v) {
                        if (this.f19292q) {
                            com.mbridge.msdk.videocommon.a.b(287, this.f18408z);
                        } else {
                            com.mbridge.msdk.videocommon.a.b(94, this.f18408z);
                        }
                    }
                    MBridgeContainerView mBridgeContainerView = this.f18403e;
                    if (mBridgeContainerView != null) {
                        mBridgeContainerView.release();
                    }
                } catch (Throwable th) {
                    ad.b(f18377x, th.getMessage(), th);
                }
            }
            if (!this.ae) {
                f();
            }
            com.mbridge.msdk.mbsignalcommon.mraid.d dVar = this.al;
            if (dVar != null) {
                dVar.d();
            }
            if (this.am != null) {
                ad.b("omsdk", "tc onDestroy");
                this.am.e();
                this.am.c();
                this.am = null;
            }
            if (!this.f19297v) {
                if (isLoadSuccess()) {
                    this.f18404f.postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.7
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (((AbstractJSContainer) MBTempContainer.this).f19286i != null) {
                                ((AbstractJSContainer) MBTempContainer.this).f19286i.finish();
                            }
                        }
                    }, 100L);
                } else {
                    Activity activity = this.f19286i;
                    if (activity != null) {
                        activity.finish();
                    }
                }
            }
            if (!this.ae) {
                f();
            }
            com.mbridge.msdk.video.bt.a.d.c().f(this.f18383F);
        } catch (Throwable th2) {
            ad.a(f18377x, th2.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onPause() {
        super.onPause();
        this.ad = true;
        try {
            getJSVideoModule().videoOperate(2);
            MBridgeContainerView mBridgeContainerView = this.f18403e;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.setOnPause();
            }
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.onActivityPause();
            }
        } catch (Throwable th) {
            ad.b(f18377x, th.getMessage(), th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onResume() {
        Runnable runnable;
        Activity activity;
        super.onResume();
        int i9 = this.f18398V;
        if (i9 == -3) {
            runnable = this.f18405g;
        } else if (i9 == -4) {
            runnable = this.f18406h;
        } else {
            runnable = null;
        }
        if (runnable != null) {
            runnable.run();
            this.f18398V = 0;
        }
        try {
            if (this.mbridgeVideoView != null && !e() && !this.mbridgeVideoView.isMiniCardShowing() && !com.mbridge.msdk.foundation.d.b.f15467c) {
                this.mbridgeVideoView.setCover(false);
            }
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.onActivityResume();
            }
            MBridgeContainerView mBridgeContainerView = this.f18403e;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.setOnResume();
            }
            if (this.ad && !e() && !com.mbridge.msdk.foundation.d.b.f15467c) {
                getJSVideoModule().videoOperate(1);
            }
            Activity activity2 = this.f19286i;
            if (activity2 != null) {
                ai.a(activity2.getWindow().getDecorView());
            }
            if (this.af && this.ag && (activity = this.f19286i) != null) {
                activity.finish();
            }
        } catch (Throwable th) {
            ad.b(f18377x, th.getMessage(), th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onStop() {
        super.onStop();
        MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setCover(true);
            this.mbridgeVideoView.onActivityStop();
        }
    }

    public void preload() {
    }

    public void receiveSuccess() {
        ad.a(f18377x, "receiveSuccess ,start hybrid");
        this.f18404f.removeCallbacks(this.f18406h);
        this.f18404f.postDelayed(this.ap, 250L);
    }

    public void registerErrorListener(a aVar) {
        this.f18401c = aVar;
    }

    public void setAdEvents(O5.a aVar) {
        this.ao = aVar;
        com.mbridge.msdk.video.signal.factory.b bVar = this.f18384G;
        if (bVar != null && bVar.getJSCommon() != null) {
            this.f18384G.getJSCommon().a(aVar);
        }
    }

    public void setAdSession(O5.b bVar) {
        this.am = bVar;
        com.mbridge.msdk.video.signal.factory.b bVar2 = this.f18384G;
        if (bVar2 != null && bVar2.getJSCommon() != null) {
            this.f18384G.getJSCommon().a(bVar);
        }
        MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setAdSession(bVar);
        }
    }

    public void setCamPlayOrderCallback(com.mbridge.msdk.video.dynview.e.a aVar, int i9) {
        this.f18381D = aVar;
        this.f18382E = i9;
    }

    public void setCampOrderViewData(List<CampaignEx> list, int i9) {
        if (list != null) {
            this.f18394R = list;
        }
        this.f18395S = i9;
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.f18408z = campaignEx;
        if (campaignEx != null) {
            com.mbridge.msdk.foundation.same.report.d.b b8 = com.mbridge.msdk.foundation.same.report.d.c.a().b(campaignEx.getCurrentLocalRid());
            this.f18396T = b8;
            if (b8 == null) {
                this.f18396T = new com.mbridge.msdk.foundation.same.report.d.b();
            }
            this.f18396T.c(campaignEx.getCurrentLocalRid());
            this.f18396T.a(campaignEx);
            if (TextUtils.isEmpty(campaignEx.getCampaignUnitId()) && !TextUtils.isEmpty(this.f19287j)) {
                campaignEx.setCampaignUnitId(this.f19287j);
            }
            AppletsModel appletsModel = AppletModelManager.getInstance().get(campaignEx);
            if (appletsModel != null) {
                this.aq = appletsModel.isSupportWxScheme();
            }
            com.mbridge.msdk.foundation.d.b.a().a(campaignEx.getCampaignUnitId() + "_1", campaignEx);
        }
    }

    public void setCampaignDownLoadTask(com.mbridge.msdk.videocommon.download.a aVar) {
        this.f18378A = aVar;
    }

    public void setCampaignExpired(boolean z8) {
        try {
            CampaignEx campaignEx = this.f18408z;
            if (campaignEx != null) {
                if (z8) {
                    campaignEx.setSpareOfferFlag(1);
                    if (com.mbridge.msdk.e.b.a()) {
                        if (this.f19293r) {
                            this.f18408z.setCbt(0);
                        } else {
                            com.mbridge.msdk.videocommon.d.c cVar = this.l;
                            if (cVar != null) {
                                if (cVar.y() == 1) {
                                    this.f18408z.setCbt(1);
                                } else {
                                    this.f18408z.setCbt(0);
                                }
                            }
                        }
                    } else {
                        com.mbridge.msdk.videocommon.d.c cVar2 = this.l;
                        if (cVar2 != null) {
                            if (cVar2.y() == 1) {
                                this.f18408z.setCbt(1);
                            } else {
                                this.f18408z.setCbt(0);
                            }
                        }
                    }
                } else {
                    campaignEx.setSpareOfferFlag(0);
                    this.f18408z.setCbt(0);
                }
            }
        } catch (Exception e4) {
            ad.b(f18377x, e4.getMessage());
        }
    }

    public void setDeveloperExtraData(String str) {
        this.f18393Q = str;
    }

    public void setInstanceId(String str) {
        this.f18383F = str;
    }

    public void setJSFactory(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.f18384G = bVar;
    }

    public void setMBridgeTempCallback(com.mbridge.msdk.video.bt.module.a.b bVar) {
        this.f18380C = bVar;
    }

    public void setMatchParent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
    }

    public void setMediaPlayerUrl(String str) {
    }

    public void setNotchPadding(int i9, int i10, int i11, int i12, int i13) {
        this.f18388K = i9;
        this.f18389L = i10;
        this.f18390M = i11;
        this.f18391N = i12;
        this.O = i13;
        String a6 = r.a(i9, i10, i11, i12, i13);
        this.f18392P = a6;
        ad.b(f18377x, a6);
        if (getJSCommon() != null && !TextUtils.isEmpty(this.f18392P)) {
            getJSCommon().b(this.f18392P);
            if (this.f18402d != null && !TextUtils.isEmpty(this.f18392P)) {
                g.a().a((WebView) this.f18402d, "oncutoutfetched", Base64.encodeToString(this.f18392P.getBytes(), 0));
            }
        }
        MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setNotchPadding(i10, i11, i12, i13);
        }
        MBridgeContainerView mBridgeContainerView = this.f18403e;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.setNotchPadding(i9, i10, i11, i12, i13);
        }
    }

    public void setShowRewardListener(h hVar) {
        this.f18379B = hVar;
    }

    public void setShowingTransparent() {
        int a6;
        Activity activity;
        boolean d2 = d();
        this.af = d2;
        if (!d2 && (a6 = v.a(getContext(), "mbridge_reward_theme", TtmlNode.TAG_STYLE)) > 1 && (activity = this.f19286i) != null) {
            activity.setTheme(a6);
        }
    }

    public void setVideoEvents(P5.b bVar) {
        this.an = bVar;
        com.mbridge.msdk.video.signal.factory.b bVar2 = this.f18384G;
        if (bVar2 != null && bVar2.getJSCommon() != null) {
            this.f18384G.getJSCommon().a(bVar);
        }
        MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setVideoEvents(bVar);
        }
    }

    public void setWebViewFront(int i9) {
        this.f18399W = i9;
    }

    public void superDefaultLoad(int i9, String str) {
        this.f18404f.removeCallbacks(this.f18405g);
        this.f18404f.removeCallbacks(this.f18406h);
        this.f18401c.a(true);
        WindVaneWebView windVaneWebView = this.f18402d;
        if (windVaneWebView != null) {
            windVaneWebView.setVisibility(8);
        }
    }

    /* loaded from: classes3.dex */
    public class e extends a.C0201a {
        private e() {
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0201a, com.mbridge.msdk.video.signal.a.InterfaceC0200a
        public final void a() {
            super.a();
            MBTempContainer.this.receiveSuccess();
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0201a, com.mbridge.msdk.video.signal.a.InterfaceC0200a
        public final void b() {
            super.b();
            MBTempContainer mBTempContainer = MBTempContainer.this;
            Handler handler = mBTempContainer.f18404f;
            if (handler != null) {
                handler.removeCallbacks(mBTempContainer.f18405g);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0201a, com.mbridge.msdk.out.BaseTrackingListener
        public final void onFinishRedirection(Campaign campaign, String str) {
            super.onFinishRedirection(campaign, str);
            MBTempContainer.this.ag = true;
            MBTempContainer.R(MBTempContainer.this);
            if (campaign != null && (campaign instanceof CampaignEx)) {
                try {
                    CampaignEx campaignEx = (CampaignEx) campaign;
                    String optString = new JSONObject(MBTempContainer.this.getJSVideoModule().getCurrentProgress()).optString(NotificationCompat.CATEGORY_PROGRESS, "");
                    if (campaignEx.getLinkType() == 3 && campaignEx.getEndcard_click_result() == 2 && optString.equals("1.0") && ((AbstractJSContainer) MBTempContainer.this).f19286i != null) {
                        if (((AbstractJSContainer) MBTempContainer.this).f19297v) {
                            MBTempContainer.r(MBTempContainer.this);
                        } else {
                            ((AbstractJSContainer) MBTempContainer.this).f19286i.finish();
                        }
                    }
                } catch (JSONException e4) {
                    e4.printStackTrace();
                }
            }
            if (MBTempContainer.this.aq) {
                MBTempContainer.this.onResume();
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0201a, com.mbridge.msdk.out.BaseTrackingListener
        public final void onRedirectionFailed(Campaign campaign, String str) {
            super.onRedirectionFailed(campaign, str);
            MBTempContainer.R(MBTempContainer.this);
            MBTempContainer.this.ag = true;
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0201a, com.mbridge.msdk.out.BaseTrackingListener
        public final void onStartRedirection(Campaign campaign, String str) {
            super.onStartRedirection(campaign, str);
            MBTempContainer.P(MBTempContainer.this);
            if (MBTempContainer.this.aq) {
                MBTempContainer.this.onPause();
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0201a, com.mbridge.msdk.video.signal.a.InterfaceC0200a
        public final void a(boolean z8) {
            if (MBTempContainer.this.an != null) {
                try {
                    MBTempContainer.this.an.a();
                    ad.a("omsdk", "mbtc adUserInteraction click");
                } catch (Exception e4) {
                    ad.b("omsdk", e4.getMessage());
                }
            }
            super.a(z8);
            MBTempContainer.this.f18379B.a(z8, ((AbstractJSContainer) MBTempContainer.this).f19288k, ((AbstractJSContainer) MBTempContainer.this).f19287j);
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0201a, com.mbridge.msdk.video.signal.a.InterfaceC0200a
        public final void a(int i9, String str) {
            super.a(i9, str);
            MBTempContainer.this.defaultLoad(i9, str);
        }
    }

    private void f() {
        com.mbridge.msdk.foundation.same.report.h hVar = new com.mbridge.msdk.foundation.same.report.h(getContext());
        CampaignEx campaignEx = this.f18408z;
        if (campaignEx != null) {
            hVar.b(campaignEx.getRequestId(), this.f18408z.getRequestIdNotice(), this.f18408z.getId(), this.f19287j, com.mbridge.msdk.mbsignalcommon.mraid.c.a(this.f18408z.getId()), this.f18408z.isBidCampaign());
            com.mbridge.msdk.mbsignalcommon.mraid.c.b(this.f18408z.getId());
            this.ae = true;
        }
    }

    private void g() {
        O5.b bVar = this.am;
        if (bVar != null) {
            try {
                MBridgeContainerView mBridgeContainerView = this.f18403e;
                O5.g gVar = O5.g.f2220f;
                bVar.a(mBridgeContainerView, gVar);
                View view = this.aa;
                if (view != null) {
                    this.am.a(view, gVar);
                }
                WindVaneWebView windVaneWebView = this.f18402d;
                if (windVaneWebView != null) {
                    this.am.a(windVaneWebView, gVar);
                }
                this.mbridgeVideoView.setVideoEvents(this.an);
                this.am.f();
                if (this.ao != null) {
                    B3.e eVar = new B3.e(3);
                    ad.a("omsdk", "bt:   adEvents.loaded");
                    this.ao.d(eVar);
                    this.ao.b();
                }
            } catch (Exception e4) {
                ad.a("omsdk", e4.getMessage());
            }
        }
    }

    private int i() {
        CampaignEx campaignEx = this.f18408z;
        if (campaignEx == null) {
            return 1;
        }
        boolean a6 = ai.a(MBridgeConstans.DYNAMIC_VIEW_KEY_CLOSE_BTN_DELATE, campaignEx.getendcard_url());
        int c9 = ai.c(this.f18408z.getendcard_url(), MBridgeConstans.DYNAMIC_VIEW_KEY_CLOSE_BTN_DELATE);
        if (a6 && c9 >= 0) {
            return c9;
        }
        if (this.f18408z.getCbd() > -2) {
            return this.f18408z.getCbd();
        }
        return this.l.p();
    }

    public static /* synthetic */ void b(MBTempContainer mBTempContainer) {
        try {
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            MBridgeVideoView mBridgeVideoView = mBTempContainer.mbridgeVideoView;
            if (mBridgeVideoView != null && mBridgeVideoView.notifyListener != null) {
                dVar.a("notify_listener", 1);
                com.mbridge.msdk.video.module.a.a aVar = mBTempContainer.mbridgeVideoView.notifyListener;
                if (aVar instanceof n) {
                    dVar.a("listener_type", 1);
                } else if (aVar instanceof m) {
                    dVar.a("listener_type", 2);
                } else {
                    dVar.a("listener_type", 3);
                }
            } else {
                dVar.a("notify_listener", 0);
            }
            com.mbridge.msdk.foundation.same.report.d.b bVar = mBTempContainer.f18396T;
            if (bVar != null) {
                bVar.a("2000130", dVar);
            }
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
        }
    }

    private boolean d() {
        k b8 = b(this.f18408z);
        if (b8 != null) {
            return b8.p();
        }
        return false;
    }

    private boolean e() {
        if (this.mbridgeVideoView != null) {
            return com.mbridge.msdk.e.b.a() ? this.mbridgeVideoView.isShowingAlertView() || checkChinaShowingAlertViewState() || this.mbridgeVideoView.isRewardPopViewShowing() : this.mbridgeVideoView.isShowingAlertView() || this.mbridgeVideoView.isRewardPopViewShowing();
        }
        return false;
    }

    private int c() {
        k b8 = b(this.f18408z);
        if (b8 != null) {
            return b8.m();
        }
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public final void a(String str) {
        h hVar = this.f18379B;
        if (hVar != null) {
            hVar.a(this.f18396T, str);
        }
        super.a(str);
    }

    private void a(int i9, String str) {
        try {
            com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
            nVar.a("2000037");
            nVar.r("code=" + i9 + ",desc=" + str);
            CampaignEx campaignEx = this.f18408z;
            nVar.q((campaignEx == null || campaignEx.getRewardTemplateMode() == null) ? "" : this.f18408z.getRewardTemplateMode().e());
            nVar.c(this.f19287j);
            CampaignEx campaignEx2 = this.f18408z;
            nVar.e(campaignEx2 != null ? campaignEx2.getId() : "");
            CampaignEx campaignEx3 = this.f18408z;
            if (campaignEx3 != null && !TextUtils.isEmpty(campaignEx3.getRequestId())) {
                nVar.f(this.f18408z.getRequestId());
            }
            CampaignEx campaignEx4 = this.f18408z;
            if (campaignEx4 != null && !TextUtils.isEmpty(campaignEx4.getRequestIdNotice())) {
                nVar.g(this.f18408z.getRequestIdNotice());
            }
            int l = z.l(getContext());
            nVar.a(l);
            nVar.k(z.a(getContext(), l));
            com.mbridge.msdk.video.module.b.b.a(com.mbridge.msdk.foundation.entity.n.h(nVar), this.f19287j);
        } catch (Throwable th) {
            ad.b(f18377x, th.getMessage(), th);
        }
    }

    private int h() {
        try {
            com.mbridge.msdk.videocommon.d.a b8 = com.mbridge.msdk.videocommon.d.b.a().b();
            if (b8 == null) {
                com.mbridge.msdk.videocommon.d.b.a().c();
            }
            if (b8 != null) {
                return (int) b8.h();
            }
            return 5;
        } catch (Throwable th) {
            th.printStackTrace();
            return 5;
        }
    }

    private int a(int i9, int i10) {
        List<CampaignEx> list;
        if (i9 < 0 || (list = this.f18394R) == null || list.size() == 0 || i10 <= 1) {
            return i9;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < i10 - 1; i12++) {
            if (this.f18394R.get(i12) != null) {
                i11 += this.f18394R.get(i12).getVideoLength();
            }
        }
        if (i9 > i11) {
            return i9 - i11;
        }
        return 0;
    }

    public MBTempContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18382E = 1;
        this.f18383F = "";
        this.f18385H = com.mbridge.msdk.foundation.same.a.f15659F;
        this.f18387J = false;
        this.f18392P = "";
        this.f18394R = new ArrayList();
        this.f18395S = 0;
        this.f18400a = false;
        this.b = false;
        this.f18401c = new a.C0193a();
        this.f18404f = new Handler();
        this.f18398V = 0;
        this.f18399W = 0;
        this.f18405g = new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.1
            @Override // java.lang.Runnable
            public final void run() {
                if (MBTempContainer.this.getActivityProxy().h() != 0) {
                    MBTempContainer.this.f18398V = -3;
                } else {
                    MBTempContainer.this.defaultLoad(-1, "WebView load timeout");
                }
            }
        };
        this.f18406h = new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.3
            @Override // java.lang.Runnable
            public final void run() {
                if (MBTempContainer.this.getActivityProxy().h() != 0) {
                    MBTempContainer.this.f18398V = -4;
                } else {
                    MBTempContainer.this.defaultLoad(-3, "Signal Communication connect timeout");
                }
            }
        };
        this.ab = false;
        this.ac = false;
        this.ad = false;
        this.af = false;
        this.ag = false;
        this.ah = false;
        this.ai = false;
        this.aj = false;
        this.ak = false;
        this.am = null;
        this.an = null;
        this.ao = null;
        this.ap = new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.6
            @Override // java.lang.Runnable
            public final void run() {
                if (MBTempContainer.this.aa != null) {
                    MBTempContainer.this.aa.setVisibility(8);
                }
            }
        };
        this.aq = false;
        init(context);
    }
}
