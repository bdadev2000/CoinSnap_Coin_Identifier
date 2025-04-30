package A4;

import G7.j;
import M0.u;
import M0.v;
import M0.w;
import U3.A;
import U4.t;
import android.util.Log;
import com.applovin.impl.adview.m;
import com.applovin.impl.c5;
import com.applovin.impl.qb;
import com.applovin.impl.ql;
import com.applovin.impl.ur;
import com.facebook.C;
import com.facebook.D;
import com.facebook.E;
import com.facebook.N;
import com.facebook.appevents.g;
import com.facebook.appevents.i;
import com.facebook.appevents.n;
import com.facebook.internal.AbstractC1839h;
import com.facebook.internal.H;
import com.facebook.internal.InterfaceC1846o;
import com.facebook.internal.p;
import com.facebook.r;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tools.arruler.ui.component.home.HomeActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o4.InterfaceC2498d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t.InterfaceC2702a;
import u7.AbstractC2821l;
import w4.P0;
import x4.C2923a;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements h3.e, InterfaceC1846o, InterfaceC2498d, h.b, v, A, Continuation, K4.a, qb.b, InterfaceC2702a {
    public final /* synthetic */ int b;

    public /* synthetic */ a(int i9) {
        this.b = i9;
    }

    @Override // com.applovin.impl.qb.b
    public void a(Object obj) {
        ur.b((com.applovin.impl.adview.b) obj);
    }

    @Override // h3.e, t.InterfaceC2702a
    public Object apply(Object obj) {
        Boolean t9;
        Boolean u8;
        m s5;
        String n2;
        Map m;
        String p2;
        c5 h6;
        switch (this.b) {
            case 0:
                b.b.getClass();
                return C2923a.f24234a.m((P0) obj).getBytes(Charset.forName("UTF-8"));
            case 20:
                V4.e eVar = (V4.e) obj;
                eVar.getClass();
                C.c cVar = t.f3329a;
                cVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    cVar.o(eVar, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            case 23:
                t9 = com.applovin.impl.sdk.ad.b.t((ql) obj);
                return t9;
            case 24:
                u8 = com.applovin.impl.sdk.ad.b.u((ql) obj);
                return u8;
            case 25:
                s5 = com.applovin.impl.sdk.ad.b.s((ql) obj);
                return s5;
            case 26:
                n2 = com.applovin.impl.sdk.ad.b.n((ql) obj);
                return n2;
            case 27:
                m = com.applovin.impl.sdk.ad.b.m((ql) obj);
                return m;
            case 28:
                p2 = com.applovin.impl.sdk.ad.b.p((ql) obj);
                return p2;
            default:
                h6 = com.applovin.impl.sdk.ad.b.h((ql) obj);
                return h6;
        }
    }

    @Override // h.b
    public void b(Object obj) {
        ((Boolean) obj).booleanValue();
        int i9 = HomeActivity.m;
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [P2.a, java.lang.Object] */
    @Override // com.facebook.internal.InterfaceC1846o
    public void d(boolean z8) {
        File[] listFiles;
        File[] listFiles2;
        int i9 = 2;
        int i10 = 0;
        int i11 = 1;
        switch (this.b) {
            case 1:
                if (z8) {
                    z2.d dVar = z2.d.f24508a;
                    if (!O2.a.b(z2.d.class)) {
                        try {
                            z2.d.f24512f.set(true);
                            return;
                        } catch (Throwable th) {
                            O2.a.a(z2.d.class, th);
                            return;
                        }
                    }
                    return;
                }
                z2.d dVar2 = z2.d.f24508a;
                if (!O2.a.b(z2.d.class)) {
                    try {
                        z2.d.f24512f.set(false);
                        return;
                    } catch (Throwable th2) {
                        O2.a.a(z2.d.class, th2);
                        return;
                    }
                }
                return;
            case 6:
                if (z8) {
                    synchronized (N2.a.b) {
                        r rVar = r.f13801a;
                        if (N.b()) {
                            R3.e.B();
                        }
                        if (N2.a.f2093c != null) {
                            Log.w("N2.a", "Already enabled!");
                        } else {
                            N2.a aVar = new N2.a(Thread.getDefaultUncaughtExceptionHandler());
                            N2.a.f2093c = aVar;
                            Thread.setDefaultUncaughtExceptionHandler(aVar);
                        }
                    }
                    com.facebook.internal.r rVar2 = com.facebook.internal.r.f13653a;
                    if (com.facebook.internal.r.b(p.CrashShield)) {
                        g.f13482a = true;
                        if (N.b() && !H.z()) {
                            File h6 = n.h();
                            if (h6 == null) {
                                listFiles = new File[0];
                            } else {
                                listFiles = h6.listFiles(new L2.e(2));
                                if (listFiles == null) {
                                    listFiles = new File[0];
                                }
                            }
                            ArrayList arrayList = new ArrayList();
                            int length = listFiles.length;
                            int i12 = 0;
                            while (i12 < length) {
                                File file = listFiles[i12];
                                i12++;
                                L2.d k6 = i.k(file);
                                if (k6.a()) {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("crash_shield", k6.toString());
                                        String str = C.f13380j;
                                        arrayList.add(R3.e.x(null, String.format("%s/instruments", Arrays.copyOf(new Object[]{r.b()}, 1)), jSONObject, new L2.a(k6, i10)));
                                    } catch (JSONException unused) {
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                E e4 = new E(arrayList);
                                String str2 = C.f13380j;
                                AbstractC1839h.i(e4);
                                new D(e4).executeOnExecutor(r.c(), new Void[0]);
                            }
                        }
                        O2.a.b = true;
                    }
                    com.facebook.internal.r rVar3 = com.facebook.internal.r.f13653a;
                    com.facebook.internal.r.b(p.ThreadCheck);
                    return;
                }
                return;
            case 7:
                if (z8) {
                    r rVar4 = r.f13801a;
                    if (N.b() && !H.z()) {
                        File h9 = n.h();
                        if (h9 == null) {
                            listFiles2 = new File[0];
                        } else {
                            listFiles2 = h9.listFiles(new L2.e(3));
                            j.d(listFiles2, "reportDir.listFiles { dir, name ->\n      name.matches(Regex(String.format(\"^%s[0-9]+.json$\", InstrumentUtility.ERROR_REPORT_PREFIX)))\n    }");
                        }
                        ArrayList arrayList2 = new ArrayList();
                        int length2 = listFiles2.length;
                        int i13 = 0;
                        while (i13 < length2) {
                            File file2 = listFiles2[i13];
                            i13++;
                            j.e(file2, "file");
                            ?? obj = new Object();
                            String name = file2.getName();
                            j.d(name, "file.name");
                            obj.f2412a = name;
                            JSONObject s5 = n.s(name);
                            if (s5 != null) {
                                obj.f2413c = Long.valueOf(s5.optLong(CampaignEx.JSON_KEY_TIMESTAMP, 0L));
                                obj.b = s5.optString("error_message", null);
                            }
                            if (obj.b != null && obj.f2413c != null) {
                                arrayList2.add(obj);
                            }
                        }
                        AbstractC2821l.F(arrayList2, new M2.b(i9));
                        JSONArray jSONArray = new JSONArray();
                        while (i10 < arrayList2.size() && i10 < 1000) {
                            jSONArray.put(arrayList2.get(i10));
                            i10++;
                        }
                        n.t("error_reports", jSONArray, new L2.a(arrayList2, i11));
                        return;
                    }
                    return;
                }
                return;
            default:
                if (z8) {
                    AtomicBoolean atomicBoolean = M2.d.f1986a;
                    synchronized (M2.d.class) {
                        if (!O2.a.b(M2.d.class)) {
                            try {
                            } catch (Throwable th3) {
                                O2.a.a(M2.d.class, th3);
                            }
                            if (!M2.d.f1986a.getAndSet(true)) {
                                r rVar5 = r.f13801a;
                                if (N.b()) {
                                    M2.d.a();
                                }
                                int i14 = M2.a.f1982a;
                                if (!O2.a.b(M2.a.class)) {
                                    try {
                                        M2.a.b.scheduleAtFixedRate(M2.a.f1984d, 0L, 500, TimeUnit.MILLISECONDS);
                                    } catch (Throwable th4) {
                                        O2.a.a(M2.a.class, th4);
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }

    @Override // o4.InterfaceC2498d
    public Object f(U4.p pVar) {
        switch (this.b) {
            case 2:
                return TransportRegistrar.c(pVar);
            case 3:
                return TransportRegistrar.b(pVar);
            case 4:
                return TransportRegistrar.a(pVar);
            case 14:
                return FirebaseInstallationsRegistrar.a(pVar);
            default:
                return FirebasePerfRegistrar.a(pVar);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.b) {
            case 17:
                return 403;
            default:
                return -1;
        }
    }

    @Override // M0.v
    public void a(u uVar, w wVar, boolean z8) {
        switch (this.b) {
            case 9:
                uVar.a(wVar);
                return;
            case 10:
                uVar.c(wVar);
                return;
            case 11:
                uVar.f(wVar);
                return;
            case 12:
                uVar.b();
                return;
            default:
                uVar.e();
                return;
        }
    }
}
