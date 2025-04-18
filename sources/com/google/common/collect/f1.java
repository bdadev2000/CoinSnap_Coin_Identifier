package com.google.common.collect;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class f1 extends y0 {
    private static final long serialVersionUID = 0;

    /* renamed from: h, reason: collision with root package name */
    public final transient b1 f11945h;

    public f1(e2 e2Var, int i10, Comparator comparator) {
        super(e2Var, i10);
        b1 r6;
        if (comparator == null) {
            int i11 = b1.f11907d;
            r6 = f2.f11947l;
        } else {
            r6 = i1.r(comparator);
        }
        this.f11945h = r6;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        Object r6;
        z0 g1Var;
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            m9.s sVar = new m9.s(4);
            int i10 = 0;
            for (int i11 = 0; i11 < readInt; i11++) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    if (comparator == null) {
                        g1Var = new z0();
                    } else {
                        g1Var = new g1(comparator);
                    }
                    for (int i12 = 0; i12 < readInt2; i12++) {
                        g1Var.d(objectInputStream.readObject());
                    }
                    b1 A = g1Var.A();
                    if (A.size() == readInt2) {
                        sVar.c(readObject, A);
                        i10 += readInt2;
                    } else {
                        String valueOf = String.valueOf(readObject);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 40);
                        sb2.append("Duplicate key-value pairs exist for key ");
                        sb2.append(valueOf);
                        throw new InvalidObjectException(sb2.toString());
                    }
                } else {
                    throw new InvalidObjectException(a4.j.c(31, "Invalid value count ", readInt2));
                }
            }
            try {
                e2 a = sVar.a();
                ka.f fVar = x0.a;
                fVar.getClass();
                try {
                    ((Field) fVar.f20532b).set(this, a);
                    ka.f fVar2 = x0.f12052b;
                    fVar2.getClass();
                    try {
                        ((Field) fVar2.f20532b).set(this, Integer.valueOf(i10));
                        ka.f fVar3 = e1.a;
                        if (comparator == null) {
                            int i13 = b1.f11907d;
                            r6 = f2.f11947l;
                        } else {
                            r6 = i1.r(comparator);
                        }
                        fVar3.getClass();
                        try {
                            ((Field) fVar3.f20532b).set(this, r6);
                            return;
                        } catch (IllegalAccessException e2) {
                            throw new AssertionError(e2);
                        }
                    } catch (IllegalAccessException e10) {
                        throw new AssertionError(e10);
                    }
                } catch (IllegalAccessException e11) {
                    throw new AssertionError(e11);
                }
            } catch (IllegalArgumentException e12) {
                throw ((InvalidObjectException) new InvalidObjectException(e12.getMessage()).initCause(e12));
            }
        }
        throw new InvalidObjectException(a4.j.c(29, "Invalid key count ", readInt));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Comparator comparator;
        objectOutputStream.defaultWriteObject();
        b1 b1Var = this.f11945h;
        if (b1Var instanceof i1) {
            comparator = ((i1) b1Var).f11974f;
        } else {
            comparator = null;
        }
        objectOutputStream.writeObject(comparator);
        objectOutputStream.writeInt(((e2) a()).size());
        for (Map.Entry entry : ((u0) a()).entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }
}
