package d4;

import com.facebook.internal.C1838g;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class w extends s {
    private static final long serialVersionUID = 0;

    /* renamed from: c, reason: collision with root package name */
    public final transient u f19886c;

    public w(J j7, int i9) {
        super(j7);
        int i10 = u.f19883d;
        this.f19886c = K.l;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        Object l;
        C2181i xVar;
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            D0.l lVar = new D0.l(4);
            int i9 = 0;
            for (int i10 = 0; i10 < readInt; i10++) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    if (comparator == null) {
                        xVar = new C2181i();
                    } else {
                        xVar = new x(comparator);
                    }
                    for (int i11 = 0; i11 < readInt2; i11++) {
                        xVar.b(objectInputStream.readObject());
                    }
                    u c9 = xVar.c();
                    if (c9.size() == readInt2) {
                        lVar.h(readObject, c9);
                        i9 += readInt2;
                    } else {
                        String valueOf = String.valueOf(readObject);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 40);
                        sb.append("Duplicate key-value pairs exist for key ");
                        sb.append(valueOf);
                        throw new InvalidObjectException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(31);
                    sb2.append("Invalid value count ");
                    sb2.append(readInt2);
                    throw new InvalidObjectException(sb2.toString());
                }
            }
            try {
                J b = lVar.b();
                C1838g c1838g = r.f19882a;
                c1838g.getClass();
                try {
                    ((Field) c1838g.b).set(this, b);
                    C1838g c1838g2 = r.b;
                    c1838g2.getClass();
                    try {
                        ((Field) c1838g2.b).set(this, Integer.valueOf(i9));
                        C1838g c1838g3 = v.f19885a;
                        if (comparator == null) {
                            int i12 = u.f19883d;
                            l = K.l;
                        } else {
                            l = z.l(comparator);
                        }
                        c1838g3.getClass();
                        try {
                            ((Field) c1838g3.b).set(this, l);
                            return;
                        } catch (IllegalAccessException e4) {
                            throw new AssertionError(e4);
                        }
                    } catch (IllegalAccessException e9) {
                        throw new AssertionError(e9);
                    }
                } catch (IllegalAccessException e10) {
                    throw new AssertionError(e10);
                }
            } catch (IllegalArgumentException e11) {
                throw ((InvalidObjectException) new InvalidObjectException(e11.getMessage()).initCause(e11));
            }
        }
        StringBuilder sb3 = new StringBuilder(29);
        sb3.append("Invalid key count ");
        sb3.append(readInt);
        throw new InvalidObjectException(sb3.toString());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Comparator comparator;
        objectOutputStream.defaultWriteObject();
        u uVar = this.f19886c;
        if (uVar instanceof z) {
            comparator = ((z) uVar).f19889f;
        } else {
            comparator = null;
        }
        objectOutputStream.writeObject(comparator);
        q qVar = this.b;
        objectOutputStream.writeInt(((J) qVar).f19841h);
        for (Map.Entry entry : qVar.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }
}
