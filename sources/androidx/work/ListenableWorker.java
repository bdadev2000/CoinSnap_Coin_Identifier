package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.IntRange;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
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

    /* loaded from: classes.dex */
    public static abstract class Result {

        @RestrictTo
        /* loaded from: classes.dex */
        public static final class Failure extends Result {

            /* renamed from: a, reason: collision with root package name */
            public final Data f21877a = Data.f21866c;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || Failure.class != obj.getClass()) {
                    return false;
                }
                return this.f21877a.equals(((Failure) obj).f21877a);
            }

            public final int hashCode() {
                return this.f21877a.hashCode() + 846803280;
            }

            public final String toString() {
                return "Failure {mOutputData=" + this.f21877a + '}';
            }
        }

        @RestrictTo
        /* loaded from: classes.dex */
        public static final class Retry extends Result {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && Retry.class == obj.getClass();
            }

            public final int hashCode() {
                return 25945934;
            }

            public final String toString() {
                return "Retry";
            }
        }

        @RestrictTo
        /* loaded from: classes.dex */
        public static final class Success extends Result {

            /* renamed from: a, reason: collision with root package name */
            public final Data f21878a;

            public Success(Data data) {
                this.f21878a = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || Success.class != obj.getClass()) {
                    return false;
                }
                return this.f21878a.equals(((Success) obj).f21878a);
            }

            public final int hashCode() {
                return this.f21878a.hashCode() - 1876823561;
            }

            public final String toString() {
                return "Success {mOutputData=" + this.f21878a + '}';
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    @NonNull
    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    @NonNull
    @RestrictTo
    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f21915f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.work.impl.utils.futures.SettableFuture, com.google.common.util.concurrent.ListenableFuture<androidx.work.ForegroundInfo>] */
    @NonNull
    public ListenableFuture<ForegroundInfo> getForegroundInfoAsync() {
        ?? obj = new Object();
        obj.j(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return obj;
    }

    @NonNull
    public final UUID getId() {
        return this.mWorkerParams.f21912a;
    }

    @NonNull
    public final Data getInputData() {
        return this.mWorkerParams.f21913b;
    }

    @Nullable
    @RequiresApi
    public final Network getNetwork() {
        return this.mWorkerParams.d.f21922c;
    }

    @IntRange
    public final int getRunAttemptCount() {
        return this.mWorkerParams.e;
    }

    @NonNull
    public final Set<String> getTags() {
        return this.mWorkerParams.f21914c;
    }

    @NonNull
    @RestrictTo
    public TaskExecutor getTaskExecutor() {
        return this.mWorkerParams.f21916g;
    }

    @NonNull
    @RequiresApi
    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.d.f21920a;
    }

    @NonNull
    @RequiresApi
    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.d.f21921b;
    }

    @NonNull
    @RestrictTo
    public WorkerFactory getWorkerFactory() {
        return this.mWorkerParams.f21917h;
    }

    @RestrictTo
    public boolean isRunInForeground() {
        return this.mRunInForeground;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    @RestrictTo
    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    @NonNull
    public final ListenableFuture<Void> setForegroundAsync(@NonNull ForegroundInfo foregroundInfo) {
        this.mRunInForeground = true;
        return this.mWorkerParams.f21919j.a(getApplicationContext(), getId(), foregroundInfo);
    }

    @NonNull
    public ListenableFuture<Void> setProgressAsync(@NonNull Data data) {
        ProgressUpdater progressUpdater = this.mWorkerParams.f21918i;
        getApplicationContext();
        return progressUpdater.a(getId(), data);
    }

    @RestrictTo
    public void setRunInForeground(boolean z2) {
        this.mRunInForeground = z2;
    }

    @RestrictTo
    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract ListenableFuture startWork();

    @RestrictTo
    public final void stop() {
        this.mStopped = true;
        onStopped();
    }
}
