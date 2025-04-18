package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    w2.j mFuture;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract o doWork();

    @Override // androidx.work.ListenableWorker
    @NonNull
    public final ua.b startWork() {
        this.mFuture = new w2.j();
        getBackgroundExecutor().execute(new b0(this));
        return this.mFuture;
    }
}
