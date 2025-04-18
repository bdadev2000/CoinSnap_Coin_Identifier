package j0;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes.dex */
public final class g extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: b, reason: collision with root package name */
    public final Continuation f19711b;

    public g(CancellableContinuationImpl cancellableContinuationImpl) {
        super(false);
        this.f19711b = cancellableContinuationImpl;
    }

    @Override // android.os.OutcomeReceiver
    public final void onError(Throwable th2) {
        if (compareAndSet(false, true)) {
            Continuation continuation = this.f19711b;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m145constructorimpl(ResultKt.createFailure(th2)));
        }
    }

    @Override // android.os.OutcomeReceiver
    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f19711b.resumeWith(Result.m145constructorimpl(obj));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
