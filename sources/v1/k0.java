package v1;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25915b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f25916c;

    public /* synthetic */ k0(l0 l0Var, int i10) {
        this.f25915b = i10;
        this.f25916c = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor queryExecutor;
        AtomicBoolean atomicBoolean;
        boolean z10;
        int i10 = this.f25915b;
        l0 this$0 = this.f25916c;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f25923h.compareAndSet(false, true)) {
                    u invalidationTracker = this$0.a.getInvalidationTracker();
                    invalidationTracker.getClass();
                    d observer = this$0.f25920e;
                    Intrinsics.checkNotNullParameter(observer, "observer");
                    invalidationTracker.a(new t(invalidationTracker, observer));
                }
                do {
                    AtomicBoolean atomicBoolean2 = this$0.f25922g;
                    boolean compareAndSet = atomicBoolean2.compareAndSet(false, true);
                    atomicBoolean = this$0.f25921f;
                    if (compareAndSet) {
                        Object obj = null;
                        z10 = false;
                        while (atomicBoolean.compareAndSet(true, false)) {
                            try {
                                try {
                                    obj = this$0.f25919d.call();
                                    z10 = true;
                                } catch (Exception e2) {
                                    throw new RuntimeException("Exception while computing database live data.", e2);
                                }
                            } finally {
                                atomicBoolean2.set(false);
                            }
                        }
                        if (z10) {
                            this$0.postValue(obj);
                        }
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        return;
                    }
                } while (atomicBoolean.get());
                return;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                boolean hasActiveObservers = this$0.hasActiveObservers();
                if (this$0.f25921f.compareAndSet(false, true) && hasActiveObservers) {
                    boolean z11 = this$0.f25918c;
                    f0 f0Var = this$0.a;
                    if (z11) {
                        queryExecutor = f0Var.getTransactionExecutor();
                    } else {
                        queryExecutor = f0Var.getQueryExecutor();
                    }
                    queryExecutor.execute(this$0.f25924i);
                    return;
                }
                return;
        }
    }
}
