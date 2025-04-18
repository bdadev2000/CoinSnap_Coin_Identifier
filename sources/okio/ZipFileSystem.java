package okio;

import com.facebook.share.internal.ShareInternalUtility;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.firebase.sessions.settings.RemoteSettings;
import e0.u;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.q;
import okio.Path;
import okio.internal.FixedLengthSource;
import okio.internal.ZipEntry;
import okio.internal.ZipFilesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class ZipFileSystem extends FileSystem {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Path ROOT = Path.Companion.get$default(Path.Companion, RemoteSettings.FORWARD_SLASH_STRING, false, 1, (Object) null);

    @Nullable
    private final String comment;

    @NotNull
    private final Map<Path, ZipEntry> entries;

    @NotNull
    private final FileSystem fileSystem;

    @NotNull
    private final Path zipPath;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        @NotNull
        public final Path getROOT() {
            return ZipFileSystem.ROOT;
        }
    }

    public ZipFileSystem(@NotNull Path path, @NotNull FileSystem fileSystem, @NotNull Map<Path, ZipEntry> map, @Nullable String str) {
        p0.a.s(path, "zipPath");
        p0.a.s(fileSystem, "fileSystem");
        p0.a.s(map, RemoteConfigConstants.ResponseFieldKey.ENTRIES);
        this.zipPath = path;
        this.fileSystem = fileSystem;
        this.entries = map;
        this.comment = str;
    }

    private final Path canonicalizeInternal(Path path) {
        return ROOT.resolve(path, true);
    }

    @Override // okio.FileSystem
    @NotNull
    public Sink appendingSink(@NotNull Path path, boolean z2) {
        p0.a.s(path, ShareInternalUtility.STAGING_PARAM);
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public void atomicMove(@NotNull Path path, @NotNull Path path2) {
        p0.a.s(path, "source");
        p0.a.s(path2, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    @NotNull
    public Path canonicalize(@NotNull Path path) {
        p0.a.s(path, "path");
        Path canonicalizeInternal = canonicalizeInternal(path);
        if (this.entries.containsKey(canonicalizeInternal)) {
            return canonicalizeInternal;
        }
        throw new FileNotFoundException(String.valueOf(path));
    }

    @Override // okio.FileSystem
    public void createDirectory(@NotNull Path path, boolean z2) {
        p0.a.s(path, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public void createSymlink(@NotNull Path path, @NotNull Path path2) {
        p0.a.s(path, "source");
        p0.a.s(path2, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public void delete(@NotNull Path path, boolean z2) {
        p0.a.s(path, "path");
        throw new IOException("zip file systems are read-only");
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
        FileMetadata fileMetadata;
        Throwable th;
        p0.a.s(path, "path");
        ZipEntry zipEntry = this.entries.get(canonicalizeInternal(path));
        Throwable th2 = null;
        if (zipEntry == null) {
            return null;
        }
        FileMetadata fileMetadata2 = new FileMetadata(!zipEntry.isDirectory(), zipEntry.isDirectory(), null, zipEntry.isDirectory() ? null : Long.valueOf(zipEntry.getSize()), null, zipEntry.getLastModifiedAtMillis(), null, null, 128, null);
        if (zipEntry.getOffset() == -1) {
            return fileMetadata2;
        }
        FileHandle openReadOnly = this.fileSystem.openReadOnly(this.zipPath);
        try {
            BufferedSource buffer = Okio.buffer(openReadOnly.source(zipEntry.getOffset()));
            try {
                fileMetadata = ZipFilesKt.readLocalHeader(buffer, fileMetadata2);
                if (buffer != null) {
                    try {
                        buffer.close();
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                th = null;
            } catch (Throwable th4) {
                if (buffer != null) {
                    try {
                        buffer.close();
                    } catch (Throwable th5) {
                        q.a(th4, th5);
                    }
                }
                th = th4;
                fileMetadata = null;
            }
        } catch (Throwable th6) {
            if (openReadOnly != null) {
                try {
                    openReadOnly.close();
                } catch (Throwable th7) {
                    q.a(th6, th7);
                }
            }
            fileMetadata = null;
            th2 = th6;
        }
        if (th != null) {
            throw th;
        }
        p0.a.p(fileMetadata);
        if (openReadOnly != null) {
            try {
                openReadOnly.close();
            } catch (Throwable th8) {
                th2 = th8;
            }
        }
        if (th2 != null) {
            throw th2;
        }
        p0.a.p(fileMetadata);
        return fileMetadata;
    }

    @Override // okio.FileSystem
    @NotNull
    public FileHandle openReadOnly(@NotNull Path path) {
        p0.a.s(path, ShareInternalUtility.STAGING_PARAM);
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // okio.FileSystem
    @NotNull
    public FileHandle openReadWrite(@NotNull Path path, boolean z2, boolean z3) {
        p0.a.s(path, ShareInternalUtility.STAGING_PARAM);
        throw new IOException("zip entries are not writable");
    }

    @Override // okio.FileSystem
    @NotNull
    public Sink sink(@NotNull Path path, boolean z2) {
        p0.a.s(path, ShareInternalUtility.STAGING_PARAM);
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    @NotNull
    public Source source(@NotNull Path path) throws IOException {
        BufferedSource bufferedSource;
        p0.a.s(path, ShareInternalUtility.STAGING_PARAM);
        ZipEntry zipEntry = this.entries.get(canonicalizeInternal(path));
        if (zipEntry == null) {
            throw new FileNotFoundException(a.a("no such file: ", path));
        }
        FileHandle openReadOnly = this.fileSystem.openReadOnly(this.zipPath);
        Throwable th = null;
        try {
            bufferedSource = Okio.buffer(openReadOnly.source(zipEntry.getOffset()));
            if (openReadOnly != null) {
                try {
                    openReadOnly.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (openReadOnly != null) {
                try {
                    openReadOnly.close();
                } catch (Throwable th4) {
                    q.a(th3, th4);
                }
            }
            bufferedSource = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        p0.a.p(bufferedSource);
        ZipFilesKt.skipLocalHeader(bufferedSource);
        return zipEntry.getCompressionMethod() == 0 ? new FixedLengthSource(bufferedSource, zipEntry.getSize(), true) : new FixedLengthSource(new InflaterSource(new FixedLengthSource(bufferedSource, zipEntry.getCompressedSize(), true), new Inflater(true)), zipEntry.getSize(), false);
    }

    private final List<Path> list(Path path, boolean z2) {
        ZipEntry zipEntry = this.entries.get(canonicalizeInternal(path));
        if (zipEntry != null) {
            return u.Z0(zipEntry.getChildren());
        }
        if (z2) {
            throw new IOException(a.a("not a directory: ", path));
        }
        return null;
    }
}
