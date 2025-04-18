package s2;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.emoji2.text.y;
import eb.l;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.o;
import k.w;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import n9.h0;
import r.k;
import v1.f0;
import v1.n0;
import v8.d0;
import v8.p;
import v8.u;
import v8.z;
import x7.q;
import x7.r;
import z1.j;

/* loaded from: classes.dex */
public final class h implements j.b, d0, r, mh.a {

    /* renamed from: g, reason: collision with root package name */
    public static h f24168g;

    /* renamed from: b, reason: collision with root package name */
    public final Object f24169b;

    /* renamed from: c, reason: collision with root package name */
    public Object f24170c;

    /* renamed from: d, reason: collision with root package name */
    public Object f24171d;

    /* renamed from: f, reason: collision with root package name */
    public Object f24172f;

    public h() {
        l lVar = l.f17288b;
        this.f24170c = new ArrayList();
        this.f24171d = new ArrayList();
        this.f24172f = db.e.Z7;
        this.f24169b = lVar;
    }

    public static synchronized h o(Context context, x2.a aVar) {
        h hVar;
        synchronized (h.class) {
            if (f24168g == null) {
                f24168g = new h(context, aVar);
            }
            hVar = f24168g;
        }
        return hVar;
    }

    @Override // x7.r
    public final void B(int i10, z zVar) {
        if (t(i10, zVar)) {
            ((q) this.f24171d).b();
        }
    }

    @Override // v8.d0
    public final void E(int i10, z zVar, p pVar, u uVar) {
        if (t(i10, zVar)) {
            ((f0.c) this.f24170c).s(pVar, v(uVar));
        }
    }

    @Override // v8.d0
    public final void H(int i10, z zVar, u uVar) {
        if (t(i10, zVar)) {
            ((f0.c) this.f24170c).u(v(uVar));
        }
    }

    @Override // j.b
    public final void a(j.c cVar) {
        ((ActionMode.Callback) this.f24169b).onDestroyActionMode(n(cVar));
    }

    @Override // j.b
    public final boolean b(j.c cVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f24169b).onActionItemClicked(n(cVar), new w((Context) this.f24170c, (i0.b) menuItem));
    }

    @Override // x7.r
    public final void c(int i10, z zVar) {
        if (t(i10, zVar)) {
            ((q) this.f24171d).f();
        }
    }

    @Override // j.b
    public final boolean d(j.c cVar, o oVar) {
        return ((ActionMode.Callback) this.f24169b).onCreateActionMode(n(cVar), p(oVar));
    }

    @Override // v8.d0
    public final void e(int i10, z zVar, p pVar, u uVar) {
        if (t(i10, zVar)) {
            ((f0.c) this.f24170c).o(pVar, v(uVar));
        }
    }

    @Override // x7.r
    public final void f(int i10, z zVar, Exception exc) {
        if (t(i10, zVar)) {
            ((q) this.f24171d).e(exc);
        }
    }

    @Override // j.b
    public final boolean g(j.c cVar, o oVar) {
        return ((ActionMode.Callback) this.f24169b).onPrepareActionMode(n(cVar), p(oVar));
    }

    public final void h(be.b bVar) {
        bVar.a = this;
        ((ArrayDeque) this.f24171d).add(bVar);
        if (((be.b) this.f24172f) == null) {
            be.b bVar2 = (be.b) ((ArrayDeque) this.f24171d).poll();
            this.f24172f = bVar2;
            if (bVar2 != null) {
                bVar2.executeOnExecutor((ThreadPoolExecutor) this.f24170c, new Object[0]);
            }
        }
    }

    public final void i(String str) {
        Object obj = this.f24169b;
        ((f0) obj).assertNotSuspendingTransaction();
        j acquire = ((n0) this.f24171d).acquire();
        if (str == null) {
            acquire.o(1);
        } else {
            acquire.i(1, str);
        }
        ((f0) obj).beginTransaction();
        try {
            acquire.D();
            ((f0) obj).setTransactionSuccessful();
        } finally {
            ((f0) obj).endTransaction();
            ((n0) this.f24171d).release(acquire);
        }
    }

    @Override // x7.r
    public final void j(int i10, z zVar, int i11) {
        if (t(i10, zVar)) {
            ((q) this.f24171d).d(i11);
        }
    }

    public final void k() {
        Object obj = this.f24169b;
        ((f0) obj).assertNotSuspendingTransaction();
        j acquire = ((n0) this.f24172f).acquire();
        ((f0) obj).beginTransaction();
        try {
            acquire.D();
            ((f0) obj).setTransactionSuccessful();
        } finally {
            ((f0) obj).endTransaction();
            ((n0) this.f24172f).release(acquire);
        }
    }

    public final void l(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) ((k) this.f24170c).getOrDefault(obj, null);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    l(arrayList2.get(i10), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    @Override // v8.d0
    public final void m(int i10, z zVar, p pVar, u uVar, IOException iOException, boolean z10) {
        if (t(i10, zVar)) {
            ((f0.c) this.f24170c).q(pVar, v(uVar), iOException, z10);
        }
    }

    public final j.h n(j.c cVar) {
        int size = ((ArrayList) this.f24171d).size();
        for (int i10 = 0; i10 < size; i10++) {
            j.h hVar = (j.h) ((ArrayList) this.f24171d).get(i10);
            if (hVar != null && hVar.f19668b == cVar) {
                return hVar;
            }
        }
        j.h hVar2 = new j.h((Context) this.f24170c, cVar);
        ((ArrayList) this.f24171d).add(hVar2);
        return hVar2;
    }

    public final Menu p(o oVar) {
        Menu menu = (Menu) ((k) this.f24172f).getOrDefault(oVar, null);
        if (menu == null) {
            k.f0 f0Var = new k.f0((Context) this.f24170c, oVar);
            ((k) this.f24172f).put(oVar, f0Var);
            return f0Var;
        }
        return menu;
    }

    @Override // v8.d0
    public final void q(int i10, z zVar, p pVar, u uVar) {
        if (t(i10, zVar)) {
            ((f0.c) this.f24170c).m(pVar, v(uVar));
        }
    }

    public final void r(u2.g gVar) {
        Object obj = this.f24169b;
        f0 f0Var = (f0) obj;
        f0Var.assertNotSuspendingTransaction();
        f0Var.beginTransaction();
        try {
            ((v1.l) this.f24170c).insert(gVar);
            ((f0) obj).setTransactionSuccessful();
        } finally {
            f0Var.endTransaction();
        }
    }

    @Override // x7.r
    public final void s(int i10, z zVar) {
        if (t(i10, zVar)) {
            ((q) this.f24171d).a();
        }
    }

    public final boolean t(int i10, z zVar) {
        z zVar2;
        Object obj = this.f24169b;
        if (zVar != null) {
            zVar2 = ((v8.j) this.f24172f).r(obj, zVar);
            if (zVar2 == null) {
                return false;
            }
        } else {
            zVar2 = null;
        }
        int t5 = ((v8.j) this.f24172f).t(obj, i10);
        f0.c cVar = (f0.c) this.f24170c;
        if (cVar.f17515b != t5 || !h0.a((z) cVar.f17516c, zVar2)) {
            this.f24170c = new f0.c((CopyOnWriteArrayList) ((v8.j) this.f24172f).f26069c.f17517d, t5, zVar2);
        }
        q qVar = (q) this.f24171d;
        if (qVar.a != t5 || !h0.a(qVar.f27496b, zVar2)) {
            this.f24171d = new q(((v8.j) this.f24172f).f26070d.f27497c, t5, zVar2);
            return true;
        }
        return true;
    }

    @Override // x7.r
    public final void u(int i10, z zVar) {
        if (t(i10, zVar)) {
            ((q) this.f24171d).c();
        }
    }

    public final u v(u uVar) {
        v8.j jVar = (v8.j) this.f24172f;
        long j3 = uVar.f26294f;
        Object obj = this.f24169b;
        long s5 = jVar.s(obj, j3);
        v8.j jVar2 = (v8.j) this.f24172f;
        long j10 = uVar.f26295g;
        long s10 = jVar2.s(obj, j10);
        if (s5 == uVar.f26294f && s10 == j10) {
            return uVar;
        }
        return new u(uVar.a, uVar.f26290b, uVar.f26291c, uVar.f26292d, uVar.f26293e, s5, s10);
    }

    public final Bundle w() {
        Bundle bundle = new Bundle();
        Object obj = this.f24169b;
        if (((Integer) obj) != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", ((Integer) obj).intValue());
        }
        Object obj2 = this.f24170c;
        if (((Integer) obj2) != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", ((Integer) obj2).intValue());
        }
        Object obj3 = this.f24171d;
        if (((Integer) obj3) != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", ((Integer) obj3).intValue());
        }
        Object obj4 = this.f24172f;
        if (((Integer) obj4) != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", ((Integer) obj4).intValue());
        }
        return bundle;
    }

    @Override // v8.d0
    public final void z(int i10, z zVar, u uVar) {
        if (t(i10, zVar)) {
            ((f0.c) this.f24170c).e(v(uVar));
        }
    }

    public /* synthetic */ h(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f24169b = num;
        this.f24170c = num2;
        this.f24171d = num3;
        this.f24172f = num4;
    }

    public h(f0 f0Var) {
        this.f24169b = f0Var;
        this.f24170c = new u2.b(this, f0Var, 4);
        this.f24171d = new u2.h(this, f0Var, 0);
        this.f24172f = new u2.h(this, f0Var, 1);
    }

    public h(int i10) {
        if (i10 != 6) {
            if (i10 != 11) {
                this.f24169b = new t.e(10, 1);
                this.f24170c = new k();
                this.f24171d = new ArrayList();
                this.f24172f = new HashSet();
                return;
            }
            this.f24171d = new ArrayDeque();
            this.f24172f = null;
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            this.f24169b = linkedBlockingQueue;
            this.f24170c = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
        }
    }

    public h(mc.d dVar, qa.a aVar, ScheduledExecutorService scheduledExecutorService) {
        this.f24172f = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f24169b = dVar;
        this.f24170c = aVar;
        this.f24171d = scheduledExecutorService;
    }

    public h(Context context, x2.a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f24169b = new a(applicationContext, aVar);
        this.f24170c = new b(applicationContext, aVar);
        this.f24171d = new f(applicationContext, aVar);
        this.f24172f = new g(applicationContext, aVar);
    }

    public h(Typeface typeface, d1.b bVar) {
        int i10;
        int i11;
        this.f24172f = typeface;
        this.f24169b = bVar;
        this.f24171d = new y(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        int a = bVar.a(6);
        if (a != 0) {
            int i12 = a + bVar.a;
            i10 = ((ByteBuffer) bVar.f16791d).getInt(((ByteBuffer) bVar.f16791d).getInt(i12) + i12);
        } else {
            i10 = 0;
        }
        this.f24170c = new char[i10 * 2];
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i13 = a10 + bVar.a;
            i11 = ((ByteBuffer) bVar.f16791d).getInt(((ByteBuffer) bVar.f16791d).getInt(i13) + i13);
        } else {
            i11 = 0;
        }
        for (int i14 = 0; i14 < i11; i14++) {
            androidx.emoji2.text.r rVar = new androidx.emoji2.text.r(i14, this);
            d1.a c10 = rVar.c();
            int a11 = c10.a(4);
            Character.toChars(a11 != 0 ? ((ByteBuffer) c10.f16791d).getInt(a11 + c10.a) : 0, (char[]) this.f24170c, i14 * 2);
            com.bumptech.glide.e.i(rVar.b() > 0, "invalid metadata codepoint length");
            ((y) this.f24171d).a(rVar, 0, rVar.b() - 1);
        }
    }

    public h(Context context, ActionMode.Callback callback) {
        this.f24170c = context;
        this.f24169b = callback;
        this.f24171d = new ArrayList();
        this.f24172f = new k();
    }

    public h(v8.j jVar, Object obj) {
        this.f24172f = jVar;
        this.f24170c = new f0.c((CopyOnWriteArrayList) jVar.f26069c.f17517d, 0, (z) null);
        this.f24171d = new q(jVar.f26070d.f27497c, 0, null);
        this.f24169b = obj;
    }

    public h(p000if.f fVar, p000if.c cVar) {
        this.f24169b = fVar;
        this.f24170c = cVar;
    }
}
