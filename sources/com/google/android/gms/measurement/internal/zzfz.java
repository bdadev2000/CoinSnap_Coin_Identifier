package com.google.android.gms.measurement.internal;

import androidx.annotation.GuardedBy;

/* loaded from: classes3.dex */
public final class zzfz<V> {
    private static final Object zza = new Object();
    private final String zzb;
    private final zzfx<V> zzc;
    private final V zzd;
    private final Object zze;

    @GuardedBy
    private volatile V zzf;

    @GuardedBy
    private volatile V zzg;

    public final String zza() {
        return this.zzb;
    }

    private zzfz(String str, V v2, V v3, zzfx<V> zzfxVar) {
        this.zze = new Object();
        this.zzf = null;
        this.zzg = null;
        this.zzb = str;
        this.zzd = v2;
        this.zzc = zzfxVar;
    }

    public final V zza(V v2) {
        synchronized (this.zze) {
        }
        if (v2 != null) {
            return v2;
        }
        if (zzga.zza == null) {
            return this.zzd;
        }
        synchronized (zza) {
            try {
                if (zzab.zza()) {
                    return this.zzg == null ? this.zzd : this.zzg;
                }
                try {
                    for (zzfz zzfzVar : zzbh.zzdl()) {
                        if (!zzab.zza()) {
                            V v3 = null;
                            try {
                                zzfx<V> zzfxVar = zzfzVar.zzc;
                                if (zzfxVar != null) {
                                    v3 = zzfxVar.zza();
                                }
                            } catch (IllegalStateException unused) {
                            }
                            synchronized (zza) {
                                zzfzVar.zzg = v3;
                            }
                        } else {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                    }
                } catch (SecurityException unused2) {
                }
                zzfx<V> zzfxVar2 = this.zzc;
                if (zzfxVar2 == null) {
                    return this.zzd;
                }
                try {
                    return zzfxVar2.zza();
                } catch (IllegalStateException unused3) {
                    return this.zzd;
                } catch (SecurityException unused4) {
                    return this.zzd;
                }
            } finally {
            }
        }
    }
}
