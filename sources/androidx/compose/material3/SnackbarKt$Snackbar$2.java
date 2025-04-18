package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SnackbarKt$Snackbar$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f11583a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f11584b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f11585c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Shape f11586f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f11587g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f11588h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f11589i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f11590j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p f11591k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f11592l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f11593m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarKt$Snackbar$2(Modifier modifier, p pVar, p pVar2, boolean z2, Shape shape, long j2, long j3, long j4, long j5, p pVar3, int i2, int i3) {
        super(2);
        this.f11583a = modifier;
        this.f11584b = pVar;
        this.f11585c = pVar2;
        this.d = z2;
        this.f11586f = shape;
        this.f11587g = j2;
        this.f11588h = j3;
        this.f11589i = j4;
        this.f11590j = j5;
        this.f11591k = pVar3;
        this.f11592l = i2;
        this.f11593m = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        SnackbarKt.a(this.f11583a, this.f11584b, this.f11585c, this.d, this.f11586f, this.f11587g, this.f11588h, this.f11589i, this.f11590j, this.f11591k, (Composer) obj, RecomposeScopeImplKt.a(this.f11592l | 1), this.f11593m);
        return b0.f30125a;
    }
}
