package com.google.android.gms.internal.ads;

import vd.e;

/* loaded from: classes3.dex */
final class zzfhf {
    private final zzfhe zza = new zzfhe();
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;

    public final zzfhe zza() {
        zzfhe zzfheVar = this.zza;
        zzfhe clone = zzfheVar.clone();
        zzfheVar.zza = false;
        zzfheVar.zzb = false;
        return clone;
    }

    public final String zzb() {
        StringBuilder sb2 = new StringBuilder("\n\tPool does not exist: ");
        sb2.append(this.zzd);
        sb2.append("\n\tNew pools created: ");
        sb2.append(this.zzb);
        sb2.append("\n\tPools removed: ");
        sb2.append(this.zzc);
        sb2.append("\n\tEntries added: ");
        sb2.append(this.zzf);
        sb2.append("\n\tNo entries retrieved: ");
        return e.g(sb2, this.zze, "\n");
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
