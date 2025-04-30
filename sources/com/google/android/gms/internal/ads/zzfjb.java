package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.LinkedList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfjb {
    private final int zzb;
    private final int zzc;
    private final LinkedList zza = new LinkedList();
    private final zzfka zzd = new zzfka();

    public zzfjb(int i9, int i10) {
        this.zzb = i9;
        this.zzc = i10;
    }

    private final void zzi() {
        while (!this.zza.isEmpty()) {
            if (com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() - ((zzfjl) this.zza.getFirst()).zzd >= this.zzc) {
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
    public final zzfjl zze() {
        this.zzd.zzf();
        zzi();
        if (this.zza.isEmpty()) {
            return null;
        }
        zzfjl zzfjlVar = (zzfjl) this.zza.remove();
        if (zzfjlVar != null) {
            this.zzd.zzh();
        }
        return zzfjlVar;
    }

    public final zzfjz zzf() {
        return this.zzd.zzd();
    }

    public final String zzg() {
        return this.zzd.zze();
    }

    public final boolean zzh(zzfjl zzfjlVar) {
        this.zzd.zzf();
        zzi();
        if (this.zza.size() == this.zzb) {
            return false;
        }
        this.zza.add(zzfjlVar);
        return true;
    }
}
