package com.google.gson;

/* loaded from: classes3.dex */
public final class m extends vc.w {
    public c0 a = null;

    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        c0 c0Var = this.a;
        if (c0Var != null) {
            return c0Var.b(aVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        c0 c0Var = this.a;
        if (c0Var != null) {
            c0Var.c(bVar, obj);
            return;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // vc.w
    public final c0 d() {
        c0 c0Var = this.a;
        if (c0Var != null) {
            return c0Var;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
