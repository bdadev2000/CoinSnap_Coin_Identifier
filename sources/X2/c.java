package X2;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.nativead.MediaView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeAdWithCodeListener;
import com.mbridge.msdk.out.OnMBMediaViewListener;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class c extends UnifiedNativeAdMapper implements OnMBMediaViewListener {
    public Campaign b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationNativeAdConfiguration f3662c;

    /* renamed from: d, reason: collision with root package name */
    public final MediationAdLoadCallback f3663d;

    /* renamed from: f, reason: collision with root package name */
    public final d f3664f;

    /* JADX WARN: Type inference failed for: r1v1, types: [X2.d, com.mbridge.msdk.out.NativeAdWithCodeListener] */
    public c(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback) {
        this.f3662c = mediationNativeAdConfiguration;
        this.f3663d = mediationAdLoadCallback;
        ?? nativeAdWithCodeListener = new NativeAdWithCodeListener();
        nativeAdWithCodeListener.f3666c = this;
        nativeAdWithCodeListener.f3665a = mediationAdLoadCallback;
        this.f3664f = nativeAdWithCodeListener;
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
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                if (viewGroup.getChildAt(i9) instanceof ViewGroup) {
                    arrayList.addAll(a(viewGroup.getChildAt(i9)));
                } else {
                    arrayList.add(viewGroup.getChildAt(i9));
                }
            }
        } else {
            arrayList.add(view);
        }
        return arrayList;
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public final void onEnterFullscreen() {
        MediationNativeAdCallback mediationNativeAdCallback = this.f3664f.b;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdOpened();
        }
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public final void onExitFullscreen() {
        MediationNativeAdCallback mediationNativeAdCallback = this.f3664f.b;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdClosed();
        }
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public final void onVideoAdClicked(Campaign campaign) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f3664f.b;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public final void onVideoStart() {
        MediationNativeAdCallback mediationNativeAdCallback = this.f3664f.b;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onVideoPlay();
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
}
