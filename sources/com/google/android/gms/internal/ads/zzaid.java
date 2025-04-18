package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzaid {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzed zzf;
    private final zzed zzg;
    private int zzh;
    private int zzi;

    public zzaid(zzed zzedVar, zzed zzedVar2, boolean z10) throws zzbh {
        this.zzg = zzedVar;
        this.zzf = zzedVar2;
        this.zze = z10;
        zzedVar2.zzL(12);
        this.zza = zzedVar2.zzp();
        zzedVar.zzL(12);
        this.zzi = zzedVar.zzp();
        zzacv.zzb(zzedVar.zzg() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        long zzu;
        int i10 = this.zzb + 1;
        this.zzb = i10;
        if (i10 == this.zza) {
            return false;
        }
        if (this.zze) {
            zzu = this.zzf.zzw();
        } else {
            zzu = this.zzf.zzu();
        }
        this.zzd = zzu;
        if (this.zzb == this.zzh) {
            this.zzc = this.zzg.zzp();
            this.zzg.zzM(4);
            int i11 = -1;
            int i12 = this.zzi - 1;
            this.zzi = i12;
            if (i12 > 0) {
                i11 = (-1) + this.zzg.zzp();
            }
            this.zzh = i11;
        }
        return true;
    }
}
