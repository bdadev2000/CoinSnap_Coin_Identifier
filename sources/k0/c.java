package k0;

import b1.f0;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class c implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Class f30896a;

    public c(Enum[] enumArr) {
        p0.a.s(enumArr, RemoteConfigConstants.ResponseFieldKey.ENTRIES);
        Class<?> componentType = enumArr.getClass().getComponentType();
        p0.a.p(componentType);
        this.f30896a = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.f30896a.getEnumConstants();
        p0.a.r(enumConstants, "getEnumConstants(...)");
        return f0.l((Enum[]) enumConstants);
    }
}
