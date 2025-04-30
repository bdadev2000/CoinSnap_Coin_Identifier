package com.google.protobuf;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.protobuf.o4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1969o4 {
    private static final C1969o4 INSTANCE = new C1969o4();
    private final ConcurrentMap<Class<?>, InterfaceC2038y4> schemaCache = new ConcurrentHashMap();
    private final InterfaceC2045z4 schemaFactory = new C3();

    private C1969o4() {
    }

    public static C1969o4 getInstance() {
        return INSTANCE;
    }

    public int getTotalSchemaSize() {
        int i9 = 0;
        for (InterfaceC2038y4 interfaceC2038y4 : this.schemaCache.values()) {
            if (interfaceC2038y4 instanceof R3) {
                i9 = ((R3) interfaceC2038y4).getSchemaSize() + i9;
            }
        }
        return i9;
    }

    public <T> boolean isInitialized(T t9) {
        return schemaFor((C1969o4) t9).isInitialized(t9);
    }

    public <T> void makeImmutable(T t9) {
        schemaFor((C1969o4) t9).makeImmutable(t9);
    }

    public <T> void mergeFrom(T t9, InterfaceC1996s4 interfaceC1996s4) throws IOException {
        mergeFrom(t9, interfaceC1996s4, W1.getEmptyRegistry());
    }

    public InterfaceC2038y4 registerSchema(Class<?> cls, InterfaceC2038y4 interfaceC2038y4) {
        C1898e3.checkNotNull(cls, "messageType");
        C1898e3.checkNotNull(interfaceC2038y4, "schema");
        return this.schemaCache.putIfAbsent(cls, interfaceC2038y4);
    }

    public InterfaceC2038y4 registerSchemaOverride(Class<?> cls, InterfaceC2038y4 interfaceC2038y4) {
        C1898e3.checkNotNull(cls, "messageType");
        C1898e3.checkNotNull(interfaceC2038y4, "schema");
        return this.schemaCache.put(cls, interfaceC2038y4);
    }

    public <T> InterfaceC2038y4 schemaFor(Class<T> cls) {
        C1898e3.checkNotNull(cls, "messageType");
        InterfaceC2038y4 interfaceC2038y4 = this.schemaCache.get(cls);
        if (interfaceC2038y4 != null) {
            return interfaceC2038y4;
        }
        InterfaceC2038y4 createSchema = ((C3) this.schemaFactory).createSchema(cls);
        InterfaceC2038y4 registerSchema = registerSchema(cls, createSchema);
        return registerSchema != null ? registerSchema : createSchema;
    }

    public <T> void writeTo(T t9, a6 a6Var) throws IOException {
        schemaFor((C1969o4) t9).writeTo(t9, a6Var);
    }

    public <T> void mergeFrom(T t9, InterfaceC1996s4 interfaceC1996s4, W1 w1) throws IOException {
        schemaFor((C1969o4) t9).mergeFrom(t9, interfaceC1996s4, w1);
    }

    public <T> InterfaceC2038y4 schemaFor(T t9) {
        return schemaFor((Class) t9.getClass());
    }
}
