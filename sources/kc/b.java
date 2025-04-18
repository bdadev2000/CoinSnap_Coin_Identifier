package kc;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class b {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final c f20637b;

    public b(Set set, c cVar) {
        this.a = b(set);
        this.f20637b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.a);
            sb2.append('/');
            sb2.append(aVar.f20636b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        c cVar = this.f20637b;
        synchronized (((Set) cVar.f20640c)) {
            unmodifiableSet = Collections.unmodifiableSet((Set) cVar.f20640c);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.a;
        if (isEmpty) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(' ');
        synchronized (((Set) cVar.f20640c)) {
            unmodifiableSet2 = Collections.unmodifiableSet((Set) cVar.f20640c);
        }
        sb2.append(b(unmodifiableSet2));
        return sb2.toString();
    }
}
