package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbwc implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbwe zzb;

    public zzbwc(zzbwe zzbweVar, Context context) {
        this.zza = context;
        this.zzb = zzbweVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        WeakHashMap weakHashMap;
        zzbwb zza;
        WeakHashMap weakHashMap2;
        weakHashMap = this.zzb.zza;
        zzbwd zzbwdVar = (zzbwd) weakHashMap.get(this.zza);
        if (zzbwdVar != null) {
            if (zzbwdVar.zza + ((Long) zzbec.zzd.zze()).longValue() >= com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis()) {
                zza = new zzbwa(this.zza, zzbwdVar.zzb).zza();
                zzbwe zzbweVar = this.zzb;
                Context context = this.zza;
                weakHashMap2 = zzbweVar.zza;
                weakHashMap2.put(context, new zzbwd(zzbweVar, zza));
                return zza;
            }
        }
        zza = new zzbwa(this.zza).zza();
        zzbwe zzbweVar2 = this.zzb;
        Context context2 = this.zza;
        weakHashMap2 = zzbweVar2.zza;
        weakHashMap2.put(context2, new zzbwd(zzbweVar2, zza));
        return zza;
    }
}
