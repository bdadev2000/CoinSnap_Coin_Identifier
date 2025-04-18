package androidx.compose.ui.text;

import android.graphics.RectF;
import androidx.compose.animation.core.a;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes2.dex */
final class AndroidParagraph$getRangeForRect$range$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextInclusionStrategy f16879a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidParagraph$getRangeForRect$range$1(a aVar) {
        super(2);
        this.f16879a = aVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(this.f16879a.a(RectHelper_androidKt.e((RectF) obj), RectHelper_androidKt.e((RectF) obj2)));
    }
}
