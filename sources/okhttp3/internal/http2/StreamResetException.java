package okhttp3.internal.http2;

import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import p0.a;

/* loaded from: classes4.dex */
public final class StreamResetException extends IOException {

    @NotNull
    public final ErrorCode errorCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamResetException(@NotNull ErrorCode errorCode) {
        super("stream was reset: " + errorCode);
        a.s(errorCode, "errorCode");
        this.errorCode = errorCode;
    }
}
