package vc;

/* loaded from: classes3.dex */
public final class i0 extends com.google.gson.c0 {
    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee " + c6.c.i("java-lang-class-unsupported"));
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?\nSee " + c6.c.i("java-lang-class-unsupported"));
    }
}
