package androidx.webkit.internal;

import android.os.Looper;
import android.webkit.TracingConfig;
import android.webkit.TracingController;
import android.webkit.WebView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.webkit.TracingConfig;
import java.io.OutputStream;
import java.util.Collection;
import java.util.concurrent.Executor;

@RequiresApi
/* loaded from: classes3.dex */
public class ApiHelperForP {
    @NonNull
    @DoNotInline
    public static TracingController a() {
        TracingController tracingController;
        tracingController = TracingController.getInstance();
        return tracingController;
    }

    @NonNull
    @DoNotInline
    public static ClassLoader b() {
        ClassLoader webViewClassLoader;
        webViewClassLoader = WebView.getWebViewClassLoader();
        return webViewClassLoader;
    }

    @NonNull
    @DoNotInline
    public static Looper c(@NonNull WebView webView) {
        Looper webViewLooper;
        webViewLooper = webView.getWebViewLooper();
        return webViewLooper;
    }

    @DoNotInline
    public static boolean d(@NonNull TracingController tracingController) {
        boolean isTracing;
        isTracing = tracingController.isTracing();
        return isTracing;
    }

    @DoNotInline
    public static void e(@NonNull String str) {
        WebView.setDataDirectorySuffix(str);
    }

    @DoNotInline
    public static void f(@NonNull TracingController tracingController, @NonNull TracingConfig tracingConfig) {
        TracingConfig.Builder addCategories;
        TracingConfig.Builder addCategories2;
        TracingConfig.Builder tracingMode;
        android.webkit.TracingConfig build;
        TracingConfig.Builder i2 = androidx.media.a.i();
        tracingConfig.getClass();
        addCategories = i2.addCategories(0);
        addCategories2 = addCategories.addCategories((Collection<String>) null);
        tracingMode = addCategories2.setTracingMode(0);
        build = tracingMode.build();
        tracingController.start(build);
    }

    @DoNotInline
    public static boolean g(@NonNull TracingController tracingController, @Nullable OutputStream outputStream, @NonNull Executor executor) {
        boolean stop;
        stop = tracingController.stop(outputStream, executor);
        return stop;
    }
}
