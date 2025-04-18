package okio.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.k;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes2.dex */
public final class ZipEntry {

    @NotNull
    private final Path canonicalPath;

    @NotNull
    private final List<Path> children;

    @NotNull
    private final String comment;
    private final long compressedSize;
    private final int compressionMethod;
    private final long crc;
    private final boolean isDirectory;

    @Nullable
    private final Long lastModifiedAtMillis;
    private final long offset;
    private final long size;

    public ZipEntry(@NotNull Path path, boolean z2, @NotNull String str, long j2, long j3, long j4, int i2, @Nullable Long l2, long j5) {
        a.s(path, "canonicalPath");
        a.s(str, "comment");
        this.canonicalPath = path;
        this.isDirectory = z2;
        this.comment = str;
        this.crc = j2;
        this.compressedSize = j3;
        this.size = j4;
        this.compressionMethod = i2;
        this.lastModifiedAtMillis = l2;
        this.offset = j5;
        this.children = new ArrayList();
    }

    @NotNull
    public final Path getCanonicalPath() {
        return this.canonicalPath;
    }

    @NotNull
    public final List<Path> getChildren() {
        return this.children;
    }

    @NotNull
    public final String getComment() {
        return this.comment;
    }

    public final long getCompressedSize() {
        return this.compressedSize;
    }

    public final int getCompressionMethod() {
        return this.compressionMethod;
    }

    public final long getCrc() {
        return this.crc;
    }

    @Nullable
    public final Long getLastModifiedAtMillis() {
        return this.lastModifiedAtMillis;
    }

    public final long getOffset() {
        return this.offset;
    }

    public final long getSize() {
        return this.size;
    }

    public final boolean isDirectory() {
        return this.isDirectory;
    }

    public /* synthetic */ ZipEntry(Path path, boolean z2, String str, long j2, long j3, long j4, int i2, Long l2, long j5, int i3, k kVar) {
        this(path, (i3 & 2) != 0 ? false : z2, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? -1L : j2, (i3 & 16) != 0 ? -1L : j3, (i3 & 32) != 0 ? -1L : j4, (i3 & 64) != 0 ? -1 : i2, (i3 & 128) != 0 ? null : l2, (i3 & 256) == 0 ? j5 : -1L);
    }
}
