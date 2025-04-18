package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class BottomSheetDefaults$DragHandle$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomSheetDefaults f7925a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f7926b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f7927c;
    public final /* synthetic */ float d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Shape f7928f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f7929g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7930h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7931i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetDefaults$DragHandle$3(BottomSheetDefaults bottomSheetDefaults, Modifier modifier, float f2, float f3, Shape shape, long j2, int i2, int i3) {
        super(2);
        this.f7925a = bottomSheetDefaults;
        this.f7926b = modifier;
        this.f7927c = f2;
        this.d = f3;
        this.f7928f = shape;
        this.f7929g = j2;
        this.f7930h = i2;
        this.f7931i = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        BottomSheetDefaults bottomSheetDefaults = this.f7925a;
        Modifier modifier = this.f7926b;
        float f2 = this.f7927c;
        float f3 = this.d;
        Shape shape = this.f7928f;
        long j2 = this.f7929g;
        bottomSheetDefaults.a(f2, f3, RecomposeScopeImplKt.a(this.f7930h | 1), this.f7931i, j2, (Composer) obj, modifier, shape);
        return b0.f30125a;
    }
}
