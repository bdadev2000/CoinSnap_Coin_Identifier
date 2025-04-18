package org.koin.androidx.viewmodel.ext.android;

import androidx.activity.ComponentActivity;
import androidx.annotation.MainThread;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.viewmodel.CreationExtras;
import d0.h;
import d0.i;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.qualifier.Qualifier;
import q0.a;

/* loaded from: classes2.dex */
public final class ActivityVMKt {
    @MainThread
    public static final <T extends ViewModel> T getViewModel(ComponentActivity componentActivity, Qualifier qualifier, a aVar, a aVar2) {
        p0.a.s(componentActivity, "<this>");
        componentActivity.getViewModelStore();
        if (aVar == null || ((CreationExtras) aVar.invoke()) == null) {
            p0.a.r(componentActivity.getDefaultViewModelCreationExtras(), "<get-defaultViewModelCreationExtras>(...)");
        }
        AndroidKoinScopeExtKt.getKoinScope(componentActivity);
        p0.a.A0();
        throw null;
    }

    public static ViewModel getViewModel$default(ComponentActivity componentActivity, Qualifier qualifier, a aVar, a aVar2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            aVar = null;
        }
        p0.a.s(componentActivity, "<this>");
        componentActivity.getViewModelStore();
        if (aVar == null || ((CreationExtras) aVar.invoke()) == null) {
            p0.a.r(componentActivity.getDefaultViewModelCreationExtras(), "<get-defaultViewModelCreationExtras>(...)");
        }
        AndroidKoinScopeExtKt.getKoinScope(componentActivity);
        p0.a.A0();
        throw null;
    }

    @MainThread
    public static final <T extends ViewModel> h viewModel(ComponentActivity componentActivity, Qualifier qualifier, a aVar, a aVar2) {
        p0.a.s(componentActivity, "<this>");
        i iVar = i.f30131a;
        p0.a.A0();
        throw null;
    }

    public static h viewModel$default(ComponentActivity componentActivity, Qualifier qualifier, a aVar, a aVar2, int i2, Object obj) {
        p0.a.s(componentActivity, "<this>");
        i iVar = i.f30131a;
        p0.a.A0();
        throw null;
    }
}
