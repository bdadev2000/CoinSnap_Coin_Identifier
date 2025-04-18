package ng;

import android.widget.Toast;
import com.ads.control.admob.AppOpenManager;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.camera.PlantIdentifierActivity;
import kotlin.jvm.internal.Intrinsics;
import sf.k;

/* loaded from: classes4.dex */
public final class g extends RewardedAdLoadCallback {
    public final /* synthetic */ PlantIdentifierActivity a;

    public g(PlantIdentifierActivity plantIdentifierActivity) {
        this.a = plantIdentifierActivity;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        PlantIdentifierActivity plantIdentifierActivity = this.a;
        plantIdentifierActivity.f16677m = null;
        Intrinsics.checkNotNullParameter(plantIdentifierActivity, "<this>");
        Intrinsics.checkNotNullParameter("Try Again", PglCryptUtils.KEY_MESSAGE);
        Toast.makeText(plantIdentifierActivity, "Try Again", 0).show();
        k kVar = plantIdentifierActivity.f16676l;
        if (kVar != null) {
            kVar.cancel();
        }
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(RewardedAd rewardedAd) {
        RewardedAd ad2 = rewardedAd;
        Intrinsics.checkNotNullParameter(ad2, "ad");
        AppOpenManager.f().f2914k = false;
        PlantIdentifierActivity plantIdentifierActivity = this.a;
        k kVar = plantIdentifierActivity.f16676l;
        if (kVar != null) {
            kVar.cancel();
        }
        plantIdentifierActivity.f16677m = ad2;
        if (ad2 != null) {
            ad2.show(plantIdentifierActivity, new gb.d(plantIdentifierActivity, 10));
        } else {
            Intrinsics.checkNotNullParameter(plantIdentifierActivity, "<this>");
            Intrinsics.checkNotNullParameter("Try Again", PglCryptUtils.KEY_MESSAGE);
            Toast.makeText(plantIdentifierActivity, "Try Again", 0).show();
            k kVar2 = plantIdentifierActivity.f16676l;
            if (kVar2 != null) {
                kVar2.cancel();
            }
        }
        ad2.setOnPaidEventListener(new androidx.fragment.app.e(28, plantIdentifierActivity, ad2));
    }
}
