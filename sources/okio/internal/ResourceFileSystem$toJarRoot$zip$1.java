package okio.internal;

import kotlin.jvm.internal.r;
import okio.internal.ResourceFileSystem;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes2.dex */
public final class ResourceFileSystem$toJarRoot$zip$1 extends r implements l {
    public static final ResourceFileSystem$toJarRoot$zip$1 INSTANCE = new ResourceFileSystem$toJarRoot$zip$1();

    public ResourceFileSystem$toJarRoot$zip$1() {
        super(1);
    }

    @Override // q0.l
    @NotNull
    public final Boolean invoke(@NotNull ZipEntry zipEntry) {
        ResourceFileSystem.Companion companion;
        a.s(zipEntry, "entry");
        companion = ResourceFileSystem.Companion;
        return Boolean.valueOf(companion.keepPath(zipEntry.getCanonicalPath()));
    }
}
