package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ChipKt$SelectableChip$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f8436a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f8437b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0.a f8438c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f8439f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TextStyle f8440g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p f8441h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f8442i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f8443j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Shape f8444k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SelectableChipColors f8445l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SelectableChipElevation f8446m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ BorderStroke f8447n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f8448o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f8449p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f8450q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8451r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f8452s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipKt$SelectableChip$3(boolean z2, Modifier modifier, q0.a aVar, boolean z3, p pVar, TextStyle textStyle, p pVar2, p pVar3, p pVar4, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, float f2, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i2, int i3) {
        super(2);
        this.f8436a = z2;
        this.f8437b = modifier;
        this.f8438c = aVar;
        this.d = z3;
        this.f8439f = pVar;
        this.f8440g = textStyle;
        this.f8441h = pVar2;
        this.f8442i = pVar3;
        this.f8443j = pVar4;
        this.f8444k = shape;
        this.f8445l = selectableChipColors;
        this.f8446m = selectableChipElevation;
        this.f8447n = borderStroke;
        this.f8448o = f2;
        this.f8449p = paddingValues;
        this.f8450q = mutableInteractionSource;
        this.f8451r = i2;
        this.f8452s = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ChipKt.b(this.f8436a, this.f8437b, this.f8438c, this.d, this.f8439f, this.f8440g, this.f8441h, this.f8442i, this.f8443j, this.f8444k, this.f8445l, this.f8446m, this.f8447n, this.f8448o, this.f8449p, this.f8450q, (Composer) obj, RecomposeScopeImplKt.a(this.f8451r | 1), RecomposeScopeImplKt.a(this.f8452s));
        return b0.f30125a;
    }
}
