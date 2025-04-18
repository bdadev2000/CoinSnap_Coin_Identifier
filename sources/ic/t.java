package ic;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import com.google.common.collect.r0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n9.h0;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name */
    public static t f19572e;

    /* renamed from: f, reason: collision with root package name */
    public static t f19573f;
    public Object a;

    /* renamed from: b, reason: collision with root package name */
    public Object f19574b;

    /* renamed from: c, reason: collision with root package name */
    public Object f19575c;

    /* renamed from: d, reason: collision with root package name */
    public Object f19576d;

    public /* synthetic */ t(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.f19574b = obj2;
        this.f19575c = obj3;
        this.f19576d = obj4;
    }

    public static void b(Object obj, long j3, Map map) {
        if (map.containsKey(obj)) {
            Long l10 = (Long) map.get(obj);
            int i10 = h0.a;
            j3 = Math.max(j3, l10.longValue());
        }
        map.put(obj, Long.valueOf(j3));
    }

    public static synchronized t f() {
        t tVar;
        synchronized (t.class) {
            if (f19572e == null) {
                f19572e = new t(0);
            }
            tVar = f19572e;
        }
        return tVar;
    }

    public static void i(long j3, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j3) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            map.remove(arrayList.get(i10));
        }
    }

    public final void a() {
        sd.b bVar = (sd.b) ((ArrayDeque) this.f19575c).poll();
        this.f19576d = bVar;
        if (bVar != null) {
            bVar.executeOnExecutor((ThreadPoolExecutor) this.f19574b, new Object[0]);
        }
    }

    public final ArrayList c(r0 r0Var) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        i(elapsedRealtime, (Map) this.a);
        i(elapsedRealtime, (Map) this.f19574b);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < r0Var.size(); i10++) {
            z8.b bVar = (z8.b) r0Var.get(i10);
            if (!((Map) this.a).containsKey(bVar.f28588b) && !((Map) this.f19574b).containsKey(Integer.valueOf(bVar.f28589c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public final void d(sd.b bVar) {
        bVar.a = this;
        ((ArrayDeque) this.f19575c).add(bVar);
        if (((sd.b) this.f19576d) == null) {
            a();
        }
    }

    public final s2.h e() {
        return new s2.h((Integer) this.a, (Integer) this.f19574b, (Integer) this.f19575c, (Integer) this.f19576d);
    }

    public final boolean g(Context context) {
        boolean z10;
        if (((Boolean) this.f19575c) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f19575c = Boolean.valueOf(z10);
        }
        if (!((Boolean) this.f19574b).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f19575c).booleanValue();
    }

    public final boolean h(Context context) {
        boolean z10;
        if (((Boolean) this.f19574b) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f19574b = Boolean.valueOf(z10);
        }
        if (!((Boolean) this.f19574b).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f19574b).booleanValue();
    }

    public final z8.b j(r0 r0Var) {
        ArrayList c10 = c(r0Var);
        if (c10.size() < 2) {
            return (z8.b) c6.k.o(c10, null);
        }
        Collections.sort(c10, new k0.b(5));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = ((z8.b) c10.get(0)).f28589c;
        int i12 = 0;
        while (true) {
            if (i12 >= c10.size()) {
                break;
            }
            z8.b bVar = (z8.b) c10.get(i12);
            if (i11 != bVar.f28589c) {
                if (arrayList.size() == 1) {
                    return (z8.b) c10.get(0);
                }
            } else {
                arrayList.add(new Pair(bVar.f28588b, Integer.valueOf(bVar.f28590d)));
                i12++;
            }
        }
        z8.b bVar2 = (z8.b) ((Map) this.f19575c).get(arrayList);
        if (bVar2 == null) {
            List subList = c10.subList(0, arrayList.size());
            int i13 = 0;
            for (int i14 = 0; i14 < subList.size(); i14++) {
                i13 += ((z8.b) subList.get(i14)).f28590d;
            }
            int nextInt = ((Random) this.f19576d).nextInt(i13);
            int i15 = 0;
            while (true) {
                if (i10 < subList.size()) {
                    z8.b bVar3 = (z8.b) subList.get(i10);
                    i15 += bVar3.f28590d;
                    if (nextInt < i15) {
                        bVar2 = bVar3;
                        break;
                    }
                    i10++;
                } else {
                    bVar2 = (z8.b) c6.k.p(subList);
                    break;
                }
            }
            ((Map) this.f19575c).put(arrayList, bVar2);
        }
        return bVar2;
    }

    public t(Random random) {
        this.f19575c = new HashMap();
        this.f19576d = random;
        this.a = new HashMap();
        this.f19574b = new HashMap();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(int i10) {
        this(new Random());
        int i11 = 1;
        if (i10 != 1) {
            if (i10 == 2) {
                this.a = new t.e(NotificationCompat.FLAG_LOCAL_ONLY, 0);
                this.f19574b = new t.e(NotificationCompat.FLAG_LOCAL_ONLY, 0);
                this.f19575c = new t.e(NotificationCompat.FLAG_LOCAL_ONLY, 0);
                this.f19576d = new t.i[32];
                return;
            }
            if (i10 == 4) {
                this.a = new r.b();
                this.f19574b = new SparseArray();
                this.f19575c = new r.e();
                this.f19576d = new r.b();
                return;
            }
            if (i10 == 10) {
                this.f19575c = new ArrayDeque();
                this.f19576d = null;
                LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
                this.a = linkedBlockingQueue;
                this.f19574b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
                return;
            }
            if (i10 == 6) {
                this.f19574b = null;
                this.f19575c = new ArrayList();
                this.f19576d = null;
                this.a = "";
                return;
            }
            if (i10 == 7) {
                return;
            }
            if (i10 != 8) {
                this.a = null;
                this.f19574b = null;
                this.f19575c = null;
                this.f19576d = new ArrayDeque();
                return;
            }
            this.a = new Object();
            this.f19574b = new Handler(Looper.getMainLooper(), new p4.g(this, i11));
        }
    }

    public t(p000if.f fVar, p000if.c cVar, p000if.a aVar) {
        this.a = fVar;
        this.f19574b = cVar;
        this.f19575c = aVar;
    }
}
