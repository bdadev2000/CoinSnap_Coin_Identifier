package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.NoSuchElementException;

/* renamed from: com.applovin.impl.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0682d extends qp {

    /* renamed from: a, reason: collision with root package name */
    private b f7141a = b.NOT_READY;
    private Object b;

    /* renamed from: com.applovin.impl.d$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7142a;

        static {
            int[] iArr = new int[b.values().length];
            f7142a = iArr;
            try {
                iArr[b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7142a[b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.applovin.impl.d$b */
    /* loaded from: classes.dex */
    public enum b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    private boolean c() {
        this.f7141a = b.FAILED;
        this.b = a();
        if (this.f7141a != b.DONE) {
            this.f7141a = b.READY;
            return true;
        }
        return false;
    }

    public abstract Object a();

    public final Object b() {
        this.f7141a = b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z8;
        if (this.f7141a != b.FAILED) {
            z8 = true;
        } else {
            z8 = false;
        }
        Preconditions.checkState(z8);
        int i9 = a.f7142a[this.f7141a.ordinal()];
        if (i9 == 1) {
            return false;
        }
        if (i9 == 2) {
            return true;
        }
        return c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f7141a = b.NOT_READY;
            Object obj = this.b;
            this.b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
