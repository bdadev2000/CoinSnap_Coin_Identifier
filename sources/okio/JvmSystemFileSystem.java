package okio;

import com.facebook.share.internal.ShareInternalUtility;
import e0.s;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public class JvmSystemFileSystem extends FileSystem {
    private final void requireCreate(Path path) {
        if (exists(path)) {
            throw new IOException(path + " already exists.");
        }
    }

    private final void requireExist(Path path) {
        if (exists(path)) {
            return;
        }
        throw new IOException(path + " doesn't exist.");
    }

    @Override // okio.FileSystem
    @NotNull
    public Sink appendingSink(@NotNull Path path, boolean z2) {
        p0.a.s(path, ShareInternalUtility.STAGING_PARAM);
        if (z2) {
            requireExist(path);
        }
        return Okio.sink(path.toFile(), true);
    }

    @Override // okio.FileSystem
    public void atomicMove(@NotNull Path path, @NotNull Path path2) {
        p0.a.s(path, "source");
        p0.a.s(path2, "target");
        if (path.toFile().renameTo(path2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + path + " to " + path2);
    }

    @Override // okio.FileSystem
    @NotNull
    public Path canonicalize(@NotNull Path path) {
        p0.a.s(path, "path");
        File canonicalFile = path.toFile().getCanonicalFile();
        if (canonicalFile.exists()) {
            return Path.Companion.get$default(Path.Companion, canonicalFile, false, 1, (Object) null);
        }
        throw new FileNotFoundException("no such file");
    }

    @Override // okio.FileSystem
    public void createDirectory(@NotNull Path path, boolean z2) {
        p0.a.s(path, "dir");
        if (path.toFile().mkdir()) {
            return;
        }
        FileMetadata metadataOrNull = metadataOrNull(path);
        if (metadataOrNull == null || !metadataOrNull.isDirectory()) {
            throw new IOException(a.a("failed to create directory: ", path));
        }
        if (z2) {
            throw new IOException(path + " already exists.");
        }
    }

    @Override // okio.FileSystem
    public void createSymlink(@NotNull Path path, @NotNull Path path2) {
        p0.a.s(path, "source");
        p0.a.s(path2, "target");
        throw new IOException("unsupported");
    }

    @Override // okio.FileSystem
    public void delete(@NotNull Path path, boolean z2) {
        p0.a.s(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = path.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            throw new IOException(a.a("failed to delete ", path));
        }
        if (z2) {
            throw new FileNotFoundException(a.a("no such file: ", path));
        }
    }

    @Override // okio.FileSystem
    @NotNull
    public List<Path> list(@NotNull Path path) {
        p0.a.s(path, "dir");
        List<Path> list = list(path, true);
        p0.a.p(list);
        return list;
    }

    @Override // okio.FileSystem
    @Nullable
    public List<Path> listOrNull(@NotNull Path path) {
        p0.a.s(path, "dir");
        return list(path, false);
    }

    @Override // okio.FileSystem
    @Nullable
    public FileMetadata metadataOrNull(@NotNull Path path) {
        p0.a.s(path, "path");
        File file = path.toFile();
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        long lastModified = file.lastModified();
        long length = file.length();
        if (isFile || isDirectory || lastModified != 0 || length != 0 || file.exists()) {
            return new FileMetadata(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null, null, 128, null);
        }
        return null;
    }

    @Override // okio.FileSystem
    @NotNull
    public FileHandle openReadOnly(@NotNull Path path) {
        p0.a.s(path, ShareInternalUtility.STAGING_PARAM);
        return new JvmFileHandle(false, new RandomAccessFile(path.toFile(), "r"));
    }

    @Override // okio.FileSystem
    @NotNull
    public FileHandle openReadWrite(@NotNull Path path, boolean z2, boolean z3) {
        p0.a.s(path, ShareInternalUtility.STAGING_PARAM);
        if (z2 && z3) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.".toString());
        }
        if (z2) {
            requireCreate(path);
        }
        if (z3) {
            requireExist(path);
        }
        return new JvmFileHandle(true, new RandomAccessFile(path.toFile(), "rw"));
    }

    @Override // okio.FileSystem
    @NotNull
    public Sink sink(@NotNull Path path, boolean z2) {
        Sink sink$default;
        p0.a.s(path, ShareInternalUtility.STAGING_PARAM);
        if (z2) {
            requireCreate(path);
        }
        sink$default = Okio__JvmOkioKt.sink$default(path.toFile(), false, 1, null);
        return sink$default;
    }

    @Override // okio.FileSystem
    @NotNull
    public Source source(@NotNull Path path) {
        p0.a.s(path, ShareInternalUtility.STAGING_PARAM);
        return Okio.source(path.toFile());
    }

    @NotNull
    public String toString() {
        return "JvmSystemFileSystem";
    }

    private final List<Path> list(Path path, boolean z2) {
        File file = path.toFile();
        String[] list = file.list();
        if (list == null) {
            if (!z2) {
                return null;
            }
            if (!file.exists()) {
                throw new FileNotFoundException(a.a("no such file: ", path));
            }
            throw new IOException(a.a("failed to list ", path));
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            p0.a.p(str);
            arrayList.add(path.resolve(str));
        }
        s.r0(arrayList);
        return arrayList;
    }
}
