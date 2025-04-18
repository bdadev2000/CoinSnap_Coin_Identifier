package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public final class zzaig implements zzadb {
    private final zzek zza;
    private final zzadt zzb;
    private final zzadp zzc;
    private final zzadr zzd;
    private final zzaeh zze;
    private zzade zzf;
    private zzaeh zzg;
    private zzaeh zzh;
    private int zzi;

    @Nullable
    private zzbk zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private int zzn;
    private zzaii zzo;
    private boolean zzp;

    public zzaig() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00a8  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzg(com.google.android.gms.internal.ads.zzadc r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 758
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaig.zzg(com.google.android.gms.internal.ads.zzadc):int");
    }

    private final long zzh(long j2) {
        zzadt zzadtVar = this.zzb;
        return ((j2 * 1000000) / zzadtVar.zzd) + this.zzk;
    }

    private static boolean zzj(int i2, long j2) {
        return ((long) (i2 & (-128000))) == (j2 & (-128000));
    }

    private final boolean zzk(zzadc zzadcVar) throws IOException {
        zzaii zzaiiVar = this.zzo;
        if (zzaiiVar != null) {
            long zzd = zzaiiVar.zzd();
            if (zzd != -1 && zzadcVar.zze() > zzd - 4) {
                return true;
            }
        }
        try {
            return !zzadcVar.zzm(this.zza.zzN(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzl(zzadc zzadcVar, boolean z2) throws IOException {
        int i2;
        int i3;
        int zzb;
        zzadcVar.zzj();
        if (zzadcVar.zzf() == 0) {
            zzbk zza = this.zzd.zza(zzadcVar, null);
            this.zzj = zza;
            if (zza != null) {
                this.zzc.zzb(zza);
            }
            i2 = (int) zzadcVar.zze();
            if (!z2) {
                zzadcVar.zzk(i2);
            }
            i3 = 0;
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i4 = i3;
        int i5 = i4;
        while (true) {
            if (!zzk(zzadcVar)) {
                this.zza.zzL(0);
                int zzg = this.zza.zzg();
                if ((i3 == 0 || zzj(zzg, i3)) && (zzb = zzadu.zzb(zzg)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.zzb.zza(zzg);
                        i3 = zzg;
                    }
                    zzadcVar.zzg(zzb - 4);
                } else {
                    int i6 = i5 + 1;
                    if (i5 == (true != z2 ? Opcodes.ACC_DEPRECATED : 32768)) {
                        if (z2) {
                            return false;
                        }
                        throw zzbo.zza("Searched too many bytes.", null);
                    }
                    if (z2) {
                        zzadcVar.zzj();
                        zzadcVar.zzg(i2 + i6);
                    } else {
                        zzadcVar.zzk(1);
                    }
                    i3 = 0;
                    i5 = i6;
                    i4 = 0;
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
        if (z2) {
            zzadcVar.zzk(i2 + i5);
        } else {
            zzadcVar.zzj();
        }
        this.zzi = i3;
        return true;
    }

    public final void zza() {
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final int zzb(zzadc zzadcVar, zzadx zzadxVar) throws IOException {
        zzdi.zzb(this.zzg);
        int i2 = zzeu.zza;
        int zzg = zzg(zzadcVar);
        if (zzg == -1 && (this.zzo instanceof zzaie)) {
            if (this.zzo.zza() != zzh(this.zzl)) {
                throw null;
            }
        }
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final /* synthetic */ zzadb zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final /* synthetic */ List zzd() {
        return zzgax.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zze(zzade zzadeVar) {
        this.zzf = zzadeVar;
        zzaeh zzw = zzadeVar.zzw(0, 1);
        this.zzg = zzw;
        this.zzh = zzw;
        this.zzf.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzf(long j2, long j3) {
        this.zzi = 0;
        this.zzk = -9223372036854775807L;
        this.zzl = 0L;
        this.zzn = 0;
        zzaii zzaiiVar = this.zzo;
        if (zzaiiVar instanceof zzaie) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final boolean zzi(zzadc zzadcVar) throws IOException {
        return zzl(zzadcVar, true);
    }

    public zzaig(int i2) {
        this.zza = new zzek(10);
        this.zzb = new zzadt();
        this.zzc = new zzadp();
        this.zzk = -9223372036854775807L;
        this.zzd = new zzadr();
        zzacw zzacwVar = new zzacw();
        this.zze = zzacwVar;
        this.zzh = zzacwVar;
    }
}
