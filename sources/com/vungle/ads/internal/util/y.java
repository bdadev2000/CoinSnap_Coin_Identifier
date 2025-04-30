package com.vungle.ads.internal.util;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.List;

/* loaded from: classes3.dex */
public final class y extends ObjectInputStream {
    private final List<Class<?>> allowed;

    /* JADX WARN: Multi-variable type inference failed */
    public y(InputStream inputStream, List<? extends Class<?>> list) {
        super(inputStream);
        this.allowed = list;
    }

    @Override // java.io.ObjectInputStream
    public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException, IOException {
        G7.j.e(objectStreamClass, CampaignEx.JSON_KEY_DESC);
        Class<?> resolveClass = super.resolveClass(objectStreamClass);
        if (this.allowed != null && !Number.class.isAssignableFrom(resolveClass) && !String.class.equals(resolveClass) && !Boolean.class.equals(resolveClass) && !resolveClass.isArray() && !this.allowed.contains(resolveClass)) {
            throw new IOException("Deserialization is not allowed for " + objectStreamClass.getName());
        }
        G7.j.d(resolveClass, com.mbridge.msdk.foundation.controller.a.f15376a);
        return resolveClass;
    }
}
