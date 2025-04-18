package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.navigation.NavGraph;
import androidx.navigation.NavHostController;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class NavHostKt$NavHost$dialogNavigator$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavHostController f20731a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavGraph f20732b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f20733c;
    public final /* synthetic */ Alignment d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f20734f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f20735g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l f20736h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f20737i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f20738j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f20739k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f20740l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$dialogNavigator$1(NavHostController navHostController, NavGraph navGraph, Modifier modifier, Alignment alignment, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, int i2, int i3) {
        super(2);
        this.f20731a = navHostController;
        this.f20732b = navGraph;
        this.f20733c = modifier;
        this.d = alignment;
        this.f20734f = lVar;
        this.f20735g = lVar2;
        this.f20736h = lVar3;
        this.f20737i = lVar4;
        this.f20738j = lVar5;
        this.f20739k = i2;
        this.f20740l = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        NavHostKt.a(this.f20731a, this.f20732b, this.f20733c, this.d, this.f20734f, this.f20735g, this.f20736h, this.f20737i, this.f20738j, (Composer) obj, RecomposeScopeImplKt.a(this.f20739k | 1), this.f20740l);
        return b0.f30125a;
    }
}
