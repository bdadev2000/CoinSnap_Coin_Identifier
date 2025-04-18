package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public final class zzamu implements zzadb {
    private final zzamv zza;
    private final zzek zzb;
    private final zzek zzc;
    private final zzej zzd;
    private zzade zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;

    public zzamu() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final int zzb(zzadc zzadcVar, zzadx zzadxVar) throws IOException {
        zzdi.zzb(this.zze);
        int zza = zzadcVar.zza(this.zzb.zzN(), 0, Opcodes.ACC_STRICT);
        if (!this.zzi) {
            this.zze.zzO(new zzadz(-9223372036854775807L, 0L));
            this.zzi = true;
        }
        if (zza == -1) {
            return -1;
        }
        this.zzb.zzL(0);
        this.zzb.zzK(zza);
        if (!this.zzh) {
            this.zza.zzd(this.zzf, 4);
            this.zzh = true;
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
        this.zze = zzadeVar;
        this.zza.zzb(zzadeVar, new zzaon(Integer.MIN_VALUE, 0, 1));
        zzadeVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzf(long j2, long j3) {
        this.zzh = false;
        this.zza.zze();
        this.zzf = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final boolean zzi(zzadc zzadcVar) throws IOException {
        int i2 = 0;
        while (true) {
            zzacq zzacqVar = (zzacq) zzadcVar;
            zzacqVar.zzm(this.zzc.zzN(), 0, 10, false);
            this.zzc.zzL(0);
            if (this.zzc.zzo() != 4801587) {
                break;
            }
            this.zzc.zzM(3);
            int zzl = this.zzc.zzl();
            i2 += zzl + 10;
            zzacqVar.zzl(zzl, false);
        }
        zzadcVar.zzj();
        zzacq zzacqVar2 = (zzacq) zzadcVar;
        zzacqVar2.zzl(i2, false);
        if (this.zzg == -1) {
            this.zzg = i2;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = i2;
        do {
            zzacqVar2.zzm(this.zzc.zzN(), 0, 2, false);
            this.zzc.zzL(0);
            if (zzamv.zzf(this.zzc.zzq())) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                zzacqVar2.zzm(this.zzc.zzN(), 0, 4, false);
                this.zzd.zzl(14);
                int zzd = this.zzd.zzd(13);
                if (zzd <= 6) {
                    i5++;
                    zzadcVar.zzj();
                    zzacqVar2.zzl(i5, false);
                } else {
                    zzacqVar2.zzl(zzd - 6, false);
                    i4 += zzd;
                }
            } else {
                i5++;
                zzadcVar.zzj();
                zzacqVar2.zzl(i5, false);
            }
            i3 = 0;
            i4 = 0;
        } while (i5 - i2 < 8192);
        return false;
    }

    public zzamu(int i2) {
        this.zza = new zzamv(true, null, 0);
        this.zzb = new zzek(Opcodes.ACC_STRICT);
        this.zzg = -1L;
        zzek zzekVar = new zzek(10);
        this.zzc = zzekVar;
        byte[] zzN = zzekVar.zzN();
        this.zzd = new zzej(zzN, zzN.length);
    }
}
