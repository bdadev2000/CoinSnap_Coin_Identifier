package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzapk implements zzadu {

    @Deprecated
    public static final zzaea zza = new zzaea() { // from class: com.google.android.gms.internal.ads.zzaph
        @Override // com.google.android.gms.internal.ads.zzaea
        public final /* synthetic */ zzadu[] zza(Uri uri, Map map) {
            return new zzadu[]{new zzapk(1, 1, zzalt.zza, new zzgb(0L), new zzanz(0), 112800)};
        }
    };
    private final List zzb;
    private final zzfu zzc;
    private final SparseIntArray zzd;
    private final zzapn zze;
    private final zzalt zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;
    private final SparseBooleanArray zzi;
    private final zzapg zzj;
    private zzapf zzk;
    private zzadx zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    @Deprecated
    public zzapk() {
        this(1, 1, zzalt.zza, new zzgb(0L), new zzanz(0), 112800);
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0192, code lost:
    
        if (r1 == false) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.zzadu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzadv r19, com.google.android.gms.internal.ads.zzaeq r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapk.zzb(com.google.android.gms.internal.ads.zzadv, com.google.android.gms.internal.ads.zzaeq):int");
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzd(zzadx zzadxVar) {
        this.zzl = zzadxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zze(long j7, long j9) {
        zzapf zzapfVar;
        int size = this.zzb.size();
        for (int i9 = 0; i9 < size; i9++) {
            zzgb zzgbVar = (zzgb) this.zzb.get(i9);
            if (zzgbVar.zzf() != C.TIME_UNSET) {
                long zzd = zzgbVar.zzd();
                if (zzd != C.TIME_UNSET) {
                    if (zzd != 0) {
                        if (zzd == j9) {
                        }
                    }
                }
            }
            zzgbVar.zzi(j9);
        }
        if (j9 != 0 && (zzapfVar = this.zzk) != null) {
            zzapfVar.zzd(j9);
        }
        this.zzc.zzH(0);
        this.zzd.clear();
        for (int i10 = 0; i10 < this.zzg.size(); i10++) {
            ((zzapp) this.zzg.valueAt(i10)).zzc();
        }
        this.zzq = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzadu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzf(com.google.android.gms.internal.ads.zzadv r7) throws java.io.IOException {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzfu r0 = r6.zzc
            byte[] r0 = r0.zzM()
            com.google.android.gms.internal.ads.zzadi r7 = (com.google.android.gms.internal.ads.zzadi) r7
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.zzm(r0, r2, r1, r2)
            r1 = r2
        Lf:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L2b
            r3 = r2
        L14:
            r4 = 5
            if (r3 >= r4) goto L26
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L23
            int r1 = r1 + 1
            goto Lf
        L23:
            int r3 = r3 + 1
            goto L14
        L26:
            r7.zzo(r1, r2)
            r7 = 1
            return r7
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapk.zzf(com.google.android.gms.internal.ads.zzadv):boolean");
    }

    public zzapk(int i9, int i10, zzalt zzaltVar, zzgb zzgbVar, zzapn zzapnVar, int i11) {
        this.zze = zzapnVar;
        this.zzf = zzaltVar;
        this.zzb = Collections.singletonList(zzgbVar);
        this.zzc = new zzfu(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzh = sparseBooleanArray;
        this.zzi = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzg = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzj = new zzapg(112800);
        this.zzl = zzadx.zza;
        this.zzr = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.zzg.put(sparseArray2.keyAt(i12), (zzapp) sparseArray2.valueAt(i12));
        }
        this.zzg.put(0, new zzapc(new zzapi(this)));
    }
}
