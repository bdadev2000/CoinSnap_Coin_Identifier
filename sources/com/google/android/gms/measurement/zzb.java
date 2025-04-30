package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zzir;
import com.google.android.gms.measurement.internal.zziu;
import com.google.android.gms.measurement.internal.zziv;
import com.google.android.gms.measurement.internal.zzno;
import java.util.List;
import java.util.Map;
import x.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzb extends AppMeasurement.zza {
    private final zzhj zza;
    private final zziv zzb;

    public zzb(@NonNull zzhj zzhjVar) {
        super();
        Preconditions.checkNotNull(zzhjVar);
        this.zza = zzhjVar;
        this.zzb = zzhjVar.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final int zza(String str) {
        return zziv.zza(str);
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final Double zzb() {
        return this.zzb.zzad();
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final Integer zzc() {
        return this.zzb.zzae();
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final Long zzd() {
        return this.zzb.zzaf();
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final String zze() {
        return this.zzb.zzak();
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final long zzf() {
        return this.zza.zzt().zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final String zzg() {
        return this.zzb.zzag();
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final String zzh() {
        return this.zzb.zzah();
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final String zzi() {
        return this.zzb.zzai();
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final String zzj() {
        return this.zzb.zzag();
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final Boolean zza() {
        return this.zzb.zzac();
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void zzb(String str) {
        this.zza.zze().zza(str, this.zza.zzb().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void zzc(String str) {
        this.zza.zze().zzb(str, this.zza.zzb().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final Object zza(int i9) {
        if (i9 == 0) {
            return zze();
        }
        if (i9 == 1) {
            return zzd();
        }
        if (i9 == 2) {
            return zzb();
        }
        if (i9 == 3) {
            return zzc();
        }
        if (i9 != 4) {
            return null;
        }
        return zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void zzb(String str, String str2, Bundle bundle) {
        this.zzb.zzb(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void zzb(zziu zziuVar) {
        this.zzb.zzb(zziuVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final List<Bundle> zza(String str, String str2) {
        return this.zzb.zza(str, str2);
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final Map<String, Object> zza(boolean z8) {
        List<zzno> zza = this.zzb.zza(z8);
        b bVar = new b(zza.size());
        for (zzno zznoVar : zza) {
            Object zza2 = zznoVar.zza();
            if (zza2 != null) {
                bVar.put(zznoVar.zza, zza2);
            }
        }
        return bVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final Map<String, Object> zza(String str, String str2, boolean z8) {
        return this.zzb.zza(str, str2, z8);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void zza(String str, String str2, Bundle bundle) {
        this.zza.zzp().zza(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void zza(String str, String str2, Bundle bundle, long j7) {
        this.zzb.zza(str, str2, bundle, j7);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void zza(zziu zziuVar) {
        this.zzb.zza(zziuVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void zza(Bundle bundle) {
        this.zzb.zzb(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void zza(zzir zzirVar) {
        this.zzb.zza(zzirVar);
    }
}
