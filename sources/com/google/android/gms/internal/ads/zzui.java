package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
public final class zzui implements zzwp {
    private final zzgax zza;
    private long zzb;

    public zzui(List list, List list2) {
        zzgau zzgauVar = new zzgau();
        zzdi.zzd(list.size() == list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgauVar.zzf(new zzuh((zzwp) list.get(i2), (List) list2.get(i2)));
        }
        this.zza = zzgauVar.zzi();
        this.zzb = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzwp
    public final long zzb() {
        long j2 = Long.MAX_VALUE;
        long j3 = Long.MAX_VALUE;
        for (int i2 = 0; i2 < this.zza.size(); i2++) {
            zzuh zzuhVar = (zzuh) this.zza.get(i2);
            long zzb = zzuhVar.zzb();
            if ((zzuhVar.zza().contains(1) || zzuhVar.zza().contains(2) || zzuhVar.zza().contains(4)) && zzb != Long.MIN_VALUE) {
                j2 = Math.min(j2, zzb);
            }
            if (zzb != Long.MIN_VALUE) {
                j3 = Math.min(j3, zzb);
            }
        }
        if (j2 != Long.MAX_VALUE) {
            this.zzb = j2;
            return j2;
        }
        if (j3 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j4 = this.zzb;
        return j4 != -9223372036854775807L ? j4 : j3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzwp
    public final long zzc() {
        long j2 = Long.MAX_VALUE;
        for (int i2 = 0; i2 < this.zza.size(); i2++) {
            long zzc = ((zzuh) this.zza.get(i2)).zzc();
            if (zzc != Long.MIN_VALUE) {
                j2 = Math.min(j2, zzc);
            }
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzwp
    public final void zzm(long j2) {
        for (int i2 = 0; i2 < this.zza.size(); i2++) {
            ((zzuh) this.zza.get(i2)).zzm(j2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzwp
    public final boolean zzo(zzks zzksVar) {
        boolean z2;
        boolean z3 = false;
        do {
            long zzc = zzc();
            if (zzc == Long.MIN_VALUE) {
                break;
            }
            z2 = false;
            for (int i2 = 0; i2 < this.zza.size(); i2++) {
                long zzc2 = ((zzuh) this.zza.get(i2)).zzc();
                boolean z4 = zzc2 != Long.MIN_VALUE && zzc2 <= zzksVar.zza;
                if (zzc2 == zzc || z4) {
                    z2 |= ((zzuh) this.zza.get(i2)).zzo(zzksVar);
                }
            }
            z3 |= z2;
        } while (z2);
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzwp
    public final boolean zzp() {
        for (int i2 = 0; i2 < this.zza.size(); i2++) {
            if (((zzuh) this.zza.get(i2)).zzp()) {
                return true;
            }
        }
        return false;
    }
}
