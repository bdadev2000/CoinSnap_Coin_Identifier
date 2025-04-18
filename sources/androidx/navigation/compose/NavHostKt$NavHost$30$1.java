package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SizeTransform;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavHostKt$NavHost$30$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f20682a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComposeNavigator f20683b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f20684c;
    public final /* synthetic */ l d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f20685f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ State f20686g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ MutableState f20687h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$30$1(Map map, ComposeNavigator composeNavigator, l lVar, l lVar2, l lVar3, State state, MutableState mutableState) {
        super(1);
        this.f20682a = map;
        this.f20683b = composeNavigator;
        this.f20684c = lVar;
        this.d = lVar2;
        this.f20685f = lVar3;
        this.f20686g = state;
        this.f20687h = mutableState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        float f2;
        AnimatedContentTransitionScope animatedContentTransitionScope = (AnimatedContentTransitionScope) obj;
        if (!((List) this.f20686g.getValue()).contains(animatedContentTransitionScope.c())) {
            return AnimatedContentKt.d(EnterTransition.f1875a, ExitTransition.f1877a);
        }
        String str = ((NavBackStackEntry) animatedContentTransitionScope.c()).f20331g;
        Map map = this.f20682a;
        Float f3 = (Float) map.get(str);
        if (f3 != null) {
            f2 = f3.floatValue();
        } else {
            map.put(((NavBackStackEntry) animatedContentTransitionScope.c()).f20331g, Float.valueOf(0.0f));
            f2 = 0.0f;
        }
        if (!p0.a.g(((NavBackStackEntry) animatedContentTransitionScope.a()).f20331g, ((NavBackStackEntry) animatedContentTransitionScope.c()).f20331g)) {
            f2 = (((Boolean) this.f20683b.f20533c.getValue()).booleanValue() || ((Boolean) this.f20687h.getValue()).booleanValue()) ? f2 - 1.0f : f2 + 1.0f;
        }
        map.put(((NavBackStackEntry) animatedContentTransitionScope.a()).f20331g, Float.valueOf(f2));
        return new ContentTransform((EnterTransition) this.f20684c.invoke(animatedContentTransitionScope), (ExitTransition) this.d.invoke(animatedContentTransitionScope), f2, (SizeTransform) this.f20685f.invoke(animatedContentTransitionScope));
    }
}
