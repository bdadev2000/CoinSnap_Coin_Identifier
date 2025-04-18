package com.facebook.bolts;

import com.applovin.sdk.AppLovinEventTypes;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class CancellationTokenSource implements Closeable {
    private boolean cancellationRequested;
    private boolean closed;

    @Nullable
    private ScheduledFuture<?> scheduledCancellation;

    @NotNull
    private final Object lock = new Object();

    @NotNull
    private final List<CancellationTokenRegistration> registrations = new ArrayList();

    @NotNull
    private final ScheduledExecutorService executor = BoltsExecutors.Companion.scheduled$facebook_bolts_release();

    public static /* synthetic */ void a(CancellationTokenSource cancellationTokenSource) {
        m491cancelAfter$lambda6$lambda5(cancellationTokenSource);
    }

    /* renamed from: cancelAfter$lambda-6$lambda-5 */
    public static final void m491cancelAfter$lambda6$lambda5(CancellationTokenSource cancellationTokenSource) {
        p0.a.s(cancellationTokenSource, "this$0");
        synchronized (cancellationTokenSource.lock) {
            cancellationTokenSource.scheduledCancellation = null;
        }
        cancellationTokenSource.cancel();
    }

    private final void cancelScheduledCancellation() {
        ScheduledFuture<?> scheduledFuture = this.scheduledCancellation;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(true);
        this.scheduledCancellation = null;
    }

    private final void notifyListeners(List<CancellationTokenRegistration> list) {
        Iterator<CancellationTokenRegistration> it = list.iterator();
        while (it.hasNext()) {
            it.next().runAction$facebook_bolts_release();
        }
    }

    private final void throwIfClosed() {
        if (!(!this.closed)) {
            throw new IllegalStateException("Object already closed".toString());
        }
    }

    public final void cancel() {
        synchronized (this.lock) {
            throwIfClosed();
            if (this.cancellationRequested) {
                return;
            }
            cancelScheduledCancellation();
            this.cancellationRequested = true;
            notifyListeners(new ArrayList(this.registrations));
        }
    }

    public final void cancelAfter(long j2) {
        cancelAfter(j2, TimeUnit.MILLISECONDS);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            try {
                if (this.closed) {
                    return;
                }
                cancelScheduledCancellation();
                Iterator<CancellationTokenRegistration> it = this.registrations.iterator();
                while (it.hasNext()) {
                    it.next().close();
                }
                this.registrations.clear();
                this.closed = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NotNull
    public final CancellationToken getToken() {
        CancellationToken cancellationToken;
        synchronized (this.lock) {
            throwIfClosed();
            cancellationToken = new CancellationToken(this);
        }
        return cancellationToken;
    }

    public final boolean isCancellationRequested() {
        boolean z2;
        synchronized (this.lock) {
            throwIfClosed();
            z2 = this.cancellationRequested;
        }
        return z2;
    }

    @NotNull
    public final CancellationTokenRegistration register$facebook_bolts_release(@Nullable Runnable runnable) {
        CancellationTokenRegistration cancellationTokenRegistration;
        synchronized (this.lock) {
            try {
                throwIfClosed();
                cancellationTokenRegistration = new CancellationTokenRegistration(this, runnable);
                if (this.cancellationRequested) {
                    cancellationTokenRegistration.runAction$facebook_bolts_release();
                } else {
                    this.registrations.add(cancellationTokenRegistration);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cancellationTokenRegistration;
    }

    public final void throwIfCancellationRequested$facebook_bolts_release() throws CancellationException {
        synchronized (this.lock) {
            throwIfClosed();
            if (this.cancellationRequested) {
                throw new CancellationException();
            }
        }
    }

    @NotNull
    public String toString() {
        return androidx.compose.foundation.text.input.a.p(new Object[]{CancellationTokenSource.class.getName(), Integer.toHexString(hashCode()), Boolean.toString(isCancellationRequested())}, 3, Locale.US, "%s@%s[cancellationRequested=%s]", "java.lang.String.format(locale, format, *args)");
    }

    public final void unregister$facebook_bolts_release(@NotNull CancellationTokenRegistration cancellationTokenRegistration) {
        p0.a.s(cancellationTokenRegistration, AppLovinEventTypes.USER_CREATED_ACCOUNT);
        synchronized (this.lock) {
            throwIfClosed();
            this.registrations.remove(cancellationTokenRegistration);
        }
    }

    private final void cancelAfter(long j2, TimeUnit timeUnit) {
        if (!(j2 >= -1)) {
            throw new IllegalArgumentException("Delay must be >= -1".toString());
        }
        if (j2 == 0) {
            cancel();
            return;
        }
        synchronized (this.lock) {
            if (this.cancellationRequested) {
                return;
            }
            cancelScheduledCancellation();
            if (j2 != -1) {
                this.scheduledCancellation = this.executor.schedule(new androidx.compose.material.ripple.a(this, 16), j2, timeUnit);
            }
        }
    }
}
