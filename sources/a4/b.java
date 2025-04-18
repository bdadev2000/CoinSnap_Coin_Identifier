package a4;

import java.io.IOException;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b {
    public String a;

    public b() {
    }

    public /* synthetic */ b(int i10) {
    }

    public final void a(StringBuilder sb2, AbstractCollection abstractCollection) {
        CharSequence obj;
        CharSequence obj2;
        Iterator it = abstractCollection.iterator();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                if (next instanceof CharSequence) {
                    obj = (CharSequence) next;
                } else {
                    obj = next.toString();
                }
                sb2.append(obj);
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.a);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    if (next2 instanceof CharSequence) {
                        obj2 = (CharSequence) next2;
                    } else {
                        obj2 = next2.toString();
                    }
                    sb2.append(obj2);
                }
            }
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public b(String str) {
        str.getClass();
        this.a = str;
    }
}
