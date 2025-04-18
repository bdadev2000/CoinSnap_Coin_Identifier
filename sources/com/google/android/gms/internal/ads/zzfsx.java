package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzfsx {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfsy zzc;
    private final zzfqz zzd;
    private final zzfqu zze;

    @Nullable
    private zzfsm zzf;
    private final Object zzg = new Object();

    public zzfsx(@NonNull Context context, @NonNull zzfsy zzfsyVar, @NonNull zzfqz zzfqzVar, @NonNull zzfqu zzfquVar) {
        this.zzb = context;
        this.zzc = zzfsyVar;
        this.zzd = zzfqzVar;
        this.zze = zzfquVar;
    }

    private final synchronized Class zzd(@NonNull zzfsn zzfsnVar) throws zzfsw {
        try {
            String zzk = zzfsnVar.zza().zzk();
            HashMap hashMap = zza;
            Class cls = (Class) hashMap.get(zzk);
            if (cls != null) {
                return cls;
            }
            try {
                if (!this.zze.zza(zzfsnVar.zzc())) {
                    throw new zzfsw(2026, "VM did not pass signature verification");
                }
                try {
                    File zzb = zzfsnVar.zzb();
                    if (!zzb.exists()) {
                        zzb.mkdirs();
                    }
                    Class<?> loadClass = new DexClassLoader(zzfsnVar.zzc().getAbsolutePath(), zzb.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    hashMap.put(zzk, loadClass);
                    return loadClass;
                } catch (ClassNotFoundException e) {
                    e = e;
                    throw new zzfsw(AdError.REMOTE_ADS_SERVICE_ERROR, e);
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    throw new zzfsw(AdError.REMOTE_ADS_SERVICE_ERROR, e);
                } catch (SecurityException e3) {
                    e = e3;
                    throw new zzfsw(AdError.REMOTE_ADS_SERVICE_ERROR, e);
                }
            } catch (GeneralSecurityException e4) {
                throw new zzfsw(2026, e4);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Nullable
    public final zzfrc zza() {
        zzfsm zzfsmVar;
        synchronized (this.zzg) {
            zzfsmVar = this.zzf;
        }
        return zzfsmVar;
    }

    @Nullable
    public final zzfsn zzb() {
        synchronized (this.zzg) {
            try {
                zzfsm zzfsmVar = this.zzf;
                if (zzfsmVar == null) {
                    return null;
                }
                return zzfsmVar.zzf();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzc(@NonNull zzfsn zzfsnVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfsm zzfsmVar = new zzfsm(zzd(zzfsnVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfsnVar.zze(), null, new Bundle(), 2), zzfsnVar, this.zzc, this.zzd);
                if (!zzfsmVar.zzh()) {
                    throw new zzfsw(4000, "init failed");
                }
                int zze = zzfsmVar.zze();
                if (zze != 0) {
                    throw new zzfsw(4001, "ci: " + zze);
                }
                synchronized (this.zzg) {
                    zzfsm zzfsmVar2 = this.zzf;
                    if (zzfsmVar2 != null) {
                        try {
                            zzfsmVar2.zzg();
                        } catch (zzfsw e) {
                            this.zzd.zzc(e.zza(), -1L, e);
                        }
                    }
                    this.zzf = zzfsmVar;
                }
                this.zzd.zzd(3000, System.currentTimeMillis() - currentTimeMillis);
                return true;
            } catch (Exception e2) {
                throw new zzfsw(AdError.INTERNAL_ERROR_2004, e2);
            }
        } catch (zzfsw e3) {
            this.zzd.zzc(e3.zza(), System.currentTimeMillis() - currentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.zzd.zzc(4010, System.currentTimeMillis() - currentTimeMillis, e4);
            return false;
        }
    }
}
