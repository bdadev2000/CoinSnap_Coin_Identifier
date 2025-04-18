package androidx.work.impl.utils;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.core.os.BuildCompat;
import androidx.work.ForegroundInfo;
import androidx.work.ForegroundUpdater;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

@RestrictTo
/* loaded from: classes3.dex */
public class WorkForegroundRunnable implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public static final String f22210h = Logger.e("WorkForegroundRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final SettableFuture f22211a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Context f22212b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkSpec f22213c;
    public final ListenableWorker d;

    /* renamed from: f, reason: collision with root package name */
    public final ForegroundUpdater f22214f;

    /* renamed from: g, reason: collision with root package name */
    public final TaskExecutor f22215g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.work.impl.utils.futures.SettableFuture] */
    public WorkForegroundRunnable(Context context, WorkSpec workSpec, ListenableWorker listenableWorker, WorkForegroundUpdater workForegroundUpdater, TaskExecutor taskExecutor) {
        this.f22212b = context;
        this.f22213c = workSpec;
        this.d = listenableWorker;
        this.f22214f = workForegroundUpdater;
        this.f22215g = taskExecutor;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.work.impl.utils.futures.AbstractFuture, java.lang.Object, androidx.work.impl.utils.futures.SettableFuture] */
    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f22213c.f22160q || BuildCompat.b()) {
            this.f22211a.i(null);
            return;
        }
        final ?? obj = new Object();
        TaskExecutor taskExecutor = this.f22215g;
        taskExecutor.a().execute(new Runnable() { // from class: androidx.work.impl.utils.WorkForegroundRunnable.1
            @Override // java.lang.Runnable
            public final void run() {
                obj.k(WorkForegroundRunnable.this.d.getForegroundInfoAsync());
            }
        });
        obj.addListener(new Runnable() { // from class: androidx.work.impl.utils.WorkForegroundRunnable.2
            @Override // java.lang.Runnable
            public final void run() {
                WorkForegroundRunnable workForegroundRunnable = WorkForegroundRunnable.this;
                try {
                    ForegroundInfo foregroundInfo = (ForegroundInfo) obj.get();
                    if (foregroundInfo == null) {
                        throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", workForegroundRunnable.f22213c.f22148c));
                    }
                    Logger c2 = Logger.c();
                    String str = WorkForegroundRunnable.f22210h;
                    Object[] objArr = new Object[1];
                    WorkSpec workSpec = workForegroundRunnable.f22213c;
                    ListenableWorker listenableWorker = workForegroundRunnable.d;
                    objArr[0] = workSpec.f22148c;
                    c2.a(str, String.format("Updating notification for %s", objArr), new Throwable[0]);
                    listenableWorker.setRunInForeground(true);
                    workForegroundRunnable.f22211a.k(workForegroundRunnable.f22214f.a(workForegroundRunnable.f22212b, listenableWorker.getId(), foregroundInfo));
                } catch (Throwable th) {
                    workForegroundRunnable.f22211a.j(th);
                }
            }
        }, taskExecutor.a());
    }
}
