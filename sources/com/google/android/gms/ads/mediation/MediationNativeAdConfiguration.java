package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.internal.ads.zzbfn;

/* loaded from: classes3.dex */
public class MediationNativeAdConfiguration extends MediationAdConfiguration {

    @Nullable
    private final zzbfn zza;

    public MediationNativeAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z10, @Nullable Location location, int i10, int i11, @Nullable String str2, String str3, @Nullable zzbfn zzbfnVar) {
        super(context, str, bundle, bundle2, z10, location, i10, i11, str2, str3);
        this.zza = zzbfnVar;
    }

    @NonNull
    public NativeAdOptions getNativeAdOptions() {
        return zzbfn.zza(this.zza);
    }
}
