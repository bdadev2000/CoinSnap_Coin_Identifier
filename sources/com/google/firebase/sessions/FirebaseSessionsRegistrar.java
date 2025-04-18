package com.google.firebase.sessions;

import android.content.Context;
import androidx.annotation.Keep;
import cb.a;
import cb.b;
import cc.c;
import com.facebook.appevents.m;
import com.google.firebase.components.ComponentRegistrar;
import db.j;
import db.s;
import dc.e;
import f7.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import qc.g0;
import qc.k;
import qc.k0;
import qc.n0;
import qc.o;
import qc.p0;
import qc.q;
import qc.w;
import qc.w0;
import qc.x0;
import s7.h1;
import sc.l;
import va.g;

@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0007\u0010\bJ6\u0010\u0006\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00030\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "", "Ldb/a;", "", "kotlin.jvm.PlatformType", "getComponents", "<init>", "()V", "Companion", "qc/q", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final q Companion = new q();
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final s backgroundDispatcher;
    private static final s blockingDispatcher;
    private static final s firebaseApp;
    private static final s firebaseInstallationsApi;
    private static final s sessionLifecycleServiceBinder;
    private static final s sessionsSettings;
    private static final s transportFactory;

    static {
        s a = s.a(g.class);
        Intrinsics.checkNotNullExpressionValue(a, "unqualified(FirebaseApp::class.java)");
        firebaseApp = a;
        s a10 = s.a(e.class);
        Intrinsics.checkNotNullExpressionValue(a10, "unqualified(FirebaseInstallationsApi::class.java)");
        firebaseInstallationsApi = a10;
        s sVar = new s(a.class, CoroutineDispatcher.class);
        Intrinsics.checkNotNullExpressionValue(sVar, "qualified(Background::cl…neDispatcher::class.java)");
        backgroundDispatcher = sVar;
        s sVar2 = new s(b.class, CoroutineDispatcher.class);
        Intrinsics.checkNotNullExpressionValue(sVar2, "qualified(Blocking::clas…neDispatcher::class.java)");
        blockingDispatcher = sVar2;
        s a11 = s.a(f.class);
        Intrinsics.checkNotNullExpressionValue(a11, "unqualified(TransportFactory::class.java)");
        transportFactory = a11;
        s a12 = s.a(l.class);
        Intrinsics.checkNotNullExpressionValue(a12, "unqualified(SessionsSettings::class.java)");
        sessionsSettings = a12;
        s a13 = s.a(w0.class);
        Intrinsics.checkNotNullExpressionValue(a13, "unqualified(SessionLifec…erviceBinder::class.java)");
        sessionLifecycleServiceBinder = a13;
    }

    public static final o getComponents$lambda$0(db.b bVar) {
        Object e2 = bVar.e(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(e2, "container[firebaseApp]");
        Object e10 = bVar.e(sessionsSettings);
        Intrinsics.checkNotNullExpressionValue(e10, "container[sessionsSettings]");
        Object e11 = bVar.e(backgroundDispatcher);
        Intrinsics.checkNotNullExpressionValue(e11, "container[backgroundDispatcher]");
        Object e12 = bVar.e(sessionLifecycleServiceBinder);
        Intrinsics.checkNotNullExpressionValue(e12, "container[sessionLifecycleServiceBinder]");
        return new o((g) e2, (l) e10, (CoroutineContext) e11, (w0) e12);
    }

    public static final p0 getComponents$lambda$1(db.b bVar) {
        return new p0();
    }

    public static final k0 getComponents$lambda$2(db.b bVar) {
        Object e2 = bVar.e(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(e2, "container[firebaseApp]");
        g gVar = (g) e2;
        Object e10 = bVar.e(firebaseInstallationsApi);
        Intrinsics.checkNotNullExpressionValue(e10, "container[firebaseInstallationsApi]");
        e eVar = (e) e10;
        Object e11 = bVar.e(sessionsSettings);
        Intrinsics.checkNotNullExpressionValue(e11, "container[sessionsSettings]");
        l lVar = (l) e11;
        c a = bVar.a(transportFactory);
        Intrinsics.checkNotNullExpressionValue(a, "container.getProvider(transportFactory)");
        k kVar = new k(a);
        Object e12 = bVar.e(backgroundDispatcher);
        Intrinsics.checkNotNullExpressionValue(e12, "container[backgroundDispatcher]");
        return new n0(gVar, eVar, lVar, kVar, (CoroutineContext) e12);
    }

    public static final l getComponents$lambda$3(db.b bVar) {
        Object e2 = bVar.e(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(e2, "container[firebaseApp]");
        Object e10 = bVar.e(blockingDispatcher);
        Intrinsics.checkNotNullExpressionValue(e10, "container[blockingDispatcher]");
        Object e11 = bVar.e(backgroundDispatcher);
        Intrinsics.checkNotNullExpressionValue(e11, "container[backgroundDispatcher]");
        Object e12 = bVar.e(firebaseInstallationsApi);
        Intrinsics.checkNotNullExpressionValue(e12, "container[firebaseInstallationsApi]");
        return new l((g) e2, (CoroutineContext) e10, (CoroutineContext) e11, (e) e12);
    }

    public static final w getComponents$lambda$4(db.b bVar) {
        g gVar = (g) bVar.e(firebaseApp);
        gVar.a();
        Context context = gVar.a;
        Intrinsics.checkNotNullExpressionValue(context, "container[firebaseApp].applicationContext");
        Object e2 = bVar.e(backgroundDispatcher);
        Intrinsics.checkNotNullExpressionValue(e2, "container[backgroundDispatcher]");
        return new g0(context, (CoroutineContext) e2);
    }

    public static final w0 getComponents$lambda$5(db.b bVar) {
        Object e2 = bVar.e(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(e2, "container[firebaseApp]");
        return new x0((g) e2);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<db.a> getComponents() {
        h1 b3 = db.a.b(o.class);
        b3.a = LIBRARY_NAME;
        s sVar = firebaseApp;
        b3.a(j.a(sVar));
        s sVar2 = sessionsSettings;
        b3.a(j.a(sVar2));
        s sVar3 = backgroundDispatcher;
        b3.a(j.a(sVar3));
        b3.a(j.a(sessionLifecycleServiceBinder));
        b3.f24390f = new m(10);
        b3.g(2);
        h1 b10 = db.a.b(p0.class);
        b10.a = "session-generator";
        b10.f24390f = new m(11);
        h1 b11 = db.a.b(k0.class);
        b11.a = "session-publisher";
        b11.a(new j(sVar, 1, 0));
        s sVar4 = firebaseInstallationsApi;
        b11.a(j.a(sVar4));
        b11.a(new j(sVar2, 1, 0));
        b11.a(new j(transportFactory, 1, 1));
        b11.a(new j(sVar3, 1, 0));
        b11.f24390f = new m(12);
        h1 b12 = db.a.b(l.class);
        b12.a = "sessions-settings";
        b12.a(new j(sVar, 1, 0));
        b12.a(j.a(blockingDispatcher));
        b12.a(new j(sVar3, 1, 0));
        b12.a(new j(sVar4, 1, 0));
        b12.f24390f = new m(13);
        h1 b13 = db.a.b(w.class);
        b13.a = "sessions-datastore";
        b13.a(new j(sVar, 1, 0));
        b13.a(new j(sVar3, 1, 0));
        b13.f24390f = new m(14);
        h1 b14 = db.a.b(w0.class);
        b14.a = "sessions-service-binder";
        b14.a(new j(sVar, 1, 0));
        b14.f24390f = new m(15);
        return CollectionsKt.listOf((Object[]) new db.a[]{b3.b(), b10.b(), b11.b(), b12.b(), b13.b(), b14.b(), com.facebook.appevents.g.d(LIBRARY_NAME, "2.0.6")});
    }
}
