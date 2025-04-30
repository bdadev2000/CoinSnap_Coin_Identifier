package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzanx implements zzadu {
    public static final zzaea zza = new zzaea() { // from class: com.google.android.gms.internal.ads.zzanw
        @Override // com.google.android.gms.internal.ads.zzaea
        public final /* synthetic */ zzadu[] zza(Uri uri, Map map) {
            return new zzadu[]{new zzanx(0)};
        }
    };
    private final zzany zzb;
    private final zzfu zzc;
    private final zzfu zzd;
    private final zzft zze;
    private zzadx zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;

    public zzanx() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final int zzb(zzadv zzadvVar, zzaeq zzaeqVar) throws IOException {
        zzeq.zzb(this.zzf);
        int zza2 = zzadvVar.zza(this.zzc.zzM(), 0, 2048);
        if (!this.zzj) {
            this.zzf.zzO(new zzaes(C.TIME_UNSET, 0L));
            this.zzj = true;
        }
        if (zza2 == -1) {
            return -1;
        }
        this.zzc.zzK(0);
        this.zzc.zzJ(zza2);
        if (!this.zzi) {
            this.zzb.zzd(this.zzg, 4);
            this.zzi = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzd(zzadx zzadxVar) {
        this.zzf = zzadxVar;
        this.zzb.zzb(zzadxVar, new zzapo(Integer.MIN_VALUE, 0, 1));
        zzadxVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zze(long j7, long j9) {
        this.zzi = false;
        this.zzb.zze();
        this.zzg = j9;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzf(zzadv zzadvVar) throws IOException {
        int i9 = 0;
        while (true) {
            zzadi zzadiVar = (zzadi) zzadvVar;
            zzadiVar.zzm(this.zzd.zzM(), 0, 10, false);
            this.zzd.zzK(0);
            if (this.zzd.zzo() != 4801587) {
                break;
            }
            this.zzd.zzL(3);
            int zzl = this.zzd.zzl();
            i9 += zzl + 10;
            zzadiVar.zzl(zzl, false);
        }
        zzadvVar.zzj();
        zzadi zzadiVar2 = (zzadi) zzadvVar;
        zzadiVar2.zzl(i9, false);
        if (this.zzh == -1) {
            this.zzh = i9;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = i9;
        do {
            zzadiVar2.zzm(this.zzd.zzM(), 0, 2, false);
            this.zzd.zzK(0);
            if (!zzany.zzf(this.zzd.zzq())) {
                i12++;
                zzadvVar.zzj();
                zzadiVar2.zzl(i12, false);
            } else {
                i10++;
                if (i10 >= 4 && i11 > 188) {
                    return true;
                }
                zzadiVar2.zzm(this.zzd.zzM(), 0, 4, false);
                this.zze.zzk(14);
                int zzd = this.zze.zzd(13);
                if (zzd <= 6) {
                    i12++;
                    zzadvVar.zzj();
                    zzadiVar2.zzl(i12, false);
                } else {
                    zzadiVar2.zzl(zzd - 6, false);
                    i11 += zzd;
                }
            }
            i10 = 0;
            i11 = 0;
        } while (i12 - i9 < 8192);
        return false;
    }

    public zzanx(int i9) {
        this.zzb = new zzany(true, null, 0);
        this.zzc = new zzfu(2048);
        this.zzh = -1L;
        zzfu zzfuVar = new zzfu(10);
        this.zzd = zzfuVar;
        byte[] zzM = zzfuVar.zzM();
        this.zze = new zzft(zzM, zzM.length);
    }
}
