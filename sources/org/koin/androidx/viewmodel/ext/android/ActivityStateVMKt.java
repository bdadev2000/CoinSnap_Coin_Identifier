package org.koin.androidx.viewmodel.ext.android;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.annotation.MainThread;
import androidx.lifecycle.ViewModel;
import d0.a;
import d0.h;
import d0.i;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.scope.ScopeExtKt;
import org.koin.core.qualifier.Qualifier;

/* loaded from: classes2.dex */
public final class ActivityStateVMKt {
    @a
    @MainThread
    public static final <T extends ViewModel> T getStateViewModel(ComponentActivity componentActivity, Qualifier qualifier, q0.a aVar, q0.a aVar2) {
        p0.a.s(componentActivity, "<this>");
        p0.a.s(aVar, "state");
        componentActivity.getViewModelStore();
        if (BundleExtKt.toExtras((Bundle) aVar.invoke(), componentActivity) == null) {
            p0.a.r(componentActivity.getDefaultViewModelCreationExtras(), "<get-defaultViewModelCreationExtras>(...)");
        }
        AndroidKoinScopeExtKt.getKoinScope(componentActivity);
        p0.a.A0();
        throw null;
    }

    public static ViewModel getStateViewModel$default(ComponentActivity componentActivity, Qualifier qualifier, q0.a aVar, q0.a aVar2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            aVar = ScopeExtKt.emptyState();
        }
        p0.a.s(componentActivity, "<this>");
        p0.a.s(aVar, "state");
        componentActivity.getViewModelStore();
        if (BundleExtKt.toExtras((Bundle) aVar.invoke(), componentActivity) == null) {
            p0.a.r(componentActivity.getDefaultViewModelCreationExtras(), "<get-defaultViewModelCreationExtras>(...)");
        }
        AndroidKoinScopeExtKt.getKoinScope(componentActivity);
        p0.a.A0();
        throw null;
    }

    @a
    @MainThread
    public static final <T extends ViewModel> h stateViewModel(ComponentActivity componentActivity, Qualifier qualifier, q0.a aVar, q0.a aVar2) {
        p0.a.s(componentActivity, "<this>");
        p0.a.s(aVar, "state");
        i iVar = i.f30131a;
        p0.a.A0();
        throw null;
    }

    public static h stateViewModel$default(ComponentActivity componentActivity, Qualifier qualifier, q0.a aVar, q0.a aVar2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            aVar = ScopeExtKt.emptyState();
        }
        p0.a.s(componentActivity, "<this>");
        p0.a.s(aVar, "state");
        i iVar = i.f30131a;
        p0.a.A0();
        throw null;
    }
}
