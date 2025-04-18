package okio.internal;

import e0.n;
import e0.p;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import kotlin.jvm.internal.q;
import okio.BufferedSink;
import okio.FileMetadata;
import okio.Okio;
import okio.Path;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import y0.j;

/* renamed from: okio.internal.-FileSystem, reason: invalid class name */
/* loaded from: classes2.dex */
public final class FileSystem {
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d1, code lost:
    
        if (r0 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d3, code lost:
    
        if (r8 != 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d5, code lost:
    
        r6.addLast(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00dc, code lost:
    
        r8 = r6;
        r6 = r1;
        r1 = r0;
        r0 = r2;
        r2 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0118, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0119, code lost:
    
        r8 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object collectRecursively(@org.jetbrains.annotations.NotNull y0.l r16, @org.jetbrains.annotations.NotNull okio.FileSystem r17, @org.jetbrains.annotations.NotNull e0.n r18, @org.jetbrains.annotations.NotNull okio.Path r19, boolean r20, boolean r21, @org.jetbrains.annotations.NotNull h0.g r22) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.FileSystem.collectRecursively(y0.l, okio.FileSystem, e0.n, okio.Path, boolean, boolean, h0.g):java.lang.Object");
    }

    public static final void commonCopy(@NotNull okio.FileSystem fileSystem, @NotNull Path path, @NotNull Path path2) throws IOException {
        Long l2;
        Throwable th;
        Long l3;
        a.s(fileSystem, "<this>");
        a.s(path, "source");
        a.s(path2, "target");
        Source source = fileSystem.source(path);
        Throwable th2 = null;
        try {
            BufferedSink buffer = Okio.buffer(fileSystem.sink(path2));
            try {
                l3 = Long.valueOf(buffer.writeAll(source));
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
                l3 = null;
            }
        } catch (Throwable th6) {
            if (source != null) {
                try {
                    source.close();
                } catch (Throwable th7) {
                    q.a(th6, th7);
                }
            }
            th2 = th6;
            l2 = null;
        }
        if (th != null) {
            throw th;
        }
        a.p(l3);
        l2 = Long.valueOf(l3.longValue());
        if (source != null) {
            try {
                source.close();
            } catch (Throwable th8) {
                th2 = th8;
            }
        }
        if (th2 != null) {
            throw th2;
        }
        a.p(l2);
    }

    public static final void commonCreateDirectories(@NotNull okio.FileSystem fileSystem, @NotNull Path path, boolean z2) throws IOException {
        a.s(fileSystem, "<this>");
        a.s(path, "dir");
        n nVar = new n();
        for (Path path2 = path; path2 != null && !fileSystem.exists(path2); path2 = path2.parent()) {
            nVar.addFirst(path2);
        }
        if (z2 && nVar.isEmpty()) {
            throw new IOException(path + " already exists.");
        }
        Iterator<E> it = nVar.iterator();
        while (it.hasNext()) {
            fileSystem.createDirectory((Path) it.next());
        }
    }

    public static final void commonDeleteRecursively(@NotNull okio.FileSystem fileSystem, @NotNull Path path, boolean z2) throws IOException {
        a.s(fileSystem, "<this>");
        a.s(path, "fileOrDirectory");
        Iterator it = new p(new FileSystem$commonDeleteRecursively$sequence$1(fileSystem, path, null), 3).iterator();
        while (it.hasNext()) {
            fileSystem.delete((Path) it.next(), z2 && !it.hasNext());
        }
    }

    public static final boolean commonExists(@NotNull okio.FileSystem fileSystem, @NotNull Path path) throws IOException {
        a.s(fileSystem, "<this>");
        a.s(path, "path");
        return fileSystem.metadataOrNull(path) != null;
    }

    @NotNull
    public static final j commonListRecursively(@NotNull okio.FileSystem fileSystem, @NotNull Path path, boolean z2) throws IOException {
        a.s(fileSystem, "<this>");
        a.s(path, "dir");
        return new p(new FileSystem$commonListRecursively$1(path, fileSystem, z2, null), 3);
    }

    @NotNull
    public static final FileMetadata commonMetadata(@NotNull okio.FileSystem fileSystem, @NotNull Path path) throws IOException {
        a.s(fileSystem, "<this>");
        a.s(path, "path");
        FileMetadata metadataOrNull = fileSystem.metadataOrNull(path);
        if (metadataOrNull != null) {
            return metadataOrNull;
        }
        throw new FileNotFoundException(okio.a.a("no such file: ", path));
    }

    @Nullable
    public static final Path symlinkTarget(@NotNull okio.FileSystem fileSystem, @NotNull Path path) throws IOException {
        a.s(fileSystem, "<this>");
        a.s(path, "path");
        Path symlinkTarget = fileSystem.metadata(path).getSymlinkTarget();
        if (symlinkTarget == null) {
            return null;
        }
        Path parent = path.parent();
        a.p(parent);
        return parent.resolve(symlinkTarget);
    }
}
