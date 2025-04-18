package com.google.android.gms.internal.ads;

import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzgag extends AbstractMap implements Serializable {
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

    public zzgag() {
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

    public static /* synthetic */ Object zzg(zzgag zzgagVar, int i2) {
        return zzgagVar.zzB()[i2];
    }

    public static /* synthetic */ Object zzi(zzgag zzgagVar) {
        Object obj = zzgagVar.zze;
        Objects.requireNonNull(obj);
        return obj;
    }

    public static /* synthetic */ Object zzj(zzgag zzgagVar, int i2) {
        return zzgagVar.zzC()[i2];
    }

    public static /* synthetic */ void zzn(zzgag zzgagVar, int i2, Object obj) {
        zzgagVar.zzC()[i2] = obj;
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
        int zzb = zzgap.zzb(obj);
        int zzv = zzv();
        Object obj2 = this.zze;
        Objects.requireNonNull(obj2);
        int zzc = zzgah.zzc(obj2, zzb & zzv);
        if (zzc != 0) {
            int i2 = ~zzv;
            int i3 = zzb & i2;
            do {
                int i4 = zzc - 1;
                int i5 = zzA()[i4];
                if ((i5 & i2) == i3 && zzfxw.zza(obj, zzB()[i4])) {
                    return i4;
                }
                zzc = i5 & zzv;
            } while (zzc != 0);
        }
        return -1;
    }

    private final int zzx(int i2, int i3, int i4, int i5) {
        int i6 = i3 - 1;
        Object zzd2 = zzgah.zzd(i3);
        if (i5 != 0) {
            zzgah.zze(zzd2, i4 & i6, i5 + 1);
        }
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] zzA = zzA();
        for (int i7 = 0; i7 <= i2; i7++) {
            int zzc = zzgah.zzc(obj, i7);
            while (zzc != 0) {
                int i8 = zzc - 1;
                int i9 = zzA[i8];
                int i10 = ((~i2) & i9) | i7;
                int i11 = i10 & i6;
                int zzc2 = zzgah.zzc(zzd2, i11);
                zzgah.zze(zzd2, i11, zzc);
                zzA[i8] = ((~i6) & i10) | (zzc2 & i6);
                zzc = i9 & i2;
            }
        }
        this.zze = zzd2;
        zzz(i6);
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzy(Object obj) {
        if (!zzr()) {
            int zzv = zzv();
            Object obj2 = this.zze;
            Objects.requireNonNull(obj2);
            int zzb = zzgah.zzb(obj, null, zzv, obj2, zzA(), zzB(), null);
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

    private final void zzz(int i2) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i2)) & 31) | (this.zzf & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzr()) {
            return;
        }
        zzo();
        Map zzl = zzl();
        if (zzl != null) {
            this.zzf = zzgdu.zzc(size(), 3, 1073741823);
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
        return zzl != null ? zzl.containsKey(obj) : zzw(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.containsValue(obj);
        }
        for (int i2 = 0; i2 < this.zzg; i2++) {
            if (zzfxw.zza(obj, zzC()[i2])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set != null) {
            return set;
        }
        zzgaa zzgaaVar = new zzgaa(this);
        this.zzi = zzgaaVar;
        return zzgaaVar;
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
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set != null) {
            return set;
        }
        zzgad zzgadVar = new zzgad(this);
        this.zzh = zzgadVar;
        return zzgadVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int min;
        if (zzr()) {
            zzfxz.zzk(zzr(), "Arrays already allocated");
            int i2 = this.zzf;
            int max = Math.max(i2 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = Ints.MAX_POWER_OF_TWO;
            }
            int max2 = Math.max(4, highestOneBit);
            this.zze = zzgah.zzd(max2);
            zzz(max2 - 1);
            this.zza = new int[i2];
            this.zzb = new Object[i2];
            this.zzc = new Object[i2];
        }
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.put(obj, obj2);
        }
        int[] zzA = zzA();
        Object[] zzB = zzB();
        Object[] zzC = zzC();
        int i3 = this.zzg;
        int i4 = i3 + 1;
        int zzb = zzgap.zzb(obj);
        int zzv = zzv();
        int i5 = zzb & zzv;
        Object obj3 = this.zze;
        Objects.requireNonNull(obj3);
        int zzc = zzgah.zzc(obj3, i5);
        if (zzc != 0) {
            int i6 = ~zzv;
            int i7 = zzb & i6;
            int i8 = 0;
            while (true) {
                int i9 = zzc - 1;
                int i10 = zzA[i9];
                int i11 = i10 & i6;
                if (i11 == i7 && zzfxw.zza(obj, zzB[i9])) {
                    Object obj4 = zzC[i9];
                    zzC[i9] = obj2;
                    return obj4;
                }
                int i12 = i10 & zzv;
                i8++;
                if (i12 != 0) {
                    zzc = i12;
                } else {
                    if (i8 >= 9) {
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
                    if (i4 > zzv) {
                        zzv = zzx(zzv, zzgah.zza(zzv), zzb, i3);
                    } else {
                        zzA[i9] = (i4 & zzv) | i11;
                    }
                }
            }
        } else if (i4 > zzv) {
            zzv = zzx(zzv, zzgah.zza(zzv), zzb, i3);
        } else {
            Object obj5 = this.zze;
            Objects.requireNonNull(obj5);
            zzgah.zze(obj5, i5, i4);
        }
        int length = zzA().length;
        if (i4 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.zza = Arrays.copyOf(zzA(), min);
            this.zzb = Arrays.copyOf(zzB(), min);
            this.zzc = Arrays.copyOf(zzC(), min);
        }
        zzA()[i3] = (~zzv) & zzb;
        zzB()[i3] = obj;
        zzC()[i3] = obj2;
        this.zzg = i4;
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
        return zzl != null ? zzl.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        zzgaf zzgafVar = new zzgaf(this);
        this.zzj = zzgafVar;
        return zzgafVar;
    }

    public final int zze() {
        return isEmpty() ? -1 : 0;
    }

    public final int zzf(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.zzg) {
            return i3;
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

    public final void zzp(int i2) {
        this.zzf = zzgdu.zzc(i2, 1, 1073741823);
    }

    public final void zzq(int i2, int i3) {
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] zzA = zzA();
        Object[] zzB = zzB();
        Object[] zzC = zzC();
        int size = size();
        int i4 = size - 1;
        if (i2 >= i4) {
            zzB[i2] = null;
            zzC[i2] = null;
            zzA[i2] = 0;
            return;
        }
        int i5 = i2 + 1;
        Object obj2 = zzB[i4];
        zzB[i2] = obj2;
        zzC[i2] = zzC[i4];
        zzB[i4] = null;
        zzC[i4] = null;
        zzA[i2] = zzA[i4];
        zzA[i4] = 0;
        int zzb = zzgap.zzb(obj2) & i3;
        int zzc = zzgah.zzc(obj, zzb);
        if (zzc == size) {
            zzgah.zze(obj, zzb, i5);
            return;
        }
        while (true) {
            int i6 = zzc - 1;
            int i7 = zzA[i6];
            int i8 = i7 & i3;
            if (i8 == size) {
                zzA[i6] = (i7 & (~i3)) | (i3 & i5);
                return;
            }
            zzc = i8;
        }
    }

    public final boolean zzr() {
        return this.zze == null;
    }

    public zzgag(int i2) {
        zzp(8);
    }
}
