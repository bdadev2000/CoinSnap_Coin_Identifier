package vc;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public final class a implements com.google.gson.d0 {
    @Override // com.google.gson.d0
    public final com.google.gson.c0 a(com.google.gson.n nVar, TypeToken typeToken) {
        Type componentType;
        Type type = typeToken.f12123b;
        boolean z10 = type instanceof GenericArrayType;
        if (!z10 && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        if (z10) {
            componentType = ((GenericArrayType) type).getGenericComponentType();
        } else {
            componentType = ((Class) type).getComponentType();
        }
        return new b(nVar, nVar.c(new TypeToken(componentType)), com.bumptech.glide.d.o(componentType));
    }
}
