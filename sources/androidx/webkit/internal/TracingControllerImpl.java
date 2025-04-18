package androidx.webkit.internal;

import androidx.webkit.TracingController;
import androidx.webkit.internal.ApiFeature;
import androidx.webkit.internal.WebViewGlueCommunicator;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;

/* loaded from: classes2.dex */
public class TracingControllerImpl extends TracingController {

    /* renamed from: a, reason: collision with root package name */
    public final TracingControllerBoundaryInterface f21818a;

    public TracingControllerImpl() {
        ApiFeature.P p2 = WebViewFeatureInternal.f21828f;
        if (p2.b()) {
            ApiHelperForP.a();
        } else {
            if (!p2.c()) {
                throw WebViewFeatureInternal.a();
            }
            this.f21818a = WebViewGlueCommunicator.LAZY_FACTORY_HOLDER.f21833a.getTracingController();
        }
    }
}
