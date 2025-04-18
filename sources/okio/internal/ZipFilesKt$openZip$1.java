package okio.internal;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes2.dex */
public final class ZipFilesKt$openZip$1 extends r implements l {
    public static final ZipFilesKt$openZip$1 INSTANCE = new ZipFilesKt$openZip$1();

    public ZipFilesKt$openZip$1() {
        super(1);
    }

    @Override // q0.l
    @NotNull
    public final Boolean invoke(@NotNull ZipEntry zipEntry) {
        a.s(zipEntry, "it");
        return Boolean.TRUE;
    }
}
