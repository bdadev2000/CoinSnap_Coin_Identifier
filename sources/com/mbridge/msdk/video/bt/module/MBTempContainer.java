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
import androidx.appcompat.widget.r3;
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
import kd.i;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBTempContainer extends MBTempContainerDiff {

    /* renamed from: x, reason: collision with root package name */
    private static final String f15612x = "MBTempContainer";
    private com.mbridge.msdk.videocommon.download.a A;
    private h B;
    private com.mbridge.msdk.video.bt.module.a.b C;
    private com.mbridge.msdk.video.dynview.e.a D;
    private int E;
    private String F;
    private com.mbridge.msdk.video.signal.factory.b G;
    private int H;
    private int I;
    private boolean J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private String P;
    private String Q;
    private List<CampaignEx> R;
    private int S;
    private com.mbridge.msdk.foundation.same.report.d.b T;
    private LayoutInflater U;
    private int V;
    private int W;
    protected boolean a;

    /* renamed from: aa, reason: collision with root package name */
    private View f15613aa;

    /* renamed from: ab, reason: collision with root package name */
    private boolean f15614ab;

    /* renamed from: ac, reason: collision with root package name */
    private boolean f15615ac;

    /* renamed from: ad, reason: collision with root package name */
    private boolean f15616ad;

    /* renamed from: ae, reason: collision with root package name */
    private boolean f15617ae;

    /* renamed from: af, reason: collision with root package name */
    private boolean f15618af;

    /* renamed from: ag, reason: collision with root package name */
    private boolean f15619ag;

    /* renamed from: ah, reason: collision with root package name */
    private boolean f15620ah;

    /* renamed from: ai, reason: collision with root package name */
    private boolean f15621ai;
    private boolean aj;
    private boolean ak;
    private com.mbridge.msdk.mbsignalcommon.mraid.d al;
    private kd.b am;
    private ld.b an;
    private kd.a ao;
    private Runnable ap;
    private boolean aq;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f15622b;

    /* renamed from: c, reason: collision with root package name */
    protected a f15623c;

    /* renamed from: d, reason: collision with root package name */
    protected WindVaneWebView f15624d;

    /* renamed from: e, reason: collision with root package name */
    protected MBridgeContainerView f15625e;

    /* renamed from: f, reason: collision with root package name */
    protected Handler f15626f;

    /* renamed from: g, reason: collision with root package name */
    protected Runnable f15627g;

    /* renamed from: h, reason: collision with root package name */
    protected Runnable f15628h;

    /* renamed from: y, reason: collision with root package name */
    private View f15629y;

    /* renamed from: z, reason: collision with root package name */
    private CampaignEx f15630z;

    /* loaded from: classes4.dex */
    public interface a {
        void a(String str);

        void a(boolean z10);

        /* renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0205a implements a {
            private boolean a = false;

            @Override // com.mbridge.msdk.video.bt.module.MBTempContainer.a
            public void a(String str) {
                ad.b("ActivityErrorListener", str);
                this.a = true;
            }

            @Override // com.mbridge.msdk.video.bt.module.MBTempContainer.a
            public final void a(boolean z10) {
                this.a = z10;
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends AppletSchemeCallBack {
        private CampaignEx a;

        public b(CampaignEx campaignEx) {
            this.a = campaignEx;
        }

        @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
        public final void onRequestFailed(int i10, String str, String str2) {
            if (MBridgeConstans.DEBUG) {
                ad.a(MBTempContainer.f15612x, "request wx scheme failed: errorCode: " + i10 + " errorMessage: " + str);
            }
            try {
                CampaignEx campaignEx = this.a;
                if (campaignEx != null) {
                    campaignEx.setClickURL(str2);
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b(MBTempContainer.f15612x, e2.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
        public final void onRequestStart() {
            if (MBridgeConstans.DEBUG) {
                ad.a(MBTempContainer.f15612x, "start request wx scheme");
            }
        }

        @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
        public final void onRequestSuccess(String str) {
            if (MBridgeConstans.DEBUG) {
                ad.a(MBTempContainer.f15612x, "request wx scheme success");
            }
            try {
                CampaignEx campaignEx = this.a;
                if (campaignEx != null) {
                    campaignEx.setDeepLinkUrl(str);
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b(MBTempContainer.f15612x, e2.getMessage());
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class c extends com.mbridge.msdk.video.module.a.a.a {
        public c(Activity activity, CampaignEx campaignEx) {
            super(activity, campaignEx);
        }

        @Override // com.mbridge.msdk.video.module.a.a.a, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
        public final void a(int i10, Object obj) {
            if (com.mbridge.msdk.e.b.a()) {
                MBTempContainer.this.setChinaJsCommonContext();
            }
            String str = "";
            if (i10 != 108) {
                if (i10 != 113) {
                    if (i10 != 117) {
                        if (i10 != 126 && i10 != 128) {
                            if (i10 != 131) {
                                switch (i10) {
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
                                            mBTempContainer.setChinaBrowserCallBack(mBTempContainer.C, MBTempContainer.this.F, MBTempContainer.this.B, MBTempContainer.this.f15630z);
                                            if (((AbstractJSContainer) MBTempContainer.this).f16295i != null && MBTempContainer.this.f15630z != null) {
                                                MBTempContainer.r(MBTempContainer.this);
                                                break;
                                            }
                                        }
                                        break;
                                }
                            } else {
                                MBTempContainer.this.B.a(true, ((AbstractJSContainer) MBTempContainer.this).f16297k, ((AbstractJSContainer) MBTempContainer.this).f16296j);
                            }
                        } else {
                            MBTempContainer.this.B.a(false, ((AbstractJSContainer) MBTempContainer.this).f16297k, ((AbstractJSContainer) MBTempContainer.this).f16296j);
                        }
                    } else {
                        MBridgeVideoView mBridgeVideoView = MBTempContainer.this.mbridgeVideoView;
                        if (mBridgeVideoView != null) {
                            mBridgeVideoView.setVisible(4);
                        }
                        MBTempContainer.this.f15621ai = true;
                        MBTempContainer.this.B.b(((AbstractJSContainer) MBTempContainer.this).f16297k, ((AbstractJSContainer) MBTempContainer.this).f16296j);
                    }
                }
                MBTempContainer.this.B.a(true, ((AbstractJSContainer) MBTempContainer.this).f16297k, ((AbstractJSContainer) MBTempContainer.this).f16296j);
            } else {
                if (com.mbridge.msdk.e.b.a()) {
                    MBTempContainer mBTempContainer2 = MBTempContainer.this;
                    mBTempContainer2.setChinaCallBackStatus(mBTempContainer2.f15624d);
                }
                MBTempContainer.this.getJSCommon().a(new a.b(MBTempContainer.this.getJSCommon(), new e()));
                com.mbridge.msdk.video.signal.d jSCommon2 = MBTempContainer.this.getJSCommon();
                if (obj != null) {
                    str = obj.toString();
                }
                jSCommon2.click(1, str);
            }
            super.a(i10, obj);
        }
    }

    /* loaded from: classes4.dex */
    public final class d extends com.mbridge.msdk.video.module.a.a.f {
        private d() {
        }

        @Override // com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
        public final void a(int i10, Object obj) {
            String str;
            super.a(i10, obj);
            try {
                if (obj instanceof JSONObject) {
                    str = obj.toString();
                } else {
                    str = (String) obj;
                }
                if (((AbstractJSContainer) MBTempContainer.this).f16303q && !TextUtils.isEmpty(str)) {
                    JSONObject jSONObject = new JSONObject(str);
                    int optInt = jSONObject.optInt("type");
                    int optInt2 = jSONObject.optInt(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE);
                    if (optInt != 2) {
                        if (optInt != 3) {
                            MBTempContainer.this.H = com.mbridge.msdk.foundation.same.a.F;
                        } else {
                            MBTempContainer.this.H = com.mbridge.msdk.foundation.same.a.E;
                        }
                    } else {
                        MBTempContainer.this.H = com.mbridge.msdk.foundation.same.a.D;
                    }
                    MBTempContainer.this.I = optInt2;
                }
            } catch (Exception unused) {
                ad.b("NotifyListener", "PlayableResultListener ERROR");
            }
            if (i10 != 120) {
                String str2 = "";
                if (i10 != 131) {
                    if (i10 != 126) {
                        if (i10 != 127) {
                            switch (i10) {
                                case 100:
                                    MBTempContainer.this.aj = true;
                                    MBTempContainer mBTempContainer = MBTempContainer.this;
                                    mBTempContainer.f15626f.postDelayed(mBTempContainer.ap, 250L);
                                    MBTempContainer.this.B.a(MBTempContainer.this.T);
                                    return;
                                case 101:
                                case 102:
                                    MBTempContainer.this.getJSCommon().d();
                                    return;
                                case 103:
                                    MBTempContainer.this.f15615ac = true;
                                    if (MBTempContainer.this.f15630z.isMraid()) {
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
                        MBTempContainer.this.f15615ac = true;
                        MBTempContainer.this.B.a(MBTempContainer.this.T);
                        MBTempContainer.this.B.b(((AbstractJSContainer) MBTempContainer.this).f16297k, ((AbstractJSContainer) MBTempContainer.this).f16296j);
                        MBTempContainer.this.getJSContainerModule().showEndcard(100);
                        return;
                    }
                    MBTempContainer.this.B.a(false, ((AbstractJSContainer) MBTempContainer.this).f16297k, ((AbstractJSContainer) MBTempContainer.this).f16296j);
                    return;
                }
                com.mbridge.msdk.video.signal.d jSCommon2 = MBTempContainer.this.getJSCommon();
                if (obj != null) {
                    str2 = obj.toString();
                }
                jSCommon2.click(4, str2);
                return;
            }
            MBTempContainer.this.B.b(((AbstractJSContainer) MBTempContainer.this).f16297k, ((AbstractJSContainer) MBTempContainer.this).f16296j);
        }
    }

    /* loaded from: classes4.dex */
    public final class f extends com.mbridge.msdk.video.module.a.a.f {
        private f() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0090, code lost:
        
            if (r6.a.f15630z.isCampaignIsFiltered() != false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x01a5, code lost:
        
            if (r6.a.f15630z.isCampaignIsFiltered() != false) goto L69;
         */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0152  */
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
        this.E = 1;
        this.F = "";
        this.H = com.mbridge.msdk.foundation.same.a.F;
        this.J = false;
        this.P = "";
        this.R = new ArrayList();
        this.S = 0;
        this.a = false;
        this.f15622b = false;
        this.f15623c = new a.C0205a();
        this.f15626f = new Handler();
        this.V = 0;
        this.W = 0;
        this.f15627g = new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.1
            @Override // java.lang.Runnable
            public final void run() {
                if (MBTempContainer.this.getActivityProxy().h() != 0) {
                    MBTempContainer.this.V = -3;
                } else {
                    MBTempContainer.this.defaultLoad(-1, "WebView load timeout");
                }
            }
        };
        this.f15628h = new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.3
            @Override // java.lang.Runnable
            public final void run() {
                if (MBTempContainer.this.getActivityProxy().h() != 0) {
                    MBTempContainer.this.V = -4;
                } else {
                    MBTempContainer.this.defaultLoad(-3, "Signal Communication connect timeout");
                }
            }
        };
        this.f15614ab = false;
        this.f15615ac = false;
        this.f15616ad = false;
        this.f15618af = false;
        this.f15619ag = false;
        this.f15620ah = false;
        this.f15621ai = false;
        this.aj = false;
        this.ak = false;
        this.am = null;
        this.an = null;
        this.ao = null;
        this.ap = new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.6
            @Override // java.lang.Runnable
            public final void run() {
                if (MBTempContainer.this.f15613aa != null) {
                    MBTempContainer.this.f15613aa.setVisibility(8);
                }
            }
        };
        this.aq = false;
        init(context);
    }

    public static /* synthetic */ void P(MBTempContainer mBTempContainer) {
        if (mBTempContainer.isLoadSuccess()) {
            mBTempContainer.f16295i.runOnUiThread(new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.10
                @Override // java.lang.Runnable
                public final void run() {
                    MBTempContainer.this.f15613aa.setBackgroundColor(0);
                    MBTempContainer.this.f15613aa.setVisibility(0);
                    MBTempContainer.this.f15613aa.bringToFront();
                }
            });
        }
    }

    public static /* synthetic */ void R(MBTempContainer mBTempContainer) {
        if (mBTempContainer.isLoadSuccess()) {
            mBTempContainer.f16295i.runOnUiThread(new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.2
                @Override // java.lang.Runnable
                public final void run() {
                    MBTempContainer.this.f15613aa.setVisibility(8);
                }
            });
        }
    }

    private int h() {
        try {
            com.mbridge.msdk.videocommon.d.a b3 = com.mbridge.msdk.videocommon.d.b.a().b();
            if (b3 == null) {
                com.mbridge.msdk.videocommon.d.b.a().c();
            }
            if (b3 != null) {
                return (int) b3.h();
            }
            return 5;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return 5;
        }
    }

    public static /* synthetic */ void r(MBTempContainer mBTempContainer) {
        int i10;
        try {
            com.mbridge.msdk.video.bt.module.a.b bVar = mBTempContainer.C;
            if (bVar != null) {
                if (mBTempContainer.f16303q && ((i10 = mBTempContainer.f16305s) == com.mbridge.msdk.foundation.same.a.G || i10 == com.mbridge.msdk.foundation.same.a.H)) {
                    boolean z10 = true;
                    if (mBTempContainer.I != 1) {
                        z10 = false;
                    }
                    bVar.a(z10, mBTempContainer.H);
                }
                mBTempContainer.C.a(mBTempContainer.F, mBTempContainer.f15615ac, mBTempContainer.f16300n);
                return;
            }
            Activity activity = mBTempContainer.f16295i;
            if (activity != null) {
                activity.finish();
            }
        } catch (Exception unused) {
            Activity activity2 = mBTempContainer.f16295i;
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    public boolean canBackPress() {
        MBridgeContainerView mBridgeContainerView = this.f15625e;
        return mBridgeContainerView == null || mBridgeContainerView.canBackPress();
    }

    public void defaultLoad(int i10, String str) {
        int i11;
        int e2;
        int i12;
        superDefaultLoad(i10, str);
        CampaignEx campaignEx = this.f15630z;
        if (campaignEx != null && !campaignEx.isDynamicView()) {
            this.f15630z.setTemplateRenderSucc(false);
        }
        if (isLoadSuccess()) {
            if (this.f15630z.getPlayable_ads_without_video() == 2) {
                this.f15625e.setCampaign(this.f15630z);
                this.f15625e.addOrderViewData(this.R);
                this.f15625e.setUnitID(this.f16296j);
                this.f15625e.setCloseDelayTime(i());
                this.f15625e.setPlayCloseBtnTm(this.f16298l.h());
                this.f15625e.setNotifyListener(new com.mbridge.msdk.video.module.a.a.h(this.f15630z, this.A, this.f16300n, b(), this.f16296j, new d(), this.f16298l.y(), this.f16307v));
                this.f15625e.preLoadData(this.G);
                this.f15625e.showPlayableView();
            } else {
                a(i10, str);
                this.f15613aa.setVisibility(8);
                loadModuleDatas();
                int f10 = this.f16298l.f();
                int c10 = c();
                if (c10 != 0) {
                    i11 = c10;
                } else {
                    i11 = f10;
                }
                CampaignEx campaignEx2 = this.f15630z;
                if (campaignEx2 != null && campaignEx2.isDynamicView()) {
                    this.mbridgeVideoView.setContainerViewOnNotifyListener(new c(this.f16295i, this.f15630z));
                }
                CampaignEx campaignEx3 = this.f15630z;
                if (campaignEx3 != null && campaignEx3.getVst() > -2) {
                    e2 = this.f15630z.getVst();
                } else {
                    e2 = this.f16298l.e();
                }
                CampaignEx campaignEx4 = this.f15630z;
                if (campaignEx4 != null && campaignEx4.getDynamicTempCode() == 5 && (i12 = this.E) > 1) {
                    e2 = a(e2, i12);
                    this.f15630z.setVst(e2);
                }
                int i13 = e2;
                this.mbridgeVideoView.setVideoSkipTime(i13);
                MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
                mBridgeVideoView.setNotifyListener(new m(mBridgeVideoView, this.f15625e, this.f15630z, this.f16300n, this.A, b(), this.f16296j, i11, i13, new f(), this.f16298l.y(), this.f16307v, this.f16298l.C()));
                this.mbridgeVideoView.setAdSession(this.am);
                this.mbridgeVideoView.setVideoEvents(this.an);
                this.mbridgeVideoView.defaultShow();
                MBridgeContainerView mBridgeContainerView = this.f15625e;
                mBridgeContainerView.setNotifyListener(new com.mbridge.msdk.video.module.a.a.b(this.mbridgeVideoView, mBridgeContainerView, this.f15630z, this.f16300n, this.A, b(), this.f16296j, new c(this.f16295i, this.f15630z), this.f16298l.y(), this.f16307v));
                this.f15625e.defaultShow();
            }
            g();
            return;
        }
        a(i10, str);
        Activity activity = this.f16295i;
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
        a.C0214a a10;
        try {
            if (this.f16307v) {
                CampaignEx campaignEx = this.f15630z;
                if (campaignEx != null && campaignEx.getRewardTemplateMode() != null) {
                    a.C0214a a11 = com.mbridge.msdk.videocommon.a.a(this.f16296j + "_" + this.f15630z.getId() + "_" + this.f15630z.getRequestId() + "_" + this.f15630z.getRewardTemplateMode().e());
                    if (a11 != null) {
                        return a11.a();
                    }
                    return null;
                }
                return null;
            }
            if (this.f16303q) {
                a10 = com.mbridge.msdk.videocommon.a.a(287, this.f15630z);
            } else {
                a10 = com.mbridge.msdk.videocommon.a.a(94, this.f15630z);
            }
            if (a10 != null && a10.c()) {
                if (this.f16303q) {
                    com.mbridge.msdk.videocommon.a.b(287, this.f15630z);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.f15630z);
                }
                WindVaneWebView a12 = a10.a();
                if (this.f15618af) {
                    a12.setWebViewTransparent();
                }
                return a12;
            }
            return null;
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
                return null;
            }
            return null;
        }
    }

    public kd.a getAdEvents() {
        return this.ao;
    }

    public kd.b getAdSession() {
        return this.am;
    }

    public CampaignEx getCampaign() {
        return this.f15630z;
    }

    public String getInstanceId() {
        return this.F;
    }

    public int getLayoutID() {
        return findLayout(this.f15618af ? "mbridge_reward_activity_video_templete_transparent" : "mbridge_reward_activity_video_templete");
    }

    public ld.b getVideoEvents() {
        return this.an;
    }

    public void init(Context context) {
        this.U = LayoutInflater.from(context);
    }

    public boolean initViews() {
        View findViewById = findViewById(findID("mbridge_video_templete_progressbar"));
        this.f15613aa = findViewById;
        if (findViewById != null) {
            return true;
        }
        return false;
    }

    public boolean isLoadSuccess() {
        return this.f15622b;
    }

    public void loadModuleDatas() {
        int i10;
        int i11;
        int e2;
        int i12;
        int i13;
        int i14;
        k b3 = b(this.f15630z);
        if (b3 != null) {
            i10 = b3.n();
        } else {
            i10 = 0;
        }
        if (i10 != 0) {
            this.f16302p = i10;
        }
        int f10 = this.f16298l.f();
        int c10 = c();
        if (c10 != 0) {
            i11 = c10;
        } else {
            i11 = f10;
        }
        this.mbridgeVideoView.setSoundState(this.f16302p);
        this.mbridgeVideoView.setCampaign(this.f15630z);
        this.mbridgeVideoView.setPlayURL(this.A.t());
        CampaignEx campaignEx = this.f15630z;
        if (campaignEx != null && campaignEx.getVst() > -2) {
            e2 = this.f15630z.getVst();
        } else {
            e2 = this.f16298l.e();
        }
        CampaignEx campaignEx2 = this.f15630z;
        if (campaignEx2 != null && campaignEx2.getDynamicTempCode() == 5 && (i14 = this.E) > 1) {
            e2 = a(e2, i14);
            this.f15630z.setVst(e2);
        }
        this.mbridgeVideoView.setVideoSkipTime(e2);
        this.mbridgeVideoView.setCloseAlert(this.f16298l.i());
        this.mbridgeVideoView.setBufferTimeout(h());
        int i15 = e2;
        this.mbridgeVideoView.setNotifyListener(new n(this.G, this.f15630z, this.f16300n, this.A, b(), this.f16296j, i11, e2, new f(), this.f16298l.y(), this.f16307v, this.f16298l.C()));
        this.mbridgeVideoView.setShowingTransparent(this.f15618af);
        this.mbridgeVideoView.setAdSession(this.am);
        if (this.f16303q && ((i12 = this.f16305s) == com.mbridge.msdk.foundation.same.a.G || i12 == com.mbridge.msdk.foundation.same.a.H)) {
            this.mbridgeVideoView.setIVRewardEnable(i12, this.f16306t, this.u);
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            if (getJSCommon() != null) {
                i13 = getJSCommon().h();
            } else {
                i13 = 1;
            }
            mBridgeVideoView.setDialogRole(i13);
        }
        this.f15625e.setCampaign(this.f15630z);
        this.f15625e.addOrderViewData(this.R);
        this.f15625e.setUnitID(this.f16296j);
        this.f15625e.setCloseDelayTime(i());
        this.f15625e.setPlayCloseBtnTm(this.f16298l.h());
        this.f15625e.setVideoInteractiveType(this.f16298l.g());
        this.f15625e.setEndscreenType(this.f16298l.q());
        this.f15625e.setVideoSkipTime(i15);
        this.f15625e.setShowingTransparent(this.f15618af);
        this.f15625e.setJSFactory(this.G);
        if (this.f15630z.getPlayable_ads_without_video() == 2) {
            this.f15625e.setNotifyListener(new com.mbridge.msdk.video.module.a.a.h(this.f15630z, this.A, this.f16300n, b(), this.f16296j, new d(), this.f16298l.y(), this.f16307v));
            this.f15625e.preLoadData(this.G);
            this.f15625e.showPlayableView();
        } else {
            this.f15625e.setNotifyListener(new com.mbridge.msdk.video.module.a.a.c(this.G, this.f15630z, this.f16300n, this.A, b(), this.f16296j, new c(this.f16295i, this.f15630z), this.f16298l.y(), this.f16307v));
            this.f15625e.preLoadData(this.G);
            this.mbridgeVideoView.preLoadData(this.G);
        }
        if (this.f15618af) {
            this.f15625e.setMBridgeClickMiniCardViewTransparent();
        }
    }

    public void onBackPressed() {
        MBridgeContainerView mBridgeContainerView;
        MBridgeContainerView mBridgeContainerView2;
        MBridgeVideoView mBridgeVideoView;
        MBridgeVideoView mBridgeVideoView2;
        if (this.f15618af && (mBridgeVideoView2 = this.mbridgeVideoView) != null) {
            mBridgeVideoView2.notifyVideoClose();
            return;
        }
        CampaignEx campaignEx = this.f15630z;
        if (((campaignEx != null && campaignEx.getRewardTemplateMode() != null && this.f15630z.getRewardTemplateMode().f() == 5002010) || this.f15620ah) && (mBridgeVideoView = this.mbridgeVideoView) != null) {
            if (mBridgeVideoView.isMiniCardShowing()) {
                MBridgeContainerView mBridgeContainerView3 = this.f15625e;
                if (mBridgeContainerView3 != null) {
                    mBridgeContainerView3.onMiniEndcardBackPress();
                    return;
                }
                return;
            }
            this.mbridgeVideoView.onBackPress();
            return;
        }
        if (this.aj && (mBridgeContainerView2 = this.f15625e) != null) {
            mBridgeContainerView2.onPlayableBackPress();
            return;
        }
        if (this.f15621ai && (mBridgeContainerView = this.f15625e) != null) {
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
            Activity activity = this.f16295i;
            if (activity != null && !this.f16307v && !this.ak) {
                this.ak = true;
                activity.onBackPressed();
                return;
            }
            return;
        }
        ad.a(f15612x, "onBackPressed can't excute");
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate() {
        boolean z10;
        ViewGroup viewGroup;
        int f10;
        int e2;
        List<CampaignEx> list;
        AppletsModel appletsModel;
        if (this.f16298l == null) {
            this.f16298l = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f16296j, this.f16303q);
        }
        try {
            if (this.f15630z != null) {
                try {
                    appletsModel = AppletModelManager.getInstance().get(this.f15630z);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                    }
                    appletsModel = null;
                }
                if (appletsModel != null) {
                    try {
                        if (appletsModel.can(0)) {
                            appletsModel.setUserClick(false);
                            appletsModel.requestWxAppletsScheme(0, new b(this.f15630z));
                        }
                    } catch (Exception e11) {
                        appletsModel.clearRequestState();
                        if (MBridgeConstans.DEBUG) {
                            e11.printStackTrace();
                        }
                    }
                }
            }
        } catch (Exception e12) {
            if (MBridgeConstans.DEBUG) {
                e12.printStackTrace();
            }
        }
        this.ak = false;
        try {
            if (this.f16307v) {
                CampaignEx campaignEx = this.f15630z;
                if (campaignEx != null && campaignEx.isDynamicView()) {
                    this.B = new com.mbridge.msdk.video.bt.module.b.d(getContext(), this.f16303q, this.f16298l, this.f15630z, this.B, b(), this.f16296j);
                } else {
                    this.B = new com.mbridge.msdk.video.bt.module.b.c(this.C, this.F);
                }
            } else {
                this.B = new com.mbridge.msdk.video.bt.module.b.d(getContext(), this.f16303q, this.f16298l, this.f15630z, this.B, b(), this.f16296j);
            }
            registerErrorListener(new com.mbridge.msdk.video.bt.module.b.e(this.T, this.B));
            a(this.f16298l, this.f15630z);
            setShowingTransparent();
            int layoutID = getLayoutID();
            if (layoutID <= 0) {
                a("layoutID not found");
                return;
            }
            View inflate = this.U.inflate(layoutID, (ViewGroup) null);
            this.f15629y = inflate;
            addView(inflate, new RelativeLayout.LayoutParams(-1, -1));
            if (this.a) {
                setMatchParent();
            }
            this.f15624d = findWindVaneWebView();
            MBridgeVideoView findMBridgeVideoView = findMBridgeVideoView();
            this.mbridgeVideoView = findMBridgeVideoView;
            findMBridgeVideoView.setVideoLayout(this.f15630z);
            this.mbridgeVideoView.setIsIV(this.f16303q);
            this.mbridgeVideoView.setUnitId(this.f16296j);
            this.mbridgeVideoView.setCamPlayOrderCallback(this.D, this.R, this.E, this.S);
            if (this.f16307v) {
                this.mbridgeVideoView.setNotchPadding(this.L, this.M, this.N, this.O);
            }
            MBridgeContainerView findMBridgeContainerView = findMBridgeContainerView();
            this.f15625e = findMBridgeContainerView;
            if (this.f16307v) {
                findMBridgeContainerView.setNotchPadding(this.K, this.L, this.M, this.N, this.O);
            }
            if (af.a().a("i_l_s_t_r_i", false)) {
                this.mbridgeVideoView.setPlayerViewAttachListener(new MBridgeVideoView.a() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.4
                    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
                    
                        if (r4.a.f15630z.isCampaignIsFiltered() != false) goto L12;
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
            if (this.mbridgeVideoView != null && this.f15625e != null && initViews()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                this.f15623c.a("not found View IDS");
                Activity activity = this.f16295i;
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            this.f15622b = true;
            WindVaneWebView windVaneWebView = this.f15624d;
            this.G = new com.mbridge.msdk.video.signal.factory.b(this.f16295i, windVaneWebView, this.mbridgeVideoView, this.f15625e, this.f15630z, new e());
            CampaignEx campaignEx2 = this.f15630z;
            if (campaignEx2 != null && campaignEx2.getDynamicTempCode() == 5 && (list = this.R) != null) {
                this.G.a(list);
            }
            registerJsFactory(this.G);
            com.mbridge.msdk.foundation.d.b.a().a(this.f16296j + "_1", new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.8
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
                    } catch (Throwable th2) {
                        ad.b(MBTempContainer.f15612x, th2.getMessage(), th2);
                        str = "";
                    }
                    g.a().a((WebView) MBTempContainer.this.f15624d, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
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
                    } catch (Throwable th2) {
                        ad.b(MBTempContainer.f15612x, th2.getMessage(), th2);
                        str = "";
                    }
                    g.a().a((WebView) MBTempContainer.this.f15624d, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
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
                    } catch (Throwable th2) {
                        ad.b(MBTempContainer.f15612x, th2.getMessage(), th2);
                        str2 = "";
                    }
                    g.a().a((WebView) MBTempContainer.this.f15624d, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
                }
            });
            g();
            if (windVaneWebView != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f15629y.findViewById(v.a(getContext(), "mbridge_video_templete_webview_parent", "id"));
                windVaneWebView.setApiManagerJSFactory(this.G);
                if (windVaneWebView.getParent() != null) {
                    defaultLoad(0, "preload template webview is null or load error");
                    return;
                }
                if (windVaneWebView.getObject() instanceof k) {
                    getJSCommon().a(this.ao);
                    getJSCommon().a(this.am);
                    getJSCommon().a(this.an);
                    getJSCommon().a(this.f16302p);
                    getJSCommon().a(this.f16296j);
                    getJSCommon().a(this.f16298l);
                    getJSCommon().a(new e());
                    CampaignEx campaignEx3 = this.f15630z;
                    if (campaignEx3 != null && (campaignEx3.isMraid() || this.f15630z.isActiveOm())) {
                        com.mbridge.msdk.mbsignalcommon.mraid.d dVar = new com.mbridge.msdk.mbsignalcommon.mraid.d(getContext());
                        this.al = dVar;
                        dVar.c();
                        this.al.a();
                        this.al.a(new d.b() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.9
                            @Override // com.mbridge.msdk.mbsignalcommon.mraid.d.b
                            public final void a(double d10) {
                                MBridgeContainerView mBridgeContainerView;
                                ad.b(MBTempContainer.f15612x, "volume is : " + d10);
                                try {
                                    if (MBTempContainer.this.f15630z.isMraid() && (mBridgeContainerView = MBTempContainer.this.f15625e) != null && mBridgeContainerView.getH5EndCardView() != null) {
                                        MBTempContainer.this.f15625e.getH5EndCardView().volumeChange(d10);
                                    }
                                } catch (Exception e13) {
                                    ad.b(MBTempContainer.f15612x, e13.getMessage());
                                }
                            }
                        });
                    }
                    getJSContainerModule().readyStatus(((k) windVaneWebView.getObject()).r());
                    try {
                        if (this.f15624d != null) {
                            int i10 = getResources().getConfiguration().orientation;
                            if (d()) {
                                f10 = ai.h(getContext());
                                e2 = ai.g(getContext());
                                if (com.mbridge.msdk.foundation.tools.d.a(getContext())) {
                                    int c10 = ai.c(getContext());
                                    if (i10 == 2) {
                                        f10 += c10;
                                    } else {
                                        e2 += c10;
                                    }
                                }
                            } else {
                                f10 = ai.f(getContext());
                                e2 = ai.e(getContext());
                            }
                            int b3 = this.f15630z.getRewardTemplateMode().b();
                            if (c(this.f15630z) == 1) {
                                b3 = i10;
                            }
                            getJSNotifyProxy().a(i10, b3, f10, e2);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(com.mbridge.msdk.foundation.same.a.f13281l, ai.d(getContext()));
                            try {
                                if (this.f16300n != null) {
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("name", this.f16300n.a());
                                    jSONObject2.put("amount", this.f16300n.b());
                                    jSONObject2.put("id", this.f16301o);
                                    jSONObject.put("userId", this.f16299m);
                                    jSONObject.put("reward", jSONObject2);
                                    jSONObject.put("playVideoMute", this.f16302p);
                                    jSONObject.put("extra", this.Q);
                                }
                            } catch (JSONException e13) {
                                ad.a(f15612x, e13.getMessage());
                            } catch (Exception e14) {
                                ad.a(f15612x, e14.getMessage());
                            }
                            String jSONObject3 = jSONObject.toString();
                            com.mbridge.msdk.foundation.same.report.d.d dVar2 = new com.mbridge.msdk.foundation.same.report.d.d();
                            dVar2.a("type", 2);
                            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000133", this.f15630z, dVar2);
                            getJSNotifyProxy().a(jSONObject3);
                            g.a().a((WebView) this.f15624d, "oncutoutfetched", Base64.encodeToString(this.P.getBytes(), 0));
                            getJSCommon().b(true);
                            if (com.mbridge.msdk.e.b.a()) {
                                setChinaCallBackStatus(this.f15624d);
                            }
                            loadModuleDatas();
                            this.f15626f.postDelayed(this.f15627g, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
                        }
                    } catch (Exception e15) {
                        if (MBridgeConstans.DEBUG) {
                            e15.printStackTrace();
                        }
                    }
                    ((k) windVaneWebView.getObject()).f16085m.a();
                    if (this.f16307v) {
                        getJSCommon().e(this.W);
                    }
                }
                if (getJSCommon().a() == 1 && (viewGroup = (ViewGroup) this.f15629y.findViewById(v.a(getContext(), "mbridge_video_templete_webview_parent", "id"))) != null) {
                    ((ViewGroup) this.f15629y).removeView(viewGroup);
                    ((ViewGroup) this.f15629y).addView(viewGroup, 1);
                }
                viewGroup2.addView(windVaneWebView, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            defaultLoad(0, "preload template webview is null or load error");
        } catch (Throwable th2) {
            th2.printStackTrace();
            a("onCreate error" + th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onDestroy() {
        CampaignEx campaignEx;
        int i10;
        if (this.J) {
            return;
        }
        boolean z10 = true;
        this.J = true;
        super.onDestroy();
        try {
            if (com.mbridge.msdk.e.b.a()) {
                setChinaDestroy();
            }
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.releasePlayer();
            }
            WindVaneWebView windVaneWebView = this.f15624d;
            if (windVaneWebView != null) {
                ViewGroup viewGroup = (ViewGroup) windVaneWebView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                this.f15624d.clearWebView();
                this.f15624d.release();
            }
            if (this.C != null) {
                this.C = null;
            }
            this.f15626f.removeCallbacks(this.f15627g);
            this.f15626f.removeCallbacks(this.f15628h);
            getJSCommon().e();
            if (this.f16303q) {
                com.mbridge.msdk.c.h.a().e(this.f16296j);
            }
            if (!this.f15614ab) {
                try {
                    this.f15614ab = true;
                    CampaignEx campaignEx2 = this.f15630z;
                    if (campaignEx2 != null && campaignEx2.getPlayable_ads_without_video() == 2) {
                        this.f15615ac = true;
                    }
                    ld.b bVar = this.an;
                    if (bVar != null && !this.f15615ac) {
                        try {
                            i iVar = bVar.a;
                            com.facebook.internal.i.d(iVar);
                            iVar.f20672e.a("skipped", null);
                        } catch (Exception e2) {
                            ad.a("omsdk", e2.getMessage());
                        }
                    }
                    h hVar = this.B;
                    if (hVar != null) {
                        if (this.f16303q && ((i10 = this.f16305s) == com.mbridge.msdk.foundation.same.a.G || i10 == com.mbridge.msdk.foundation.same.a.H)) {
                            if (this.I != 1) {
                                z10 = false;
                            }
                            hVar.a(z10, this.H);
                        }
                        if (!this.f15615ac) {
                            this.f16300n.a(0);
                        }
                        this.T.a(this.f15630z);
                        this.B.a(this.T, this.f15615ac, this.f16300n);
                    }
                    this.f15626f.removeCallbacks(this.ap);
                    if (((!this.f16303q && !this.f16307v) || ((campaignEx = this.f15630z) != null && campaignEx.isDynamicView())) && this.f15615ac && (!com.mbridge.msdk.e.b.a() || !checkChinaSendToServerDiff(this.B))) {
                        ad.a(f15612x, "sendToServerRewardInfo");
                        com.mbridge.msdk.video.module.b.b.a(this.f15630z, this.f16300n, this.f16296j, this.f16299m, this.Q);
                    }
                    if (!this.f16307v) {
                        if (this.f16303q) {
                            com.mbridge.msdk.videocommon.a.b(287, this.f15630z);
                        } else {
                            com.mbridge.msdk.videocommon.a.b(94, this.f15630z);
                        }
                    }
                    MBridgeContainerView mBridgeContainerView = this.f15625e;
                    if (mBridgeContainerView != null) {
                        mBridgeContainerView.release();
                    }
                } catch (Throwable th2) {
                    ad.b(f15612x, th2.getMessage(), th2);
                }
            }
            if (!this.f15617ae) {
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
            if (!this.f16307v) {
                if (isLoadSuccess()) {
                    this.f15626f.postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.7
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (((AbstractJSContainer) MBTempContainer.this).f16295i != null) {
                                ((AbstractJSContainer) MBTempContainer.this).f16295i.finish();
                            }
                        }
                    }, 100L);
                } else {
                    Activity activity = this.f16295i;
                    if (activity != null) {
                        activity.finish();
                    }
                }
            }
            if (!this.f15617ae) {
                f();
            }
            com.mbridge.msdk.video.bt.a.d.c().f(this.F);
        } catch (Throwable th3) {
            ad.a(f15612x, th3.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onPause() {
        super.onPause();
        this.f15616ad = true;
        try {
            getJSVideoModule().videoOperate(2);
            MBridgeContainerView mBridgeContainerView = this.f15625e;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.setOnPause();
            }
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.onActivityPause();
            }
        } catch (Throwable th2) {
            ad.b(f15612x, th2.getMessage(), th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onResume() {
        Runnable runnable;
        Activity activity;
        super.onResume();
        int i10 = this.V;
        if (i10 == -3) {
            runnable = this.f15627g;
        } else if (i10 == -4) {
            runnable = this.f15628h;
        } else {
            runnable = null;
        }
        if (runnable != null) {
            runnable.run();
            this.V = 0;
        }
        try {
            if (this.mbridgeVideoView != null && !e() && !this.mbridgeVideoView.isMiniCardShowing() && !com.mbridge.msdk.foundation.d.b.f13103c) {
                this.mbridgeVideoView.setCover(false);
            }
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.onActivityResume();
            }
            MBridgeContainerView mBridgeContainerView = this.f15625e;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.setOnResume();
            }
            if (this.f15616ad && !e() && !com.mbridge.msdk.foundation.d.b.f13103c) {
                getJSVideoModule().videoOperate(1);
            }
            Activity activity2 = this.f16295i;
            if (activity2 != null) {
                ai.a(activity2.getWindow().getDecorView());
            }
            if (this.f15618af && this.f15619ag && (activity = this.f16295i) != null) {
                activity.finish();
            }
        } catch (Throwable th2) {
            ad.b(f15612x, th2.getMessage(), th2);
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
        ad.a(f15612x, "receiveSuccess ,start hybrid");
        this.f15626f.removeCallbacks(this.f15628h);
        this.f15626f.postDelayed(this.ap, 250L);
    }

    public void registerErrorListener(a aVar) {
        this.f15623c = aVar;
    }

    public void setAdEvents(kd.a aVar) {
        this.ao = aVar;
        com.mbridge.msdk.video.signal.factory.b bVar = this.G;
        if (bVar != null && bVar.getJSCommon() != null) {
            this.G.getJSCommon().a(aVar);
        }
    }

    public void setAdSession(kd.b bVar) {
        this.am = bVar;
        com.mbridge.msdk.video.signal.factory.b bVar2 = this.G;
        if (bVar2 != null && bVar2.getJSCommon() != null) {
            this.G.getJSCommon().a(bVar);
        }
        MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setAdSession(bVar);
        }
    }

    public void setCamPlayOrderCallback(com.mbridge.msdk.video.dynview.e.a aVar, int i10) {
        this.D = aVar;
        this.E = i10;
    }

    public void setCampOrderViewData(List<CampaignEx> list, int i10) {
        if (list != null) {
            this.R = list;
        }
        this.S = i10;
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.f15630z = campaignEx;
        if (campaignEx != null) {
            com.mbridge.msdk.foundation.same.report.d.b b3 = com.mbridge.msdk.foundation.same.report.d.c.a().b(campaignEx.getCurrentLocalRid());
            this.T = b3;
            if (b3 == null) {
                this.T = new com.mbridge.msdk.foundation.same.report.d.b();
            }
            this.T.c(campaignEx.getCurrentLocalRid());
            this.T.a(campaignEx);
            if (TextUtils.isEmpty(campaignEx.getCampaignUnitId()) && !TextUtils.isEmpty(this.f16296j)) {
                campaignEx.setCampaignUnitId(this.f16296j);
            }
            AppletsModel appletsModel = AppletModelManager.getInstance().get(campaignEx);
            if (appletsModel != null) {
                this.aq = appletsModel.isSupportWxScheme();
            }
            com.mbridge.msdk.foundation.d.b.a().a(campaignEx.getCampaignUnitId() + "_1", campaignEx);
        }
    }

    public void setCampaignDownLoadTask(com.mbridge.msdk.videocommon.download.a aVar) {
        this.A = aVar;
    }

    public void setCampaignExpired(boolean z10) {
        try {
            CampaignEx campaignEx = this.f15630z;
            if (campaignEx != null) {
                if (z10) {
                    campaignEx.setSpareOfferFlag(1);
                    if (com.mbridge.msdk.e.b.a()) {
                        if (this.f16304r) {
                            this.f15630z.setCbt(0);
                        } else {
                            com.mbridge.msdk.videocommon.d.c cVar = this.f16298l;
                            if (cVar != null) {
                                if (cVar.y() == 1) {
                                    this.f15630z.setCbt(1);
                                } else {
                                    this.f15630z.setCbt(0);
                                }
                            }
                        }
                    } else {
                        com.mbridge.msdk.videocommon.d.c cVar2 = this.f16298l;
                        if (cVar2 != null) {
                            if (cVar2.y() == 1) {
                                this.f15630z.setCbt(1);
                            } else {
                                this.f15630z.setCbt(0);
                            }
                        }
                    }
                } else {
                    campaignEx.setSpareOfferFlag(0);
                    this.f15630z.setCbt(0);
                }
            }
        } catch (Exception e2) {
            ad.b(f15612x, e2.getMessage());
        }
    }

    public void setDeveloperExtraData(String str) {
        this.Q = str;
    }

    public void setInstanceId(String str) {
        this.F = str;
    }

    public void setJSFactory(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.G = bVar;
    }

    public void setMBridgeTempCallback(com.mbridge.msdk.video.bt.module.a.b bVar) {
        this.C = bVar;
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

    public void setNotchPadding(int i10, int i11, int i12, int i13, int i14) {
        this.K = i10;
        this.L = i11;
        this.M = i12;
        this.N = i13;
        this.O = i14;
        String a10 = r.a(i10, i11, i12, i13, i14);
        this.P = a10;
        ad.b(f15612x, a10);
        if (getJSCommon() != null && !TextUtils.isEmpty(this.P)) {
            getJSCommon().b(this.P);
            if (this.f15624d != null && !TextUtils.isEmpty(this.P)) {
                g.a().a((WebView) this.f15624d, "oncutoutfetched", Base64.encodeToString(this.P.getBytes(), 0));
            }
        }
        MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setNotchPadding(i11, i12, i13, i14);
        }
        MBridgeContainerView mBridgeContainerView = this.f15625e;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.setNotchPadding(i10, i11, i12, i13, i14);
        }
    }

    public void setShowRewardListener(h hVar) {
        this.B = hVar;
    }

    public void setShowingTransparent() {
        int a10;
        Activity activity;
        boolean d10 = d();
        this.f15618af = d10;
        if (!d10 && (a10 = v.a(getContext(), "mbridge_reward_theme", TtmlNode.TAG_STYLE)) > 1 && (activity = this.f16295i) != null) {
            activity.setTheme(a10);
        }
    }

    public void setVideoEvents(ld.b bVar) {
        this.an = bVar;
        com.mbridge.msdk.video.signal.factory.b bVar2 = this.G;
        if (bVar2 != null && bVar2.getJSCommon() != null) {
            this.G.getJSCommon().a(bVar);
        }
        MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setVideoEvents(bVar);
        }
    }

    public void setWebViewFront(int i10) {
        this.W = i10;
    }

    public void superDefaultLoad(int i10, String str) {
        this.f15626f.removeCallbacks(this.f15627g);
        this.f15626f.removeCallbacks(this.f15628h);
        this.f15623c.a(true);
        WindVaneWebView windVaneWebView = this.f15624d;
        if (windVaneWebView != null) {
            windVaneWebView.setVisibility(8);
        }
    }

    /* loaded from: classes4.dex */
    public class e extends a.C0213a {
        private e() {
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0213a, com.mbridge.msdk.video.signal.a.InterfaceC0212a
        public final void a() {
            super.a();
            MBTempContainer.this.receiveSuccess();
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0213a, com.mbridge.msdk.video.signal.a.InterfaceC0212a
        public final void b() {
            super.b();
            MBTempContainer mBTempContainer = MBTempContainer.this;
            Handler handler = mBTempContainer.f15626f;
            if (handler != null) {
                handler.removeCallbacks(mBTempContainer.f15627g);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0213a, com.mbridge.msdk.out.BaseTrackingListener
        public final void onFinishRedirection(Campaign campaign, String str) {
            super.onFinishRedirection(campaign, str);
            MBTempContainer.this.f15619ag = true;
            MBTempContainer.R(MBTempContainer.this);
            if (campaign != null && (campaign instanceof CampaignEx)) {
                try {
                    CampaignEx campaignEx = (CampaignEx) campaign;
                    String optString = new JSONObject(MBTempContainer.this.getJSVideoModule().getCurrentProgress()).optString(NotificationCompat.CATEGORY_PROGRESS, "");
                    if (campaignEx.getLinkType() == 3 && campaignEx.getEndcard_click_result() == 2 && optString.equals("1.0") && ((AbstractJSContainer) MBTempContainer.this).f16295i != null) {
                        if (((AbstractJSContainer) MBTempContainer.this).f16307v) {
                            MBTempContainer.r(MBTempContainer.this);
                        } else {
                            ((AbstractJSContainer) MBTempContainer.this).f16295i.finish();
                        }
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            if (MBTempContainer.this.aq) {
                MBTempContainer.this.onResume();
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0213a, com.mbridge.msdk.out.BaseTrackingListener
        public final void onRedirectionFailed(Campaign campaign, String str) {
            super.onRedirectionFailed(campaign, str);
            MBTempContainer.R(MBTempContainer.this);
            MBTempContainer.this.f15619ag = true;
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0213a, com.mbridge.msdk.out.BaseTrackingListener
        public final void onStartRedirection(Campaign campaign, String str) {
            super.onStartRedirection(campaign, str);
            MBTempContainer.P(MBTempContainer.this);
            if (MBTempContainer.this.aq) {
                MBTempContainer.this.onPause();
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0213a, com.mbridge.msdk.video.signal.a.InterfaceC0212a
        public final void a(boolean z10) {
            if (MBTempContainer.this.an != null) {
                try {
                    MBTempContainer.this.an.a();
                    ad.a("omsdk", "mbtc adUserInteraction click");
                } catch (Exception e2) {
                    ad.b("omsdk", e2.getMessage());
                }
            }
            super.a(z10);
            MBTempContainer.this.B.a(z10, ((AbstractJSContainer) MBTempContainer.this).f16297k, ((AbstractJSContainer) MBTempContainer.this).f16296j);
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0213a, com.mbridge.msdk.video.signal.a.InterfaceC0212a
        public final void a(int i10, String str) {
            super.a(i10, str);
            MBTempContainer.this.defaultLoad(i10, str);
        }
    }

    private void f() {
        com.mbridge.msdk.foundation.same.report.h hVar = new com.mbridge.msdk.foundation.same.report.h(getContext());
        CampaignEx campaignEx = this.f15630z;
        if (campaignEx != null) {
            hVar.b(campaignEx.getRequestId(), this.f15630z.getRequestIdNotice(), this.f15630z.getId(), this.f16296j, com.mbridge.msdk.mbsignalcommon.mraid.c.a(this.f15630z.getId()), this.f15630z.isBidCampaign());
            com.mbridge.msdk.mbsignalcommon.mraid.c.b(this.f15630z.getId());
            this.f15617ae = true;
        }
    }

    private void g() {
        kd.b bVar = this.am;
        if (bVar != null) {
            try {
                MBridgeContainerView mBridgeContainerView = this.f15625e;
                kd.e eVar = kd.e.OTHER;
                bVar.a(mBridgeContainerView, eVar);
                View view = this.f15613aa;
                if (view != null) {
                    this.am.a(view, eVar);
                }
                WindVaneWebView windVaneWebView = this.f15624d;
                if (windVaneWebView != null) {
                    this.am.a(windVaneWebView, eVar);
                }
                this.mbridgeVideoView.setVideoEvents(this.an);
                this.am.f();
                if (this.ao != null) {
                    r3 r3Var = new r3(0);
                    ad.a("omsdk", "bt:   adEvents.loaded");
                    this.ao.d(r3Var);
                    this.ao.b();
                }
            } catch (Exception e2) {
                ad.a("omsdk", e2.getMessage());
            }
        }
    }

    private int i() {
        CampaignEx campaignEx = this.f15630z;
        if (campaignEx == null) {
            return 1;
        }
        boolean a10 = ai.a(MBridgeConstans.DYNAMIC_VIEW_KEY_CLOSE_BTN_DELATE, campaignEx.getendcard_url());
        int c10 = ai.c(this.f15630z.getendcard_url(), MBridgeConstans.DYNAMIC_VIEW_KEY_CLOSE_BTN_DELATE);
        if (a10 && c10 >= 0) {
            return c10;
        }
        if (this.f15630z.getCbd() > -2) {
            return this.f15630z.getCbd();
        }
        return this.f16298l.p();
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
            com.mbridge.msdk.foundation.same.report.d.b bVar = mBTempContainer.T;
            if (bVar != null) {
                bVar.a("2000130", dVar);
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    private boolean d() {
        k b3 = b(this.f15630z);
        if (b3 != null) {
            return b3.p();
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
        k b3 = b(this.f15630z);
        if (b3 != null) {
            return b3.m();
        }
        return 0;
    }

    public static /* synthetic */ void h(MBTempContainer mBTempContainer) {
        try {
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a("temp_container", mBTempContainer.getWidth() + "x" + mBTempContainer.getHeight());
            if (mBTempContainer.f15624d != null) {
                dVar.a("web_view", mBTempContainer.f15624d.getWidth() + "x" + mBTempContainer.f15624d.getHeight());
            }
            if (mBTempContainer.mbridgeVideoView != null) {
                dVar.a("mbridge_video_view", mBTempContainer.mbridgeVideoView.getWidth() + "x" + mBTempContainer.mbridgeVideoView.getHeight());
                if (mBTempContainer.mbridgeVideoView.mPlayerView != null) {
                    dVar.a("player_view", mBTempContainer.mbridgeVideoView.mPlayerView.getWidth() + "x" + mBTempContainer.mbridgeVideoView.mPlayerView.getHeight());
                }
            }
            com.mbridge.msdk.foundation.same.report.d.b bVar = mBTempContainer.T;
            if (bVar != null) {
                bVar.a("2000136", dVar);
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public final void a(String str) {
        h hVar = this.B;
        if (hVar != null) {
            hVar.a(this.T, str);
        }
        super.a(str);
    }

    private void a(int i10, String str) {
        try {
            com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
            nVar.a("2000037");
            nVar.r("code=" + i10 + ",desc=" + str);
            CampaignEx campaignEx = this.f15630z;
            nVar.q((campaignEx == null || campaignEx.getRewardTemplateMode() == null) ? "" : this.f15630z.getRewardTemplateMode().e());
            nVar.c(this.f16296j);
            CampaignEx campaignEx2 = this.f15630z;
            nVar.e(campaignEx2 != null ? campaignEx2.getId() : "");
            CampaignEx campaignEx3 = this.f15630z;
            if (campaignEx3 != null && !TextUtils.isEmpty(campaignEx3.getRequestId())) {
                nVar.f(this.f15630z.getRequestId());
            }
            CampaignEx campaignEx4 = this.f15630z;
            if (campaignEx4 != null && !TextUtils.isEmpty(campaignEx4.getRequestIdNotice())) {
                nVar.g(this.f15630z.getRequestIdNotice());
            }
            int l10 = z.l(getContext());
            nVar.a(l10);
            nVar.k(z.a(getContext(), l10));
            com.mbridge.msdk.video.module.b.b.a(com.mbridge.msdk.foundation.entity.n.h(nVar), this.f16296j);
        } catch (Throwable th2) {
            ad.b(f15612x, th2.getMessage(), th2);
        }
    }

    private int a(int i10, int i11) {
        List<CampaignEx> list;
        if (i10 < 0 || (list = this.R) == null || list.size() == 0 || i11 <= 1) {
            return i10;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i11 - 1; i13++) {
            if (this.R.get(i13) != null) {
                i12 += this.R.get(i13).getVideoLength();
            }
        }
        if (i10 > i12) {
            return i10 - i12;
        }
        return 0;
    }

    public MBTempContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.E = 1;
        this.F = "";
        this.H = com.mbridge.msdk.foundation.same.a.F;
        this.J = false;
        this.P = "";
        this.R = new ArrayList();
        this.S = 0;
        this.a = false;
        this.f15622b = false;
        this.f15623c = new a.C0205a();
        this.f15626f = new Handler();
        this.V = 0;
        this.W = 0;
        this.f15627g = new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.1
            @Override // java.lang.Runnable
            public final void run() {
                if (MBTempContainer.this.getActivityProxy().h() != 0) {
                    MBTempContainer.this.V = -3;
                } else {
                    MBTempContainer.this.defaultLoad(-1, "WebView load timeout");
                }
            }
        };
        this.f15628h = new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.3
            @Override // java.lang.Runnable
            public final void run() {
                if (MBTempContainer.this.getActivityProxy().h() != 0) {
                    MBTempContainer.this.V = -4;
                } else {
                    MBTempContainer.this.defaultLoad(-3, "Signal Communication connect timeout");
                }
            }
        };
        this.f15614ab = false;
        this.f15615ac = false;
        this.f15616ad = false;
        this.f15618af = false;
        this.f15619ag = false;
        this.f15620ah = false;
        this.f15621ai = false;
        this.aj = false;
        this.ak = false;
        this.am = null;
        this.an = null;
        this.ao = null;
        this.ap = new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBTempContainer.6
            @Override // java.lang.Runnable
            public final void run() {
                if (MBTempContainer.this.f15613aa != null) {
                    MBTempContainer.this.f15613aa.setVisibility(8);
                }
            }
        };
        this.aq = false;
        init(context);
    }
}
