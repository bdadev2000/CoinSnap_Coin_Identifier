package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public abstract class zzazs implements Callable {
    protected final String zza = getClass().getSimpleName();
    protected final zzaye zzb;
    protected final String zzc;
    protected final String zzd;
    protected final zzatp zze;
    protected Method zzf;
    protected final int zzg;
    protected final int zzh;

    public zzazs(zzaye zzayeVar, String str, String str2, zzatp zzatpVar, int i9, int i10) {
        this.zzb = zzayeVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzatpVar;
        this.zzg = i9;
        this.zzh = i10;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() throws Exception {
        zzl();
        return null;
    }

    public abstract void zza() throws IllegalAccessException, InvocationTargetException;

    public Void zzl() throws Exception {
        int i9;
        try {
            long nanoTime = System.nanoTime();
            Method zzj = this.zzb.zzj(this.zzc, this.zzd);
            this.zzf = zzj;
            if (zzj != null) {
                zza();
                zzawy zzd = this.zzb.zzd();
                if (zzd != null && (i9 = this.zzg) != Integer.MIN_VALUE) {
                    zzd.zzc(this.zzh, i9, (System.nanoTime() - nanoTime) / 1000, null, null);
                    return null;
                }
                return null;
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
