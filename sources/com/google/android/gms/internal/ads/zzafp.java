package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
final class zzafp implements zzadb {
    private zzade zzb;
    private int zzc;
    private int zzd;
    private int zze;

    @Nullable
    private zzahj zzg;
    private zzadc zzh;
    private zzafs zzi;

    @Nullable
    private zzajl zzj;
    private final zzek zza = new zzek(6);
    private long zzf = -1;

    private final int zza(zzadc zzadcVar) throws IOException {
        this.zza.zzI(2);
        ((zzacq) zzadcVar).zzm(this.zza.zzN(), 0, 2, false);
        return this.zza.zzq();
    }

    private final void zzg() {
        zzade zzadeVar = this.zzb;
        zzadeVar.getClass();
        zzadeVar.zzD();
        this.zzb.zzO(new zzadz(-9223372036854775807L, 0L));
        this.zzc = 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0184  */
    @Override // com.google.android.gms.internal.ads.zzadb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzadc r24, com.google.android.gms.internal.ads.zzadx r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafp.zzb(com.google.android.gms.internal.ads.zzadc, com.google.android.gms.internal.ads.zzadx):int");
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
        this.zzb = zzadeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzf(long j2, long j3) {
        if (j2 == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzajl zzajlVar = this.zzj;
            zzajlVar.getClass();
            zzajlVar.zzf(j2, j3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final boolean zzi(zzadc zzadcVar) throws IOException {
        if (zza(zzadcVar) != 65496) {
            return false;
        }
        int zza = zza(zzadcVar);
        this.zzd = zza;
        if (zza == 65504) {
            this.zza.zzI(2);
            zzacq zzacqVar = (zzacq) zzadcVar;
            zzacqVar.zzm(this.zza.zzN(), 0, 2, false);
            zzacqVar.zzl(this.zza.zzq() - 2, false);
            zza = zza(zzadcVar);
            this.zzd = zza;
        }
        if (zza == 65505) {
            zzacq zzacqVar2 = (zzacq) zzadcVar;
            zzacqVar2.zzl(2, false);
            this.zza.zzI(6);
            zzacqVar2.zzm(this.zza.zzN(), 0, 6, false);
            if (this.zza.zzu() == 1165519206 && this.zza.zzq() == 0) {
                return true;
            }
        }
        return false;
    }
}
