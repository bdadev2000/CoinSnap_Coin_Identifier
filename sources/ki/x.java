package ki;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x extends w {
    public static Long i(FileTime fileTime) {
        long millis;
        millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (valueOf.longValue() != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // ki.w, ki.o
    public final void a(b0 source, b0 target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        try {
            Files.move(source.f(), target.f(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e2) {
            throw new FileNotFoundException(e2.getMessage());
        }
    }

    @Override // ki.w, ki.o
    public final jb.t e(b0 path) {
        Path path2;
        b0 b0Var;
        Long l10;
        Long l11;
        Intrinsics.checkNotNullParameter(path, "path");
        Path nioPath = path.f();
        Intrinsics.checkNotNullParameter(nioPath, "nioPath");
        Long l12 = null;
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(nioPath, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            if (readAttributes.isSymbolicLink()) {
                path2 = Files.readSymbolicLink(nioPath);
            } else {
                path2 = null;
            }
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            if (path2 != null) {
                String str = b0.f20952c;
                Intrinsics.checkNotNullParameter(path2, "<this>");
                b0Var = wh.c0.h(path2.toString(), false);
            } else {
                b0Var = null;
            }
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            if (creationTime != null) {
                l10 = i(creationTime);
            } else {
                l10 = null;
            }
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            if (lastModifiedTime != null) {
                l11 = i(lastModifiedTime);
            } else {
                l11 = null;
            }
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            if (lastAccessTime != null) {
                l12 = i(lastAccessTime);
            }
            return new jb.t(isRegularFile, isDirectory, b0Var, valueOf, l10, l11, l12);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // ki.w
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
