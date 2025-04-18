package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class zzbnt extends zzcav {
    private final com.google.android.gms.ads.internal.util.zzbc zzb;
    private final Object zza = new Object();
    private boolean zzc = false;
    private int zzd = 0;

    public zzbnt(com.google.android.gms.ads.internal.util.zzbc zzbcVar) {
        this.zzb = zzbcVar;
    }

    public final zzbno zza() {
        boolean z10;
        zzbno zzbnoVar = new zzbno(this);
        com.google.android.gms.ads.internal.util.zze.zza("createNewReference: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("createNewReference: Lock acquired");
            zzj(new zzbnp(this, zzbnoVar), new zzbnq(this, zzbnoVar));
            if (this.zzd >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkState(z10);
            this.zzd++;
        }
        com.google.android.gms.ads.internal.util.zze.zza("createNewReference: Lock released");
        return zzbnoVar;
    }

    public final void zzb() {
        boolean z10;
        com.google.android.gms.ads.internal.util.zze.zza("markAsDestroyable: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("markAsDestroyable: Lock acquired");
            if (this.zzd >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkState(z10);
            com.google.android.gms.ads.internal.util.zze.zza("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.zzc = true;
            zzc();
        }
        com.google.android.gms.ads.internal.util.zze.zza("markAsDestroyable: Lock released");
    }

    public final void zzc() {
        boolean z10;
        com.google.android.gms.ads.internal.util.zze.zza("maybeDestroy: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("maybeDestroy: Lock acquired");
            if (this.zzd >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkState(z10);
            if (this.zzc && this.zzd == 0) {
                com.google.android.gms.ads.internal.util.zze.zza("No reference is left (including root). Cleaning up engine.");
                zzj(new zzbns(this), new zzcar());
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("There are still references to the engine. Not destroying.");
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("maybeDestroy: Lock released");
    }

    public final void zzd() {
        boolean z10;
        com.google.android.gms.ads.internal.util.zze.zza("releaseOneReference: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("releaseOneReference: Lock acquired");
            if (this.zzd > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkState(z10);
            com.google.android.gms.ads.internal.util.zze.zza("Releasing 1 reference for JS Engine");
            this.zzd--;
            zzc();
        }
        com.google.android.gms.ads.internal.util.zze.zza("releaseOneReference: Lock released");
    }
}
