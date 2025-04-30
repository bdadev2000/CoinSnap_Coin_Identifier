package b3;

import android.util.Log;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.ads.AdError;
import y2.AbstractC2947c;

/* renamed from: b3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0557b implements a3.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5277a;
    public final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5278c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5279d;

    public /* synthetic */ C0557b(String str, int i9, String str2, Object obj) {
        this.f5277a = i9;
        this.f5279d = obj;
        this.b = str;
        this.f5278c = str2;
    }

    @Override // a3.b
    public final void a(AdError adError) {
        switch (this.f5277a) {
            case 0:
                Log.w(PangleMediationAdapter.TAG, adError.toString());
                ((C0558c) this.f5279d).f5280c.onFailure(adError);
                return;
            case 1:
                Log.w(PangleMediationAdapter.TAG, adError.toString());
                ((C0563h) this.f5279d).f5295c.onFailure(adError);
                return;
            case 2:
                Log.w(PangleMediationAdapter.TAG, adError.toString());
                ((C0566k) this.f5279d).f5303c.onFailure(adError);
                return;
            default:
                Log.w(PangleMediationAdapter.TAG, adError.toString());
                ((C0568m) this.f5279d).f5311c.onFailure(adError);
                return;
        }
    }

    @Override // a3.b
    public final void b() {
        switch (this.f5277a) {
            case 0:
                C0558c c0558c = (C0558c) this.f5279d;
                c0558c.f5282f.getClass();
                PAGAppOpenRequest pAGAppOpenRequest = new PAGAppOpenRequest();
                String str = this.b;
                pAGAppOpenRequest.setAdString(str);
                AbstractC2947c.y(pAGAppOpenRequest, str, c0558c.b);
                a3.f fVar = c0558c.f5281d;
                C0556a c0556a = new C0556a(this);
                fVar.getClass();
                PAGAppOpenAd.loadAd(this.f5278c, pAGAppOpenRequest, c0556a);
                return;
            case 1:
                C0563h c0563h = (C0563h) this.f5279d;
                c0563h.f5297f.getClass();
                PAGInterstitialRequest pAGInterstitialRequest = new PAGInterstitialRequest();
                String str2 = this.b;
                pAGInterstitialRequest.setAdString(str2);
                AbstractC2947c.y(pAGInterstitialRequest, str2, c0563h.b);
                a3.f fVar2 = c0563h.f5296d;
                C0562g c0562g = new C0562g(this);
                fVar2.getClass();
                PAGInterstitialAd.loadAd(this.f5278c, pAGInterstitialRequest, c0562g);
                return;
            case 2:
                C0566k c0566k = (C0566k) this.f5279d;
                c0566k.f5306g.getClass();
                PAGNativeRequest pAGNativeRequest = new PAGNativeRequest();
                String str3 = this.b;
                pAGNativeRequest.setAdString(str3);
                AbstractC2947c.y(pAGNativeRequest, str3, c0566k.b);
                a3.f fVar3 = c0566k.f5305f;
                C0564i c0564i = new C0564i(this);
                fVar3.getClass();
                PAGNativeAd.loadAd(this.f5278c, pAGNativeRequest, c0564i);
                return;
            default:
                C0568m c0568m = (C0568m) this.f5279d;
                c0568m.f5313f.getClass();
                PAGRewardedRequest pAGRewardedRequest = new PAGRewardedRequest();
                String str4 = this.b;
                pAGRewardedRequest.setAdString(str4);
                AbstractC2947c.y(pAGRewardedRequest, str4, c0568m.b);
                a3.f fVar4 = c0568m.f5312d;
                C0567l c0567l = new C0567l(this);
                fVar4.getClass();
                PAGRewardedAd.loadAd(this.f5278c, pAGRewardedRequest, c0567l);
                return;
        }
    }
}
