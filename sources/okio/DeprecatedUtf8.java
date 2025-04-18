package okio;

import org.jetbrains.annotations.NotNull;

@d0.a
/* renamed from: okio.-DeprecatedUtf8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class DeprecatedUtf8 {

    @NotNull
    public static final DeprecatedUtf8 INSTANCE = new DeprecatedUtf8();

    private DeprecatedUtf8() {
    }

    @d0.a
    public final long size(@NotNull String str) {
        p0.a.s(str, "string");
        return Utf8.size$default(str, 0, 0, 3, null);
    }

    @d0.a
    public final long size(@NotNull String str, int i2, int i3) {
        p0.a.s(str, "string");
        return Utf8.size(str, i2, i3);
    }
}
