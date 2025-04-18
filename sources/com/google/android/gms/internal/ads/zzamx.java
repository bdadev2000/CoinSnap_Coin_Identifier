package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.jacoco.core.runtime.AgentOptions;

/* loaded from: classes2.dex */
public final class zzamx implements zzamz {
    private final zzek zza;

    @Nullable
    private final String zzc;
    private final int zzd;
    private String zze;
    private zzaeh zzf;
    private int zzh;
    private int zzi;
    private long zzj;
    private zzaf zzk;
    private int zzl;
    private int zzm;
    private int zzg = 0;
    private long zzp = -9223372036854775807L;
    private final AtomicInteger zzb = new AtomicInteger();
    private int zzn = -1;
    private int zzo = -1;

    public zzamx(@Nullable String str, int i2, int i3) {
        this.zza = new zzek(new byte[i3]);
        this.zzc = str;
        this.zzd = i2;
    }

    @RequiresNonNull({AgentOptions.OUTPUT})
    private final void zzf(zzacz zzaczVar) {
        int i2;
        int i3 = zzaczVar.zzb;
        if (i3 == -2147483647 || (i2 = zzaczVar.zzc) == -1) {
            return;
        }
        zzaf zzafVar = this.zzk;
        if (zzafVar != null && i2 == zzafVar.zzB && i3 == zzafVar.zzC && Objects.equals(zzaczVar.zza, zzafVar.zzn)) {
            return;
        }
        zzaf zzafVar2 = this.zzk;
        zzad zzadVar = zzafVar2 == null ? new zzad() : zzafVar2.zzb();
        zzadVar.zzL(this.zze);
        zzadVar.zzZ(zzaczVar.zza);
        zzadVar.zzz(zzaczVar.zzc);
        zzadVar.zzaa(zzaczVar.zzb);
        zzadVar.zzP(this.zzc);
        zzadVar.zzX(this.zzd);
        zzaf zzaf = zzadVar.zzaf();
        this.zzk = zzaf;
        this.zzf.zzl(zzaf);
    }

    private final boolean zzg(zzek zzekVar, byte[] bArr, int i2) {
        int min = Math.min(zzekVar.zzb(), i2 - this.zzh);
        zzekVar.zzH(bArr, this.zzh, min);
        int i3 = this.zzh + min;
        this.zzh = i3;
        return i3 == i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01de  */
    @Override // com.google.android.gms.internal.ads.zzamz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzek r17) throws com.google.android.gms.internal.ads.zzbo {
        /*
            Method dump skipped, instructions count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamx.zza(com.google.android.gms.internal.ads.zzek):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(zzade zzadeVar, zzaon zzaonVar) {
        zzaonVar.zzc();
        this.zze = zzaonVar.zzb();
        this.zzf = zzadeVar.zzw(zzaonVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzc(boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzd(long j2, int i2) {
        this.zzp = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zze() {
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zzp = -9223372036854775807L;
        this.zzb.set(0);
    }
}
