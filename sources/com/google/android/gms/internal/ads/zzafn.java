package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzafn implements zzadu {
    private final zzfu zza;
    private final zzafm zzb;
    private final zzalt zzc;
    private int zzd;
    private zzadx zze;
    private zzafo zzf;
    private long zzg;
    private zzafq[] zzh;
    private long zzi;

    @Nullable
    private zzafq zzj;
    private int zzk;
    private long zzl;
    private long zzm;
    private int zzn;
    private boolean zzo;

    @Deprecated
    public zzafn() {
        this(1, zzalt.zza);
    }

    @Nullable
    private final zzafq zzg(int i9) {
        for (zzafq zzafqVar : this.zzh) {
            if (zzafqVar.zzg(i9)) {
                return zzafqVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // com.google.android.gms.internal.ads.zzadu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzadv r28, com.google.android.gms.internal.ads.zzaeq r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 957
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafn.zzb(com.google.android.gms.internal.ads.zzadv, com.google.android.gms.internal.ads.zzaeq):int");
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzd(zzadx zzadxVar) {
        this.zzd = 0;
        this.zze = zzadxVar;
        this.zzi = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zze(long j7, long j9) {
        this.zzi = -1L;
        this.zzj = null;
        int i9 = 0;
        for (zzafq zzafqVar : this.zzh) {
            zzafqVar.zzf(j7);
        }
        if (j7 == 0) {
            if (this.zzh.length != 0) {
                i9 = 3;
            }
            this.zzd = i9;
            return;
        }
        this.zzd = 6;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzf(zzadv zzadvVar) throws IOException {
        ((zzadi) zzadvVar).zzm(this.zza.zzM(), 0, 12, false);
        this.zza.zzK(0);
        if (this.zza.zzi() != 1179011410) {
            return false;
        }
        this.zza.zzL(4);
        if (this.zza.zzi() != 541677121) {
            return false;
        }
        return true;
    }

    public zzafn(int i9, zzalt zzaltVar) {
        this.zzc = zzaltVar;
        this.zza = new zzfu(12);
        this.zzb = new zzafm(null);
        this.zze = new zzads();
        this.zzh = new zzafq[0];
        this.zzl = -1L;
        this.zzm = -1L;
        this.zzk = -1;
        this.zzg = C.TIME_UNSET;
    }
}
