package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.facebook.ads.redexgen.X.6X, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C6X implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ C03756c A01;

    public C6X(C03756c c03756c, C6Y c6y) {
        this.A01 = c03756c;
        new Handler(Looper.getMainLooper()).post(new C1073Yq(this, c03756c, c6y));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C6Y c6y) {
        C03987f c03987f;
        C03987f c03987f2;
        long currentTimeMillis = System.currentTimeMillis();
        c03987f = this.A01.A04;
        R0 A05 = R0.A05(c03987f.A01());
        Uri A00 = AbstractC0721Ky.A00(c6y.A08);
        long j3 = c6y.A00;
        if (j3 == -1) {
            c03987f2 = this.A01.A04;
            j3 = C0659Ih.A0O(c03987f2);
        }
        A05.A0G(A00, new C1072Yp(this, c6y, j3, currentTimeMillis), j3);
    }
}
