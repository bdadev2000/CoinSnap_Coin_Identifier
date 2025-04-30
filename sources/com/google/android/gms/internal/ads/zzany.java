package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.core.view.MotionEventCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzany implements zzaoc {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final zzft zzc = new zzft(new byte[7], 7);
    private final zzfu zzd = new zzfu(Arrays.copyOf(zza, 10));

    @Nullable
    private final String zze;
    private final int zzf;
    private String zzg;
    private zzafa zzh;
    private zzafa zzi;
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
    private zzafa zzv;
    private long zzw;

    public zzany(boolean z8, @Nullable String str, int i9) {
        zzh();
        this.zzo = -1;
        this.zzp = -1;
        this.zzs = C.TIME_UNSET;
        this.zzu = C.TIME_UNSET;
        this.zzb = z8;
        this.zze = str;
        this.zzf = i9;
    }

    public static boolean zzf(int i9) {
        return (i9 & 65526) == 65520;
    }

    private final void zzg() {
        this.zzn = false;
        zzh();
    }

    private final void zzh() {
        this.zzj = 0;
        this.zzk = 0;
        this.zzl = NotificationCompat.FLAG_LOCAL_ONLY;
    }

    private final void zzi() {
        this.zzj = 3;
        this.zzk = 0;
    }

    private final void zzj(zzafa zzafaVar, long j7, int i9, int i10) {
        this.zzj = 4;
        this.zzk = i9;
        this.zzv = zzafaVar;
        this.zzw = j7;
        this.zzt = i10;
    }

    private final boolean zzk(zzfu zzfuVar, byte[] bArr, int i9) {
        int min = Math.min(zzfuVar.zzb(), i9 - this.zzk);
        zzfuVar.zzG(bArr, this.zzk, min);
        int i10 = this.zzk + min;
        this.zzk = i10;
        if (i10 == i9) {
            return true;
        }
        return false;
    }

    private static final boolean zzl(byte b, byte b8) {
        return zzf((b8 & 255) | MotionEventCompat.ACTION_POINTER_INDEX_MASK);
    }

    private static final boolean zzm(zzfu zzfuVar, byte[] bArr, int i9) {
        if (zzfuVar.zzb() < i9) {
            return false;
        }
        zzfuVar.zzG(bArr, 0, i9);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02d2 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzaoc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzfu r21) throws com.google.android.gms.internal.ads.zzch {
        /*
            Method dump skipped, instructions count: 745
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzany.zza(com.google.android.gms.internal.ads.zzfu):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzb(zzadx zzadxVar, zzapo zzapoVar) {
        zzapoVar.zzc();
        this.zzg = zzapoVar.zzb();
        zzafa zzw = zzadxVar.zzw(zzapoVar.zza(), 1);
        this.zzh = zzw;
        this.zzv = zzw;
        if (this.zzb) {
            zzapoVar.zzc();
            zzafa zzw2 = zzadxVar.zzw(zzapoVar.zza(), 5);
            this.zzi = zzw2;
            zzal zzalVar = new zzal();
            zzalVar.zzK(zzapoVar.zzb());
            zzalVar.zzX(MimeTypes.APPLICATION_ID3);
            zzw2.zzl(zzalVar.zzad());
            return;
        }
        this.zzi = new zzadt();
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzd(long j7, int i9) {
        this.zzu = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zze() {
        this.zzu = C.TIME_UNSET;
        zzg();
    }
}
