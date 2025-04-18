package androidx.navigation.compose;

import androidx.navigation.NavBackStackEntry;
import d0.b0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class DialogHostKt$DialogHost$1$1$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogNavigator f20552a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f20553b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogHostKt$DialogHost$1$1$1(DialogNavigator dialogNavigator, NavBackStackEntry navBackStackEntry) {
        super(0);
        this.f20552a = dialogNavigator;
        this.f20553b = navBackStackEntry;
    }

    @Override // q0.a
    public final Object invoke() {
        this.f20552a.e(this.f20553b, false);
        return b0.f30125a;
    }
}
