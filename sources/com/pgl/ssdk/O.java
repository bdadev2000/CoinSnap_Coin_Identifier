package com.pgl.ssdk;

import com.pgl.ssdk.N;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes3.dex */
public class O<T extends N> {

    /* renamed from: a, reason: collision with root package name */
    private BlockingQueue<T> f19548a = new LinkedBlockingQueue();

    private O(int i9) {
    }

    public static O a(int i9) {
        return new O(i9);
    }

    public T a() {
        return this.f19548a.poll();
    }
}
