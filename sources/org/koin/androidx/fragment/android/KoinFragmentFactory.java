package org.koin.androidx.fragment.android;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.scope.Scope;
import p0.a;

/* loaded from: classes3.dex */
public final class KoinFragmentFactory extends FragmentFactory implements KoinComponent {

    @Nullable
    private final Scope scope;

    public KoinFragmentFactory() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // androidx.fragment.app.FragmentFactory
    @NotNull
    public Fragment instantiate(@NotNull ClassLoader classLoader, @NotNull String str) {
        a.s(classLoader, "classLoader");
        a.s(str, "className");
        j a2 = g0.a(Class.forName(str));
        Scope scope = this.scope;
        Fragment fragment = scope != null ? (Fragment) Scope.getOrNull$default(scope, a2, null, null, 6, null) : (Fragment) Koin.getOrNull$default(getKoin(), a2, null, null, 6, null);
        if (fragment != null) {
            return fragment;
        }
        Fragment instantiate = super.instantiate(classLoader, str);
        a.r(instantiate, "instantiate(...)");
        return instantiate;
    }

    public KoinFragmentFactory(@Nullable Scope scope) {
        this.scope = scope;
    }

    public /* synthetic */ KoinFragmentFactory(Scope scope, int i2, k kVar) {
        this((i2 & 1) != 0 ? null : scope);
    }
}
