package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzog implements Callable<String> {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ zznv zzb;

    public zzog(zznv zznvVar, zzo zzoVar) {
        this.zza = zzoVar;
        this.zzb = zznvVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        if (this.zzb.zzb((String) Preconditions.checkNotNull(this.zza.zza)).zzh() && zzje.zzb(this.zza.zzt).zzh()) {
            zzg zza = this.zzb.zza(this.zza);
            if (zza == null) {
                this.zzb.zzj().zzu().zza("App info was null when attempting to get app instance id");
                return null;
            }
            return zza.zzad();
        }
        this.zzb.zzj().zzp().zza("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
