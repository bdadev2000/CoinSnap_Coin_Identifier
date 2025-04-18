package kotlinx.coroutines;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"newFixedThreadPoolContext", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "nThreads", "", "name", "", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/ThreadPoolDispatcherKt")
@SourceDebugExtension({"SMAP\nThreadPoolDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadPoolDispatcher.kt\nkotlinx/coroutines/ThreadPoolDispatcherKt__ThreadPoolDispatcherKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n1#2:48\n*E\n"})
/* loaded from: classes4.dex */
public final /* synthetic */ class ThreadPoolDispatcherKt__ThreadPoolDispatcherKt {
    @DelicateCoroutinesApi
    public static final ExecutorCoroutineDispatcher newFixedThreadPoolContext(final int i10, final String str) {
        boolean z10 = true;
        if (i10 < 1) {
            z10 = false;
        }
        if (z10) {
            final AtomicInteger atomicInteger = new AtomicInteger();
            return ExecutorsKt.from((ExecutorService) Executors.newScheduledThreadPool(i10, new ThreadFactory() { // from class: kotlinx.coroutines.a
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread newFixedThreadPoolContext$lambda$1$ThreadPoolDispatcherKt__ThreadPoolDispatcherKt;
                    newFixedThreadPoolContext$lambda$1$ThreadPoolDispatcherKt__ThreadPoolDispatcherKt = ThreadPoolDispatcherKt__ThreadPoolDispatcherKt.newFixedThreadPoolContext$lambda$1$ThreadPoolDispatcherKt__ThreadPoolDispatcherKt(i10, str, atomicInteger, runnable);
                    return newFixedThreadPoolContext$lambda$1$ThreadPoolDispatcherKt__ThreadPoolDispatcherKt;
                }
            }));
        }
        throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.i("Expected at least one thread, but ", i10, " specified").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread newFixedThreadPoolContext$lambda$1$ThreadPoolDispatcherKt__ThreadPoolDispatcherKt(int i10, String str, AtomicInteger atomicInteger, Runnable runnable) {
        if (i10 != 1) {
            str = str + '-' + atomicInteger.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }
}
