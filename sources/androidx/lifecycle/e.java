package androidx.lifecycle;

import java.io.Closeable;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt__JobKt;

/* loaded from: classes.dex */
public final class e implements Closeable, CoroutineScope {

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineContext f1792b;

    public e(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f1792b = context;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        JobKt__JobKt.cancel$default(this.f1792b, (CancellationException) null, 1, (Object) null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.f1792b;
    }
}
