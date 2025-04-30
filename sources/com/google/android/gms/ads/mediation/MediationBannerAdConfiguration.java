package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdSize;

/* loaded from: classes2.dex */
public class MediationBannerAdConfiguration extends MediationAdConfiguration {
    private final AdSize zza;

    public MediationBannerAdConfiguration(@NonNull Context context, @NonNull String str, @NonNull Bundle bundle, @NonNull Bundle bundle2, boolean z8, @Nullable Location location, int i9, int i10, @NonNull String str2, @NonNull AdSize adSize, @NonNull String str3) {
        super(context, str, bundle, bundle2, z8, location, i9, i10, str2, str3);
        this.zza = adSize;
    }

    @NonNull
    public AdSize getAdSize() {
        return this.zza;
    }
}
