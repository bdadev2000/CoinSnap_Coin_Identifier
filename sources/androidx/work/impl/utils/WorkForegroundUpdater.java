package androidx.work.impl.utils;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.ForegroundInfo;
import androidx.work.ForegroundUpdater;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.UUID;

@RestrictTo
/* loaded from: classes2.dex */
public class WorkForegroundUpdater implements ForegroundUpdater {

    /* renamed from: a, reason: collision with root package name */
    public final TaskExecutor f22220a;

    /* renamed from: b, reason: collision with root package name */
    public final ForegroundProcessor f22221b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkSpecDao f22222c;

    static {
        Logger.e("WMFgUpdater");
    }

    public WorkForegroundUpdater(WorkDatabase workDatabase, ForegroundProcessor foregroundProcessor, TaskExecutor taskExecutor) {
        this.f22221b = foregroundProcessor;
        this.f22220a = taskExecutor;
        this.f22222c = workDatabase.h();
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, androidx.work.impl.utils.futures.SettableFuture] */
    @Override // androidx.work.ForegroundUpdater
    public final SettableFuture a(final Context context, final UUID uuid, final ForegroundInfo foregroundInfo) {
        final ?? obj = new Object();
        this.f22220a.b(new Runnable() { // from class: androidx.work.impl.utils.WorkForegroundUpdater.1
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                ForegroundInfo foregroundInfo2 = foregroundInfo;
                WorkForegroundUpdater workForegroundUpdater = WorkForegroundUpdater.this;
                SettableFuture settableFuture = obj;
                try {
                    if (!settableFuture.isCancelled()) {
                        String uuid2 = uuid.toString();
                        WorkInfo.State i2 = workForegroundUpdater.f22222c.i(uuid2);
                        if (i2 == null || i2.a()) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        workForegroundUpdater.f22221b.b(uuid2, foregroundInfo2);
                        context2.startService(SystemForegroundDispatcher.a(context2, uuid2, foregroundInfo2));
                    }
                    settableFuture.i(null);
                } catch (Throwable th) {
                    settableFuture.j(th);
                }
            }
        });
        return obj;
    }
}
