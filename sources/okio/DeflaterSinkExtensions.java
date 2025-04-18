package okio;

import java.util.zip.Deflater;
import org.jetbrains.annotations.NotNull;

/* renamed from: okio.-DeflaterSinkExtensions, reason: invalid class name */
/* loaded from: classes4.dex */
public final class DeflaterSinkExtensions {
    @NotNull
    public static final DeflaterSink deflate(@NotNull Sink sink, @NotNull Deflater deflater) {
        p0.a.s(sink, "<this>");
        p0.a.s(deflater, "deflater");
        return new DeflaterSink(sink, deflater);
    }

    public static /* synthetic */ DeflaterSink deflate$default(Sink sink, Deflater deflater, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            deflater = new Deflater();
        }
        p0.a.s(sink, "<this>");
        p0.a.s(deflater, "deflater");
        return new DeflaterSink(sink, deflater);
    }
}
