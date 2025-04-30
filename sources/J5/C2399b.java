package j5;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: j5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2399b {

    /* renamed from: a, reason: collision with root package name */
    public final String f21104a;
    public final C2400c b;

    public C2399b(Set set, C2400c c2400c) {
        this.f21104a = b(set);
        this.b = c2400c;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C2398a c2398a = (C2398a) it.next();
            sb.append(c2398a.f21103a);
            sb.append('/');
            sb.append(c2398a.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        C2400c c2400c = this.b;
        synchronized (((HashSet) c2400c.f21107c)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) c2400c.f21107c);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.f21104a;
        if (isEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (((HashSet) c2400c.f21107c)) {
            unmodifiableSet2 = Collections.unmodifiableSet((HashSet) c2400c.f21107c);
        }
        sb.append(b(unmodifiableSet2));
        return sb.toString();
    }
}
