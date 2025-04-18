package o;

import android.graphics.Bitmap;
import e0.u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class k implements m {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f31184a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f31185b;

    @Override // o.m
    public final synchronized void a(int i2) {
        if (i2 >= 10 && i2 != 20) {
            d();
        }
    }

    @Override // o.m
    public final synchronized d b(c cVar) {
        try {
            ArrayList arrayList = (ArrayList) this.f31184a.get(cVar);
            d dVar = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                j jVar = (j) arrayList.get(i2);
                Bitmap bitmap = (Bitmap) jVar.f31182b.get();
                d dVar2 = bitmap != null ? new d(bitmap, jVar.f31183c) : null;
                if (dVar2 != null) {
                    dVar = dVar2;
                    break;
                }
                i2++;
            }
            int i3 = this.f31185b;
            this.f31185b = i3 + 1;
            if (i3 >= 10) {
                d();
            }
            return dVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // o.m
    public final synchronized void c(c cVar, Bitmap bitmap, Map map, int i2) {
        try {
            LinkedHashMap linkedHashMap = this.f31184a;
            Object obj = linkedHashMap.get(cVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(cVar, obj);
            }
            ArrayList arrayList = (ArrayList) obj;
            int identityHashCode = System.identityHashCode(bitmap);
            j jVar = new j(identityHashCode, new WeakReference(bitmap), map, i2);
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    arrayList.add(jVar);
                    break;
                }
                j jVar2 = (j) arrayList.get(i3);
                if (i2 < jVar2.d) {
                    i3++;
                } else if (jVar2.f31181a == identityHashCode && jVar2.f31182b.get() == bitmap) {
                    arrayList.set(i3, jVar);
                } else {
                    arrayList.add(i3, jVar);
                }
            }
            int i4 = this.f31185b;
            this.f31185b = i4 + 1;
            if (i4 >= 10) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d() {
        WeakReference weakReference;
        this.f31185b = 0;
        Iterator it = this.f31184a.values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                j jVar = (j) u.F0(arrayList);
                if (((jVar == null || (weakReference = jVar.f31182b) == null) ? null : (Bitmap) weakReference.get()) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    int i4 = i3 - i2;
                    if (((j) arrayList.get(i4)).f31182b.get() == null) {
                        arrayList.remove(i4);
                        i2++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }
}
