package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes2.dex */
abstract class zzmf<T, B> {
    public abstract int zza(T t9);

    public abstract B zza();

    public abstract T zza(T t9, T t10);

    public abstract void zza(B b, int i9, int i10);

    public abstract void zza(B b, int i9, long j7);

    public abstract void zza(B b, int i9, zzia zziaVar);

    public abstract void zza(B b, int i9, T t9);

    public abstract void zza(T t9, zzna zznaVar) throws IOException;

    public abstract boolean zza(zzli zzliVar);

    public final boolean zza(B b, zzli zzliVar) throws IOException {
        int zzd = zzliVar.zzd();
        int i9 = zzd >>> 3;
        int i10 = zzd & 7;
        if (i10 == 0) {
            zzb(b, i9, zzliVar.zzl());
            return true;
        }
        if (i10 == 1) {
            zza((zzmf<T, B>) b, i9, zzliVar.zzk());
            return true;
        }
        if (i10 == 2) {
            zza((zzmf<T, B>) b, i9, zzliVar.zzp());
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return false;
            }
            if (i10 == 5) {
                zza((zzmf<T, B>) b, i9, zzliVar.zzf());
                return true;
            }
            throw zzjs.zza();
        }
        B zza = zza();
        int i11 = 4 | (i9 << 3);
        while (zzliVar.zzc() != Integer.MAX_VALUE && zza((zzmf<T, B>) zza, zzliVar)) {
        }
        if (i11 == zzliVar.zzd()) {
            zza((zzmf<T, B>) b, i9, (int) zze(zza));
            return true;
        }
        throw zzjs.zzb();
    }

    public abstract int zzb(T t9);

    public abstract void zzb(B b, int i9, long j7);

    public abstract void zzb(T t9, zzna zznaVar) throws IOException;

    public abstract void zzb(Object obj, B b);

    public abstract B zzc(Object obj);

    public abstract void zzc(Object obj, T t9);

    public abstract T zzd(Object obj);

    public abstract T zze(B b);

    public abstract void zzf(Object obj);
}
