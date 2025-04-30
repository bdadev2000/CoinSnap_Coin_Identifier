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

/* loaded from: classes3.dex */
public class MBridgeContainerView extends MBridgeBaseView implements f, h {

    /* renamed from: A, reason: collision with root package name */
    private int f18793A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f18794B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f18795C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f18796D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f18797E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f18798F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f18799G;

    /* renamed from: H, reason: collision with root package name */
    private int f18800H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f18801I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f18802J;

    /* renamed from: K, reason: collision with root package name */
    private int f18803K;

    /* renamed from: L, reason: collision with root package name */
    private int f18804L;

    /* renamed from: M, reason: collision with root package name */
    private int f18805M;

    /* renamed from: N, reason: collision with root package name */
    private int f18806N;
    private int O;

    /* renamed from: P, reason: collision with root package name */
    private String f18807P;

    /* renamed from: Q, reason: collision with root package name */
    private b f18808Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f18809R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f18810S;

    /* renamed from: T, reason: collision with root package name */
    private List<CampaignEx> f18811T;
    private MBridgePlayableView m;

    /* renamed from: n, reason: collision with root package name */
    private MBridgeClickCTAView f18812n;

    /* renamed from: o, reason: collision with root package name */
    private MBridgeClickMiniCardView f18813o;

    /* renamed from: p, reason: collision with root package name */
    private MBridgeNativeEndCardView f18814p;

    /* renamed from: q, reason: collision with root package name */
    private MBridgeH5EndCardView f18815q;

    /* renamed from: r, reason: collision with root package name */
    private MBridgeVastEndCardView f18816r;

    /* renamed from: s, reason: collision with root package name */
    private MBridgeLandingPageView f18817s;

    /* renamed from: t, reason: collision with root package name */
    private MBridgeVideoEndCoverView f18818t;

    /* renamed from: u, reason: collision with root package name */
    private MBridgeAlertWebview f18819u;

    /* renamed from: v, reason: collision with root package name */
    private MBridgeOrderCampView f18820v;

    /* renamed from: w, reason: collision with root package name */
    private String f18821w;

    /* renamed from: x, reason: collision with root package name */
    private int f18822x;

    /* renamed from: y, reason: collision with root package name */
    private int f18823y;

    /* renamed from: z, reason: collision with root package name */
    private int f18824z;

    public MBridgeContainerView(Context context) {
        super(context);
        this.f18823y = 1;
        this.f18824z = 1;
        this.f18793A = 1;
        this.f18794B = false;
        this.f18795C = false;
        this.f18796D = false;
        this.f18797E = true;
        this.f18798F = false;
        this.f18799G = false;
        this.f18801I = false;
        this.f18802J = false;
        this.f18809R = false;
        this.f18810S = false;
        this.f18811T = new ArrayList();
    }

    private void b() {
        if (this.f18815q == null) {
            a(this.f18808Q, 2);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f18815q;
        if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.isLoadSuccess()) {
            this.f18801I = true;
            addView(this.f18815q);
            webviewshow();
            onConfigurationChanged(getResources().getConfiguration());
            this.f18815q.excuteTask();
            this.f18815q.setNotchValue(this.f18807P, this.f18803K, this.f18804L, this.f18805M, this.f18806N);
            n nVar = new n();
            nVar.f(this.b.getRequestId());
            nVar.g(this.b.getRequestIdNotice());
            nVar.e(this.b.getId());
            nVar.d(this.b.isMraid() ? n.f15616a : n.b);
            g.d(nVar, this.f18768a, this.f18821w);
        } else {
            e();
            MBridgeH5EndCardView mBridgeH5EndCardView2 = this.f18815q;
            if (mBridgeH5EndCardView2 != null) {
                mBridgeH5EndCardView2.reportRenderResult("timeout", 3);
                this.f18815q.setError(true);
            }
        }
        MBridgeH5EndCardView mBridgeH5EndCardView3 = this.f18815q;
        if (mBridgeH5EndCardView3 != null) {
            mBridgeH5EndCardView3.setUnitId(this.f18821w);
        }
    }

    private void e() {
        this.f18823y = 1;
        if (this.f18814p == null) {
            a(this.f18808Q, 2);
        }
        addView(this.f18814p);
        onConfigurationChanged(getResources().getConfiguration());
        this.f18814p.notifyShowListener();
        this.f18810S = true;
        bringToFront();
    }

    private void f() {
        if (this.f18813o == null) {
            b(-2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        if (this.f18796D && this.f18797E) {
            this.f18797E = false;
            layoutParams.width = 1;
            layoutParams.height = 1;
        }
        addView(this.f18813o, layoutParams);
    }

    private void g() {
        if (this.f18819u == null) {
            MBridgeAlertWebview mBridgeAlertWebview = new MBridgeAlertWebview(this.f18768a);
            this.f18819u = mBridgeAlertWebview;
            mBridgeAlertWebview.setUnitId(this.f18821w);
            this.f18819u.setCampaign(this.b);
        }
        this.f18819u.preLoadData(this.f18808Q);
    }

    private void h() {
        this.f18795C = false;
        this.f18810S = false;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            int i9 = 0;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i9);
                if (!(childAt instanceof MBridgeContainerView)) {
                    viewGroup.bringChildToFront(childAt);
                } else {
                    i9++;
                }
            }
        }
    }

    private void i() {
        boolean z8;
        CampaignEx campaignEx = this.b;
        if (campaignEx == null) {
            return;
        }
        String str = campaignEx.getendcard_url();
        int i9 = 404;
        if (!TextUtils.isEmpty(str)) {
            try {
                i9 = Integer.parseInt(ao.a(str, "ecid"));
            } catch (Throwable th) {
                ad.b(MBridgeBaseView.TAG, th.getMessage());
            }
        }
        int i10 = i9;
        Context context = this.f18768a;
        if (this.b.getAdSpaceT() == 2) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f18814p = new MBridgeNativeEndCardView(context, null, true, i10, z8, this.f18777k, this.b.getMof_tplid());
        if (this.b.getDynamicTempCode() == 5) {
            a aVar = this.notifyListener;
            if (aVar != null && (aVar instanceof k)) {
                ((k) aVar).a(this.b);
            }
            this.f18814p.setCampaign(this.b);
            return;
        }
        this.f18814p.setCampaign(this.b);
    }

    public void addOrderViewData(List<CampaignEx> list) {
        if (list == null) {
            return;
        }
        this.f18811T = list;
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
        if (this.f18814p != null) {
            return false;
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f18815q;
        if (mBridgeH5EndCardView != null) {
            return mBridgeH5EndCardView.canBackPress();
        }
        MBridgeLandingPageView mBridgeLandingPageView = this.f18817s;
        if (mBridgeLandingPageView != null) {
            return mBridgeLandingPageView.canBackPress();
        }
        MBridgePlayableView mBridgePlayableView = this.m;
        if (mBridgePlayableView == null) {
            return false;
        }
        return mBridgePlayableView.canBackPress();
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void configurationChanged(int i9, int i10, int i11) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f18813o;
        if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.getVisibility() == 0) {
            this.f18813o.resizeMiniCard(i9, i10);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean endCardShowing() {
        return this.f18794B;
    }

    public boolean endcardIsPlayable() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f18815q;
        if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.isPlayable()) {
            return true;
        }
        return false;
    }

    public MBridgeH5EndCardView getH5EndCardView() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f18815q;
        if (mBridgeH5EndCardView == null) {
            return this.m;
        }
        return mBridgeH5EndCardView;
    }

    public CampaignEx getReSetCampaign() {
        if (!this.b.isDynamicView() || !TextUtils.isEmpty(this.b.getendcard_url())) {
            return null;
        }
        int size = this.f18811T.size();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (this.f18811T.get(i10) != null && this.f18811T.get(i10).getId() == this.b.getId()) {
                    i9 = i10 - 1;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        if (i9 < 0 || i9 >= size || this.f18811T.get(i9) == null) {
            return null;
        }
        return this.f18811T.get(i9);
    }

    public boolean getShowingTransparent() {
        return this.f18796D;
    }

    public String getUnitID() {
        return this.f18821w;
    }

    public int getVideoInteractiveType() {
        return this.f18822x;
    }

    public int getVideoSkipTime() {
        return this.f18800H;
    }

    public void handlerPlayableException(String str) {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f18815q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.handlerPlayableException(str);
            if (!this.f18801I) {
                return;
            }
        }
        a();
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void hideAlertWebview() {
        if (!isLast()) {
            if (this.f18809R && !this.f18810S) {
                h();
                this.f18809R = false;
            }
            MBridgeAlertWebview mBridgeAlertWebview = this.f18819u;
            if (mBridgeAlertWebview != null && mBridgeAlertWebview.getParent() != null) {
                removeView(this.f18819u);
                MBridgeClickCTAView mBridgeClickCTAView = this.f18812n;
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
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f18813o;
        if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.isLoadSuccess()) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean miniCardShowing() {
        return this.f18795C;
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i9) {
        MBridgePlayableView mBridgePlayableView = this.m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.notifyCloseBtn(i9);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f18815q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.notifyCloseBtn(i9);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        MBridgeBaseView[] mBridgeBaseViewArr = {this.m, this.f18812n, this.f18813o, this.f18814p, this.f18815q, this.f18816r, this.f18817s, this.f18818t};
        for (int i9 = 0; i9 < 8; i9++) {
            MBridgeBaseView mBridgeBaseView = mBridgeBaseViewArr[i9];
            if (mBridgeBaseView != null && (mBridgeBaseView instanceof MBridgeClickMiniCardView)) {
                mBridgeBaseView.onSelfConfigurationChanged(configuration);
            } else if (mBridgeBaseView != null && mBridgeBaseView.getVisibility() == 0 && mBridgeBaseView.getParent() != null && !isLast()) {
                mBridgeBaseView.onSelfConfigurationChanged(configuration);
            }
        }
    }

    public void onEndcardBackPress() {
        if (this.f18814p == null && this.f18816r == null) {
            if (this.f18817s != null) {
                this.notifyListener.a(103, "");
                return;
            }
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f18815q;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.onBackPress();
                return;
            }
            return;
        }
        this.notifyListener.a(104, "");
        try {
            com.mbridge.msdk.video.dynview.moffer.a.a().b();
        } catch (Exception e4) {
            ad.b(MBridgeBaseView.TAG, e4.getMessage());
        }
    }

    public void onMiniEndcardBackPress() {
        if (this.f18795C) {
            this.notifyListener.a(107, "");
        }
    }

    public void onPlayableBackPress() {
        MBridgePlayableView mBridgePlayableView = this.m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.onBackPress();
        }
    }

    public void orientation(Configuration configuration) {
        MBridgeH5EndCardView[] mBridgeH5EndCardViewArr = {this.m, this.f18813o, this.f18815q, this.f18819u};
        for (int i9 = 0; i9 < 4; i9++) {
            MBridgeH5EndCardView mBridgeH5EndCardView = mBridgeH5EndCardViewArr[i9];
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getVisibility() == 0) {
                mBridgeH5EndCardView.orientation(getResources().getConfiguration());
            }
        }
    }

    public void preLoadData(final b bVar) {
        this.f18808Q = bVar;
        CampaignEx campaignEx = this.b;
        if (campaignEx != null) {
            if (campaignEx.getPlayable_ads_without_video() == 2) {
                if (this.m == null) {
                    this.m = new MBridgePlayableView(this.f18768a);
                }
                this.m.setCloseDelayShowTime(this.f18824z);
                this.m.setPlayCloseBtnTm(this.f18793A);
                this.m.setCampaign(this.b);
                this.m.setNotifyListener(new i(this.notifyListener) { // from class: com.mbridge.msdk.video.module.MBridgeContainerView.4
                    @Override // com.mbridge.msdk.video.module.a.a.i, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
                    public final void a(int i9, Object obj) {
                        int i10;
                        super.a(i9, obj);
                        if (i9 == 100) {
                            MBridgeContainerView.this.webviewshow();
                            MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                            mBridgeContainerView.onConfigurationChanged(mBridgeContainerView.getResources().getConfiguration());
                            n nVar = new n();
                            nVar.f(MBridgeContainerView.this.b.getRequestId());
                            nVar.g(MBridgeContainerView.this.b.getRequestIdNotice());
                            nVar.e(MBridgeContainerView.this.b.getId());
                            if (MBridgeContainerView.this.b.isMraid()) {
                                i10 = n.f15616a;
                            } else {
                                i10 = n.b;
                            }
                            nVar.d(i10);
                            MBridgeContainerView mBridgeContainerView2 = MBridgeContainerView.this;
                            g.d(nVar, mBridgeContainerView2.f18768a, mBridgeContainerView2.f18821w);
                        }
                    }
                });
                this.m.preLoadData(bVar);
            } else {
                b(this.f18822x);
                if (this.b.isDynamicView()) {
                    try {
                        a(bVar, Integer.valueOf(this.b.getVideo_end_type()));
                    } catch (Throwable th) {
                        ad.b(MBridgeBaseView.TAG, th.getMessage());
                        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeContainerView.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                                mBridgeContainerView.a(bVar, Integer.valueOf(mBridgeContainerView.b.getVideo_end_type()));
                            }
                        });
                    }
                    if (!ai.l(this.b.getendcard_url())) {
                        try {
                            String a6 = ao.a(this.b.getendcard_url(), "mof");
                            if (!TextUtils.isEmpty(a6) && Integer.parseInt(a6) == 1) {
                                com.mbridge.msdk.video.dynview.moffer.a.a().a(this.b, 2);
                            }
                        } catch (Exception e4) {
                            ad.b(MBridgeBaseView.TAG, e4.getMessage());
                        }
                    }
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeContainerView.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                            mBridgeContainerView.a(bVar, Integer.valueOf(mBridgeContainerView.b.getVideo_end_type()));
                        }
                    }, getVideoSkipTime());
                }
            }
            g();
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void readyStatus(int i9) {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f18815q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.readyStatus(i9);
        }
    }

    public void release() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f18815q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.release();
            this.f18815q = null;
        }
        MBridgePlayableView mBridgePlayableView = this.m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.release();
        }
        MBridgeLandingPageView mBridgeLandingPageView = this.f18817s;
        if (mBridgeLandingPageView != null) {
            mBridgeLandingPageView.release();
        }
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f18814p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.clearMoreOfferBitmap();
            this.f18814p.release();
        }
        if (this.notifyListener != null) {
            this.notifyListener = null;
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void resizeMiniCard(int i9, int i10, int i11) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f18813o;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.resizeMiniCard(i9, i10);
            this.f18813o.setRadius(i11);
            removeAllViews();
            setMatchParent();
            this.f18810S = true;
            bringToFront();
            f();
        }
    }

    public void setCloseDelayTime(int i9) {
        this.f18824z = i9;
    }

    public void setEndscreenType(int i9) {
        this.f18823y = i9;
    }

    public void setJSFactory(b bVar) {
        this.f18808Q = bVar;
    }

    public void setMBridgeClickMiniCardViewTransparent() {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f18813o;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.setMBridgeClickMiniCardViewTransparent();
            this.f18813o.setMBridgeClickMiniCardViewClickable(false);
        }
    }

    public void setNotchPadding(int i9, int i10, int i11, int i12, int i13) {
        ad.b(MBridgeBaseView.TAG, "NOTCH ContainerView ".concat(String.format("%1s-%2s-%3s-%4s-%5s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i9))));
        this.O = i9;
        this.f18803K = i10;
        this.f18804L = i11;
        this.f18805M = i12;
        this.f18806N = i13;
        this.f18807P = r.a(i9, i10, i11, i12, i13);
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f18814p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setNotchPadding(i10, i11, i12, i13);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f18815q;
        if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.f18845p != null) {
            mBridgeH5EndCardView.setNotchValue(this.f18807P, i10, i11, i12, i13);
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) this.f18815q.f18845p, "oncutoutfetched", Base64.encodeToString(this.f18807P.getBytes(), 0));
        }
        MBridgePlayableView mBridgePlayableView = this.m;
        if (mBridgePlayableView != null && mBridgePlayableView.f18845p != null) {
            mBridgePlayableView.setNotchValue(this.f18807P, i10, i11, i12, i13);
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) this.m.f18845p, "oncutoutfetched", Base64.encodeToString(this.f18807P.getBytes(), 0));
        }
        MBridgeOrderCampView mBridgeOrderCampView = this.f18820v;
        if (mBridgeOrderCampView != null) {
            mBridgeOrderCampView.setNotchPadding(i10, i11, i12, i13);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void setNotifyListener(a aVar) {
        super.setNotifyListener(aVar);
        MBridgeBaseView[] mBridgeBaseViewArr = {this.m, this.f18812n, this.f18813o, this.f18814p, this.f18815q, this.f18816r, this.f18817s, this.f18818t};
        for (int i9 = 0; i9 < 8; i9++) {
            MBridgeBaseView mBridgeBaseView = mBridgeBaseViewArr[i9];
            if (mBridgeBaseView != null) {
                if (mBridgeBaseView instanceof MBridgeClickMiniCardView) {
                    mBridgeBaseView.setNotifyListener(new com.mbridge.msdk.video.module.a.a.g(this.f18813o, aVar));
                } else {
                    mBridgeBaseView.setNotifyListener(new i(aVar));
                }
            }
        }
    }

    public void setOnPause() {
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f18814p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setOnPause();
        }
    }

    public void setOnResume() {
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f18814p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setOnResume();
        }
    }

    public void setPlayCloseBtnTm(int i9) {
        this.f18793A = i9;
    }

    public void setRewardStatus(boolean z8) {
        this.f18802J = z8;
    }

    public void setShowingTransparent(boolean z8) {
        this.f18796D = z8;
    }

    public void setUnitID(String str) {
        this.f18821w = str;
    }

    public void setVideoInteractiveType(int i9) {
        CampaignEx campaignEx = this.b;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            int a6 = com.mbridge.msdk.video.dynview.i.a.a(this.b);
            if (a6 == 100) {
                this.f18822x = i9;
                return;
            } else {
                this.f18822x = a6;
                return;
            }
        }
        this.f18822x = i9;
    }

    public void setVideoSkipTime(int i9) {
        this.f18800H = i9;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean showAlertWebView() {
        MBridgeAlertWebview mBridgeAlertWebview = this.f18819u;
        if (mBridgeAlertWebview == null || !mBridgeAlertWebview.isLoadSuccess()) {
            return false;
        }
        setMatchParent();
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup.indexOfChild(this) != viewGroup.getChildCount() - 1 && !this.f18810S) {
            removeAllViews();
            bringToFront();
            this.f18809R = true;
        }
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f18813o;
        if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.getParent() != null) {
            return false;
        }
        if (this.f18819u == null) {
            g();
        }
        MBridgeAlertWebview mBridgeAlertWebview2 = this.f18819u;
        if (mBridgeAlertWebview2 != null && mBridgeAlertWebview2.getParent() != null) {
            removeView(this.f18819u);
        }
        addView(this.f18819u);
        setBackgroundColor(0);
        this.f18819u.webviewshow();
        return true;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showEndcard(int i9) {
        CampaignEx campaignEx = this.b;
        if (campaignEx != null) {
            if (i9 != 1) {
                if (i9 != 100) {
                    if (i9 != 3) {
                        if (i9 != 4) {
                            if (i9 != 5) {
                                removeAllViews();
                                setMatchParent();
                                this.f18810S = true;
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
                            if (this.f18817s == null) {
                                a(this.f18808Q, 4);
                            }
                            this.f18817s.setUnitId(this.f18821w);
                            this.f18817s.preLoadData(this.f18808Q);
                            addView(this.f18817s);
                            this.f18810S = true;
                            bringToFront();
                        }
                    } else {
                        removeAllViews();
                        setMatchParent();
                        if (this.f18816r == null) {
                            a(this.f18808Q, 3);
                        }
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        layoutParams.addRule(13, -1);
                        addView(this.f18816r, layoutParams);
                        this.f18816r.notifyShowListener();
                        this.f18810S = true;
                        bringToFront();
                    }
                } else {
                    if (campaignEx.getPlayable_ads_without_video() == 2) {
                        this.f18799G = true;
                    }
                    a(this.m);
                    setMatchParent();
                    e();
                }
            } else {
                this.notifyListener.a(104, "");
            }
        }
        this.f18794B = true;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showMiniCard(int i9, int i10, int i11, int i12, int i13) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f18813o;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.setMiniCardLocation(i9, i10, i11, i12);
            this.f18813o.setRadius(i13);
            this.f18813o.setCloseVisible(8);
            this.f18813o.setClickable(false);
            removeAllViews();
            setMatchParent();
            this.f18810S = true;
            bringToFront();
            f();
            if (!this.f18798F) {
                this.f18798F = true;
                this.notifyListener.a(109, "");
                this.notifyListener.a(117, "");
            }
        }
    }

    public void showOrderCampView() {
        MBridgeOrderCampView mBridgeOrderCampView = new MBridgeOrderCampView(this.f18768a);
        this.f18820v = mBridgeOrderCampView;
        mBridgeOrderCampView.setCampaignExes(this.f18811T);
        a aVar = this.notifyListener;
        if (aVar != null && (aVar instanceof k)) {
            ((k) aVar).a(this.f18811T);
        }
        this.f18820v.setNotifyListener(new i(this.notifyListener));
        this.f18820v.setRewarded(this.f18802J);
        this.f18820v.setNotchPadding(this.f18803K, this.f18804L, this.f18805M, this.f18806N);
        this.f18820v.setCampOrderViewBuildCallback(new com.mbridge.msdk.video.dynview.e.b() { // from class: com.mbridge.msdk.video.module.MBridgeContainerView.3
            @Override // com.mbridge.msdk.video.dynview.e.b
            public final void a() {
                a aVar2 = MBridgeContainerView.this.notifyListener;
                if (aVar2 != null) {
                    aVar2.a(117, "");
                }
            }

            @Override // com.mbridge.msdk.video.dynview.e.b
            public final void b() {
                if (MBridgeContainerView.this.b.getAdSpaceT() == 2) {
                    MBridgeContainerView.this.showVideoEndCover();
                } else {
                    MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                    mBridgeContainerView.showEndcard(mBridgeContainerView.b.getVideo_end_type());
                }
            }
        });
        this.f18820v.createView(this);
    }

    public void showPlayableView() {
        if (this.b != null && !this.f18799G) {
            removeAllViews();
            setMatchParent();
            if (this.m == null) {
                preLoadData(this.f18808Q);
            }
            addView(this.m);
            MBridgePlayableView mBridgePlayableView = this.m;
            if (mBridgePlayableView != null) {
                mBridgePlayableView.setUnitId(this.f18821w);
                CampaignEx campaignEx = this.b;
                if (campaignEx != null && campaignEx.isMraid() && this.b.getPlayable_ads_without_video() == 2) {
                    this.m.setCloseVisible(0);
                }
                this.m.setNotchValue(this.f18807P, this.f18803K, this.f18804L, this.f18805M, this.f18806N);
            }
            this.f18810S = true;
            bringToFront();
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoClickView(int i9) {
        CampaignEx campaignEx;
        if (this.b != null) {
            if (i9 != -1) {
                if (i9 != 1) {
                    if (i9 == 2) {
                        MBridgeClickCTAView mBridgeClickCTAView = this.f18812n;
                        if (mBridgeClickCTAView != null && mBridgeClickCTAView.getParent() != null) {
                            removeView(this.f18812n);
                        }
                        MBridgeAlertWebview mBridgeAlertWebview = this.f18819u;
                        if (mBridgeAlertWebview != null && mBridgeAlertWebview.getParent() != null) {
                            return;
                        }
                        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f18813o;
                        if (mBridgeClickMiniCardView == null || mBridgeClickMiniCardView.getParent() == null) {
                            try {
                                CampaignEx campaignEx2 = this.b;
                                if (campaignEx2 != null && campaignEx2.getPlayable_ads_without_video() == 1) {
                                    setMatchParent();
                                    f();
                                }
                            } catch (Exception e4) {
                                e4.printStackTrace();
                            }
                        }
                        if (miniCardLoaded()) {
                            MBridgeH5EndCardView mBridgeH5EndCardView = this.f18815q;
                            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getParent() != null) {
                                removeView(this.f18815q);
                            }
                            this.notifyListener.a(112, "");
                            CampaignEx campaignEx3 = this.b;
                            if (campaignEx3 != null && !campaignEx3.isHasReportAdTrackPause()) {
                                this.b.setHasReportAdTrackPause(true);
                                com.mbridge.msdk.video.module.b.b.f(this.f18768a, this.b);
                            }
                            if (this.f18796D) {
                                this.notifyListener.a(115, "");
                            } else {
                                this.f18810S = true;
                                bringToFront();
                                webviewshow();
                                onConfigurationChanged(getResources().getConfiguration());
                            }
                            this.f18795C = true;
                            return;
                        }
                        h();
                        return;
                    }
                    return;
                }
                if (this.f18794B) {
                    return;
                }
                MBridgeH5EndCardView mBridgeH5EndCardView2 = this.f18815q;
                if (mBridgeH5EndCardView2 != null && mBridgeH5EndCardView2.getParent() != null) {
                    removeView(this.f18815q);
                }
                MBridgeClickMiniCardView mBridgeClickMiniCardView2 = this.f18813o;
                if (mBridgeClickMiniCardView2 != null && mBridgeClickMiniCardView2.getParent() != null) {
                    removeView(this.f18813o);
                }
                MBridgeClickCTAView mBridgeClickCTAView2 = this.f18812n;
                if (mBridgeClickCTAView2 == null || mBridgeClickCTAView2.getParent() == null) {
                    try {
                        CampaignEx campaignEx4 = this.b;
                        if (campaignEx4 != null && campaignEx4.getPlayable_ads_without_video() == 1) {
                            this.f18810S = true;
                            if (this.f18812n == null) {
                                b(-1);
                            }
                            if (this.f18812n != null && ((campaignEx = this.b) == null || !campaignEx.isDynamicView())) {
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                                layoutParams.addRule(12, -1);
                                addView(this.f18812n, 0, layoutParams);
                            }
                        }
                    } catch (Exception e9) {
                        e9.printStackTrace();
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
        MBridgeVideoEndCoverView mBridgeVideoEndCoverView = this.f18818t;
        if (mBridgeVideoEndCoverView == null) {
            b bVar = this.f18808Q;
            this.f18808Q = bVar;
            if (mBridgeVideoEndCoverView == null) {
                MBridgeVideoEndCoverView mBridgeVideoEndCoverView2 = new MBridgeVideoEndCoverView(this.f18768a);
                this.f18818t = mBridgeVideoEndCoverView2;
                mBridgeVideoEndCoverView2.setCampaign(this.b);
                this.f18818t.setNotifyListener(new i(this.notifyListener));
                this.f18818t.preLoadData(bVar);
            }
        }
        addView(this.f18818t);
        onConfigurationChanged(getResources().getConfiguration());
        this.f18810S = true;
        bringToFront();
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i9) {
        MBridgePlayableView mBridgePlayableView = this.m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.toggleCloseBtn(i9);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f18815q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.toggleCloseBtn(i9);
        }
    }

    public void triggerCloseBtn(String str) {
        try {
            d dVar = new d();
            dVar.a("type", 2);
            c.a().a("2000152", dVar);
            c.a().a("2000134", this.b);
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
        if (this.b != null) {
            this.notifyListener.a(122, "");
            this.notifyListener.a(104, "");
        }
    }

    public void webviewshow() {
        try {
            d dVar = new d();
            dVar.a("type", 3);
            c.a().a("2000133", this.b, dVar);
        } catch (Exception unused) {
        }
        MBridgeH5EndCardView[] mBridgeH5EndCardViewArr = {this.m, this.f18813o, this.f18815q, this.f18819u};
        for (int i9 = 0; i9 < 4; i9++) {
            MBridgeH5EndCardView mBridgeH5EndCardView = mBridgeH5EndCardViewArr[i9];
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
            } catch (Throwable th) {
                ad.b(MBridgeBaseView.TAG, th.getMessage(), th);
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
        CampaignEx campaignEx = this.b;
        if (campaignEx != null) {
            boolean isDynamicView = campaignEx.isDynamicView();
            boolean l = ai.l(this.b.getendcard_url());
            if (isDynamicView && !l && !this.b.isMraid()) {
                e();
                return;
            }
        }
        if (this.f18823y == 2 && !this.f18801I) {
            b();
        } else {
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar, Integer num) {
        a aVar;
        CampaignEx campaignEx;
        this.f18808Q = bVar;
        CampaignEx campaignEx2 = this.b;
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
                    if (this.f18816r == null) {
                        this.f18816r = new MBridgeVastEndCardView(this.f18768a);
                    }
                    this.f18816r.setCampaign(this.b);
                    this.f18816r.setNotifyListener(new l(this.notifyListener));
                    this.f18816r.preLoadData(bVar);
                    return;
                }
                if (intValue == 4) {
                    if (this.f18817s == null) {
                        this.f18817s = new MBridgeLandingPageView(this.f18768a);
                    }
                    this.f18817s.setCampaign(this.b);
                    this.f18817s.setNotifyListener(new i(this.notifyListener));
                    return;
                }
                if (intValue != 5) {
                    if (this.f18823y == 2) {
                        boolean isDynamicView = this.b.isDynamicView();
                        boolean l = ai.l(this.b.getendcard_url());
                        if ((!isDynamicView || l || (campaignEx = this.b) == null || campaignEx.isMraid()) && this.b.getAdSpaceT() != 2) {
                            if (this.f18815q == null) {
                                this.f18815q = new MBridgeH5EndCardView(this.f18768a);
                                try {
                                    d dVar = new d();
                                    dVar.a("type", 3);
                                    c.a().a("2000154", this.b, dVar);
                                } catch (Throwable th) {
                                    ad.b(MBridgeBaseView.TAG, th.getMessage());
                                }
                            }
                            if (this.b.getDynamicTempCode() == 5 && (aVar = this.notifyListener) != null && (aVar instanceof k)) {
                                ((k) aVar).a(this.b);
                            }
                            this.f18815q.setCampaign(this.b);
                            this.f18815q.setCloseDelayShowTime(this.f18824z);
                            this.f18815q.setNotifyListener(new i(this.notifyListener));
                            this.f18815q.setUnitId(this.f18821w);
                            this.f18815q.setNotchValue(this.f18807P, this.f18803K, this.f18804L, this.f18805M, this.f18806N);
                            this.f18815q.preLoadData(bVar);
                            if (this.f18796D) {
                                return;
                            }
                            addView(this.f18815q);
                            return;
                        }
                        return;
                    }
                    CampaignEx campaignEx3 = this.b;
                    int b = (campaignEx3 == null || campaignEx3.getRewardTemplateMode() == null) ? 0 : this.b.getRewardTemplateMode().b();
                    if (this.f18814p == null) {
                        if (this.b.isDynamicView()) {
                            i();
                        } else {
                            MBridgeNativeEndCardView mBridgeNativeEndCardView = new MBridgeNativeEndCardView(this.f18768a, null, false, -1, this.b.getAdSpaceT() == 2, b, this.b.getMof_tplid());
                            this.f18814p = mBridgeNativeEndCardView;
                            mBridgeNativeEndCardView.setCampaign(this.b);
                        }
                    }
                    this.f18814p.setLayout();
                    if (this.b.isDynamicView()) {
                        if (com.mbridge.msdk.video.dynview.moffer.a.a().a(this.b.getRequestId() + "_" + this.b.getId())) {
                            try {
                                com.mbridge.msdk.video.dynview.moffer.a.a().a(this.f18814p, this.b.getRequestId() + "_" + this.b.getId(), new i(this.notifyListener));
                            } catch (Exception e4) {
                                ad.b(MBridgeBaseView.TAG, e4.getMessage());
                            }
                        } else {
                            try {
                                String a6 = ao.a(this.b.getendcard_url(), "mof");
                                if (!TextUtils.isEmpty(a6) && Integer.parseInt(a6) == 1) {
                                    com.mbridge.msdk.video.dynview.moffer.a.a().a(this.b, this.f18814p, new i(this.notifyListener), 2);
                                }
                            } catch (Exception e9) {
                                ad.b(MBridgeBaseView.TAG, e9.getMessage());
                            }
                        }
                    }
                    this.f18814p.setUnitId(this.f18821w);
                    this.f18814p.setCloseBtnDelay(this.f18824z);
                    this.f18814p.setNotifyListener(new i(this.notifyListener));
                    this.f18814p.preLoadData(bVar);
                    this.f18814p.setNotchPadding(this.f18803K, this.f18804L, this.f18805M, this.f18806N);
                }
            }
        }
    }

    public MBridgeContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18823y = 1;
        this.f18824z = 1;
        this.f18793A = 1;
        this.f18794B = false;
        this.f18795C = false;
        this.f18796D = false;
        this.f18797E = true;
        this.f18798F = false;
        this.f18799G = false;
        this.f18801I = false;
        this.f18802J = false;
        this.f18809R = false;
        this.f18810S = false;
        this.f18811T = new ArrayList();
    }

    private void b(int i9) {
        if (i9 != -3) {
            if (i9 != -2) {
                if (this.f18812n == null) {
                    this.f18812n = new MBridgeClickCTAView(this.f18768a);
                }
                this.f18812n.setCampaign(this.b);
                this.f18812n.setUnitId(this.f18821w);
                this.f18812n.setNotifyListener(new i(this.notifyListener));
                this.f18812n.preLoadData(this.f18808Q);
                return;
            }
            CampaignEx campaignEx = this.b;
            if (campaignEx == null || campaignEx.getVideo_end_type() != 2) {
                return;
            }
            if (this.f18813o == null) {
                this.f18813o = new MBridgeClickMiniCardView(this.f18768a);
            }
            this.f18813o.setCampaign(this.b);
            MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f18813o;
            mBridgeClickMiniCardView.setNotifyListener(new com.mbridge.msdk.video.module.a.a.g(mBridgeClickMiniCardView, this.notifyListener));
            this.f18813o.preLoadData(this.f18808Q);
            setMatchParent();
            f();
            h();
        }
    }
}
