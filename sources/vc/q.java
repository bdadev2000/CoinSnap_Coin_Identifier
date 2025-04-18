package vc;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class q {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f26460b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26461c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f26462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Method f26463e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.google.gson.c0 f26464f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.google.gson.c0 f26465g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f26466h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f26467i;

    public q(String str, Field field, boolean z10, Method method, com.google.gson.c0 c0Var, com.google.gson.c0 c0Var2, boolean z11, boolean z12) {
        this.f26462d = z10;
        this.f26463e = method;
        this.f26464f = c0Var;
        this.f26465g = c0Var2;
        this.f26466h = z11;
        this.f26467i = z12;
        this.a = str;
        this.f26460b = field;
        this.f26461c = field.getName();
    }

    public final void a(zc.b bVar, Object obj) {
        Object obj2;
        boolean z10 = this.f26462d;
        Field field = this.f26460b;
        Method method = this.f26463e;
        if (z10) {
            if (method == null) {
                v.b(obj, field);
            } else {
                v.b(obj, method);
            }
        }
        if (method != null) {
            try {
                obj2 = method.invoke(obj, new Object[0]);
            } catch (InvocationTargetException e2) {
                throw new com.google.gson.q(com.applovin.impl.mediation.ads.e.f("Accessor ", xc.c.d(method, false), " threw exception"), e2.getCause());
            }
        } else {
            obj2 = field.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        bVar.r(this.a);
        this.f26464f.c(bVar, obj2);
    }
}
