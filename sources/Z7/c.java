package z7;

import G7.j;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class c implements Serializable {
    private static final long serialVersionUID = 0;
    public final Class b;

    public c(Enum[] enumArr) {
        j.e(enumArr, "entries");
        Class<?> componentType = enumArr.getClass().getComponentType();
        j.b(componentType);
        this.b = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.b.getEnumConstants();
        j.d(enumConstants, "getEnumConstants(...)");
        return new b((Enum[]) enumConstants);
    }
}
