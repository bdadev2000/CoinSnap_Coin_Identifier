package androidx.work.impl.workers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.n;
import androidx.work.o;

/* loaded from: classes.dex */
public class CombineContinuationsWorker extends Worker {
    public CombineContinuationsWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public final o doWork() {
        return new n(getInputData());
    }
}
