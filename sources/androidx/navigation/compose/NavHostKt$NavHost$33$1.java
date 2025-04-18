package androidx.navigation.compose;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.q;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.navigation.compose.NavHostKt$NavHost$33$1", f = "NavHost.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NavHostKt$NavHost$33$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Transition f20694a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f20695b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ State f20696c;
    public final /* synthetic */ ComposeNavigator d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$33$1(Transition transition, Map map, State state, ComposeNavigator composeNavigator, g gVar) {
        super(2, gVar);
        this.f20694a = transition;
        this.f20695b = map;
        this.f20696c = state;
        this.d = composeNavigator;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new NavHostKt$NavHost$33$1(this.f20694a, this.f20695b, this.f20696c, this.d, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        NavHostKt$NavHost$33$1 navHostKt$NavHost$33$1 = (NavHostKt$NavHost$33$1) create((d0) obj, (g) obj2);
        b0 b0Var = b0.f30125a;
        navHostKt$NavHost$33$1.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        q.m(obj);
        Transition transition = this.f20694a;
        if (p0.a.g(transition.f2267a.a(), transition.d.getValue())) {
            Iterator it = ((List) this.f20696c.getValue()).iterator();
            while (it.hasNext()) {
                this.d.b().b((NavBackStackEntry) it.next());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map map = this.f20695b;
            for (Map.Entry entry : map.entrySet()) {
                if (!p0.a.g(entry.getKey(), ((NavBackStackEntry) r7.getValue()).f20331g)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                map.remove(((Map.Entry) it2.next()).getKey());
            }
        }
        return b0.f30125a;
    }
}
