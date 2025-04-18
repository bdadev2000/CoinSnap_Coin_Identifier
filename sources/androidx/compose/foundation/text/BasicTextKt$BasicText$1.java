package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.text.TextStyle;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class BasicTextKt$BasicText$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5640a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f5641b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextStyle f5642c;
    public final /* synthetic */ l d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5643f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f5644g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5645h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5646i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ColorProducer f5647j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5648k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5649l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextKt$BasicText$1(String str, Modifier modifier, TextStyle textStyle, l lVar, int i2, boolean z2, int i3, int i4, ColorProducer colorProducer, int i5, int i6) {
        super(2);
        this.f5640a = str;
        this.f5641b = modifier;
        this.f5642c = textStyle;
        this.d = lVar;
        this.f5643f = i2;
        this.f5644g = z2;
        this.f5645h = i3;
        this.f5646i = i4;
        this.f5647j = colorProducer;
        this.f5648k = i5;
        this.f5649l = i6;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        BasicTextKt.b(this.f5640a, this.f5641b, this.f5642c, this.d, this.f5643f, this.f5644g, this.f5645h, this.f5646i, this.f5647j, (Composer) obj, RecomposeScopeImplKt.a(this.f5648k | 1), this.f5649l);
        return b0.f30125a;
    }
}
