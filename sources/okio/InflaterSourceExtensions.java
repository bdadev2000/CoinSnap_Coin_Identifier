package okio;

import java.util.zip.Inflater;
import org.jetbrains.annotations.NotNull;

/* renamed from: okio.-InflaterSourceExtensions, reason: invalid class name */
/* loaded from: classes3.dex */
public final class InflaterSourceExtensions {
    @NotNull
    public static final InflaterSource inflate(@NotNull Source source, @NotNull Inflater inflater) {
        p0.a.s(source, "<this>");
        p0.a.s(inflater, "inflater");
        return new InflaterSource(source, inflater);
    }

    public static /* synthetic */ InflaterSource inflate$default(Source source, Inflater inflater, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            inflater = new Inflater();
        }
        p0.a.s(source, "<this>");
        p0.a.s(inflater, "inflater");
        return new InflaterSource(source, inflater);
    }
}
