package org.koin.androidx.scope;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.koin.core.scope.Scope;
import q0.a;

/* loaded from: classes.dex */
public final class FragmentExtKt$fragmentScope$1 extends r implements a {
    final /* synthetic */ Fragment $this_fragmentScope;
    final /* synthetic */ boolean $useParentActivityScope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentExtKt$fragmentScope$1(Fragment fragment, boolean z2) {
        super(0);
        this.$this_fragmentScope = fragment;
        this.$useParentActivityScope = z2;
    }

    @Override // q0.a
    @NotNull
    public final Scope invoke() {
        return FragmentExtKt.createFragmentScope(this.$this_fragmentScope, this.$useParentActivityScope);
    }
}
