package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public abstract class zzayc implements Callable {
    protected final zzawo zza;
    protected final String zzb;
    protected final String zzc;
    protected final zzasm zzd;
    protected Method zze;
    protected final int zzf;
    protected final int zzg;

    public zzayc(zzawo zzawoVar, String str, String str2, zzasm zzasmVar, int i2, int i3) {
        this.zza = zzawoVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzasmVar;
        this.zzf = i2;
        this.zzg = i3;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() throws Exception {
        zzk();
        return null;
    }

    public abstract void zza() throws IllegalAccessException, InvocationTargetException;

    public Void zzk() throws Exception {
        int i2;
        try {
            long nanoTime = System.nanoTime();
            Method zzj = this.zza.zzj(this.zzb, this.zzc);
            this.zze = zzj;
            if (zzj == null) {
                return null;
            }
            zza();
            zzavh zzd = this.zza.zzd();
            if (zzd == null || (i2 = this.zzf) == Integer.MIN_VALUE) {
                return null;
            }
            zzd.zzc(this.zzg, i2, (System.nanoTime() - nanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
