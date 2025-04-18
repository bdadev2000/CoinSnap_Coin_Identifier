package okio;

import org.jetbrains.annotations.NotNull;

/* renamed from: okio.-GzipSourceExtensions, reason: invalid class name */
/* loaded from: classes3.dex */
public final class GzipSourceExtensions {
    private static final int FCOMMENT = 4;
    private static final int FEXTRA = 2;
    private static final int FHCRC = 1;
    private static final int FNAME = 3;
    private static final byte SECTION_BODY = 1;
    private static final byte SECTION_DONE = 3;
    private static final byte SECTION_HEADER = 0;
    private static final byte SECTION_TRAILER = 2;

    private static final boolean getBit(int i2, int i3) {
        return ((i2 >> i3) & 1) == 1;
    }

    @NotNull
    public static final GzipSource gzip(@NotNull Source source) {
        p0.a.s(source, "<this>");
        return new GzipSource(source);
    }
}
