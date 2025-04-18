package e6;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.datastore.preferences.protobuf.g0;
import androidx.datastore.preferences.protobuf.h0;
import androidx.datastore.preferences.protobuf.j;
import androidx.datastore.preferences.protobuf.j0;
import androidx.datastore.preferences.protobuf.k;
import androidx.datastore.preferences.protobuf.q;
import b1.i;
import com.facebook.internal.x;
import com.facebook.internal.z;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import h8.h;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import ki.d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import ni.l;
import org.json.JSONArray;
import w3.e0;
import w3.o;
import wh.y0;
import y7.m;
import y7.r;

/* loaded from: classes3.dex */
public final class c implements a1.c, h, l, e0 {

    /* renamed from: b, reason: collision with root package name */
    public static final c f17116b = new c();

    /* renamed from: c, reason: collision with root package name */
    public static final c f17117c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final c f17118d = new c();

    /* renamed from: f, reason: collision with root package name */
    public static final c f17119f = new c();

    public static final Bundle b(d eventType, String applicationId, List appEvents) {
        if (m6.a.b(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            Bundle bundle = new Bundle();
            bundle.putString(NotificationCompat.CATEGORY_EVENT, eventType.f17123b);
            bundle.putString(MBridgeConstans.APP_ID, applicationId);
            if (d.CUSTOM_APP_EVENTS == eventType) {
                JSONArray c10 = f17116b.c(applicationId, appEvents);
                if (c10.length() == 0) {
                    return null;
                }
                bundle.putString("custom_events", c10.toString());
            }
            return bundle;
        } catch (Throwable th2) {
            m6.a.a(c.class, th2);
            return null;
        }
    }

    @Override // h8.h
    public long a(m mVar) {
        return -1L;
    }

    public JSONArray c(String str, List list) {
        boolean areEqual;
        if (m6.a.b(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            List<com.facebook.appevents.e> mutableList = CollectionsKt.toMutableList((Collection) list);
            z5.b.b(mutableList);
            boolean z10 = false;
            if (!m6.a.b(this)) {
                try {
                    x f10 = z.f(str, false);
                    if (f10 != null) {
                        z10 = f10.a;
                    }
                } catch (Throwable th2) {
                    m6.a.a(this, th2);
                }
            }
            for (com.facebook.appevents.e eVar : mutableList) {
                String str2 = eVar.f10936g;
                if (str2 == null) {
                    areEqual = true;
                } else {
                    String jSONObject = eVar.f10932b.toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject, "jsonObject.toString()");
                    areEqual = Intrinsics.areEqual(com.facebook.b.t(jSONObject), str2);
                }
                if (areEqual) {
                    boolean z11 = eVar.f10933c;
                    if ((!z11) || (z11 && z10)) {
                        jSONArray.put(eVar.f10932b);
                    }
                } else {
                    Intrinsics.stringPlus("Event with invalid checksum: ", eVar);
                    com.facebook.x xVar = com.facebook.x.a;
                }
            }
            return jSONArray;
        } catch (Throwable th3) {
            m6.a.a(this, th3);
            return null;
        }
    }

    @Override // ni.l
    public Object convert(Object obj) {
        return (y0) obj;
    }

    @Override // h8.h
    public y7.x createSeekMap() {
        return new r(C.TIME_UNSET);
    }

    public c1.a d(ki.e0 e0Var) {
        int i10;
        byte[] bArr;
        ki.g input = e0Var.inputStream();
        Intrinsics.checkNotNullParameter(input, "input");
        try {
            b1.e r6 = b1.e.r(input);
            Intrinsics.checkNotNullExpressionValue(r6, "{\n                Prefer…From(input)\n            }");
            c1.f[] pairs = new c1.f[0];
            Intrinsics.checkNotNullParameter(pairs, "pairs");
            c1.a aVar = new c1.a(false);
            c1.f[] pairs2 = (c1.f[]) Arrays.copyOf(pairs, 0);
            Intrinsics.checkNotNullParameter(pairs2, "pairs");
            aVar.c();
            if (pairs2.length <= 0) {
                Map p10 = r6.p();
                Intrinsics.checkNotNullExpressionValue(p10, "preferencesProto.preferencesMap");
                for (Map.Entry entry : p10.entrySet()) {
                    String name = (String) entry.getKey();
                    i value = (i) entry.getValue();
                    Intrinsics.checkNotNullExpressionValue(name, "name");
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    int F = value.F();
                    if (F == 0) {
                        i10 = -1;
                    } else {
                        i10 = c1.i.a[t.h.b(F)];
                    }
                    switch (i10) {
                        case -1:
                            throw new y0.b("Value case is null.");
                        case 0:
                        default:
                            throw new NoWhenBranchMatchedException();
                        case 1:
                            Intrinsics.checkNotNullParameter(name, "name");
                            c1.e key = new c1.e(name);
                            Boolean valueOf = Boolean.valueOf(value.w());
                            Intrinsics.checkNotNullParameter(key, "key");
                            aVar.d(key, valueOf);
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(name, "name");
                            c1.e key2 = new c1.e(name);
                            Float valueOf2 = Float.valueOf(value.A());
                            Intrinsics.checkNotNullParameter(key2, "key");
                            aVar.d(key2, valueOf2);
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(name, "name");
                            c1.e key3 = new c1.e(name);
                            Double valueOf3 = Double.valueOf(value.z());
                            Intrinsics.checkNotNullParameter(key3, "key");
                            aVar.d(key3, valueOf3);
                            break;
                        case 4:
                            Intrinsics.checkNotNullParameter(name, "name");
                            c1.e key4 = new c1.e(name);
                            Integer valueOf4 = Integer.valueOf(value.B());
                            Intrinsics.checkNotNullParameter(key4, "key");
                            aVar.d(key4, valueOf4);
                            break;
                        case 5:
                            Intrinsics.checkNotNullParameter(name, "name");
                            c1.e key5 = new c1.e(name);
                            Long valueOf5 = Long.valueOf(value.C());
                            Intrinsics.checkNotNullParameter(key5, "key");
                            aVar.d(key5, valueOf5);
                            break;
                        case 6:
                            Intrinsics.checkNotNullParameter(name, "name");
                            c1.e key6 = new c1.e(name);
                            String D = value.D();
                            Intrinsics.checkNotNullExpressionValue(D, "value.string");
                            Intrinsics.checkNotNullParameter(key6, "key");
                            aVar.d(key6, D);
                            break;
                        case 7:
                            Intrinsics.checkNotNullParameter(name, "name");
                            c1.e key7 = new c1.e(name);
                            g0 q10 = value.E().q();
                            Intrinsics.checkNotNullExpressionValue(q10, "value.stringSet.stringsList");
                            Set set = CollectionsKt.toSet(q10);
                            Intrinsics.checkNotNullParameter(key7, "key");
                            aVar.d(key7, set);
                            break;
                        case 8:
                            Intrinsics.checkNotNullParameter(name, "name");
                            c1.e key8 = new c1.e(name);
                            k x10 = value.x();
                            int size = x10.size();
                            if (size == 0) {
                                bArr = h0.f1371b;
                            } else {
                                byte[] bArr2 = new byte[size];
                                x10.d(bArr2, size);
                                bArr = bArr2;
                            }
                            Intrinsics.checkNotNullExpressionValue(bArr, "value.bytes.toByteArray()");
                            Intrinsics.checkNotNullParameter(key8, "key");
                            aVar.d(key8, bArr);
                            break;
                        case 9:
                            throw new y0.b("Value not set.");
                    }
                }
                return new c1.a(MapsKt.toMutableMap(aVar.a()), true);
            }
            c1.f fVar = pairs2[0];
            throw null;
        } catch (j0 e2) {
            throw new y0.b(e2);
        }
    }

    public Unit e(Object obj, d0 d0Var) {
        androidx.datastore.preferences.protobuf.e0 a;
        Map a10 = ((c1.g) obj).a();
        b1.c q10 = b1.e.q();
        for (Map.Entry entry : a10.entrySet()) {
            c1.e eVar = (c1.e) entry.getKey();
            Object value = entry.getValue();
            String str = eVar.a;
            if (value instanceof Boolean) {
                b1.h G = i.G();
                boolean booleanValue = ((Boolean) value).booleanValue();
                G.c();
                i.t((i) G.f1331c, booleanValue);
                a = G.a();
                Intrinsics.checkNotNullExpressionValue(a, "newBuilder().setBoolean(value).build()");
            } else if (value instanceof Float) {
                b1.h G2 = i.G();
                float floatValue = ((Number) value).floatValue();
                G2.c();
                i.u((i) G2.f1331c, floatValue);
                a = G2.a();
                Intrinsics.checkNotNullExpressionValue(a, "newBuilder().setFloat(value).build()");
            } else if (value instanceof Double) {
                b1.h G3 = i.G();
                double doubleValue = ((Number) value).doubleValue();
                G3.c();
                i.q((i) G3.f1331c, doubleValue);
                a = G3.a();
                Intrinsics.checkNotNullExpressionValue(a, "newBuilder().setDouble(value).build()");
            } else if (value instanceof Integer) {
                b1.h G4 = i.G();
                int intValue = ((Number) value).intValue();
                G4.c();
                i.v((i) G4.f1331c, intValue);
                a = G4.a();
                Intrinsics.checkNotNullExpressionValue(a, "newBuilder().setInteger(value).build()");
            } else if (value instanceof Long) {
                b1.h G5 = i.G();
                long longValue = ((Number) value).longValue();
                G5.c();
                i.n((i) G5.f1331c, longValue);
                a = G5.a();
                Intrinsics.checkNotNullExpressionValue(a, "newBuilder().setLong(value).build()");
            } else if (value instanceof String) {
                b1.h G6 = i.G();
                G6.c();
                i.o((i) G6.f1331c, (String) value);
                a = G6.a();
                Intrinsics.checkNotNullExpressionValue(a, "newBuilder().setString(value).build()");
            } else if (value instanceof Set) {
                b1.h G7 = i.G();
                b1.f r6 = b1.g.r();
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                r6.c();
                b1.g.o((b1.g) r6.f1331c, (Set) value);
                G7.c();
                i.p((i) G7.f1331c, (b1.g) r6.a());
                a = G7.a();
                Intrinsics.checkNotNullExpressionValue(a, "newBuilder().setStringSe…                ).build()");
            } else if (value instanceof byte[]) {
                b1.h G8 = i.G();
                byte[] bArr = (byte[]) value;
                j jVar = k.f1389c;
                j c10 = k.c(0, bArr.length, bArr);
                G8.c();
                i.r((i) G8.f1331c, c10);
                a = G8.a();
                Intrinsics.checkNotNullExpressionValue(a, "newBuilder().setBytes(By….copyFrom(value)).build()");
            } else {
                throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
            }
            q10.getClass();
            str.getClass();
            q10.c();
            b1.e.o((b1.e) q10.f1331c).put(str, (i) a);
        }
        b1.e eVar2 = (b1.e) q10.a();
        ki.h g10 = d0Var.g();
        int a11 = eVar2.a(null);
        Logger logger = androidx.datastore.preferences.protobuf.r.f1459p;
        if (a11 > 4096) {
            a11 = 4096;
        }
        q qVar = new q(g10, a11);
        eVar2.b(qVar);
        if (qVar.f1454t > 0) {
            qVar.J0();
        }
        return Unit.INSTANCE;
    }

    @Override // w3.e0
    public Object f(x3.b bVar, float f10) {
        return o.b(bVar, f10);
    }

    @Override // h8.h
    public void startSeek(long j3) {
    }
}
