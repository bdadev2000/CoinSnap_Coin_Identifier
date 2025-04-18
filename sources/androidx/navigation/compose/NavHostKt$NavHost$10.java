package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.navigation.NavHostController;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavHostKt$NavHost$10 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavHostController f20589a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f20590b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f20591c;
    public final /* synthetic */ Alignment d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f20592f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f20593g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l f20594h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f20595i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f20596j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l f20597k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f20598l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f20599m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f20600n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f20601o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$10(NavHostController navHostController, String str, Modifier modifier, Alignment alignment, String str2, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, l lVar6, int i2, int i3, int i4) {
        super(2);
        this.f20589a = navHostController;
        this.f20590b = str;
        this.f20591c = modifier;
        this.d = alignment;
        this.f20592f = str2;
        this.f20593g = lVar;
        this.f20594h = lVar2;
        this.f20595i = lVar3;
        this.f20596j = lVar4;
        this.f20597k = lVar5;
        this.f20598l = lVar6;
        this.f20599m = i2;
        this.f20600n = i3;
        this.f20601o = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        NavHostKt.b(this.f20589a, this.f20590b, this.f20591c, this.d, this.f20592f, this.f20593g, this.f20594h, this.f20595i, this.f20596j, this.f20597k, this.f20598l, (Composer) obj, RecomposeScopeImplKt.a(this.f20599m | 1), RecomposeScopeImplKt.a(this.f20600n), this.f20601o);
        return b0.f30125a;
    }
}
