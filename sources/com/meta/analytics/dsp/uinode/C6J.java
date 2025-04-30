package com.meta.analytics.dsp.uinode;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.6J, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6J implements ServiceConnection {
    public static byte[] A02;
    public final BlockingQueue<IBinder> A00;
    public final AtomicBoolean A01;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 48);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{Ascii.US, 52, 51, 57, 56, 47, 125, 60, 49, 47, 56, 60, 57, 36, 125, 62, 50, 51, 46, 40, 48, 56, 57};
    }

    public C6J() {
        this.A01 = new AtomicBoolean(false);
        this.A00 = new LinkedBlockingDeque();
    }

    public final IBinder A02() throws InterruptedException {
        if (!this.A01.compareAndSet(true, true)) {
            return this.A00.take();
        }
        throw new IllegalStateException(A00(0, 23, 109));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                this.A00.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
