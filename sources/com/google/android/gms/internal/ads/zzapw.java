package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzapw implements zzadu {
    public static final zzaea zza = new zzaea() { // from class: com.google.android.gms.internal.ads.zzaps
        @Override // com.google.android.gms.internal.ads.zzaea
        public final /* synthetic */ zzadu[] zza(Uri uri, Map map) {
            return new zzadu[]{new zzapw()};
        }
    };
    private zzadx zzb;
    private zzafa zzc;
    private zzapu zzf;
    private int zzd = 0;
    private long zze = -1;
    private int zzg = -1;
    private long zzh = -1;

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00df, code lost:
    
        if (r1 != 65534) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e6, code lost:
    
        if (r2 == 32) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0103  */
    @Override // com.google.android.gms.internal.ads.zzadu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzadv r19, com.google.android.gms.internal.ads.zzaeq r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapw.zzb(com.google.android.gms.internal.ads.zzadv, com.google.android.gms.internal.ads.zzaeq):int");
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzd(zzadx zzadxVar) {
        this.zzb = zzadxVar;
        this.zzc = zzadxVar.zzw(0, 1);
        zzadxVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zze(long j7, long j9) {
        int i9;
        if (j7 == 0) {
            i9 = 0;
        } else {
            i9 = 4;
        }
        this.zzd = i9;
        zzapu zzapuVar = this.zzf;
        if (zzapuVar != null) {
            zzapuVar.zzb(j9);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzf(zzadv zzadvVar) throws IOException {
        return zzapz.zzc(zzadvVar);
    }
}
