package w6;

import android.util.Log;
import android.widget.FrameLayout;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b extends v6.b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f26860g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, int i10) {
        super(mediationBannerAdConfiguration, mediationAdLoadCallback);
        this.f26860g = i10;
    }

    public final void b() {
        int i10 = this.f26860g;
        MediationAdLoadCallback mediationAdLoadCallback = this.f26048c;
        MediationBannerAdConfiguration mediationBannerAdConfiguration = this.f26047b;
        switch (i10) {
            case 0:
                BannerSize a = v6.b.a(mediationBannerAdConfiguration.getContext(), mediationBannerAdConfiguration.getAdSize());
                if (a == null) {
                    AdError g10 = c6.c.g(102, String.format("The requested banner size: %s is not supported by Mintegral SDK.", mediationBannerAdConfiguration.getAdSize()));
                    Log.e(MintegralMediationAdapter.TAG, g10.toString());
                    mediationAdLoadCallback.onFailure(g10);
                    return;
                }
                String string = mediationBannerAdConfiguration.getServerParameters().getString("ad_unit_id");
                String string2 = mediationBannerAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
                String bidResponse = mediationBannerAdConfiguration.getBidResponse();
                AdError i11 = w5.d.i(string, string2, bidResponse);
                if (i11 != null) {
                    mediationAdLoadCallback.onFailure(i11);
                    return;
                }
                MBBannerView mBBannerView = new MBBannerView(mediationBannerAdConfiguration.getContext());
                this.f26049d = mBBannerView;
                mBBannerView.init(a, string2, string);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(MBridgeConstans.EXTRA_KEY_WM, mediationBannerAdConfiguration.getWatermark());
                    this.f26049d.setExtraInfo(jSONObject);
                } catch (JSONException e2) {
                    Log.w(MintegralMediationAdapter.TAG, "Failed to apply watermark to Mintegral bidding banner ad.", e2);
                }
                this.f26049d.setLayoutParams(new FrameLayout.LayoutParams(w5.d.a(mediationBannerAdConfiguration.getContext(), a.getWidth()), w5.d.a(mediationBannerAdConfiguration.getContext(), a.getHeight())));
                this.f26049d.setBannerAdListener(this);
                this.f26049d.loadFromBid(bidResponse);
                return;
            default:
                BannerSize a10 = v6.b.a(mediationBannerAdConfiguration.getContext(), mediationBannerAdConfiguration.getAdSize());
                if (a10 == null) {
                    AdError g11 = c6.c.g(102, String.format("The requested banner size: %s is not supported by Mintegral SDK.", mediationBannerAdConfiguration.getAdSize()));
                    Log.e(MintegralMediationAdapter.TAG, g11.toString());
                    mediationAdLoadCallback.onFailure(g11);
                    return;
                }
                String string3 = mediationBannerAdConfiguration.getServerParameters().getString("ad_unit_id");
                String string4 = mediationBannerAdConfiguration.getServerParameters().getString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER);
                AdError h10 = w5.d.h(string3, string4);
                if (h10 != null) {
                    mediationAdLoadCallback.onFailure(h10);
                    return;
                }
                MBBannerView mBBannerView2 = new MBBannerView(mediationBannerAdConfiguration.getContext());
                this.f26049d = mBBannerView2;
                mBBannerView2.init(a10, string4, string3);
                this.f26049d.setLayoutParams(new FrameLayout.LayoutParams(w5.d.a(mediationBannerAdConfiguration.getContext(), a10.getWidth()), w5.d.a(mediationBannerAdConfiguration.getContext(), a10.getHeight())));
                this.f26049d.setBannerAdListener(this);
                this.f26049d.load();
                return;
        }
    }
}
