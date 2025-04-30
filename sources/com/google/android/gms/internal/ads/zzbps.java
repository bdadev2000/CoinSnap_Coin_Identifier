package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
public final class zzbps extends zzccu {
    private final com.google.android.gms.ads.internal.util.zzbd zzb;
    private final Object zza = new Object();
    private boolean zzc = false;
    private int zzd = 0;

    public zzbps(com.google.android.gms.ads.internal.util.zzbd zzbdVar) {
        this.zzb = zzbdVar;
    }

    public final zzbpn zza() {
        boolean z8;
        zzbpn zzbpnVar = new zzbpn(this);
        com.google.android.gms.ads.internal.util.zze.zza("createNewReference: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("createNewReference: Lock acquired");
            zzj(new zzbpo(this, zzbpnVar), new zzbpp(this, zzbpnVar));
            if (this.zzd >= 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            Preconditions.checkState(z8);
            this.zzd++;
        }
        com.google.android.gms.ads.internal.util.zze.zza("createNewReference: Lock released");
        return zzbpnVar;
    }

    public final void zzb() {
        boolean z8;
        com.google.android.gms.ads.internal.util.zze.zza("markAsDestroyable: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("markAsDestroyable: Lock acquired");
            if (this.zzd >= 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            Preconditions.checkState(z8);
            com.google.android.gms.ads.internal.util.zze.zza("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.zzc = true;
            zzc();
        }
        com.google.android.gms.ads.internal.util.zze.zza("markAsDestroyable: Lock released");
    }

    public final void zzc() {
        boolean z8;
        com.google.android.gms.ads.internal.util.zze.zza("maybeDestroy: Trying to acquire lock");
        synchronized (this.zza) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("maybeDestroy: Lock acquired");
                if (this.zzd >= 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                Preconditions.checkState(z8);
                if (this.zzc && this.zzd == 0) {
                    com.google.android.gms.ads.internal.util.zze.zza("No reference is left (including root). Cleaning up engine.");
                    zzj(new zzbpr(this), new zzccq());
                } else {
                    com.google.android.gms.ads.internal.util.zze.zza("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("maybeDestroy: Lock released");
    }

    public final void zzd() {
        boolean z8;
        com.google.android.gms.ads.internal.util.zze.zza("releaseOneReference: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("releaseOneReference: Lock acquired");
            if (this.zzd > 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            Preconditions.checkState(z8);
            com.google.android.gms.ads.internal.util.zze.zza("Releasing 1 reference for JS Engine");
            this.zzd--;
            zzc();
        }
        com.google.android.gms.ads.internal.util.zze.zza("releaseOneReference: Lock released");
    }
}
