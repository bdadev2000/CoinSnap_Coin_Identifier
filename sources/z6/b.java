package z6;

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

/* loaded from: classes3.dex */
public final class b implements y6.b {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f28524b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f28525c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28526d;

    public /* synthetic */ b(String str, int i10, String str2, Object obj) {
        this.a = i10;
        this.f28526d = obj;
        this.f28524b = str;
        this.f28525c = str2;
    }

    @Override // y6.b
    public final void a(AdError adError) {
        int i10 = this.a;
        Object obj = this.f28526d;
        switch (i10) {
            case 0:
                Log.w(PangleMediationAdapter.TAG, adError.toString());
                ((c) obj).f28528c.onFailure(adError);
                return;
            case 1:
                Log.w(PangleMediationAdapter.TAG, adError.toString());
                ((h) obj).f28543c.onFailure(adError);
                return;
            case 2:
                Log.w(PangleMediationAdapter.TAG, adError.toString());
                ((k) obj).f28551c.onFailure(adError);
                return;
            default:
                Log.w(PangleMediationAdapter.TAG, adError.toString());
                ((m) obj).f28559c.onFailure(adError);
                return;
        }
    }

    @Override // y6.b
    public final void b() {
        int i10 = this.a;
        String str = this.f28525c;
        String str2 = this.f28524b;
        Object obj = this.f28526d;
        switch (i10) {
            case 0:
                c cVar = (c) obj;
                cVar.f28530f.getClass();
                PAGAppOpenRequest pAGAppOpenRequest = new PAGAppOpenRequest();
                pAGAppOpenRequest.setAdString(str2);
                com.bumptech.glide.c.U(pAGAppOpenRequest, str2, cVar.f28527b);
                a aVar = new a(this);
                cVar.f28529d.getClass();
                PAGAppOpenAd.loadAd(str, pAGAppOpenRequest, aVar);
                return;
            case 1:
                h hVar = (h) obj;
                hVar.f28545f.getClass();
                PAGInterstitialRequest pAGInterstitialRequest = new PAGInterstitialRequest();
                pAGInterstitialRequest.setAdString(str2);
                com.bumptech.glide.c.U(pAGInterstitialRequest, str2, hVar.f28542b);
                g gVar = new g(this);
                hVar.f28544d.getClass();
                PAGInterstitialAd.loadAd(str, pAGInterstitialRequest, gVar);
                return;
            case 2:
                k kVar = (k) obj;
                kVar.f28554g.getClass();
                PAGNativeRequest pAGNativeRequest = new PAGNativeRequest();
                pAGNativeRequest.setAdString(str2);
                com.bumptech.glide.c.U(pAGNativeRequest, str2, kVar.f28550b);
                i iVar = new i(this);
                kVar.f28553f.getClass();
                PAGNativeAd.loadAd(str, pAGNativeRequest, iVar);
                return;
            default:
                m mVar = (m) obj;
                mVar.f28561f.getClass();
                PAGRewardedRequest pAGRewardedRequest = new PAGRewardedRequest();
                pAGRewardedRequest.setAdString(str2);
                com.bumptech.glide.c.U(pAGRewardedRequest, str2, mVar.f28558b);
                l lVar = new l(this);
                mVar.f28560d.getClass();
                PAGRewardedAd.loadAd(str, pAGRewardedRequest, lVar);
                return;
        }
    }
}
