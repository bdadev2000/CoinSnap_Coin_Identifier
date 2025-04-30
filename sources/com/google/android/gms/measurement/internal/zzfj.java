package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
public final class zzfj<V> {
    private static final Object zza = new Object();
    private final String zzb;
    private final zzfh<V> zzc;
    private final V zzd;
    private final Object zze;
    private volatile V zzf;
    private volatile V zzg;

    public final V zza(V v6) {
        synchronized (this.zze) {
        }
        if (v6 != null) {
            return v6;
        }
        if (zzfk.zza == null) {
            return this.zzd;
        }
        synchronized (zza) {
            try {
                if (zzab.zza()) {
                    return this.zzg == null ? this.zzd : this.zzg;
                }
                try {
                    for (zzfj zzfjVar : zzbf.zzcy()) {
                        if (!zzab.zza()) {
                            V v9 = null;
                            try {
                                zzfh<V> zzfhVar = zzfjVar.zzc;
                                if (zzfhVar != null) {
                                    v9 = zzfhVar.zza();
                                }
                            } catch (IllegalStateException unused) {
                            }
                            synchronized (zza) {
                                zzfjVar.zzg = v9;
                            }
                        } else {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                    }
                } catch (SecurityException unused2) {
                }
                zzfh<V> zzfhVar2 = this.zzc;
                if (zzfhVar2 == null) {
                    return this.zzd;
                }
                try {
                    return zzfhVar2.zza();
                } catch (IllegalStateException unused3) {
                    return this.zzd;
                } catch (SecurityException unused4) {
                    return this.zzd;
                }
            } finally {
            }
        }
    }

    private zzfj(String str, V v6, V v9, zzfh<V> zzfhVar, boolean z8) {
        this.zze = new Object();
        this.zzf = null;
        this.zzg = null;
        this.zzb = str;
        this.zzd = v6;
        this.zzc = zzfhVar;
    }

    public final String zza() {
        return this.zzb;
    }
}
