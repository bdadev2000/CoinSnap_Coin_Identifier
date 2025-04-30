package V2;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeBannerAd;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class e extends UnifiedNativeAdMapper {
    public final MediationNativeAdConfiguration b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback f3460c;

    /* renamed from: d, reason: collision with root package name */
    public NativeAdBase f3461d;

    /* renamed from: f, reason: collision with root package name */
    public MediationNativeAdCallback f3462f;

    /* renamed from: g, reason: collision with root package name */
    public MediaView f3463g;

    /* renamed from: h, reason: collision with root package name */
    public final R3.e f3464h;

    public e(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, R3.e eVar) {
        this.f3460c = mediationAdLoadCallback;
        this.b = mediationNativeAdConfiguration;
        this.f3464h = eVar;
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void trackViews(View view, Map map, Map map2) {
        setOverrideClickHandling(true);
        ArrayList arrayList = new ArrayList(map.values());
        View view2 = (View) map.get("3003");
        NativeAdBase nativeAdBase = this.f3461d;
        if (nativeAdBase instanceof NativeBannerAd) {
            if (view2 == null) {
                Log.w(FacebookMediationAdapter.TAG, "Missing or invalid native ad icon asset. Meta Audience Network impression recording might be impacted for this ad.");
                return;
            }
            if (!(view2 instanceof ImageView)) {
                Log.w(FacebookMediationAdapter.TAG, "Native ad icon asset is rendered with an incompatible class type. Meta Audience Network impression recording might be impacted for this ad. Expected: ImageView, actual: " + view2.getClass() + ".");
                return;
            }
            ((NativeBannerAd) nativeAdBase).registerViewForInteraction(view, (ImageView) view2, arrayList);
            return;
        }
        if (nativeAdBase instanceof NativeAd) {
            NativeAd nativeAd = (NativeAd) nativeAdBase;
            if (view2 instanceof ImageView) {
                nativeAd.registerViewForInteraction(view, this.f3463g, (ImageView) view2, arrayList);
                return;
            } else {
                Log.w(FacebookMediationAdapter.TAG, "Native icon asset is not of type ImageView. Calling registerViewForInteraction() without a reference to the icon view.");
                nativeAd.registerViewForInteraction(view, this.f3463g, arrayList);
                return;
            }
        }
        Log.w(FacebookMediationAdapter.TAG, "Native ad type is not of type NativeAd or NativeBannerAd. It is not currently supported by the Meta Audience Network Adapter. Meta Audience Network impression recording might be impacted for this ad.");
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void untrackView(View view) {
        NativeAdBase nativeAdBase = this.f3461d;
        if (nativeAdBase != null) {
            nativeAdBase.unregisterView();
        }
        super.untrackView(view);
    }
}
