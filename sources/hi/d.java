package hi;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes5.dex */
public final class d extends Handler {
    public static final d a = new d();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord record) {
        int i10;
        int indexOf$default;
        int min;
        Intrinsics.checkNotNullParameter(record, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = c.a;
        String loggerName = record.getLoggerName();
        Intrinsics.checkNotNullExpressionValue(loggerName, "record.loggerName");
        if (record.getLevel().intValue() > Level.INFO.intValue()) {
            i10 = 5;
        } else if (record.getLevel().intValue() == Level.INFO.intValue()) {
            i10 = 4;
        } else {
            i10 = 3;
        }
        String message = record.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "record.message");
        Throwable thrown = record.getThrown();
        Intrinsics.checkNotNullParameter(loggerName, "loggerName");
        Intrinsics.checkNotNullParameter(message, "message");
        String str = (String) c.f19119b.get(loggerName);
        if (str == null) {
            str = StringsKt.take(loggerName, 23);
        }
        if (Log.isLoggable(str, i10)) {
            if (thrown != null) {
                message = message + '\n' + ((Object) Log.getStackTraceString(thrown));
            }
            int length = message.length();
            int i11 = 0;
            while (i11 < length) {
                indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) message, '\n', i11, false, 4, (Object) null);
                if (indexOf$default == -1) {
                    indexOf$default = length;
                }
                while (true) {
                    min = Math.min(indexOf$default, i11 + 4000);
                    String substring = message.substring(i11, min);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i10, str, substring);
                    if (min >= indexOf$default) {
                        break;
                    } else {
                        i11 = min;
                    }
                }
                i11 = min + 1;
            }
        }
    }
}
