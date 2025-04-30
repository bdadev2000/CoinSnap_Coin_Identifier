package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbya implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbyc zzb;

    public zzbya(zzbyc zzbycVar, Context context) {
        this.zza = context;
        this.zzb = zzbycVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        WeakHashMap weakHashMap;
        zzbxz zza;
        WeakHashMap weakHashMap2;
        weakHashMap = this.zzb.zza;
        zzbyb zzbybVar = (zzbyb) weakHashMap.get(this.zza);
        if (zzbybVar != null) {
            if (zzbybVar.zza + ((Long) zzbfz.zza.zze()).longValue() >= com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis()) {
                zza = new zzbxy(this.zza, zzbybVar.zzb).zza();
                zzbyc zzbycVar = this.zzb;
                Context context = this.zza;
                weakHashMap2 = zzbycVar.zza;
                weakHashMap2.put(context, new zzbyb(zzbycVar, zza));
                return zza;
            }
        }
        zza = new zzbxy(this.zza).zza();
        zzbyc zzbycVar2 = this.zzb;
        Context context2 = this.zza;
        weakHashMap2 = zzbycVar2.zza;
        weakHashMap2.put(context2, new zzbyb(zzbycVar2, zza));
        return zza;
    }
}
