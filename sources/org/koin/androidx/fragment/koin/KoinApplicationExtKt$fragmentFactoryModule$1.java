package org.koin.androidx.fragment.koin;

import androidx.fragment.app.FragmentFactory;
import com.applovin.impl.adview.t;
import d0.b0;
import e0.w;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.koin.androidx.fragment.android.KoinFragmentFactory;
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

/* loaded from: classes3.dex */
public final class KoinApplicationExtKt$fragmentFactoryModule$1 extends r implements l {
    public static final KoinApplicationExtKt$fragmentFactoryModule$1 INSTANCE = new KoinApplicationExtKt$fragmentFactoryModule$1();

    /* renamed from: org.koin.androidx.fragment.koin.KoinApplicationExtKt$fragmentFactoryModule$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends r implements p {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // q0.p
        @NotNull
        public final FragmentFactory invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            a.s(scope, "$this$single");
            a.s(parametersHolder, "it");
            return new KoinFragmentFactory(null, 1, 0 == true ? 1 : 0);
        }
    }

    public KoinApplicationExtKt$fragmentFactoryModule$1() {
        super(1);
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Module) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull Module module) {
        a.s(module, "$this$module");
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        SingleInstanceFactory<?> p2 = t.p(new BeanDefinition(ScopeRegistry.Companion.getRootScopeQualifier(), g0.a(FragmentFactory.class), null, anonymousClass1, Kind.Singleton, w.f30218a), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(p2);
        }
        new KoinDefinition(module, p2);
    }
}
