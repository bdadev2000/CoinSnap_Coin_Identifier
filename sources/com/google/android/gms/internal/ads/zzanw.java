package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzanw implements zzacr {
    private final int zza;
    private final List zzb;
    private final zzed zzc;
    private final SparseIntArray zzd;
    private final zzanz zze;
    private final zzakg zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;
    private final SparseBooleanArray zzi;
    private final zzant zzj;
    private zzans zzk;
    private zzacu zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    @Deprecated
    public zzanw() {
        this(1, 1, zzakg.zza, new zzek(0L), new zzamj(0), 112800);
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x01bb, code lost:
    
        if (r1 == false) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.zzacr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzacs r19, com.google.android.gms.internal.ads.zzadn r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanw.zzb(com.google.android.gms.internal.ads.zzacs, com.google.android.gms.internal.ads.zzadn):int");
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
        if (this.zza == 0) {
            zzacuVar = new zzakj(zzacuVar, this.zzf);
        }
        this.zzl = zzacuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zzf(long j3, long j10) {
        zzans zzansVar;
        int size = this.zzb.size();
        for (int i10 = 0; i10 < size; i10++) {
            zzek zzekVar = (zzek) this.zzb.get(i10);
            if (zzekVar.zzf() != C.TIME_UNSET) {
                long zzd = zzekVar.zzd();
                if (zzd != C.TIME_UNSET) {
                    if (zzd != 0) {
                        if (zzd == j10) {
                        }
                    }
                }
            }
            zzekVar.zzi(j10);
        }
        if (j10 != 0 && (zzansVar = this.zzk) != null) {
            zzansVar.zzd(j10);
        }
        this.zzc.zzI(0);
        this.zzd.clear();
        for (int i11 = 0; i11 < this.zzg.size(); i11++) {
            ((zzaob) this.zzg.valueAt(i11)).zzc();
        }
        this.zzq = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzacr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzi(com.google.android.gms.internal.ads.zzacs r7) throws java.io.IOException {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzed r0 = r6.zzc
            byte[] r0 = r0.zzN()
            com.google.android.gms.internal.ads.zzacg r7 = (com.google.android.gms.internal.ads.zzacg) r7
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanw.zzi(com.google.android.gms.internal.ads.zzacs):boolean");
    }

    public zzanw(int i10, int i11, zzakg zzakgVar, zzek zzekVar, zzanz zzanzVar, int i12) {
        this.zze = zzanzVar;
        this.zza = i11;
        this.zzf = zzakgVar;
        this.zzb = Collections.singletonList(zzekVar);
        this.zzc = new zzed(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzh = sparseBooleanArray;
        this.zzi = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzg = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzj = new zzant(112800);
        this.zzl = zzacu.zza;
        this.zzr = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray zza = zzanzVar.zza();
        int size = zza.size();
        for (int i13 = 0; i13 < size; i13++) {
            this.zzg.put(zza.keyAt(i13), (zzaob) zza.valueAt(i13));
        }
        this.zzg.put(0, new zzano(new zzanu(this)));
    }
}
