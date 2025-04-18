package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import cb.a;
import cb.b;
import cb.c;
import cb.d;
import com.facebook.appevents.m;
import com.google.firebase.components.ComponentRegistrar;
import db.f;
import db.n;
import db.s;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import s7.h1;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes3.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final n a = new n(new f(2));

    /* renamed from: b, reason: collision with root package name */
    public static final n f12066b = new n(new f(3));

    /* renamed from: c, reason: collision with root package name */
    public static final n f12067c = new n(new f(4));

    /* renamed from: d, reason: collision with root package name */
    public static final n f12068d = new n(new f(5));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        h1 h1Var = new h1(new s(a.class, ScheduledExecutorService.class), new s[]{new s(a.class, ExecutorService.class), new s(a.class, Executor.class)});
        h1Var.f24390f = new m(1);
        h1 h1Var2 = new h1(new s(b.class, ScheduledExecutorService.class), new s[]{new s(b.class, ExecutorService.class), new s(b.class, Executor.class)});
        h1Var2.f24390f = new m(2);
        h1 h1Var3 = new h1(new s(c.class, ScheduledExecutorService.class), new s[]{new s(c.class, ExecutorService.class), new s(c.class, Executor.class)});
        h1Var3.f24390f = new m(3);
        h1 a10 = db.a.a(new s(d.class, Executor.class));
        a10.f24390f = new m(4);
        return Arrays.asList(h1Var.b(), h1Var2.b(), h1Var3.b(), a10.b());
    }
}
