package kotlin.io.path;

import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.NoSuchFileException;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.attribute.BasicFileAttributes;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ DirectoryStream f(Object obj) {
        return (DirectoryStream) obj;
    }

    public static /* synthetic */ FileSystemException i() {
        return new FileSystemException("Failed to delete one or more files. See suppressed exceptions for details.");
    }

    public static /* synthetic */ NoSuchFileException j(String str, String str2) {
        return new NoSuchFileException(str, str2, "The source file doesn't exist.");
    }

    public static /* bridge */ /* synthetic */ SecureDirectoryStream s(Object obj) {
        return (SecureDirectoryStream) obj;
    }

    public static /* bridge */ /* synthetic */ BasicFileAttributes t(Object obj) {
        return (BasicFileAttributes) obj;
    }

    public static /* bridge */ /* synthetic */ boolean w(Object obj) {
        return obj instanceof SecureDirectoryStream;
    }
}
