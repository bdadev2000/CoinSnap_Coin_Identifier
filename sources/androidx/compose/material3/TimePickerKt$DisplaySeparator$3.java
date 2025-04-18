package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class TimePickerKt$DisplaySeparator$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f12389a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12390b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$DisplaySeparator$3(Modifier modifier, int i2) {
        super(2);
        this.f12389a = modifier;
        this.f12390b = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f12390b | 1);
        TimePickerKt.o(this.f12389a, (Composer) obj, a2);
        return b0.f30125a;
    }
}
