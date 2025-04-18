package vc;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Properties;

/* loaded from: classes3.dex */
public final class n implements com.google.gson.d0 {

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.manager.r f26455b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f26456c = false;

    public n(com.bumptech.glide.manager.r rVar) {
        this.f26455b = rVar;
    }

    @Override // com.google.gson.d0
    public final com.google.gson.c0 a(com.google.gson.n nVar, TypeToken typeToken) {
        Type[] typeArr;
        com.google.gson.c0 c0Var;
        Type type = typeToken.f12123b;
        Class cls = typeToken.a;
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (type == Properties.class) {
            typeArr = new Type[]{String.class, String.class};
        } else {
            Type p10 = com.bumptech.glide.d.p(type, cls, Map.class);
            if (p10 instanceof ParameterizedType) {
                typeArr = ((ParameterizedType) p10).getActualTypeArguments();
            } else {
                typeArr = new Type[]{Object.class, Object.class};
            }
        }
        Type type2 = typeArr[0];
        if (type2 != Boolean.TYPE && type2 != Boolean.class) {
            c0Var = nVar.c(new TypeToken(type2));
        } else {
            c0Var = e1.f26420c;
        }
        return new m(this, nVar, typeArr[0], c0Var, typeArr[1], nVar.c(new TypeToken(typeArr[1])), this.f26455b.g(typeToken));
    }
}
