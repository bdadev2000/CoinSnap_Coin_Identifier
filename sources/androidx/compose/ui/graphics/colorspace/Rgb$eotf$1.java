package androidx.compose.ui.graphics.colorspace;

import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Rgb$eotf$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Rgb f15116a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rgb$eotf$1(Rgb rgb) {
        super(1);
        this.f15116a = rgb;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        return Double.valueOf(this.f15116a.f15112n.c(p0.a.y(doubleValue, r8.e, r8.f15104f)));
    }
}
