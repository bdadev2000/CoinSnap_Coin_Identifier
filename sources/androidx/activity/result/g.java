package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.o0;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import androidx.lifecycle.x;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.random.Random;

/* loaded from: classes.dex */
public abstract class g {
    public final HashMap a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f602b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f603c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f604d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient HashMap f605e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f606f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f607g = new Bundle();

    public final boolean a(int i10, int i11, Intent intent) {
        b bVar;
        String str = (String) this.a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        e eVar = (e) this.f605e.get(str);
        if (eVar != null && (bVar = eVar.a) != null && this.f604d.contains(str)) {
            bVar.a(eVar.f600b.c(i11, intent));
            this.f604d.remove(str);
            return true;
        }
        this.f606f.remove(str);
        this.f607g.putParcelable(str, new a(i11, intent));
        return true;
    }

    public abstract void b(int i10, f.b bVar, Object obj);

    public final d c(final String str, v vVar, final f.b bVar, final b bVar2) {
        p lifecycle = vVar.getLifecycle();
        x xVar = (x) lifecycle;
        if (!xVar.f1835d.a(o.STARTED)) {
            e(str);
            HashMap hashMap = this.f603c;
            f fVar = (f) hashMap.get(str);
            if (fVar == null) {
                fVar = new f(lifecycle);
            }
            t tVar = new t() { // from class: androidx.activity.result.ActivityResultRegistry$1
                @Override // androidx.lifecycle.t
                public final void a(v vVar2, n nVar) {
                    boolean equals = n.ON_START.equals(nVar);
                    String str2 = str;
                    g gVar = g.this;
                    if (equals) {
                        HashMap hashMap2 = gVar.f605e;
                        f.b bVar3 = bVar;
                        b bVar4 = bVar2;
                        hashMap2.put(str2, new e(bVar3, bVar4));
                        HashMap hashMap3 = gVar.f606f;
                        if (hashMap3.containsKey(str2)) {
                            Object obj = hashMap3.get(str2);
                            hashMap3.remove(str2);
                            bVar4.a(obj);
                        }
                        Bundle bundle = gVar.f607g;
                        a aVar = (a) bundle.getParcelable(str2);
                        if (aVar != null) {
                            bundle.remove(str2);
                            bVar4.a(bVar3.c(aVar.f595b, aVar.f596c));
                            return;
                        }
                        return;
                    }
                    if (n.ON_STOP.equals(nVar)) {
                        gVar.f605e.remove(str2);
                    } else if (n.ON_DESTROY.equals(nVar)) {
                        gVar.f(str2);
                    }
                }
            };
            fVar.a.a(tVar);
            fVar.f601b.add(tVar);
            hashMap.put(str, fVar);
            return new d(this, str, bVar, 0);
        }
        throw new IllegalStateException("LifecycleOwner " + vVar + " is attempting to register while current state is " + xVar.f1835d + ". LifecycleOwners must call register before they are STARTED.");
    }

    public final d d(String str, f.b bVar, o0 o0Var) {
        e(str);
        this.f605e.put(str, new e(bVar, o0Var));
        HashMap hashMap = this.f606f;
        if (hashMap.containsKey(str)) {
            Object obj = hashMap.get(str);
            hashMap.remove(str);
            o0Var.a(obj);
        }
        Bundle bundle = this.f607g;
        a aVar = (a) bundle.getParcelable(str);
        if (aVar != null) {
            bundle.remove(str);
            o0Var.a(bVar.c(aVar.f595b, aVar.f596c));
        }
        return new d(this, str, bVar, 1);
    }

    public final void e(String str) {
        HashMap hashMap = this.f602b;
        if (((Integer) hashMap.get(str)) != null) {
            return;
        }
        int nextInt = Random.INSTANCE.nextInt(2147418112);
        while (true) {
            int i10 = nextInt + C.DEFAULT_BUFFER_SEGMENT_SIZE;
            HashMap hashMap2 = this.a;
            if (hashMap2.containsKey(Integer.valueOf(i10))) {
                nextInt = Random.INSTANCE.nextInt(2147418112);
            } else {
                hashMap2.put(Integer.valueOf(i10), str);
                hashMap.put(str, Integer.valueOf(i10));
                return;
            }
        }
    }

    public final void f(String str) {
        Integer num;
        if (!this.f604d.contains(str) && (num = (Integer) this.f602b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.f605e.remove(str);
        HashMap hashMap = this.f606f;
        if (hashMap.containsKey(str)) {
            StringBuilder o10 = a4.j.o("Dropping pending result for request ", str, ": ");
            o10.append(hashMap.get(str));
            Log.w("ActivityResultRegistry", o10.toString());
            hashMap.remove(str);
        }
        Bundle bundle = this.f607g;
        if (bundle.containsKey(str)) {
            StringBuilder o11 = a4.j.o("Dropping pending result for request ", str, ": ");
            o11.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", o11.toString());
            bundle.remove(str);
        }
        HashMap hashMap2 = this.f603c;
        f fVar = (f) hashMap2.get(str);
        if (fVar != null) {
            ArrayList arrayList = fVar.f601b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fVar.a.b((t) it.next());
            }
            arrayList.clear();
            hashMap2.remove(str);
        }
    }
}
