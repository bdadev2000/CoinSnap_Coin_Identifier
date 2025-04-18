package androidx.navigation.compose;

import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import java.util.List;
import kotlin.jvm.internal.q;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.navigation.compose.NavHostKt$NavHost$28$1", f = "NavHost.kt", l = {612}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NavHostKt$NavHost$28$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f20668a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SeekableTransitionState f20669b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ State f20670c;
    public final /* synthetic */ MutableFloatState d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$28$1(SeekableTransitionState seekableTransitionState, State state, MutableFloatState mutableFloatState, g gVar) {
        super(2, gVar);
        this.f20669b = seekableTransitionState;
        this.f20670c = state;
        this.d = mutableFloatState;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new NavHostKt$NavHost$28$1(this.f20669b, this.f20670c, this.d, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((NavHostKt$NavHost$28$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f20668a;
        if (i2 == 0) {
            q.m(obj);
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) ((List) this.f20670c.getValue()).get(((List) r4.getValue()).size() - 2);
            float c2 = this.d.c();
            this.f20668a = 1;
            if (this.f20669b.n(c2, navBackStackEntry, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0.f30125a;
    }
}
