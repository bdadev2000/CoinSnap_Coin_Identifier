package n7;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.applovin.impl.av;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.common.collect.c1;
import h7.a0;
import h7.b0;
import h7.c0;
import h7.h0;
import h7.i0;
import h7.j0;
import h7.k0;
import h7.m;
import h7.o;
import h7.p;
import h7.q;
import h7.r;
import h7.s;
import h7.t;
import h7.u;
import h7.w;
import h7.y;
import h7.z;
import i7.n;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class i {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final j7.g f22486b;

    /* renamed from: c, reason: collision with root package name */
    public final o7.d f22487c;

    /* renamed from: d, reason: collision with root package name */
    public final l f22488d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f22489e;

    /* renamed from: f, reason: collision with root package name */
    public final p7.c f22490f;

    /* renamed from: g, reason: collision with root package name */
    public final q7.a f22491g;

    /* renamed from: h, reason: collision with root package name */
    public final q7.a f22492h;

    /* renamed from: i, reason: collision with root package name */
    public final o7.c f22493i;

    public i(Context context, j7.g gVar, o7.d dVar, l lVar, Executor executor, p7.c cVar, q7.a aVar, q7.a aVar2, o7.c cVar2) {
        this.a = context;
        this.f22486b = gVar;
        this.f22487c = dVar;
        this.f22488d = lVar;
        this.f22489e = executor;
        this.f22490f = cVar;
        this.f22491g = aVar;
        this.f22492h = aVar2;
        this.f22493i = cVar2;
    }

    public final void a(i7.i iVar, int i10) {
        j7.i iVar2;
        byte[] bArr;
        long j3;
        o7.j jVar;
        int i11;
        j7.b bVar;
        String str;
        int i12;
        Object apply;
        String str2;
        String str3;
        long j10;
        o7.j jVar2;
        m2.l lVar;
        long longValue;
        String str4;
        long j11;
        final i iVar3 = this;
        final i7.i iVar4 = iVar;
        j7.i a = iVar3.f22486b.a(iVar4.a);
        final int i13 = 1;
        new j7.b(1, 0L);
        long j12 = 0;
        while (true) {
            final int i14 = 0;
            p7.b bVar2 = new p7.b(iVar3) { // from class: n7.g

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ i f22479c;

                {
                    this.f22479c = iVar3;
                }

                @Override // p7.b
                public final Object execute() {
                    int i15 = i14;
                    final i7.i iVar5 = iVar4;
                    i iVar6 = this.f22479c;
                    switch (i15) {
                        case 0:
                            final o7.j jVar3 = (o7.j) iVar6.f22487c;
                            jVar3.getClass();
                            final int i16 = 0;
                            return Boolean.valueOf(((Boolean) jVar3.j(new o7.h() { // from class: o7.e
                                /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
                                /* JADX WARN: Removed duplicated region for block: B:33:0x00d0  */
                                @Override // o7.h
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public final java.lang.Object apply(java.lang.Object r12) {
                                    /*
                                        Method dump skipped, instructions count: 292
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: o7.e.apply(java.lang.Object):java.lang.Object");
                                }
                            })).booleanValue());
                        default:
                            final o7.j jVar4 = (o7.j) iVar6.f22487c;
                            jVar4.getClass();
                            final int i17 = 1;
                            return (Iterable) jVar4.j(new o7.h() { // from class: o7.e
                                @Override // o7.h
                                public final Object apply(Object obj) {
                                    /*  JADX ERROR: Method code generation error
                                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                                        	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                        */
                                    /*
                                        Method dump skipped, instructions count: 292
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: o7.e.apply(java.lang.Object):java.lang.Object");
                                }
                            });
                    }
                }
            };
            o7.j jVar3 = (o7.j) iVar3.f22490f;
            boolean booleanValue = ((Boolean) jVar3.q(bVar2)).booleanValue();
            q7.a aVar = iVar3.f22491g;
            if (booleanValue) {
                Iterable iterable = (Iterable) jVar3.q(new p7.b(iVar3) { // from class: n7.g

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ i f22479c;

                    {
                        this.f22479c = iVar3;
                    }

                    @Override // p7.b
                    public final Object execute() {
                        int i15 = i13;
                        final i7.i iVar5 = iVar4;
                        i iVar6 = this.f22479c;
                        switch (i15) {
                            case 0:
                                final o7.j jVar32 = (o7.j) iVar6.f22487c;
                                jVar32.getClass();
                                final int i16 = 0;
                                return Boolean.valueOf(((Boolean) jVar32.j(new o7.h() { // from class: o7.e
                                    /*  JADX ERROR: Method code generation error
                                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                                        	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                        */
                                    @Override // o7.h
                                    public final java.lang.Object apply(java.lang.Object r12) {
                                        /*
                                            Method dump skipped, instructions count: 292
                                            To view this dump change 'Code comments level' option to 'DEBUG'
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: o7.e.apply(java.lang.Object):java.lang.Object");
                                    }
                                })).booleanValue());
                            default:
                                final o7.j jVar4 = (o7.j) iVar6.f22487c;
                                jVar4.getClass();
                                final int i17 = 1;
                                return (Iterable) jVar4.j(new o7.h() { // from class: o7.e
                                    /*  JADX ERROR: Method code generation error
                                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                                        	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                        */
                                    @Override // o7.h
                                    public final java.lang.Object apply(java.lang.Object r12) {
                                        /*
                                            Method dump skipped, instructions count: 292
                                            To view this dump change 'Code comments level' option to 'DEBUG'
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: o7.e.apply(java.lang.Object):java.lang.Object");
                                    }
                                });
                        }
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return;
                }
                byte[] bArr2 = iVar4.f19178b;
                if (a == null) {
                    com.bumptech.glide.c.q("Uploader", "Unknown backend for %s, deleting event batch for it...", iVar4);
                    bVar = new j7.b(3, -1L);
                    iVar2 = a;
                    bArr = bArr2;
                    j3 = j12;
                    jVar = jVar3;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((o7.b) it.next()).f23141c);
                    }
                    if (bArr2 != null) {
                        i14 = 1;
                    }
                    String str5 = "proto";
                    int i15 = 11;
                    if (i14 != 0) {
                        o7.c cVar = iVar3.f22493i;
                        Objects.requireNonNull(cVar);
                        l7.a aVar2 = (l7.a) jVar3.q(new androidx.core.app.h(cVar, i15));
                        u2.l lVar2 = new u2.l();
                        lVar2.f25473f = new HashMap();
                        lVar2.f25471d = Long.valueOf(((q7.b) aVar).a());
                        lVar2.f25472e = Long.valueOf(((q7.b) iVar3.f22492h).a());
                        lVar2.t("GDT_CLIENT_METRICS");
                        f7.c cVar2 = new f7.c("proto");
                        aVar2.getClass();
                        c1 c1Var = n.a;
                        c1Var.getClass();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            c1Var.l(aVar2, byteArrayOutputStream);
                        } catch (IOException unused) {
                        }
                        lVar2.p(new i7.l(cVar2, byteArrayOutputStream.toByteArray()));
                        arrayList.add(((g7.d) a).a(lVar2.b()));
                    }
                    r4.c cVar3 = new r4.c(11);
                    cVar3.f23999c = arrayList;
                    cVar3.f24000d = bArr2;
                    ArrayList<i7.h> arrayList2 = arrayList;
                    j7.a aVar3 = new j7.a(arrayList2, bArr2);
                    g7.d dVar = (g7.d) a;
                    HashMap hashMap = new HashMap();
                    for (i7.h hVar : arrayList2) {
                        String str6 = hVar.a;
                        if (!hashMap.containsKey(str6)) {
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(hVar);
                            hashMap.put(str6, arrayList3);
                        } else {
                            ((List) hashMap.get(str6)).add(hVar);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = hashMap.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        j7.i iVar5 = a;
                        i7.h hVar2 = (i7.h) ((List) entry.getValue()).get(0);
                        ob.c cVar4 = new ob.c();
                        Iterator it3 = it2;
                        cVar4.f23297g = k0.DEFAULT;
                        cVar4.f23292b = Long.valueOf(((q7.b) dVar.f18241f).a());
                        cVar4.f23293c = Long.valueOf(((q7.b) dVar.f18240e).a());
                        byte[] bArr3 = bArr2;
                        r4.c cVar5 = new r4.c(7);
                        cVar5.f23999c = y.ANDROID_FIREBASE;
                        h7.l lVar3 = new h7.l(0);
                        lVar3.a = Integer.valueOf(hVar2.b("sdk-version"));
                        lVar3.f18826b = hVar2.a("model");
                        lVar3.f18827c = hVar2.a("hardware");
                        lVar3.f18828d = hVar2.a("device");
                        lVar3.f18829e = hVar2.a(AppLovinEventTypes.USER_VIEWED_PRODUCT);
                        lVar3.f18830f = hVar2.a("os-uild");
                        lVar3.f18831g = hVar2.a("manufacturer");
                        lVar3.f18832h = hVar2.a("fingerprint");
                        lVar3.f18834j = hVar2.a("country");
                        lVar3.f18833i = hVar2.a("locale");
                        lVar3.f18835k = hVar2.a("mcc_mnc");
                        String a10 = hVar2.a("application_build");
                        lVar3.f18836l = a10;
                        m mVar = new m((Integer) lVar3.a, (String) lVar3.f18826b, (String) lVar3.f18827c, (String) lVar3.f18828d, (String) lVar3.f18829e, (String) lVar3.f18830f, (String) lVar3.f18831g, (String) lVar3.f18832h, (String) lVar3.f18833i, (String) lVar3.f18834j, (String) lVar3.f18835k, a10);
                        cVar5.f24000d = mVar;
                        cVar4.f23294d = new o((y) cVar5.f23999c, mVar);
                        try {
                            cVar4.f23295e = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        } catch (NumberFormatException unused2) {
                            cVar4.a = (String) entry.getKey();
                        }
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it4 = ((List) entry.getValue()).iterator();
                        while (it4.hasNext()) {
                            i7.h hVar3 = (i7.h) it4.next();
                            i7.l lVar4 = hVar3.f19170c;
                            Iterator it5 = it4;
                            f7.c cVar6 = lVar4.a;
                            boolean equals = cVar6.equals(new f7.c(str5));
                            byte[] bArr4 = lVar4.f19186b;
                            if (equals) {
                                lVar = new m2.l(2);
                                lVar.f21471f = bArr4;
                                str3 = str5;
                            } else {
                                str3 = str5;
                                if (cVar6.equals(new f7.c("json"))) {
                                    String str7 = new String(bArr4, Charset.forName("UTF-8"));
                                    m2.l lVar5 = new m2.l(2);
                                    lVar5.a = str7;
                                    lVar = lVar5;
                                } else {
                                    j10 = j12;
                                    jVar2 = jVar3;
                                    String C = com.bumptech.glide.c.C("CctTransportBackend");
                                    if (Log.isLoggable(C, 5)) {
                                        Log.w(C, String.format("Received event of unsupported encoding %s. Skipping...", cVar6));
                                    }
                                    it4 = it5;
                                    str5 = str3;
                                    jVar3 = jVar2;
                                    j12 = j10;
                                }
                            }
                            lVar.f21467b = Long.valueOf(hVar3.f19171d);
                            lVar.f21470e = Long.valueOf(hVar3.f19172e);
                            String str8 = (String) hVar3.f19173f.get("tz-offset");
                            if (str8 == null) {
                                longValue = 0;
                            } else {
                                longValue = Long.valueOf(str8).longValue();
                            }
                            lVar.f21472g = Long.valueOf(longValue);
                            r4.c cVar7 = new r4.c(10);
                            cVar7.f23999c = (i0) i0.f18813b.get(hVar3.b("net-type"));
                            h0 h0Var = (h0) h0.f18802b.get(hVar3.b("mobile-subtype"));
                            cVar7.f24000d = h0Var;
                            lVar.f21473h = new w((i0) cVar7.f23999c, h0Var);
                            Integer num = hVar3.f19169b;
                            if (num != null) {
                                lVar.f21468c = num;
                            }
                            Integer num2 = hVar3.f19174g;
                            if (num2 != null) {
                                r4.c cVar8 = new r4.c(8);
                                jVar2 = jVar3;
                                f.a aVar4 = new f.a(28);
                                j10 = j12;
                                new kc.c(28).f20640c = num2;
                                r rVar = new r(num2);
                                aVar4.f17509c = rVar;
                                s sVar = new s(rVar);
                                cVar8.f23999c = sVar;
                                a0 a0Var = a0.EVENT_OVERRIDE;
                                cVar8.f24000d = a0Var;
                                lVar.f21469d = new p(sVar, a0Var);
                            } else {
                                j10 = j12;
                                jVar2 = jVar3;
                            }
                            byte[] bArr5 = hVar3.f19177j;
                            byte[] bArr6 = hVar3.f19176i;
                            if (bArr6 != null || bArr5 != null) {
                                r4.c cVar9 = new r4.c(9);
                                if (bArr6 != null) {
                                    cVar9.f23999c = bArr6;
                                }
                                if (bArr5 != null) {
                                    cVar9.f24000d = bArr5;
                                }
                                lVar.f21474i = new q((byte[]) cVar9.f23999c, (byte[]) cVar9.f24000d);
                            }
                            if (((Long) lVar.f21467b) != null) {
                                str4 = "";
                            } else {
                                str4 = " eventTimeMs";
                            }
                            if (((Long) lVar.f21470e) == null) {
                                str4 = str4.concat(" eventUptimeMs");
                            }
                            if (((Long) lVar.f21472g) == null) {
                                str4 = eb.j.k(str4, " timezoneOffsetSeconds");
                            }
                            if (str4.isEmpty()) {
                                arrayList5.add(new t(((Long) lVar.f21467b).longValue(), (Integer) lVar.f21468c, (b0) lVar.f21469d, ((Long) lVar.f21470e).longValue(), (byte[]) lVar.f21471f, (String) lVar.a, ((Long) lVar.f21472g).longValue(), (j0) lVar.f21473h, (c0) lVar.f21474i));
                                it4 = it5;
                                str5 = str3;
                                jVar3 = jVar2;
                                j12 = j10;
                            } else {
                                throw new IllegalStateException("Missing required properties:".concat(str4));
                            }
                        }
                        long j13 = j12;
                        o7.j jVar4 = jVar3;
                        String str9 = str5;
                        cVar4.f23296f = arrayList5;
                        if (((Long) cVar4.f23292b) != null) {
                            str2 = "";
                        } else {
                            str2 = " requestTimeMs";
                        }
                        if (((Long) cVar4.f23293c) == null) {
                            str2 = str2.concat(" requestUptimeMs");
                        }
                        if (str2.isEmpty()) {
                            arrayList4.add(new u(((Long) cVar4.f23292b).longValue(), ((Long) cVar4.f23293c).longValue(), (z) cVar4.f23294d, (Integer) cVar4.f23295e, (String) cVar4.a, (List) cVar4.f23296f, (k0) cVar4.f23297g));
                            a = iVar5;
                            it2 = it3;
                            bArr2 = bArr3;
                            str5 = str9;
                            jVar3 = jVar4;
                            j12 = j13;
                        } else {
                            throw new IllegalStateException("Missing required properties:".concat(str2));
                        }
                    }
                    iVar2 = a;
                    bArr = bArr2;
                    j3 = j12;
                    jVar = jVar3;
                    int i16 = 5;
                    i11 = 0;
                    h7.n nVar = new h7.n(arrayList4);
                    URL url = dVar.f18239d;
                    byte[] bArr7 = aVar3.f19772b;
                    if (bArr7 != null) {
                        try {
                            g7.a a11 = g7.a.a(bArr7);
                            str = a11.f18232b;
                            if (str == null) {
                                str = null;
                            }
                            String str10 = a11.a;
                            if (str10 != null) {
                                try {
                                    url = new URL(str10);
                                } catch (MalformedURLException e2) {
                                    throw new IllegalArgumentException("Invalid url: " + str10, e2);
                                    break;
                                }
                            }
                        } catch (IllegalArgumentException unused3) {
                            bVar = new j7.b(3, -1L);
                        }
                    } else {
                        str = null;
                    }
                    try {
                        g7.b bVar3 = new g7.b(url, nVar, str);
                        androidx.core.app.h hVar4 = new androidx.core.app.h(dVar, 8);
                        do {
                            apply = hVar4.apply(bVar3);
                            g7.c cVar10 = (g7.c) apply;
                            URL url2 = cVar10.f18235b;
                            if (url2 != null) {
                                com.bumptech.glide.c.q("CctTransportBackend", "Following redirect to: %s", url2);
                                bVar3 = new g7.b(cVar10.f18235b, bVar3.f18233b, bVar3.f18234c);
                            } else {
                                bVar3 = null;
                            }
                            if (bVar3 == null) {
                                break;
                            } else {
                                i16--;
                            }
                        } while (i16 >= 1);
                        g7.c cVar11 = (g7.c) apply;
                        int i17 = cVar11.a;
                        if (i17 == 200) {
                            bVar = new j7.b(1, cVar11.f18236c);
                        } else {
                            if (i17 < 500 && i17 != 404) {
                                if (i17 == 400) {
                                    bVar = new j7.b(4, -1L);
                                } else {
                                    bVar = new j7.b(3, -1L);
                                }
                            }
                            bVar = new j7.b(2, -1L);
                        }
                        i14 = 0;
                    } catch (IOException e10) {
                        com.bumptech.glide.c.r("CctTransportBackend", "Could not make request to the backend", e10);
                        i12 = 2;
                        bVar = new j7.b(2, -1L);
                    }
                }
                i12 = 2;
                i11 = i14;
                if (bVar.a == i12) {
                    jVar.q(new h(this, iterable, iVar, j3));
                    ((c) this.f22488d).a(iVar, i10 + 1, true);
                    return;
                }
                o7.j jVar5 = jVar;
                jVar5.q(new androidx.fragment.app.e(9, this, iterable));
                int i18 = bVar.a;
                if (i18 == 1) {
                    j11 = Math.max(j3, bVar.f19773b);
                    if (bArr != null) {
                        i11 = 1;
                    }
                    if (i11 != 0) {
                        jVar5.q(new androidx.core.app.h(this, 10));
                    }
                } else {
                    long j14 = j3;
                    if (i18 == 4) {
                        HashMap hashMap2 = new HashMap();
                        Iterator it6 = iterable.iterator();
                        while (it6.hasNext()) {
                            String str11 = ((o7.b) it6.next()).f23141c.a;
                            if (!hashMap2.containsKey(str11)) {
                                hashMap2.put(str11, 1);
                            } else {
                                hashMap2.put(str11, Integer.valueOf(((Integer) hashMap2.get(str11)).intValue() + 1));
                            }
                        }
                        i13 = 1;
                        jVar5.q(new androidx.fragment.app.e(10, this, hashMap2));
                        j11 = j14;
                        iVar4 = iVar;
                        j12 = j11;
                        a = iVar2;
                        iVar3 = this;
                    } else {
                        j11 = j14;
                    }
                }
                i13 = 1;
                iVar4 = iVar;
                j12 = j11;
                a = iVar2;
                iVar3 = this;
            } else {
                i iVar6 = iVar3;
                long j15 = j12;
                i7.i iVar7 = iVar4;
                SQLiteDatabase d10 = jVar3.d();
                jVar3.p(new androidx.core.app.h(d10, 14), new com.facebook.appevents.m(12));
                try {
                    long a12 = ((q7.b) aVar).a() + j15;
                    o7.j jVar6 = (o7.j) iVar6.f22487c;
                    jVar6.getClass();
                    jVar6.j(new av(a12, iVar7));
                    d10.setTransactionSuccessful();
                    return;
                } finally {
                    d10.endTransaction();
                }
            }
        }
    }
}
