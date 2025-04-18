package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzaoj implements zzadb {
    private final int zza;
    private final List zzb;
    private final zzek zzc;
    private final SparseIntArray zzd;
    private final zzaom zze;
    private final zzakt zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;
    private final SparseBooleanArray zzi;
    private final zzaog zzj;
    private zzaof zzk;
    private zzade zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    @Deprecated
    public zzaoj() {
        this(1, 1, zzakt.zza, new zzer(0L), new zzamw(0), 112800);
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x01bb, code lost:
    
        if (r1 == false) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int, boolean] */
    @Override // com.google.android.gms.internal.ads.zzadb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzadc r19, com.google.android.gms.internal.ads.zzadx r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaoj.zzb(com.google.android.gms.internal.ads.zzadc, com.google.android.gms.internal.ads.zzadx):int");
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
        if (this.zza == 0) {
            zzadeVar = new zzakw(zzadeVar, this.zzf);
        }
        this.zzl = zzadeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzf(long j2, long j3) {
        zzaof zzaofVar;
        int size = this.zzb.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzer zzerVar = (zzer) this.zzb.get(i2);
            if (zzerVar.zzf() != -9223372036854775807L) {
                long zzd = zzerVar.zzd();
                if (zzd != -9223372036854775807L) {
                    if (zzd != 0) {
                        if (zzd == j3) {
                        }
                    }
                }
            }
            zzerVar.zzi(j3);
        }
        if (j3 != 0 && (zzaofVar = this.zzk) != null) {
            zzaofVar.zzd(j3);
        }
        this.zzc.zzI(0);
        this.zzd.clear();
        for (int i3 = 0; i3 < this.zzg.size(); i3++) {
            ((zzaoo) this.zzg.valueAt(i3)).zzc();
        }
        this.zzq = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzadb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzi(com.google.android.gms.internal.ads.zzadc r7) throws java.io.IOException {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzek r0 = r6.zzc
            byte[] r0 = r0.zzN()
            com.google.android.gms.internal.ads.zzacq r7 = (com.google.android.gms.internal.ads.zzacq) r7
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaoj.zzi(com.google.android.gms.internal.ads.zzadc):boolean");
    }

    public zzaoj(int i2, int i3, zzakt zzaktVar, zzer zzerVar, zzaom zzaomVar, int i4) {
        this.zze = zzaomVar;
        this.zza = i3;
        this.zzf = zzaktVar;
        this.zzb = Collections.singletonList(zzerVar);
        this.zzc = new zzek(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzh = sparseBooleanArray;
        this.zzi = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzg = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzj = new zzaog(112800);
        this.zzl = zzade.zza;
        this.zzr = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray zza = zzaomVar.zza();
        int size = zza.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.zzg.put(zza.keyAt(i5), (zzaoo) zza.valueAt(i5));
        }
        this.zzg.put(0, new zzaob(new zzaoh(this)));
    }
}
