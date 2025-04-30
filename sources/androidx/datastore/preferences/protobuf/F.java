package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public final class F extends G {
    @Override // androidx.datastore.preferences.protobuf.G
    public final void a(Object obj, long j7) {
        ((AbstractC0427b) ((InterfaceC0448x) r0.f4600d.i(obj, j7))).b = false;
    }

    @Override // androidx.datastore.preferences.protobuf.G
    public final void b(Object obj, Object obj2, long j7) {
        q0 q0Var = r0.f4600d;
        InterfaceC0448x interfaceC0448x = (InterfaceC0448x) q0Var.i(obj, j7);
        InterfaceC0448x interfaceC0448x2 = (InterfaceC0448x) q0Var.i(obj2, j7);
        int size = interfaceC0448x.size();
        int size2 = interfaceC0448x2.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC0427b) interfaceC0448x).b) {
                interfaceC0448x = interfaceC0448x.mutableCopyWithCapacity(size2 + size);
            }
            interfaceC0448x.addAll(interfaceC0448x2);
        }
        if (size > 0) {
            interfaceC0448x2 = interfaceC0448x;
        }
        r0.r(obj, j7, interfaceC0448x2);
    }

    @Override // androidx.datastore.preferences.protobuf.G
    public final List c(Object obj, long j7) {
        int i9;
        InterfaceC0448x interfaceC0448x = (InterfaceC0448x) r0.f4600d.i(obj, j7);
        if (!((AbstractC0427b) interfaceC0448x).b) {
            int size = interfaceC0448x.size();
            if (size == 0) {
                i9 = 10;
            } else {
                i9 = size * 2;
            }
            InterfaceC0448x mutableCopyWithCapacity = interfaceC0448x.mutableCopyWithCapacity(i9);
            r0.r(obj, j7, mutableCopyWithCapacity);
            return mutableCopyWithCapacity;
        }
        return interfaceC0448x;
    }
}
