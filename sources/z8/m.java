package z8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n9.h0;
import s7.r0;
import v8.u0;

/* loaded from: classes3.dex */
public abstract class m {

    /* renamed from: b, reason: collision with root package name */
    public final r0 f28635b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.common.collect.r0 f28636c;

    /* renamed from: d, reason: collision with root package name */
    public final long f28637d;

    /* renamed from: f, reason: collision with root package name */
    public final List f28638f;

    /* renamed from: g, reason: collision with root package name */
    public final List f28639g;

    /* renamed from: h, reason: collision with root package name */
    public final List f28640h;

    /* renamed from: i, reason: collision with root package name */
    public final j f28641i;

    public m(r0 r0Var, com.google.common.collect.r0 r0Var2, s sVar, ArrayList arrayList, List list, List list2) {
        u0.d(!r0Var2.isEmpty());
        this.f28635b = r0Var;
        this.f28636c = com.google.common.collect.r0.i(r0Var2);
        this.f28638f = Collections.unmodifiableList(arrayList);
        this.f28639g = list;
        this.f28640h = list2;
        this.f28641i = sVar.a(this);
        this.f28637d = h0.M(sVar.f28656c, 1000000L, sVar.f28655b);
    }

    public abstract String a();

    public abstract y8.i b();

    public abstract j c();
}
