package b6;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f5341a = new Object();

    public static void b(WebView webView, String str) {
        if (webView != null && !TextUtils.isEmpty(str)) {
            try {
                webView.evaluateJavascript(str, null);
            } catch (IllegalStateException unused) {
                webView.loadUrl("javascript: " + str);
            }
        }
    }

    public final void a(WebView webView, String str, Object... objArr) {
        String obj;
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            if (objArr.length > 0) {
                for (Object obj2 : objArr) {
                    if (obj2 == null) {
                        obj = "null";
                    } else {
                        if (obj2 instanceof String) {
                            obj = obj2.toString();
                            if (!obj.startsWith("{")) {
                                sb.append('\"');
                                sb.append(obj);
                                sb.append('\"');
                            }
                        } else {
                            sb.append(obj2);
                        }
                        sb.append(",");
                    }
                    sb.append(obj);
                    sb.append(",");
                }
                sb.setLength(sb.length() - 1);
            }
            sb.append(")}");
            String sb2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler != null && Looper.myLooper() != handler.getLooper()) {
                handler.post(new A4.e(this, webView, sb2, 7));
            } else {
                b(webView, sb2);
            }
        }
    }
}
