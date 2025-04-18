package androidx.navigation.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavigatorState;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class DialogHostKt$DialogHost$1$2$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SnapshotStateList f20558a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f20559b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DialogNavigator f20560c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogHostKt$DialogHost$1$2$1$1(SnapshotStateList snapshotStateList, NavBackStackEntry navBackStackEntry, DialogNavigator dialogNavigator) {
        super(1);
        this.f20558a = snapshotStateList;
        this.f20559b = navBackStackEntry;
        this.f20560c = dialogNavigator;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        final SnapshotStateList snapshotStateList = this.f20558a;
        final NavBackStackEntry navBackStackEntry = this.f20559b;
        snapshotStateList.add(navBackStackEntry);
        final DialogNavigator dialogNavigator = this.f20560c;
        return new DisposableEffectResult() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$2$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                NavigatorState b2 = dialogNavigator.b();
                NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
                b2.b(navBackStackEntry2);
                snapshotStateList.remove(navBackStackEntry2);
            }
        };
    }
}
