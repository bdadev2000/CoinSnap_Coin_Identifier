package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes2.dex */
public abstract class zzuo implements zzvq {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zzvx zzc = new zzvx();
    private final zzso zzd = new zzso();

    @Nullable
    private Looper zze;

    @Nullable
    private zzdc zzf;

    @Nullable
    private zzpj zzg;

    @Override // com.google.android.gms.internal.ads.zzvq
    public /* synthetic */ zzdc zzM() {
        return null;
    }

    public final zzpj zzb() {
        zzpj zzpjVar = this.zzg;
        zzeq.zzb(zzpjVar);
        return zzpjVar;
    }

    public final zzso zzc(@Nullable zzvo zzvoVar) {
        return this.zzd.zza(0, zzvoVar);
    }

    public final zzso zzd(int i9, @Nullable zzvo zzvoVar) {
        return this.zzd.zza(0, zzvoVar);
    }

    public final zzvx zze(@Nullable zzvo zzvoVar) {
        return this.zzc.zza(0, zzvoVar);
    }

    public final zzvx zzf(int i9, @Nullable zzvo zzvoVar) {
        return this.zzc.zza(0, zzvoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzg(Handler handler, zzsp zzspVar) {
        this.zzd.zzb(handler, zzspVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzh(Handler handler, zzvy zzvyVar) {
        this.zzc.zzb(handler, zzvyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzi(zzvp zzvpVar) {
        boolean z8 = !this.zzb.isEmpty();
        this.zzb.remove(zzvpVar);
        if (z8 && this.zzb.isEmpty()) {
            zzj();
        }
    }

    public void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzk(zzvp zzvpVar) {
        this.zze.getClass();
        HashSet hashSet = this.zzb;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(zzvpVar);
        if (isEmpty) {
            zzl();
        }
    }

    public void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzm(zzvp zzvpVar, @Nullable zzie zzieVar, zzpj zzpjVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z8 = true;
        if (looper != null && looper != myLooper) {
            z8 = false;
        }
        zzeq.zzd(z8);
        this.zzg = zzpjVar;
        zzdc zzdcVar = this.zzf;
        this.zza.add(zzvpVar);
        if (this.zze == null) {
            this.zze = myLooper;
            this.zzb.add(zzvpVar);
            zzn(zzieVar);
        } else if (zzdcVar != null) {
            zzk(zzvpVar);
            zzvpVar.zza(this, zzdcVar);
        }
    }

    public abstract void zzn(@Nullable zzie zzieVar);

    public final void zzo(zzdc zzdcVar) {
        this.zzf = zzdcVar;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((zzvp) arrayList.get(i9)).zza(this, zzdcVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzp(zzvp zzvpVar) {
        this.zza.remove(zzvpVar);
        if (this.zza.isEmpty()) {
            this.zze = null;
            this.zzf = null;
            this.zzg = null;
            this.zzb.clear();
            zzq();
            return;
        }
        zzi(zzvpVar);
    }

    public abstract void zzq();

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzr(zzsp zzspVar) {
        this.zzd.zzc(zzspVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzs(zzvy zzvyVar) {
        this.zzc.zzh(zzvyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public /* synthetic */ void zzt(zzbu zzbuVar) {
        throw null;
    }

    public final boolean zzu() {
        if (!this.zzb.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public /* synthetic */ boolean zzv() {
        return true;
    }
}
