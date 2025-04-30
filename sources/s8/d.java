package s8;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* loaded from: classes3.dex */
public final class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final d f22989a = new Handler();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int i9;
        int min;
        G7.j.e(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = c.f22988a;
        String loggerName = logRecord.getLoggerName();
        G7.j.d(loggerName, "record.loggerName");
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (intValue > level.intValue()) {
            i9 = 5;
        } else if (logRecord.getLevel().intValue() == level.intValue()) {
            i9 = 4;
        } else {
            i9 = 3;
        }
        String message = logRecord.getMessage();
        G7.j.d(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String str = (String) c.b.get(loggerName);
        if (str == null) {
            str = O7.g.Z(23, loggerName);
        }
        if (Log.isLoggable(str, i9)) {
            if (thrown != null) {
                message = message + '\n' + ((Object) Log.getStackTraceString(thrown));
            }
            int length = message.length();
            int i10 = 0;
            while (i10 < length) {
                int I5 = O7.g.I(message, '\n', i10, false, 4);
                if (I5 == -1) {
                    I5 = length;
                }
                while (true) {
                    min = Math.min(I5, i10 + 4000);
                    String substring = message.substring(i10, min);
                    G7.j.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i9, str, substring);
                    if (min >= I5) {
                        break;
                    } else {
                        i10 = min;
                    }
                }
                i10 = min + 1;
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
