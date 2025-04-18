package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import n0.w1;

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
        return this.mWorkerParams.f2170f;
    }

    @NonNull
    public ua.b getForegroundInfoAsync() {
        w2.j jVar = new w2.j();
        jVar.i(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return jVar;
    }

    @NonNull
    public final UUID getId() {
        return this.mWorkerParams.a;
    }

    @NonNull
    public final h getInputData() {
        return this.mWorkerParams.f2166b;
    }

    @Nullable
    @RequiresApi(28)
    public final Network getNetwork() {
        return (Network) this.mWorkerParams.f2168d.f18525f;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.f2169e;
    }

    @NonNull
    public final Set<String> getTags() {
        return this.mWorkerParams.f2167c;
    }

    @NonNull
    public x2.a getTaskExecutor() {
        return this.mWorkerParams.f2171g;
    }

    @NonNull
    @RequiresApi(24)
    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.f2168d.f18523c;
    }

    @NonNull
    @RequiresApi(24)
    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.f2168d.f18524d;
    }

    @NonNull
    public d0 getWorkerFactory() {
        return this.mWorkerParams.f2172h;
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

    @NonNull
    public final ua.b setForegroundAsync(@NonNull i iVar) {
        this.mRunInForeground = true;
        j jVar = this.mWorkerParams.f2174j;
        Context applicationContext = getApplicationContext();
        UUID id2 = getId();
        v2.n nVar = (v2.n) jVar;
        nVar.getClass();
        w2.j jVar2 = new w2.j();
        ((h.c) nVar.a).r(new w1(nVar, jVar2, id2, iVar, applicationContext, 1));
        return jVar2;
    }

    @NonNull
    public ua.b setProgressAsync(@NonNull h hVar) {
        x xVar = this.mWorkerParams.f2173i;
        getApplicationContext();
        UUID id2 = getId();
        v2.o oVar = (v2.o) xVar;
        oVar.getClass();
        w2.j jVar = new w2.j();
        ((h.c) oVar.f26008b).r(new k.g(2, oVar, id2, hVar, jVar));
        return jVar;
    }

    public void setRunInForeground(boolean z10) {
        this.mRunInForeground = z10;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract ua.b startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }
}
