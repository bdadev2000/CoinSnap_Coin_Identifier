package fi;

import a6.k;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import ki.a0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements b {
    public final void a(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!file.delete() && file.exists()) {
            throw new IOException(Intrinsics.stringPlus("failed to delete ", file));
        }
    }

    public final void b(File directory) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        File[] listFiles = directory.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i10 = 0;
            while (i10 < length) {
                File file = listFiles[i10];
                i10++;
                if (file.isDirectory()) {
                    Intrinsics.checkNotNullExpressionValue(file, "file");
                    b(file);
                }
                if (!file.delete()) {
                    throw new IOException(Intrinsics.stringPlus("failed to delete ", file));
                }
            }
            return;
        }
        throw new IOException(Intrinsics.stringPlus("not a readable directory: ", directory));
    }

    public final boolean c(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return file.exists();
    }

    public final void d(File from, File to) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        a(to);
        if (from.renameTo(to)) {
            return;
        }
        throw new IOException("failed to rename " + from + " to " + to);
    }

    public final a0 e(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            return k.J(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            return k.J(file);
        }
    }

    public final String toString() {
        return "FileSystem.SYSTEM";
    }
}
