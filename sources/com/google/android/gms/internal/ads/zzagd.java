package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzagd implements zzadu {
    public static final zzaea zza = new zzaea() { // from class: com.google.android.gms.internal.ads.zzagc
        @Override // com.google.android.gms.internal.ads.zzaea
        public final /* synthetic */ zzadu[] zza(Uri uri, Map map) {
            return new zzadu[]{new zzagd()};
        }
    };
    private zzadx zzg;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private boolean zzo;
    private zzagb zzp;
    private zzagh zzq;
    private final zzfu zzb = new zzfu(4);
    private final zzfu zzc = new zzfu(9);
    private final zzfu zzd = new zzfu(11);
    private final zzfu zze = new zzfu();
    private final zzage zzf = new zzage();
    private int zzh = 1;

    private final zzfu zza(zzadv zzadvVar) throws IOException {
        if (this.zzm > this.zze.zzc()) {
            zzfu zzfuVar = this.zze;
            int zzc = zzfuVar.zzc();
            zzfuVar.zzI(new byte[Math.max(zzc + zzc, this.zzm)], 0);
        } else {
            this.zze.zzK(0);
        }
        this.zze.zzJ(this.zzm);
        ((zzadi) zzadvVar).zzn(this.zze.zzM(), 0, this.zzm, false);
        return this.zze;
    }

    private final void zzg() {
        if (!this.zzo) {
            this.zzg.zzO(new zzaes(C.TIME_UNSET, 0L));
            this.zzo = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzadu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzadv r17, com.google.android.gms.internal.ads.zzaeq r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagd.zzb(com.google.android.gms.internal.ads.zzadv, com.google.android.gms.internal.ads.zzaeq):int");
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzd(zzadx zzadxVar) {
        this.zzg = zzadxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zze(long j7, long j9) {
        if (j7 == 0) {
            this.zzh = 1;
            this.zzi = false;
        } else {
            this.zzh = 3;
        }
        this.zzk = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzf(zzadv zzadvVar) throws IOException {
        zzadi zzadiVar = (zzadi) zzadvVar;
        zzadiVar.zzm(this.zzb.zzM(), 0, 3, false);
        this.zzb.zzK(0);
        if (this.zzb.zzo() != 4607062) {
            return false;
        }
        zzadiVar.zzm(this.zzb.zzM(), 0, 2, false);
        this.zzb.zzK(0);
        if ((this.zzb.zzq() & 250) != 0) {
            return false;
        }
        zzadiVar.zzm(this.zzb.zzM(), 0, 4, false);
        this.zzb.zzK(0);
        int zzg = this.zzb.zzg();
        zzadvVar.zzj();
        zzadi zzadiVar2 = (zzadi) zzadvVar;
        zzadiVar2.zzl(zzg, false);
        zzadiVar2.zzm(this.zzb.zzM(), 0, 4, false);
        this.zzb.zzK(0);
        if (this.zzb.zzg() != 0) {
            return false;
        }
        return true;
    }
}
