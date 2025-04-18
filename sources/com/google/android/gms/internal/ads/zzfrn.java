package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzfrn {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfro zzc;
    private final zzfpp zzd;
    private final zzfpk zze;

    @Nullable
    private zzfrc zzf;
    private final Object zzg = new Object();

    public zzfrn(@NonNull Context context, @NonNull zzfro zzfroVar, @NonNull zzfpp zzfppVar, @NonNull zzfpk zzfpkVar) {
        this.zzb = context;
        this.zzc = zzfroVar;
        this.zzd = zzfppVar;
        this.zze = zzfpkVar;
    }

    private final synchronized Class zzd(@NonNull zzfrd zzfrdVar) throws zzfrm {
        String zzk = zzfrdVar.zza().zzk();
        HashMap hashMap = zza;
        Class cls = (Class) hashMap.get(zzk);
        if (cls != null) {
            return cls;
        }
        try {
            if (this.zze.zza(zzfrdVar.zzc())) {
                try {
                    File zzb = zzfrdVar.zzb();
                    if (!zzb.exists()) {
                        zzb.mkdirs();
                    }
                    Class<?> loadClass = new DexClassLoader(zzfrdVar.zzc().getAbsolutePath(), zzb.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    hashMap.put(zzk, loadClass);
                    return loadClass;
                } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e2) {
                    throw new zzfrm(2008, e2);
                }
            }
            throw new zzfrm(2026, "VM did not pass signature verification");
        } catch (GeneralSecurityException e10) {
            throw new zzfrm(2026, e10);
        }
    }

    @Nullable
    public final zzfps zza() {
        zzfrc zzfrcVar;
        synchronized (this.zzg) {
            zzfrcVar = this.zzf;
        }
        return zzfrcVar;
    }

    @Nullable
    public final zzfrd zzb() {
        synchronized (this.zzg) {
            zzfrc zzfrcVar = this.zzf;
            if (zzfrcVar != null) {
                return zzfrcVar.zzf();
            }
            return null;
        }
    }

    public final boolean zzc(@NonNull zzfrd zzfrdVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfrc zzfrcVar = new zzfrc(zzd(zzfrdVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfrdVar.zze(), null, new Bundle(), 2), zzfrdVar, this.zzc, this.zzd);
                if (zzfrcVar.zzh()) {
                    int zze = zzfrcVar.zze();
                    if (zze == 0) {
                        synchronized (this.zzg) {
                            zzfrc zzfrcVar2 = this.zzf;
                            if (zzfrcVar2 != null) {
                                try {
                                    zzfrcVar2.zzg();
                                } catch (zzfrm e2) {
                                    this.zzd.zzc(e2.zza(), -1L, e2);
                                }
                            }
                            this.zzf = zzfrcVar;
                        }
                        this.zzd.zzd(3000, System.currentTimeMillis() - currentTimeMillis);
                        return true;
                    }
                    throw new zzfrm(4001, "ci: " + zze);
                }
                throw new zzfrm(4000, "init failed");
            } catch (Exception e10) {
                throw new zzfrm(2004, e10);
            }
        } catch (zzfrm e11) {
            this.zzd.zzc(e11.zza(), System.currentTimeMillis() - currentTimeMillis, e11);
            return false;
        } catch (Exception e12) {
            this.zzd.zzc(4010, System.currentTimeMillis() - currentTimeMillis, e12);
            return false;
        }
    }
}
