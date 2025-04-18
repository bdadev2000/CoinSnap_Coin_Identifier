package androidx.compose.runtime.saveable;

import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import e0.e0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes.dex */
public final class SaveableStateHolderImpl$Companion$Saver$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final SaveableStateHolderImpl$Companion$Saver$1 f14510a = new r(2);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        SaveableStateHolderImpl saveableStateHolderImpl = (SaveableStateHolderImpl) obj2;
        LinkedHashMap z2 = e0.z(saveableStateHolderImpl.f14504a);
        for (SaveableStateHolderImpl.RegistryHolder registryHolder : saveableStateHolderImpl.f14505b.values()) {
            if (registryHolder.f14513b) {
                Map d = ((SaveableStateRegistryImpl) registryHolder.f14514c).d();
                boolean isEmpty = d.isEmpty();
                Object obj3 = registryHolder.f14512a;
                if (isEmpty) {
                    z2.remove(obj3);
                } else {
                    z2.put(obj3, d);
                }
            }
        }
        if (z2.isEmpty()) {
            return null;
        }
        return z2;
    }
}
