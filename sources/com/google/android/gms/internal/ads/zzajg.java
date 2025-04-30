package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzajg implements zzadu {
    public static final zzaea zza = new zzaea() { // from class: com.google.android.gms.internal.ads.zzaje
        @Override // com.google.android.gms.internal.ads.zzaea
        public final /* synthetic */ zzadu[] zza(Uri uri, Map map) {
            return new zzadu[]{new zzajg(0)};
        }
    };
    private static final zzaho zzb = new zzaho() { // from class: com.google.android.gms.internal.ads.zzajf
    };
    private final zzfu zzc;
    private final zzaen zzd;
    private final zzaej zze;
    private final zzael zzf;
    private final zzafa zzg;
    private zzadx zzh;
    private zzafa zzi;
    private zzafa zzj;
    private int zzk;

    @Nullable
    private zzcd zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzaji zzq;
    private boolean zzr;

    public zzajg() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzg(com.google.android.gms.internal.ads.zzadv r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajg.zzg(com.google.android.gms.internal.ads.zzadv):int");
    }

    private final long zzh(long j7) {
        zzaen zzaenVar = this.zzd;
        return ((j7 * 1000000) / zzaenVar.zzd) + this.zzm;
    }

    private final zzaji zzi(zzadv zzadvVar, long j7, boolean z8) throws IOException {
        ((zzadi) zzadvVar).zzm(this.zzc.zzM(), 0, 4, false);
        this.zzc.zzK(0);
        this.zzd.zza(this.zzc.zzg());
        if (zzadvVar.zzd() != -1) {
            j7 = zzadvVar.zzd();
        }
        return new zzajb(j7, zzadvVar.zzf(), this.zzd, false);
    }

    private static boolean zzj(int i9, long j7) {
        return ((long) (i9 & (-128000))) == (j7 & (-128000));
    }

    private final boolean zzk(zzadv zzadvVar) throws IOException {
        zzaji zzajiVar = this.zzq;
        if (zzajiVar != null) {
            long zzd = zzajiVar.zzd();
            if (zzd != -1 && zzadvVar.zze() > zzd - 4) {
                return true;
            }
        }
        try {
            if (!zzadvVar.zzm(this.zzc.zzM(), 0, 4, true)) {
                return true;
            }
            return false;
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzl(zzadv zzadvVar, boolean z8) throws IOException {
        int i9;
        int i10;
        int zzb2;
        int i11;
        zzadvVar.zzj();
        if (zzadvVar.zzf() == 0) {
            zzcd zza2 = this.zzf.zza(zzadvVar, null);
            this.zzl = zza2;
            if (zza2 != null) {
                this.zze.zzb(zza2);
            }
            i9 = (int) zzadvVar.zze();
            if (!z8) {
                ((zzadi) zzadvVar).zzo(i9, false);
            }
            i10 = 0;
        } else {
            i9 = 0;
            i10 = 0;
        }
        int i12 = i10;
        int i13 = i12;
        while (true) {
            if (zzk(zzadvVar)) {
                if (i12 <= 0) {
                    throw new EOFException();
                }
            } else {
                this.zzc.zzK(0);
                int zzg = this.zzc.zzg();
                if ((i10 != 0 && !zzj(zzg, i10)) || (zzb2 = zzaeo.zzb(zzg)) == -1) {
                    if (true != z8) {
                        i11 = 131072;
                    } else {
                        i11 = 32768;
                    }
                    int i14 = i13 + 1;
                    if (i13 == i11) {
                        if (z8) {
                            return false;
                        }
                        throw zzch.zza("Searched too many bytes.", null);
                    }
                    if (z8) {
                        zzadvVar.zzj();
                        ((zzadi) zzadvVar).zzl(i9 + i14, false);
                    } else {
                        ((zzadi) zzadvVar).zzo(1, false);
                    }
                    i10 = 0;
                    i13 = i14;
                    i12 = 0;
                } else {
                    i12++;
                    if (i12 == 1) {
                        this.zzd.zza(zzg);
                        i10 = zzg;
                    } else if (i12 == 4) {
                        break;
                    }
                    ((zzadi) zzadvVar).zzl(zzb2 - 4, false);
                }
            }
        }
        if (z8) {
            ((zzadi) zzadvVar).zzo(i9 + i13, false);
        } else {
            zzadvVar.zzj();
        }
        this.zzk = i10;
        return true;
    }

    public final void zza() {
        this.zzr = true;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final int zzb(zzadv zzadvVar, zzaeq zzaeqVar) throws IOException {
        zzeq.zzb(this.zzi);
        int i9 = zzgd.zza;
        int zzg = zzg(zzadvVar);
        if (zzg == -1 && (this.zzq instanceof zzajc)) {
            if (this.zzq.zza() != zzh(this.zzn)) {
                throw null;
            }
        }
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzd(zzadx zzadxVar) {
        this.zzh = zzadxVar;
        zzafa zzw = zzadxVar.zzw(0, 1);
        this.zzi = zzw;
        this.zzj = zzw;
        this.zzh.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zze(long j7, long j9) {
        this.zzk = 0;
        this.zzm = C.TIME_UNSET;
        this.zzn = 0L;
        this.zzp = 0;
        if (!(this.zzq instanceof zzajc)) {
        } else {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzf(zzadv zzadvVar) throws IOException {
        return zzl(zzadvVar, true);
    }

    public zzajg(int i9) {
        this.zzc = new zzfu(10);
        this.zzd = new zzaen();
        this.zze = new zzaej();
        this.zzm = C.TIME_UNSET;
        this.zzf = new zzael();
        zzadt zzadtVar = new zzadt();
        this.zzg = zzadtVar;
        this.zzj = zzadtVar;
    }
}
