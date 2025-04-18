package androidx.webkit;

import android.webkit.ServiceWorkerController;
import androidx.webkit.internal.ApiHelperForN;
import androidx.webkit.internal.WebViewFeatureInternal;

/* loaded from: classes2.dex */
public abstract class ServiceWorkerControllerCompat {

    /* loaded from: classes2.dex */
    public static class LAZY_HOLDER {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.webkit.internal.ServiceWorkerControllerImpl] */
        static {
            ?? obj = new Object();
            WebViewFeatureInternal.f21825a.getClass();
            ServiceWorkerController g2 = ApiHelperForN.g();
            obj.f21816a = g2;
            if (g2 == null) {
                obj.f21816a = ApiHelperForN.g();
            }
            ApiHelperForN.i(obj.f21816a);
        }
    }
}
