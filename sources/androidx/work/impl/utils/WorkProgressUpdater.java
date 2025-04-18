package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.ProgressUpdater;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkProgress;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.UUID;

@RestrictTo
/* loaded from: classes4.dex */
public class WorkProgressUpdater implements ProgressUpdater {

    /* renamed from: c, reason: collision with root package name */
    public static final String f22227c = Logger.e("WorkProgressUpdater");

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase f22228a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskExecutor f22229b;

    public WorkProgressUpdater(WorkDatabase workDatabase, TaskExecutor taskExecutor) {
        this.f22228a = workDatabase;
        this.f22229b = taskExecutor;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.work.impl.utils.futures.SettableFuture] */
    @Override // androidx.work.ProgressUpdater
    public final SettableFuture a(final UUID uuid, final Data data) {
        final ?? obj = new Object();
        this.f22229b.b(new Runnable() { // from class: androidx.work.impl.utils.WorkProgressUpdater.1
            @Override // java.lang.Runnable
            public final void run() {
                WorkSpec j2;
                SettableFuture settableFuture = obj;
                UUID uuid2 = uuid;
                String uuid3 = uuid2.toString();
                Logger c2 = Logger.c();
                String str = WorkProgressUpdater.f22227c;
                Data data2 = data;
                c2.a(str, String.format("Updating progress for %s (%s)", uuid2, data2), new Throwable[0]);
                WorkProgressUpdater workProgressUpdater = WorkProgressUpdater.this;
                workProgressUpdater.f22228a.beginTransaction();
                try {
                    j2 = workProgressUpdater.f22228a.h().j(uuid3);
                } finally {
                    try {
                    } finally {
                    }
                }
                if (j2 == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (j2.f22147b == WorkInfo.State.f21898b) {
                    workProgressUpdater.f22228a.g().c(new WorkProgress(uuid3, data2));
                } else {
                    Logger.c().g(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", uuid3), new Throwable[0]);
                }
                settableFuture.i(null);
                workProgressUpdater.f22228a.setTransactionSuccessful();
            }
        });
        return obj;
    }
}
