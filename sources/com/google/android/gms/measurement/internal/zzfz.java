package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
public final class zzfz<V> {
    private static final Object zza = new Object();
    private final String zzb;
    private final zzfx<V> zzc;
    private final V zzd;
    private final Object zze;
    private volatile V zzf;
    private volatile V zzg;

    public final V zza(V v10) {
        synchronized (this.zze) {
        }
        if (v10 != null) {
            return v10;
        }
        if (zzga.zza == null) {
            return this.zzd;
        }
        synchronized (zza) {
            if (zzab.zza()) {
                return this.zzg == null ? this.zzd : this.zzg;
            }
            try {
                for (zzfz zzfzVar : zzbh.zzdl()) {
                    if (!zzab.zza()) {
                        V v11 = null;
                        try {
                            zzfx<V> zzfxVar = zzfzVar.zzc;
                            if (zzfxVar != null) {
                                v11 = zzfxVar.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (zza) {
                            zzfzVar.zzg = v11;
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
        }
    }

    private zzfz(String str, V v10, V v11, zzfx<V> zzfxVar) {
        this.zze = new Object();
        this.zzf = null;
        this.zzg = null;
        this.zzb = str;
        this.zzd = v10;
        this.zzc = zzfxVar;
    }

    public final String zza() {
        return this.zzb;
    }
}
