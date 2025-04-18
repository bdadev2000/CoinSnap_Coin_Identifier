package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class IX implements Choreographer.FrameCallback, Handler.Callback {
    public static byte[] A05;
    public static String[] A06 = {"iaBjp1AwQpLLyKyeruBkx6nhfTHAU7OM", "YE4EgMmckJIUd", "A87", "Ho8PurbR6Cuk9", "5V8W8EI9U29WYa7jcvhHGtBRQdjRXn2G", "xaEjUNqWNgJl7N86hHENKKoi0wcRoA", "gba", "E6ac03H168kqXbQykfGaXhm8c3r5vcbJ"};
    public static final IX A07;
    public int A00;
    public Choreographer A01;
    public final Handler A02;
    public volatile long A04 = -9223372036854775807L;
    public final HandlerThread A03 = new HandlerThread(A01(0, 26, 0));

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 44);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        byte[] bArr = {111, 68, 67, 94, 73, 67, 75, 94, 77, 92, 68, 73, 94, 99, 91, 66, 73, 94, 22, 100, 77, 66, 72, 64, 73, 94};
        String[] strArr = A06;
        if (strArr[6].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[1] = "IihRFBQ0QWx9C";
        strArr2[3] = "2DRBdjbeYJhWc";
        A05 = bArr;
    }

    static {
        A05();
        A07 = new IX();
    }

    public IX() {
        this.A03.start();
        this.A02 = new Handler(this.A03.getLooper(), this);
        this.A02.sendEmptyMessage(0);
    }

    public static IX A00() {
        return A07;
    }

    private void A02() {
        this.A00++;
        if (this.A00 == 1) {
            this.A01.postFrameCallback(this);
        }
    }

    private void A03() {
        this.A01 = Choreographer.getInstance();
    }

    private void A04() {
        this.A00--;
        if (this.A00 == 0) {
            this.A01.removeFrameCallback(this);
            this.A04 = -9223372036854775807L;
        }
    }

    public final void A06() {
        this.A02.sendEmptyMessage(1);
    }

    public final void A07() {
        this.A02.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        this.A04 = j2;
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
                String[] strArr = A06;
                if (strArr[1].length() != strArr[3].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A06;
                strArr2[6] = "Hfi";
                strArr2[2] = "XBf";
                return true;
            default:
                return false;
        }
    }
}
