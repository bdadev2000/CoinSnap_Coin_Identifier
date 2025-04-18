package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.facebook.ads.redexgen.X.6a, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class CallableC03176a implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ C03226f A01;

    public CallableC03176a(C03226f c03226f, C03186b c03186b) {
        this.A01 = c03226f;
        new Handler(Looper.getMainLooper()).post(new C1048Zv(this, c03226f, c03186b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C03186b c03186b) {
        C7j c7j;
        C7j c7j2;
        long currentTimeMillis = System.currentTimeMillis();
        c7j = this.A01.A04;
        RW A05 = RW.A05(c7j.A01());
        Uri A00 = L5.A00(c03186b.A08);
        long j2 = c03186b.A00;
        if (j2 == -1) {
            c7j2 = this.A01.A04;
            j2 = C0608Im.A0Q(c7j2);
        }
        A05.A0G(A00, new C1047Zu(this, c03186b, j2, currentTimeMillis), j2);
    }
}
