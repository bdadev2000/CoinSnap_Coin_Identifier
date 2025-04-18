package androidx.navigation.compose;

import androidx.activity.BackEventCompat;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import d0.b0;
import e0.u;
import e1.h;
import h0.g;
import j0.e;
import j0.i;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.q;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.navigation.compose.NavHostKt$NavHost$25$1", f = "NavHost.kt", l = {521}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class NavHostKt$NavHost$25$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f20657a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f20658b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ComposeNavigator f20659c;
    public final /* synthetic */ MutableFloatState d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ State f20660f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MutableState f20661g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$25$1(ComposeNavigator composeNavigator, MutableFloatState mutableFloatState, State state, MutableState mutableState, g gVar) {
        super(2, gVar);
        this.f20659c = composeNavigator;
        this.d = mutableFloatState;
        this.f20660f = state;
        this.f20661g = mutableState;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        NavHostKt$NavHost$25$1 navHostKt$NavHost$25$1 = new NavHostKt$NavHost$25$1(this.f20659c, this.d, this.f20660f, this.f20661g, gVar);
        navHostKt$NavHost$25$1.f20658b = obj;
        return navHostKt$NavHost$25$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((NavHostKt$NavHost$25$1) create((h) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        NavBackStackEntry navBackStackEntry;
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f20657a;
        final MutableState mutableState = this.f20661g;
        ComposeNavigator composeNavigator = this.f20659c;
        try {
            if (i2 == 0) {
                q.m(obj);
                h hVar = (h) this.f20658b;
                final MutableFloatState mutableFloatState = this.d;
                mutableFloatState.n(0.0f);
                State state = this.f20660f;
                NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) u.M0((List) state.getValue());
                p0.a.p(navBackStackEntry2);
                composeNavigator.b().e(navBackStackEntry2);
                composeNavigator.b().e((NavBackStackEntry) ((List) state.getValue()).get(((List) state.getValue()).size() - 2));
                e1.i iVar = new e1.i() { // from class: androidx.navigation.compose.NavHostKt$NavHost$25$1.1
                    @Override // e1.i
                    public final Object emit(Object obj2, g gVar) {
                        MutableState.this.setValue(Boolean.TRUE);
                        mutableFloatState.n(((BackEventCompat) obj2).f135c);
                        return b0.f30125a;
                    }
                };
                this.f20658b = navBackStackEntry2;
                this.f20657a = 1;
                if (hVar.collect(iVar, this) == aVar) {
                    return aVar;
                }
                navBackStackEntry = navBackStackEntry2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                navBackStackEntry = (NavBackStackEntry) this.f20658b;
                q.m(obj);
            }
            mutableState.setValue(Boolean.FALSE);
            composeNavigator.e(navBackStackEntry, false);
        } catch (CancellationException unused) {
            mutableState.setValue(Boolean.FALSE);
        }
        return b0.f30125a;
    }
}
