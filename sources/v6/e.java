package v6;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.nativead.MediaView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.OnMBMediaViewListener;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class e extends UnifiedNativeAdMapper implements OnMBMediaViewListener {

    /* renamed from: b, reason: collision with root package name */
    public Campaign f26056b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationNativeAdConfiguration f26057c;

    /* renamed from: d, reason: collision with root package name */
    public final MediationAdLoadCallback f26058d;

    /* renamed from: f, reason: collision with root package name */
    public final f f26059f = new f(this);

    public e(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback) {
        this.f26057c = mediationNativeAdConfiguration;
        this.f26058d = mediationAdLoadCallback;
    }

    public static ArrayList a(View view) {
        ArrayList arrayList = new ArrayList();
        if (view == null) {
            return arrayList;
        }
        if (view instanceof MediaView) {
            arrayList.add(view);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                if (viewGroup.getChildAt(i10) instanceof ViewGroup) {
                    arrayList.addAll(a(viewGroup.getChildAt(i10)));
                } else {
                    arrayList.add(viewGroup.getChildAt(i10));
                }
            }
        } else {
            arrayList.add(view);
        }
        return arrayList;
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public final void onEnterFullscreen() {
        MediationNativeAdCallback mediationNativeAdCallback = this.f26059f.f26060b;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdOpened();
        }
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public final void onExitFullscreen() {
        MediationNativeAdCallback mediationNativeAdCallback = this.f26059f.f26060b;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdClosed();
        }
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public final void onFinishRedirection(Campaign campaign, String str) {
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public final void onRedirectionFailed(Campaign campaign, String str) {
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public final void onStartRedirection(Campaign campaign, String str) {
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public final void onVideoAdClicked(Campaign campaign) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f26059f.f26060b;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public final void onVideoStart() {
        MediationNativeAdCallback mediationNativeAdCallback = this.f26059f.f26060b;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onVideoPlay();
        }
    }
}
