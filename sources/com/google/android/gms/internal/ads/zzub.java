package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzub implements zzwi {
    private final zzfzo zza;
    private long zzb;

    public zzub(List list, List list2) {
        boolean z10;
        zzfzl zzfzlVar = new zzfzl();
        if (list.size() == list2.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zzd(z10);
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzfzlVar.zzf(new zzua((zzwi) list.get(i10), (List) list2.get(i10)));
        }
        this.zza = zzfzlVar.zzi();
        this.zzb = C.TIME_UNSET;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzb() {
        long j3 = Long.MAX_VALUE;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            zzua zzuaVar = (zzua) this.zza.get(i10);
            long zzb = zzuaVar.zzb();
            if ((zzuaVar.zza().contains(1) || zzuaVar.zza().contains(2) || zzuaVar.zza().contains(4)) && zzb != Long.MIN_VALUE) {
                j3 = Math.min(j3, zzb);
            }
            if (zzb != Long.MIN_VALUE) {
                j10 = Math.min(j10, zzb);
            }
        }
        if (j3 != Long.MAX_VALUE) {
            this.zzb = j3;
            return j3;
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j11 = this.zzb;
        if (j11 != C.TIME_UNSET) {
            return j11;
        }
        return j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzc() {
        long j3 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            long zzc = ((zzua) this.zza.get(i10)).zzc();
            if (zzc != Long.MIN_VALUE) {
                j3 = Math.min(j3, zzc);
            }
        }
        if (j3 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzm(long j3) {
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            ((zzua) this.zza.get(i10)).zzm(j3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzwi
    public final boolean zzo(zzko zzkoVar) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        do {
            long zzc = zzc();
            if (zzc == Long.MIN_VALUE) {
                break;
            }
            z10 = false;
            for (int i10 = 0; i10 < this.zza.size(); i10++) {
                long zzc2 = ((zzua) this.zza.get(i10)).zzc();
                if (zzc2 != Long.MIN_VALUE && zzc2 <= zzkoVar.zza) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (zzc2 == zzc || z11) {
                    z10 |= ((zzua) this.zza.get(i10)).zzo(zzkoVar);
                }
            }
            z12 |= z10;
        } while (z10);
        return z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzwi
    public final boolean zzp() {
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            if (((zzua) this.zza.get(i10)).zzp()) {
                return true;
            }
        }
        return false;
    }
}
