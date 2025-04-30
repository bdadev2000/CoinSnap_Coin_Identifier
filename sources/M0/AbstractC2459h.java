package m0;

import android.system.ErrnoException;
import android.system.Os;
import java.io.FileDescriptor;

/* renamed from: m0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2459h {
    public static void a(FileDescriptor fileDescriptor) throws ErrnoException {
        Os.close(fileDescriptor);
    }

    public static FileDescriptor b(FileDescriptor fileDescriptor) throws ErrnoException {
        return Os.dup(fileDescriptor);
    }

    public static long c(FileDescriptor fileDescriptor, long j7, int i9) throws ErrnoException {
        return Os.lseek(fileDescriptor, j7, i9);
    }
}
