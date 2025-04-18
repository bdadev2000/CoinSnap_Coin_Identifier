package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.Brush;
import d0.b0;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class VectorComposeKt$Path$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f15439a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15440b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f15441c;
    public final /* synthetic */ Brush d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f15442f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Brush f15443g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f15444h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f15445i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f15446j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15447k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f15448l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f15449m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f15450n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f15451o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f15452p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f15453q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15454r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorComposeKt$Path$3(List list, int i2, String str, Brush brush, float f2, Brush brush2, float f3, float f4, int i3, int i4, float f5, float f6, float f7, float f8, int i5, int i6, int i7) {
        super(2);
        this.f15439a = list;
        this.f15440b = i2;
        this.f15441c = str;
        this.d = brush;
        this.f15442f = f2;
        this.f15443g = brush2;
        this.f15444h = f3;
        this.f15445i = f4;
        this.f15446j = i3;
        this.f15447k = i4;
        this.f15448l = f5;
        this.f15449m = f6;
        this.f15450n = f7;
        this.f15451o = f8;
        this.f15452p = i5;
        this.f15453q = i6;
        this.f15454r = i7;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        VectorComposeKt.b(this.f15439a, this.f15440b, this.f15441c, this.d, this.f15442f, this.f15443g, this.f15444h, this.f15445i, this.f15446j, this.f15447k, this.f15448l, this.f15449m, this.f15450n, this.f15451o, (Composer) obj, RecomposeScopeImplKt.a(this.f15452p | 1), RecomposeScopeImplKt.a(this.f15453q), this.f15454r);
        return b0.f30125a;
    }
}
