package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import kotlin.UByte;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgbf extends zzfzr {
    static final zzfzr zza = new zzgbf(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzgbf(Object obj, Object[] objArr, int i10) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    public static zzgbf zzj(int i10, Object[] objArr, zzfzq zzfzqVar) {
        short[] sArr;
        char c10;
        char c11;
        Object[] objArr2;
        int i11 = i10;
        Object[] objArr3 = objArr;
        if (i11 == 0) {
            return (zzgbf) zza;
        }
        Object obj = null;
        int i12 = 1;
        if (i11 == 1) {
            Object obj2 = objArr3[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArr3[1];
            Objects.requireNonNull(obj3);
            zzfyl.zzb(obj2, obj3);
            return new zzgbf(null, objArr3, 1);
        }
        zzfwq.zzb(i11, objArr3.length >> 1, "index");
        int zzh = zzfzt.zzh(i10);
        if (i11 == 1) {
            Object obj4 = objArr3[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArr3[1];
            Objects.requireNonNull(obj5);
            zzfyl.zzb(obj4, obj5);
            i11 = 1;
            c10 = 1;
            c11 = 2;
        } else {
            int i13 = zzh - 1;
            char c12 = 65535;
            if (zzh <= 128) {
                byte[] bArr = new byte[zzh];
                Arrays.fill(bArr, (byte) -1);
                int i14 = 0;
                int i15 = 0;
                while (i14 < i11) {
                    int i16 = i15 + i15;
                    int i17 = i14 + i14;
                    Object obj6 = objArr3[i17];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArr3[i17 ^ i12];
                    Objects.requireNonNull(obj7);
                    zzfyl.zzb(obj6, obj7);
                    int zza2 = zzfzg.zza(obj6.hashCode());
                    while (true) {
                        int i18 = zza2 & i13;
                        int i19 = bArr[i18] & UByte.MAX_VALUE;
                        if (i19 == 255) {
                            bArr[i18] = (byte) i16;
                            if (i15 < i14) {
                                objArr3[i16] = obj6;
                                objArr3[i16 ^ 1] = obj7;
                            }
                            i15++;
                        } else {
                            if (obj6.equals(objArr3[i19])) {
                                int i20 = i19 ^ 1;
                                Object obj8 = objArr3[i20];
                                Objects.requireNonNull(obj8);
                                zzfzp zzfzpVar = new zzfzp(obj6, obj7, obj8);
                                objArr3[i20] = obj7;
                                obj = zzfzpVar;
                                break;
                            }
                            zza2 = i18 + 1;
                        }
                    }
                    i14++;
                    i12 = 1;
                }
                if (i15 == i11) {
                    obj = bArr;
                } else {
                    obj = new Object[]{bArr, Integer.valueOf(i15), obj};
                    c11 = 2;
                    c10 = 1;
                }
            } else {
                if (zzh <= 32768) {
                    sArr = new short[zzh];
                    Arrays.fill(sArr, (short) -1);
                    int i21 = 0;
                    for (int i22 = 0; i22 < i11; i22++) {
                        int i23 = i21 + i21;
                        int i24 = i22 + i22;
                        Object obj9 = objArr3[i24];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArr3[i24 ^ 1];
                        Objects.requireNonNull(obj10);
                        zzfyl.zzb(obj9, obj10);
                        int zza3 = zzfzg.zza(obj9.hashCode());
                        while (true) {
                            int i25 = zza3 & i13;
                            char c13 = (char) sArr[i25];
                            if (c13 == 65535) {
                                sArr[i25] = (short) i23;
                                if (i21 < i22) {
                                    objArr3[i23] = obj9;
                                    objArr3[i23 ^ 1] = obj10;
                                }
                                i21++;
                            } else {
                                if (obj9.equals(objArr3[c13])) {
                                    int i26 = c13 ^ 1;
                                    Object obj11 = objArr3[i26];
                                    Objects.requireNonNull(obj11);
                                    zzfzp zzfzpVar2 = new zzfzp(obj9, obj10, obj11);
                                    objArr3[i26] = obj10;
                                    obj = zzfzpVar2;
                                    break;
                                }
                                zza3 = i25 + 1;
                            }
                        }
                    }
                    if (i21 != i11) {
                        Integer valueOf = Integer.valueOf(i21);
                        c10 = 1;
                        c11 = 2;
                        objArr2 = new Object[]{sArr, valueOf, obj};
                        obj = objArr2;
                    }
                    obj = sArr;
                } else {
                    int i27 = 1;
                    sArr = new int[zzh];
                    Arrays.fill((int[]) sArr, -1);
                    int i28 = 0;
                    int i29 = 0;
                    while (i28 < i11) {
                        int i30 = i29 + i29;
                        int i31 = i28 + i28;
                        Object obj12 = objArr3[i31];
                        Objects.requireNonNull(obj12);
                        Object obj13 = objArr3[i31 ^ i27];
                        Objects.requireNonNull(obj13);
                        zzfyl.zzb(obj12, obj13);
                        int zza4 = zzfzg.zza(obj12.hashCode());
                        while (true) {
                            int i32 = zza4 & i13;
                            ?? r15 = sArr[i32];
                            if (r15 == c12) {
                                sArr[i32] = i30;
                                if (i29 < i28) {
                                    objArr3[i30] = obj12;
                                    objArr3[i30 ^ 1] = obj13;
                                }
                                i29++;
                            } else {
                                if (obj12.equals(objArr3[r15])) {
                                    int i33 = r15 ^ 1;
                                    Object obj14 = objArr3[i33];
                                    Objects.requireNonNull(obj14);
                                    zzfzp zzfzpVar3 = new zzfzp(obj12, obj13, obj14);
                                    objArr3[i33] = obj13;
                                    obj = zzfzpVar3;
                                    break;
                                }
                                zza4 = i32 + 1;
                                c12 = 65535;
                            }
                        }
                        i28++;
                        i27 = 1;
                        c12 = 65535;
                    }
                    if (i29 != i11) {
                        c10 = 1;
                        c11 = 2;
                        objArr2 = new Object[]{sArr, Integer.valueOf(i29), obj};
                        obj = objArr2;
                    }
                    obj = sArr;
                }
                c10 = 1;
            }
            c11 = 2;
            c10 = 1;
        }
        boolean z10 = obj instanceof Object[];
        Object obj15 = obj;
        if (z10) {
            Object[] objArr4 = (Object[]) obj;
            zzfzp zzfzpVar4 = (zzfzp) objArr4[c11];
            if (zzfzqVar != null) {
                zzfzqVar.zzc = zzfzpVar4;
                Object obj16 = objArr4[0];
                int intValue = ((Integer) objArr4[c10]).intValue();
                objArr3 = Arrays.copyOf(objArr3, intValue + intValue);
                obj15 = obj16;
                i11 = intValue;
            } else {
                throw zzfzpVar4.zza();
            }
        }
        return new zzgbf(obj15, objArr3, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzfzr, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L6
        L3:
            r10 = r0
            goto L9c
        L6:
            int r1 = r9.zzd
            java.lang.Object[] r2 = r9.zzb
            r3 = 1
            if (r1 != r3) goto L20
            r1 = 0
            r1 = r2[r1]
            java.util.Objects.requireNonNull(r1)
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L3
            r10 = r2[r3]
            java.util.Objects.requireNonNull(r10)
            goto L9c
        L20:
            java.lang.Object r1 = r9.zzc
            if (r1 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r1 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L51
            r4 = r1
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.ads.zzfzg.zza(r1)
        L38:
            r1 = r1 & r6
            r5 = r4[r1]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L3
        L41:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L4e:
            int r1 = r1 + 1
            goto L38
        L51:
            boolean r4 = r1 instanceof short[]
            if (r4 == 0) goto L7d
            r4 = r1
            short[] r4 = (short[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.ads.zzfzg.zza(r1)
        L63:
            r1 = r1 & r6
            short r5 = r4[r1]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L3
        L6d:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L7a:
            int r1 = r1 + 1
            goto L63
        L7d:
            int[] r1 = (int[]) r1
            int r4 = r1.length
            int r4 = r4 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.ads.zzfzg.zza(r6)
        L89:
            r6 = r6 & r4
            r7 = r1[r6]
            if (r7 != r5) goto L90
            goto L3
        L90:
            r8 = r2[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r2[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r0
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgbf.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfzr
    public final zzfzj zza() {
        return new zzgbe(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfzr
    public final zzfzt zzf() {
        return new zzgbc(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfzr
    public final zzfzt zzg() {
        return new zzgbd(this, new zzgbe(this.zzb, 0, this.zzd));
    }
}
