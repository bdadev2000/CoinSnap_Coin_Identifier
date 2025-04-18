package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes3.dex */
abstract class zzmk<T, B> {
    private static volatile int zza = 100;

    public abstract int zza(T t5);

    public abstract B zza();

    public abstract T zza(T t5, T t10);

    public abstract void zza(B b3, int i10, int i11);

    public abstract void zza(B b3, int i10, long j3);

    public abstract void zza(B b3, int i10, zzik zzikVar);

    public abstract void zza(B b3, int i10, T t5);

    public abstract void zza(T t5, zznb zznbVar) throws IOException;

    public abstract boolean zza(zzlr zzlrVar);

    public final boolean zza(B b3, zzlr zzlrVar, int i10) throws IOException {
        int zzd = zzlrVar.zzd();
        int i11 = zzd >>> 3;
        int i12 = zzd & 7;
        if (i12 == 0) {
            zzb(b3, i11, zzlrVar.zzl());
            return true;
        }
        if (i12 == 1) {
            zza((zzmk<T, B>) b3, i11, zzlrVar.zzk());
            return true;
        }
        if (i12 == 2) {
            zza((zzmk<T, B>) b3, i11, zzlrVar.zzp());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                return false;
            }
            if (i12 == 5) {
                zza((zzmk<T, B>) b3, i11, zzlrVar.zzf());
                return true;
            }
            throw zzkb.zza();
        }
        B zza2 = zza();
        int i13 = 4 | (i11 << 3);
        int i14 = i10 + 1;
        if (i14 >= zza) {
            throw zzkb.zzh();
        }
        while (zzlrVar.zzc() != Integer.MAX_VALUE && zza((zzmk<T, B>) zza2, zzlrVar, i14)) {
        }
        if (i13 == zzlrVar.zzd()) {
            zza((zzmk<T, B>) b3, i11, (int) zze(zza2));
            return true;
        }
        throw zzkb.zzb();
    }

    public abstract int zzb(T t5);

    public abstract void zzb(B b3, int i10, long j3);

    public abstract void zzb(T t5, zznb zznbVar) throws IOException;

    public abstract void zzb(Object obj, B b3);

    public abstract B zzc(Object obj);

    public abstract void zzc(Object obj, T t5);

    public abstract T zzd(Object obj);

    public abstract T zze(B b3);

    public abstract void zzf(Object obj);
}
