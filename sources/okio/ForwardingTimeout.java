package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class ForwardingTimeout extends Timeout {

    @NotNull
    private Timeout delegate;

    public ForwardingTimeout(@NotNull Timeout timeout) {
        p0.a.s(timeout, "delegate");
        this.delegate = timeout;
    }

    @Override // okio.Timeout
    public void awaitSignal(@NotNull Condition condition) {
        p0.a.s(condition, "condition");
        this.delegate.awaitSignal(condition);
    }

    @Override // okio.Timeout
    public void cancel() {
        this.delegate.cancel();
    }

    @Override // okio.Timeout
    @NotNull
    public Timeout clearDeadline() {
        return this.delegate.clearDeadline();
    }

    @Override // okio.Timeout
    @NotNull
    public Timeout clearTimeout() {
        return this.delegate.clearTimeout();
    }

    @Override // okio.Timeout
    public long deadlineNanoTime() {
        return this.delegate.deadlineNanoTime();
    }

    @NotNull
    public final Timeout delegate() {
        return this.delegate;
    }

    @Override // okio.Timeout
    public boolean hasDeadline() {
        return this.delegate.hasDeadline();
    }

    @NotNull
    public final ForwardingTimeout setDelegate(@NotNull Timeout timeout) {
        p0.a.s(timeout, "delegate");
        this.delegate = timeout;
        return this;
    }

    @Override // okio.Timeout
    public void throwIfReached() throws IOException {
        this.delegate.throwIfReached();
    }

    @Override // okio.Timeout
    @NotNull
    public Timeout timeout(long j2, @NotNull TimeUnit timeUnit) {
        p0.a.s(timeUnit, "unit");
        return this.delegate.timeout(j2, timeUnit);
    }

    @Override // okio.Timeout
    public long timeoutNanos() {
        return this.delegate.timeoutNanos();
    }

    @Override // okio.Timeout
    public void waitUntilNotified(@NotNull Object obj) {
        p0.a.s(obj, "monitor");
        this.delegate.waitUntilNotified(obj);
    }

    @Override // okio.Timeout
    @NotNull
    public Timeout deadlineNanoTime(long j2) {
        return this.delegate.deadlineNanoTime(j2);
    }

    /* renamed from: setDelegate, reason: collision with other method in class */
    public final /* synthetic */ void m782setDelegate(Timeout timeout) {
        p0.a.s(timeout, "<set-?>");
        this.delegate = timeout;
    }
}
