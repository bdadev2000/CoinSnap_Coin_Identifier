package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes2.dex */
public abstract class zztx implements zzva {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zzvh zzc = new zzvh();
    private final zzrq zzd = new zzrq();

    @Nullable
    private Looper zze;

    @Nullable
    private zzcc zzf;

    @Nullable
    private zzom zzg;

    @Override // com.google.android.gms.internal.ads.zzva
    public /* synthetic */ zzcc zzM() {
        return null;
    }

    public final zzom zzb() {
        zzom zzomVar = this.zzg;
        zzdi.zzb(zzomVar);
        return zzomVar;
    }

    public final zzrq zzc(@Nullable zzuy zzuyVar) {
        return this.zzd.zza(0, zzuyVar);
    }

    public final zzrq zzd(int i2, @Nullable zzuy zzuyVar) {
        return this.zzd.zza(0, zzuyVar);
    }

    public final zzvh zze(@Nullable zzuy zzuyVar) {
        return this.zzc.zza(0, zzuyVar);
    }

    public final zzvh zzf(int i2, @Nullable zzuy zzuyVar) {
        return this.zzc.zza(0, zzuyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzg(Handler handler, zzrr zzrrVar) {
        this.zzd.zzb(handler, zzrrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzh(Handler handler, zzvi zzviVar) {
        this.zzc.zzb(handler, zzviVar);
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzi(zzuz zzuzVar) {
        boolean z2 = !this.zzb.isEmpty();
        this.zzb.remove(zzuzVar);
        if (z2 && this.zzb.isEmpty()) {
            zzj();
        }
    }

    public void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzk(zzuz zzuzVar) {
        this.zze.getClass();
        HashSet hashSet = this.zzb;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(zzuzVar);
        if (isEmpty) {
            zzl();
        }
    }

    public void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzm(zzuz zzuzVar, @Nullable zzhh zzhhVar, zzom zzomVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z2 = true;
        if (looper != null && looper != myLooper) {
            z2 = false;
        }
        zzdi.zzd(z2);
        this.zzg = zzomVar;
        zzcc zzccVar = this.zzf;
        this.zza.add(zzuzVar);
        if (this.zze == null) {
            this.zze = myLooper;
            this.zzb.add(zzuzVar);
            zzn(zzhhVar);
        } else if (zzccVar != null) {
            zzk(zzuzVar);
            zzuzVar.zza(this, zzccVar);
        }
    }

    public abstract void zzn(@Nullable zzhh zzhhVar);

    public final void zzo(zzcc zzccVar) {
        this.zzf = zzccVar;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((zzuz) arrayList.get(i2)).zza(this, zzccVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzp(zzuz zzuzVar) {
        this.zza.remove(zzuzVar);
        if (!this.zza.isEmpty()) {
            zzi(zzuzVar);
            return;
        }
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
        this.zzb.clear();
        zzq();
    }

    public abstract void zzq();

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzr(zzrr zzrrVar) {
        this.zzd.zzc(zzrrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzs(zzvi zzviVar) {
        this.zzc.zzh(zzviVar);
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public /* synthetic */ void zzt(zzbc zzbcVar) {
        throw null;
    }

    public final boolean zzu() {
        return !this.zzb.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public /* synthetic */ boolean zzv() {
        return true;
    }
}
