package i8;

import M0.C0219j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import u7.C2825p;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public u f20750a;

    /* renamed from: d, reason: collision with root package name */
    public G f20752d;

    /* renamed from: e, reason: collision with root package name */
    public LinkedHashMap f20753e = new LinkedHashMap();
    public String b = "GET";

    /* renamed from: c, reason: collision with root package name */
    public J1.k f20751c = new J1.k(3);

    public final void a(String str, String str2) {
        G7.j.e(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f20751c.a(str, str2);
    }

    public final C b() {
        Map unmodifiableMap;
        u uVar = this.f20750a;
        if (uVar != null) {
            String str = this.b;
            s e4 = this.f20751c.e();
            G g9 = this.f20752d;
            LinkedHashMap linkedHashMap = this.f20753e;
            byte[] bArr = j8.b.f21214a;
            G7.j.e(linkedHashMap, "<this>");
            if (linkedHashMap.isEmpty()) {
                unmodifiableMap = C2825p.b;
            } else {
                unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
                G7.j.d(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
            }
            return new C(uVar, str, e4, g9, unmodifiableMap);
        }
        throw new IllegalStateException("url == null".toString());
    }

    public final void c(String str, String str2) {
        G7.j.e(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        J1.k kVar = this.f20751c;
        kVar.getClass();
        C0219j.h(str);
        C0219j.j(str2, str);
        kVar.h(str);
        kVar.c(str, str2);
    }

    public final void d(String str, G g9) {
        boolean z8;
        G7.j.e(str, "method");
        if (str.length() > 0) {
            if (g9 == null) {
                if (!str.equals("POST") && !str.equals("PUT") && !str.equals("PATCH") && !str.equals("PROPPATCH") && !str.equals("REPORT")) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                if (!(!z8)) {
                    throw new IllegalArgumentException(AbstractC2914a.e("method ", str, " must have a request body.").toString());
                }
            } else if (!R2.b.u(str)) {
                throw new IllegalArgumentException(AbstractC2914a.e("method ", str, " must not have a request body.").toString());
            }
            this.b = str;
            this.f20752d = g9;
            return;
        }
        throw new IllegalArgumentException("method.isEmpty() == true".toString());
    }

    public final void e(G g9) {
        G7.j.e(g9, TtmlNode.TAG_BODY);
        d("POST", g9);
    }

    public final void f(String str) {
        G7.j.e(str, "url");
        if (O7.o.C(str, "ws:", true)) {
            String substring = str.substring(3);
            G7.j.d(substring, "this as java.lang.String).substring(startIndex)");
            str = G7.j.j(substring, "http:");
        } else if (O7.o.C(str, "wss:", true)) {
            String substring2 = str.substring(4);
            G7.j.d(substring2, "this as java.lang.String).substring(startIndex)");
            str = G7.j.j(substring2, "https:");
        }
        G7.j.e(str, "<this>");
        t tVar = new t();
        tVar.d(null, str);
        this.f20750a = tVar.a();
    }
}
