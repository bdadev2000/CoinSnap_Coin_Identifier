package f0;

import b1.f0;
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import org.jacoco.core.runtime.AgentOptions;

/* loaded from: classes4.dex */
public final class j implements Externalizable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public Collection f30445a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30446b;

    public j(int i2, Collection collection) {
        p0.a.s(collection, "collection");
        this.f30445a = collection;
        this.f30446b = i2;
    }

    private final Object readResolve() {
        return this.f30445a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Collection e;
        p0.a.s(objectInput, "input");
        byte readByte = objectInput.readByte();
        int i2 = readByte & 1;
        if ((readByte & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte) + '.');
        }
        int readInt = objectInput.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        int i3 = 0;
        if (i2 == 0) {
            c cVar = new c(readInt);
            while (i3 < readInt) {
                cVar.add(objectInput.readObject());
                i3++;
            }
            e = f0.e(cVar);
        } else {
            if (i2 != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i2 + '.');
            }
            l lVar = new l(new g(readInt));
            while (i3 < readInt) {
                lVar.add(objectInput.readObject());
                i3++;
            }
            e = f0.f(lVar);
        }
        this.f30445a = e;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        p0.a.s(objectOutput, AgentOptions.OUTPUT);
        objectOutput.writeByte(this.f30446b);
        objectOutput.writeInt(this.f30445a.size());
        Iterator it = this.f30445a.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }
}
