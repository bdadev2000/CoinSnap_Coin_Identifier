package w6;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.applovin.mediation.AppLovinExtras;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.newinterstitial.out.MBBidNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.MBNewInterstitialHandler;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class c extends v6.c {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f26861f;

    /* renamed from: g, reason: collision with root package name */
    public Object f26862g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, int i10) {
        super(mediationInterstitialAdConfiguration, mediationAdLoadCallback);
        this.f26861f = i10;
    }

    public final void a() {
        int i10 = this.f26861f;
        MediationAdLoadCallback mediationAdLoadCallback = this.f26052c;
        MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration = this.f26051b;
        switch (i10) {
            case 0:
                String adUnitId = mediationInterstitialAdConfiguration.getServerParameters().getString("ad_unit_id");
                String placementId = mediationInterstitialAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
                String bidToken = mediationInterstitialAdConfiguration.getBidResponse();
                AdError i11 = w5.d.i(adUnitId, placementId, bidToken);
                if (i11 != null) {
                    mediationAdLoadCallback.onFailure(i11);
                    return;
                }
                u6.a aVar = new u6.a();
                this.f26862g = aVar;
                Context context = mediationInterstitialAdConfiguration.getContext();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(placementId, "placementId");
                Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
                aVar.a = new MBBidNewInterstitialHandler(context, placementId, adUnitId);
                try {
                    JSONObject jsonObject = new JSONObject();
                    jsonObject.put(MBridgeConstans.EXTRA_KEY_WM, mediationInterstitialAdConfiguration.getWatermark());
                    u6.a aVar2 = (u6.a) this.f26862g;
                    aVar2.getClass();
                    Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                    MBBidNewInterstitialHandler mBBidNewInterstitialHandler = aVar2.a;
                    if (mBBidNewInterstitialHandler != null) {
                        mBBidNewInterstitialHandler.setExtraInfo(jsonObject);
                    }
                } catch (JSONException e2) {
                    Log.w(MintegralMediationAdapter.TAG, "Failed to apply watermark to Mintegral bidding interstitial ad.", e2);
                }
                u6.a aVar3 = (u6.a) this.f26862g;
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(this, "listener");
                MBBidNewInterstitialHandler mBBidNewInterstitialHandler2 = aVar3.a;
                if (mBBidNewInterstitialHandler2 != null) {
                    mBBidNewInterstitialHandler2.setInterstitialVideoListener(this);
                }
                u6.a aVar4 = (u6.a) this.f26862g;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(bidToken, "bidToken");
                MBBidNewInterstitialHandler mBBidNewInterstitialHandler3 = aVar4.a;
                if (mBBidNewInterstitialHandler3 != null) {
                    mBBidNewInterstitialHandler3.loadFromBid(bidToken);
                    return;
                }
                return;
            default:
                String adUnitId2 = mediationInterstitialAdConfiguration.getServerParameters().getString("ad_unit_id");
                String placementId2 = mediationInterstitialAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
                AdError h10 = w5.d.h(adUnitId2, placementId2);
                if (h10 != null) {
                    mediationAdLoadCallback.onFailure(h10);
                    return;
                }
                u6.b bVar = new u6.b();
                this.f26862g = bVar;
                Context context2 = mediationInterstitialAdConfiguration.getContext();
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter(placementId2, "placementId");
                Intrinsics.checkNotNullParameter(adUnitId2, "adUnitId");
                bVar.a = new MBNewInterstitialHandler(context2, placementId2, adUnitId2);
                u6.b bVar2 = (u6.b) this.f26862g;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(this, "listener");
                MBNewInterstitialHandler mBNewInterstitialHandler = bVar2.a;
                if (mBNewInterstitialHandler != null) {
                    mBNewInterstitialHandler.setInterstitialVideoListener(this);
                }
                MBNewInterstitialHandler mBNewInterstitialHandler2 = ((u6.b) this.f26862g).a;
                if (mBNewInterstitialHandler2 != null) {
                    mBNewInterstitialHandler2.load();
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public final void showAd(Context context) {
        int i10 = this.f26861f;
        int i11 = 1;
        MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration = this.f26051b;
        switch (i10) {
            case 0:
                Bundle mediationExtras = mediationInterstitialAdConfiguration.getMediationExtras();
                boolean z10 = w5.d.a;
                boolean z11 = mediationExtras.getBoolean(AppLovinExtras.Keys.MUTE_AUDIO);
                u6.a aVar = (u6.a) this.f26862g;
                if (!z11) {
                    i11 = 2;
                }
                MBBidNewInterstitialHandler mBBidNewInterstitialHandler = aVar.a;
                if (mBBidNewInterstitialHandler != null) {
                    mBBidNewInterstitialHandler.playVideoMute(i11);
                }
                MBBidNewInterstitialHandler mBBidNewInterstitialHandler2 = ((u6.a) this.f26862g).a;
                if (mBBidNewInterstitialHandler2 != null) {
                    mBBidNewInterstitialHandler2.showFromBid();
                    return;
                }
                return;
            default:
                Bundle mediationExtras2 = mediationInterstitialAdConfiguration.getMediationExtras();
                boolean z12 = w5.d.a;
                boolean z13 = mediationExtras2.getBoolean(AppLovinExtras.Keys.MUTE_AUDIO);
                u6.b bVar = (u6.b) this.f26862g;
                if (!z13) {
                    i11 = 2;
                }
                MBNewInterstitialHandler mBNewInterstitialHandler = bVar.a;
                if (mBNewInterstitialHandler != null) {
                    mBNewInterstitialHandler.playVideoMute(i11);
                }
                MBNewInterstitialHandler mBNewInterstitialHandler2 = ((u6.b) this.f26862g).a;
                if (mBNewInterstitialHandler2 != null) {
                    mBNewInterstitialHandler2.show();
                    return;
                }
                return;
        }
    }
}
