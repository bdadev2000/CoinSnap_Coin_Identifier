package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class zzayb {
    private final zzawo zza;
    private final String zzb;
    private final String zzc;
    private final Class[] zze;
    private volatile Method zzd = null;
    private final CountDownLatch zzf = new CountDownLatch(1);

    public zzayb(zzawo zzawoVar, String str, String str2, Class... clsArr) {
        this.zza = zzawoVar;
        this.zzb = str;
        this.zzc = str2;
        this.zze = clsArr;
        zzawoVar.zzk().submit(new zzaya(this));
    }

    public static /* bridge */ /* synthetic */ void zzb(zzayb zzaybVar) {
        try {
            zzawo zzawoVar = zzaybVar.zza;
            Class<?> loadClass = zzawoVar.zzi().loadClass(zzaybVar.zzc(zzawoVar.zzu(), zzaybVar.zzb));
            if (loadClass != null) {
                zzaybVar.zzd = loadClass.getMethod(zzaybVar.zzc(zzaybVar.zza.zzu(), zzaybVar.zzc), zzaybVar.zze);
            }
        } catch (zzavs | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th) {
            zzaybVar.zzf.countDown();
            throw th;
        }
        zzaybVar.zzf.countDown();
    }

    private final String zzc(byte[] bArr, String str) throws zzavs, UnsupportedEncodingException {
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
