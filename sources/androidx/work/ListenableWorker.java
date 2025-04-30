package androidx.work;

import T.n0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import g1.InterfaceC2286a;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class ListenableWorker {

    @NonNull
    private Context mAppContext;
    private boolean mRunInForeground;
    private volatile boolean mStopped;
    private boolean mUsed;

    @NonNull
    private WorkerParameters mWorkerParams;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        if (context != null) {
            if (workerParameters != null) {
                this.mAppContext = context;
                this.mWorkerParams = workerParameters;
                return;
            }
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        throw new IllegalArgumentException("Application Context is null");
    }

    @NonNull
    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    @NonNull
    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f5189f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [f1.k, java.lang.Object, f4.c] */
    @NonNull
    public f4.c getForegroundInfoAsync() {
        ?? obj = new Object();
        obj.j(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return obj;
    }

    @NonNull
    public final UUID getId() {
        return this.mWorkerParams.f5185a;
    }

    @NonNull
    public final g getInputData() {
        return this.mWorkerParams.b;
    }

    @Nullable
    @RequiresApi(28)
    public final Network getNetwork() {
        return (Network) this.mWorkerParams.f5187d.f349f;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.f5188e;
    }

    @NonNull
    public final Set<String> getTags() {
        return this.mWorkerParams.f5186c;
    }

    @NonNull
    public InterfaceC2286a getTaskExecutor() {
        return this.mWorkerParams.f5190g;
    }

    @NonNull
    @RequiresApi(24)
    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.f5187d.f347c;
    }

    @NonNull
    @RequiresApi(24)
    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.f5187d.f348d;
    }

    @NonNull
    public x getWorkerFactory() {
        return this.mWorkerParams.f5191h;
    }

    public boolean isRunInForeground() {
        return this.mRunInForeground;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [f1.k, java.lang.Object, f4.c] */
    @NonNull
    public final f4.c setForegroundAsync(@NonNull h hVar) {
        this.mRunInForeground = true;
        i iVar = this.mWorkerParams.f5193j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        e1.o oVar = (e1.o) iVar;
        oVar.getClass();
        ?? obj = new Object();
        ((C.c) oVar.f20056a).p(new e1.n(oVar, obj, id, hVar, applicationContext));
        return obj;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, f4.c] */
    @NonNull
    public f4.c setProgressAsync(@NonNull g gVar) {
        u uVar = this.mWorkerParams.f5192i;
        getApplicationContext();
        UUID id = getId();
        e1.p pVar = (e1.p) uVar;
        pVar.getClass();
        ?? obj = new Object();
        ((C.c) pVar.b).p(new n0(pVar, id, gVar, obj, 1));
        return obj;
    }

    public void setRunInForeground(boolean z8) {
        this.mRunInForeground = z8;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract f4.c startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }
}
