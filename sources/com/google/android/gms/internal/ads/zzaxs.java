package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzaxs {
    private final zzawf zza;
    private final String zzb;
    private final String zzc;
    private final Class[] zze;
    private volatile Method zzd = null;
    private final CountDownLatch zzf = new CountDownLatch(1);

    public zzaxs(zzawf zzawfVar, String str, String str2, Class... clsArr) {
        this.zza = zzawfVar;
        this.zzb = str;
        this.zzc = str2;
        this.zze = clsArr;
        zzawfVar.zzk().submit(new zzaxr(this));
    }

    public static /* bridge */ /* synthetic */ void zzb(zzaxs zzaxsVar) {
        try {
            zzawf zzawfVar = zzaxsVar.zza;
            Class<?> loadClass = zzawfVar.zzi().loadClass(zzaxsVar.zzc(zzawfVar.zzu(), zzaxsVar.zzb));
            if (loadClass != null) {
                zzaxsVar.zzd = loadClass.getMethod(zzaxsVar.zzc(zzaxsVar.zza.zzu(), zzaxsVar.zzc), zzaxsVar.zze);
            }
        } catch (zzavj | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th2) {
            zzaxsVar.zzf.countDown();
            throw th2;
        }
        zzaxsVar.zzf.countDown();
    }

    private final String zzc(byte[] bArr, String str) throws zzavj, UnsupportedEncodingException {
        return new String(this.zza.zze().zzb(bArr, str), "UTF-8");
    }

    public final Method zza() {
        if (this.zzd != null) {
            return this.zzd;
        }
        try {
            if (this.zzf.await(2L, TimeUnit.SECONDS)) {
                return this.zzd;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
