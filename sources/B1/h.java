package b1;

import G7.j;
import S0.n;
import android.R;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.internal.C1838g;
import g1.InterfaceC2286a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import n1.C2475f;
import p.MenuC2518A;
import p.MenuC2533l;
import p.s;
import s4.InterfaceC2699a;
import x.l;

/* loaded from: classes.dex */
public final class h implements o.a, s4.b, InterfaceC2699a {

    /* renamed from: g, reason: collision with root package name */
    public static h f5269g;
    public Object b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5270c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5271d;

    /* renamed from: f, reason: collision with root package name */
    public Object f5272f;

    public h(int i9) {
        switch (i9) {
            case 6:
                this.f5270c = new ArrayDeque();
                this.f5271d = new ArrayDeque();
                this.f5272f = new ArrayDeque();
                return;
            default:
                this.b = new l();
                this.f5270c = new SparseArray();
                this.f5271d = new x.f();
                this.f5272f = new l();
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [b1.h, java.lang.Object] */
    public static synchronized h j(Context context, InterfaceC2286a interfaceC2286a) {
        h hVar;
        synchronized (h.class) {
            try {
                if (f5269g == null) {
                    ?? obj = new Object();
                    Context applicationContext = context.getApplicationContext();
                    obj.b = new AbstractC0550c(applicationContext, interfaceC2286a);
                    obj.f5270c = new AbstractC0550c(applicationContext, interfaceC2286a);
                    obj.f5271d = new C0553f(applicationContext, interfaceC2286a);
                    obj.f5272f = new AbstractC0550c(applicationContext, interfaceC2286a);
                    f5269g = obj;
                }
                hVar = f5269g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    @Override // o.a
    public boolean a(o.b bVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.b).onActionItemClicked(i(bVar), new s((Context) this.f5270c, (N.a) menuItem));
    }

    public void b(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (arrayDeque.remove(obj)) {
                synchronized (this) {
                }
                l();
            }
            throw new AssertionError("Call wasn't in-flight!");
        }
        l();
    }

    public void c(m8.f fVar) {
        j.e(fVar, NotificationCompat.CATEGORY_CALL);
        fVar.f21779c.decrementAndGet();
        b((ArrayDeque) this.f5271d, fVar);
    }

    @Override // o.a
    public boolean d(o.b bVar, Menu menu) {
        o.f i9 = i(bVar);
        l lVar = (l) this.f5272f;
        Menu menu2 = (Menu) lVar.getOrDefault(menu, null);
        if (menu2 == null) {
            menu2 = new MenuC2518A((Context) this.f5270c, (MenuC2533l) menu);
            lVar.put(menu, menu2);
        }
        return ((ActionMode.Callback) this.b).onPrepareActionMode(i9, menu2);
    }

    @Override // o.a
    public boolean e(o.b bVar, MenuC2533l menuC2533l) {
        o.f i9 = i(bVar);
        l lVar = (l) this.f5272f;
        Menu menu = (Menu) lVar.getOrDefault(menuC2533l, null);
        if (menu == null) {
            menu = new MenuC2518A((Context) this.f5270c, menuC2533l);
            lVar.put(menuC2533l, menu);
        }
        return ((ActionMode.Callback) this.b).onCreateActionMode(i9, menu);
    }

    @Override // s4.b
    public void f(Bundle bundle, String str) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f5272f;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    @Override // o.a
    public void g(o.b bVar) {
        ((ActionMode.Callback) this.b).onDestroyActionMode(i(bVar));
    }

    @Override // s4.InterfaceC2699a
    public void h(Bundle bundle) {
        synchronized (this.f5271d) {
            try {
                r4.d dVar = r4.d.f22842a;
                dVar.f("Logging event _ae to Firebase Analytics with params " + bundle);
                this.f5272f = new CountDownLatch(1);
                ((C1838g) this.b).h(bundle);
                dVar.f("Awaiting app exception callback from Analytics...");
                try {
                    if (((CountDownLatch) this.f5272f).await(500, (TimeUnit) this.f5270c)) {
                        dVar.f("App exception callback received from Analytics listener.");
                    } else {
                        dVar.g("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                    }
                } catch (InterruptedException unused) {
                    Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
                }
                this.f5272f = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public o.f i(o.b bVar) {
        ArrayList arrayList = (ArrayList) this.f5271d;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            o.f fVar = (o.f) arrayList.get(i9);
            if (fVar != null && fVar.b == bVar) {
                return fVar;
            }
        }
        o.f fVar2 = new o.f((Context) this.f5270c, bVar);
        arrayList.add(fVar2);
        return fVar2;
    }

    public void k(n nVar) {
        ViewCompat.setImportantForAccessibility(nVar, 2);
        this.f5271d = new S0.g(this, 1);
        ViewPager2 viewPager2 = (ViewPager2) this.f5272f;
        if (ViewCompat.getImportantForAccessibility(viewPager2) == 0) {
            ViewCompat.setImportantForAccessibility(viewPager2, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r3 < 5) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        r1.remove();
        r2.f21779c.incrementAndGet();
        r0.add(r2);
        ((java.util.ArrayDeque) r14.f5271d).add(r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.h.l():void");
    }

    public void m() {
        int itemCount;
        boolean z8;
        int i9;
        ViewPager2 viewPager2 = (ViewPager2) this.f5272f;
        int i10 = R.id.accessibilityActionPageLeft;
        ViewCompat.removeAccessibilityAction(viewPager2, R.id.accessibilityActionPageLeft);
        ViewCompat.removeAccessibilityAction(viewPager2, R.id.accessibilityActionPageRight);
        ViewCompat.removeAccessibilityAction(viewPager2, R.id.accessibilityActionPageUp);
        ViewCompat.removeAccessibilityAction(viewPager2, R.id.accessibilityActionPageDown);
        if (viewPager2.getAdapter() == null || (itemCount = viewPager2.getAdapter().getItemCount()) == 0 || !viewPager2.f5181t) {
            return;
        }
        int orientation = viewPager2.getOrientation();
        E1.c cVar = (E1.c) this.f5270c;
        C2475f c2475f = (C2475f) this.b;
        if (orientation == 0) {
            if (viewPager2.f5172i.getLayoutDirection() == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                i9 = 16908360;
            } else {
                i9 = 16908361;
            }
            if (z8) {
                i10 = 16908361;
            }
            if (viewPager2.f5169f < itemCount - 1) {
                ViewCompat.replaceAccessibilityAction(viewPager2, new U.d(i9), null, c2475f);
            }
            if (viewPager2.f5169f > 0) {
                ViewCompat.replaceAccessibilityAction(viewPager2, new U.d(i10), null, cVar);
                return;
            }
            return;
        }
        if (viewPager2.f5169f < itemCount - 1) {
            ViewCompat.replaceAccessibilityAction(viewPager2, new U.d(R.id.accessibilityActionPageDown), null, c2475f);
        }
        if (viewPager2.f5169f > 0) {
            ViewCompat.replaceAccessibilityAction(viewPager2, new U.d(R.id.accessibilityActionPageUp), null, cVar);
        }
    }
}
