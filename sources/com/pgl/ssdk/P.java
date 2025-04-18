package com.pgl.ssdk;

import com.pgl.ssdk.O;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes4.dex */
public class P<T extends O> {
    private BlockingQueue<T> a = new LinkedBlockingQueue();

    private P(int i10) {
    }

    public static P a(int i10) {
        return new P(i10);
    }

    public T a() {
        return this.a.poll();
    }
}
