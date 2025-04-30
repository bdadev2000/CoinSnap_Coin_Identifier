package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class IS implements Choreographer.FrameCallback, Handler.Callback {
    public static byte[] A05;
    public static final IS A06;
    public int A00;
    public Choreographer A01;
    public final Handler A02;
    public final HandlerThread A03;
    public volatile long A04 = C.TIME_UNSET;

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 91);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{105, 66, 69, 88, 79, 69, 77, 88, 75, 90, 66, 79, 88, 101, 93, 68, 79, 88, Ascii.DLE, 98, 75, 68, 78, 70, 79, 88};
    }

    static {
        A05();
        A06 = new IS();
    }

    public IS() {
        HandlerThread handlerThread = new HandlerThread(A01(0, 26, 113));
        this.A03 = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.A02 = handler;
        handler.sendEmptyMessage(0);
    }

    public static IS A00() {
        return A06;
    }

    private void A02() {
        int i9 = this.A00 + 1;
        this.A00 = i9;
        if (i9 == 1) {
            this.A01.postFrameCallback(this);
        }
    }

    private void A03() {
        this.A01 = Choreographer.getInstance();
    }

    private void A04() {
        int i9 = this.A00 - 1;
        this.A00 = i9;
        if (i9 == 0) {
            this.A01.removeFrameCallback(this);
            this.A04 = C.TIME_UNSET;
        }
    }

    public final void A06() {
        this.A02.sendEmptyMessage(1);
    }

    public final void A07() {
        this.A02.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j7) {
        this.A04 = j7;
        this.A01.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                A03();
                return true;
            case 1:
                A02();
                return true;
            case 2:
                A04();
                return true;
            default:
                return false;
        }
    }
}
