package org.koin.core.definition;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.koin.ext.KClassExtKt;
import p0.a;
import q0.l;
import x0.c;

/* loaded from: classes2.dex */
public final class BeanDefinition$toString$defOtherTypes$typesAsString$1 extends r implements l {
    public static final BeanDefinition$toString$defOtherTypes$typesAsString$1 INSTANCE = new BeanDefinition$toString$defOtherTypes$typesAsString$1();

    public BeanDefinition$toString$defOtherTypes$typesAsString$1() {
        super(1);
    }

    @Override // q0.l
    @NotNull
    public final CharSequence invoke(@NotNull c cVar) {
        a.s(cVar, "it");
        return KClassExtKt.getFullName(cVar);
    }
}
