package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzajp {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzfu zzf;
    private final zzfu zzg;
    private int zzh;
    private int zzi;

    public zzajp(zzfu zzfuVar, zzfu zzfuVar2, boolean z8) throws zzch {
        this.zzg = zzfuVar;
        this.zzf = zzfuVar2;
        this.zze = z8;
        zzfuVar2.zzK(12);
        this.zza = zzfuVar2.zzp();
        zzfuVar.zzK(12);
        this.zzi = zzfuVar.zzp();
        zzady.zzb(zzfuVar.zzg() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        long zzu;
        int i9 = this.zzb + 1;
        this.zzb = i9;
        if (i9 == this.zza) {
            return false;
        }
        if (this.zze) {
            zzu = this.zzf.zzv();
        } else {
            zzu = this.zzf.zzu();
        }
        this.zzd = zzu;
        if (this.zzb == this.zzh) {
            this.zzc = this.zzg.zzp();
            this.zzg.zzL(4);
            int i10 = -1;
            int i11 = this.zzi - 1;
            this.zzi = i11;
            if (i11 > 0) {
                i10 = (-1) + this.zzg.zzp();
            }
            this.zzh = i10;
        }
        return true;
    }
}
