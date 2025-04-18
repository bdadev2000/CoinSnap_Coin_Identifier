package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.report.d.c;
import com.mbridge.msdk.foundation.same.report.d.d;
import com.mbridge.msdk.foundation.same.report.g;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.ao;
import com.mbridge.msdk.foundation.tools.r;
import com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView;
import com.mbridge.msdk.video.module.a.a;
import com.mbridge.msdk.video.module.a.a.i;
import com.mbridge.msdk.video.module.a.a.k;
import com.mbridge.msdk.video.module.a.a.l;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.factory.b;
import com.mbridge.msdk.video.signal.h;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class MBridgeContainerView extends MBridgeBaseView implements f, h {
    private int A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private int H;
    private boolean I;
    private boolean J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private String P;
    private b Q;
    private boolean R;
    private boolean S;
    private List<CampaignEx> T;

    /* renamed from: m, reason: collision with root package name */
    private MBridgePlayableView f15916m;

    /* renamed from: n, reason: collision with root package name */
    private MBridgeClickCTAView f15917n;

    /* renamed from: o, reason: collision with root package name */
    private MBridgeClickMiniCardView f15918o;

    /* renamed from: p, reason: collision with root package name */
    private MBridgeNativeEndCardView f15919p;

    /* renamed from: q, reason: collision with root package name */
    private MBridgeH5EndCardView f15920q;

    /* renamed from: r, reason: collision with root package name */
    private MBridgeVastEndCardView f15921r;

    /* renamed from: s, reason: collision with root package name */
    private MBridgeLandingPageView f15922s;

    /* renamed from: t, reason: collision with root package name */
    private MBridgeVideoEndCoverView f15923t;
    private MBridgeAlertWebview u;

    /* renamed from: v, reason: collision with root package name */
    private MBridgeOrderCampView f15924v;

    /* renamed from: w, reason: collision with root package name */
    private String f15925w;

    /* renamed from: x, reason: collision with root package name */
    private int f15926x;

    /* renamed from: y, reason: collision with root package name */
    private int f15927y;

    /* renamed from: z, reason: collision with root package name */
    private int f15928z;

    public MBridgeContainerView(Context context) {
        super(context);
        this.f15927y = 1;
        this.f15928z = 1;
        this.A = 1;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = true;
        this.F = false;
        this.G = false;
        this.I = false;
        this.J = false;
        this.R = false;
        this.S = false;
        this.T = new ArrayList();
    }

    private void b() {
        if (this.f15920q == null) {
            a(this.Q, 2);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f15920q;
        if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.isLoadSuccess()) {
            this.I = true;
            addView(this.f15920q);
            webviewshow();
            onConfigurationChanged(getResources().getConfiguration());
            this.f15920q.excuteTask();
            this.f15920q.setNotchValue(this.P, this.K, this.L, this.M, this.N);
            n nVar = new n();
            nVar.f(this.f15895b.getRequestId());
            nVar.g(this.f15895b.getRequestIdNotice());
            nVar.e(this.f15895b.getId());
            nVar.d(this.f15895b.isMraid() ? n.a : n.f13247b);
            g.d(nVar, this.a, this.f15925w);
        } else {
            e();
            MBridgeH5EndCardView mBridgeH5EndCardView2 = this.f15920q;
            if (mBridgeH5EndCardView2 != null) {
                mBridgeH5EndCardView2.reportRenderResult("timeout", 3);
                this.f15920q.setError(true);
            }
        }
        MBridgeH5EndCardView mBridgeH5EndCardView3 = this.f15920q;
        if (mBridgeH5EndCardView3 != null) {
            mBridgeH5EndCardView3.setUnitId(this.f15925w);
        }
    }

    private void e() {
        this.f15927y = 1;
        if (this.f15919p == null) {
            a(this.Q, 2);
        }
        addView(this.f15919p);
        onConfigurationChanged(getResources().getConfiguration());
        this.f15919p.notifyShowListener();
        this.S = true;
        bringToFront();
    }

    private void f() {
        if (this.f15918o == null) {
            b(-2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        if (this.D && this.E) {
            this.E = false;
            layoutParams.width = 1;
            layoutParams.height = 1;
        }
        addView(this.f15918o, layoutParams);
    }

    private void g() {
        if (this.u == null) {
            MBridgeAlertWebview mBridgeAlertWebview = new MBridgeAlertWebview(this.a);
            this.u = mBridgeAlertWebview;
            mBridgeAlertWebview.setUnitId(this.f15925w);
            this.u.setCampaign(this.f15895b);
        }
        this.u.preLoadData(this.Q);
    }

    private void h() {
        this.C = false;
        this.S = false;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            int i10 = 0;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                View childAt = viewGroup.getChildAt(i10);
                if (!(childAt instanceof MBridgeContainerView)) {
                    viewGroup.bringChildToFront(childAt);
                } else {
                    i10++;
                }
            }
        }
    }

    private void i() {
        boolean z10;
        CampaignEx campaignEx = this.f15895b;
        if (campaignEx == null) {
            return;
        }
        String str = campaignEx.getendcard_url();
        int i10 = 404;
        if (!TextUtils.isEmpty(str)) {
            try {
                i10 = Integer.parseInt(ao.a(str, "ecid"));
            } catch (Throwable th2) {
                ad.b(MBridgeBaseView.TAG, th2.getMessage());
            }
        }
        int i11 = i10;
        Context context = this.a;
        if (this.f15895b.getAdSpaceT() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f15919p = new MBridgeNativeEndCardView(context, null, true, i11, z10, this.f15904k, this.f15895b.getMof_tplid());
        if (this.f15895b.getDynamicTempCode() == 5) {
            a aVar = this.notifyListener;
            if (aVar != null && (aVar instanceof k)) {
                ((k) aVar).a(this.f15895b);
            }
            this.f15919p.setCampaign(this.f15895b);
            return;
        }
        this.f15919p.setCampaign(this.f15895b);
    }

    public void addOrderViewData(List<CampaignEx> list) {
        if (list == null) {
            return;
        }
        this.T = list;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (view != null) {
            a(view);
            super.addView(view);
        } else {
            ad.b(MBridgeBaseView.TAG, "view is null");
        }
    }

    public boolean canBackPress() {
        if (this.f15919p != null) {
            return false;
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f15920q;
        if (mBridgeH5EndCardView != null) {
            return mBridgeH5EndCardView.canBackPress();
        }
        MBridgeLandingPageView mBridgeLandingPageView = this.f15922s;
        if (mBridgeLandingPageView != null) {
            return mBridgeLandingPageView.canBackPress();
        }
        MBridgePlayableView mBridgePlayableView = this.f15916m;
        if (mBridgePlayableView == null) {
            return false;
        }
        return mBridgePlayableView.canBackPress();
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void configurationChanged(int i10, int i11, int i12) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f15918o;
        if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.getVisibility() == 0) {
            this.f15918o.resizeMiniCard(i10, i11);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean endCardShowing() {
        return this.B;
    }

    public boolean endcardIsPlayable() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f15920q;
        return mBridgeH5EndCardView != null && mBridgeH5EndCardView.isPlayable();
    }

    public MBridgeH5EndCardView getH5EndCardView() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f15920q;
        if (mBridgeH5EndCardView == null) {
            return this.f15916m;
        }
        return mBridgeH5EndCardView;
    }

    public CampaignEx getReSetCampaign() {
        if (!this.f15895b.isDynamicView() || !TextUtils.isEmpty(this.f15895b.getendcard_url())) {
            return null;
        }
        int size = this.T.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                if (this.T.get(i11) != null && this.T.get(i11).getId() == this.f15895b.getId()) {
                    i10 = i11 - 1;
                    break;
                }
                i11++;
            } else {
                break;
            }
        }
        if (i10 < 0 || i10 >= size || this.T.get(i10) == null) {
            return null;
        }
        return this.T.get(i10);
    }

    public boolean getShowingTransparent() {
        return this.D;
    }

    public String getUnitID() {
        return this.f15925w;
    }

    public int getVideoInteractiveType() {
        return this.f15926x;
    }

    public int getVideoSkipTime() {
        return this.H;
    }

    public void handlerPlayableException(String str) {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f15920q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.handlerPlayableException(str);
            if (!this.I) {
                return;
            }
        }
        a();
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void hideAlertWebview() {
        if (!isLast()) {
            if (this.R && !this.S) {
                h();
                this.R = false;
            }
            MBridgeAlertWebview mBridgeAlertWebview = this.u;
            if (mBridgeAlertWebview != null && mBridgeAlertWebview.getParent() != null) {
                removeView(this.u);
                MBridgeClickCTAView mBridgeClickCTAView = this.f15917n;
                if (mBridgeClickCTAView != null && mBridgeClickCTAView.getParent() != null) {
                    setWrapContent();
                    ViewGroup.LayoutParams layoutParams = getLayoutParams();
                    if (layoutParams instanceof RelativeLayout.LayoutParams) {
                        ((RelativeLayout.LayoutParams) layoutParams).addRule(12, -1);
                    }
                }
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        setVisibility(0);
    }

    public void install(CampaignEx campaignEx) {
        this.notifyListener.a(105, campaignEx);
    }

    public boolean isLast() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null || viewGroup.indexOfChild(this) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void ivRewardAdsWithoutVideo(String str) {
        this.notifyListener.a(103, str);
    }

    public boolean miniCardLoaded() {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f15918o;
        return mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.isLoadSuccess();
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean miniCardShowing() {
        return this.C;
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i10) {
        MBridgePlayableView mBridgePlayableView = this.f15916m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.notifyCloseBtn(i10);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f15920q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.notifyCloseBtn(i10);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        MBridgeBaseView[] mBridgeBaseViewArr = {this.f15916m, this.f15917n, this.f15918o, this.f15919p, this.f15920q, this.f15921r, this.f15922s, this.f15923t};
        for (int i10 = 0; i10 < 8; i10++) {
            MBridgeBaseView mBridgeBaseView = mBridgeBaseViewArr[i10];
            if (mBridgeBaseView != null && (mBridgeBaseView instanceof MBridgeClickMiniCardView)) {
                mBridgeBaseView.onSelfConfigurationChanged(configuration);
            } else if (mBridgeBaseView != null && mBridgeBaseView.getVisibility() == 0 && mBridgeBaseView.getParent() != null && !isLast()) {
                mBridgeBaseView.onSelfConfigurationChanged(configuration);
            }
        }
    }

    public void onEndcardBackPress() {
        if (this.f15919p == null && this.f15921r == null) {
            if (this.f15922s != null) {
                this.notifyListener.a(103, "");
                return;
            }
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f15920q;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.onBackPress();
                return;
            }
            return;
        }
        this.notifyListener.a(104, "");
        try {
            com.mbridge.msdk.video.dynview.moffer.a.a().b();
        } catch (Exception e2) {
            ad.b(MBridgeBaseView.TAG, e2.getMessage());
        }
    }

    public void onMiniEndcardBackPress() {
        if (this.C) {
            this.notifyListener.a(107, "");
        }
    }

    public void onPlayableBackPress() {
        MBridgePlayableView mBridgePlayableView = this.f15916m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.onBackPress();
        }
    }

    public void orientation(Configuration configuration) {
        MBridgeH5EndCardView[] mBridgeH5EndCardViewArr = {this.f15916m, this.f15918o, this.f15920q, this.u};
        for (int i10 = 0; i10 < 4; i10++) {
            MBridgeH5EndCardView mBridgeH5EndCardView = mBridgeH5EndCardViewArr[i10];
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getVisibility() == 0) {
                mBridgeH5EndCardView.orientation(getResources().getConfiguration());
            }
        }
    }

    public void preLoadData(final b bVar) {
        this.Q = bVar;
        CampaignEx campaignEx = this.f15895b;
        if (campaignEx != null) {
            if (campaignEx.getPlayable_ads_without_video() == 2) {
                if (this.f15916m == null) {
                    this.f15916m = new MBridgePlayableView(this.a);
                }
                this.f15916m.setCloseDelayShowTime(this.f15928z);
                this.f15916m.setPlayCloseBtnTm(this.A);
                this.f15916m.setCampaign(this.f15895b);
                this.f15916m.setNotifyListener(new i(this.notifyListener) { // from class: com.mbridge.msdk.video.module.MBridgeContainerView.4
                    @Override // com.mbridge.msdk.video.module.a.a.i, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
                    public final void a(int i10, Object obj) {
                        int i11;
                        super.a(i10, obj);
                        if (i10 == 100) {
                            MBridgeContainerView.this.webviewshow();
                            MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                            mBridgeContainerView.onConfigurationChanged(mBridgeContainerView.getResources().getConfiguration());
                            n nVar = new n();
                            nVar.f(MBridgeContainerView.this.f15895b.getRequestId());
                            nVar.g(MBridgeContainerView.this.f15895b.getRequestIdNotice());
                            nVar.e(MBridgeContainerView.this.f15895b.getId());
                            if (MBridgeContainerView.this.f15895b.isMraid()) {
                                i11 = n.a;
                            } else {
                                i11 = n.f13247b;
                            }
                            nVar.d(i11);
                            MBridgeContainerView mBridgeContainerView2 = MBridgeContainerView.this;
                            g.d(nVar, mBridgeContainerView2.a, mBridgeContainerView2.f15925w);
                        }
                    }
                });
                this.f15916m.preLoadData(bVar);
            } else {
                b(this.f15926x);
                if (this.f15895b.isDynamicView()) {
                    try {
                        a(bVar, Integer.valueOf(this.f15895b.getVideo_end_type()));
                    } catch (Throwable th2) {
                        ad.b(MBridgeBaseView.TAG, th2.getMessage());
                        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeContainerView.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                                mBridgeContainerView.a(bVar, Integer.valueOf(mBridgeContainerView.f15895b.getVideo_end_type()));
                            }
                        });
                    }
                    if (!ai.l(this.f15895b.getendcard_url())) {
                        try {
                            String a = ao.a(this.f15895b.getendcard_url(), "mof");
                            if (!TextUtils.isEmpty(a) && Integer.parseInt(a) == 1) {
                                com.mbridge.msdk.video.dynview.moffer.a.a().a(this.f15895b, 2);
                            }
                        } catch (Exception e2) {
                            ad.b(MBridgeBaseView.TAG, e2.getMessage());
                        }
                    }
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeContainerView.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                            mBridgeContainerView.a(bVar, Integer.valueOf(mBridgeContainerView.f15895b.getVideo_end_type()));
                        }
                    }, getVideoSkipTime());
                }
            }
            g();
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void readyStatus(int i10) {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f15920q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.readyStatus(i10);
        }
    }

    public void release() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f15920q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.release();
            this.f15920q = null;
        }
        MBridgePlayableView mBridgePlayableView = this.f15916m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.release();
        }
        MBridgeLandingPageView mBridgeLandingPageView = this.f15922s;
        if (mBridgeLandingPageView != null) {
            mBridgeLandingPageView.release();
        }
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f15919p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.clearMoreOfferBitmap();
            this.f15919p.release();
        }
        if (this.notifyListener != null) {
            this.notifyListener = null;
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void resizeMiniCard(int i10, int i11, int i12) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f15918o;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.resizeMiniCard(i10, i11);
            this.f15918o.setRadius(i12);
            removeAllViews();
            setMatchParent();
            this.S = true;
            bringToFront();
            f();
        }
    }

    public void setCloseDelayTime(int i10) {
        this.f15928z = i10;
    }

    public void setEndscreenType(int i10) {
        this.f15927y = i10;
    }

    public void setJSFactory(b bVar) {
        this.Q = bVar;
    }

    public void setMBridgeClickMiniCardViewTransparent() {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f15918o;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.setMBridgeClickMiniCardViewTransparent();
            this.f15918o.setMBridgeClickMiniCardViewClickable(false);
        }
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13, int i14) {
        ad.b(MBridgeBaseView.TAG, "NOTCH ContainerView " + String.format("%1s-%2s-%3s-%4s-%5s", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i10)));
        this.O = i10;
        this.K = i11;
        this.L = i12;
        this.M = i13;
        this.N = i14;
        this.P = r.a(i10, i11, i12, i13, i14);
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f15919p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setNotchPadding(i11, i12, i13, i14);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f15920q;
        if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.f15934p != null) {
            mBridgeH5EndCardView.setNotchValue(this.P, i11, i12, i13, i14);
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) this.f15920q.f15934p, "oncutoutfetched", Base64.encodeToString(this.P.getBytes(), 0));
        }
        MBridgePlayableView mBridgePlayableView = this.f15916m;
        if (mBridgePlayableView != null && mBridgePlayableView.f15934p != null) {
            mBridgePlayableView.setNotchValue(this.P, i11, i12, i13, i14);
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) this.f15916m.f15934p, "oncutoutfetched", Base64.encodeToString(this.P.getBytes(), 0));
        }
        MBridgeOrderCampView mBridgeOrderCampView = this.f15924v;
        if (mBridgeOrderCampView != null) {
            mBridgeOrderCampView.setNotchPadding(i11, i12, i13, i14);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void setNotifyListener(a aVar) {
        super.setNotifyListener(aVar);
        MBridgeBaseView[] mBridgeBaseViewArr = {this.f15916m, this.f15917n, this.f15918o, this.f15919p, this.f15920q, this.f15921r, this.f15922s, this.f15923t};
        for (int i10 = 0; i10 < 8; i10++) {
            MBridgeBaseView mBridgeBaseView = mBridgeBaseViewArr[i10];
            if (mBridgeBaseView != null) {
                if (mBridgeBaseView instanceof MBridgeClickMiniCardView) {
                    mBridgeBaseView.setNotifyListener(new com.mbridge.msdk.video.module.a.a.g(this.f15918o, aVar));
                } else {
                    mBridgeBaseView.setNotifyListener(new i(aVar));
                }
            }
        }
    }

    public void setOnPause() {
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f15919p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setOnPause();
        }
    }

    public void setOnResume() {
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f15919p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setOnResume();
        }
    }

    public void setPlayCloseBtnTm(int i10) {
        this.A = i10;
    }

    public void setRewardStatus(boolean z10) {
        this.J = z10;
    }

    public void setShowingTransparent(boolean z10) {
        this.D = z10;
    }

    public void setUnitID(String str) {
        this.f15925w = str;
    }

    public void setVideoInteractiveType(int i10) {
        CampaignEx campaignEx = this.f15895b;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            int a = com.mbridge.msdk.video.dynview.i.a.a(this.f15895b);
            if (a == 100) {
                this.f15926x = i10;
                return;
            } else {
                this.f15926x = a;
                return;
            }
        }
        this.f15926x = i10;
    }

    public void setVideoSkipTime(int i10) {
        this.H = i10;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean showAlertWebView() {
        boolean z10;
        MBridgeAlertWebview mBridgeAlertWebview = this.u;
        if (mBridgeAlertWebview == null || !mBridgeAlertWebview.isLoadSuccess()) {
            return false;
        }
        setMatchParent();
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup.indexOfChild(this) == viewGroup.getChildCount() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && !this.S) {
            removeAllViews();
            bringToFront();
            this.R = true;
        }
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f15918o;
        if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.getParent() != null) {
            return false;
        }
        if (this.u == null) {
            g();
        }
        MBridgeAlertWebview mBridgeAlertWebview2 = this.u;
        if (mBridgeAlertWebview2 != null && mBridgeAlertWebview2.getParent() != null) {
            removeView(this.u);
        }
        addView(this.u);
        setBackgroundColor(0);
        this.u.webviewshow();
        return true;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showEndcard(int i10) {
        CampaignEx campaignEx = this.f15895b;
        if (campaignEx != null) {
            if (i10 != 1) {
                if (i10 != 100) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                removeAllViews();
                                setMatchParent();
                                this.S = true;
                                bringToFront();
                                a();
                                this.notifyListener.a(117, "");
                            } else {
                                this.notifyListener.a(106, "");
                            }
                        } else {
                            this.notifyListener.a(113, "");
                            removeAllViews();
                            setMatchParent();
                            if (this.f15922s == null) {
                                a(this.Q, 4);
                            }
                            this.f15922s.setUnitId(this.f15925w);
                            this.f15922s.preLoadData(this.Q);
                            addView(this.f15922s);
                            this.S = true;
                            bringToFront();
                        }
                    } else {
                        removeAllViews();
                        setMatchParent();
                        if (this.f15921r == null) {
                            a(this.Q, 3);
                        }
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        layoutParams.addRule(13, -1);
                        addView(this.f15921r, layoutParams);
                        this.f15921r.notifyShowListener();
                        this.S = true;
                        bringToFront();
                    }
                } else {
                    if (campaignEx.getPlayable_ads_without_video() == 2) {
                        this.G = true;
                    }
                    a(this.f15916m);
                    setMatchParent();
                    e();
                }
            } else {
                this.notifyListener.a(104, "");
            }
        }
        this.B = true;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showMiniCard(int i10, int i11, int i12, int i13, int i14) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f15918o;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.setMiniCardLocation(i10, i11, i12, i13);
            this.f15918o.setRadius(i14);
            this.f15918o.setCloseVisible(8);
            this.f15918o.setClickable(false);
            removeAllViews();
            setMatchParent();
            this.S = true;
            bringToFront();
            f();
            if (!this.F) {
                this.F = true;
                this.notifyListener.a(109, "");
                this.notifyListener.a(117, "");
            }
        }
    }

    public void showOrderCampView() {
        MBridgeOrderCampView mBridgeOrderCampView = new MBridgeOrderCampView(this.a);
        this.f15924v = mBridgeOrderCampView;
        mBridgeOrderCampView.setCampaignExes(this.T);
        a aVar = this.notifyListener;
        if (aVar != null && (aVar instanceof k)) {
            ((k) aVar).a(this.T);
        }
        this.f15924v.setNotifyListener(new i(this.notifyListener));
        this.f15924v.setRewarded(this.J);
        this.f15924v.setNotchPadding(this.K, this.L, this.M, this.N);
        this.f15924v.setCampOrderViewBuildCallback(new com.mbridge.msdk.video.dynview.e.b() { // from class: com.mbridge.msdk.video.module.MBridgeContainerView.3
            @Override // com.mbridge.msdk.video.dynview.e.b
            public final void a() {
                a aVar2 = MBridgeContainerView.this.notifyListener;
                if (aVar2 != null) {
                    aVar2.a(117, "");
                }
            }

            @Override // com.mbridge.msdk.video.dynview.e.b
            public final void b() {
                if (MBridgeContainerView.this.f15895b.getAdSpaceT() == 2) {
                    MBridgeContainerView.this.showVideoEndCover();
                } else {
                    MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                    mBridgeContainerView.showEndcard(mBridgeContainerView.f15895b.getVideo_end_type());
                }
            }
        });
        this.f15924v.createView(this);
    }

    public void showPlayableView() {
        if (this.f15895b != null && !this.G) {
            removeAllViews();
            setMatchParent();
            if (this.f15916m == null) {
                preLoadData(this.Q);
            }
            addView(this.f15916m);
            MBridgePlayableView mBridgePlayableView = this.f15916m;
            if (mBridgePlayableView != null) {
                mBridgePlayableView.setUnitId(this.f15925w);
                CampaignEx campaignEx = this.f15895b;
                if (campaignEx != null && campaignEx.isMraid() && this.f15895b.getPlayable_ads_without_video() == 2) {
                    this.f15916m.setCloseVisible(0);
                }
                this.f15916m.setNotchValue(this.P, this.K, this.L, this.M, this.N);
            }
            this.S = true;
            bringToFront();
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoClickView(int i10) {
        CampaignEx campaignEx;
        if (this.f15895b != null) {
            if (i10 != -1) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        MBridgeClickCTAView mBridgeClickCTAView = this.f15917n;
                        if (mBridgeClickCTAView != null && mBridgeClickCTAView.getParent() != null) {
                            removeView(this.f15917n);
                        }
                        MBridgeAlertWebview mBridgeAlertWebview = this.u;
                        if (mBridgeAlertWebview != null && mBridgeAlertWebview.getParent() != null) {
                            return;
                        }
                        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f15918o;
                        if (mBridgeClickMiniCardView == null || mBridgeClickMiniCardView.getParent() == null) {
                            try {
                                CampaignEx campaignEx2 = this.f15895b;
                                if (campaignEx2 != null && campaignEx2.getPlayable_ads_without_video() == 1) {
                                    setMatchParent();
                                    f();
                                }
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                        if (miniCardLoaded()) {
                            MBridgeH5EndCardView mBridgeH5EndCardView = this.f15920q;
                            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getParent() != null) {
                                removeView(this.f15920q);
                            }
                            this.notifyListener.a(112, "");
                            CampaignEx campaignEx3 = this.f15895b;
                            if (campaignEx3 != null && !campaignEx3.isHasReportAdTrackPause()) {
                                this.f15895b.setHasReportAdTrackPause(true);
                                com.mbridge.msdk.video.module.b.b.f(this.a, this.f15895b);
                            }
                            if (this.D) {
                                this.notifyListener.a(115, "");
                            } else {
                                this.S = true;
                                bringToFront();
                                webviewshow();
                                onConfigurationChanged(getResources().getConfiguration());
                            }
                            this.C = true;
                            return;
                        }
                        h();
                        return;
                    }
                    return;
                }
                if (this.B) {
                    return;
                }
                MBridgeH5EndCardView mBridgeH5EndCardView2 = this.f15920q;
                if (mBridgeH5EndCardView2 != null && mBridgeH5EndCardView2.getParent() != null) {
                    removeView(this.f15920q);
                }
                MBridgeClickMiniCardView mBridgeClickMiniCardView2 = this.f15918o;
                if (mBridgeClickMiniCardView2 != null && mBridgeClickMiniCardView2.getParent() != null) {
                    removeView(this.f15918o);
                }
                MBridgeClickCTAView mBridgeClickCTAView2 = this.f15917n;
                if (mBridgeClickCTAView2 == null || mBridgeClickCTAView2.getParent() == null) {
                    try {
                        CampaignEx campaignEx4 = this.f15895b;
                        if (campaignEx4 != null && campaignEx4.getPlayable_ads_without_video() == 1) {
                            this.S = true;
                            if (this.f15917n == null) {
                                b(-1);
                            }
                            if (this.f15917n != null && ((campaignEx = this.f15895b) == null || !campaignEx.isDynamicView())) {
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                                layoutParams.addRule(12, -1);
                                addView(this.f15917n, 0, layoutParams);
                            }
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
                if (isLast()) {
                    bringToFront();
                    return;
                }
                return;
            }
            if (!isLast() && !endCardShowing()) {
                h();
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoEndCover() {
        removeAllViews();
        setMatchParent();
        MBridgeVideoEndCoverView mBridgeVideoEndCoverView = this.f15923t;
        if (mBridgeVideoEndCoverView == null) {
            b bVar = this.Q;
            this.Q = bVar;
            if (mBridgeVideoEndCoverView == null) {
                MBridgeVideoEndCoverView mBridgeVideoEndCoverView2 = new MBridgeVideoEndCoverView(this.a);
                this.f15923t = mBridgeVideoEndCoverView2;
                mBridgeVideoEndCoverView2.setCampaign(this.f15895b);
                this.f15923t.setNotifyListener(new i(this.notifyListener));
                this.f15923t.preLoadData(bVar);
            }
        }
        addView(this.f15923t);
        onConfigurationChanged(getResources().getConfiguration());
        this.S = true;
        bringToFront();
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i10) {
        MBridgePlayableView mBridgePlayableView = this.f15916m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.toggleCloseBtn(i10);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f15920q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.toggleCloseBtn(i10);
        }
    }

    public void triggerCloseBtn(String str) {
        try {
            d dVar = new d();
            dVar.a("type", 2);
            c.a().a("2000152", dVar);
            c.a().a("2000134", this.f15895b);
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                th2.printStackTrace();
            }
        }
        if (this.f15895b != null) {
            this.notifyListener.a(122, "");
            this.notifyListener.a(104, "");
        }
    }

    public void webviewshow() {
        try {
            d dVar = new d();
            dVar.a("type", 3);
            c.a().a("2000133", this.f15895b, dVar);
        } catch (Exception unused) {
        }
        MBridgeH5EndCardView[] mBridgeH5EndCardViewArr = {this.f15916m, this.f15918o, this.f15920q, this.u};
        for (int i10 = 0; i10 < 4; i10++) {
            MBridgeH5EndCardView mBridgeH5EndCardView = mBridgeH5EndCardViewArr[i10];
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getVisibility() == 0 && mBridgeH5EndCardView.getParent() != null && !isLast()) {
                mBridgeH5EndCardView.webviewshow();
            }
        }
    }

    private void a(View view) {
        if (view != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            } catch (Throwable th2) {
                ad.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view != null) {
            a(view);
            super.addView(view, layoutParams);
        } else {
            ad.b(MBridgeBaseView.TAG, "view is null");
        }
    }

    private void a() {
        CampaignEx campaignEx = this.f15895b;
        if (campaignEx != null) {
            boolean isDynamicView = campaignEx.isDynamicView();
            boolean l10 = ai.l(this.f15895b.getendcard_url());
            if (isDynamicView && !l10 && !this.f15895b.isMraid()) {
                e();
                return;
            }
        }
        if (this.f15927y == 2 && !this.I) {
            b();
        } else {
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar, Integer num) {
        a aVar;
        CampaignEx campaignEx;
        this.Q = bVar;
        CampaignEx campaignEx2 = this.f15895b;
        if (campaignEx2 != null) {
            if (num == null) {
                num = Integer.valueOf(campaignEx2.getVideo_end_type());
            }
            if (!isLast()) {
                h();
            }
            int intValue = num.intValue();
            if (intValue != 1) {
                if (intValue == 3) {
                    if (this.f15921r == null) {
                        this.f15921r = new MBridgeVastEndCardView(this.a);
                    }
                    this.f15921r.setCampaign(this.f15895b);
                    this.f15921r.setNotifyListener(new l(this.notifyListener));
                    this.f15921r.preLoadData(bVar);
                    return;
                }
                if (intValue == 4) {
                    if (this.f15922s == null) {
                        this.f15922s = new MBridgeLandingPageView(this.a);
                    }
                    this.f15922s.setCampaign(this.f15895b);
                    this.f15922s.setNotifyListener(new i(this.notifyListener));
                    return;
                }
                if (intValue != 5) {
                    if (this.f15927y == 2) {
                        boolean isDynamicView = this.f15895b.isDynamicView();
                        boolean l10 = ai.l(this.f15895b.getendcard_url());
                        if ((!isDynamicView || l10 || (campaignEx = this.f15895b) == null || campaignEx.isMraid()) && this.f15895b.getAdSpaceT() != 2) {
                            if (this.f15920q == null) {
                                this.f15920q = new MBridgeH5EndCardView(this.a);
                                try {
                                    d dVar = new d();
                                    dVar.a("type", 3);
                                    c.a().a("2000154", this.f15895b, dVar);
                                } catch (Throwable th2) {
                                    ad.b(MBridgeBaseView.TAG, th2.getMessage());
                                }
                            }
                            if (this.f15895b.getDynamicTempCode() == 5 && (aVar = this.notifyListener) != null && (aVar instanceof k)) {
                                ((k) aVar).a(this.f15895b);
                            }
                            this.f15920q.setCampaign(this.f15895b);
                            this.f15920q.setCloseDelayShowTime(this.f15928z);
                            this.f15920q.setNotifyListener(new i(this.notifyListener));
                            this.f15920q.setUnitId(this.f15925w);
                            this.f15920q.setNotchValue(this.P, this.K, this.L, this.M, this.N);
                            this.f15920q.preLoadData(bVar);
                            if (this.D) {
                                return;
                            }
                            addView(this.f15920q);
                            return;
                        }
                        return;
                    }
                    CampaignEx campaignEx3 = this.f15895b;
                    int b3 = (campaignEx3 == null || campaignEx3.getRewardTemplateMode() == null) ? 0 : this.f15895b.getRewardTemplateMode().b();
                    if (this.f15919p == null) {
                        if (this.f15895b.isDynamicView()) {
                            i();
                        } else {
                            MBridgeNativeEndCardView mBridgeNativeEndCardView = new MBridgeNativeEndCardView(this.a, null, false, -1, this.f15895b.getAdSpaceT() == 2, b3, this.f15895b.getMof_tplid());
                            this.f15919p = mBridgeNativeEndCardView;
                            mBridgeNativeEndCardView.setCampaign(this.f15895b);
                        }
                    }
                    this.f15919p.setLayout();
                    if (this.f15895b.isDynamicView()) {
                        if (com.mbridge.msdk.video.dynview.moffer.a.a().a(this.f15895b.getRequestId() + "_" + this.f15895b.getId())) {
                            try {
                                com.mbridge.msdk.video.dynview.moffer.a.a().a(this.f15919p, this.f15895b.getRequestId() + "_" + this.f15895b.getId(), new i(this.notifyListener));
                            } catch (Exception e2) {
                                ad.b(MBridgeBaseView.TAG, e2.getMessage());
                            }
                        } else {
                            try {
                                String a = ao.a(this.f15895b.getendcard_url(), "mof");
                                if (!TextUtils.isEmpty(a) && Integer.parseInt(a) == 1) {
                                    com.mbridge.msdk.video.dynview.moffer.a.a().a(this.f15895b, this.f15919p, new i(this.notifyListener), 2);
                                }
                            } catch (Exception e10) {
                                ad.b(MBridgeBaseView.TAG, e10.getMessage());
                            }
                        }
                    }
                    this.f15919p.setUnitId(this.f15925w);
                    this.f15919p.setCloseBtnDelay(this.f15928z);
                    this.f15919p.setNotifyListener(new i(this.notifyListener));
                    this.f15919p.preLoadData(bVar);
                    this.f15919p.setNotchPadding(this.K, this.L, this.M, this.N);
                }
            }
        }
    }

    public MBridgeContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15927y = 1;
        this.f15928z = 1;
        this.A = 1;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = true;
        this.F = false;
        this.G = false;
        this.I = false;
        this.J = false;
        this.R = false;
        this.S = false;
        this.T = new ArrayList();
    }

    private void b(int i10) {
        if (i10 != -3) {
            if (i10 != -2) {
                if (this.f15917n == null) {
                    this.f15917n = new MBridgeClickCTAView(this.a);
                }
                this.f15917n.setCampaign(this.f15895b);
                this.f15917n.setUnitId(this.f15925w);
                this.f15917n.setNotifyListener(new i(this.notifyListener));
                this.f15917n.preLoadData(this.Q);
                return;
            }
            CampaignEx campaignEx = this.f15895b;
            if (campaignEx == null || campaignEx.getVideo_end_type() != 2) {
                return;
            }
            if (this.f15918o == null) {
                this.f15918o = new MBridgeClickMiniCardView(this.a);
            }
            this.f15918o.setCampaign(this.f15895b);
            MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f15918o;
            mBridgeClickMiniCardView.setNotifyListener(new com.mbridge.msdk.video.module.a.a.g(mBridgeClickMiniCardView, this.notifyListener));
            this.f15918o.preLoadData(this.Q);
            setMatchParent();
            f();
            h();
        }
    }
}
