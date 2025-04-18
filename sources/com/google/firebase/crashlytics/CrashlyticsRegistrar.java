package com.google.firebase.crashlytics;

import android.util.Log;
import androidx.core.app.h;
import cb.a;
import cb.b;
import com.google.firebase.components.ComponentRegistrar;
import db.j;
import db.s;
import dc.e;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.MutexKt;
import rc.c;
import rc.d;
import s7.h1;
import va.g;

/* loaded from: classes3.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f12069c = 0;
    public final s a = new s(a.class, ExecutorService.class);

    /* renamed from: b, reason: collision with root package name */
    public final s f12070b = new s(b.class, ExecutorService.class);

    static {
        d subscriberName = d.CRASHLYTICS;
        c cVar = c.a;
        Intrinsics.checkNotNullParameter(subscriberName, "subscriberName");
        Map dependencies = c.f24084b;
        if (dependencies.containsKey(subscriberName)) {
            Log.d("SessionsDependencies", "Dependency " + subscriberName + " already added.");
            return;
        }
        Intrinsics.checkNotNullExpressionValue(dependencies, "dependencies");
        dependencies.put(subscriberName, new rc.a(MutexKt.Mutex(true)));
        Log.d("SessionsDependencies", "Dependency to " + subscriberName + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        h1 b3 = db.a.b(fb.c.class);
        b3.a = "fire-cls";
        b3.a(j.b(g.class));
        b3.a(j.b(e.class));
        b3.a(j.a(this.a));
        b3.a(j.a(this.f12070b));
        b3.a(new j(gb.a.class, 0, 2));
        b3.a(new j(za.b.class, 0, 2));
        b3.a(new j(oc.a.class, 0, 2));
        b3.f24390f = new h(this, 2);
        b3.g(2);
        return Arrays.asList(b3.b(), com.facebook.appevents.g.d("fire-cls", "19.2.1"));
    }
}
