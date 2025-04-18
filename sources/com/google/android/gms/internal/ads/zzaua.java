package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes4.dex */
final class zzaua implements Runnable {
    private zzaua() {
        throw null;
    }

    public /* synthetic */ zzaua(zzatz zzatzVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzaub.zzc(MessageDigest.getInstance("MD5"));
            countDownLatch = zzaub.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzaub.zzb;
        } catch (Throwable th) {
            zzaub.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
