package b3;

import android.util.Log;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import w4.v0;

/* renamed from: b3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0556a implements PAGAppOpenAdLoadListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0557b f5276a;

    public C0556a(C0557b c0557b) {
        this.f5276a = c0557b;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGAppOpenAd pAGAppOpenAd) {
        C0557b c0557b = this.f5276a;
        C0558c c0558c = (C0558c) c0557b.f5279d;
        c0558c.f5283g = (MediationAppOpenAdCallback) c0558c.f5280c.onSuccess(c0558c);
        ((C0558c) c0557b.f5279d).f5284h = pAGAppOpenAd;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.KS
    public final void onError(int i9, String str) {
        AdError i10 = v0.i(i9, str);
        Log.w(PangleMediationAdapter.TAG, i10.toString());
        ((C0558c) this.f5276a.f5279d).f5280c.onFailure(i10);
    }
}
