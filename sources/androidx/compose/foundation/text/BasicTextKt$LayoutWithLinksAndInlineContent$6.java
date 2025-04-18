package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.SelectionController;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import d0.b0;
import java.util.Map;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class BasicTextKt$LayoutWithLinksAndInlineContent$6 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f5705a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnnotatedString f5706b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f5707c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Map f5708f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TextStyle f5709g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5710h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f5711i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f5712j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5713k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ FontFamily.Resolver f5714l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SelectionController f5715m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ColorProducer f5716n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f5717o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f5718p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f5719q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5720r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextKt$LayoutWithLinksAndInlineContent$6(Modifier modifier, AnnotatedString annotatedString, l lVar, boolean z2, Map map, TextStyle textStyle, int i2, boolean z3, int i3, int i4, FontFamily.Resolver resolver, SelectionController selectionController, ColorProducer colorProducer, l lVar2, int i5, int i6, int i7) {
        super(2);
        this.f5705a = modifier;
        this.f5706b = annotatedString;
        this.f5707c = lVar;
        this.d = z2;
        this.f5708f = map;
        this.f5709g = textStyle;
        this.f5710h = i2;
        this.f5711i = z3;
        this.f5712j = i3;
        this.f5713k = i4;
        this.f5714l = resolver;
        this.f5715m = selectionController;
        this.f5716n = colorProducer;
        this.f5717o = lVar2;
        this.f5718p = i5;
        this.f5719q = i6;
        this.f5720r = i7;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        BasicTextKt.c(this.f5705a, this.f5706b, this.f5707c, this.d, this.f5708f, this.f5709g, this.f5710h, this.f5711i, this.f5712j, this.f5713k, this.f5714l, this.f5715m, this.f5716n, this.f5717o, (Composer) obj, RecomposeScopeImplKt.a(this.f5718p | 1), RecomposeScopeImplKt.a(this.f5719q), this.f5720r);
        return b0.f30125a;
    }
}
