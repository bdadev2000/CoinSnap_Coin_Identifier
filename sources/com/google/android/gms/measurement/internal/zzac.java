package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzoc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzac extends zzz {
    private zzff.zze zzg;
    private final /* synthetic */ zzu zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzu zzuVar, String str, int i9, zzff.zze zzeVar) {
        super(str, i9);
        this.zzh = zzuVar;
        this.zzg = zzeVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzz
    public final int zza() {
        return this.zzg.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzz
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzz
    public final boolean zzc() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean zza(Long l, Long l2, zzfn.zzo zzoVar, boolean z8) {
        byte b = zzoc.zza() && this.zzh.zze().zzf(this.zza, zzbf.zzbi);
        boolean zzf = this.zzg.zzf();
        boolean zzg = this.zzg.zzg();
        boolean zzh = this.zzg.zzh();
        byte b8 = zzf || zzg || zzh;
        Boolean bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z8 && b8 == false) {
            this.zzh.zzj().zzp().zza("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.zzb), this.zzg.zzi() ? Integer.valueOf(this.zzg.zza()) : null);
            return true;
        }
        zzff.zzc zzb = this.zzg.zzb();
        boolean zzf2 = zzb.zzf();
        if (zzoVar.zzk()) {
            if (!zzb.zzh()) {
                this.zzh.zzj().zzu().zza("No number filter for long property. property", this.zzh.zzi().zzc(zzoVar.zzg()));
            } else {
                bool = zzz.zza(zzz.zza(zzoVar.zzc(), zzb.zzc()), zzf2);
            }
        } else if (zzoVar.zzi()) {
            if (!zzb.zzh()) {
                this.zzh.zzj().zzu().zza("No number filter for double property. property", this.zzh.zzi().zzc(zzoVar.zzg()));
            } else {
                bool = zzz.zza(zzz.zza(zzoVar.zza(), zzb.zzc()), zzf2);
            }
        } else if (zzoVar.zzm()) {
            if (!zzb.zzj()) {
                if (!zzb.zzh()) {
                    this.zzh.zzj().zzu().zza("No string or number filter defined. property", this.zzh.zzi().zzc(zzoVar.zzg()));
                } else if (zznl.zzb(zzoVar.zzh())) {
                    bool = zzz.zza(zzz.zza(zzoVar.zzh(), zzb.zzc()), zzf2);
                } else {
                    this.zzh.zzj().zzu().zza("Invalid user property value for Numeric number filter. property, value", this.zzh.zzi().zzc(zzoVar.zzg()), zzoVar.zzh());
                }
            } else {
                bool = zzz.zza(zzz.zza(zzoVar.zzh(), zzb.zzd(), this.zzh.zzj()), zzf2);
            }
        } else {
            this.zzh.zzj().zzu().zza("User property has no value, property", this.zzh.zzi().zzc(zzoVar.zzg()));
        }
        this.zzh.zzj().zzp().zza("Property filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        this.zzc = Boolean.TRUE;
        if (zzh && !bool.booleanValue()) {
            return true;
        }
        if (!z8 || this.zzg.zzf()) {
            this.zzd = bool;
        }
        if (bool.booleanValue() && b8 != false && zzoVar.zzl()) {
            long zzd = zzoVar.zzd();
            if (l != null) {
                zzd = l.longValue();
            }
            if (b != false && this.zzg.zzf() && !this.zzg.zzg() && l2 != null) {
                zzd = l2.longValue();
            }
            if (this.zzg.zzg()) {
                this.zzf = Long.valueOf(zzd);
            } else {
                this.zze = Long.valueOf(zzd);
            }
        }
        return true;
    }
}
