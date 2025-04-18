package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u000b\u0010\u0011\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\f¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/BlockingCoroutine;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/AbstractCoroutine;", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "blockedThread", "Ljava/lang/Thread;", "eventLoop", "Lkotlinx/coroutines/EventLoop;", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Thread;Lkotlinx/coroutines/EventLoop;)V", "isScopedCoroutine", "", "()Z", "afterCompletion", "", "state", "", "joinBlocking", "()Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/BlockingCoroutine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
/* loaded from: classes4.dex */
public final class BlockingCoroutine<T> extends AbstractCoroutine<T> {
    private final Thread blockedThread;
    private final EventLoop eventLoop;

    public BlockingCoroutine(CoroutineContext coroutineContext, Thread thread, EventLoop eventLoop) {
        super(coroutineContext, true, true);
        this.blockedThread = thread;
        this.eventLoop = eventLoop;
    }

    @Override // kotlinx.coroutines.JobSupport
    public void afterCompletion(Object state) {
        Unit unit;
        if (!Intrinsics.areEqual(Thread.currentThread(), this.blockedThread)) {
            Thread thread = this.blockedThread;
            AbstractTimeSource timeSource = AbstractTimeSourceKt.getTimeSource();
            if (timeSource != null) {
                timeSource.unpark(thread);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                LockSupport.unpark(thread);
            }
        }
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean isScopedCoroutine() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T joinBlocking() {
        long j3;
        Unit unit;
        AbstractTimeSource timeSource = AbstractTimeSourceKt.getTimeSource();
        if (timeSource != null) {
            timeSource.registerTimeLoopThread();
        }
        try {
            EventLoop eventLoop = this.eventLoop;
            CompletedExceptionally completedExceptionally = null;
            if (eventLoop != null) {
                EventLoop.incrementUseCount$default(eventLoop, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    EventLoop eventLoop2 = this.eventLoop;
                    if (eventLoop2 != null) {
                        j3 = eventLoop2.processNextEvent();
                    } else {
                        j3 = Long.MAX_VALUE;
                    }
                    if (!isCompleted()) {
                        AbstractTimeSource timeSource2 = AbstractTimeSourceKt.getTimeSource();
                        if (timeSource2 != null) {
                            timeSource2.parkNanos(this, j3);
                            unit = Unit.INSTANCE;
                        } else {
                            unit = null;
                        }
                        if (unit == null) {
                            LockSupport.parkNanos(this, j3);
                        }
                    } else {
                        T t5 = (T) JobSupportKt.unboxState(getState$kotlinx_coroutines_core());
                        if (t5 instanceof CompletedExceptionally) {
                            completedExceptionally = (CompletedExceptionally) t5;
                        }
                        if (completedExceptionally == null) {
                            return t5;
                        }
                        throw completedExceptionally.cause;
                    }
                } finally {
                    EventLoop eventLoop3 = this.eventLoop;
                    if (eventLoop3 != null) {
                        EventLoop.decrementUseCount$default(eventLoop3, false, 1, null);
                    }
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            cancelCoroutine(interruptedException);
            throw interruptedException;
        } finally {
            AbstractTimeSource timeSource3 = AbstractTimeSourceKt.getTimeSource();
            if (timeSource3 != null) {
                timeSource3.unregisterTimeLoopThread();
            }
        }
    }
}
