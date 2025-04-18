package org.koin.androidx.scope;

import android.os.Bundle;
import androidx.annotation.LayoutRes;
import androidx.appcompat.app.AppCompatActivity;
import d0.h;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.scope.AndroidScopeComponent;
import org.koin.core.scope.Scope;

/* loaded from: classes3.dex */
public abstract class RetainedScopeActivity extends AppCompatActivity implements AndroidScopeComponent {

    @NotNull
    private final h scope$delegate;

    public RetainedScopeActivity() {
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

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (getScope() == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    public /* synthetic */ RetainedScopeActivity(int i2, int i3, k kVar) {
        this((i3 & 1) != 0 ? 0 : i2);
    }

    public RetainedScopeActivity(@LayoutRes int i2) {
        super(i2);
        this.scope$delegate = ComponentActivityExtKt.activityRetainedScope(this);
    }
}
