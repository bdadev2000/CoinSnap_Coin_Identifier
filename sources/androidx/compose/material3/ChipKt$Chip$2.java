package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes2.dex */
final class ChipKt$Chip$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f8282a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextStyle f8283b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f8284c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f8285f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ChipColors f8286g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f8287h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f8288i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f8289j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipKt$Chip$2(p pVar, TextStyle textStyle, long j2, p pVar2, p pVar3, ChipColors chipColors, boolean z2, float f2, PaddingValues paddingValues) {
        super(2);
        this.f8282a = pVar;
        this.f8283b = textStyle;
        this.f8284c = j2;
        this.d = pVar2;
        this.f8285f = pVar3;
        this.f8286g = chipColors;
        this.f8287h = z2;
        this.f8288i = f2;
        this.f8289j = paddingValues;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            p pVar = this.f8282a;
            TextStyle textStyle = this.f8283b;
            long j2 = this.f8284c;
            p pVar2 = this.d;
            p pVar3 = this.f8285f;
            ChipColors chipColors = this.f8286g;
            boolean z2 = this.f8287h;
            ChipKt.c(pVar, textStyle, j2, pVar2, null, pVar3, z2 ? chipColors.f8235c : chipColors.f8237g, z2 ? chipColors.d : chipColors.f8238h, this.f8288i, this.f8289j, composer, 24576);
        }
        return b0.f30125a;
    }
}
