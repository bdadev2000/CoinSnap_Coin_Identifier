package l2;

import android.os.Looper;
import android.webkit.TracingController;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.OutputStream;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class f {
    @NonNull
    public static TracingController a() {
        TracingController tracingController;
        tracingController = TracingController.getInstance();
        return tracingController;
    }

    @NonNull
    public static ClassLoader b() {
        ClassLoader webViewClassLoader;
        webViewClassLoader = WebView.getWebViewClassLoader();
        return webViewClassLoader;
    }

    @NonNull
    public static Looper c(@NonNull WebView webView) {
        Looper webViewLooper;
        webViewLooper = webView.getWebViewLooper();
        return webViewLooper;
    }

    public static boolean d(@NonNull TracingController tracingController) {
        boolean isTracing;
        isTracing = tracingController.isTracing();
        return isTracing;
    }

    public static void e(@NonNull String str) {
        WebView.setDataDirectorySuffix(str);
    }

    public static void f(@NonNull TracingController tracingController, @NonNull k2.b bVar) {
        l0.d.x();
        l0.d.k();
        throw null;
    }

    public static boolean g(@NonNull TracingController tracingController, @Nullable OutputStream outputStream, @NonNull Executor executor) {
        boolean stop;
        stop = tracingController.stop(outputStream, executor);
        return stop;
    }
}
