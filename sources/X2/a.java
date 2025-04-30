package X2;

import android.app.Activity;
import android.util.Log;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.mbridge.msdk.out.MBSplashHandler;
import com.mbridge.msdk.out.MBSplashLoadWithCodeListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import com.mbridge.msdk.out.MBridgeIds;
import j5.C2400c;

/* loaded from: classes.dex */
public abstract class a extends MBSplashLoadWithCodeListener implements MediationAppOpenAd, MBSplashShowListener {
    public final MediationAppOpenAdConfiguration b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback f3656c;

    /* renamed from: d, reason: collision with root package name */
    public MediationAppOpenAdCallback f3657d;

    /* renamed from: f, reason: collision with root package name */
    public C2400c f3658f;

    /* renamed from: g, reason: collision with root package name */
    public Activity f3659g;

    public a(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback) {
        this.b = mediationAppOpenAdConfiguration;
        this.f3656c = mediationAdLoadCallback;
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public final void onAdClicked(MBridgeIds mBridgeIds) {
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f3657d;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public final void onDismiss(MBridgeIds mBridgeIds, int i9) {
        MBSplashHandler mBSplashHandler;
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f3657d;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdClosed();
        }
        C2400c c2400c = this.f3658f;
        if (c2400c != null && (mBSplashHandler = (MBSplashHandler) c2400c.f21107c) != null) {
            mBSplashHandler.onDestroy();
        }
    }

    @Override // com.mbridge.msdk.out.MBSplashLoadWithCodeListener
    public final void onLoadFailedWithCode(MBridgeIds mBridgeIds, int i9, String str, int i10) {
        AdError l = android.support.v4.media.session.a.l(i9, str);
        Log.d(MintegralMediationAdapter.TAG, l.toString());
        this.f3656c.onFailure(l);
    }

    @Override // com.mbridge.msdk.out.MBSplashLoadListener
    public final void onLoadSuccessed(MBridgeIds mBridgeIds, int i9) {
        this.f3657d = (MediationAppOpenAdCallback) this.f3656c.onSuccess(this);
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public final void onShowFailed(MBridgeIds mBridgeIds, String str) {
        if (this.f3657d != null) {
            AdError l = android.support.v4.media.session.a.l(100, str);
            Log.w(MintegralMediationAdapter.TAG, l.toString());
            this.f3657d.onAdFailedToShow(l);
        }
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public final void onShowSuccessed(MBridgeIds mBridgeIds) {
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f3657d;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdOpened();
            this.f3657d.reportAdImpression();
        }
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public final void onZoomOutPlayFinish(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public final void onZoomOutPlayStart(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.MBSplashLoadListener
    public final void isSupportZoomOut(MBridgeIds mBridgeIds, boolean z8) {
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public final void onAdTick(MBridgeIds mBridgeIds, long j7) {
    }
}
