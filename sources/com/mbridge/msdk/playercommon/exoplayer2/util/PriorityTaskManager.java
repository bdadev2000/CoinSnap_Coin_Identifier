package com.mbridge.msdk.playercommon.exoplayer2.util;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class PriorityTaskManager {
    private final Object lock = new Object();
    private final PriorityQueue<Integer> queue = new PriorityQueue<>(10, Collections.reverseOrder());
    private int highestPriority = Integer.MIN_VALUE;

    /* loaded from: classes3.dex */
    public static class PriorityTooLowException extends IOException {
        public PriorityTooLowException(int i9, int i10) {
            super(AbstractC2914a.c(i9, i10, "Priority too low [priority=", ", highest=", "]"));
        }
    }

    public final void add(int i9) {
        synchronized (this.lock) {
            this.queue.add(Integer.valueOf(i9));
            this.highestPriority = Math.max(this.highestPriority, i9);
        }
    }

    public final void proceed(int i9) throws InterruptedException {
        synchronized (this.lock) {
            while (this.highestPriority != i9) {
                try {
                    this.lock.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean proceedNonBlocking(int i9) {
        boolean z8;
        synchronized (this.lock) {
            if (this.highestPriority == i9) {
                z8 = true;
            } else {
                z8 = false;
            }
        }
        return z8;
    }

    public final void proceedOrThrow(int i9) throws PriorityTooLowException {
        synchronized (this.lock) {
            try {
                if (this.highestPriority != i9) {
                    throw new PriorityTooLowException(i9, this.highestPriority);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void remove(int i9) {
        int intValue;
        synchronized (this.lock) {
            this.queue.remove(Integer.valueOf(i9));
            if (this.queue.isEmpty()) {
                intValue = Integer.MIN_VALUE;
            } else {
                intValue = this.queue.peek().intValue();
            }
            this.highestPriority = intValue;
            this.lock.notifyAll();
        }
    }
}
