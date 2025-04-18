package f0;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import org.jacoco.core.runtime.AgentOptions;

/* loaded from: classes4.dex */
public final class k implements Externalizable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public Map f30447a;

    private final Object readResolve() {
        return this.f30447a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        p0.a.s(objectInput, "input");
        byte readByte = objectInput.readByte();
        if (readByte != 0) {
            throw new InvalidObjectException(android.support.v4.media.d.i("Unsupported flags value: ", readByte));
        }
        int readInt = objectInput.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        g gVar = new g(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            gVar.put(objectInput.readObject(), objectInput.readObject());
        }
        gVar.c();
        gVar.f30441n = true;
        if (gVar.f30437j <= 0) {
            gVar = g.f30429o;
            p0.a.q(gVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        }
        this.f30447a = gVar;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        p0.a.s(objectOutput, AgentOptions.OUTPUT);
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.f30447a.size());
        for (Map.Entry entry : this.f30447a.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }
}
