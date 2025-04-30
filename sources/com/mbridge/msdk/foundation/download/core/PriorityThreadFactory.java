package com.mbridge.msdk.foundation.download.core;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public class PriorityThreadFactory implements ThreadFactory {
    private final int threadPriority;

    public PriorityThreadFactory(int i9) {
        this.threadPriority = i9;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread thread = new Thread(new Runnable() { // from class: com.mbridge.msdk.foundation.download.core.PriorityThreadFactory.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Process.setThreadPriority(PriorityThreadFactory.this.threadPriority);
                } catch (Throwable unused) {
                }
                runnable.run();
            }
        });
        thread.setName("mb_download_thread");
        return thread;
    }
}
