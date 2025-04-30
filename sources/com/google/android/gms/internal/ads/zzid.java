package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzid implements zzhb {
    private final zzhb zza;
    private long zzb;
    private Uri zzc = Uri.EMPTY;
    private Map zzd = Collections.emptyMap();

    public zzid(zzhb zzhbVar) {
        this.zza = zzhbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i9, int i10) throws IOException {
        int zza = this.zza.zza(bArr, i9, i10);
        if (zza != -1) {
            this.zzb += zza;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhh zzhhVar) throws IOException {
        this.zzc = zzhhVar.zza;
        this.zzd = Collections.emptyMap();
        long zzb = this.zza.zzb(zzhhVar);
        Uri zzc = zzc();
        zzc.getClass();
        this.zzc = zzc;
        this.zzd = zze();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    @Nullable
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Map zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzf(zzie zzieVar) {
        zzieVar.getClass();
        this.zza.zzf(zzieVar);
    }

    public final long zzg() {
        return this.zzb;
    }

    public final Uri zzh() {
        return this.zzc;
    }

    public final Map zzi() {
        return this.zzd;
    }
}
