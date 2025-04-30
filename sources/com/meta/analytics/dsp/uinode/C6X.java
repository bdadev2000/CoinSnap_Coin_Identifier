package com.meta.analytics.dsp.uinode;

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
    public final /* synthetic */ C09416c A01;

    public C6X(C09416c c09416c, C6Y c6y) {
        this.A01 = c09416c;
        new Handler(Looper.getMainLooper()).post(new C1639Yq(this, c09416c, c6y));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C6Y c6y) {
        C09647f c09647f;
        C09647f c09647f2;
        long currentTimeMillis = System.currentTimeMillis();
        c09647f = this.A01.A04;
        R0 A05 = R0.A05(c09647f.A01());
        Uri A00 = AbstractC1287Ky.A00(c6y.A08);
        long j7 = c6y.A00;
        if (j7 == -1) {
            c09647f2 = this.A01.A04;
            j7 = C1225Ih.A0O(c09647f2);
        }
        A05.A0G(A00, new C1638Yp(this, c6y, j7, currentTimeMillis), j7);
    }
}
