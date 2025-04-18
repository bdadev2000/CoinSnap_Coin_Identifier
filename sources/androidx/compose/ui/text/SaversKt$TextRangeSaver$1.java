package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import b1.f0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes.dex */
public final class SaversKt$TextRangeSaver$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final SaversKt$TextRangeSaver$1 f17009a = new r(2);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        long j2 = ((TextRange) obj2).f17058a;
        int i2 = TextRange.f17057c;
        Integer valueOf = Integer.valueOf((int) (j2 >> 32));
        SaverKt$Saver$1 saverKt$Saver$1 = SaversKt.f16951a;
        return f0.b(valueOf, Integer.valueOf((int) (j2 & 4294967295L)));
    }
}
