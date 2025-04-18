package com.google.android.gms.ads.mediation;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;

/* loaded from: classes3.dex */
public interface MediationAdLoadCallback<MediationAdT, MediationAdCallbackT> {
    void onFailure(@NonNull AdError adError);

    @Deprecated
    void onFailure(@NonNull String str);

    @NonNull
    MediationAdCallbackT onSuccess(@NonNull MediationAdT mediationadt);
}
