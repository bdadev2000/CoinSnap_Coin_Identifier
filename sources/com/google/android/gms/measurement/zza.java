package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zzir;
import com.google.android.gms.measurement.internal.zziu;
import com.google.android.gms.measurement.internal.zzkk;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zza extends AppMeasurement.zza {
    private final zzkk zza;

    public zza(zzkk zzkkVar) {
        super();
        Preconditions.checkNotNull(zzkkVar);
        this.zza = zzkkVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final int zza(String str) {
        return this.zza.zza(str);
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final Double zzb() {
        return (Double) this.zza.zza(2);
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final Integer zzc() {
        return (Integer) this.zza.zza(3);
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final Long zzd() {
        return (Long) this.zza.zza(1);
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final String zze() {
        return (String) this.zza.zza(0);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final long zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final String zzg() {
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final String zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final String zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final String zzj() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final Boolean zza() {
        return (Boolean) this.zza.zza(4);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void zzb(String str) {
        this.zza.zzb(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void zzc(String str) {
        this.zza.zzc(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final Object zza(int i9) {
        return this.zza.zza(i9);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void zzb(String str, String str2, Bundle bundle) {
        this.zza.zzb(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final List<Bundle> zza(String str, String str2) {
        return this.zza.zza(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void zzb(zziu zziuVar) {
        this.zza.zzb(zziuVar);
    }

    @Override // com.google.android.gms.measurement.AppMeasurement.zza
    public final Map<String, Object> zza(boolean z8) {
        return this.zza.zza((String) null, (String) null, z8);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final Map<String, Object> zza(String str, String str2, boolean z8) {
        return this.zza.zza(str, str2, z8);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void zza(String str, String str2, Bundle bundle) {
        this.zza.zza(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void zza(String str, String str2, Bundle bundle, long j7) {
        this.zza.zza(str, str2, bundle, j7);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void zza(zziu zziuVar) {
        this.zza.zza(zziuVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void zza(Bundle bundle) {
        this.zza.zza(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void zza(zzir zzirVar) {
        this.zza.zza(zzirVar);
    }
}
