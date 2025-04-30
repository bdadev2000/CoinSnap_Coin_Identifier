package T1;

import U4.RunnableC0311g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.text.TextUtils;
import j0.ThreadFactoryC2380a;
import java.io.InputStream;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l3.C2440e;
import l3.C2442g;
import m3.C2465a;
import s7.InterfaceC2701a;

/* renamed from: T1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0300f implements v, i, H0.c, j2.h, j0.i {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public Context f2970c;

    public /* synthetic */ C0300f() {
        this.b = 6;
    }

    @Override // T1.i
    public Class a() {
        return Drawable.class;
    }

    @Override // j0.i
    public void b(z2.i iVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC2380a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC0311g(this, iVar, threadPoolExecutor, 19));
    }

    @Override // T1.i
    public Object c(Resources resources, int i9, Resources.Theme theme) {
        Context context = this.f2970c;
        return com.facebook.appevents.i.g(context, context, i9, theme);
    }

    @Override // H0.c
    public H0.d d(H0.b bVar) {
        D0.l lVar = (D0.l) bVar.f1347e;
        if (lVar != null) {
            Context context = this.f2970c;
            if (context != null) {
                String str = (String) bVar.f1346d;
                if (!TextUtils.isEmpty(str)) {
                    H0.b bVar2 = new H0.b(context, str, lVar, true);
                    return new I0.e((Context) bVar2.f1345c, (String) bVar2.f1346d, (D0.l) bVar2.f1347e, bVar2.b);
                }
                throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
            }
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        throw new IllegalArgumentException("Must set a callback to create the configuration.");
    }

    @Override // T1.i
    public /* bridge */ /* synthetic */ void e(Object obj) {
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [k3.k, java.lang.Object] */
    public k3.k f() {
        Context context = this.f2970c;
        if (context != null) {
            ?? obj = new Object();
            obj.b = C2465a.a(k3.n.f21441a);
            p3.c cVar = new p3.c(context, 2);
            obj.f21435c = cVar;
            obj.f21436d = C2465a.a(new C2442g(cVar, new C2440e(cVar, 0)));
            p3.c cVar2 = obj.f21435c;
            obj.f21437f = new C2440e(cVar2, 1);
            InterfaceC2701a a6 = C2465a.a(new k3.t(obj.f21437f, C2465a.a(new p3.c(cVar2, 1))));
            obj.f21438g = a6;
            p3.c cVar3 = new p3.c();
            p3.c cVar4 = obj.f21435c;
            p3.d dVar = new p3.d(cVar4, a6, cVar3);
            InterfaceC2701a interfaceC2701a = obj.b;
            InterfaceC2701a interfaceC2701a2 = obj.f21436d;
            obj.f21439h = C2465a.a(new k3.t(new k3.t(interfaceC2701a, interfaceC2701a2, dVar, a6, a6), new q3.i(cVar4, interfaceC2701a2, a6, dVar, interfaceC2701a, a6, a6), new p3.d(interfaceC2701a, a6, dVar, a6)));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }

    @Override // j2.h
    public Object get() {
        return (ConnectivityManager) this.f2970c.getSystemService("connectivity");
    }

    @Override // T1.v
    public u i(A a6) {
        switch (this.b) {
            case 0:
                return new C0296b(this.f2970c, this);
            case 1:
                return new C0296b(this.f2970c, a6.b(Integer.class, InputStream.class));
            default:
                return new q(this.f2970c, 1);
        }
    }

    public /* synthetic */ C0300f(Context context, int i9) {
        this.b = i9;
        this.f2970c = context;
    }

    public C0300f(Context context) {
        this.b = 5;
        this.f2970c = context.getApplicationContext();
    }
}
