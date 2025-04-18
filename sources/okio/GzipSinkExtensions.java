package okio;

import org.jetbrains.annotations.NotNull;

/* renamed from: okio.-GzipSinkExtensions, reason: invalid class name */
/* loaded from: classes3.dex */
public final class GzipSinkExtensions {
    @NotNull
    public static final GzipSink gzip(@NotNull Sink sink) {
        p0.a.s(sink, "<this>");
        return new GzipSink(sink);
    }
}
