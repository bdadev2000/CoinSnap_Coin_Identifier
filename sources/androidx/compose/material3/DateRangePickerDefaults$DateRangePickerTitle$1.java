package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class DateRangePickerDefaults$DateRangePickerTitle$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DateRangePickerDefaults f9085a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9086b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f9087c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9088f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerDefaults$DateRangePickerTitle$1(DateRangePickerDefaults dateRangePickerDefaults, int i2, Modifier modifier, int i3, int i4) {
        super(2);
        this.f9085a = dateRangePickerDefaults;
        this.f9086b = i2;
        this.f9087c = modifier;
        this.d = i3;
        this.f9088f = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f9085a.c(this.f9086b, this.f9087c, (Composer) obj, RecomposeScopeImplKt.a(this.d | 1), this.f9088f);
        return b0.f30125a;
    }
}
