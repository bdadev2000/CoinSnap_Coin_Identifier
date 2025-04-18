package a5;

import android.os.Handler;
import android.util.Base64;
import android.util.SparseArray;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: f, reason: collision with root package name */
    public static volatile t f236f;
    public volatile ServerSocket a;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f237b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f238c = new AtomicInteger(0);

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f239d;

    /* renamed from: e, reason: collision with root package name */
    public final f.a f240e;

    public t() {
        SparseArray sparseArray = new SparseArray(2);
        this.f239d = sparseArray;
        this.f240e = new f.a(this, 25);
        new androidx.activity.i(this, 17);
        new AtomicBoolean();
        sparseArray.put(0, new HashSet());
        sparseArray.put(1, new HashSet());
    }

    public static String a() {
        return new String(Base64.decode("MTI3LjAuMC4x".getBytes(), 0));
    }

    public static t b() {
        if (f236f == null) {
            synchronized (t.class) {
                if (f236f == null) {
                    f236f = new t();
                }
            }
        }
        return f236f;
    }

    public final void c() {
        if (this.f238c.compareAndSet(1, 2) || this.f238c.compareAndSet(0, 2)) {
            ServerSocket serverSocket = this.a;
            Handler handler = i5.a.a;
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (Throwable unused) {
                }
            }
            ArrayList arrayList = new ArrayList();
            synchronized (this.f239d) {
                int size = this.f239d.size();
                for (int i10 = 0; i10 < size; i10++) {
                    SparseArray sparseArray = this.f239d;
                    Set set = (Set) sparseArray.get(sparseArray.keyAt(i10));
                    if (set != null) {
                        arrayList.addAll(set);
                        set.clear();
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((g) it.next()).d();
            }
        }
    }
}
