package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import b1.f0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes.dex */
public final class SaversKt$TextUnitSaver$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final SaversKt$TextUnitSaver$1 f17011a = new r(2);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        long j2 = ((TextUnit) obj2).f17500a;
        if (TextUnit.a(j2, TextUnit.f17499c)) {
            return Boolean.FALSE;
        }
        Float valueOf = Float.valueOf(TextUnit.c(j2));
        SaverKt$Saver$1 saverKt$Saver$1 = SaversKt.f16951a;
        return f0.b(valueOf, new TextUnitType(TextUnit.b(j2)));
    }
}
