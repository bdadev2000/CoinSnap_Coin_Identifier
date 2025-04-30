package U4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public final class q implements Closeable {
    public final URL b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Future f3322c;

    /* renamed from: d, reason: collision with root package name */
    public Task f3323d;

    public q(URL url) {
        this.b = url;
    }

    public final Bitmap a() {
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.b;
        if (isLoggable) {
            Log.i("FirebaseMessaging", "Starting download of: " + url);
        }
        URLConnection openConnection = url.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] B5 = r8.k.B(new C0308d(inputStream));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Log.v("FirebaseMessaging", "Downloaded " + B5.length + " bytes from " + url);
                }
                if (B5.length <= 1048576) {
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(B5, 0, B5.length);
                    if (decodeByteArray != null) {
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Successfully downloaded image: " + url);
                        }
                        return decodeByteArray;
                    }
                    throw new IOException("Failed to decode image: " + url);
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        throw new IOException("Content-Length exceeds max size of 1048576");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3322c.cancel(true);
    }
}
