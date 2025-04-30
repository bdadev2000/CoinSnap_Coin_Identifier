package k5;

import U4.m;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.mbridge.msdk.foundation.entity.o;
import com.vungle.ads.internal.a0;
import g4.C2296f;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import k4.C2434c;
import k4.InterfaceC2433b;
import l5.C2451c;
import l5.n;
import n5.InterfaceC2479a;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class k implements InterfaceC2479a {

    /* renamed from: j, reason: collision with root package name */
    public static final Clock f21486j = DefaultClock.getInstance();

    /* renamed from: k, reason: collision with root package name */
    public static final Random f21487k = new Random();
    public static final HashMap l = new HashMap();
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f21489c;

    /* renamed from: d, reason: collision with root package name */
    public final C2296f f21490d;

    /* renamed from: e, reason: collision with root package name */
    public final O4.e f21491e;

    /* renamed from: f, reason: collision with root package name */
    public final h4.c f21492f;

    /* renamed from: g, reason: collision with root package name */
    public final N4.b f21493g;

    /* renamed from: h, reason: collision with root package name */
    public final String f21494h;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f21488a = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f21495i = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.google.android.gms.common.api.internal.BackgroundDetector$BackgroundStateChangeListener, java.lang.Object] */
    public k(Context context, ScheduledExecutorService scheduledExecutorService, C2296f c2296f, O4.e eVar, h4.c cVar, N4.b bVar) {
        this.b = context;
        this.f21489c = scheduledExecutorService;
        this.f21490d = c2296f;
        this.f21491e = eVar;
        this.f21492f = cVar;
        this.f21493g = bVar;
        c2296f.a();
        this.f21494h = c2296f.f20434c.b;
        AtomicReference atomicReference = j.f21485a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = j.f21485a;
        if (atomicReference2.get() == null) {
            ?? obj = new Object();
            while (true) {
                if (atomicReference2.compareAndSet(null, obj)) {
                    BackgroundDetector.initialize(application);
                    BackgroundDetector.getInstance().addListener(obj);
                    break;
                } else if (atomicReference2.get() != null) {
                    break;
                }
            }
        }
        Tasks.call(scheduledExecutorService, new a0(this, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [l5.k, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized k5.b a(g4.C2296f r18, java.lang.String r19, O4.e r20, h4.c r21, java.util.concurrent.Executor r22, l5.C2451c r23, l5.C2451c r24, l5.C2451c r25, l5.g r26, l5.h r27, l5.j r28, b1.h r29) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            monitor-enter(r17)
            java.util.HashMap r2 = r1.f21488a     // Catch: java.lang.Throwable -> L8d
            boolean r2 = r2.containsKey(r0)     // Catch: java.lang.Throwable -> L8d
            if (r2 != 0) goto L92
            k5.b r15 = new k5.b     // Catch: java.lang.Throwable -> L8d
            android.content.Context r12 = r1.b     // Catch: java.lang.Throwable -> L8d
            java.lang.String r2 = "firebase"
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Throwable -> L8d
            if (r2 == 0) goto L2b
            r18.a()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r2 = "[DEFAULT]"
            r3 = r18
            java.lang.String r4 = r3.b     // Catch: java.lang.Throwable -> L8d
            boolean r2 = r4.equals(r2)     // Catch: java.lang.Throwable -> L8d
            if (r2 == 0) goto L2d
            r13 = r21
            goto L2f
        L2b:
            r3 = r18
        L2d:
            r2 = 0
            r13 = r2
        L2f:
            android.content.Context r14 = r1.b     // Catch: java.lang.Throwable -> L8d
            monitor-enter(r17)     // Catch: java.lang.Throwable -> L8d
            l5.k r11 = new l5.k     // Catch: java.lang.Throwable -> L8f
            java.util.concurrent.ScheduledExecutorService r10 = r1.f21489c     // Catch: java.lang.Throwable -> L8f
            r11.<init>()     // Catch: java.lang.Throwable -> L8f
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L8f
            r9.<init>()     // Catch: java.lang.Throwable -> L8f
            r11.b = r9     // Catch: java.lang.Throwable -> L8f
            l5.m r8 = new l5.m     // Catch: java.lang.Throwable -> L8f
            r2 = r8
            r3 = r18
            r4 = r20
            r5 = r26
            r6 = r24
            r7 = r14
            r0 = r8
            r8 = r19
            r16 = r10
            r10 = r28
            r21 = r13
            r13 = r11
            r11 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L8f
            r13.f21620c = r0     // Catch: java.lang.Throwable -> L8f
            r13.f21619a = r14     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L8d
            r3 = r15
            r4 = r12
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r14 = r29
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L8d
            r24.b()     // Catch: java.lang.Throwable -> L8d
            r25.b()     // Catch: java.lang.Throwable -> L8d
            r23.b()     // Catch: java.lang.Throwable -> L8d
            java.util.HashMap r0 = r1.f21488a     // Catch: java.lang.Throwable -> L8d
            r2 = r19
            r0.put(r2, r15)     // Catch: java.lang.Throwable -> L8d
            java.util.HashMap r0 = k5.k.l     // Catch: java.lang.Throwable -> L8d
            r0.put(r2, r15)     // Catch: java.lang.Throwable -> L8d
            goto L93
        L8d:
            r0 = move-exception
            goto L9d
        L8f:
            r0 = move-exception
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L8d
            throw r0     // Catch: java.lang.Throwable -> L8d
        L92:
            r2 = r0
        L93:
            java.util.HashMap r0 = r1.f21488a     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L8d
            k5.b r0 = (k5.b) r0     // Catch: java.lang.Throwable -> L8d
            monitor-exit(r17)
            return r0
        L9d:
            monitor-exit(r17)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.k.a(g4.f, java.lang.String, O4.e, h4.c, java.util.concurrent.Executor, l5.c, l5.c, l5.c, l5.g, l5.h, l5.j, b1.h):k5.b");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [k8.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [b1.h, java.lang.Object] */
    public final synchronized b b(String str) {
        C2451c c9;
        C2451c c10;
        C2451c c11;
        l5.j jVar;
        l5.h hVar;
        final a7.b bVar;
        ?? obj;
        ScheduledExecutorService scheduledExecutorService;
        try {
            c9 = c(str, "fetch");
            c10 = c(str, "activate");
            c11 = c(str, "defaults");
            jVar = new l5.j(this.b.getSharedPreferences("frc_" + this.f21494h + "_" + str + "_settings", 0));
            hVar = new l5.h(this.f21489c, c10, c11);
            C2296f c2296f = this.f21490d;
            N4.b bVar2 = this.f21493g;
            c2296f.a();
            if (c2296f.b.equals("[DEFAULT]") && str.equals("firebase")) {
                bVar = new a7.b(bVar2);
            } else {
                bVar = null;
            }
            if (bVar != null) {
                BiConsumer biConsumer = new BiConsumer() { // from class: k5.i
                    @Override // com.google.android.gms.common.util.BiConsumer
                    public final void accept(Object obj2, Object obj3) {
                        JSONObject optJSONObject;
                        a7.b bVar3 = a7.b.this;
                        String str2 = (String) obj2;
                        l5.d dVar = (l5.d) obj3;
                        InterfaceC2433b interfaceC2433b = (InterfaceC2433b) ((N4.b) bVar3.f4077c).get();
                        if (interfaceC2433b != null) {
                            JSONObject jSONObject = dVar.f21589e;
                            if (jSONObject.length() >= 1) {
                                JSONObject jSONObject2 = dVar.b;
                                if (jSONObject2.length() >= 1 && (optJSONObject = jSONObject.optJSONObject(str2)) != null) {
                                    String optString = optJSONObject.optString("choiceId");
                                    if (!optString.isEmpty()) {
                                        synchronized (((Map) bVar3.f4078d)) {
                                            try {
                                                if (!optString.equals(((Map) bVar3.f4078d).get(str2))) {
                                                    ((Map) bVar3.f4078d).put(str2, optString);
                                                    Bundle bundle = new Bundle();
                                                    bundle.putString("arm_key", str2);
                                                    bundle.putString("arm_value", jSONObject2.optString(str2));
                                                    bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                                                    bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                                                    bundle.putString("group", optJSONObject.optString("group"));
                                                    C2434c c2434c = (C2434c) interfaceC2433b;
                                                    c2434c.a("fp", "personalization_assignment", bundle);
                                                    Bundle bundle2 = new Bundle();
                                                    bundle2.putString("_fpid", optString);
                                                    c2434c.a("fp", "_fpc", bundle2);
                                                }
                                            } finally {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                };
                synchronized (hVar.f21610a) {
                    hVar.f21610a.add(biConsumer);
                }
            }
            ?? obj2 = new Object();
            obj2.b = c10;
            obj2.f21500c = c11;
            obj = new Object();
            obj.f5272f = Collections.newSetFromMap(new ConcurrentHashMap());
            obj.b = c10;
            obj.f5270c = obj2;
            scheduledExecutorService = this.f21489c;
            obj.f5271d = scheduledExecutorService;
        } catch (Throwable th) {
            throw th;
        }
        return a(this.f21490d, str, this.f21491e, this.f21492f, scheduledExecutorService, c9, c10, c11, d(str, c9, jVar), hVar, jVar, obj);
    }

    public final C2451c c(String str, String str2) {
        n nVar;
        C2451c c2451c;
        String h6 = AbstractC2914a.h(o.o("frc_", this.f21494h, "_", str, "_"), str2, ".json");
        ScheduledExecutorService scheduledExecutorService = this.f21489c;
        Context context = this.b;
        HashMap hashMap = n.f21636c;
        synchronized (n.class) {
            try {
                HashMap hashMap2 = n.f21636c;
                if (!hashMap2.containsKey(h6)) {
                    hashMap2.put(h6, new n(context, h6));
                }
                nVar = (n) hashMap2.get(h6);
            } catch (Throwable th) {
                throw th;
            }
        }
        HashMap hashMap3 = C2451c.f21581d;
        synchronized (C2451c.class) {
            try {
                String str3 = nVar.b;
                HashMap hashMap4 = C2451c.f21581d;
                if (!hashMap4.containsKey(str3)) {
                    hashMap4.put(str3, new C2451c(scheduledExecutorService, nVar));
                }
                c2451c = (C2451c) hashMap4.get(str3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c2451c;
    }

    public final synchronized l5.g d(String str, C2451c c2451c, l5.j jVar) {
        O4.e eVar;
        N4.b mVar;
        N4.b bVar;
        ScheduledExecutorService scheduledExecutorService;
        Random random;
        String str2;
        C2296f c2296f;
        try {
            eVar = this.f21491e;
            C2296f c2296f2 = this.f21490d;
            c2296f2.a();
            if (c2296f2.b.equals("[DEFAULT]")) {
                mVar = this.f21493g;
            } else {
                mVar = new m(4);
            }
            bVar = mVar;
            scheduledExecutorService = this.f21489c;
            random = f21487k;
            C2296f c2296f3 = this.f21490d;
            c2296f3.a();
            str2 = c2296f3.f20434c.f20446a;
            c2296f = this.f21490d;
            c2296f.a();
        } catch (Throwable th) {
            throw th;
        }
        return new l5.g(eVar, bVar, scheduledExecutorService, random, c2451c, new ConfigFetchHttpClient(this.b, c2296f.f20434c.b, str2, str, jVar.f21616a.getLong("fetch_timeout_in_seconds", 60L), jVar.f21616a.getLong("fetch_timeout_in_seconds", 60L)), jVar, this.f21495i);
    }
}
