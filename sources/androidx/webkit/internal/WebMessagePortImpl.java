package androidx.webkit.internal;

import android.webkit.WebMessagePort;
import androidx.webkit.WebMessagePortCompat;
import androidx.webkit.internal.WebViewGlueCommunicator;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* loaded from: classes.dex */
public class WebMessagePortImpl extends WebMessagePortCompat {

    /* renamed from: a, reason: collision with root package name */
    public WebMessagePort f21821a;

    /* renamed from: b, reason: collision with root package name */
    public final WebMessagePortBoundaryInterface f21822b;

    public WebMessagePortImpl(WebMessagePort webMessagePort) {
        this.f21821a = webMessagePort;
    }

    @Override // androidx.webkit.WebMessagePortCompat
    public final WebMessagePort a() {
        if (this.f21821a == null) {
            WebkitToCompatConverter webkitToCompatConverter = WebViewGlueCommunicator.LAZY_COMPAT_CONVERTER_HOLDER.f21832a;
            this.f21821a = (WebMessagePort) webkitToCompatConverter.f21841a.convertWebMessagePort(Proxy.getInvocationHandler(this.f21822b));
        }
        return this.f21821a;
    }

    public WebMessagePortImpl(InvocationHandler invocationHandler) {
        this.f21822b = (WebMessagePortBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebMessagePortBoundaryInterface.class, invocationHandler);
    }
}
