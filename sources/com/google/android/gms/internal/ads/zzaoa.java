package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class zzaoa implements zzaoc {
    private final zzfu zza;

    @Nullable
    private final String zzc;
    private final int zzd;
    private String zze;
    private zzafa zzf;
    private int zzh;
    private int zzi;
    private long zzj;
    private zzan zzk;
    private int zzl;
    private int zzm;
    private int zzg = 0;
    private long zzp = C.TIME_UNSET;
    private final AtomicInteger zzb = new AtomicInteger();
    private int zzn = -1;
    private int zzo = -1;

    public zzaoa(@Nullable String str, int i9, int i10) {
        this.zza = new zzfu(new byte[i10]);
        this.zzc = str;
        this.zzd = i9;
    }

    private final void zzf(zzadq zzadqVar) {
        int i9;
        zzal zzb;
        int i10 = zzadqVar.zzb;
        if (i10 != -2147483647 && (i9 = zzadqVar.zzc) != -1) {
            zzan zzanVar = this.zzk;
            if (zzanVar == null || i9 != zzanVar.zzA || i10 != zzanVar.zzB || !zzgd.zzG(zzadqVar.zza, zzanVar.zzn)) {
                zzan zzanVar2 = this.zzk;
                if (zzanVar2 == null) {
                    zzb = new zzal();
                } else {
                    zzb = zzanVar2.zzb();
                }
                zzb.zzK(this.zze);
                zzb.zzX(zzadqVar.zza);
                zzb.zzy(zzadqVar.zzc);
                zzb.zzY(zzadqVar.zzb);
                zzb.zzO(this.zzc);
                zzb.zzV(this.zzd);
                zzan zzad = zzb.zzad();
                this.zzk = zzad;
                this.zzf.zzl(zzad);
            }
        }
    }

    private final boolean zzg(zzfu zzfuVar, byte[] bArr, int i9) {
        int min = Math.min(zzfuVar.zzb(), i9 - this.zzh);
        zzfuVar.zzG(bArr, this.zzh, min);
        int i10 = this.zzh + min;
        this.zzh = i10;
        if (i10 == i9) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01de  */
    @Override // com.google.android.gms.internal.ads.zzaoc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzfu r17) throws com.google.android.gms.internal.ads.zzch {
        /*
            Method dump skipped, instructions count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaoa.zza(com.google.android.gms.internal.ads.zzfu):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzb(zzadx zzadxVar, zzapo zzapoVar) {
        zzapoVar.zzc();
        this.zze = zzapoVar.zzb();
        this.zzf = zzadxVar.zzw(zzapoVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzd(long j7, int i9) {
        this.zzp = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zze() {
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zzp = C.TIME_UNSET;
        this.zzb.set(0);
    }
}
