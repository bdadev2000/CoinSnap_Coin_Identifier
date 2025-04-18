package k0;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import e0.f;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class b extends f implements a, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Enum[] f30895a;

    public b(Enum[] enumArr) {
        p0.a.s(enumArr, RemoteConfigConstants.ResponseFieldKey.ENTRIES);
        this.f30895a = enumArr;
    }

    private final Object writeReplace() {
        return new c(this.f30895a);
    }

    @Override // e0.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r6 = (Enum) obj;
        p0.a.s(r6, "element");
        int ordinal = r6.ordinal();
        Enum[] enumArr = this.f30895a;
        p0.a.s(enumArr, "<this>");
        return ((ordinal < 0 || ordinal > enumArr.length - 1) ? null : enumArr[ordinal]) == r6;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        e0.b bVar = f.Companion;
        Enum[] enumArr = this.f30895a;
        int length = enumArr.length;
        bVar.getClass();
        e0.b.a(i2, length);
        return enumArr[i2];
    }

    @Override // e0.a
    public final int getSize() {
        return this.f30895a.length;
    }

    @Override // e0.f, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r5 = (Enum) obj;
        p0.a.s(r5, "element");
        int ordinal = r5.ordinal();
        Enum[] enumArr = this.f30895a;
        p0.a.s(enumArr, "<this>");
        if (((ordinal < 0 || ordinal > enumArr.length + (-1)) ? null : enumArr[ordinal]) == r5) {
            return ordinal;
        }
        return -1;
    }

    @Override // e0.f, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r2 = (Enum) obj;
        p0.a.s(r2, "element");
        return indexOf(r2);
    }
}
