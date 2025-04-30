package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
final class zzavr implements Runnable {
    private zzavr() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzavs.zzd(MessageDigest.getInstance(SameMD5.TAG));
            countDownLatch = zzavs.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzavs.zzb;
        } catch (Throwable th) {
            zzavs.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    public /* synthetic */ zzavr(zzavq zzavqVar) {
    }
}
