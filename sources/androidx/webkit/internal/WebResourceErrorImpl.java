package androidx.webkit.internal;

import android.webkit.WebResourceError;
import androidx.webkit.WebResourceErrorCompat;
import androidx.webkit.internal.WebViewGlueCommunicator;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;

/* loaded from: classes4.dex */
public class WebResourceErrorImpl extends WebResourceErrorCompat {

    /* renamed from: a, reason: collision with root package name */
    public WebResourceError f21823a;

    /* renamed from: b, reason: collision with root package name */
    public WebResourceErrorBoundaryInterface f21824b;

    public final CharSequence a() {
        WebViewFeatureInternal.f21826b.getClass();
        if (this.f21823a == null) {
            WebkitToCompatConverter webkitToCompatConverter = WebViewGlueCommunicator.LAZY_COMPAT_CONVERTER_HOLDER.f21832a;
            this.f21823a = (WebResourceError) webkitToCompatConverter.f21841a.convertWebResourceError(Proxy.getInvocationHandler(this.f21824b));
        }
        return ApiHelperForM.e(this.f21823a);
    }

    public final int b() {
        WebViewFeatureInternal.f21827c.getClass();
        if (this.f21823a == null) {
            WebkitToCompatConverter webkitToCompatConverter = WebViewGlueCommunicator.LAZY_COMPAT_CONVERTER_HOLDER.f21832a;
            this.f21823a = (WebResourceError) webkitToCompatConverter.f21841a.convertWebResourceError(Proxy.getInvocationHandler(this.f21824b));
        }
        return ApiHelperForM.f(this.f21823a);
    }
}
