package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
final class zzaty implements Runnable {
    private zzaty() {
        throw null;
    }

    public /* synthetic */ zzaty(zzatz zzatzVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzaua.zzd(MessageDigest.getInstance(SameMD5.TAG));
            countDownLatch = zzaua.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzaua.zzb;
        } catch (Throwable th2) {
            zzaua.zzb.countDown();
            throw th2;
        }
        countDownLatch.countDown();
    }
}
