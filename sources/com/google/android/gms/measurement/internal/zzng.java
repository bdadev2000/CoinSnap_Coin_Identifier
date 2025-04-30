package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzng implements Callable<String> {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ zznc zzb;

    public zzng(zznc zzncVar, zzo zzoVar) {
        this.zza = zzoVar;
        this.zzb = zzncVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        if (this.zzb.zzb((String) Preconditions.checkNotNull(this.zza.zza)).zzj() && zzin.zzb(this.zza.zzt).zzj()) {
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
