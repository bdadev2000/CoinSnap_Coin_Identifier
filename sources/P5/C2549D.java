package p5;

import Q7.AbstractC0255x;
import a.AbstractC0325a;
import android.content.Context;
import e0.InterfaceC2208i;
import g0.C2280b;
import java.util.concurrent.atomic.AtomicReference;
import y7.AbstractC2960i;

/* renamed from: p5.D, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2549D implements InterfaceC2569u {

    /* renamed from: e, reason: collision with root package name */
    public static final x f22253e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static final C2280b f22254f = AbstractC0325a.m(AbstractC2568t.f22364a, new com.bumptech.glide.f(C2571w.b, 4));

    /* renamed from: a, reason: collision with root package name */
    public final Context f22255a;
    public final w7.k b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f22256c;

    /* renamed from: d, reason: collision with root package name */
    public final k8.c f22257d;

    public C2549D(Context context, w7.k kVar) {
        G7.j.e(context, "context");
        this.f22255a = context;
        this.b = kVar;
        this.f22256c = new AtomicReference();
        f22253e.getClass();
        int i9 = 12;
        this.f22257d = new k8.c(new a7.b(i9, ((InterfaceC2208i) f22254f.a(x.f22367a[0], context)).getData(), new AbstractC2960i(3, null)), this);
        AbstractC0255x.l(AbstractC0255x.a(kVar), null, null, new C2570v(this, null), 3);
    }
}
