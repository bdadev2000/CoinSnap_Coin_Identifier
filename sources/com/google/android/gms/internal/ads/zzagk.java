package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
final class zzagk implements zzadu {
    private zzadx zzb;
    private int zzc;
    private int zzd;
    private int zze;

    @Nullable
    private zzaie zzg;
    private zzadv zzh;
    private zzagn zzi;

    @Nullable
    private zzakj zzj;
    private final zzfu zza = new zzfu(6);
    private long zzf = -1;

    private final int zza(zzadv zzadvVar) throws IOException {
        this.zza.zzH(2);
        ((zzadi) zzadvVar).zzm(this.zza.zzM(), 0, 2, false);
        return this.zza.zzq();
    }

    private final void zzg() {
        zzadx zzadxVar = this.zzb;
        zzadxVar.getClass();
        zzadxVar.zzD();
        this.zzb.zzO(new zzaes(C.TIME_UNSET, 0L));
        this.zzc = 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x018b  */
    @Override // com.google.android.gms.internal.ads.zzadu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzadv r24, com.google.android.gms.internal.ads.zzaeq r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagk.zzb(com.google.android.gms.internal.ads.zzadv, com.google.android.gms.internal.ads.zzaeq):int");
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzd(zzadx zzadxVar) {
        this.zzb = zzadxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zze(long j7, long j9) {
        if (j7 == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzakj zzakjVar = this.zzj;
            zzakjVar.getClass();
            zzakjVar.zze(j7, j9);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzf(zzadv zzadvVar) throws IOException {
        if (zza(zzadvVar) != 65496) {
            return false;
        }
        int zza = zza(zzadvVar);
        this.zzd = zza;
        if (zza == 65504) {
            this.zza.zzH(2);
            zzadi zzadiVar = (zzadi) zzadvVar;
            zzadiVar.zzm(this.zza.zzM(), 0, 2, false);
            zzadiVar.zzl(this.zza.zzq() - 2, false);
            zza = zza(zzadvVar);
            this.zzd = zza;
        }
        if (zza == 65505) {
            zzadi zzadiVar2 = (zzadi) zzadvVar;
            zzadiVar2.zzl(2, false);
            this.zza.zzH(6);
            zzadiVar2.zzm(this.zza.zzM(), 0, 6, false);
            if (this.zza.zzu() == 1165519206 && this.zza.zzq() == 0) {
                return true;
            }
        }
        return false;
    }
}
