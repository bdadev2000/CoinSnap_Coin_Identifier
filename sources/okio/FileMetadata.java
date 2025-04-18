package okio;

import e0.e0;
import e0.u;
import e0.x;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x0.c;

/* loaded from: classes2.dex */
public final class FileMetadata {

    @Nullable
    private final Long createdAtMillis;

    @NotNull
    private final Map<c, Object> extras;
    private final boolean isDirectory;
    private final boolean isRegularFile;

    @Nullable
    private final Long lastAccessedAtMillis;

    @Nullable
    private final Long lastModifiedAtMillis;

    @Nullable
    private final Long size;

    @Nullable
    private final Path symlinkTarget;

    public FileMetadata() {
        this(false, false, null, null, null, null, null, null, 255, null);
    }

    @NotNull
    public final FileMetadata copy(boolean z2, boolean z3, @Nullable Path path, @Nullable Long l2, @Nullable Long l3, @Nullable Long l4, @Nullable Long l5, @NotNull Map<c, ? extends Object> map) {
        p0.a.s(map, "extras");
        return new FileMetadata(z2, z3, path, l2, l3, l4, l5, map);
    }

    @Nullable
    public final <T> T extra(@NotNull c cVar) {
        p0.a.s(cVar, "type");
        T t2 = (T) this.extras.get(cVar);
        if (t2 == null) {
            return null;
        }
        j jVar = (j) cVar;
        if (jVar.d(t2)) {
            return t2;
        }
        throw new ClassCastException("Value cannot be cast to " + jVar.b());
    }

    @Nullable
    public final Long getCreatedAtMillis() {
        return this.createdAtMillis;
    }

    @NotNull
    public final Map<c, Object> getExtras() {
        return this.extras;
    }

    @Nullable
    public final Long getLastAccessedAtMillis() {
        return this.lastAccessedAtMillis;
    }

    @Nullable
    public final Long getLastModifiedAtMillis() {
        return this.lastModifiedAtMillis;
    }

    @Nullable
    public final Long getSize() {
        return this.size;
    }

    @Nullable
    public final Path getSymlinkTarget() {
        return this.symlinkTarget;
    }

    public final boolean isDirectory() {
        return this.isDirectory;
    }

    public final boolean isRegularFile() {
        return this.isRegularFile;
    }

    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.isRegularFile) {
            arrayList.add("isRegularFile");
        }
        if (this.isDirectory) {
            arrayList.add("isDirectory");
        }
        if (this.size != null) {
            arrayList.add("byteCount=" + this.size);
        }
        if (this.createdAtMillis != null) {
            arrayList.add("createdAt=" + this.createdAtMillis);
        }
        if (this.lastModifiedAtMillis != null) {
            arrayList.add("lastModifiedAt=" + this.lastModifiedAtMillis);
        }
        if (this.lastAccessedAtMillis != null) {
            arrayList.add("lastAccessedAt=" + this.lastAccessedAtMillis);
        }
        if (!this.extras.isEmpty()) {
            arrayList.add("extras=" + this.extras);
        }
        return u.K0(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }

    public FileMetadata(boolean z2, boolean z3, @Nullable Path path, @Nullable Long l2, @Nullable Long l3, @Nullable Long l4, @Nullable Long l5, @NotNull Map<c, ? extends Object> map) {
        p0.a.s(map, "extras");
        this.isRegularFile = z2;
        this.isDirectory = z3;
        this.symlinkTarget = path;
        this.size = l2;
        this.createdAtMillis = l3;
        this.lastModifiedAtMillis = l4;
        this.lastAccessedAtMillis = l5;
        this.extras = e0.x(map);
    }

    public /* synthetic */ FileMetadata(boolean z2, boolean z3, Path path, Long l2, Long l3, Long l4, Long l5, Map map, int i2, k kVar) {
        this((i2 & 1) != 0 ? false : z2, (i2 & 2) == 0 ? z3 : false, (i2 & 4) != 0 ? null : path, (i2 & 8) != 0 ? null : l2, (i2 & 16) != 0 ? null : l3, (i2 & 32) != 0 ? null : l4, (i2 & 64) == 0 ? l5 : null, (i2 & 128) != 0 ? x.f30219a : map);
    }
}
