package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata(d1 = {"kotlinx/coroutines/ThreadPoolDispatcherKt__MultithreadedDispatchers_commonKt", "kotlinx/coroutines/ThreadPoolDispatcherKt__ThreadPoolDispatcherKt"}, k = 4, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ThreadPoolDispatcherKt {
    @DelicateCoroutinesApi
    public static final ExecutorCoroutineDispatcher newFixedThreadPoolContext(int i10, String str) {
        return ThreadPoolDispatcherKt__ThreadPoolDispatcherKt.newFixedThreadPoolContext(i10, str);
    }

    @DelicateCoroutinesApi
    @ExperimentalCoroutinesApi
    public static final ExecutorCoroutineDispatcher newSingleThreadContext(String str) {
        return ThreadPoolDispatcherKt__MultithreadedDispatchers_commonKt.newSingleThreadContext(str);
    }
}
