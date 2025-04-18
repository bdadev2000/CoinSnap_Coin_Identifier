package okhttp3.internal.concurrent;

import android.support.v4.media.d;
import androidx.compose.foundation.text.input.a;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.Http2Connection;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class TaskLoggerKt {
    public static final /* synthetic */ void access$log(Task task, TaskQueue taskQueue, String str) {
        log(task, taskQueue, str);
    }

    @NotNull
    public static final String formatDuration(long j2) {
        return a.o(new Object[]{j2 <= -999500000 ? d.p(new StringBuilder(), (j2 - 500000000) / Http2Connection.DEGRADED_PONG_TIMEOUT_NS, " s ") : j2 <= -999500 ? d.p(new StringBuilder(), (j2 - 500000) / 1000000, " ms") : j2 <= 0 ? d.p(new StringBuilder(), (j2 - com.safedk.android.internal.d.f29936c) / 1000, " µs") : j2 < 999500 ? d.p(new StringBuilder(), (j2 + com.safedk.android.internal.d.f29936c) / 1000, " µs") : j2 < 999500000 ? d.p(new StringBuilder(), (j2 + 500000) / 1000000, " ms") : d.p(new StringBuilder(), (j2 + 500000000) / Http2Connection.DEGRADED_PONG_TIMEOUT_NS, " s ")}, 1, "%6s", "format(format, *args)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(Task task, TaskQueue taskQueue, String str) {
        Logger logger = TaskRunner.Companion.getLogger();
        StringBuilder sb = new StringBuilder();
        sb.append(taskQueue.getName$okhttp());
        sb.append(' ');
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        p0.a.r(format, "format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(task.getName());
        logger.fine(sb.toString());
    }

    public static final <T> T logElapsed(@NotNull Task task, @NotNull TaskQueue taskQueue, @NotNull q0.a aVar) {
        long j2;
        p0.a.s(task, "task");
        p0.a.s(taskQueue, "queue");
        p0.a.s(aVar, "block");
        boolean isLoggable = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
        if (isLoggable) {
            j2 = taskQueue.getTaskRunner$okhttp().getBackend().nanoTime();
            log(task, taskQueue, "starting");
        } else {
            j2 = -1;
        }
        try {
            T t2 = (T) aVar.invoke();
            if (isLoggable) {
                log(task, taskQueue, "finished run in " + formatDuration(taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - j2));
            }
            return t2;
        } catch (Throwable th) {
            if (isLoggable) {
                log(task, taskQueue, "failed a run in " + formatDuration(taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - j2));
            }
            throw th;
        }
    }

    public static final void taskLog(@NotNull Task task, @NotNull TaskQueue taskQueue, @NotNull q0.a aVar) {
        p0.a.s(task, "task");
        p0.a.s(taskQueue, "queue");
        p0.a.s(aVar, "messageBlock");
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            log(task, taskQueue, (String) aVar.invoke());
        }
    }
}
