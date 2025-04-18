package d2;

import android.app.NotificationChannel;
import android.graphics.Typeface;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import java.io.FileDescriptor;
import java.nio.file.FileSystemException;
import java.nio.file.FileVisitor;
import java.nio.file.Path;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ void D() {
    }

    public static /* synthetic */ NotificationChannel e(String str) {
        return new NotificationChannel("fcm_fallback_notification_channel", str, 3);
    }

    public static /* synthetic */ Typeface.Builder i(FileDescriptor fileDescriptor) {
        return new Typeface.Builder(fileDescriptor);
    }

    public static /* synthetic */ AdaptiveIconDrawable k(Drawable drawable, Drawable drawable2) {
        return new AdaptiveIconDrawable(drawable, drawable2);
    }

    public static /* bridge */ /* synthetic */ FileSystemException o(Throwable th2) {
        return (FileSystemException) th2;
    }

    public static /* bridge */ /* synthetic */ FileVisitor p(Object obj) {
        return (FileVisitor) obj;
    }

    public static /* bridge */ /* synthetic */ Path q(Object obj) {
        return (Path) obj;
    }

    public static /* synthetic */ void s() {
    }

    public static /* bridge */ /* synthetic */ boolean z(Drawable drawable) {
        return drawable instanceof AdaptiveIconDrawable;
    }
}
