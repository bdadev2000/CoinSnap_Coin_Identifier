package vc;

import com.google.gson.reflect.TypeToken;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class j implements com.google.gson.d0 {

    /* renamed from: d, reason: collision with root package name */
    public static final i f26445d;

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.manager.r f26446b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f26447c = new ConcurrentHashMap();

    static {
        int i10 = 0;
        f26445d = new i(i10);
        new i(i10);
    }

    public j(com.bumptech.glide.manager.r rVar) {
        this.f26446b = rVar;
    }

    @Override // com.google.gson.d0
    public final com.google.gson.c0 a(com.google.gson.n nVar, TypeToken typeToken) {
        tc.a aVar = (tc.a) typeToken.a.getAnnotation(tc.a.class);
        if (aVar == null) {
            return null;
        }
        return b(this.f26446b, nVar, typeToken, aVar, true);
    }

    public final com.google.gson.c0 b(com.bumptech.glide.manager.r rVar, com.google.gson.n nVar, TypeToken typeToken, tc.a aVar, boolean z10) {
        com.google.gson.c0 a;
        Object b3 = rVar.g(new TypeToken(aVar.value())).b();
        boolean nullSafe = aVar.nullSafe();
        if (b3 instanceof com.google.gson.c0) {
            a = (com.google.gson.c0) b3;
        } else if (b3 instanceof com.google.gson.d0) {
            com.google.gson.d0 d0Var = (com.google.gson.d0) b3;
            if (z10) {
                com.google.gson.d0 d0Var2 = (com.google.gson.d0) this.f26447c.putIfAbsent(typeToken.a, d0Var);
                if (d0Var2 != null) {
                    d0Var = d0Var2;
                }
            }
            a = d0Var.a(nVar, typeToken);
        } else {
            throw new IllegalArgumentException("Invalid attempt to bind an instance of " + b3.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
        }
        if (a != null && nullSafe) {
            return a.a();
        }
        return a;
    }
}
