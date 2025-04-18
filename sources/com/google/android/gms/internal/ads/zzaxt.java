package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public abstract class zzaxt implements Callable {
    protected final zzawf zza;
    protected final String zzb;
    protected final String zzc;
    protected final zzasf zzd;
    protected Method zze;
    protected final int zzf;
    protected final int zzg;

    public zzaxt(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i10, int i11) {
        this.zza = zzawfVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzasfVar;
        this.zzf = i10;
        this.zzg = i11;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() throws Exception {
        zzk();
        return null;
    }

    public abstract void zza() throws IllegalAccessException, InvocationTargetException;

    public Void zzk() throws Exception {
        int i10;
        try {
            long nanoTime = System.nanoTime();
            Method zzj = this.zza.zzj(this.zzb, this.zzc);
            this.zze = zzj;
            if (zzj != null) {
                zza();
                zzauw zzd = this.zza.zzd();
                if (zzd != null && (i10 = this.zzf) != Integer.MIN_VALUE) {
                    zzd.zzc(this.zzg, i10, (System.nanoTime() - nanoTime) / 1000, null, null);
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
