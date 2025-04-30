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

/* loaded from: classes3.dex */
public final class Loader implements LoaderErrorThrower {
    public static final int DONT_RETRY = 2;
    public static final int DONT_RETRY_FATAL = 3;
    public static final int RETRY = 0;
    public static final int RETRY_RESET_ERROR_COUNT = 1;
    private LoadTask<? extends Loadable> currentTask;
    private final ExecutorService downloadExecutorService;
    private IOException fatalError;

    /* loaded from: classes3.dex */
    public interface Callback<T extends Loadable> {
        void onLoadCanceled(T t9, long j7, long j9, boolean z8);

        void onLoadCompleted(T t9, long j7, long j9);

        int onLoadError(T t9, long j7, long j9, IOException iOException);
    }

    /* loaded from: classes3.dex */
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

        public LoadTask(Looper looper, T t9, Callback<T> callback, int i9, long j7) {
            super(looper);
            this.loadable = t9;
            this.callback = callback;
            this.defaultMinRetryCount = i9;
            this.startTimeMs = j7;
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

        public final void cancel(boolean z8) {
            this.released = z8;
            this.currentError = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z8) {
                    sendEmptyMessage(1);
                }
            } else {
                this.canceled = true;
                this.loadable.cancelLoad();
                if (this.executorThread != null) {
                    this.executorThread.interrupt();
                }
            }
            if (z8) {
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
            int i9 = message.what;
            if (i9 == 0) {
                execute();
                return;
            }
            if (i9 != 4) {
                finish();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j7 = elapsedRealtime - this.startTimeMs;
                if (this.canceled) {
                    this.callback.onLoadCanceled(this.loadable, elapsedRealtime, j7, false);
                    return;
                }
                int i10 = message.what;
                int i11 = 1;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            IOException iOException = (IOException) message.obj;
                            this.currentError = iOException;
                            int onLoadError = this.callback.onLoadError(this.loadable, elapsedRealtime, j7, iOException);
                            if (onLoadError == 3) {
                                Loader.this.fatalError = this.currentError;
                                return;
                            } else {
                                if (onLoadError != 2) {
                                    if (onLoadError != 1) {
                                        i11 = 1 + this.errorCount;
                                    }
                                    this.errorCount = i11;
                                    start(getRetryDelayMillis());
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    try {
                        this.callback.onLoadCompleted(this.loadable, elapsedRealtime, j7);
                        return;
                    } catch (RuntimeException e4) {
                        Log.e(TAG, "Unexpected exception handling load completed", e4);
                        Loader.this.fatalError = new UnexpectedLoaderException(e4);
                        return;
                    }
                }
                this.callback.onLoadCanceled(this.loadable, elapsedRealtime, j7, false);
                return;
            }
            throw ((Error) message.obj);
        }

        public final void maybeThrowError(int i9) throws IOException {
            IOException iOException = this.currentError;
            if (iOException != null && this.errorCount > i9) {
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
                    } catch (Throwable th) {
                        TraceUtil.endSection();
                        throw th;
                    }
                }
                if (!this.released) {
                    sendEmptyMessage(2);
                }
            } catch (IOException e4) {
                if (!this.released) {
                    obtainMessage(3, e4).sendToTarget();
                }
            } catch (InterruptedException unused) {
                Assertions.checkState(this.canceled);
                if (!this.released) {
                    sendEmptyMessage(2);
                }
            } catch (Exception e9) {
                Log.e(TAG, "Unexpected exception loading stream", e9);
                if (!this.released) {
                    obtainMessage(3, new UnexpectedLoaderException(e9)).sendToTarget();
                }
            } catch (OutOfMemoryError e10) {
                Log.e(TAG, "OutOfMemory error loading stream", e10);
                if (!this.released) {
                    obtainMessage(3, new UnexpectedLoaderException(e10)).sendToTarget();
                }
            } catch (Error e11) {
                Log.e(TAG, "Unexpected error loading stream", e11);
                if (!this.released) {
                    obtainMessage(4, e11).sendToTarget();
                }
                throw e11;
            }
        }

        public final void start(long j7) {
            boolean z8;
            if (Loader.this.currentTask == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            Assertions.checkState(z8);
            Loader.this.currentTask = this;
            if (j7 > 0) {
                sendEmptyMessageDelayed(0, j7);
            } else {
                execute();
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface Loadable {
        void cancelLoad();

        void load() throws IOException, InterruptedException;
    }

    /* loaded from: classes3.dex */
    public interface ReleaseCallback {
        void onLoaderReleased();
    }

    /* loaded from: classes3.dex */
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

    /* loaded from: classes3.dex */
    public @interface RetryAction {
    }

    /* loaded from: classes3.dex */
    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public Loader(String str) {
        this.downloadExecutorService = Util.newSingleThreadExecutor(str);
    }

    public final void cancelLoading() {
        this.currentTask.cancel(false);
    }

    public final boolean isLoading() {
        if (this.currentTask != null) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.LoaderErrorThrower
    public final void maybeThrowError() throws IOException {
        maybeThrowError(Integer.MIN_VALUE);
    }

    public final void release() {
        release(null);
    }

    public final <T extends Loadable> long startLoading(T t9, Callback<T> callback, int i9) {
        boolean z8;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkState(z8);
        this.fatalError = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new LoadTask(myLooper, t9, callback, i9, elapsedRealtime).start(0L);
        return elapsedRealtime;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.LoaderErrorThrower
    public final void maybeThrowError(int i9) throws IOException {
        IOException iOException = this.fatalError;
        if (iOException == null) {
            LoadTask<? extends Loadable> loadTask = this.currentTask;
            if (loadTask != null) {
                if (i9 == Integer.MIN_VALUE) {
                    i9 = loadTask.defaultMinRetryCount;
                }
                loadTask.maybeThrowError(i9);
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
