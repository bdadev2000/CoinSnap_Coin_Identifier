package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes4.dex */
abstract class zzmk<T, B> {
    private static volatile int zza = 100;

    public abstract int zza(T t2);

    public abstract B zza();

    public abstract T zza(T t2, T t3);

    public abstract void zza(B b2, int i2, int i3);

    public abstract void zza(B b2, int i2, long j2);

    public abstract void zza(B b2, int i2, zzik zzikVar);

    public abstract void zza(B b2, int i2, T t2);

    public abstract void zza(T t2, zznb zznbVar) throws IOException;

    public abstract boolean zza(zzlr zzlrVar);

    public final boolean zza(B b2, zzlr zzlrVar, int i2) throws IOException {
        int zzd = zzlrVar.zzd();
        int i3 = zzd >>> 3;
        int i4 = zzd & 7;
        if (i4 == 0) {
            zzb(b2, i3, zzlrVar.zzl());
            return true;
        }
        if (i4 == 1) {
            zza((zzmk<T, B>) b2, i3, zzlrVar.zzk());
            return true;
        }
        if (i4 == 2) {
            zza((zzmk<T, B>) b2, i3, zzlrVar.zzp());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 == 5) {
                zza((zzmk<T, B>) b2, i3, zzlrVar.zzf());
                return true;
            }
            throw zzkb.zza();
        }
        B zza2 = zza();
        int i5 = 4 | (i3 << 3);
        int i6 = i2 + 1;
        if (i6 >= zza) {
            throw zzkb.zzh();
        }
        while (zzlrVar.zzc() != Integer.MAX_VALUE && zza((zzmk<T, B>) zza2, zzlrVar, i6)) {
        }
        if (i5 == zzlrVar.zzd()) {
            zza((zzmk<T, B>) b2, i3, (int) zze(zza2));
            return true;
        }
        throw zzkb.zzb();
    }

    public abstract int zzb(T t2);

    public abstract void zzb(B b2, int i2, long j2);

    public abstract void zzb(T t2, zznb zznbVar) throws IOException;

    public abstract void zzb(Object obj, B b2);

    public abstract B zzc(Object obj);

    public abstract void zzc(Object obj, T t2);

    public abstract T zzd(Object obj);

    public abstract T zze(B b2);

    public abstract void zzf(Object obj);
}
