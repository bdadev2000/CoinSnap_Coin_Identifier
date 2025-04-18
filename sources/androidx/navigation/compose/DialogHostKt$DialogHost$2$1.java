package androidx.navigation.compose;

import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.navigation.NavBackStackEntry;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.q;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.navigation.compose.DialogHostKt$DialogHost$2$1", f = "DialogHost.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class DialogHostKt$DialogHost$2$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ State f20563a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DialogNavigator f20564b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SnapshotStateList f20565c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogHostKt$DialogHost$2$1(State state, DialogNavigator dialogNavigator, SnapshotStateList snapshotStateList, g gVar) {
        super(2, gVar);
        this.f20563a = state;
        this.f20564b = dialogNavigator;
        this.f20565c = snapshotStateList;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new DialogHostKt$DialogHost$2$1(this.f20563a, this.f20564b, this.f20565c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        DialogHostKt$DialogHost$2$1 dialogHostKt$DialogHost$2$1 = (DialogHostKt$DialogHost$2$1) create((d0) obj, (g) obj2);
        b0 b0Var = b0.f30125a;
        dialogHostKt$DialogHost$2$1.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        q.m(obj);
        for (NavBackStackEntry navBackStackEntry : (Set) this.f20563a.getValue()) {
            DialogNavigator dialogNavigator = this.f20564b;
            if (!((List) dialogNavigator.b().e.f30313a.getValue()).contains(navBackStackEntry) && !this.f20565c.contains(navBackStackEntry)) {
                dialogNavigator.b().b(navBackStackEntry);
            }
        }
        return b0.f30125a;
    }
}
