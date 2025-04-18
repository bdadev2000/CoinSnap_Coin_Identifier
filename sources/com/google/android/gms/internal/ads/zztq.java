package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes3.dex */
public abstract class zztq implements zzut {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zzva zzc = new zzva();
    private final zzrk zzd = new zzrk();

    @Nullable
    private Looper zze;

    @Nullable
    private zzbv zzf;

    @Nullable
    private zzoj zzg;

    @Override // com.google.android.gms.internal.ads.zzut
    public /* synthetic */ zzbv zzM() {
        return null;
    }

    public final zzoj zzb() {
        zzoj zzojVar = this.zzg;
        zzdb.zzb(zzojVar);
        return zzojVar;
    }

    public final zzrk zzc(@Nullable zzur zzurVar) {
        return this.zzd.zza(0, zzurVar);
    }

    public final zzrk zzd(int i10, @Nullable zzur zzurVar) {
        return this.zzd.zza(0, zzurVar);
    }

    public final zzva zze(@Nullable zzur zzurVar) {
        return this.zzc.zza(0, zzurVar);
    }

    public final zzva zzf(int i10, @Nullable zzur zzurVar) {
        return this.zzc.zza(0, zzurVar);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzg(Handler handler, zzrl zzrlVar) {
        this.zzd.zzb(handler, zzrlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzh(Handler handler, zzvb zzvbVar) {
        this.zzc.zzb(handler, zzvbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzi(zzus zzusVar) {
        boolean z10 = !this.zzb.isEmpty();
        this.zzb.remove(zzusVar);
        if (z10 && this.zzb.isEmpty()) {
            zzj();
        }
    }

    public void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzk(zzus zzusVar) {
        this.zze.getClass();
        HashSet hashSet = this.zzb;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(zzusVar);
        if (isEmpty) {
            zzl();
        }
    }

    public void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzm(zzus zzusVar, @Nullable zzhd zzhdVar, zzoj zzojVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z10 = true;
        if (looper != null && looper != myLooper) {
            z10 = false;
        }
        zzdb.zzd(z10);
        this.zzg = zzojVar;
        zzbv zzbvVar = this.zzf;
        this.zza.add(zzusVar);
        if (this.zze == null) {
            this.zze = myLooper;
            this.zzb.add(zzusVar);
            zzn(zzhdVar);
        } else if (zzbvVar != null) {
            zzk(zzusVar);
            zzusVar.zza(this, zzbvVar);
        }
    }

    public abstract void zzn(@Nullable zzhd zzhdVar);

    public final void zzo(zzbv zzbvVar) {
        this.zzf = zzbvVar;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzus) arrayList.get(i10)).zza(this, zzbvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzp(zzus zzusVar) {
        this.zza.remove(zzusVar);
        if (this.zza.isEmpty()) {
            this.zze = null;
            this.zzf = null;
            this.zzg = null;
            this.zzb.clear();
            zzq();
            return;
        }
        zzi(zzusVar);
    }

    public abstract void zzq();

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzr(zzrl zzrlVar) {
        this.zzd.zzc(zzrlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzs(zzvb zzvbVar) {
        this.zzc.zzh(zzvbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public /* synthetic */ void zzt(zzaw zzawVar) {
        throw null;
    }

    public final boolean zzu() {
        return !this.zzb.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public /* synthetic */ boolean zzv() {
        return true;
    }
}
