package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ImageKt$Image$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Painter f2743a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2744b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f2745c;
    public final /* synthetic */ Alignment d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ContentScale f2746f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f2747g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ColorFilter f2748h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2749i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2750j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageKt$Image$2(Painter painter, String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter, int i2, int i3) {
        super(2);
        this.f2743a = painter;
        this.f2744b = str;
        this.f2745c = modifier;
        this.d = alignment;
        this.f2746f = contentScale;
        this.f2747g = f2;
        this.f2748h = colorFilter;
        this.f2749i = i2;
        this.f2750j = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ImageKt.a(this.f2743a, this.f2744b, this.f2745c, this.d, this.f2746f, this.f2747g, this.f2748h, (Composer) obj, RecomposeScopeImplKt.a(this.f2749i | 1), this.f2750j);
        return b0.f30125a;
    }
}
