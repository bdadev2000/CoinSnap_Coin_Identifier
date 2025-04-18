package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzll extends zzhn {
    public static final /* synthetic */ int zzb = 0;
    private final int zzc;
    private final int zzd;
    private final int[] zze;
    private final int[] zzf;
    private final zzbv[] zzg;
    private final Object[] zzh;
    private final HashMap zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzll(java.util.Collection r7, com.google.android.gms.internal.ads.zzwj r8) {
        /*
            r6 = this;
            int r0 = r7.size()
            com.google.android.gms.internal.ads.zzbv[] r0 = new com.google.android.gms.internal.ads.zzbv[r0]
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
            r3 = r2
        Lc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L22
            java.lang.Object r4 = r1.next()
            com.google.android.gms.internal.ads.zzku r4 = (com.google.android.gms.internal.ads.zzku) r4
            int r5 = r3 + 1
            com.google.android.gms.internal.ads.zzbv r4 = r4.zza()
            r0[r3] = r4
            r3 = r5
            goto Lc
        L22:
            int r1 = r7.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.Iterator r7 = r7.iterator()
        L2c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r7.next()
            com.google.android.gms.internal.ads.zzku r3 = (com.google.android.gms.internal.ads.zzku) r3
            int r4 = r2 + 1
            java.lang.Object r3 = r3.zzb()
            r1[r2] = r3
            r2 = r4
            goto L2c
        L42:
            r6.<init>(r0, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzll.<init>(java.util.Collection, com.google.android.gms.internal.ads.zzwj):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public final int zzp(Object obj) {
        Integer num = (Integer) this.zzi.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public final int zzq(int i10) {
        return zzen.zzc(this.zze, i10 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public final int zzr(int i10) {
        return zzen.zzc(this.zzf, i10 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public final int zzs(int i10) {
        return this.zze[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public final int zzt(int i10) {
        return this.zzf[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public final zzbv zzu(int i10) {
        return this.zzg[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public final Object zzv(int i10) {
        return this.zzh[i10];
    }

    public final List zzw() {
        return Arrays.asList(this.zzg);
    }

    public final zzll zzx(zzwj zzwjVar) {
        zzbv[] zzbvVarArr = new zzbv[this.zzg.length];
        int i10 = 0;
        while (true) {
            zzbv[] zzbvVarArr2 = this.zzg;
            if (i10 < zzbvVarArr2.length) {
                zzbvVarArr[i10] = new zzlk(this, zzbvVarArr2[i10]);
                i10++;
            } else {
                return new zzll(zzbvVarArr, this.zzh, zzwjVar);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzll(zzbv[] zzbvVarArr, Object[] objArr, zzwj zzwjVar) {
        super(false, zzwjVar);
        int i10 = 0;
        this.zzg = zzbvVarArr;
        int length = zzbvVarArr.length;
        this.zze = new int[length];
        this.zzf = new int[length];
        this.zzh = objArr;
        this.zzi = new HashMap();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < zzbvVarArr.length) {
            zzbv zzbvVar = zzbvVarArr[i10];
            this.zzg[i13] = zzbvVar;
            this.zzf[i13] = i11;
            this.zze[i13] = i12;
            i11 += zzbvVar.zzc();
            i12 += this.zzg[i13].zzb();
            this.zzi.put(objArr[i13], Integer.valueOf(i13));
            i10++;
            i13++;
        }
        this.zzc = i11;
        this.zzd = i12;
    }
}
