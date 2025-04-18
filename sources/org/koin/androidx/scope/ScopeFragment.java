package org.koin.androidx.scope;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.fragment.app.Fragment;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import d0.h;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.scope.AndroidScopeComponent;
import org.koin.core.scope.Scope;
import p0.a;

/* loaded from: classes4.dex */
public abstract class ScopeFragment extends Fragment implements AndroidScopeComponent {

    @NotNull
    private final h scope$delegate;

    public ScopeFragment() {
        this(0, 1, null);
    }

    @Override // org.koin.android.scope.AndroidScopeComponent
    @NotNull
    public Scope getScope() {
        return (Scope) this.scope$delegate.getValue();
    }

    @Override // org.koin.android.scope.AndroidScopeComponent
    public void onCloseScope() {
        AndroidScopeComponent.DefaultImpls.onCloseScope(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        a.s(view, ViewHierarchyConstants.VIEW_KEY);
        super.onViewCreated(view, bundle);
        if (getScope() == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    public /* synthetic */ ScopeFragment(int i2, int i3, k kVar) {
        this((i3 & 1) != 0 ? 0 : i2);
    }

    public ScopeFragment(@LayoutRes int i2) {
        super(i2);
        this.scope$delegate = FragmentExtKt.fragmentScope$default(this, false, 1, null);
    }
}
