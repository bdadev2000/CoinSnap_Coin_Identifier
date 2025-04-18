package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzamv implements zzamz {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final zzej zzc = new zzej(new byte[7], 7);
    private final zzek zzd = new zzek(Arrays.copyOf(zza, 10));

    @Nullable
    private final String zze;
    private final int zzf;
    private String zzg;
    private zzaeh zzh;
    private zzaeh zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private long zzs;
    private int zzt;
    private long zzu;
    private zzaeh zzv;
    private long zzw;

    public zzamv(boolean z2, @Nullable String str, int i2) {
        zzh();
        this.zzo = -1;
        this.zzp = -1;
        this.zzs = -9223372036854775807L;
        this.zzu = -9223372036854775807L;
        this.zzb = z2;
        this.zze = str;
        this.zzf = i2;
    }

    public static boolean zzf(int i2) {
        return (i2 & 65526) == 65520;
    }

    private final void zzg() {
        this.zzn = false;
        zzh();
    }

    private final void zzh() {
        this.zzj = 0;
        this.zzk = 0;
        this.zzl = 256;
    }

    private final void zzi() {
        this.zzj = 3;
        this.zzk = 0;
    }

    private final void zzj(zzaeh zzaehVar, long j2, int i2, int i3) {
        this.zzj = 4;
        this.zzk = i2;
        this.zzv = zzaehVar;
        this.zzw = j2;
        this.zzt = i3;
    }

    private final boolean zzk(zzek zzekVar, byte[] bArr, int i2) {
        int min = Math.min(zzekVar.zzb(), i2 - this.zzk);
        zzekVar.zzH(bArr, this.zzk, min);
        int i3 = this.zzk + min;
        this.zzk = i3;
        return i3 == i2;
    }

    private static final boolean zzl(byte b2, byte b3) {
        return zzf((b3 & UnsignedBytes.MAX_VALUE) | 65280);
    }

    private static final boolean zzm(zzek zzekVar, byte[] bArr, int i2) {
        if (zzekVar.zzb() < i2) {
            return false;
        }
        zzekVar.zzH(bArr, 0, i2);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02c9 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzamz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzek r18) throws com.google.android.gms.internal.ads.zzbo {
        /*
            Method dump skipped, instructions count: 734
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamv.zza(com.google.android.gms.internal.ads.zzek):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(zzade zzadeVar, zzaon zzaonVar) {
        zzaonVar.zzc();
        this.zzg = zzaonVar.zzb();
        zzaeh zzw = zzadeVar.zzw(zzaonVar.zza(), 1);
        this.zzh = zzw;
        this.zzv = zzw;
        if (!this.zzb) {
            this.zzi = new zzacw();
            return;
        }
        zzaonVar.zzc();
        zzaeh zzw2 = zzadeVar.zzw(zzaonVar.zza(), 5);
        this.zzi = zzw2;
        zzad zzadVar = new zzad();
        zzadVar.zzL(zzaonVar.zzb());
        zzadVar.zzZ("application/id3");
        zzw2.zzl(zzadVar.zzaf());
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzc(boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzd(long j2, int i2) {
        this.zzu = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zze() {
        this.zzu = -9223372036854775807L;
        zzg();
    }
}
