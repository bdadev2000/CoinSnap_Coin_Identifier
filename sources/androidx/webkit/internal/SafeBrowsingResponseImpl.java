package androidx.webkit.internal;

import android.webkit.SafeBrowsingResponse;
import androidx.webkit.SafeBrowsingResponseCompat;
import androidx.webkit.internal.ApiFeature;
import androidx.webkit.internal.WebViewGlueCommunicator;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* loaded from: classes2.dex */
public class SafeBrowsingResponseImpl extends SafeBrowsingResponseCompat {

    /* renamed from: a, reason: collision with root package name */
    public SafeBrowsingResponse f21814a;

    /* renamed from: b, reason: collision with root package name */
    public SafeBrowsingResponseBoundaryInterface f21815b;

    public final void a() {
        ApiFeature.O_MR1 o_mr1 = WebViewFeatureInternal.d;
        if (o_mr1.b()) {
            if (this.f21814a == null) {
                WebkitToCompatConverter webkitToCompatConverter = WebViewGlueCommunicator.LAZY_COMPAT_CONVERTER_HOLDER.f21832a;
                this.f21814a = a.b(webkitToCompatConverter.f21841a.convertSafeBrowsingResponse(Proxy.getInvocationHandler(this.f21815b)));
            }
            ApiHelperForOMR1.e(this.f21814a, true);
            return;
        }
        if (!o_mr1.c()) {
            throw WebViewFeatureInternal.a();
        }
        if (this.f21815b == null) {
            WebkitToCompatConverter webkitToCompatConverter2 = WebViewGlueCommunicator.LAZY_COMPAT_CONVERTER_HOLDER.f21832a;
            this.f21815b = (SafeBrowsingResponseBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(SafeBrowsingResponseBoundaryInterface.class, webkitToCompatConverter2.f21841a.convertSafeBrowsingResponse(this.f21814a));
        }
        this.f21815b.showInterstitial(true);
    }
}
