package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TimePickerKt$CircularLayout$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f12339a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f12340b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f12341c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f12342f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$CircularLayout$2(Modifier modifier, float f2, p pVar, int i2, int i3) {
        super(2);
        this.f12339a = modifier;
        this.f12340b = f2;
        this.f12341c = pVar;
        this.d = i2;
        this.f12342f = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        TimePickerKt.m(this.f12339a, this.f12340b, this.f12341c, (Composer) obj, RecomposeScopeImplKt.a(this.d | 1), this.f12342f);
        return b0.f30125a;
    }
}
