package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.geometry.Offset;
import b1.f0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes.dex */
public final class SaversKt$OffsetSaver$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final SaversKt$OffsetSaver$1 f16993a = new r(2);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        long j2 = ((Offset) obj2).f14913a;
        if (Offset.d(j2, 9205357640488583168L)) {
            return Boolean.FALSE;
        }
        Float valueOf = Float.valueOf(Offset.g(j2));
        SaverKt$Saver$1 saverKt$Saver$1 = SaversKt.f16951a;
        return f0.b(valueOf, Float.valueOf(Offset.h(j2)));
    }
}
