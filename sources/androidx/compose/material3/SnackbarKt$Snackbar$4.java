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
public final class SnackbarKt$Snackbar$4 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SnackbarData f11595a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f11596b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f11597c;
    public final /* synthetic */ Shape d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f11598f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f11599g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f11600h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f11601i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f11602j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11603k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f11604l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarKt$Snackbar$4(SnackbarData snackbarData, Modifier modifier, boolean z2, Shape shape, long j2, long j3, long j4, long j5, long j6, int i2, int i3) {
        super(2);
        this.f11595a = snackbarData;
        this.f11596b = modifier;
        this.f11597c = z2;
        this.d = shape;
        this.f11598f = j2;
        this.f11599g = j3;
        this.f11600h = j4;
        this.f11601i = j5;
        this.f11602j = j6;
        this.f11603k = i2;
        this.f11604l = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        SnackbarKt.b(this.f11595a, this.f11596b, this.f11597c, this.d, this.f11598f, this.f11599g, this.f11600h, this.f11601i, this.f11602j, (Composer) obj, RecomposeScopeImplKt.a(this.f11603k | 1), this.f11604l);
        return b0.f30125a;
    }
}
