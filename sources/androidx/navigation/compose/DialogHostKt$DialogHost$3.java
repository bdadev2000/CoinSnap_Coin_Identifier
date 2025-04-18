package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class DialogHostKt$DialogHost$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogNavigator f20566a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20567b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogHostKt$DialogHost$3(DialogNavigator dialogNavigator, int i2) {
        super(2);
        this.f20566a = dialogNavigator;
        this.f20567b = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f20567b | 1);
        DialogHostKt.a(this.f20566a, (Composer) obj, a2);
        return b0.f30125a;
    }
}
