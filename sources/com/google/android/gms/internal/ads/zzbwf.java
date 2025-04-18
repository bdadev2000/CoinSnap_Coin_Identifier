package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzbwf implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbwh zzb;

    public zzbwf(zzbwh zzbwhVar, Context context) {
        this.zza = context;
        this.zzb = zzbwhVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        WeakHashMap weakHashMap;
        zzbwe zza;
        WeakHashMap weakHashMap2;
        weakHashMap = this.zzb.zza;
        zzbwg zzbwgVar = (zzbwg) weakHashMap.get(this.zza);
        if (zzbwgVar != null) {
            if (zzbwgVar.zza + ((Long) zzbeg.zza.zze()).longValue() >= com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis()) {
                zza = new zzbwd(this.zza, zzbwgVar.zzb).zza();
                zzbwh zzbwhVar = this.zzb;
                Context context = this.zza;
                weakHashMap2 = zzbwhVar.zza;
                weakHashMap2.put(context, new zzbwg(zzbwhVar, zza));
                return zza;
            }
        }
        zza = new zzbwd(this.zza).zza();
        zzbwh zzbwhVar2 = this.zzb;
        Context context2 = this.zza;
        weakHashMap2 = zzbwhVar2.zza;
        weakHashMap2.put(context2, new zzbwg(zzbwhVar2, zza));
        return zza;
    }
}
