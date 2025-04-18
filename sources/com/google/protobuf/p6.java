package com.google.protobuf;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes4.dex */
public final class p6 {
    private static final p6 INSTANCE = new p6();
    private final ConcurrentMap<Class<?>, z6> schemaCache = new ConcurrentHashMap();
    private final a7 schemaFactory = new d5();

    private p6() {
    }

    public static p6 getInstance() {
        return INSTANCE;
    }

    public int getTotalSchemaSize() {
        int i10 = 0;
        for (z6 z6Var : this.schemaCache.values()) {
            if (z6Var instanceof s5) {
                i10 = ((s5) z6Var).getSchemaSize() + i10;
            }
        }
        return i10;
    }

    public <T> boolean isInitialized(T t5) {
        return schemaFor((p6) t5).isInitialized(t5);
    }

    public <T> void makeImmutable(T t5) {
        schemaFor((p6) t5).makeImmutable(t5);
    }

    public <T> void mergeFrom(T t5, t6 t6Var) throws IOException {
        mergeFrom(t5, t6Var, a2.getEmptyRegistry());
    }

    public z6 registerSchema(Class<?> cls, z6 z6Var) {
        f4.checkNotNull(cls, "messageType");
        f4.checkNotNull(z6Var, "schema");
        return this.schemaCache.putIfAbsent(cls, z6Var);
    }

    public z6 registerSchemaOverride(Class<?> cls, z6 z6Var) {
        f4.checkNotNull(cls, "messageType");
        f4.checkNotNull(z6Var, "schema");
        return this.schemaCache.put(cls, z6Var);
    }

    public <T> z6 schemaFor(Class<T> cls) {
        f4.checkNotNull(cls, "messageType");
        z6 z6Var = this.schemaCache.get(cls);
        if (z6Var != null) {
            return z6Var;
        }
        z6 createSchema = ((d5) this.schemaFactory).createSchema(cls);
        z6 registerSchema = registerSchema(cls, createSchema);
        return registerSchema != null ? registerSchema : createSchema;
    }

    public <T> void writeTo(T t5, ba baVar) throws IOException {
        schemaFor((p6) t5).writeTo(t5, baVar);
    }

    public <T> void mergeFrom(T t5, t6 t6Var, a2 a2Var) throws IOException {
        schemaFor((p6) t5).mergeFrom(t5, t6Var, a2Var);
    }

    public <T> z6 schemaFor(T t5) {
        return schemaFor((Class) t5.getClass());
    }
}
