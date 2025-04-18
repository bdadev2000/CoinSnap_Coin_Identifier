package com.vungle.ads.internal.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y extends ObjectInputStream {
    private final List<Class<?>> allowed;

    /* JADX WARN: Multi-variable type inference failed */
    public y(InputStream inputStream, List<? extends Class<?>> list) {
        super(inputStream);
        this.allowed = list;
    }

    @Override // java.io.ObjectInputStream
    public Class<?> resolveClass(ObjectStreamClass desc) throws ClassNotFoundException, IOException {
        Intrinsics.checkNotNullParameter(desc, "desc");
        Class<?> c10 = super.resolveClass(desc);
        if (this.allowed != null && !Number.class.isAssignableFrom(c10) && !Intrinsics.areEqual(String.class, c10) && !Intrinsics.areEqual(Boolean.class, c10) && !c10.isArray() && !this.allowed.contains(c10)) {
            throw new IOException("Deserialization is not allowed for " + desc.getName());
        }
        Intrinsics.checkNotNullExpressionValue(c10, "c");
        return c10;
    }
}
