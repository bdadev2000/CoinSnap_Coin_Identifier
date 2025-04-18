package vc;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;

/* loaded from: classes3.dex */
public final class d implements com.google.gson.d0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26417b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f26418c;

    public /* synthetic */ d(Object obj, int i10) {
        this.f26417b = i10;
        this.f26418c = obj;
    }

    @Override // com.google.gson.d0
    public final com.google.gson.c0 a(com.google.gson.n nVar, TypeToken typeToken) {
        int i10 = this.f26417b;
        Type type = Object.class;
        Object obj = this.f26418c;
        switch (i10) {
            case 0:
                Type type2 = typeToken.f12123b;
                Class cls = typeToken.a;
                if (!Collection.class.isAssignableFrom(cls)) {
                    return null;
                }
                Type p10 = com.bumptech.glide.d.p(type2, cls, Collection.class);
                if (p10 instanceof ParameterizedType) {
                    type = ((ParameterizedType) p10).getActualTypeArguments()[0];
                }
                return new c(nVar, type, nVar.c(new TypeToken(type)), ((com.bumptech.glide.manager.r) obj).g(typeToken));
            case 1:
                if (typeToken.a != Number.class) {
                    return null;
                }
                return (o) obj;
            default:
                if (typeToken.a != type) {
                    return null;
                }
                return new p(nVar, (com.google.gson.b0) obj);
        }
    }
}
