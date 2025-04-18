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
public final class NavHostKt$NavHost$composeNavigator$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavHostController f20721a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavGraph f20722b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f20723c;
    public final /* synthetic */ Alignment d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f20724f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f20725g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l f20726h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f20727i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f20728j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f20729k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f20730l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$composeNavigator$1(NavHostController navHostController, NavGraph navGraph, Modifier modifier, Alignment alignment, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, int i2, int i3) {
        super(2);
        this.f20721a = navHostController;
        this.f20722b = navGraph;
        this.f20723c = modifier;
        this.d = alignment;
        this.f20724f = lVar;
        this.f20725g = lVar2;
        this.f20726h = lVar3;
        this.f20727i = lVar4;
        this.f20728j = lVar5;
        this.f20729k = i2;
        this.f20730l = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        NavHostKt.a(this.f20721a, this.f20722b, this.f20723c, this.d, this.f20724f, this.f20725g, this.f20726h, this.f20727i, this.f20728j, (Composer) obj, RecomposeScopeImplKt.a(this.f20729k | 1), this.f20730l);
        return b0.f30125a;
    }
}
