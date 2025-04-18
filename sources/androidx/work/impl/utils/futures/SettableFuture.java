package androidx.work.impl.utils.futures;

import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.futures.AbstractFuture;
import com.google.common.util.concurrent.ListenableFuture;

@RestrictTo
/* loaded from: classes3.dex */
public final class SettableFuture<V> extends AbstractFuture<V> {
    public final boolean i(Object obj) {
        if (obj == null) {
            obj = AbstractFuture.f22241h;
        }
        if (!AbstractFuture.f22240g.b(this, null, obj)) {
            return false;
        }
        AbstractFuture.b(this);
        return true;
    }

    public final boolean j(Throwable th) {
        th.getClass();
        if (!AbstractFuture.f22240g.b(this, null, new AbstractFuture.Failure(th))) {
            return false;
        }
        AbstractFuture.b(this);
        return true;
    }

    public final boolean k(ListenableFuture listenableFuture) {
        AbstractFuture.Failure failure;
        listenableFuture.getClass();
        Object obj = this.f22242a;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!AbstractFuture.f22240g.b(this, null, AbstractFuture.e(listenableFuture))) {
                    return false;
                }
                AbstractFuture.b(this);
            } else {
                AbstractFuture.SetFuture setFuture = new AbstractFuture.SetFuture(this, listenableFuture);
                if (AbstractFuture.f22240g.b(this, null, setFuture)) {
                    try {
                        listenableFuture.addListener(setFuture, DirectExecutor.f22261a);
                    } catch (Throwable th) {
                        try {
                            failure = new AbstractFuture.Failure(th);
                        } catch (Throwable unused) {
                            failure = AbstractFuture.Failure.f22248b;
                        }
                        AbstractFuture.f22240g.b(this, setFuture, failure);
                    }
                } else {
                    obj = this.f22242a;
                }
            }
            return true;
        }
        if (!(obj instanceof AbstractFuture.Cancellation)) {
            return false;
        }
        listenableFuture.cancel(((AbstractFuture.Cancellation) obj).f22246a);
        return false;
    }
}
