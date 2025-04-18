package androidx.navigation.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class NavHostKt$NavHost$27$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ State f20666a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComposeNavigator f20667b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$27$1(State state, ComposeNavigator composeNavigator) {
        super(1);
        this.f20666a = state;
        this.f20667b = composeNavigator;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        final State state = this.f20666a;
        final ComposeNavigator composeNavigator = this.f20667b;
        return new DisposableEffectResult() { // from class: androidx.navigation.compose.NavHostKt$NavHost$27$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                Iterator it = ((List) State.this.getValue()).iterator();
                while (it.hasNext()) {
                    composeNavigator.b().b((NavBackStackEntry) it.next());
                }
            }
        };
    }
}
