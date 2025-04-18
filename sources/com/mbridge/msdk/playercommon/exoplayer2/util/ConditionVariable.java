package com.mbridge.msdk.playercommon.exoplayer2.util;

/* loaded from: classes4.dex */
public final class ConditionVariable {
    private boolean isOpen;

    public final synchronized void block() throws InterruptedException {
        while (!this.isOpen) {
            wait();
        }
    }

    public final synchronized boolean close() {
        boolean z10;
        z10 = this.isOpen;
        this.isOpen = false;
        return z10;
    }

    public final synchronized boolean open() {
        if (this.isOpen) {
            return false;
        }
        this.isOpen = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean block(long j3) throws InterruptedException {
        boolean z10;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j10 = j3 + elapsedRealtime;
        while (true) {
            z10 = this.isOpen;
            if (z10 || elapsedRealtime >= j10) {
                break;
            }
            wait(j10 - elapsedRealtime);
            elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        }
        return z10;
    }
}
