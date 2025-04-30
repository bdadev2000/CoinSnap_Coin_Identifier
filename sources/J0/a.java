package J0;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.bumptech.glide.d;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f1481d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f1482e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f1484c;
    public final HashSet b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1483a = new HashMap();

    public a(Context context) {
        this.f1484c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f1481d == null) {
            synchronized (f1482e) {
                try {
                    if (f1481d == null) {
                        f1481d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f1481d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f1484c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (d.Q()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (!hashSet.contains(cls)) {
            HashMap hashMap = this.f1483a;
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                try {
                    b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                    List<Class> a6 = bVar.a();
                    if (!a6.isEmpty()) {
                        for (Class cls2 : a6) {
                            if (!hashMap.containsKey(cls2)) {
                                b(cls2, hashSet);
                            }
                        }
                    }
                    obj = bVar.create(this.f1484c);
                    hashSet.remove(cls);
                    hashMap.put(cls, obj);
                } catch (Throwable th2) {
                    throw new RuntimeException(th2);
                }
            } else {
                obj = hashMap.get(cls);
            }
            Trace.endSection();
            return obj;
        }
        throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
    }
}
