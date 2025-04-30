package P;

import Q7.C0238f;
import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import t7.AbstractC2712a;

/* loaded from: classes.dex */
public final class g extends AtomicBoolean implements OutcomeReceiver {
    public final w7.f b;

    public g(C0238f c0238f) {
        super(false);
        this.b = c0238f;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.b.e(AbstractC2712a.b(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.b.e(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
