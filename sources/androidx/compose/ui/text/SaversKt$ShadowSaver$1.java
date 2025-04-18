package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import b1.f0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes.dex */
public final class SaversKt$ShadowSaver$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final SaversKt$ShadowSaver$1 f16997a = new r(2);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        SaverScope saverScope = (SaverScope) obj;
        Shadow shadow = (Shadow) obj2;
        return f0.b(SaversKt.a(new Color(shadow.f15039a), SaversKt.f16966r, saverScope), SaversKt.a(new Offset(shadow.f15040b), SaversKt.f16968t, saverScope), Float.valueOf(shadow.f15041c));
    }
}
