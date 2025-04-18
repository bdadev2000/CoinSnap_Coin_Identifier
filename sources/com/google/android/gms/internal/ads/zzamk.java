package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class zzamk implements zzamm {
    private final zzed zza;

    @Nullable
    private final String zzc;
    private final int zzd;
    private String zze;
    private zzadx zzf;
    private int zzh;
    private int zzi;
    private long zzj;
    private zzad zzk;
    private int zzl;
    private int zzm;
    private int zzg = 0;
    private long zzp = C.TIME_UNSET;
    private final AtomicInteger zzb = new AtomicInteger();
    private int zzn = -1;
    private int zzo = -1;

    public zzamk(@Nullable String str, int i10, int i11) {
        this.zza = new zzed(new byte[i11]);
        this.zzc = str;
        this.zzd = i10;
    }

    private final void zzf(zzaco zzacoVar) {
        int i10;
        zzab zzb;
        int i11 = zzacoVar.zzb;
        if (i11 != -2147483647 && (i10 = zzacoVar.zzc) != -1) {
            zzad zzadVar = this.zzk;
            if (zzadVar == null || i10 != zzadVar.zzC || i11 != zzadVar.zzD || !Objects.equals(zzacoVar.zza, zzadVar.zzo)) {
                zzad zzadVar2 = this.zzk;
                if (zzadVar2 == null) {
                    zzb = new zzab();
                } else {
                    zzb = zzadVar2.zzb();
                }
                zzb.zzL(this.zze);
                zzb.zzZ(zzacoVar.zza);
                zzb.zzz(zzacoVar.zzc);
                zzb.zzaa(zzacoVar.zzb);
                zzb.zzP(this.zzc);
                zzb.zzX(this.zzd);
                zzad zzaf = zzb.zzaf();
                this.zzk = zzaf;
                this.zzf.zzl(zzaf);
            }
        }
    }

    private final boolean zzg(zzed zzedVar, byte[] bArr, int i10) {
        int min = Math.min(zzedVar.zzb(), i10 - this.zzh);
        zzedVar.zzH(bArr, this.zzh, min);
        int i11 = this.zzh + min;
        this.zzh = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d9  */
    @Override // com.google.android.gms.internal.ads.zzamm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzed r17) throws com.google.android.gms.internal.ads.zzbh {
        /*
            Method dump skipped, instructions count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamk.zza(com.google.android.gms.internal.ads.zzed):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzb(zzacu zzacuVar, zzaoa zzaoaVar) {
        zzaoaVar.zzc();
        this.zze = zzaoaVar.zzb();
        this.zzf = zzacuVar.zzw(zzaoaVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzc(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzd(long j3, int i10) {
        this.zzp = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zze() {
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zzp = C.TIME_UNSET;
        this.zzb.set(0);
    }
}
