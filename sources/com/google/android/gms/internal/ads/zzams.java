package com.google.android.gms.internal.ads;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzams implements zzadb {
    private final zzamt zza = new zzamt(null, 0);
    private final zzek zzb = new zzek(16384);
    private boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzadb
    public final int zzb(zzadc zzadcVar, zzadx zzadxVar) throws IOException {
        int zza = zzadcVar.zza(this.zzb.zzN(), 0, 16384);
        if (zza == -1) {
            return -1;
        }
        this.zzb.zzL(0);
        this.zzb.zzK(zza);
        if (!this.zzc) {
            this.zza.zzd(0L, 4);
            this.zzc = true;
        }
        this.zza.zza(this.zzb);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final /* synthetic */ zzadb zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final /* synthetic */ List zzd() {
        return zzgax.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zze(zzade zzadeVar) {
        this.zza.zzb(zzadeVar, new zzaon(Integer.MIN_VALUE, 0, 1));
        zzadeVar.zzD();
        zzadeVar.zzO(new zzadz(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzf(long j2, long j3) {
        this.zzc = false;
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final boolean zzi(zzadc zzadcVar) throws IOException {
        int i2;
        zzek zzekVar = new zzek(10);
        int i3 = 0;
        while (true) {
            zzacq zzacqVar = (zzacq) zzadcVar;
            zzacqVar.zzm(zzekVar.zzN(), 0, 10, false);
            zzekVar.zzL(0);
            if (zzekVar.zzo() != 4801587) {
                break;
            }
            zzekVar.zzM(3);
            int zzl = zzekVar.zzl();
            i3 += zzl + 10;
            zzacqVar.zzl(zzl, false);
        }
        zzadcVar.zzj();
        zzacq zzacqVar2 = (zzacq) zzadcVar;
        zzacqVar2.zzl(i3, false);
        int i4 = 0;
        int i5 = i3;
        while (true) {
            int i6 = 7;
            zzacqVar2.zzm(zzekVar.zzN(), 0, 7, false);
            zzekVar.zzL(0);
            int zzq = zzekVar.zzq();
            if (zzq == 44096 || zzq == 44097) {
                i4++;
                if (i4 >= 4) {
                    return true;
                }
                byte[] zzN = zzekVar.zzN();
                if (zzN.length < 7) {
                    i2 = -1;
                } else {
                    int i7 = ((zzN[2] & UnsignedBytes.MAX_VALUE) << 8) | (zzN[3] & UnsignedBytes.MAX_VALUE);
                    if (i7 == 65535) {
                        i7 = ((zzN[4] & UnsignedBytes.MAX_VALUE) << 16) | ((zzN[5] & UnsignedBytes.MAX_VALUE) << 8) | (zzN[6] & UnsignedBytes.MAX_VALUE);
                    } else {
                        i6 = 4;
                    }
                    if (zzq == 44097) {
                        i6 += 2;
                    }
                    i2 = i7 + i6;
                }
                if (i2 == -1) {
                    return false;
                }
                zzacqVar2.zzl(i2 - 7, false);
            } else {
                zzadcVar.zzj();
                i5++;
                if (i5 - i3 >= 8192) {
                    return false;
                }
                zzacqVar2.zzl(i5, false);
                i4 = 0;
            }
        }
    }
}
