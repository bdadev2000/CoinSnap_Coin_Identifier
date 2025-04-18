package org.koin.dsl;

import d0.a;
import org.jetbrains.annotations.NotNull;
import org.koin.core.module.KoinDslMarker;
import org.koin.core.module.Module;
import q0.l;

/* loaded from: classes3.dex */
public final class ModuleDSLKt {
    @KoinDslMarker
    @a
    @NotNull
    public static final Module module(boolean z2, boolean z3, @NotNull l lVar) {
        p0.a.s(lVar, "moduleDeclaration");
        Module module = new Module(z2);
        lVar.invoke(module);
        return module;
    }

    public static /* synthetic */ Module module$default(boolean z2, boolean z3, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        if ((i2 & 2) != 0) {
            z3 = false;
        }
        return module(z2, z3, lVar);
    }

    public static /* synthetic */ Module module$default(boolean z2, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        return module(z2, lVar);
    }

    @KoinDslMarker
    @NotNull
    public static final Module module(boolean z2, @NotNull l lVar) {
        p0.a.s(lVar, "moduleDeclaration");
        Module module = new Module(z2);
        lVar.invoke(module);
        return module;
    }
}
