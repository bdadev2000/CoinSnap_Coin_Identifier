package kotlin.io.path;

import java.nio.file.FileSystemException;
import java.nio.file.FileSystemLoopException;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ void A() {
    }

    public static /* synthetic */ void D() {
    }

    public static /* synthetic */ FileSystemException f(String str) {
        return new FileSystemException(str);
    }

    public static /* synthetic */ FileSystemException g(String str, String str2) {
        return new FileSystemException(str, str2, "Recursively copying a directory into its subdirectory is prohibited.");
    }

    public static /* synthetic */ FileSystemLoopException h(String str) {
        return new FileSystemLoopException(str);
    }

    public static /* synthetic */ void t() {
    }
}
