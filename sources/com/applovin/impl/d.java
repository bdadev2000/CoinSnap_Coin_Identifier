package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class d extends pp {

    /* renamed from: a, reason: collision with root package name */
    private b f23387a = b.NOT_READY;

    /* renamed from: b, reason: collision with root package name */
    private Object f23388b;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23389a;

        static {
            int[] iArr = new int[b.values().length];
            f23389a = iArr;
            try {
                iArr[b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23389a[b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    private boolean c() {
        this.f23387a = b.FAILED;
        this.f23388b = a();
        if (this.f23387a == b.DONE) {
            return false;
        }
        this.f23387a = b.READY;
        return true;
    }

    public abstract Object a();

    public final Object b() {
        this.f23387a = b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Preconditions.checkState(this.f23387a != b.FAILED);
        int i2 = a.f23389a[this.f23387a.ordinal()];
        if (i2 == 1) {
            return false;
        }
        if (i2 != 2) {
            return c();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f23387a = b.NOT_READY;
        Object obj = this.f23388b;
        this.f23388b = null;
        return obj;
    }
}
