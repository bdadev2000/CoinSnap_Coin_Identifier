package com.google.android.gms.measurement.internal;

import a4.j;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzgs {

    @NonNull
    public String zza;

    @NonNull
    public String zzb;

    @NonNull
    public Bundle zzc;
    private long zzd;

    public zzgs(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle, long j3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = bundle == null ? new Bundle() : bundle;
        this.zzd = j3;
    }

    public final String toString() {
        String str = this.zzb;
        String str2 = this.zza;
        String valueOf = String.valueOf(this.zzc);
        StringBuilder p10 = j.p("origin=", str, ",name=", str2, ",params=");
        p10.append(valueOf);
        return p10.toString();
    }

    public final zzbf zza() {
        return new zzbf(this.zza, new zzbe(new Bundle(this.zzc)), this.zzb, this.zzd);
    }

    public static zzgs zza(zzbf zzbfVar) {
        return new zzgs(zzbfVar.zza, zzbfVar.zzc, zzbfVar.zzb.zzb(), zzbfVar.zzd);
    }
}
