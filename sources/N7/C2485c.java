package n7;

import F7.l;
import G7.j;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.V;
import androidx.lifecycle.b0;
import androidx.lifecycle.d0;
import d4.J;
import java.io.Closeable;
import k.C2426o;
import o7.C2515d;
import o7.InterfaceC2514c;
import r0.C2655c;
import s0.C2691b;
import s6.g;
import s7.InterfaceC2701a;
import z2.i;

/* renamed from: n7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2485c implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21854a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C2485c(Object obj, int i9) {
        this.f21854a = i9;
        this.b = obj;
    }

    @Override // androidx.lifecycle.d0
    public final b0 b(Class cls, C2655c c2655c) {
        b0 b0Var;
        Application application;
        switch (this.f21854a) {
            case 0:
                final C2488f c2488f = new C2488f();
                k8.c cVar = (k8.c) this.b;
                V.c(c2655c);
                cVar.getClass();
                cVar.getClass();
                cVar.getClass();
                g gVar = new g((s6.f) cVar.b, (s6.d) cVar.f21500c);
                g gVar2 = (g) ((InterfaceC2486d) com.facebook.appevents.g.l(gVar, InterfaceC2486d.class));
                gVar2.getClass();
                s6.e eVar = gVar2.f22982a;
                s6.e eVar2 = gVar2.b;
                s6.e eVar3 = gVar2.f22983c;
                s6.e eVar4 = gVar2.f22984d;
                i.b("z6.i", eVar);
                i.b("I6.i", eVar2);
                i.b("N6.j", eVar3);
                i.b("W6.f", eVar4);
                InterfaceC2701a interfaceC2701a = (InterfaceC2701a) J.b(4, new Object[]{"z6.i", eVar, "I6.i", eVar2, "N6.j", eVar3, "W6.f", eVar4}, null).get(cls.getName());
                l lVar = (l) c2655c.f22812a.get(C2487e.f21855d);
                ((InterfaceC2486d) com.facebook.appevents.g.l(gVar, InterfaceC2486d.class)).getClass();
                Object obj = J.f19838i.get(cls);
                if (obj == null) {
                    if (lVar == null) {
                        if (interfaceC2701a != null) {
                            b0Var = (b0) interfaceC2701a.get();
                        } else {
                            throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
                        }
                    } else {
                        throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                    }
                } else if (interfaceC2701a == null) {
                    if (lVar != null) {
                        b0Var = (b0) lVar.invoke(obj);
                    } else {
                        throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
                    }
                } else {
                    throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
                }
                Closeable closeable = new Closeable() { // from class: n7.b
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        C2488f.this.a();
                    }
                };
                b0Var.getClass();
                C2691b c2691b = b0Var.f4882a;
                if (c2691b != null) {
                    if (c2691b.f22964d) {
                        C2691b.a(closeable);
                    } else {
                        synchronized (c2691b.f22962a) {
                            c2691b.f22963c.add(closeable);
                        }
                    }
                }
                return b0Var;
            default:
                C2426o c2426o = new C2426o(2);
                c2426o.f21320c = c2655c;
                Context context = (Context) this.b;
                j.e(context, "context");
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                } else {
                    Context context2 = applicationContext;
                    while (context2 instanceof ContextWrapper) {
                        context2 = ((ContextWrapper) context2).getBaseContext();
                        if (context2 instanceof Application) {
                            application = (Application) context2;
                        }
                    }
                    throw new IllegalStateException("Could not find an Application in the given context: " + applicationContext);
                }
                return new C2515d(new s6.d(((s6.f) ((InterfaceC2514c) com.facebook.appevents.g.l(application, InterfaceC2514c.class))).b), c2426o);
        }
    }
}
