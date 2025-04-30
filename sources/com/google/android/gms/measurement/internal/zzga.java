package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.entity.o;

/* loaded from: classes2.dex */
public final class zzga {

    @NonNull
    public String zza;

    @NonNull
    public Bundle zzb;

    @NonNull
    private String zzc;
    private long zzd;

    private zzga(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle, long j7) {
        this.zza = str;
        this.zzc = str2;
        this.zzb = bundle == null ? new Bundle() : bundle;
        this.zzd = j7;
    }

    public final String toString() {
        String str = this.zzc;
        String str2 = this.zza;
        String valueOf = String.valueOf(this.zzb);
        StringBuilder o3 = o.o("origin=", str, ",name=", str2, ",params=");
        o3.append(valueOf);
        return o3.toString();
    }

    public final zzbd zza() {
        return new zzbd(this.zza, new zzbc(new Bundle(this.zzb)), this.zzc, this.zzd);
    }

    public static zzga zza(zzbd zzbdVar) {
        return new zzga(zzbdVar.zza, zzbdVar.zzc, zzbdVar.zzb.zzb(), zzbdVar.zzd);
    }
}
