package androidx.browser.browseractions;

import android.os.AsyncTask;
import androidx.annotation.RestrictTo;
import androidx.core.content.FileProvider;
import java.util.concurrent.TimeUnit;

@RestrictTo
@Deprecated
/* loaded from: classes.dex */
public final class BrowserServiceFileProvider extends FileProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f1325a = new Object();

    /* renamed from: androidx.browser.browseractions.BrowserServiceFileProvider$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class FileCleanupTask extends AsyncTask<Void, Void, Void> {

        /* renamed from: a, reason: collision with root package name */
        public static final long f1326a;

        /* renamed from: b, reason: collision with root package name */
        public static final long f1327b;

        /* renamed from: c, reason: collision with root package name */
        public static final long f1328c;

        static {
            TimeUnit timeUnit = TimeUnit.DAYS;
            f1326a = timeUnit.toMillis(7L);
            f1327b = timeUnit.toMillis(7L);
            f1328c = timeUnit.toMillis(1L);
        }

        @Override // android.os.AsyncTask
        public final Void doInBackground(Void[] voidArr) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class FileSaveTask extends AsyncTask<String, Void, Void> {
        @Override // android.os.AsyncTask
        public final Void doInBackground(String[] strArr) {
            throw null;
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Void r1) {
            new AsyncTask();
            throw null;
        }
    }
}
