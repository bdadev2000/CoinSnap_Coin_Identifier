package h0;

import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.AbstractC0446v;
import androidx.datastore.preferences.protobuf.C0435j;
import androidx.datastore.preferences.protobuf.InterfaceC0448x;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e0.p;
import g0.C2281c;
import g0.C2283e;
import g0.C2284f;
import g0.C2285g;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import u7.AbstractC2816g;
import u7.AbstractC2829t;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f20580a = new Object();

    public final C2312b a(FileInputStream fileInputStream) {
        int i9;
        try {
            C2283e l = C2283e.l(fileInputStream);
            C2312b c2312b = new C2312b(false);
            g[] gVarArr = (g[]) Arrays.copyOf(new g[0], 0);
            G7.j.e(gVarArr, "pairs");
            c2312b.a();
            if (gVarArr.length <= 0) {
                Map j7 = l.j();
                G7.j.d(j7, "preferencesProto.preferencesMap");
                for (Map.Entry entry : j7.entrySet()) {
                    String str = (String) entry.getKey();
                    g0.i iVar = (g0.i) entry.getValue();
                    G7.j.d(str, "name");
                    G7.j.d(iVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                    int x9 = iVar.x();
                    if (x9 == 0) {
                        i9 = -1;
                    } else {
                        i9 = i.f20579a[AbstractC2965e.d(x9)];
                    }
                    switch (i9) {
                        case -1:
                            throw new IOException("Value case is null.", null);
                        case 0:
                        default:
                            throw new RuntimeException();
                        case 1:
                            c2312b.c(new f(str), Boolean.valueOf(iVar.p()));
                            break;
                        case 2:
                            c2312b.c(new f(str), Float.valueOf(iVar.s()));
                            break;
                        case 3:
                            c2312b.c(new f(str), Double.valueOf(iVar.r()));
                            break;
                        case 4:
                            c2312b.c(new f(str), Integer.valueOf(iVar.t()));
                            break;
                        case 5:
                            c2312b.c(new f(str), Long.valueOf(iVar.u()));
                            break;
                        case 6:
                            f fVar = new f(str);
                            String v6 = iVar.v();
                            G7.j.d(v6, "value.string");
                            c2312b.c(fVar, v6);
                            break;
                        case 7:
                            f fVar2 = new f(str);
                            InterfaceC0448x k6 = iVar.w().k();
                            G7.j.d(k6, "value.stringSet.stringsList");
                            c2312b.c(fVar2, AbstractC2816g.V(k6));
                            break;
                        case 8:
                            throw new IOException("Value not set.", null);
                    }
                }
                Map unmodifiableMap = Collections.unmodifiableMap(c2312b.f20569a);
                G7.j.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
                return new C2312b(AbstractC2829t.d0(unmodifiableMap), true);
            }
            g gVar = gVarArr[0];
            throw null;
        } catch (A e4) {
            throw new IOException("Unable to parse preferences proto.", e4);
        }
    }

    public final void b(Object obj, p pVar) {
        AbstractC0446v a6;
        Map unmodifiableMap = Collections.unmodifiableMap(((C2312b) obj).f20569a);
        G7.j.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        C2281c k6 = C2283e.k();
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            f fVar = (f) entry.getKey();
            Object value = entry.getValue();
            String str = fVar.f20575a;
            if (value instanceof Boolean) {
                g0.h y4 = g0.i.y();
                boolean booleanValue = ((Boolean) value).booleanValue();
                y4.c();
                g0.i.m((g0.i) y4.f4607c, booleanValue);
                a6 = y4.a();
            } else if (value instanceof Float) {
                g0.h y6 = g0.i.y();
                float floatValue = ((Number) value).floatValue();
                y6.c();
                g0.i.n((g0.i) y6.f4607c, floatValue);
                a6 = y6.a();
            } else if (value instanceof Double) {
                g0.h y9 = g0.i.y();
                double doubleValue = ((Number) value).doubleValue();
                y9.c();
                g0.i.l((g0.i) y9.f4607c, doubleValue);
                a6 = y9.a();
            } else if (value instanceof Integer) {
                g0.h y10 = g0.i.y();
                int intValue = ((Number) value).intValue();
                y10.c();
                g0.i.o((g0.i) y10.f4607c, intValue);
                a6 = y10.a();
            } else if (value instanceof Long) {
                g0.h y11 = g0.i.y();
                long longValue = ((Number) value).longValue();
                y11.c();
                g0.i.i((g0.i) y11.f4607c, longValue);
                a6 = y11.a();
            } else if (value instanceof String) {
                g0.h y12 = g0.i.y();
                y12.c();
                g0.i.j((g0.i) y12.f4607c, (String) value);
                a6 = y12.a();
            } else if (value instanceof Set) {
                g0.h y13 = g0.i.y();
                C2284f l = C2285g.l();
                l.c();
                C2285g.i((C2285g) l.f4607c, (Set) value);
                y13.c();
                g0.i.k((g0.i) y13.f4607c, l);
                a6 = y13.a();
            } else {
                throw new IllegalStateException(G7.j.j(value.getClass().getName(), "PreferencesSerializer does not support type: "));
            }
            k6.getClass();
            str.getClass();
            k6.c();
            C2283e.i((C2283e) k6.f4607c).put(str, (g0.i) a6);
        }
        C2283e c2283e = (C2283e) k6.a();
        int a9 = c2283e.a();
        Logger logger = C0435j.f4581h;
        if (a9 > 4096) {
            a9 = 4096;
        }
        C0435j c0435j = new C0435j(pVar, a9);
        c2283e.c(c0435j);
        if (c0435j.f4586f > 0) {
            c0435j.P();
        }
    }
}
