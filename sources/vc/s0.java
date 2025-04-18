package vc;

import com.google.gson.reflect.TypeToken;

/* loaded from: classes3.dex */
public final class s0 implements com.google.gson.d0 {
    @Override // com.google.gson.d0
    public final com.google.gson.c0 a(com.google.gson.n nVar, TypeToken typeToken) {
        Class cls = typeToken.a;
        if (Enum.class.isAssignableFrom(cls) && cls != Enum.class) {
            if (!cls.isEnum()) {
                cls = cls.getSuperclass();
            }
            return new x(cls);
        }
        return null;
    }
}
