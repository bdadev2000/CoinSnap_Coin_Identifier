package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.Shape;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavigationItemKt$NavigationItemLayout$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InteractionSource f10273a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f10274b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Shape f10275c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10276f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f10277g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q0.a f10278h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f10279i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f10280j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f10281k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f10282l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f10283m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f10284n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10285o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationItemKt$NavigationItemLayout$2(InteractionSource interactionSource, long j2, Shape shape, p pVar, int i2, p pVar2, q0.a aVar, float f2, float f3, float f4, float f5, float f6, int i3, int i4) {
        super(2);
        this.f10273a = interactionSource;
        this.f10274b = j2;
        this.f10275c = shape;
        this.d = pVar;
        this.f10276f = i2;
        this.f10277g = pVar2;
        this.f10278h = aVar;
        this.f10279i = f2;
        this.f10280j = f3;
        this.f10281k = f4;
        this.f10282l = f5;
        this.f10283m = f6;
        this.f10284n = i3;
        this.f10285o = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        NavigationItemKt.b(this.f10273a, this.f10274b, this.f10275c, this.d, this.f10276f, this.f10277g, this.f10278h, this.f10279i, this.f10280j, this.f10281k, this.f10282l, this.f10283m, (Composer) obj, RecomposeScopeImplKt.a(this.f10284n | 1), RecomposeScopeImplKt.a(this.f10285o));
        return b0.f30125a;
    }
}
