package org.koin.androidx.fragment.android;

import android.os.Bundle;
import androidx.annotation.IdRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentTransaction;
import kotlin.jvm.internal.g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.scope.Scope;
import p0.a;

/* loaded from: classes.dex */
public final class ActivityExtKt {
    public static final <F extends Fragment> FragmentTransaction replace(FragmentTransaction fragmentTransaction, @IdRes int i2, Bundle bundle, String str) {
        a.s(fragmentTransaction, "<this>");
        a.A0();
        throw null;
    }

    public static FragmentTransaction replace$default(FragmentTransaction fragmentTransaction, int i2, Bundle bundle, String str, int i3, Object obj) {
        a.s(fragmentTransaction, "<this>");
        a.A0();
        throw null;
    }

    public static final void setupKoinFragmentFactory(@NotNull FragmentActivity fragmentActivity, @Nullable Scope scope) {
        a.s(fragmentActivity, "<this>");
        if (scope == null) {
            fragmentActivity.getSupportFragmentManager().f19759y = (FragmentFactory) AndroidKoinScopeExtKt.getKoinScope(fragmentActivity).get(g0.a(FragmentFactory.class), null, null);
        } else {
            fragmentActivity.getSupportFragmentManager().f19759y = new KoinFragmentFactory(scope);
        }
    }

    public static /* synthetic */ void setupKoinFragmentFactory$default(FragmentActivity fragmentActivity, Scope scope, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            scope = null;
        }
        setupKoinFragmentFactory(fragmentActivity, scope);
    }
}
