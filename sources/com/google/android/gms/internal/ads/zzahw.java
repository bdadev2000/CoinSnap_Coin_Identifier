package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzahw implements zzacr {
    private final zzed zza;
    private final zzadj zzb;
    private final zzadf zzc;
    private final zzadh zzd;
    private final zzadx zze;
    private zzacu zzf;
    private zzadx zzg;
    private zzadx zzh;
    private int zzi;

    @Nullable
    private zzbd zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private zzahy zzp;
    private boolean zzq;

    public zzahw() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzg(com.google.android.gms.internal.ads.zzacs r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahw.zzg(com.google.android.gms.internal.ads.zzacs):int");
    }

    private final long zzh(long j3) {
        zzadj zzadjVar = this.zzb;
        return ((j3 * 1000000) / zzadjVar.zzd) + this.zzk;
    }

    private final void zzj() {
        zzahy zzahyVar = this.zzp;
        if ((zzahyVar instanceof zzaht) && zzahyVar.zzh()) {
            long j3 = this.zzn;
            if (j3 != -1 && j3 != this.zzp.zzd()) {
                zzaht zzf = ((zzaht) this.zzp).zzf(this.zzn);
                this.zzp = zzf;
                zzacu zzacuVar = this.zzf;
                zzacuVar.getClass();
                zzacuVar.zzO(zzf);
            }
        }
    }

    private static boolean zzk(int i10, long j3) {
        return ((long) (i10 & (-128000))) == (j3 & (-128000));
    }

    private final boolean zzl(zzacs zzacsVar) throws IOException {
        zzahy zzahyVar = this.zzp;
        if (zzahyVar != null) {
            long zzd = zzahyVar.zzd();
            if (zzd != -1 && zzacsVar.zze() > zzd - 4) {
                return true;
            }
        }
        try {
            return !zzacsVar.zzm(this.zza.zzN(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzm(zzacs zzacsVar, boolean z10) throws IOException {
        int i10;
        int i11;
        int zzb;
        int i12;
        zzacsVar.zzj();
        if (zzacsVar.zzf() == 0) {
            zzbd zza = this.zzd.zza(zzacsVar, null);
            this.zzj = zza;
            if (zza != null) {
                this.zzc.zzb(zza);
            }
            i10 = (int) zzacsVar.zze();
            if (!z10) {
                zzacsVar.zzk(i10);
            }
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
        }
        int i13 = i11;
        int i14 = i13;
        while (true) {
            if (zzl(zzacsVar)) {
                if (i13 <= 0) {
                    zzj();
                    throw new EOFException();
                }
            } else {
                this.zza.zzL(0);
                int zzg = this.zza.zzg();
                if ((i11 != 0 && !zzk(zzg, i11)) || (zzb = zzadk.zzb(zzg)) == -1) {
                    if (true != z10) {
                        i12 = 131072;
                    } else {
                        i12 = 32768;
                    }
                    int i15 = i14 + 1;
                    if (i14 == i12) {
                        if (z10) {
                            return false;
                        }
                        zzj();
                        throw new EOFException();
                    }
                    if (z10) {
                        zzacsVar.zzj();
                        zzacsVar.zzg(i10 + i15);
                    } else {
                        zzacsVar.zzk(1);
                    }
                    i11 = 0;
                    i14 = i15;
                    i13 = 0;
                } else {
                    i13++;
                    if (i13 == 1) {
                        this.zzb.zza(zzg);
                        i11 = zzg;
                    } else if (i13 == 4) {
                        break;
                    }
                    zzacsVar.zzg(zzb - 4);
                }
            }
        }
        if (z10) {
            zzacsVar.zzk(i10 + i14);
        } else {
            zzacsVar.zzj();
        }
        this.zzi = i11;
        return true;
    }

    public final void zza() {
        this.zzq = true;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final int zzb(zzacs zzacsVar, zzadn zzadnVar) throws IOException {
        zzdb.zzb(this.zzg);
        int i10 = zzen.zza;
        int zzg = zzg(zzacsVar);
        if (zzg == -1 && (this.zzp instanceof zzahu)) {
            if (this.zzp.zza() != zzh(this.zzl)) {
                throw null;
            }
        }
        return zzg;
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
        this.zzf = zzacuVar;
        zzadx zzw = zzacuVar.zzw(0, 1);
        this.zzg = zzw;
        this.zzh = zzw;
        this.zzf.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zzf(long j3, long j10) {
        this.zzi = 0;
        this.zzk = C.TIME_UNSET;
        this.zzl = 0L;
        this.zzo = 0;
        zzahy zzahyVar = this.zzp;
        if (!(zzahyVar instanceof zzahu)) {
            return;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzi(zzacs zzacsVar) throws IOException {
        return zzm(zzacsVar, true);
    }

    public zzahw(int i10) {
        this.zza = new zzed(10);
        this.zzb = new zzadj();
        this.zzc = new zzadf();
        this.zzk = C.TIME_UNSET;
        this.zzd = new zzadh();
        zzacm zzacmVar = new zzacm();
        this.zze = zzacmVar;
        this.zzh = zzacmVar;
        this.zzn = -1L;
    }
}
