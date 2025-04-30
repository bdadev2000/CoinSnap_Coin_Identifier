package com.google.firebase.concurrent;

import U4.m;
import android.annotation.SuppressLint;
import com.applovin.impl.sdk.ad.g;
import com.bumptech.glide.d;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import n4.InterfaceC2477a;
import n4.InterfaceC2478b;
import n4.c;
import o4.C2495a;
import o4.C2496b;
import o4.l;
import o4.q;
import p4.i;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes2.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final l f14323a = new l(new m(7));
    public static final l b = new l(new m(8));

    /* renamed from: c, reason: collision with root package name */
    public static final l f14324c = new l(new m(9));

    /* renamed from: d, reason: collision with root package name */
    public static final l f14325d = new l(new m(10));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        q qVar = new q(InterfaceC2477a.class, ScheduledExecutorService.class);
        q[] qVarArr = {new q(InterfaceC2477a.class, ExecutorService.class), new q(InterfaceC2477a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(qVar);
        for (q qVar2 : qVarArr) {
            d.H(qVar2, "Null interface");
        }
        Collections.addAll(hashSet, qVarArr);
        C2496b c2496b = new C2496b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new g(29), hashSet3);
        q qVar3 = new q(InterfaceC2478b.class, ScheduledExecutorService.class);
        q[] qVarArr2 = {new q(InterfaceC2478b.class, ExecutorService.class), new q(InterfaceC2478b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(qVar3);
        for (q qVar4 : qVarArr2) {
            d.H(qVar4, "Null interface");
        }
        Collections.addAll(hashSet4, qVarArr2);
        C2496b c2496b2 = new C2496b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new i(0), hashSet6);
        q qVar5 = new q(c.class, ScheduledExecutorService.class);
        q[] qVarArr3 = {new q(c.class, ExecutorService.class), new q(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(qVar5);
        for (q qVar6 : qVarArr3) {
            d.H(qVar6, "Null interface");
        }
        Collections.addAll(hashSet7, qVarArr3);
        C2496b c2496b3 = new C2496b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new i(1), hashSet9);
        C2495a b8 = C2496b.b(new q(n4.d.class, Executor.class));
        b8.f21942f = new i(2);
        return Arrays.asList(c2496b, c2496b2, c2496b3, b8.b());
    }
}
