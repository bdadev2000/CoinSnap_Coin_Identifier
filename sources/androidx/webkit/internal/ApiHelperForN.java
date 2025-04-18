package androidx.webkit.internal;

import android.content.Context;
import android.webkit.ServiceWorkerClient;
import android.webkit.ServiceWorkerController;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.webkit.ServiceWorkerClientCompat;
import java.io.File;

@RequiresApi
/* loaded from: classes3.dex */
public class ApiHelperForN {
    @DoNotInline
    public static boolean a(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getAllowContentAccess();
    }

    @DoNotInline
    public static boolean b(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getAllowFileAccess();
    }

    @DoNotInline
    public static boolean c(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getBlockNetworkLoads();
    }

    @DoNotInline
    public static int d(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getCacheMode();
    }

    @NonNull
    @DoNotInline
    public static File e(@NonNull Context context) {
        return context.getDataDir();
    }

    @DoNotInline
    public static int f(@NonNull WebSettings webSettings) {
        return webSettings.getDisabledActionModeMenuItems();
    }

    @NonNull
    @DoNotInline
    public static ServiceWorkerController g() {
        return ServiceWorkerController.getInstance();
    }

    @NonNull
    @DoNotInline
    public static ServiceWorkerWebSettings h(@NonNull ServiceWorkerController serviceWorkerController) {
        return serviceWorkerController.getServiceWorkerWebSettings();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.webkit.internal.ServiceWorkerWebSettingsImpl, java.lang.Object] */
    @NonNull
    @DoNotInline
    public static ServiceWorkerWebSettingsImpl i(@NonNull ServiceWorkerController serviceWorkerController) {
        h(serviceWorkerController);
        return new Object();
    }

    @DoNotInline
    public static boolean j(@NonNull WebResourceRequest webResourceRequest) {
        return webResourceRequest.isRedirect();
    }

    @DoNotInline
    public static void k(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z2) {
        serviceWorkerWebSettings.setAllowContentAccess(z2);
    }

    @DoNotInline
    public static void l(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z2) {
        serviceWorkerWebSettings.setAllowFileAccess(z2);
    }

    @DoNotInline
    public static void m(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z2) {
        serviceWorkerWebSettings.setBlockNetworkLoads(z2);
    }

    @DoNotInline
    public static void n(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings, int i2) {
        serviceWorkerWebSettings.setCacheMode(i2);
    }

    @DoNotInline
    public static void o(@NonNull WebSettings webSettings, int i2) {
        webSettings.setDisabledActionModeMenuItems(i2);
    }

    @DoNotInline
    public static void p(@NonNull ServiceWorkerController serviceWorkerController, @Nullable ServiceWorkerClient serviceWorkerClient) {
        serviceWorkerController.setServiceWorkerClient(serviceWorkerClient);
    }

    @DoNotInline
    public static void q(@NonNull ServiceWorkerController serviceWorkerController, @NonNull ServiceWorkerClientCompat serviceWorkerClientCompat) {
        serviceWorkerController.setServiceWorkerClient(new FrameworkServiceWorkerClient(serviceWorkerClientCompat));
    }
}
