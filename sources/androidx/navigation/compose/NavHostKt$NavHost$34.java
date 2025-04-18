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
/* loaded from: classes.dex */
public final class NavHostKt$NavHost$34 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavHostController f20697a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavGraph f20698b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f20699c;
    public final /* synthetic */ Alignment d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f20700f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f20701g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l f20702h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f20703i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f20704j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f20705k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f20706l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$34(NavHostController navHostController, NavGraph navGraph, Modifier modifier, Alignment alignment, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, int i2, int i3) {
        super(2);
        this.f20697a = navHostController;
        this.f20698b = navGraph;
        this.f20699c = modifier;
        this.d = alignment;
        this.f20700f = lVar;
        this.f20701g = lVar2;
        this.f20702h = lVar3;
        this.f20703i = lVar4;
        this.f20704j = lVar5;
        this.f20705k = i2;
        this.f20706l = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        NavHostKt.a(this.f20697a, this.f20698b, this.f20699c, this.d, this.f20700f, this.f20701g, this.f20702h, this.f20703i, this.f20704j, (Composer) obj, RecomposeScopeImplKt.a(this.f20705k | 1), this.f20706l);
        return b0.f30125a;
    }
}
