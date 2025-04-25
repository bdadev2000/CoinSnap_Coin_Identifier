package com.google.android.gms.internal.maps;

import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
/* loaded from: classes12.dex */
public final class zzbt extends zzbl {
    static final zzbl zza = new zzbt(null, new Object[0], 0);
    final transient Object[] zzb;

    @CheckForNull
    private final transient Object zzc;
    private final transient int zzd;

    private zzbt(@CheckForNull Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    public static zzbt zzg(int i, Object[] objArr, zzbk zzbkVar) {
        byte[] bArr;
        int i2 = i;
        Object[] objArr2 = objArr;
        if (i2 == 0) {
            return (zzbt) zza;
        }
        Object obj = null;
        if (i2 == 1) {
            zzbd.zza(Objects.requireNonNull(objArr2[0]), Objects.requireNonNull(objArr2[1]));
            return new zzbt(null, objArr2, 1);
        }
        zzba.zzb(i2, objArr2.length >> 1, "index");
        int zzf = zzbm.zzf(i);
        if (i2 == 1) {
            zzbd.zza(Objects.requireNonNull(objArr2[0]), Objects.requireNonNull(objArr2[1]));
            i2 = 1;
        } else {
            int i3 = zzf - 1;
            if (zzf <= 128) {
                bArr = new byte[zzf];
                Arrays.fill(bArr, (byte) -1);
                int i4 = 0;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = i4 + i4;
                    int i7 = i5 + i5;
                    Object requireNonNull = Objects.requireNonNull(objArr2[i7]);
                    Object requireNonNull2 = Objects.requireNonNull(objArr2[i7 ^ 1]);
                    zzbd.zza(requireNonNull, requireNonNull2);
                    int zza2 = zzbe.zza(requireNonNull.hashCode());
                    while (true) {
                        int i8 = zza2 & i3;
                        int i9 = bArr[i8] & 255;
                        if (i9 != 255) {
                            if (requireNonNull.equals(objArr2[i9])) {
                                int i10 = i9 ^ 1;
                                zzbj zzbjVar = new zzbj(requireNonNull, requireNonNull2, Objects.requireNonNull(objArr2[i10]));
                                objArr2[i10] = requireNonNull2;
                                obj = zzbjVar;
                                break;
                            }
                            zza2 = i8 + 1;
                        } else {
                            bArr[i8] = (byte) i6;
                            if (i4 < i5) {
                                objArr2[i6] = requireNonNull;
                                objArr2[i6 ^ 1] = requireNonNull2;
                            }
                            i4++;
                        }
                    }
                }
                if (i4 != i2) {
                    obj = new Object[]{bArr, Integer.valueOf(i4), obj};
                }
                obj = bArr;
            } else if (zzf <= 32768) {
                bArr = new short[zzf];
                Arrays.fill(bArr, (short) -1);
                int i11 = 0;
                for (int i12 = 0; i12 < i2; i12++) {
                    int i13 = i11 + i11;
                    int i14 = i12 + i12;
                    Object requireNonNull3 = Objects.requireNonNull(objArr2[i14]);
                    Object requireNonNull4 = Objects.requireNonNull(objArr2[i14 ^ 1]);
                    zzbd.zza(requireNonNull3, requireNonNull4);
                    int zza3 = zzbe.zza(requireNonNull3.hashCode());
                    while (true) {
                        int i15 = zza3 & i3;
                        char c = (char) bArr[i15];
                        if (c != 65535) {
                            if (requireNonNull3.equals(objArr2[c])) {
                                int i16 = c ^ 1;
                                zzbj zzbjVar2 = new zzbj(requireNonNull3, requireNonNull4, Objects.requireNonNull(objArr2[i16]));
                                objArr2[i16] = requireNonNull4;
                                obj = zzbjVar2;
                                break;
                            }
                            zza3 = i15 + 1;
                        } else {
                            bArr[i15] = (short) i13;
                            if (i11 < i12) {
                                objArr2[i13] = requireNonNull3;
                                objArr2[i13 ^ 1] = requireNonNull4;
                            }
                            i11++;
                        }
                    }
                }
                if (i11 != i2) {
                    obj = new Object[]{bArr, Integer.valueOf(i11), obj};
                }
                obj = bArr;
            } else {
                bArr = new int[zzf];
                Arrays.fill((int[]) bArr, -1);
                int i17 = 0;
                for (int i18 = 0; i18 < i2; i18++) {
                    int i19 = i17 + i17;
                    int i20 = i18 + i18;
                    Object requireNonNull5 = Objects.requireNonNull(objArr2[i20]);
                    Object requireNonNull6 = Objects.requireNonNull(objArr2[i20 ^ 1]);
                    zzbd.zza(requireNonNull5, requireNonNull6);
                    int zza4 = zzbe.zza(requireNonNull5.hashCode());
                    while (true) {
                        int i21 = zza4 & i3;
                        ?? r14 = bArr[i21];
                        if (r14 != -1) {
                            if (requireNonNull5.equals(objArr2[r14])) {
                                int i22 = r14 ^ 1;
                                zzbj zzbjVar3 = new zzbj(requireNonNull5, requireNonNull6, Objects.requireNonNull(objArr2[i22]));
                                objArr2[i22] = requireNonNull6;
                                obj = zzbjVar3;
                                break;
                            }
                            zza4 = i21 + 1;
                        } else {
                            bArr[i21] = i19;
                            if (i17 < i18) {
                                objArr2[i19] = requireNonNull5;
                                objArr2[i19 ^ 1] = requireNonNull6;
                            }
                            i17++;
                        }
                    }
                }
                if (i17 != i2) {
                    obj = new Object[]{bArr, Integer.valueOf(i17), obj};
                }
                obj = bArr;
            }
        }
        if (obj instanceof Object[]) {
            Object[] objArr3 = (Object[]) obj;
            zzbkVar.zzc = (zzbj) objArr3[2];
            Object obj2 = objArr3[0];
            int intValue = ((Integer) objArr3[1]).intValue();
            objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
            obj = obj2;
            i2 = intValue;
        }
        return new zzbt(obj, objArr2, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a1 A[RETURN] */
    @Override // com.google.android.gms.internal.maps.zzbl, java.util.Map
    @javax.annotation.CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L6
        L3:
            r10 = r0
            goto L9e
        L6:
            int r1 = r9.zzd
            java.lang.Object[] r2 = r9.zzb
            r3 = 1
            if (r1 != r3) goto L22
            r1 = 0
            r1 = r2[r1]
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1)
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L3
            r10 = r2[r3]
            java.lang.Object r10 = java.util.Objects.requireNonNull(r10)
            goto L9e
        L22:
            java.lang.Object r1 = r9.zzc
            if (r1 != 0) goto L27
            goto L3
        L27:
            boolean r4 = r1 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L53
            r4 = r1
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.maps.zzbe.zza(r1)
        L3a:
            r1 = r1 & r6
            r5 = r4[r1]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L43
            goto L3
        L43:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L50
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9e
        L50:
            int r1 = r1 + 1
            goto L3a
        L53:
            boolean r4 = r1 instanceof short[]
            if (r4 == 0) goto L7f
            r4 = r1
            short[] r4 = (short[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.maps.zzbe.zza(r1)
        L65:
            r1 = r1 & r6
            short r5 = r4[r1]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6f
            goto L3
        L6f:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7c
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9e
        L7c:
            int r1 = r1 + 1
            goto L65
        L7f:
            int[] r1 = (int[]) r1
            int r4 = r1.length
            int r4 = r4 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.maps.zzbe.zza(r6)
        L8b:
            r6 = r6 & r4
            r7 = r1[r6]
            if (r7 != r5) goto L92
            goto L3
        L92:
            r8 = r2[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La2
            r10 = r7 ^ 1
            r10 = r2[r10]
        L9e:
            if (r10 != 0) goto La1
            return r0
        La1:
            return r10
        La2:
            int r6 = r6 + 1
            goto L8b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.maps.zzbt.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.maps.zzbl
    final zzbf zza() {
        return new zzbs(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.maps.zzbl
    final zzbm zzd() {
        return new zzbq(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.maps.zzbl
    final zzbm zze() {
        return new zzbr(this, new zzbs(this.zzb, 0, this.zzd));
    }
}
