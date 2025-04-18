package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class zzaet implements zzadb {
    private final zzek zza;
    private final zzaes zzb;
    private final boolean zzc;
    private final zzakt zzd;
    private int zze;
    private zzade zzf;
    private zzaeu zzg;
    private long zzh;
    private zzaew[] zzi;
    private long zzj;

    @Nullable
    private zzaew zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private boolean zzp;

    @Deprecated
    public zzaet() {
        this(1, zzakt.zza);
    }

    @Nullable
    private final zzaew zzg(int i2) {
        for (zzaew zzaewVar : this.zzi) {
            if (zzaewVar.zzf(i2)) {
                return zzaewVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    @Override // com.google.android.gms.internal.ads.zzadb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzadc r28, com.google.android.gms.internal.ads.zzadx r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 931
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaet.zzb(com.google.android.gms.internal.ads.zzadc, com.google.android.gms.internal.ads.zzadx):int");
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
        this.zze = 0;
        if (this.zzc) {
            zzadeVar = new zzakw(zzadeVar, this.zzd);
        }
        this.zzf = zzadeVar;
        this.zzj = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzf(long j2, long j3) {
        this.zzj = -1L;
        this.zzk = null;
        for (zzaew zzaewVar : this.zzi) {
            zzaewVar.zze(j2);
        }
        if (j2 == 0) {
            this.zze = this.zzi.length != 0 ? 3 : 0;
        } else {
            this.zze = 6;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final boolean zzi(zzadc zzadcVar) throws IOException {
        zzadcVar.zzh(this.zza.zzN(), 0, 12);
        this.zza.zzL(0);
        if (this.zza.zzi() != 1179011410) {
            return false;
        }
        this.zza.zzM(4);
        return this.zza.zzi() == 541677121;
    }

    public zzaet(int i2, zzakt zzaktVar) {
        this.zzd = zzaktVar;
        this.zzc = 1 == (i2 ^ 1);
        this.zza = new zzek(12);
        this.zzb = new zzaes(null);
        this.zzf = new zzadv();
        this.zzi = new zzaew[0];
        this.zzm = -1L;
        this.zzn = -1L;
        this.zzl = -1;
        this.zzh = -9223372036854775807L;
    }
}
