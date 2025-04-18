package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import d0.b0;
import java.util.Map;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class BasicTextKt$BasicText$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnnotatedString f5651a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f5652b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextStyle f5653c;
    public final /* synthetic */ l d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5654f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f5655g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5656h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5657i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Map f5658j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ColorProducer f5659k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5660l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5661m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextKt$BasicText$3(AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, l lVar, int i2, boolean z2, int i3, int i4, Map map, ColorProducer colorProducer, int i5, int i6) {
        super(2);
        this.f5651a = annotatedString;
        this.f5652b = modifier;
        this.f5653c = textStyle;
        this.d = lVar;
        this.f5654f = i2;
        this.f5655g = z2;
        this.f5656h = i3;
        this.f5657i = i4;
        this.f5658j = map;
        this.f5659k = colorProducer;
        this.f5660l = i5;
        this.f5661m = i6;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        BasicTextKt.a(this.f5651a, this.f5652b, this.f5653c, this.d, this.f5654f, this.f5655g, this.f5656h, this.f5657i, this.f5658j, this.f5659k, (Composer) obj, RecomposeScopeImplKt.a(this.f5660l | 1), this.f5661m);
        return b0.f30125a;
    }
}
