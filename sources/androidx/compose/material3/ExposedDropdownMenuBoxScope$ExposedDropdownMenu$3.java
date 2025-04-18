package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ExposedDropdownMenuBoxScope$ExposedDropdownMenu$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExposedDropdownMenuBoxScope f9290a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f9291b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0.a f9292c;
    public final /* synthetic */ Modifier d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ScrollState f9293f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f9294g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Shape f9295h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f9296i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f9297j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f9298k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BorderStroke f9299l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q f9300m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f9301n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f9302o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f9303p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuBoxScope$ExposedDropdownMenu$3(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, boolean z2, q0.a aVar, Modifier modifier, ScrollState scrollState, boolean z3, Shape shape, long j2, float f2, float f3, BorderStroke borderStroke, q qVar, int i2, int i3, int i4) {
        super(2);
        this.f9290a = exposedDropdownMenuBoxScope;
        this.f9291b = z2;
        this.f9292c = aVar;
        this.d = modifier;
        this.f9293f = scrollState;
        this.f9294g = z3;
        this.f9295h = shape;
        this.f9296i = j2;
        this.f9297j = f2;
        this.f9298k = f3;
        this.f9299l = borderStroke;
        this.f9300m = qVar;
        this.f9301n = i2;
        this.f9302o = i3;
        this.f9303p = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f9290a.a(this.f9291b, this.f9292c, this.d, this.f9293f, this.f9294g, this.f9295h, this.f9296i, this.f9297j, this.f9298k, this.f9299l, this.f9300m, (Composer) obj, RecomposeScopeImplKt.a(this.f9301n | 1), RecomposeScopeImplKt.a(this.f9302o), this.f9303p);
        return b0.f30125a;
    }
}
