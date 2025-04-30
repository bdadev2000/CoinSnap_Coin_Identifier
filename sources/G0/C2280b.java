package g0;

import F7.l;
import G7.j;
import Q7.InterfaceC0253v;
import android.content.Context;
import androidx.fragment.app.C0477n;
import e0.C2203d;
import e0.G;
import h0.C2314d;
import h0.C2315e;
import java.util.List;

/* renamed from: g0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2280b {

    /* renamed from: a, reason: collision with root package name */
    public final String f20413a;
    public final com.bumptech.glide.f b;

    /* renamed from: c, reason: collision with root package name */
    public final l f20414c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0253v f20415d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f20416e;

    /* renamed from: f, reason: collision with root package name */
    public volatile C2314d f20417f;

    public C2280b(String str, com.bumptech.glide.f fVar, l lVar, InterfaceC0253v interfaceC0253v) {
        j.e(str, "name");
        this.f20413a = str;
        this.b = fVar;
        this.f20414c = lVar;
        this.f20415d = interfaceC0253v;
        this.f20416e = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(M7.c cVar, Object obj) {
        C2314d c2314d;
        Context context = (Context) obj;
        j.e(context, "thisRef");
        j.e(cVar, "property");
        C2314d c2314d2 = this.f20417f;
        if (c2314d2 == null) {
            synchronized (this.f20416e) {
                try {
                    if (this.f20417f == null) {
                        Context applicationContext = context.getApplicationContext();
                        com.bumptech.glide.f fVar = this.b;
                        l lVar = this.f20414c;
                        j.d(applicationContext, "applicationContext");
                        List list = (List) lVar.invoke(applicationContext);
                        InterfaceC0253v interfaceC0253v = this.f20415d;
                        C0477n c0477n = new C0477n(3, applicationContext, this);
                        j.e(list, "migrations");
                        j.e(interfaceC0253v, "scope");
                        C2315e c2315e = new C2315e(c0477n, 0);
                        com.bumptech.glide.f fVar2 = fVar;
                        if (fVar == null) {
                            fVar2 = new Object();
                        }
                        this.f20417f = new C2314d(new G(c2315e, android.support.v4.media.session.a.w(new C2203d(list, null)), fVar2, interfaceC0253v));
                    }
                    c2314d = this.f20417f;
                    j.b(c2314d);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c2314d;
        }
        return c2314d2;
    }
}
