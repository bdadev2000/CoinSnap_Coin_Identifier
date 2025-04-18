package com.mbridge.msdk.video.signal.factory;

import android.app.Activity;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.a;
import com.mbridge.msdk.video.signal.a.i;
import com.mbridge.msdk.video.signal.a.j;
import com.mbridge.msdk.video.signal.a.k;
import com.mbridge.msdk.video.signal.a.m;
import com.mbridge.msdk.video.signal.a.n;
import com.mbridge.msdk.video.signal.a.o;
import com.mbridge.msdk.video.signal.a.q;
import com.mbridge.msdk.video.signal.c;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.g;
import java.util.List;

/* loaded from: classes4.dex */
public final class b extends a {

    /* renamed from: h, reason: collision with root package name */
    private Activity f16315h;

    /* renamed from: i, reason: collision with root package name */
    private WebView f16316i;

    /* renamed from: j, reason: collision with root package name */
    private MBridgeVideoView f16317j;

    /* renamed from: k, reason: collision with root package name */
    private MBridgeContainerView f16318k;

    /* renamed from: l, reason: collision with root package name */
    private CampaignEx f16319l;

    /* renamed from: m, reason: collision with root package name */
    private MBridgeBTContainer f16320m;

    /* renamed from: n, reason: collision with root package name */
    private a.InterfaceC0212a f16321n;

    /* renamed from: o, reason: collision with root package name */
    private String f16322o;

    /* renamed from: p, reason: collision with root package name */
    private List<CampaignEx> f16323p;

    public b(Activity activity) {
        this.f16315h = activity;
    }

    public final void a(k kVar) {
        this.f16309b = kVar;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final com.mbridge.msdk.video.signal.b getActivityProxy() {
        WebView webView = this.f16316i;
        if (webView == null) {
            return super.getActivityProxy();
        }
        if (this.a == null) {
            this.a = new i(webView);
        }
        return this.a;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final com.mbridge.msdk.video.signal.i getIJSRewardVideoV1() {
        Activity activity;
        MBridgeContainerView mBridgeContainerView = this.f16318k;
        if (mBridgeContainerView != null && (activity = this.f16315h) != null) {
            if (this.f16313f == null) {
                this.f16313f = new o(activity, mBridgeContainerView);
            }
            return this.f16313f;
        }
        return super.getIJSRewardVideoV1();
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final c getJSBTModule() {
        if (this.f16315h != null && this.f16320m != null) {
            if (this.f16314g == null) {
                this.f16314g = new j(this.f16315h, this.f16320m);
            }
            return this.f16314g;
        }
        return super.getJSBTModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final d getJSCommon() {
        CampaignEx campaignEx;
        List<CampaignEx> list;
        Activity activity = this.f16315h;
        if (activity != null && (campaignEx = this.f16319l) != null) {
            if (this.f16309b == null) {
                this.f16309b = new k(activity, campaignEx);
            }
            if (this.f16319l.getDynamicTempCode() == 5 && (list = this.f16323p) != null) {
                d dVar = this.f16309b;
                if (dVar instanceof k) {
                    ((k) dVar).a(list);
                }
            }
            this.f16309b.a(this.f16315h);
            this.f16309b.a(this.f16322o);
            this.f16309b.a(this.f16321n);
            return this.f16309b;
        }
        return super.getJSCommon();
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final f getJSContainerModule() {
        MBridgeContainerView mBridgeContainerView = this.f16318k;
        if (mBridgeContainerView == null) {
            return super.getJSContainerModule();
        }
        if (this.f16312e == null) {
            this.f16312e = new m(mBridgeContainerView);
        }
        return this.f16312e;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final g getJSNotifyProxy() {
        WebView webView = this.f16316i;
        if (webView == null) {
            return super.getJSNotifyProxy();
        }
        if (this.f16311d == null) {
            this.f16311d = new n(webView);
        }
        return this.f16311d;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final com.mbridge.msdk.video.signal.j getJSVideoModule() {
        MBridgeVideoView mBridgeVideoView = this.f16317j;
        if (mBridgeVideoView == null) {
            return super.getJSVideoModule();
        }
        if (this.f16310c == null) {
            this.f16310c = new q(mBridgeVideoView);
        }
        return this.f16310c;
    }

    public final void a(List<CampaignEx> list) {
        this.f16323p = list;
    }

    public b(Activity activity, MBridgeBTContainer mBridgeBTContainer, WebView webView) {
        this.f16315h = activity;
        this.f16320m = mBridgeBTContainer;
        this.f16316i = webView;
    }

    public b(Activity activity, WebView webView, MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, a.InterfaceC0212a interfaceC0212a) {
        this.f16315h = activity;
        this.f16316i = webView;
        this.f16317j = mBridgeVideoView;
        this.f16318k = mBridgeContainerView;
        this.f16319l = campaignEx;
        this.f16321n = interfaceC0212a;
        this.f16322o = mBridgeVideoView.getUnitId();
    }
}
