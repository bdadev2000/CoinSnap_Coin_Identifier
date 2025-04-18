package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes4.dex */
final class ChipKt$SelectableChip$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectableChipColors f8427a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f8428b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f8429c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TextStyle f8430f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f8431g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p f8432h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f8433i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f8434j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f8435k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipKt$SelectableChip$2(SelectableChipColors selectableChipColors, boolean z2, boolean z3, p pVar, TextStyle textStyle, p pVar2, p pVar3, p pVar4, float f2, PaddingValues paddingValues) {
        super(2);
        this.f8427a = selectableChipColors;
        this.f8428b = z2;
        this.f8429c = z3;
        this.d = pVar;
        this.f8430f = textStyle;
        this.f8431g = pVar2;
        this.f8432h = pVar3;
        this.f8433i = pVar4;
        this.f8434j = f2;
        this.f8435k = paddingValues;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            SelectableChipColors selectableChipColors = this.f8427a;
            boolean z2 = this.f8428b;
            boolean z3 = this.f8429c;
            ChipKt.c(this.d, this.f8430f, !z2 ? selectableChipColors.f11155f : !z3 ? selectableChipColors.f11153b : selectableChipColors.f11160k, this.f8431g, this.f8432h, this.f8433i, !z2 ? selectableChipColors.f11156g : !z3 ? selectableChipColors.f11154c : selectableChipColors.f11161l, !z2 ? selectableChipColors.f11157h : !z3 ? selectableChipColors.d : selectableChipColors.f11162m, this.f8434j, this.f8435k, composer, 0);
        }
        return b0.f30125a;
    }
}
