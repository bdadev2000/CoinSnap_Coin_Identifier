package com.facebook.appevents;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.facebook.g0;
import com.facebook.h0;
import com.facebook.internal.d0;
import com.facebook.internal.k0;
import com.facebook.internal.x;
import com.facebook.internal.z;
import com.facebook.j0;
import com.facebook.l0;
import com.facebook.m0;
import com.facebook.u0;
import com.google.common.collect.e2;
import com.google.common.collect.n0;
import com.google.common.collect.z1;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ExceptionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s7.a1;
import s7.b1;
import s7.d1;
import s7.e1;
import s7.f1;
import s7.f2;
import s7.i1;
import s7.j1;
import s7.l1;
import s7.m2;
import s7.q0;
import s7.r0;
import s7.s0;
import s7.v0;
import s7.x0;
import s7.y0;
import s7.z0;

/* loaded from: classes3.dex */
public final /* synthetic */ class m implements com.facebook.internal.s, f7.g, o7.h, s7.h, n9.l, db.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10957b;

    public /* synthetic */ m(int i10) {
        this.f10957b = i10;
    }

    @Override // f7.g
    public void a(Exception exc) {
    }

    @Override // o7.h
    public Object apply(Object obj) {
        byte[] decode;
        boolean z10 = true;
        switch (this.f10957b) {
            case 9:
                f7.c cVar = o7.j.f23150h;
                return (List) o7.j.s(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new m(13));
            case 10:
                f7.c cVar2 = o7.j.f23150h;
                throw new p7.a("Timed out while trying to open db.", (Throwable) obj);
            case 11:
                Cursor cursor = (Cursor) obj;
                f7.c cVar3 = o7.j.f23150h;
                if (cursor.moveToNext()) {
                    return Long.valueOf(cursor.getLong(0));
                }
                return 0L;
            case 12:
                f7.c cVar4 = o7.j.f23150h;
                throw new p7.a("Timed out while trying to acquire the lock.", (Throwable) obj);
            case 13:
                Cursor cursor2 = (Cursor) obj;
                f7.c cVar5 = o7.j.f23150h;
                ArrayList arrayList = new ArrayList();
                while (cursor2.moveToNext()) {
                    h.c a = i7.i.a();
                    a.G(cursor2.getString(1));
                    a.I(r7.a.b(cursor2.getInt(2)));
                    String string = cursor2.getString(3);
                    if (string == null) {
                        decode = null;
                    } else {
                        decode = Base64.decode(string, 0);
                    }
                    a.f18524d = decode;
                    arrayList.add(a.o());
                }
                return arrayList;
            case 14:
                Cursor cursor3 = (Cursor) obj;
                f7.c cVar6 = o7.j.f23150h;
                if (!cursor3.moveToNext()) {
                    return null;
                }
                return Long.valueOf(cursor3.getLong(0));
            case 15:
                f7.c cVar7 = o7.j.f23150h;
                if (((Cursor) obj).getCount() <= 0) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 16:
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            default:
                Cursor cursor4 = (Cursor) obj;
                f7.c cVar8 = o7.j.f23150h;
                ArrayList arrayList2 = new ArrayList();
                int i10 = 0;
                while (cursor4.moveToNext()) {
                    byte[] blob = cursor4.getBlob(0);
                    arrayList2.add(blob);
                    i10 += blob.length;
                }
                byte[] bArr = new byte[i10];
                int i11 = 0;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    byte[] bArr2 = (byte[]) arrayList2.get(i12);
                    System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
                    i11 += bArr2.length;
                }
                return bArr;
        }
    }

    @Override // com.facebook.internal.s
    public void b(boolean z10) {
        File[] listFiles;
        File[] listFiles2;
        boolean z11;
        int i10 = 3;
        int i11 = 0;
        switch (this.f10957b) {
            case 0:
                if (z10) {
                    b6.d dVar = b6.d.a;
                    if (!m6.a.b(b6.d.class)) {
                        try {
                            b6.d.f2313b = true;
                            b6.d.a.a();
                            return;
                        } catch (Throwable th2) {
                            m6.a.a(b6.d.class, th2);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                if (z10 && !m6.a.b(b6.b.class)) {
                    try {
                        b6.b bVar = b6.b.f2291b;
                        if (!m6.a.b(bVar)) {
                            try {
                                z zVar = z.a;
                                x f10 = z.f(com.facebook.x.b(), false);
                                if (f10 != null) {
                                    b6.b.f2293d = f10.f11134o;
                                }
                            } catch (Throwable th3) {
                                m6.a.a(bVar, th3);
                            }
                        }
                        if (b6.b.f2293d != null) {
                            b6.b.f2292c = true;
                            return;
                        }
                        return;
                    } catch (Throwable th4) {
                        m6.a.a(b6.b.class, th4);
                        return;
                    }
                }
                return;
            case 2:
                if (z10) {
                    boolean z12 = w5.d.a;
                    m0 m0Var = m0.APP_EVENTS;
                    try {
                        g0 g0Var = new g0(null, Intrinsics.stringPlus(com.facebook.x.b(), "/cloudbridge_settings"), null, l0.GET, new w5.c(i11));
                        com.facebook.internal.m mVar = d0.f11030d;
                        com.facebook.internal.m.o(m0Var, "w5.d", " \n\nCreating Graph Request: \n=============\n%s\n\n ", g0Var);
                        g0Var.d();
                        return;
                    } catch (JSONException e2) {
                        com.facebook.internal.m mVar2 = d0.f11030d;
                        com.facebook.internal.m.o(m0Var, "w5.d", " \n\nGraph Request Exception: \n=============\n%s\n\n ", ExceptionsKt.a(e2));
                        return;
                    }
                }
                return;
            case 3:
                String str = c6.b.a;
                if (z10) {
                    x5.d dVar2 = x5.d.a;
                    if (!m6.a.b(x5.d.class)) {
                        try {
                            x5.d.f27379f.set(true);
                            return;
                        } catch (Throwable th5) {
                            m6.a.a(x5.d.class, th5);
                            return;
                        }
                    }
                    return;
                }
                x5.d dVar3 = x5.d.a;
                if (!m6.a.b(x5.d.class)) {
                    try {
                        x5.d.f27379f.set(false);
                        return;
                    } catch (Throwable th6) {
                        m6.a.a(x5.d.class, th6);
                        return;
                    }
                }
                return;
            case 4:
                if (z10) {
                    synchronized (l6.a.f21138b) {
                        com.facebook.x xVar = com.facebook.x.a;
                        if (u0.b()) {
                            ni.a.t();
                        }
                        if (l6.a.f21139c != null) {
                            Log.w("l6.a", "Already enabled!");
                        } else {
                            l6.a aVar = new l6.a(Thread.getDefaultUncaughtExceptionHandler());
                            l6.a.f21139c = aVar;
                            Thread.setDefaultUncaughtExceptionHandler(aVar);
                        }
                    }
                    com.facebook.internal.v vVar = com.facebook.internal.v.a;
                    if (com.facebook.internal.v.c(com.facebook.internal.t.CrashShield)) {
                        com.bumptech.glide.e.f9645l = true;
                        if (u0.b() && !com.facebook.internal.m0.x()) {
                            File l10 = g.l();
                            if (l10 == null) {
                                listFiles = new File[0];
                            } else {
                                listFiles = l10.listFiles(new k0(2));
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
                                Intrinsics.checkNotNullParameter(file, "file");
                                j6.c cVar = new j6.c(file);
                                if (cVar.b()) {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("crash_shield", cVar.toString());
                                        String str2 = g0.f11000j;
                                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                        String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{com.facebook.x.b()}, 1));
                                        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                                        arrayList.add(com.facebook.c.A(null, format, jSONObject, new com.facebook.f(cVar, i10)));
                                    } catch (JSONException unused) {
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                j0 requests = new j0(arrayList);
                                String str3 = g0.f11000j;
                                Intrinsics.checkNotNullParameter(requests, "requests");
                                x5.i.n(requests);
                                new h0(requests).executeOnExecutor(com.facebook.x.c(), new Void[0]);
                            }
                        }
                        m6.a.f21628b = true;
                    }
                    com.facebook.internal.v vVar2 = com.facebook.internal.v.a;
                    com.facebook.internal.v.c(com.facebook.internal.t.ThreadCheck);
                    return;
                }
                return;
            case 5:
                if (z10) {
                    com.facebook.x xVar2 = com.facebook.x.a;
                    if (u0.b() && !com.facebook.internal.m0.x()) {
                        File l11 = g.l();
                        int i13 = 4;
                        if (l11 == null) {
                            listFiles2 = new File[0];
                        } else {
                            listFiles2 = l11.listFiles(new k0(i13));
                            Intrinsics.checkNotNullExpressionValue(listFiles2, "reportDir.listFiles { dir, name ->\n      name.matches(Regex(String.format(\"^%s[0-9]+.json$\", InstrumentUtility.ERROR_REPORT_PREFIX)))\n    }");
                        }
                        ArrayList arrayList2 = new ArrayList();
                        int length2 = listFiles2.length;
                        int i14 = 0;
                        while (i14 < length2) {
                            File file2 = listFiles2[i14];
                            i14++;
                            n6.a aVar2 = new n6.a(file2);
                            if (aVar2.f22459b != null && aVar2.f22460c != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                arrayList2.add(aVar2);
                            }
                        }
                        CollectionsKt.sortWith(arrayList2, new k0.b(i10));
                        JSONArray jSONArray = new JSONArray();
                        while (i11 < arrayList2.size() && i11 < 1000) {
                            jSONArray.put(arrayList2.get(i11));
                            i11++;
                        }
                        g.J("error_reports", jSONArray, new com.facebook.f(arrayList2, i13));
                        return;
                    }
                    return;
                }
                return;
            default:
                if (z10) {
                    AtomicBoolean atomicBoolean = k6.c.a;
                    synchronized (k6.c.class) {
                        if (!m6.a.b(k6.c.class)) {
                            try {
                            } catch (Throwable th7) {
                                m6.a.a(k6.c.class, th7);
                            }
                            if (!k6.c.a.getAndSet(true)) {
                                com.facebook.x xVar3 = com.facebook.x.a;
                                if (u0.b()) {
                                    k6.c.a();
                                }
                                int i15 = k6.a.a;
                                if (!m6.a.b(k6.a.class)) {
                                    try {
                                        k6.a.f20276b.scheduleAtFixedRate(k6.a.f20278d, 0L, 500, TimeUnit.MILLISECONDS);
                                    } catch (Throwable th8) {
                                        m6.a.a(k6.a.class, th8);
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

    @Override // db.d
    public Object c(ob.c cVar) {
        switch (this.f10957b) {
            case 0:
                return AbtRegistrar.a(cVar);
            case 1:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 2:
                return (ScheduledExecutorService) ExecutorsRegistrar.f12067c.get();
            case 3:
                return (ScheduledExecutorService) ExecutorsRegistrar.f12066b.get();
            case 4:
                db.n nVar = ExecutorsRegistrar.a;
                return eb.l.f17288b;
            case 5:
                return TransportRegistrar.b(cVar);
            case 6:
                return TransportRegistrar.c(cVar);
            case 7:
                return TransportRegistrar.a(cVar);
            case 8:
                return FirebaseInstallationsRegistrar.a(cVar);
            case 9:
                Set c10 = cVar.c(db.s.a(kc.a.class));
                kc.c cVar2 = kc.c.f20638d;
                if (cVar2 == null) {
                    synchronized (kc.c.class) {
                        cVar2 = kc.c.f20638d;
                        if (cVar2 == null) {
                            cVar2 = new kc.c(0);
                            kc.c.f20638d = cVar2;
                        }
                    }
                }
                return new kc.b(c10, cVar2);
            case 10:
                return FirebaseSessionsRegistrar.d(cVar);
            case 11:
                return FirebaseSessionsRegistrar.a(cVar);
            case 12:
                return FirebaseSessionsRegistrar.e(cVar);
            case 13:
                return FirebaseSessionsRegistrar.b(cVar);
            case 14:
                return FirebaseSessionsRegistrar.c(cVar);
            default:
                return FirebaseSessionsRegistrar.f(cVar);
        }
    }

    @Override // s7.h
    public s7.i g(Bundle bundle) {
        d1 d1Var;
        l1 l1Var;
        z0 z0Var;
        f1 f1Var;
        boolean z10;
        Map a;
        b1 b1Var;
        z1 v10;
        z1 v11;
        e1 e1Var = null;
        v0 v0Var = null;
        byte[] bArr = null;
        boolean z11 = true;
        int i10 = 0;
        switch (this.f10957b) {
            case 21:
                r0 r0Var = r0.K;
                q0 q0Var = new q0();
                if (bundle != null) {
                    ClassLoader classLoader = v8.u0.class.getClassLoader();
                    int i11 = n9.h0.a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(r0.L);
                r0 r0Var2 = r0.K;
                String str = r0Var2.f24712b;
                if (string == null) {
                    string = str;
                }
                q0Var.a = string;
                String string2 = bundle.getString(r0.M);
                if (string2 == null) {
                    string2 = r0Var2.f24713c;
                }
                q0Var.f24658b = string2;
                String string3 = bundle.getString(r0.N);
                if (string3 == null) {
                    string3 = r0Var2.f24714d;
                }
                q0Var.f24659c = string3;
                q0Var.f24660d = bundle.getInt(r0.O, r0Var2.f24715f);
                q0Var.f24661e = bundle.getInt(r0.P, r0Var2.f24716g);
                q0Var.f24662f = bundle.getInt(r0.Q, r0Var2.f24717h);
                q0Var.f24663g = bundle.getInt(r0.R, r0Var2.f24718i);
                String string4 = bundle.getString(r0.S);
                if (string4 == null) {
                    string4 = r0Var2.f24720k;
                }
                q0Var.f24664h = string4;
                l8.b bVar = (l8.b) bundle.getParcelable(r0.T);
                if (bVar == null) {
                    bVar = r0Var2.f24721l;
                }
                q0Var.f24665i = bVar;
                String string5 = bundle.getString(r0.U);
                if (string5 == null) {
                    string5 = r0Var2.f24722m;
                }
                q0Var.f24666j = string5;
                String string6 = bundle.getString(r0.V);
                if (string6 == null) {
                    string6 = r0Var2.f24723n;
                }
                q0Var.f24667k = string6;
                q0Var.f24668l = bundle.getInt(r0.W, r0Var2.f24724o);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle.getByteArray(r0.c(i10));
                    if (byteArray == null) {
                        q0Var.f24669m = arrayList;
                        q0Var.f24670n = (x7.l) bundle.getParcelable(r0.Y);
                        q0Var.f24671o = bundle.getLong(r0.Z, r0Var2.f24727r);
                        q0Var.f24672p = bundle.getInt(r0.f24694a0, r0Var2.f24728s);
                        q0Var.f24673q = bundle.getInt(r0.f24695b0, r0Var2.f24729t);
                        q0Var.f24674r = bundle.getFloat(r0.f24696c0, r0Var2.u);
                        q0Var.f24675s = bundle.getInt(r0.f24697d0, r0Var2.f24730v);
                        q0Var.f24676t = bundle.getFloat(r0.f24698e0, r0Var2.f24731w);
                        q0Var.u = bundle.getByteArray(r0.f24699f0);
                        q0Var.f24677v = bundle.getInt(r0.f24700g0, r0Var2.f24733y);
                        Bundle bundle2 = bundle.getBundle(r0.f24701h0);
                        if (bundle2 != null) {
                            q0Var.f24678w = (o9.b) o9.b.f23184m.g(bundle2);
                        }
                        q0Var.f24679x = bundle.getInt(r0.f24702i0, r0Var2.A);
                        q0Var.f24680y = bundle.getInt(r0.f24703j0, r0Var2.B);
                        q0Var.f24681z = bundle.getInt(r0.f24704k0, r0Var2.C);
                        q0Var.A = bundle.getInt(r0.f24705l0, r0Var2.D);
                        q0Var.B = bundle.getInt(r0.f24706m0, r0Var2.E);
                        q0Var.C = bundle.getInt(r0.f24707n0, r0Var2.F);
                        q0Var.D = bundle.getInt(r0.f24709p0, r0Var2.G);
                        q0Var.E = bundle.getInt(r0.f24710q0, r0Var2.H);
                        q0Var.F = bundle.getInt(r0.f24708o0, r0Var2.I);
                        return new r0(q0Var);
                    }
                    arrayList.add(byteArray);
                    i10++;
                }
            case 22:
                String str2 = s0.f24742g;
                if (bundle.getInt(m2.f24595b, -1) != 0) {
                    z11 = false;
                }
                v8.u0.d(z11);
                if (bundle.getBoolean(s0.f24742g, false)) {
                    return new s0(bundle.getBoolean(s0.f24743h, false));
                }
                return new s0();
            case 23:
                String string7 = bundle.getString(j1.f24445j, "");
                string7.getClass();
                Bundle bundle3 = bundle.getBundle(j1.f24446k);
                if (bundle3 == null) {
                    d1Var = d1.f24312h;
                } else {
                    d1Var = (d1) d1.f24318n.g(bundle3);
                }
                d1 d1Var2 = d1Var;
                Bundle bundle4 = bundle.getBundle(j1.f24447l);
                if (bundle4 == null) {
                    l1Var = l1.K;
                } else {
                    l1Var = (l1) l1.f24534s0.g(bundle4);
                }
                l1 l1Var2 = l1Var;
                Bundle bundle5 = bundle.getBundle(j1.f24448m);
                if (bundle5 == null) {
                    z0Var = z0.f24893o;
                } else {
                    z0Var = (z0) y0.f24872n.g(bundle5);
                }
                z0 z0Var2 = z0Var;
                Bundle bundle6 = bundle.getBundle(j1.f24449n);
                if (bundle6 == null) {
                    f1Var = f1.f24351d;
                } else {
                    f1Var = (f1) f1.f24355i.g(bundle6);
                }
                f1 f1Var2 = f1Var;
                Bundle bundle7 = bundle.getBundle(j1.f24450o);
                if (bundle7 != null) {
                    e1Var = (e1) e1.f24341r.g(bundle7);
                }
                return new j1(string7, z0Var2, e1Var, d1Var2, l1Var2, f1Var2);
            case 24:
                Uri uri = (Uri) bundle.getParcelable(v0.f24772d);
                uri.getClass();
                return new v0(new r4.c(uri));
            case 25:
                x0 x0Var = new x0();
                z0 z0Var3 = y0.f24866h;
                long j3 = bundle.getLong(y0.f24867i, z0Var3.f24873b);
                if (j3 >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                v8.u0.d(z10);
                x0Var.a = j3;
                long j10 = bundle.getLong(y0.f24868j, z0Var3.f24874c);
                if (j10 != Long.MIN_VALUE && j10 < 0) {
                    z11 = false;
                }
                v8.u0.d(z11);
                x0Var.f24858b = j10;
                x0Var.f24859c = bundle.getBoolean(y0.f24869k, z0Var3.f24875d);
                x0Var.f24860d = bundle.getBoolean(y0.f24870l, z0Var3.f24876f);
                x0Var.f24861e = bundle.getBoolean(y0.f24871m, z0Var3.f24877g);
                return new z0(x0Var);
            case 26:
                String string8 = bundle.getString(b1.f24284k);
                string8.getClass();
                UUID fromString = UUID.fromString(string8);
                Uri uri2 = (Uri) bundle.getParcelable(b1.f24285l);
                Bundle bundle8 = Bundle.EMPTY;
                Bundle bundle9 = bundle.getBundle(b1.f24286m);
                if (bundle9 == null) {
                    bundle9 = bundle8;
                }
                if (bundle9 == bundle8) {
                    a = e2.f11936i;
                } else {
                    HashMap hashMap = new HashMap();
                    if (bundle9 != bundle8) {
                        for (String str3 : bundle9.keySet()) {
                            String string9 = bundle9.getString(str3);
                            if (string9 != null) {
                                hashMap.put(str3, string9);
                            }
                        }
                    }
                    a = com.google.common.collect.u0.a(hashMap);
                }
                boolean z12 = bundle.getBoolean(b1.f24287n, false);
                boolean z13 = bundle.getBoolean(b1.f24288o, false);
                boolean z14 = bundle.getBoolean(b1.f24289p, false);
                ArrayList<Integer> arrayList2 = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(b1.f24290q);
                if (integerArrayList != null) {
                    arrayList2 = integerArrayList;
                }
                com.google.common.collect.r0 i12 = com.google.common.collect.r0.i(arrayList2);
                byte[] byteArray2 = bundle.getByteArray(b1.f24291r);
                a1 a1Var = new a1(fromString);
                a1Var.f24257b = uri2;
                a1Var.f24258c = com.google.common.collect.u0.a(a);
                a1Var.f24259d = z12;
                a1Var.f24261f = z14;
                a1Var.f24260e = z13;
                a1Var.f24262g = com.google.common.collect.r0.i(i12);
                if (byteArray2 != null) {
                    bArr = Arrays.copyOf(byteArray2, byteArray2.length);
                }
                a1Var.f24263h = bArr;
                return new b1(a1Var);
            case 27:
                d1 d1Var3 = d1.f24312h;
                return new d1(bundle.getLong(d1.f24313i, d1Var3.f24319b), bundle.getLong(d1.f24314j, d1Var3.f24320c), bundle.getLong(d1.f24315k, d1Var3.f24321d), bundle.getFloat(d1.f24316l, d1Var3.f24322f), bundle.getFloat(d1.f24317m, d1Var3.f24323g));
            case 28:
                Bundle bundle10 = bundle.getBundle(e1.f24336m);
                if (bundle10 == null) {
                    b1Var = null;
                } else {
                    b1Var = (b1) b1.f24292s.g(bundle10);
                }
                Bundle bundle11 = bundle.getBundle(e1.f24337n);
                if (bundle11 != null) {
                    v0Var = (v0) v0.f24773f.g(bundle11);
                }
                v0 v0Var2 = v0Var;
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(e1.f24338o);
                if (parcelableArrayList == null) {
                    n0 n0Var = com.google.common.collect.r0.f12026c;
                    v10 = z1.f12062g;
                } else {
                    v10 = v8.u0.v(new m(29), parcelableArrayList);
                }
                z1 z1Var = v10;
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(e1.f24340q);
                if (parcelableArrayList2 == null) {
                    n0 n0Var2 = com.google.common.collect.r0.f12026c;
                    v11 = z1.f12062g;
                } else {
                    v11 = v8.u0.v(i1.f24432q, parcelableArrayList2);
                }
                Uri uri3 = (Uri) bundle.getParcelable(e1.f24334k);
                uri3.getClass();
                return new e1(uri3, bundle.getString(e1.f24335l), b1Var, v0Var2, z1Var, bundle.getString(e1.f24339p), v11, null);
            default:
                return new u8.b(bundle.getInt(u8.b.f25737f, 0), bundle.getInt(u8.b.f25738g, 0), bundle.getInt(u8.b.f25739h, 0));
        }
    }

    @Override // n9.l
    public void invoke(Object obj) {
        ((f2) obj).onRenderedFirstFrame();
    }
}
