package x5;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import com.facebook.r0;
import com.facebook.x;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import l2.p;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import wh.u;

/* loaded from: classes3.dex */
public final class c implements e4.k, p, u {

    /* renamed from: b, reason: collision with root package name */
    public static final c f27373b = new c();

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f27374c = new String[0];

    public static final void b(y5.c mapping, View rootView, View hostView) {
        if (m6.a.b(c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            String str = mapping.a;
            com.facebook.b bVar = g.f27387f;
            Bundle G = com.facebook.b.G(mapping, rootView, hostView);
            f27373b.d(G);
            x.c().execute(new r0(6, str, G));
        } catch (Throwable th2) {
            m6.a.a(c.class, th2);
        }
    }

    @Override // e4.k
    public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }

    public List c(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(hostname);
            Intrinsics.checkNotNullExpressionValue(allByName, "getAllByName(hostname)");
            return ArraysKt.toList(allByName);
        } catch (NullPointerException e2) {
            UnknownHostException unknownHostException = new UnknownHostException(Intrinsics.stringPlus("Broken system behaviour for dns lookup of ", hostname));
            unknownHostException.initCause(e2);
            throw unknownHostException;
        }
    }

    @Override // l2.p
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    public void d(Bundle parameters) {
        double d10;
        Matcher matcher;
        Locale locale;
        if (m6.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            String string = parameters.getString("_valueToSum");
            if (string != null) {
                try {
                    matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(string);
                } catch (ParseException unused) {
                }
                if (matcher.find()) {
                    String group = matcher.group(0);
                    try {
                        locale = x.a().getResources().getConfiguration().locale;
                    } catch (Exception unused2) {
                        locale = null;
                    }
                    if (locale == null) {
                        locale = Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                    }
                    d10 = NumberFormat.getNumberInstance(locale).parse(group).doubleValue();
                    parameters.putDouble("_valueToSum", d10);
                }
                d10 = 0.0d;
                parameters.putDouble("_valueToSum", d10);
            }
            parameters.putString("_is_fb_codeless", "1");
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }

    @Override // l2.p
    public StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // l2.p
    public String[] q() {
        return f27374c;
    }
}
