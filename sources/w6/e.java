package w6;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.applovin.mediation.AppLovinExtras;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.out.BaseExtraInterfaceForHandler;
import com.mbridge.msdk.out.MBBidRewardVideoHandler;
import com.mbridge.msdk.out.MBRewardVideoHandler;
import org.json.JSONException;
import org.json.JSONObject;
import v6.g;

/* loaded from: classes3.dex */
public final class e extends g {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f26864f;

    /* renamed from: g, reason: collision with root package name */
    public BaseExtraInterfaceForHandler f26865g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, int i10) {
        super(mediationRewardedAdConfiguration, mediationAdLoadCallback);
        this.f26864f = i10;
    }

    public final void a() {
        int i10 = this.f26864f;
        MediationAdLoadCallback mediationAdLoadCallback = this.f26063c;
        MediationRewardedAdConfiguration mediationRewardedAdConfiguration = this.f26062b;
        switch (i10) {
            case 0:
                String string = mediationRewardedAdConfiguration.getServerParameters().getString("ad_unit_id");
                String string2 = mediationRewardedAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
                String bidResponse = mediationRewardedAdConfiguration.getBidResponse();
                AdError i11 = w5.d.i(string, string2, bidResponse);
                if (i11 != null) {
                    mediationAdLoadCallback.onFailure(i11);
                    return;
                }
                this.f26865g = new MBBidRewardVideoHandler(mediationRewardedAdConfiguration.getContext(), string2, string);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(MBridgeConstans.EXTRA_KEY_WM, mediationRewardedAdConfiguration.getWatermark());
                    ((MBBidRewardVideoHandler) this.f26865g).setExtraInfo(jSONObject);
                } catch (JSONException e2) {
                    Log.w(MintegralMediationAdapter.TAG, "Failed to apply watermark to Mintegral bidding rewarded video ad.", e2);
                }
                ((MBBidRewardVideoHandler) this.f26865g).setRewardVideoListener(this);
                ((MBBidRewardVideoHandler) this.f26865g).loadFromBid(bidResponse);
                return;
            default:
                String string3 = mediationRewardedAdConfiguration.getServerParameters().getString("ad_unit_id");
                String string4 = mediationRewardedAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
                AdError h10 = w5.d.h(string3, string4);
                if (h10 != null) {
                    mediationAdLoadCallback.onFailure(h10);
                    return;
                }
                MBRewardVideoHandler mBRewardVideoHandler = new MBRewardVideoHandler(mediationRewardedAdConfiguration.getContext(), string4, string3);
                this.f26865g = mBRewardVideoHandler;
                mBRewardVideoHandler.setRewardVideoListener(this);
                ((MBRewardVideoHandler) this.f26865g).load();
                return;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public final void showAd(Context context) {
        int i10 = this.f26864f;
        int i11 = 1;
        MediationRewardedAdConfiguration mediationRewardedAdConfiguration = this.f26062b;
        switch (i10) {
            case 0:
                Bundle mediationExtras = mediationRewardedAdConfiguration.getMediationExtras();
                boolean z10 = w5.d.a;
                boolean z11 = mediationExtras.getBoolean(AppLovinExtras.Keys.MUTE_AUDIO);
                MBBidRewardVideoHandler mBBidRewardVideoHandler = (MBBidRewardVideoHandler) this.f26865g;
                if (!z11) {
                    i11 = 2;
                }
                mBBidRewardVideoHandler.playVideoMute(i11);
                ((MBBidRewardVideoHandler) this.f26865g).showFromBid();
                return;
            default:
                Bundle mediationExtras2 = mediationRewardedAdConfiguration.getMediationExtras();
                boolean z12 = w5.d.a;
                boolean z13 = mediationExtras2.getBoolean(AppLovinExtras.Keys.MUTE_AUDIO);
                MBRewardVideoHandler mBRewardVideoHandler = (MBRewardVideoHandler) this.f26865g;
                if (!z13) {
                    i11 = 2;
                }
                mBRewardVideoHandler.playVideoMute(i11);
                ((MBRewardVideoHandler) this.f26865g).show();
                return;
        }
    }
}
