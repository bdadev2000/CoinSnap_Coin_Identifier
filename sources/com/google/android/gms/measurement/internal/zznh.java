package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zznh {
    protected long zza;
    final /* synthetic */ zznb zzb;
    private long zzc;
    private final zzav zzd;

    public zznh(zznb zznbVar) {
        this.zzb = zznbVar;
        this.zzd = new zznk(this, zznbVar.zzu);
        long elapsedRealtime = zznbVar.zzb().elapsedRealtime();
        this.zzc = elapsedRealtime;
        this.zza = elapsedRealtime;
    }

    public final long zza(long j3) {
        long j10 = j3 - this.zza;
        this.zza = j3;
        return j10;
    }

    public final void zzb(long j3) {
        this.zzd.zza();
    }

    public final void zzc(long j3) {
        this.zzb.zzt();
        this.zzd.zza();
        this.zzc = j3;
        this.zza = j3;
    }

    public static /* synthetic */ void zza(zznh zznhVar) {
        zznhVar.zzb.zzt();
        zznhVar.zza(false, false, zznhVar.zzb.zzb().elapsedRealtime());
        zznhVar.zzb.zzc().zza(zznhVar.zzb.zzb().elapsedRealtime());
    }

    public final void zza() {
        this.zzd.zza();
        if (this.zzb.zze().zza(zzbh.zzdb)) {
            this.zzc = this.zzb.zzb().elapsedRealtime();
        } else {
            this.zzc = 0L;
        }
        this.zza = this.zzc;
    }

    public final boolean zza(boolean z10, boolean z11, long j3) {
        this.zzb.zzt();
        this.zzb.zzu();
        if (this.zzb.zzu.zzac()) {
            this.zzb.zzk().zzk.zza(this.zzb.zzb().currentTimeMillis());
        }
        long j10 = j3 - this.zzc;
        if (!z10 && j10 < 1000) {
            this.zzb.zzj().zzp().zza("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j10));
            return false;
        }
        if (!z11) {
            j10 = zza(j3);
        }
        this.zzb.zzj().zzp().zza("Recording user engagement, ms", Long.valueOf(j10));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j10);
        zzos.zza(this.zzb.zzn().zza(!this.zzb.zze().zzw()), bundle, true);
        if (!z11) {
            this.zzb.zzm().zzc(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_e", bundle);
        }
        this.zzc = j3;
        this.zzd.zza();
        this.zzd.zza(zzbh.zzbc.zza(null).longValue());
        return true;
    }
}
