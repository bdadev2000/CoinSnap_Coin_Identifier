package c2;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.fragment.app.z;
import com.plantcare.ai.identifier.plantid.R;
import d6.g;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f2529d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f2530e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f2532c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f2531b = new HashSet();
    public final HashMap a = new HashMap();

    public a(Context context) {
        this.f2532c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f2529d == null) {
            synchronized (f2530e) {
                if (f2529d == null) {
                    f2529d = new a(context);
                }
            }
        }
        return f2529d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f2532c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f2531b;
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
            } catch (ClassNotFoundException e2) {
                throw new z(e2);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (g.r()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (!hashSet.contains(cls)) {
            HashMap hashMap = this.a;
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                try {
                    b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    List<Class> a = bVar.a();
                    if (!a.isEmpty()) {
                        for (Class cls2 : a) {
                            if (!hashMap.containsKey(cls2)) {
                                b(cls2, hashSet);
                            }
                        }
                    }
                    obj = bVar.create(this.f2532c);
                    hashSet.remove(cls);
                    hashMap.put(cls, obj);
                } catch (Throwable th2) {
                    throw new z(th2);
                }
            } else {
                obj = hashMap.get(cls);
            }
            return obj;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
    }
}
