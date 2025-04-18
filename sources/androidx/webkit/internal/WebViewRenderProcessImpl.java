package androidx.webkit.internal;

import androidx.webkit.WebViewRenderProcess;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;

/* loaded from: classes2.dex */
public class WebViewRenderProcessImpl extends WebViewRenderProcess {

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f21838b = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public WebViewRendererBoundaryInterface f21839a;

    /* renamed from: androidx.webkit.internal.WebViewRenderProcessImpl$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass1 implements Callable<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WebViewRendererBoundaryInterface f21840a;

        public AnonymousClass1(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
            this.f21840a = webViewRendererBoundaryInterface;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.webkit.internal.WebViewRenderProcessImpl, java.lang.Object] */
        @Override // java.util.concurrent.Callable
        public final Object call() {
            ?? obj = new Object();
            obj.f21839a = this.f21840a;
            return obj;
        }
    }
}
