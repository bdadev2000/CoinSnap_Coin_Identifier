package okio;

import com.facebook.share.internal.ShareInternalUtility;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.q;
import okio.Path;
import okio.internal.ResourceFileSystem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.l;
import y0.j;

/* loaded from: classes2.dex */
public abstract class FileSystem {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final FileSystem RESOURCES;

    @NotNull
    public static final FileSystem SYSTEM;

    @NotNull
    public static final Path SYSTEM_TEMPORARY_DIRECTORY;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        @NotNull
        public final FileSystem get(@NotNull java.nio.file.FileSystem fileSystem) {
            p0.a.s(fileSystem, "<this>");
            return new NioFileSystemWrappingFileSystem(fileSystem);
        }
    }

    /* renamed from: -write$default, reason: not valid java name */
    public static /* synthetic */ Object m777write$default(FileSystem fileSystem, Path path, boolean z2, l lVar, int i2, Object obj) throws IOException {
        Object obj2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        p0.a.s(path, ShareInternalUtility.STAGING_PARAM);
        p0.a.s(lVar, "writerAction");
        BufferedSink buffer = Okio.buffer(fileSystem.sink(path, z2));
        Throwable th = null;
        try {
            obj2 = lVar.invoke(buffer);
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (Throwable th4) {
                    q.a(th3, th4);
                }
            }
            obj2 = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        p0.a.p(obj2);
        return obj2;
    }

    static {
        FileSystem jvmSystemFileSystem;
        try {
            Class.forName("java.nio.file.Files");
            jvmSystemFileSystem = new NioSystemFileSystem();
        } catch (ClassNotFoundException unused) {
            jvmSystemFileSystem = new JvmSystemFileSystem();
        }
        SYSTEM = jvmSystemFileSystem;
        Path.Companion companion = Path.Companion;
        String property = System.getProperty("java.io.tmpdir");
        p0.a.r(property, "getProperty(...)");
        SYSTEM_TEMPORARY_DIRECTORY = Path.Companion.get$default(companion, property, false, 1, (Object) null);
        ClassLoader classLoader = ResourceFileSystem.class.getClassLoader();
        p0.a.r(classLoader, "getClassLoader(...)");
        RESOURCES = new ResourceFileSystem(classLoader, false, null, 4, null);
    }

    public static /* synthetic */ Sink appendingSink$default(FileSystem fileSystem, Path path, boolean z2, int i2, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendingSink");
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return fileSystem.appendingSink(path, z2);
    }

    public static /* synthetic */ void createDirectories$default(FileSystem fileSystem, Path path, boolean z2, int i2, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectories");
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        fileSystem.createDirectories(path, z2);
    }

    public static /* synthetic */ void createDirectory$default(FileSystem fileSystem, Path path, boolean z2, int i2, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        fileSystem.createDirectory(path, z2);
    }

    public static /* synthetic */ void delete$default(FileSystem fileSystem, Path path, boolean z2, int i2, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        fileSystem.delete(path, z2);
    }

    public static /* synthetic */ void deleteRecursively$default(FileSystem fileSystem, Path path, boolean z2, int i2, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteRecursively");
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        fileSystem.deleteRecursively(path, z2);
    }

    @NotNull
    public static final FileSystem get(@NotNull java.nio.file.FileSystem fileSystem) {
        return Companion.get(fileSystem);
    }

    public static /* synthetic */ j listRecursively$default(FileSystem fileSystem, Path path, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listRecursively");
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return fileSystem.listRecursively(path, z2);
    }

    public static /* synthetic */ FileHandle openReadWrite$default(FileSystem fileSystem, Path path, boolean z2, boolean z3, int i2, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openReadWrite");
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        return fileSystem.openReadWrite(path, z2, z3);
    }

    public static /* synthetic */ Sink sink$default(FileSystem fileSystem, Path path, boolean z2, int i2, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return fileSystem.sink(path, z2);
    }

    /* renamed from: -read, reason: not valid java name */
    public final <T> T m778read(@NotNull Path path, @NotNull l lVar) throws IOException {
        T t2;
        p0.a.s(path, ShareInternalUtility.STAGING_PARAM);
        p0.a.s(lVar, "readerAction");
        BufferedSource buffer = Okio.buffer(source(path));
        Throwable th = null;
        try {
            t2 = (T) lVar.invoke(buffer);
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (Throwable th4) {
                    q.a(th3, th4);
                }
            }
            th = th3;
            t2 = null;
        }
        if (th != null) {
            throw th;
        }
        p0.a.p(t2);
        return t2;
    }

    /* renamed from: -write, reason: not valid java name */
    public final <T> T m779write(@NotNull Path path, boolean z2, @NotNull l lVar) throws IOException {
        T t2;
        p0.a.s(path, ShareInternalUtility.STAGING_PARAM);
        p0.a.s(lVar, "writerAction");
        BufferedSink buffer = Okio.buffer(sink(path, z2));
        Throwable th = null;
        try {
            t2 = (T) lVar.invoke(buffer);
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (Throwable th4) {
                    q.a(th3, th4);
                }
            }
            t2 = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        p0.a.p(t2);
        return t2;
    }

    @NotNull
    public final Sink appendingSink(@NotNull Path path) throws IOException {
        p0.a.s(path, ShareInternalUtility.STAGING_PARAM);
        return appendingSink(path, false);
    }

    @NotNull
    public abstract Sink appendingSink(@NotNull Path path, boolean z2) throws IOException;

    public abstract void atomicMove(@NotNull Path path, @NotNull Path path2) throws IOException;

    @NotNull
    public abstract Path canonicalize(@NotNull Path path) throws IOException;

    public void copy(@NotNull Path path, @NotNull Path path2) throws IOException {
        p0.a.s(path, "source");
        p0.a.s(path2, "target");
        okio.internal.FileSystem.commonCopy(this, path, path2);
    }

    public final void createDirectories(@NotNull Path path, boolean z2) throws IOException {
        p0.a.s(path, "dir");
        okio.internal.FileSystem.commonCreateDirectories(this, path, z2);
    }

    public final void createDirectory(@NotNull Path path) throws IOException {
        p0.a.s(path, "dir");
        createDirectory(path, false);
    }

    public abstract void createDirectory(@NotNull Path path, boolean z2) throws IOException;

    public abstract void createSymlink(@NotNull Path path, @NotNull Path path2) throws IOException;

    public final void delete(@NotNull Path path) throws IOException {
        p0.a.s(path, "path");
        delete(path, false);
    }

    public abstract void delete(@NotNull Path path, boolean z2) throws IOException;

    public void deleteRecursively(@NotNull Path path, boolean z2) throws IOException {
        p0.a.s(path, "fileOrDirectory");
        okio.internal.FileSystem.commonDeleteRecursively(this, path, z2);
    }

    public final boolean exists(@NotNull Path path) throws IOException {
        p0.a.s(path, "path");
        return okio.internal.FileSystem.commonExists(this, path);
    }

    @NotNull
    public abstract List<Path> list(@NotNull Path path) throws IOException;

    @Nullable
    public abstract List<Path> listOrNull(@NotNull Path path);

    @NotNull
    public j listRecursively(@NotNull Path path, boolean z2) {
        p0.a.s(path, "dir");
        return okio.internal.FileSystem.commonListRecursively(this, path, z2);
    }

    @NotNull
    public final FileMetadata metadata(@NotNull Path path) throws IOException {
        p0.a.s(path, "path");
        return okio.internal.FileSystem.commonMetadata(this, path);
    }

    @Nullable
    public abstract FileMetadata metadataOrNull(@NotNull Path path) throws IOException;

    @NotNull
    public abstract FileHandle openReadOnly(@NotNull Path path) throws IOException;

    @NotNull
    public final FileHandle openReadWrite(@NotNull Path path) throws IOException {
        p0.a.s(path, ShareInternalUtility.STAGING_PARAM);
        return openReadWrite(path, false, false);
    }

    @NotNull
    public abstract FileHandle openReadWrite(@NotNull Path path, boolean z2, boolean z3) throws IOException;

    @NotNull
    public final Sink sink(@NotNull Path path) throws IOException {
        p0.a.s(path, ShareInternalUtility.STAGING_PARAM);
        return sink(path, false);
    }

    @NotNull
    public abstract Sink sink(@NotNull Path path, boolean z2) throws IOException;

    @NotNull
    public abstract Source source(@NotNull Path path) throws IOException;

    public final void createDirectories(@NotNull Path path) throws IOException {
        p0.a.s(path, "dir");
        createDirectories(path, false);
    }

    public final void deleteRecursively(@NotNull Path path) throws IOException {
        p0.a.s(path, "fileOrDirectory");
        deleteRecursively(path, false);
    }

    @NotNull
    public final j listRecursively(@NotNull Path path) {
        p0.a.s(path, "dir");
        return listRecursively(path, false);
    }
}
