package androidx.concurrent.futures;

import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.ListenableFuture;

@RestrictTo
/* loaded from: classes4.dex */
public final class ResolvableFuture<V> extends AbstractResolvableFuture<V> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public final boolean set(Object obj) {
        return super.set(obj);
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public final boolean setException(Throwable th) {
        return super.setException(th);
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public final boolean setFuture(ListenableFuture listenableFuture) {
        return super.setFuture(listenableFuture);
    }
}
