package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
abstract class ModernAsyncTask<Params, Progress, Result> {

    /* renamed from: g, reason: collision with root package name */
    public static InternalHandler f20257g;

    /* renamed from: a, reason: collision with root package name */
    public final AnonymousClass2 f20258a;

    /* renamed from: b, reason: collision with root package name */
    public final FutureTask f20259b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Status f20260c = Status.f20268a;
    public final AtomicBoolean d = new AtomicBoolean();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f20261f = new AtomicBoolean();

    /* renamed from: androidx.loader.content.ModernAsyncTask$4, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20265a;

        static {
            int[] iArr = new int[Status.values().length];
            f20265a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20265a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class AsyncTaskResult<Data> {

        /* renamed from: a, reason: collision with root package name */
        public final ModernAsyncTask f20266a;

        /* renamed from: b, reason: collision with root package name */
        public final Object[] f20267b;

        public AsyncTaskResult(ModernAsyncTask modernAsyncTask, Object... objArr) {
            this.f20266a = modernAsyncTask;
            this.f20267b = objArr;
        }
    }

    /* loaded from: classes2.dex */
    public static class InternalHandler extends Handler {
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            AsyncTaskResult asyncTaskResult = (AsyncTaskResult) message.obj;
            int i2 = message.what;
            if (i2 != 1) {
                if (i2 != 2) {
                    return;
                }
                asyncTaskResult.f20266a.getClass();
            } else {
                ModernAsyncTask modernAsyncTask = asyncTaskResult.f20266a;
                Object obj = asyncTaskResult.f20267b[0];
                if (modernAsyncTask.d.get()) {
                    modernAsyncTask.b(obj);
                } else {
                    modernAsyncTask.c(obj);
                }
                modernAsyncTask.f20260c = Status.f20270c;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class Status {

        /* renamed from: a, reason: collision with root package name */
        public static final Status f20268a;

        /* renamed from: b, reason: collision with root package name */
        public static final Status f20269b;

        /* renamed from: c, reason: collision with root package name */
        public static final Status f20270c;
        public static final /* synthetic */ Status[] d;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.loader.content.ModernAsyncTask$Status] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.loader.content.ModernAsyncTask$Status] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.loader.content.ModernAsyncTask$Status] */
        static {
            ?? r02 = new Enum("PENDING", 0);
            f20268a = r02;
            ?? r1 = new Enum("RUNNING", 1);
            f20269b = r1;
            ?? r2 = new Enum("FINISHED", 2);
            f20270c = r2;
            d = new Status[]{r02, r1, r2};
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) d.clone();
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class WorkerRunnable<Params, Result> implements Callable<Result> {

        /* renamed from: a, reason: collision with root package name */
        public Object[] f20271a;
    }

    static {
        ThreadFactory threadFactory = new ThreadFactory() { // from class: androidx.loader.content.ModernAsyncTask.1

            /* renamed from: a, reason: collision with root package name */
            public final AtomicInteger f20262a = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "ModernAsyncTask #" + this.f20262a.getAndIncrement());
            }
        };
        new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), threadFactory);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.Callable, androidx.loader.content.ModernAsyncTask$2] */
    public ModernAsyncTask() {
        ?? r02 = new WorkerRunnable<Object, Object>() { // from class: androidx.loader.content.ModernAsyncTask.2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ModernAsyncTask modernAsyncTask = ModernAsyncTask.this;
                modernAsyncTask.f20261f.set(true);
                Object obj = null;
                try {
                    Process.setThreadPriority(10);
                    obj = modernAsyncTask.a(this.f20271a);
                    Binder.flushPendingCommands();
                    return obj;
                } finally {
                }
            }
        };
        this.f20258a = r02;
        this.f20259b = new FutureTask<Object>(r02) { // from class: androidx.loader.content.ModernAsyncTask.3
            @Override // java.util.concurrent.FutureTask
            public final void done() {
                ModernAsyncTask modernAsyncTask = ModernAsyncTask.this;
                try {
                    Object obj = get();
                    if (modernAsyncTask.f20261f.get()) {
                        return;
                    }
                    modernAsyncTask.d(obj);
                } catch (InterruptedException e) {
                    Log.w("AsyncTask", e);
                } catch (CancellationException unused) {
                    if (modernAsyncTask.f20261f.get()) {
                        return;
                    }
                    modernAsyncTask.d(null);
                } catch (ExecutionException e2) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
                } catch (Throwable th) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", th);
                }
            }
        };
    }

    public abstract Object a(Object... objArr);

    public void b(Object obj) {
    }

    public void c(Object obj) {
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.loader.content.ModernAsyncTask$InternalHandler, android.os.Handler] */
    public final void d(Object obj) {
        InternalHandler internalHandler;
        synchronized (ModernAsyncTask.class) {
            try {
                if (f20257g == null) {
                    f20257g = new Handler(Looper.getMainLooper());
                }
                internalHandler = f20257g;
            } catch (Throwable th) {
                throw th;
            }
        }
        internalHandler.obtainMessage(1, new AsyncTaskResult(this, obj)).sendToTarget();
    }
}
