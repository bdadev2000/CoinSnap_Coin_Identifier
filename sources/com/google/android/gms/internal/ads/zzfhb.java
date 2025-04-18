package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.LinkedList;

/* loaded from: classes3.dex */
final class zzfhb {
    private final int zzb;
    private final int zzc;
    private final LinkedList zza = new LinkedList();
    private final zzfia zzd = new zzfia();

    public zzfhb(int i10, int i11) {
        this.zzb = i10;
        this.zzc = i11;
    }

    private final void zzi() {
        while (!this.zza.isEmpty()) {
            if (com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - ((zzfhl) this.zza.getFirst()).zzd >= this.zzc) {
                this.zzd.zzg();
                this.zza.remove();
            } else {
                return;
            }
        }
    }

    public final int zza() {
        return this.zzd.zza();
    }

    public final int zzb() {
        zzi();
        return this.zza.size();
    }

    public final long zzc() {
        return this.zzd.zzb();
    }

    public final long zzd() {
        return this.zzd.zzc();
    }

    @Nullable
    public final zzfhl zze() {
        this.zzd.zzf();
        zzi();
        if (this.zza.isEmpty()) {
            return null;
        }
        zzfhl zzfhlVar = (zzfhl) this.zza.remove();
        if (zzfhlVar != null) {
            this.zzd.zzh();
        }
        return zzfhlVar;
    }

    public final zzfhz zzf() {
        return this.zzd.zzd();
    }

    public final String zzg() {
        return this.zzd.zze();
    }

    public final boolean zzh(zzfhl zzfhlVar) {
        this.zzd.zzf();
        zzi();
        if (this.zza.size() == this.zzb) {
            return false;
        }
        this.zza.add(zzfhlVar);
        return true;
    }
}
