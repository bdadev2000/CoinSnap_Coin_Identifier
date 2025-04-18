package v6;

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

/* loaded from: classes3.dex */
public abstract class a extends MBSplashLoadWithCodeListener implements MediationAppOpenAd, MBSplashShowListener {

    /* renamed from: b, reason: collision with root package name */
    public final MediationAppOpenAdConfiguration f26042b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback f26043c;

    /* renamed from: d, reason: collision with root package name */
    public MediationAppOpenAdCallback f26044d;

    /* renamed from: f, reason: collision with root package name */
    public u6.c f26045f;

    /* renamed from: g, reason: collision with root package name */
    public Activity f26046g;

    public a(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback) {
        this.f26042b = mediationAppOpenAdConfiguration;
        this.f26043c = mediationAdLoadCallback;
    }

    @Override // com.mbridge.msdk.out.MBSplashLoadListener
    public final void isSupportZoomOut(MBridgeIds mBridgeIds, boolean z10) {
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public final void onAdClicked(MBridgeIds mBridgeIds) {
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f26044d;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public final void onAdTick(MBridgeIds mBridgeIds, long j3) {
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public final void onDismiss(MBridgeIds mBridgeIds, int i10) {
        MBSplashHandler mBSplashHandler;
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f26044d;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdClosed();
        }
        u6.c cVar = this.f26045f;
        if (cVar != null && (mBSplashHandler = cVar.a) != null) {
            mBSplashHandler.onDestroy();
        }
    }

    @Override // com.mbridge.msdk.out.MBSplashLoadWithCodeListener
    public final void onLoadFailedWithCode(MBridgeIds mBridgeIds, int i10, String str, int i11) {
        AdError h10 = c6.c.h(i10, str);
        Log.d(MintegralMediationAdapter.TAG, h10.toString());
        this.f26043c.onFailure(h10);
    }

    @Override // com.mbridge.msdk.out.MBSplashLoadListener
    public final void onLoadSuccessed(MBridgeIds mBridgeIds, int i10) {
        this.f26044d = (MediationAppOpenAdCallback) this.f26043c.onSuccess(this);
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public final void onShowFailed(MBridgeIds mBridgeIds, String str) {
        if (this.f26044d != null) {
            AdError h10 = c6.c.h(100, str);
            Log.w(MintegralMediationAdapter.TAG, h10.toString());
            this.f26044d.onAdFailedToShow(h10);
        }
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public final void onShowSuccessed(MBridgeIds mBridgeIds) {
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f26044d;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdOpened();
            this.f26044d.reportAdImpression();
        }
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public final void onZoomOutPlayFinish(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public final void onZoomOutPlayStart(MBridgeIds mBridgeIds) {
    }
}
