package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Striped;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28816a;

    public /* synthetic */ j(int i2) {
        this.f28816a = i2;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f28816a) {
            case 0:
                return new Striped.WeakSafeReadWriteLock();
            case 1:
                return new Striped.PaddedLock();
            case 2:
                return new ReentrantReadWriteLock();
            default:
                return Striped.b();
        }
    }
}
