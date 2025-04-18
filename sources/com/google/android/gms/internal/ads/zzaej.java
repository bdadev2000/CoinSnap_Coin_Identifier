package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzaej implements zzacr {
    private final zzed zza;
    private final zzaeh zzb;
    private final boolean zzc;
    private final zzakg zzd;
    private int zze;
    private zzacu zzf;
    private zzaek zzg;
    private long zzh;
    private zzaem[] zzi;
    private long zzj;

    @Nullable
    private zzaem zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private boolean zzp;

    @Deprecated
    public zzaej() {
        this(1, zzakg.zza);
    }

    @Nullable
    private final zzaem zzg(int i10) {
        for (zzaem zzaemVar : this.zzi) {
            if (zzaemVar.zzf(i10)) {
                return zzaemVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    @Override // com.google.android.gms.internal.ads.zzacr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzacs r28, com.google.android.gms.internal.ads.zzadn r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 934
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaej.zzb(com.google.android.gms.internal.ads.zzacs, com.google.android.gms.internal.ads.zzadn):int");
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
        this.zze = 0;
        if (this.zzc) {
            zzacuVar = new zzakj(zzacuVar, this.zzd);
        }
        this.zzf = zzacuVar;
        this.zzj = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zzf(long j3, long j10) {
        this.zzj = -1L;
        this.zzk = null;
        int i10 = 0;
        for (zzaem zzaemVar : this.zzi) {
            zzaemVar.zze(j3);
        }
        if (j3 == 0) {
            if (this.zzi.length != 0) {
                i10 = 3;
            }
            this.zze = i10;
            return;
        }
        this.zze = 6;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzi(zzacs zzacsVar) throws IOException {
        zzacsVar.zzh(this.zza.zzN(), 0, 12);
        this.zza.zzL(0);
        if (this.zza.zzi() != 1179011410) {
            return false;
        }
        this.zza.zzM(4);
        if (this.zza.zzi() != 541677121) {
            return false;
        }
        return true;
    }

    public zzaej(int i10, zzakg zzakgVar) {
        this.zzd = zzakgVar;
        this.zzc = 1 == (i10 ^ 1);
        this.zza = new zzed(12);
        this.zzb = new zzaeh(null);
        this.zzf = new zzadl();
        this.zzi = new zzaem[0];
        this.zzm = -1L;
        this.zzn = -1L;
        this.zzl = -1;
        this.zzh = C.TIME_UNSET;
    }
}
