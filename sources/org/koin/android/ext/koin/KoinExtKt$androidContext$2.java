package org.koin.android.ext.koin;

import android.content.Context;
import com.applovin.impl.adview.t;
import d0.b0;
import e0.w;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import p0.a;
import q0.l;
import q0.p;

/* loaded from: classes2.dex */
public final class KoinExtKt$androidContext$2 extends r implements l {
    final /* synthetic */ Context $androidContext;

    /* renamed from: org.koin.android.ext.koin.KoinExtKt$androidContext$2$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends r implements p {
        final /* synthetic */ Context $androidContext;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context) {
            super(2);
            this.$androidContext = context;
        }

        @Override // q0.p
        @NotNull
        public final Context invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            a.s(scope, "$this$single");
            a.s(parametersHolder, "it");
            return this.$androidContext;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KoinExtKt$androidContext$2(Context context) {
        super(1);
        this.$androidContext = context;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Module) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull Module module) {
        a.s(module, "$this$module");
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$androidContext);
        SingleInstanceFactory<?> p2 = t.p(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), g0.a(Context.class), null, anonymousClass1, Kind.Singleton, w.f30218a), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(p2);
        }
        new KoinDefinition(module, p2);
    }
}
