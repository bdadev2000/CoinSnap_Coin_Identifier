package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.TraceUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public final class Loader implements LoaderErrorThrower {
    public static final int DONT_RETRY = 2;
    public static final int DONT_RETRY_FATAL = 3;
    public static final int RETRY = 0;
    public static final int RETRY_RESET_ERROR_COUNT = 1;
    private LoadTask<? extends Loadable> currentTask;
    private final ExecutorService downloadExecutorService;
    private IOException fatalError;

    /* loaded from: classes4.dex */
    public interface Callback<T extends Loadable> {
        void onLoadCanceled(T t5, long j3, long j10, boolean z10);

        void onLoadCompleted(T t5, long j3, long j10);

        int onLoadError(T t5, long j3, long j10, IOException iOException);
    }

    /* loaded from: classes4.dex */
    public final class LoadTask<T extends Loadable> extends Handler implements Runnable {
        private static final int MSG_CANCEL = 1;
        private static final int MSG_END_OF_SOURCE = 2;
        private static final int MSG_FATAL_ERROR = 4;
        private static final int MSG_IO_EXCEPTION = 3;
        private static final int MSG_START = 0;
        private static final String TAG = "LoadTask";
        private Callback<T> callback;
        private volatile boolean canceled;
        private IOException currentError;
        public final int defaultMinRetryCount;
        private int errorCount;
        private volatile Thread executorThread;
        private final T loadable;
        private volatile boolean released;
        private final long startTimeMs;

        public LoadTask(Looper looper, T t5, Callback<T> callback, int i10, long j3) {
            super(looper);
            this.loadable = t5;
            this.callback = callback;
            this.defaultMinRetryCount = i10;
            this.startTimeMs = j3;
        }

        private void execute() {
            this.currentError = null;
            Loader.this.downloadExecutorService.execute(Loader.this.currentTask);
        }

        private void finish() {
            Loader.this.currentTask = null;
        }

        private long getRetryDelayMillis() {
            return Math.min((this.errorCount - 1) * 1000, 5000);
        }

        public final void cancel(boolean z10) {
            this.released = z10;
            this.currentError = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                this.canceled = true;
                this.loadable.cancelLoad();
                if (this.executorThread != null) {
                    this.executorThread.interrupt();
                }
            }
            if (z10) {
                finish();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.callback.onLoadCanceled(this.loadable, elapsedRealtime, elapsedRealtime - this.startTimeMs, true);
                this.callback = null;
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.released) {
                return;
            }
            int i10 = message.what;
            if (i10 == 0) {
                execute();
                return;
            }
            if (i10 != 4) {
                finish();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = elapsedRealtime - this.startTimeMs;
                if (this.canceled) {
                    this.callback.onLoadCanceled(this.loadable, elapsedRealtime, j3, false);
                    return;
                }
                int i11 = message.what;
                int i12 = 1;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            IOException iOException = (IOException) message.obj;
                            this.currentError = iOException;
                            int onLoadError = this.callback.onLoadError(this.loadable, elapsedRealtime, j3, iOException);
                            if (onLoadError == 3) {
                                Loader.this.fatalError = this.currentError;
                                return;
                            } else {
                                if (onLoadError != 2) {
                                    if (onLoadError != 1) {
                                        i12 = 1 + this.errorCount;
                                    }
                                    this.errorCount = i12;
                                    start(getRetryDelayMillis());
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    try {
                        this.callback.onLoadCompleted(this.loadable, elapsedRealtime, j3);
                        return;
                    } catch (RuntimeException e2) {
                        Log.e(TAG, "Unexpected exception handling load completed", e2);
                        Loader.this.fatalError = new UnexpectedLoaderException(e2);
                        return;
                    }
                }
                this.callback.onLoadCanceled(this.loadable, elapsedRealtime, j3, false);
                return;
            }
            throw ((Error) message.obj);
        }

        public final void maybeThrowError(int i10) throws IOException {
            IOException iOException = this.currentError;
            if (iOException != null && this.errorCount > i10) {
                throw iOException;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.executorThread = Thread.currentThread();
                if (!this.canceled) {
                    TraceUtil.beginSection("load:".concat(this.loadable.getClass().getSimpleName()));
                    try {
                        this.loadable.load();
                        TraceUtil.endSection();
                    } catch (Throwable th2) {
                        TraceUtil.endSection();
                        throw th2;
                    }
                }
                if (!this.released) {
                    sendEmptyMessage(2);
                }
            } catch (IOException e2) {
                if (!this.released) {
                    obtainMessage(3, e2).sendToTarget();
                }
            } catch (Error e10) {
                Log.e(TAG, "Unexpected error loading stream", e10);
                if (!this.released) {
                    obtainMessage(4, e10).sendToTarget();
                }
                throw e10;
            } catch (InterruptedException unused) {
                Assertions.checkState(this.canceled);
                if (!this.released) {
                    sendEmptyMessage(2);
                }
            } catch (Exception e11) {
                Log.e(TAG, "Unexpected exception loading stream", e11);
                if (!this.released) {
                    obtainMessage(3, new UnexpectedLoaderException(e11)).sendToTarget();
                }
            } catch (OutOfMemoryError e12) {
                Log.e(TAG, "OutOfMemory error loading stream", e12);
                if (!this.released) {
                    obtainMessage(3, new UnexpectedLoaderException(e12)).sendToTarget();
                }
            }
        }

        public final void start(long j3) {
            boolean z10;
            if (Loader.this.currentTask == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Assertions.checkState(z10);
            Loader.this.currentTask = this;
            if (j3 > 0) {
                sendEmptyMessageDelayed(0, j3);
            } else {
                execute();
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface Loadable {
        void cancelLoad();

        void load() throws IOException, InterruptedException;
    }

    /* loaded from: classes4.dex */
    public interface ReleaseCallback {
        void onLoaderReleased();
    }

    /* loaded from: classes4.dex */
    public static final class ReleaseTask implements Runnable {
        private final ReleaseCallback callback;

        public ReleaseTask(ReleaseCallback releaseCallback) {
            this.callback = releaseCallback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.callback.onLoaderReleased();
        }
    }

    /* loaded from: classes4.dex */
    public @interface RetryAction {
    }

    /* loaded from: classes4.dex */
    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th2) {
            super("Unexpected " + th2.getClass().getSimpleName() + ": " + th2.getMessage(), th2);
        }
    }

    public Loader(String str) {
        this.downloadExecutorService = Util.newSingleThreadExecutor(str);
    }

    public final void cancelLoading() {
        this.currentTask.cancel(false);
    }

    public final boolean isLoading() {
        return this.currentTask != null;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.LoaderErrorThrower
    public final void maybeThrowError() throws IOException {
        maybeThrowError(Integer.MIN_VALUE);
    }

    public final void release() {
        release(null);
    }

    public final <T extends Loadable> long startLoading(T t5, Callback<T> callback, int i10) {
        boolean z10;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkState(z10);
        this.fatalError = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new LoadTask(myLooper, t5, callback, i10, elapsedRealtime).start(0L);
        return elapsedRealtime;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.LoaderErrorThrower
    public final void maybeThrowError(int i10) throws IOException {
        IOException iOException = this.fatalError;
        if (iOException == null) {
            LoadTask<? extends Loadable> loadTask = this.currentTask;
            if (loadTask != null) {
                if (i10 == Integer.MIN_VALUE) {
                    i10 = loadTask.defaultMinRetryCount;
                }
                loadTask.maybeThrowError(i10);
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void release(ReleaseCallback releaseCallback) {
        LoadTask<? extends Loadable> loadTask = this.currentTask;
        if (loadTask != null) {
            loadTask.cancel(true);
        }
        if (releaseCallback != null) {
            this.downloadExecutorService.execute(new ReleaseTask(releaseCallback));
        }
        this.downloadExecutorService.shutdown();
    }
}
