package androidx.webkit.internal;

import android.webkit.ServiceWorkerClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.RequiresApi;
import androidx.webkit.ServiceWorkerClientCompat;

@RequiresApi
/* loaded from: classes4.dex */
public class FrameworkServiceWorkerClient extends ServiceWorkerClient {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceWorkerClientCompat f21810a;

    public FrameworkServiceWorkerClient(ServiceWorkerClientCompat serviceWorkerClientCompat) {
        this.f21810a = serviceWorkerClientCompat;
    }

    @Override // android.webkit.ServiceWorkerClient
    public final WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
        return this.f21810a.a();
    }
}
