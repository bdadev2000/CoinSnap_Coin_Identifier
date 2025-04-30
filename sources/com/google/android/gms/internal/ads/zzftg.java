package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzftg {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfth zzc;
    private final zzfre zzd;
    private final zzfqx zze;

    @Nullable
    private zzfsv zzf;
    private final Object zzg = new Object();

    public zzftg(@NonNull Context context, @NonNull zzfth zzfthVar, @NonNull zzfre zzfreVar, @NonNull zzfqx zzfqxVar) {
        this.zzb = context;
        this.zzc = zzfthVar;
        this.zzd = zzfreVar;
        this.zze = zzfqxVar;
    }

    private final synchronized Class zzd(@NonNull zzfsw zzfswVar) throws zzftf {
        try {
            String zzk = zzfswVar.zza().zzk();
            HashMap hashMap = zza;
            Class cls = (Class) hashMap.get(zzk);
            if (cls != null) {
                return cls;
            }
            try {
                if (this.zze.zza(zzfswVar.zzc())) {
                    try {
                        File zzb = zzfswVar.zzb();
                        if (!zzb.exists()) {
                            zzb.mkdirs();
                        }
                        Class<?> loadClass = new DexClassLoader(zzfswVar.zzc().getAbsolutePath(), zzb.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                        hashMap.put(zzk, loadClass);
                        return loadClass;
                    } catch (ClassNotFoundException e4) {
                        e = e4;
                        throw new zzftf(2008, e);
                    } catch (IllegalArgumentException e9) {
                        e = e9;
                        throw new zzftf(2008, e);
                    } catch (SecurityException e10) {
                        e = e10;
                        throw new zzftf(2008, e);
                    }
                }
                throw new zzftf(2026, "VM did not pass signature verification");
            } catch (GeneralSecurityException e11) {
                throw new zzftf(2026, e11);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Nullable
    public final zzfrh zza() {
        zzfsv zzfsvVar;
        synchronized (this.zzg) {
            zzfsvVar = this.zzf;
        }
        return zzfsvVar;
    }

    @Nullable
    public final zzfsw zzb() {
        synchronized (this.zzg) {
            try {
                zzfsv zzfsvVar = this.zzf;
                if (zzfsvVar != null) {
                    return zzfsvVar.zzf();
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzc(@NonNull zzfsw zzfswVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfsv zzfsvVar = new zzfsv(zzd(zzfswVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfswVar.zze(), null, new Bundle(), 2), zzfswVar, this.zzc, this.zzd);
                if (zzfsvVar.zzh()) {
                    int zze = zzfsvVar.zze();
                    if (zze == 0) {
                        synchronized (this.zzg) {
                            zzfsv zzfsvVar2 = this.zzf;
                            if (zzfsvVar2 != null) {
                                try {
                                    zzfsvVar2.zzg();
                                } catch (zzftf e4) {
                                    this.zzd.zzc(e4.zza(), -1L, e4);
                                }
                            }
                            this.zzf = zzfsvVar;
                        }
                        this.zzd.zzd(3000, System.currentTimeMillis() - currentTimeMillis);
                        return true;
                    }
                    throw new zzftf(4001, "ci: " + zze);
                }
                throw new zzftf(4000, "init failed");
            } catch (Exception e9) {
                throw new zzftf(2004, e9);
            }
        } catch (zzftf e10) {
            this.zzd.zzc(e10.zza(), System.currentTimeMillis() - currentTimeMillis, e10);
            return false;
        } catch (Exception e11) {
            this.zzd.zzc(4010, System.currentTimeMillis() - currentTimeMillis, e11);
            return false;
        }
    }
}
