package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import kotlin.UByte;

/* loaded from: classes3.dex */
public final class zzanm implements zzacr {
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private long zzh;

    @Nullable
    private zzanj zzi;
    private zzacu zzj;
    private boolean zzk;
    private final zzek zza = new zzek(0);
    private final zzed zzc = new zzed(4096);
    private final SparseArray zzb = new SparseArray();
    private final zzank zzd = new zzank();

    /* JADX WARN: Removed duplicated region for block: B:54:0x0149  */
    @Override // com.google.android.gms.internal.ads.zzacr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzacs r17, com.google.android.gms.internal.ads.zzadn r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanm.zzb(com.google.android.gms.internal.ads.zzacs, com.google.android.gms.internal.ads.zzadn):int");
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
        this.zzj = zzacuVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r0 != r7) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[LOOP:0: B:13:0x002c->B:15:0x0034, LOOP_END] */
    @Override // com.google.android.gms.internal.ads.zzacr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(long r5, long r7) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzek r5 = r4.zza
            long r0 = r5.zzf()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L21
            long r0 = r5.zzd()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L24
        L21:
            r5.zzi(r7)
        L24:
            com.google.android.gms.internal.ads.zzanj r5 = r4.zzi
            r6 = 0
            if (r5 == 0) goto L2c
            r5.zzd(r7)
        L2c:
            android.util.SparseArray r5 = r4.zzb
            int r5 = r5.size()
            if (r6 >= r5) goto L42
            android.util.SparseArray r5 = r4.zzb
            java.lang.Object r5 = r5.valueAt(r6)
            com.google.android.gms.internal.ads.zzanl r5 = (com.google.android.gms.internal.ads.zzanl) r5
            r5.zzb()
            int r6 = r6 + 1
            goto L2c
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanm.zzf(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzi(zzacs zzacsVar) throws IOException {
        byte[] bArr = new byte[14];
        zzacg zzacgVar = (zzacg) zzacsVar;
        zzacgVar.zzm(bArr, 0, 14, false);
        if ((((bArr[0] & UByte.MAX_VALUE) << 24) | ((bArr[1] & UByte.MAX_VALUE) << 16) | ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        zzacgVar.zzl(bArr[13] & 7, false);
        zzacgVar.zzm(bArr, 0, 3, false);
        if ((((bArr[0] & UByte.MAX_VALUE) << 16) | ((bArr[1] & UByte.MAX_VALUE) << 8) | (bArr[2] & UByte.MAX_VALUE)) != 1) {
            return false;
        }
        return true;
    }
}
