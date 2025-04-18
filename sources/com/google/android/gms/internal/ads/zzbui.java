package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbui implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ Thread.UncaughtExceptionHandler zza;
    final /* synthetic */ zzbuj zzb;

    public zzbui(zzbuj zzbujVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zza = uncaughtExceptionHandler;
        this.zzb = zzbujVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        try {
            try {
                this.zzb.zzg(thread, th2);
            } catch (Throwable unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("AdMob exception reporter failed reporting the exception.");
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.zza;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th2);
            }
        } catch (Throwable th3) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.zza;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th2);
            }
            throw th3;
        }
    }
}
