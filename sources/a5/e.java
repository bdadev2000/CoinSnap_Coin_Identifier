package a5;

import android.util.Log;
import android.util.SparseArray;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: i, reason: collision with root package name */
    public static volatile e f181i;
    public volatile int a = 163840;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f182b;

    /* renamed from: c, reason: collision with root package name */
    public final c f183c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadPoolExecutor f184d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f185e;

    /* renamed from: f, reason: collision with root package name */
    public final f.a f186f;

    /* renamed from: g, reason: collision with root package name */
    public volatile String f187g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f188h;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e() {
        /*
            r14 = this;
            r14.<init>()
            r0 = 163840(0x28000, float:2.29589E-40)
            r14.a = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r1 = 2
            r0.<init>(r1)
            r14.f182b = r0
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r14.f185e = r2
            f.a r2 = new f.a
            r3 = 24
            r2.<init>(r14, r3)
            r14.f186f = r2
            a5.c r2 = new a5.c
            r2.<init>()
            r14.f183c = r2
            android.os.Handler r3 = i5.a.a
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()
            int r3 = r3.availableProcessors()
            r13 = 1
            int r3 = java.lang.Math.max(r3, r13)
            if (r3 > 0) goto L3a
            r4 = r13
            goto L3d
        L3a:
            r4 = 4
            if (r3 <= r4) goto L3f
        L3d:
            r6 = r4
            goto L40
        L3f:
            r6 = r3
        L40:
            java.util.concurrent.ThreadPoolExecutor r3 = new java.util.concurrent.ThreadPoolExecutor
            r5 = 0
            r7 = 60
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            g4.a r11 = new g4.a
            r11.<init>(r1)
            a5.b r12 = new a5.b
            r12.<init>(r2)
            r4 = r3
            r10 = r2
            r4.<init>(r5, r6, r7, r9, r10, r11, r12)
            r14.f184d = r3
            monitor-enter(r2)
            java.util.concurrent.ThreadPoolExecutor r1 = r2.f175b     // Catch: java.lang.Throwable -> L7a
            if (r1 != 0) goto L72
            r2.f175b = r3     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7a
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 0
            r0.put(r2, r1)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.put(r13, r1)
            return
        L72:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = "You can only call setExecutor() once!"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L7a
            throw r0     // Catch: java.lang.Throwable -> L7a
        L7a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.e.<init>():void");
    }

    public static e c() {
        if (f181i == null) {
            synchronized (e.class) {
                if (f181i == null) {
                    f181i = new e();
                }
            }
        }
        return f181i;
    }

    public final void a(boolean z10, String str) {
        this.f187g = str;
        this.f188h = z10;
        if (v.a) {
            Log.i("TAG_PROXY_Preloader", "setCurrentPlayKey, ".concat(String.valueOf(str)));
        }
        HashSet hashSet = null;
        HashSet hashSet2 = null;
        m mVar = null;
        if (str == null) {
            synchronized (this.f185e) {
                if (!this.f185e.isEmpty()) {
                    hashSet2 = new HashSet(this.f185e);
                    this.f185e.clear();
                }
            }
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    b(dVar.a, dVar.f176b, dVar.f177c, dVar.f178d, dVar.f179e, dVar.f180f);
                    if (v.a) {
                        Log.i("TAG_PROXY_Preloader", "setCurrentPlayKey, resume preload: " + dVar.f178d);
                    }
                }
                return;
            }
            return;
        }
        int i10 = v.f243d;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 1) {
                synchronized (this.f182b) {
                    Map map = (Map) this.f182b.get(z10 ? 1 : 0);
                    if (map != null) {
                        mVar = (m) map.remove(str);
                    }
                }
                if (mVar != null) {
                    mVar.d();
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this.f182b) {
            int size = this.f182b.size();
            for (int i11 = 0; i11 < size; i11++) {
                SparseArray sparseArray = this.f182b;
                Map map2 = (Map) sparseArray.get(sparseArray.keyAt(i11));
                if (map2 != null) {
                    Collection values = map2.values();
                    if (values != null && !values.isEmpty()) {
                        if (hashSet == null) {
                            hashSet = new HashSet();
                        }
                        hashSet.addAll(values);
                    }
                    map2.clear();
                }
            }
        }
        if (hashSet != null && !hashSet.isEmpty()) {
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                m mVar2 = (m) it2.next();
                mVar2.d();
                if (v.a) {
                    Log.i("TAG_PROXY_Preloader", "setCurrentPlayKey, cancel preload: " + mVar2.f220g);
                }
            }
            if (i10 == 3) {
                synchronized (this.f185e) {
                    Iterator it3 = hashSet.iterator();
                    while (it3.hasNext()) {
                        d dVar2 = (d) ((m) it3.next()).f212q;
                        if (dVar2 != null) {
                            this.f185e.add(dVar2);
                        }
                    }
                }
            }
        }
    }

    public final void b(boolean z10, boolean z11, int i10, String str, Map map, String... strArr) {
        boolean z12 = v.a;
        if (z12) {
            Log.d("TAG_PROXY_Preloader", "preload start ！！！！");
        }
        if (z12) {
            Log.e("TAG_PROXY_Preloader", "cache or videoProxyDB null in Preloader!!!");
        }
    }
}
