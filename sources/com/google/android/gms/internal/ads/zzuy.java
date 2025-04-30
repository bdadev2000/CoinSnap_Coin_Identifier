package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzuy implements zzxh {
    private final zzgbc zza;
    private long zzb;

    public zzuy(List list, List list2) {
        boolean z8;
        zzgaz zzgazVar = new zzgaz();
        if (list.size() == list2.size()) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzd(z8);
        for (int i9 = 0; i9 < list.size(); i9++) {
            zzgazVar.zzf(new zzux((zzxh) list.get(i9), (List) list2.get(i9)));
        }
        this.zza = zzgazVar.zzi();
        this.zzb = C.TIME_UNSET;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzxh
    public final long zzb() {
        long j7 = Long.MAX_VALUE;
        long j9 = Long.MAX_VALUE;
        for (int i9 = 0; i9 < this.zza.size(); i9++) {
            zzux zzuxVar = (zzux) this.zza.get(i9);
            long zzb = zzuxVar.zzb();
            if ((zzuxVar.zza().contains(1) || zzuxVar.zza().contains(2) || zzuxVar.zza().contains(4)) && zzb != Long.MIN_VALUE) {
                j7 = Math.min(j7, zzb);
            }
            if (zzb != Long.MIN_VALUE) {
                j9 = Math.min(j9, zzb);
            }
        }
        if (j7 != Long.MAX_VALUE) {
            this.zzb = j7;
            return j7;
        }
        if (j9 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.zzb;
        if (j10 != C.TIME_UNSET) {
            return j10;
        }
        return j9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzxh
    public final long zzc() {
        long j7 = Long.MAX_VALUE;
        for (int i9 = 0; i9 < this.zza.size(); i9++) {
            long zzc = ((zzux) this.zza.get(i9)).zzc();
            if (zzc != Long.MIN_VALUE) {
                j7 = Math.min(j7, zzc);
            }
        }
        if (j7 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzxh
    public final void zzm(long j7) {
        for (int i9 = 0; i9 < this.zza.size(); i9++) {
            ((zzux) this.zza.get(i9)).zzm(j7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzxh
    public final boolean zzo(zzlo zzloVar) {
        boolean z8;
        boolean z9;
        boolean z10 = false;
        do {
            long zzc = zzc();
            if (zzc == Long.MIN_VALUE) {
                break;
            }
            z8 = false;
            for (int i9 = 0; i9 < this.zza.size(); i9++) {
                long zzc2 = ((zzux) this.zza.get(i9)).zzc();
                if (zzc2 != Long.MIN_VALUE && zzc2 <= zzloVar.zza) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (zzc2 == zzc || z9) {
                    z8 |= ((zzux) this.zza.get(i9)).zzo(zzloVar);
                }
            }
            z10 |= z8;
        } while (z8);
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzxh
    public final boolean zzp() {
        for (int i9 = 0; i9 < this.zza.size(); i9++) {
            if (((zzux) this.zza.get(i9)).zzp()) {
                return true;
            }
        }
        return false;
    }
}
