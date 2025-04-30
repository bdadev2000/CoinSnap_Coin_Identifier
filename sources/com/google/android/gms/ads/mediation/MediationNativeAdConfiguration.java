package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.internal.ads.zzbhk;

/* loaded from: classes2.dex */
public class MediationNativeAdConfiguration extends MediationAdConfiguration {

    @Nullable
    private final zzbhk zza;

    public MediationNativeAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z8, @Nullable Location location, int i9, int i10, @Nullable String str2, String str3, @Nullable zzbhk zzbhkVar) {
        super(context, str, bundle, bundle2, z8, location, i9, i10, str2, str3);
        this.zza = zzbhkVar;
    }

    @NonNull
    public NativeAdOptions getNativeAdOptions() {
        return zzbhk.zza(this.zza);
    }
}
