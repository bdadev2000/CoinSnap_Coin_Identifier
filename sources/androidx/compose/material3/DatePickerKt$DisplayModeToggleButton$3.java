package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class DatePickerKt$DisplayModeToggleButton$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f8860a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8861b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f8862c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DisplayModeToggleButton$3(Modifier modifier, int i2, l lVar, int i3) {
        super(2);
        this.f8860a = modifier;
        this.f8861b = i2;
        this.f8862c = lVar;
        this.d = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.d | 1);
        int i2 = this.f8861b;
        l lVar = this.f8862c;
        DatePickerKt.d(this.f8860a, i2, lVar, (Composer) obj, a2);
        return b0.f30125a;
    }
}
