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

/* loaded from: classes3.dex */
public final class b extends a {

    /* renamed from: h, reason: collision with root package name */
    private Activity f19305h;

    /* renamed from: i, reason: collision with root package name */
    private WebView f19306i;

    /* renamed from: j, reason: collision with root package name */
    private MBridgeVideoView f19307j;

    /* renamed from: k, reason: collision with root package name */
    private MBridgeContainerView f19308k;
    private CampaignEx l;
    private MBridgeBTContainer m;

    /* renamed from: n, reason: collision with root package name */
    private a.InterfaceC0200a f19309n;

    /* renamed from: o, reason: collision with root package name */
    private String f19310o;

    /* renamed from: p, reason: collision with root package name */
    private List<CampaignEx> f19311p;

    public b(Activity activity) {
        this.f19305h = activity;
    }

    public final void a(k kVar) {
        this.b = kVar;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final com.mbridge.msdk.video.signal.b getActivityProxy() {
        WebView webView = this.f19306i;
        if (webView == null) {
            return super.getActivityProxy();
        }
        if (this.f19299a == null) {
            this.f19299a = new i(webView);
        }
        return this.f19299a;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final com.mbridge.msdk.video.signal.i getIJSRewardVideoV1() {
        Activity activity;
        MBridgeContainerView mBridgeContainerView = this.f19308k;
        if (mBridgeContainerView != null && (activity = this.f19305h) != null) {
            if (this.f19303f == null) {
                this.f19303f = new o(activity, mBridgeContainerView);
            }
            return this.f19303f;
        }
        return super.getIJSRewardVideoV1();
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final c getJSBTModule() {
        if (this.f19305h != null && this.m != null) {
            if (this.f19304g == null) {
                this.f19304g = new j(this.f19305h, this.m);
            }
            return this.f19304g;
        }
        return super.getJSBTModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final d getJSCommon() {
        CampaignEx campaignEx;
        List<CampaignEx> list;
        Activity activity = this.f19305h;
        if (activity != null && (campaignEx = this.l) != null) {
            if (this.b == null) {
                this.b = new k(activity, campaignEx);
            }
            if (this.l.getDynamicTempCode() == 5 && (list = this.f19311p) != null) {
                d dVar = this.b;
                if (dVar instanceof k) {
                    ((k) dVar).a(list);
                }
            }
            this.b.a(this.f19305h);
            this.b.a(this.f19310o);
            this.b.a(this.f19309n);
            return this.b;
        }
        return super.getJSCommon();
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final f getJSContainerModule() {
        MBridgeContainerView mBridgeContainerView = this.f19308k;
        if (mBridgeContainerView == null) {
            return super.getJSContainerModule();
        }
        if (this.f19302e == null) {
            this.f19302e = new m(mBridgeContainerView);
        }
        return this.f19302e;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final g getJSNotifyProxy() {
        WebView webView = this.f19306i;
        if (webView == null) {
            return super.getJSNotifyProxy();
        }
        if (this.f19301d == null) {
            this.f19301d = new n(webView);
        }
        return this.f19301d;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final com.mbridge.msdk.video.signal.j getJSVideoModule() {
        MBridgeVideoView mBridgeVideoView = this.f19307j;
        if (mBridgeVideoView == null) {
            return super.getJSVideoModule();
        }
        if (this.f19300c == null) {
            this.f19300c = new q(mBridgeVideoView);
        }
        return this.f19300c;
    }

    public final void a(List<CampaignEx> list) {
        this.f19311p = list;
    }

    public b(Activity activity, MBridgeBTContainer mBridgeBTContainer, WebView webView) {
        this.f19305h = activity;
        this.m = mBridgeBTContainer;
        this.f19306i = webView;
    }

    public b(Activity activity, WebView webView, MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, a.InterfaceC0200a interfaceC0200a) {
        this.f19305h = activity;
        this.f19306i = webView;
        this.f19307j = mBridgeVideoView;
        this.f19308k = mBridgeContainerView;
        this.l = campaignEx;
        this.f19309n = interfaceC0200a;
        this.f19310o = mBridgeVideoView.getUnitId();
    }
}
