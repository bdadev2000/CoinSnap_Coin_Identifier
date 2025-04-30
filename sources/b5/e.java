package b5;

import U4.RunnableC0311g;
import a5.C0397a;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import com.google.firebase.perf.v1.PerfSession;
import d5.h;
import e5.C2221a;
import e5.InterfaceC2222b;
import g5.C2303f;
import i5.w;
import i5.y;
import i8.C2365b;
import i8.t;
import i8.u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class e extends X4.d implements InterfaceC2222b {

    /* renamed from: j, reason: collision with root package name */
    public static final C0397a f5324j = C0397a.d();
    public final List b;

    /* renamed from: c, reason: collision with root package name */
    public final GaugeManager f5325c;

    /* renamed from: d, reason: collision with root package name */
    public final C2303f f5326d;

    /* renamed from: f, reason: collision with root package name */
    public final w f5327f;

    /* renamed from: g, reason: collision with root package name */
    public final WeakReference f5328g;

    /* renamed from: h, reason: collision with root package name */
    public String f5329h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5330i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(g5.C2303f r3) {
        /*
            r2 = this;
            X4.c r0 = X4.c.a()
            com.google.firebase.perf.session.gauges.GaugeManager r1 = com.google.firebase.perf.session.gauges.GaugeManager.getInstance()
            r2.<init>(r0)
            i5.w r0 = com.google.firebase.perf.v1.NetworkRequestMetric.newBuilder()
            r2.f5327f = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r2.f5328g = r0
            r2.f5326d = r3
            r2.f5325c = r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r3 = java.util.Collections.synchronizedList(r3)
            r2.b = r3
            r2.registerForAppState()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.e.<init>(g5.f):void");
    }

    public static e d(C2303f c2303f) {
        return new e(c2303f);
    }

    @Override // e5.InterfaceC2222b
    public final void a(C2221a c2221a) {
        if (c2221a == null) {
            f5324j.f("Unable to add new SessionId to the Network Trace. Continuing without it.");
            return;
        }
        w wVar = this.f5327f;
        if (wVar.d() && !wVar.f()) {
            this.b.add(c2221a);
        }
    }

    public final void c() {
        List unmodifiableList;
        SessionManager.getInstance().unregisterForSessionUpdates(this.f5328g);
        unregisterForAppState();
        synchronized (this.b) {
            try {
                ArrayList arrayList = new ArrayList();
                for (C2221a c2221a : this.b) {
                    if (c2221a != null) {
                        arrayList.add(c2221a);
                    }
                }
                unmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        PerfSession[] d2 = C2221a.d(unmodifiableList);
        if (d2 != null) {
            this.f5327f.a(Arrays.asList(d2));
        }
        NetworkRequestMetric networkRequestMetric = (NetworkRequestMetric) this.f5327f.build();
        String str = this.f5329h;
        if (str != null) {
            if (h.f19911a.matcher(str).matches()) {
                f5324j.a("Dropping network request from a 'User-Agent' that is not allowed");
                return;
            }
        } else {
            Pattern pattern = h.f19911a;
        }
        if (!this.f5330i) {
            C2303f c2303f = this.f5326d;
            c2303f.f20480k.execute(new RunnableC0311g(c2303f, networkRequestMetric, getAppState(), 18));
            this.f5330i = true;
        }
    }

    public final void e(String str) {
        y yVar;
        if (str != null) {
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            char c9 = 65535;
            switch (upperCase.hashCode()) {
                case -531492226:
                    if (upperCase.equals("OPTIONS")) {
                        c9 = 0;
                        break;
                    }
                    break;
                case 70454:
                    if (upperCase.equals("GET")) {
                        c9 = 1;
                        break;
                    }
                    break;
                case 79599:
                    if (upperCase.equals("PUT")) {
                        c9 = 2;
                        break;
                    }
                    break;
                case 2213344:
                    if (upperCase.equals("HEAD")) {
                        c9 = 3;
                        break;
                    }
                    break;
                case 2461856:
                    if (upperCase.equals("POST")) {
                        c9 = 4;
                        break;
                    }
                    break;
                case 75900968:
                    if (upperCase.equals("PATCH")) {
                        c9 = 5;
                        break;
                    }
                    break;
                case 80083237:
                    if (upperCase.equals("TRACE")) {
                        c9 = 6;
                        break;
                    }
                    break;
                case 1669334218:
                    if (upperCase.equals("CONNECT")) {
                        c9 = 7;
                        break;
                    }
                    break;
                case 2012838315:
                    if (upperCase.equals("DELETE")) {
                        c9 = '\b';
                        break;
                    }
                    break;
            }
            switch (c9) {
                case 0:
                    yVar = y.OPTIONS;
                    break;
                case 1:
                    yVar = y.GET;
                    break;
                case 2:
                    yVar = y.PUT;
                    break;
                case 3:
                    yVar = y.HEAD;
                    break;
                case 4:
                    yVar = y.POST;
                    break;
                case 5:
                    yVar = y.PATCH;
                    break;
                case 6:
                    yVar = y.TRACE;
                    break;
                case 7:
                    yVar = y.CONNECT;
                    break;
                case '\b':
                    yVar = y.DELETE;
                    break;
                default:
                    yVar = y.HTTP_METHOD_UNKNOWN;
                    break;
            }
            this.f5327f.h(yVar);
        }
    }

    public final void f(int i9) {
        this.f5327f.i(i9);
    }

    public final void g(long j7) {
        this.f5327f.k(j7);
    }

    public final void h(long j7) {
        C2221a perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f5328g);
        this.f5327f.g(j7);
        a(perfSession);
        if (perfSession.f20111d) {
            this.f5325c.collectGaugeMetricOnce(perfSession.f20110c);
        }
    }

    public final void i(String str) {
        w wVar = this.f5327f;
        if (str == null) {
            wVar.b();
            return;
        }
        if (str.length() <= 128) {
            for (int i9 = 0; i9 < str.length(); i9++) {
                char charAt = str.charAt(i9);
                if (charAt > 31 && charAt <= 127) {
                }
            }
            wVar.l(str);
            return;
        }
        f5324j.f("The content type of the response is not a valid content-type:".concat(str));
    }

    public final void j(long j7) {
        this.f5327f.m(j7);
    }

    public final void k(long j7) {
        this.f5327f.o(j7);
        if (SessionManager.getInstance().perfSession().f20111d) {
            this.f5325c.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().f20110c);
        }
    }

    public final void l(String str) {
        u uVar;
        int lastIndexOf;
        if (str != null) {
            u uVar2 = null;
            try {
                t tVar = new t();
                tVar.d(null, str);
                uVar = tVar.a();
            } catch (IllegalArgumentException unused) {
                uVar = null;
            }
            if (uVar != null) {
                t f9 = uVar.f();
                f9.f20879f = C2365b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
                f9.f20880g = C2365b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
                f9.b = null;
                f9.f20882i = null;
                str = f9.toString();
            }
            if (str.length() > 2000) {
                if (str.charAt(2000) == '/') {
                    str = str.substring(0, 2000);
                } else {
                    try {
                        t tVar2 = new t();
                        tVar2.d(null, str);
                        uVar2 = tVar2.a();
                    } catch (IllegalArgumentException unused2) {
                    }
                    if (uVar2 == null) {
                        str = str.substring(0, 2000);
                    } else if (uVar2.b().lastIndexOf(47) >= 0 && (lastIndexOf = str.lastIndexOf(47, 1999)) >= 0) {
                        str = str.substring(0, lastIndexOf);
                    } else {
                        str = str.substring(0, 2000);
                    }
                }
            }
            this.f5327f.q(str);
        }
    }
}
