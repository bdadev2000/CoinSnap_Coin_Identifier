package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgct extends zzgbf {
    static final zzgbf zza = new zzgct(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzgct(Object obj, Object[] objArr, int i9) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    public static zzgct zzj(int i9, Object[] objArr, zzgbe zzgbeVar) {
        short[] sArr;
        char c9;
        char c10;
        Object[] objArr2;
        int i10 = i9;
        Object[] objArr3 = objArr;
        if (i10 == 0) {
            return (zzgct) zza;
        }
        Object obj = null;
        int i11 = 1;
        if (i10 == 1) {
            Object obj2 = objArr3[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArr3[1];
            Objects.requireNonNull(obj3);
            zzfzz.zzb(obj2, obj3);
            return new zzgct(null, objArr3, 1);
        }
        zzfyg.zzb(i10, objArr3.length >> 1, "index");
        int zzh = zzgbh.zzh(i9);
        if (i10 == 1) {
            Object obj4 = objArr3[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArr3[1];
            Objects.requireNonNull(obj5);
            zzfzz.zzb(obj4, obj5);
            i10 = 1;
            c9 = 1;
            c10 = 2;
        } else {
            int i12 = zzh - 1;
            char c11 = 65535;
            if (zzh <= 128) {
                byte[] bArr = new byte[zzh];
                Arrays.fill(bArr, (byte) -1);
                int i13 = 0;
                int i14 = 0;
                while (i13 < i10) {
                    int i15 = i14 + i14;
                    int i16 = i13 + i13;
                    Object obj6 = objArr3[i16];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArr3[i16 ^ i11];
                    Objects.requireNonNull(obj7);
                    zzfzz.zzb(obj6, obj7);
                    int zza2 = zzgau.zza(obj6.hashCode());
                    while (true) {
                        int i17 = zza2 & i12;
                        int i18 = bArr[i17] & 255;
                        if (i18 == 255) {
                            bArr[i17] = (byte) i15;
                            if (i14 < i13) {
                                objArr3[i15] = obj6;
                                objArr3[i15 ^ 1] = obj7;
                            }
                            i14++;
                        } else {
                            if (obj6.equals(objArr3[i18])) {
                                int i19 = i18 ^ 1;
                                Object obj8 = objArr3[i19];
                                Objects.requireNonNull(obj8);
                                zzgbd zzgbdVar = new zzgbd(obj6, obj7, obj8);
                                objArr3[i19] = obj7;
                                obj = zzgbdVar;
                                break;
                            }
                            zza2 = i17 + 1;
                        }
                    }
                    i13++;
                    i11 = 1;
                }
                if (i14 == i10) {
                    obj = bArr;
                } else {
                    obj = new Object[]{bArr, Integer.valueOf(i14), obj};
                    c10 = 2;
                    c9 = 1;
                }
            } else {
                if (zzh <= 32768) {
                    sArr = new short[zzh];
                    Arrays.fill(sArr, (short) -1);
                    int i20 = 0;
                    for (int i21 = 0; i21 < i10; i21++) {
                        int i22 = i20 + i20;
                        int i23 = i21 + i21;
                        Object obj9 = objArr3[i23];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArr3[i23 ^ 1];
                        Objects.requireNonNull(obj10);
                        zzfzz.zzb(obj9, obj10);
                        int zza3 = zzgau.zza(obj9.hashCode());
                        while (true) {
                            int i24 = zza3 & i12;
                            char c12 = (char) sArr[i24];
                            if (c12 == 65535) {
                                sArr[i24] = (short) i22;
                                if (i20 < i21) {
                                    objArr3[i22] = obj9;
                                    objArr3[i22 ^ 1] = obj10;
                                }
                                i20++;
                            } else {
                                if (obj9.equals(objArr3[c12])) {
                                    int i25 = c12 ^ 1;
                                    Object obj11 = objArr3[i25];
                                    Objects.requireNonNull(obj11);
                                    zzgbd zzgbdVar2 = new zzgbd(obj9, obj10, obj11);
                                    objArr3[i25] = obj10;
                                    obj = zzgbdVar2;
                                    break;
                                }
                                zza3 = i24 + 1;
                            }
                        }
                    }
                    if (i20 != i10) {
                        Integer valueOf = Integer.valueOf(i20);
                        c9 = 1;
                        c10 = 2;
                        objArr2 = new Object[]{sArr, valueOf, obj};
                        obj = objArr2;
                    }
                    obj = sArr;
                } else {
                    int i26 = 1;
                    sArr = new int[zzh];
                    Arrays.fill((int[]) sArr, -1);
                    int i27 = 0;
                    int i28 = 0;
                    while (i27 < i10) {
                        int i29 = i28 + i28;
                        int i30 = i27 + i27;
                        Object obj12 = objArr3[i30];
                        Objects.requireNonNull(obj12);
                        Object obj13 = objArr3[i30 ^ i26];
                        Objects.requireNonNull(obj13);
                        zzfzz.zzb(obj12, obj13);
                        int zza4 = zzgau.zza(obj12.hashCode());
                        while (true) {
                            int i31 = zza4 & i12;
                            ?? r15 = sArr[i31];
                            if (r15 == c11) {
                                sArr[i31] = i29;
                                if (i28 < i27) {
                                    objArr3[i29] = obj12;
                                    objArr3[i29 ^ 1] = obj13;
                                }
                                i28++;
                            } else {
                                if (obj12.equals(objArr3[r15])) {
                                    int i32 = r15 ^ 1;
                                    Object obj14 = objArr3[i32];
                                    Objects.requireNonNull(obj14);
                                    zzgbd zzgbdVar3 = new zzgbd(obj12, obj13, obj14);
                                    objArr3[i32] = obj13;
                                    obj = zzgbdVar3;
                                    break;
                                }
                                zza4 = i31 + 1;
                                c11 = 65535;
                            }
                        }
                        i27++;
                        i26 = 1;
                        c11 = 65535;
                    }
                    if (i28 != i10) {
                        c9 = 1;
                        c10 = 2;
                        objArr2 = new Object[]{sArr, Integer.valueOf(i28), obj};
                        obj = objArr2;
                    }
                    obj = sArr;
                }
                c9 = 1;
            }
            c10 = 2;
            c9 = 1;
        }
        boolean z8 = obj instanceof Object[];
        Object obj15 = obj;
        if (z8) {
            Object[] objArr4 = (Object[]) obj;
            zzgbd zzgbdVar4 = (zzgbd) objArr4[c10];
            if (zzgbeVar != null) {
                zzgbeVar.zzc = zzgbdVar4;
                Object obj16 = objArr4[0];
                int intValue = ((Integer) objArr4[c9]).intValue();
                objArr3 = Arrays.copyOf(objArr3, intValue + intValue);
                obj15 = obj16;
                i10 = intValue;
            } else {
                throw zzgbdVar4.zza();
            }
        }
        return new zzgct(obj15, objArr3, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzgbf, java.util.Map
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
            int r1 = com.google.android.gms.internal.ads.zzgau.zza(r1)
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
            int r1 = com.google.android.gms.internal.ads.zzgau.zza(r1)
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
            int r6 = com.google.android.gms.internal.ads.zzgau.zza(r6)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgct.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgbf
    public final zzgax zza() {
        return new zzgcs(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgbf
    public final zzgbh zzf() {
        return new zzgcq(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgbf
    public final zzgbh zzg() {
        return new zzgcr(this, new zzgcs(this.zzb, 0, this.zzd));
    }
}
