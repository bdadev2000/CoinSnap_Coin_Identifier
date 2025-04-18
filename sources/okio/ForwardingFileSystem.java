package okio;

import com.facebook.share.internal.ShareInternalUtility;
import e0.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y0.j;
import y0.m;

/* loaded from: classes.dex */
public abstract class ForwardingFileSystem extends FileSystem {

    @NotNull
    private final FileSystem delegate;

    public ForwardingFileSystem(@NotNull FileSystem fileSystem) {
        p0.a.s(fileSystem, "delegate");
        this.delegate = fileSystem;
    }

    @Override // okio.FileSystem
    @NotNull
    public Sink appendingSink(@NotNull Path path, boolean z2) throws IOException {
        p0.a.s(path, ShareInternalUtility.STAGING_PARAM);
        return this.delegate.appendingSink(onPathParameter(path, "appendingSink", ShareInternalUtility.STAGING_PARAM), z2);
    }

    @Override // okio.FileSystem
    public void atomicMove(@NotNull Path path, @NotNull Path path2) throws IOException {
        p0.a.s(path, "source");
        p0.a.s(path2, "target");
        this.delegate.atomicMove(onPathParameter(path, "atomicMove", "source"), onPathParameter(path2, "atomicMove", "target"));
    }

    @Override // okio.FileSystem
    @NotNull
    public Path canonicalize(@NotNull Path path) throws IOException {
        p0.a.s(path, "path");
        return onPathResult(this.delegate.canonicalize(onPathParameter(path, "canonicalize", "path")), "canonicalize");
    }

    @Override // okio.FileSystem
    public void createDirectory(@NotNull Path path, boolean z2) throws IOException {
        p0.a.s(path, "dir");
        this.delegate.createDirectory(onPathParameter(path, "createDirectory", "dir"), z2);
    }

    @Override // okio.FileSystem
    public void createSymlink(@NotNull Path path, @NotNull Path path2) throws IOException {
        p0.a.s(path, "source");
        p0.a.s(path2, "target");
        this.delegate.createSymlink(onPathParameter(path, "createSymlink", "source"), onPathParameter(path2, "createSymlink", "target"));
    }

    @NotNull
    public final FileSystem delegate() {
        return this.delegate;
    }

    @Override // okio.FileSystem
    public void delete(@NotNull Path path, boolean z2) throws IOException {
        p0.a.s(path, "path");
        this.delegate.delete(onPathParameter(path, "delete", "path"), z2);
    }

    @Override // okio.FileSystem
    @NotNull
    public List<Path> list(@NotNull Path path) throws IOException {
        p0.a.s(path, "dir");
        List<Path> list = this.delegate.list(onPathParameter(path, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((Path) it.next(), "list"));
        }
        s.r0(arrayList);
        return arrayList;
    }

    @Override // okio.FileSystem
    @Nullable
    public List<Path> listOrNull(@NotNull Path path) {
        p0.a.s(path, "dir");
        List<Path> listOrNull = this.delegate.listOrNull(onPathParameter(path, "listOrNull", "dir"));
        if (listOrNull == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listOrNull.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((Path) it.next(), "listOrNull"));
        }
        s.r0(arrayList);
        return arrayList;
    }

    @Override // okio.FileSystem
    @NotNull
    public j listRecursively(@NotNull Path path, boolean z2) {
        p0.a.s(path, "dir");
        return m.P(this.delegate.listRecursively(onPathParameter(path, "listRecursively", "dir"), z2), new ForwardingFileSystem$listRecursively$1(this));
    }

    @Override // okio.FileSystem
    @Nullable
    public FileMetadata metadataOrNull(@NotNull Path path) throws IOException {
        FileMetadata copy;
        p0.a.s(path, "path");
        FileMetadata metadataOrNull = this.delegate.metadataOrNull(onPathParameter(path, "metadataOrNull", "path"));
        if (metadataOrNull == null) {
            return null;
        }
        if (metadataOrNull.getSymlinkTarget() == null) {
            return metadataOrNull;
        }
        copy = metadataOrNull.copy((r18 & 1) != 0 ? metadataOrNull.isRegularFile : false, (r18 & 2) != 0 ? metadataOrNull.isDirectory : false, (r18 & 4) != 0 ? metadataOrNull.symlinkTarget : onPathResult(metadataOrNull.getSymlinkTarget(), "metadataOrNull"), (r18 & 8) != 0 ? metadataOrNull.size : null, (r18 & 16) != 0 ? metadataOrNull.createdAtMillis : null, (r18 & 32) != 0 ? metadataOrNull.lastModifiedAtMillis : null, (r18 & 64) != 0 ? metadataOrNull.lastAccessedAtMillis : null, (r18 & 128) != 0 ? metadataOrNull.extras : null);
        return copy;
    }

    @NotNull
    public Path onPathParameter(@NotNull Path path, @NotNull String str, @NotNull String str2) {
        p0.a.s(path, "path");
        p0.a.s(str, "functionName");
        p0.a.s(str2, "parameterName");
        return path;
    }

    @NotNull
    public Path onPathResult(@NotNull Path path, @NotNull String str) {
        p0.a.s(path, "path");
        p0.a.s(str, "functionName");
        return path;
    }

    @Override // okio.FileSystem
    @NotNull
    public FileHandle openReadOnly(@NotNull Path path) throws IOException {
        p0.a.s(path, ShareInternalUtility.STAGING_PARAM);
        return this.delegate.openReadOnly(onPathParameter(path, "openReadOnly", ShareInternalUtility.STAGING_PARAM));
    }

    @Override // okio.FileSystem
    @NotNull
    public FileHandle openReadWrite(@NotNull Path path, boolean z2, boolean z3) throws IOException {
        p0.a.s(path, ShareInternalUtility.STAGING_PARAM);
        return this.delegate.openReadWrite(onPathParameter(path, "openReadWrite", ShareInternalUtility.STAGING_PARAM), z2, z3);
    }

    @Override // okio.FileSystem
    @NotNull
    public Sink sink(@NotNull Path path, boolean z2) throws IOException {
        p0.a.s(path, ShareInternalUtility.STAGING_PARAM);
        return this.delegate.sink(onPathParameter(path, "sink", ShareInternalUtility.STAGING_PARAM), z2);
    }

    @Override // okio.FileSystem
    @NotNull
    public Source source(@NotNull Path path) throws IOException {
        p0.a.s(path, ShareInternalUtility.STAGING_PARAM);
        return this.delegate.source(onPathParameter(path, "source", ShareInternalUtility.STAGING_PARAM));
    }

    @NotNull
    public String toString() {
        return g0.a(getClass()).c() + '(' + this.delegate + ')';
    }
}
