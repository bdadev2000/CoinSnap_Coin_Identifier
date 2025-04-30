package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgal extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();
    transient int[] zza;
    transient Object[] zzb;
    transient Object[] zzc;
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;
    private transient Set zzh;
    private transient Set zzi;
    private transient Collection zzj;

    public zzgal() {
        zzp(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] zzA() {
        int[] iArr = this.zza;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzB() {
        Object[] objArr = this.zzb;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzC() {
        Object[] objArr = this.zzc;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public static /* synthetic */ Object zzg(zzgal zzgalVar, int i9) {
        return zzgalVar.zzB()[i9];
    }

    public static /* synthetic */ Object zzi(zzgal zzgalVar) {
        Object obj = zzgalVar.zze;
        Objects.requireNonNull(obj);
        return obj;
    }

    public static /* synthetic */ Object zzj(zzgal zzgalVar, int i9) {
        return zzgalVar.zzC()[i9];
    }

    public static /* synthetic */ void zzn(zzgal zzgalVar, int i9, Object obj) {
        zzgalVar.zzC()[i9] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzv() {
        return (1 << (this.zzf & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzw(Object obj) {
        if (zzr()) {
            return -1;
        }
        int zzb = zzgau.zzb(obj);
        int zzv = zzv();
        Object obj2 = this.zze;
        Objects.requireNonNull(obj2);
        int zzc = zzgam.zzc(obj2, zzb & zzv);
        if (zzc != 0) {
            int i9 = ~zzv;
            int i10 = zzb & i9;
            do {
                int i11 = zzc - 1;
                int i12 = zzA()[i11];
                if ((i12 & i9) == i10 && zzfya.zza(obj, zzB()[i11])) {
                    return i11;
                }
                zzc = i12 & zzv;
            } while (zzc != 0);
        }
        return -1;
    }

    private final int zzx(int i9, int i10, int i11, int i12) {
        int i13 = i10 - 1;
        Object zzd2 = zzgam.zzd(i10);
        if (i12 != 0) {
            zzgam.zze(zzd2, i11 & i13, i12 + 1);
        }
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] zzA = zzA();
        for (int i14 = 0; i14 <= i9; i14++) {
            int zzc = zzgam.zzc(obj, i14);
            while (zzc != 0) {
                int i15 = zzc - 1;
                int i16 = zzA[i15];
                int i17 = ((~i9) & i16) | i14;
                int i18 = i17 & i13;
                int zzc2 = zzgam.zzc(zzd2, i18);
                zzgam.zze(zzd2, i18, zzc);
                zzA[i15] = ((~i13) & i17) | (zzc2 & i13);
                zzc = i16 & i9;
            }
        }
        this.zze = zzd2;
        zzz(i13);
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzy(Object obj) {
        if (!zzr()) {
            int zzv = zzv();
            Object obj2 = this.zze;
            Objects.requireNonNull(obj2);
            int zzb = zzgam.zzb(obj, null, zzv, obj2, zzA(), zzB(), null);
            if (zzb != -1) {
                Object obj3 = zzC()[zzb];
                zzq(zzb, zzv);
                this.zzg--;
                zzo();
                return obj3;
            }
        }
        return zzd;
    }

    private final void zzz(int i9) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i9)) & 31) | (this.zzf & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzr()) {
            return;
        }
        zzo();
        Map zzl = zzl();
        if (zzl != null) {
            this.zzf = zzgea.zzc(size(), 3, 1073741823);
            zzl.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzB(), 0, this.zzg, (Object) null);
        Arrays.fill(zzC(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzA(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.containsKey(obj);
        }
        if (zzw(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map zzl = zzl();
        if (zzl == null) {
            for (int i9 = 0; i9 < this.zzg; i9++) {
                if (zzfya.zza(obj, zzC()[i9])) {
                    return true;
                }
            }
            return false;
        }
        return zzl.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set == null) {
            zzgaf zzgafVar = new zzgaf(this);
            this.zzi = zzgafVar;
            return zzgafVar;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.get(obj);
        }
        int zzw = zzw(obj);
        if (zzw == -1) {
            return null;
        }
        return zzC()[zzw];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set == null) {
            zzgai zzgaiVar = new zzgai(this);
            this.zzh = zzgaiVar;
            return zzgaiVar;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int min;
        if (zzr()) {
            zzfyg.zzk(zzr(), "Arrays already allocated");
            int i9 = this.zzf;
            int max = Math.max(i9 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.zze = zzgam.zzd(max2);
            zzz(max2 - 1);
            this.zza = new int[i9];
            this.zzb = new Object[i9];
            this.zzc = new Object[i9];
        }
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.put(obj, obj2);
        }
        int[] zzA = zzA();
        Object[] zzB = zzB();
        Object[] zzC = zzC();
        int i10 = this.zzg;
        int i11 = i10 + 1;
        int zzb = zzgau.zzb(obj);
        int zzv = zzv();
        int i12 = zzb & zzv;
        Object obj3 = this.zze;
        Objects.requireNonNull(obj3);
        int zzc = zzgam.zzc(obj3, i12);
        if (zzc == 0) {
            if (i11 > zzv) {
                zzv = zzx(zzv, zzgam.zza(zzv), zzb, i10);
            } else {
                Object obj4 = this.zze;
                Objects.requireNonNull(obj4);
                zzgam.zze(obj4, i12, i11);
            }
        } else {
            int i13 = ~zzv;
            int i14 = zzb & i13;
            int i15 = 0;
            while (true) {
                int i16 = zzc - 1;
                int i17 = zzA[i16];
                int i18 = i17 & i13;
                if (i18 == i14 && zzfya.zza(obj, zzB[i16])) {
                    Object obj5 = zzC[i16];
                    zzC[i16] = obj2;
                    return obj5;
                }
                int i19 = i17 & zzv;
                i15++;
                if (i19 == 0) {
                    if (i15 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(zzv() + 1, 1.0f);
                        int zze = zze();
                        while (zze >= 0) {
                            linkedHashMap.put(zzB()[zze], zzC()[zze]);
                            zze = zzf(zze);
                        }
                        this.zze = linkedHashMap;
                        this.zza = null;
                        this.zzb = null;
                        this.zzc = null;
                        zzo();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i11 > zzv) {
                        zzv = zzx(zzv, zzgam.zza(zzv), zzb, i10);
                    } else {
                        zzA[i16] = (i11 & zzv) | i18;
                    }
                } else {
                    zzc = i19;
                }
            }
        }
        int length = zzA().length;
        if (i11 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.zza = Arrays.copyOf(zzA(), min);
            this.zzb = Arrays.copyOf(zzB(), min);
            this.zzc = Arrays.copyOf(zzC(), min);
        }
        zzA()[i10] = (~zzv) & zzb;
        zzB()[i10] = obj;
        zzC()[i10] = obj2;
        this.zzg = i11;
        zzo();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.remove(obj);
        }
        Object zzy = zzy(obj);
        if (zzy == zzd) {
            return null;
        }
        return zzy;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.size();
        }
        return this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection == null) {
            zzgak zzgakVar = new zzgak(this);
            this.zzj = zzgakVar;
            return zzgakVar;
        }
        return collection;
    }

    public final int zze() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    public final int zzf(int i9) {
        int i10 = i9 + 1;
        if (i10 < this.zzg) {
            return i10;
        }
        return -1;
    }

    public final Map zzl() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void zzo() {
        this.zzf += 32;
    }

    public final void zzp(int i9) {
        this.zzf = zzgea.zzc(i9, 1, 1073741823);
    }

    public final void zzq(int i9, int i10) {
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] zzA = zzA();
        Object[] zzB = zzB();
        Object[] zzC = zzC();
        int size = size();
        int i11 = size - 1;
        if (i9 < i11) {
            int i12 = i9 + 1;
            Object obj2 = zzB[i11];
            zzB[i9] = obj2;
            zzC[i9] = zzC[i11];
            zzB[i11] = null;
            zzC[i11] = null;
            zzA[i9] = zzA[i11];
            zzA[i11] = 0;
            int zzb = zzgau.zzb(obj2) & i10;
            int zzc = zzgam.zzc(obj, zzb);
            if (zzc == size) {
                zzgam.zze(obj, zzb, i12);
                return;
            }
            while (true) {
                int i13 = zzc - 1;
                int i14 = zzA[i13];
                int i15 = i14 & i10;
                if (i15 != size) {
                    zzc = i15;
                } else {
                    zzA[i13] = (i14 & (~i10)) | (i10 & i12);
                    return;
                }
            }
        } else {
            zzB[i9] = null;
            zzC[i9] = null;
            zzA[i9] = 0;
        }
    }

    public final boolean zzr() {
        return this.zze == null;
    }

    public zzgal(int i9) {
        zzp(8);
    }
}
