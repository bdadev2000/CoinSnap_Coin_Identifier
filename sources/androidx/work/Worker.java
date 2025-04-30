package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import f1.C2262k;

/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    C2262k mFuture;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract n doWork();

    /* JADX WARN: Type inference failed for: r0v0, types: [f1.k, java.lang.Object] */
    @Override // androidx.work.ListenableWorker
    @NonNull
    public final f4.c startWork() {
        this.mFuture = new Object();
        getBackgroundExecutor().execute(new v(this));
        return this.mFuture;
    }
}
