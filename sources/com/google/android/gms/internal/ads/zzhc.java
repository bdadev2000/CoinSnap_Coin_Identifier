package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzhc implements zzgd {
    private final zzgd zza;
    private long zzb;
    private Uri zzc = Uri.EMPTY;
    private Map zzd = Collections.emptyMap();

    public zzhc(zzgd zzgdVar) {
        this.zza = zzgdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzn
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        int zza = this.zza.zza(bArr, i10, i11);
        if (zza != -1) {
            this.zzb += zza;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final long zzb(zzgi zzgiVar) throws IOException {
        this.zzc = zzgiVar.zza;
        this.zzd = Collections.emptyMap();
        long zzb = this.zza.zzb(zzgiVar);
        Uri zzc = zzc();
        zzc.getClass();
        this.zzc = zzc;
        this.zzd = zze();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    @Nullable
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final Map zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final void zzf(zzhd zzhdVar) {
        zzhdVar.getClass();
        this.zza.zzf(zzhdVar);
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
