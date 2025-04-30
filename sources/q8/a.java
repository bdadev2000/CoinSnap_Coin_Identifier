package q8;

import G7.j;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import r8.k;
import w8.C2911a;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f22806a = new Object();

    public final void a(File file) {
        j.e(file, "file");
        if (!file.delete() && file.exists()) {
            throw new IOException(j.j(file, "failed to delete "));
        }
    }

    public final void b(File file) {
        j.e(file, "directory");
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i9 = 0;
            while (i9 < length) {
                File file2 = listFiles[i9];
                i9++;
                if (file2.isDirectory()) {
                    b(file2);
                }
                if (!file2.delete()) {
                    throw new IOException(j.j(file2, "failed to delete "));
                }
            }
            return;
        }
        throw new IOException(j.j(file, "not a readable directory: "));
    }

    public final boolean c(File file) {
        j.e(file, "file");
        return file.exists();
    }

    public final void d(File file, File file2) {
        j.e(file, "from");
        j.e(file2, "to");
        a(file2);
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException("failed to rename " + file + " to " + file2);
    }

    public final C2911a e(File file) {
        j.e(file, "file");
        try {
            return k.x(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            return k.x(file);
        }
    }

    public final String toString() {
        return "FileSystem.SYSTEM";
    }
}
