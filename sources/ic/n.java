package ic;

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

/* loaded from: classes3.dex */
public final class n implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final URL f19565b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Future f19566c;

    /* renamed from: d, reason: collision with root package name */
    public Task f19567d;

    public n(URL url) {
        this.f19565b = url;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f19566c.cancel(true);
    }

    public final Bitmap d() {
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.f19565b;
        if (isLoggable) {
            Log.i("FirebaseMessaging", "Starting download of: " + url);
        }
        URLConnection openConnection = url.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] P = a6.k.P(new d(inputStream));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Log.v("FirebaseMessaging", "Downloaded " + P.length + " bytes from " + url);
                }
                if (P.length <= 1048576) {
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(P, 0, P.length);
                    if (decodeByteArray != null) {
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Successfully downloaded image: " + url);
                        }
                        return decodeByteArray;
                    }
                    throw new IOException("Failed to decode image: " + url);
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        throw new IOException("Content-Length exceeds max size of 1048576");
    }
}
