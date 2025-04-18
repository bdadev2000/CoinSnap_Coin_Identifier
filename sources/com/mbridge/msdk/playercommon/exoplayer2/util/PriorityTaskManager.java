package com.mbridge.msdk.playercommon.exoplayer2.util;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;

/* loaded from: classes4.dex */
public final class PriorityTaskManager {
    private final Object lock = new Object();
    private final PriorityQueue<Integer> queue = new PriorityQueue<>(10, Collections.reverseOrder());
    private int highestPriority = Integer.MIN_VALUE;

    /* loaded from: classes4.dex */
    public static class PriorityTooLowException extends IOException {
        public PriorityTooLowException(int i10, int i11) {
            super(a.j("Priority too low [priority=", i10, ", highest=", i11, "]"));
        }
    }

    public final void add(int i10) {
        synchronized (this.lock) {
            this.queue.add(Integer.valueOf(i10));
            this.highestPriority = Math.max(this.highestPriority, i10);
        }
    }

    public final void proceed(int i10) throws InterruptedException {
        synchronized (this.lock) {
            while (this.highestPriority != i10) {
                this.lock.wait();
            }
        }
    }

    public final boolean proceedNonBlocking(int i10) {
        boolean z10;
        synchronized (this.lock) {
            if (this.highestPriority == i10) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void proceedOrThrow(int i10) throws PriorityTooLowException {
        synchronized (this.lock) {
            if (this.highestPriority != i10) {
                throw new PriorityTooLowException(i10, this.highestPriority);
            }
        }
    }

    public final void remove(int i10) {
        int intValue;
        synchronized (this.lock) {
            this.queue.remove(Integer.valueOf(i10));
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
