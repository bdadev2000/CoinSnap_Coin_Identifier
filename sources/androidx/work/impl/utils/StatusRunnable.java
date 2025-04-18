package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.WorkInfo;
import java.util.List;

@RestrictTo
/* loaded from: classes4.dex */
public abstract class StatusRunnable<T> implements Runnable {

    /* renamed from: androidx.work.impl.utils.StatusRunnable$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass1 extends StatusRunnable<List<WorkInfo>> {
        @Override // androidx.work.impl.utils.StatusRunnable
        public final Object a() {
            throw null;
        }
    }

    /* renamed from: androidx.work.impl.utils.StatusRunnable$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass2 extends StatusRunnable<WorkInfo> {
        @Override // androidx.work.impl.utils.StatusRunnable
        public final Object a() {
            throw null;
        }
    }

    /* renamed from: androidx.work.impl.utils.StatusRunnable$3, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass3 extends StatusRunnable<List<WorkInfo>> {
        @Override // androidx.work.impl.utils.StatusRunnable
        public final Object a() {
            throw null;
        }
    }

    /* renamed from: androidx.work.impl.utils.StatusRunnable$4, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass4 extends StatusRunnable<List<WorkInfo>> {
        @Override // androidx.work.impl.utils.StatusRunnable
        public final Object a() {
            throw null;
        }
    }

    /* renamed from: androidx.work.impl.utils.StatusRunnable$5, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass5 extends StatusRunnable<List<WorkInfo>> {
        @Override // androidx.work.impl.utils.StatusRunnable
        public final Object a() {
            throw null;
        }
    }

    public abstract Object a();

    /* JADX WARN: Code restructure failed: missing block: B:6:?, code lost:
    
        throw null;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r1 = this;
            r0 = 0
            r1.a()     // Catch: java.lang.Throwable -> L5
            throw r0     // Catch: java.lang.Throwable -> L5
        L5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.StatusRunnable.run():void");
    }
}
