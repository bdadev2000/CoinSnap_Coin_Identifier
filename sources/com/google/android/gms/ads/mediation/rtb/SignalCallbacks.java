package com.google.android.gms.ads.mediation.rtb;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;

/* loaded from: classes3.dex */
public interface SignalCallbacks {
    void onFailure(@NonNull AdError adError);

    @Deprecated
    void onFailure(@NonNull String str);

    void onSuccess(@NonNull String str);
}
