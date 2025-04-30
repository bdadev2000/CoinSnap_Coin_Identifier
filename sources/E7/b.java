package e7;

import G7.j;
import G7.s;
import M0.C0219j;
import a.AbstractC0325a;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import c7.m1;
import com.mbridge.msdk.MBridgeConstans;
import com.vungle.ads.internal.util.v;
import d6.AbstractC2191a;
import f8.p;
import java.net.URL;
import java.util.List;

/* loaded from: classes3.dex */
public final class b {
    private Z5.a adEvents;
    private Z5.b adSession;
    private final f8.b json;

    public b(String str) {
        m1 m1Var;
        String str2;
        String str3;
        j.e(str, "omSdkData");
        p a6 = R2.b.a(C2225a.INSTANCE);
        this.json = a6;
        try {
            O5.c c9 = O5.c.c(Z5.d.NATIVE_DISPLAY, Z5.e.BEGIN_TO_RENDER, Z5.f.NATIVE, Z5.f.NONE);
            if (!TextUtils.isEmpty("Vungle")) {
                if (!TextUtils.isEmpty("7.3.2")) {
                    J1.p pVar = new J1.p(2);
                    byte[] decode = Base64.decode(str, 0);
                    if (decode != null) {
                        m1Var = (m1) a6.a(AbstractC0325a.q(a6.b, s.b(m1.class)), new String(decode, O7.a.f2244a));
                    } else {
                        m1Var = null;
                    }
                    if (m1Var != null) {
                        str2 = m1Var.getVendorKey();
                    } else {
                        str2 = null;
                    }
                    if (m1Var != null) {
                        str3 = m1Var.getVendorURL();
                    } else {
                        str3 = null;
                    }
                    URL url = new URL(str3);
                    String params = m1Var != null ? m1Var.getParams() : null;
                    if (!TextUtils.isEmpty(str2)) {
                        if (!TextUtils.isEmpty(params)) {
                            List w2 = android.support.v4.media.session.a.w(new Z5.g(str2, url, params));
                            String oM_JS$vungle_ads_release = h.INSTANCE.getOM_JS$vungle_ads_release();
                            C0219j.b(oM_JS$vungle_ads_release, "OM SDK JS script content is null");
                            this.adSession = Z5.b.a(c9, new O5.d(pVar, null, oM_JS$vungle_ads_release, w2, Z5.c.NATIVE));
                            return;
                        }
                        throw new IllegalArgumentException("VerificationParameters is null or empty");
                    }
                    throw new IllegalArgumentException("VendorKey is null or empty");
                }
                throw new IllegalArgumentException("Version is null or empty");
            }
            throw new IllegalArgumentException("Name is null or empty");
        } catch (Exception e4) {
            v.Companion.e("NativeOMTracker", "error occured when create omsdk adSession:", e4);
        }
    }

    public final void impressionOccurred() {
        Z5.a aVar = this.adEvents;
        if (aVar != null) {
            Z5.h hVar = aVar.f3881a;
            boolean z8 = hVar.f3903g;
            if (!z8) {
                if (Z5.f.NATIVE == ((Z5.f) hVar.b.b)) {
                    if (!hVar.f3902f || z8) {
                        try {
                            hVar.d();
                        } catch (Exception unused) {
                        }
                    }
                    if (hVar.f3902f && !hVar.f3903g) {
                        if (!hVar.f3905i) {
                            AbstractC2191a abstractC2191a = hVar.f3901e;
                            b6.g.f5341a.a(abstractC2191a.e(), "publishImpressionEvent", abstractC2191a.f19912a);
                            hVar.f3905i = true;
                            return;
                        }
                        throw new IllegalStateException("Impression event can only be sent once");
                    }
                    return;
                }
                throw new IllegalStateException("Impression event is not expected from the Native AdSession");
            }
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public final void start(View view) {
        Z5.b bVar;
        j.e(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        if (Y5.a.f3816a.f1512a && (bVar = this.adSession) != null) {
            bVar.c(view);
            bVar.d();
            Z5.h hVar = (Z5.h) bVar;
            AbstractC2191a abstractC2191a = hVar.f3901e;
            if (abstractC2191a.f19913c == null) {
                boolean z8 = hVar.f3903g;
                if (!z8) {
                    Z5.a aVar = new Z5.a(hVar);
                    abstractC2191a.f19913c = aVar;
                    this.adEvents = aVar;
                    if (hVar.f3902f) {
                        if (!z8) {
                            if (Z5.f.NATIVE == ((Z5.f) hVar.b.b)) {
                                if (!hVar.f3906j) {
                                    b6.g.f5341a.a(abstractC2191a.e(), "publishLoadedEvent", null, abstractC2191a.f19912a);
                                    hVar.f3906j = true;
                                    return;
                                }
                                throw new IllegalStateException("Loaded event can only be sent once");
                            }
                            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
                        }
                        throw new IllegalStateException("AdSession is finished");
                    }
                    throw new IllegalStateException("AdSession is not started");
                }
                throw new IllegalStateException("AdSession is finished");
            }
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    public final void stop() {
        Z5.b bVar = this.adSession;
        if (bVar != null) {
            bVar.b();
        }
        this.adSession = null;
    }
}
