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
/* loaded from: classes2.dex */
public final class ChipKt$Chip$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f8290a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.a f8291b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f8292c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TextStyle f8293f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f8294g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p f8295h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f8296i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Shape f8297j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ChipColors f8298k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ChipElevation f8299l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BorderStroke f8300m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f8301n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f8302o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f8303p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f8304q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8305r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipKt$Chip$3(Modifier modifier, q0.a aVar, boolean z2, p pVar, TextStyle textStyle, long j2, p pVar2, p pVar3, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, float f2, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i2, int i3) {
        super(2);
        this.f8290a = modifier;
        this.f8291b = aVar;
        this.f8292c = z2;
        this.d = pVar;
        this.f8293f = textStyle;
        this.f8294g = j2;
        this.f8295h = pVar2;
        this.f8296i = pVar3;
        this.f8297j = shape;
        this.f8298k = chipColors;
        this.f8299l = chipElevation;
        this.f8300m = borderStroke;
        this.f8301n = f2;
        this.f8302o = paddingValues;
        this.f8303p = mutableInteractionSource;
        this.f8304q = i2;
        this.f8305r = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ChipKt.a(this.f8290a, this.f8291b, this.f8292c, this.d, this.f8293f, this.f8294g, this.f8295h, this.f8296i, this.f8297j, this.f8298k, this.f8299l, this.f8300m, this.f8301n, this.f8302o, this.f8303p, (Composer) obj, RecomposeScopeImplKt.a(this.f8304q | 1), RecomposeScopeImplKt.a(this.f8305r));
        return b0.f30125a;
    }
}
