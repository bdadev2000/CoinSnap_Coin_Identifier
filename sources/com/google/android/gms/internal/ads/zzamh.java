package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzamh implements zzacr {
    private final zzami zza;
    private final zzed zzb;
    private final zzed zzc;
    private final zzec zzd;
    private zzacu zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;

    public zzamh() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final int zzb(zzacs zzacsVar, zzadn zzadnVar) throws IOException {
        zzdb.zzb(this.zze);
        int zza = zzacsVar.zza(this.zzb.zzN(), 0, 2048);
        if (!this.zzi) {
            this.zze.zzO(new zzadp(C.TIME_UNSET, 0L));
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

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ zzacr zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ List zzd() {
        return zzfzo.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zze(zzacu zzacuVar) {
        this.zze = zzacuVar;
        this.zza.zzb(zzacuVar, new zzaoa(Integer.MIN_VALUE, 0, 1));
        zzacuVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zzf(long j3, long j10) {
        this.zzh = false;
        this.zza.zze();
        this.zzf = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzi(zzacs zzacsVar) throws IOException {
        int i10 = 0;
        while (true) {
            zzacg zzacgVar = (zzacg) zzacsVar;
            zzacgVar.zzm(this.zzc.zzN(), 0, 10, false);
            this.zzc.zzL(0);
            if (this.zzc.zzo() != 4801587) {
                break;
            }
            this.zzc.zzM(3);
            int zzl = this.zzc.zzl();
            i10 += zzl + 10;
            zzacgVar.zzl(zzl, false);
        }
        zzacsVar.zzj();
        zzacg zzacgVar2 = (zzacg) zzacsVar;
        zzacgVar2.zzl(i10, false);
        if (this.zzg == -1) {
            this.zzg = i10;
        }
        int i11 = 0;
        int i12 = 0;
        int i13 = i10;
        do {
            zzacgVar2.zzm(this.zzc.zzN(), 0, 2, false);
            this.zzc.zzL(0);
            if (!zzami.zzf(this.zzc.zzq())) {
                i13++;
                zzacsVar.zzj();
                zzacgVar2.zzl(i13, false);
            } else {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                zzacgVar2.zzm(this.zzc.zzN(), 0, 4, false);
                this.zzd.zzl(14);
                int zzd = this.zzd.zzd(13);
                if (zzd <= 6) {
                    i13++;
                    zzacsVar.zzj();
                    zzacgVar2.zzl(i13, false);
                } else {
                    zzacgVar2.zzl(zzd - 6, false);
                    i12 += zzd;
                }
            }
            i11 = 0;
            i12 = 0;
        } while (i13 - i10 < 8192);
        return false;
    }

    public zzamh(int i10) {
        this.zza = new zzami(true, null, 0);
        this.zzb = new zzed(2048);
        this.zzg = -1L;
        zzed zzedVar = new zzed(10);
        this.zzc = zzedVar;
        byte[] zzN = zzedVar.zzN();
        this.zzd = new zzec(zzN, zzN.length);
    }
}
