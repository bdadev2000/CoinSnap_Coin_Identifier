package com.google.android.gms.internal.ads;

import x0.AbstractC2914a;

/* loaded from: classes2.dex */
final class zzfjf {
    private final zzfje zza = new zzfje();
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;

    public final zzfje zza() {
        zzfje zzfjeVar = this.zza;
        zzfje clone = zzfjeVar.clone();
        zzfjeVar.zza = false;
        zzfjeVar.zzb = false;
        return clone;
    }

    public final String zzb() {
        StringBuilder sb = new StringBuilder("\n\tPool does not exist: ");
        sb.append(this.zzd);
        sb.append("\n\tNew pools created: ");
        sb.append(this.zzb);
        sb.append("\n\tPools removed: ");
        sb.append(this.zzc);
        sb.append("\n\tEntries added: ");
        sb.append(this.zzf);
        sb.append("\n\tNo entries retrieved: ");
        return AbstractC2914a.g(sb, this.zze, "\n");
    }

    public final void zzc() {
        this.zzf++;
    }

    public final void zzd() {
        this.zzb++;
        this.zza.zza = true;
    }

    public final void zze() {
        this.zze++;
    }

    public final void zzf() {
        this.zzd++;
    }

    public final void zzg() {
        this.zzc++;
        this.zza.zzb = true;
    }
}
