package androidx.compose.ui.text;

import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Path;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class MultiParagraph$getPathForRange$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Path f16920a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16921b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16922c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiParagraph$getPathForRange$2(AndroidPath androidPath, int i2, int i3) {
        super(1);
        this.f16920a = androidPath;
        this.f16921b = i2;
        this.f16922c = i3;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ParagraphInfo paragraphInfo = (ParagraphInfo) obj;
        AndroidPath n2 = paragraphInfo.f16928a.n(paragraphInfo.b(this.f16921b), paragraphInfo.b(this.f16922c));
        n2.k(OffsetKt.a(0.0f, paragraphInfo.f16931f));
        this.f16920a.t(n2, 0L);
        return b0.f30125a;
    }
}
