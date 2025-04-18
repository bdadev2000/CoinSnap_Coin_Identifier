package androidx.compose.material3;

import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SheetDefaultsKt$rememberSheetState$2$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f11193a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Density f11194b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SheetValue f11195c;
    public final /* synthetic */ l d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f11196f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SheetDefaultsKt$rememberSheetState$2$1(boolean z2, Density density, SheetValue sheetValue, l lVar, boolean z3) {
        super(0);
        this.f11193a = z2;
        this.f11194b = density;
        this.f11195c = sheetValue;
        this.d = lVar;
        this.f11196f = z3;
    }

    @Override // q0.a
    public final Object invoke() {
        return new SheetState(this.f11193a, this.f11194b, this.f11195c, this.d, this.f11196f);
    }
}
