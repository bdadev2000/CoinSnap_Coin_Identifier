package s6;

import com.facebook.ads.AdExperienceType;
import com.facebook.internal.m;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;

/* loaded from: classes3.dex */
public final class d extends c {
    public d(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, m mVar) {
        super(mediationRewardedAdConfiguration, mediationAdLoadCallback, mVar);
    }

    @Override // s6.c
    public final AdExperienceType a() {
        return AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED_INTERSTITIAL;
    }
}
