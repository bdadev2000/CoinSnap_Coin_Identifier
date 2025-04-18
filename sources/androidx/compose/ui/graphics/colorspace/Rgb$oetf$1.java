package androidx.compose.ui.graphics.colorspace;

import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Rgb$oetf$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Rgb f15117a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rgb$oetf$1(Rgb rgb) {
        super(1);
        this.f15117a = rgb;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return Double.valueOf(p0.a.y(this.f15117a.f15109k.c(((Number) obj).doubleValue()), r10.e, r10.f15104f));
    }
}
