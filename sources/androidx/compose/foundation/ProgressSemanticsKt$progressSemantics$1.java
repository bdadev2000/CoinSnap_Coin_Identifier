package androidx.compose.foundation;

import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import d0.b0;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;
import w0.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ProgressSemanticsKt$progressSemantics$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f2843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f2844b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2845c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressSemanticsKt$progressSemantics$1(float f2, d dVar, int i2) {
        super(1);
        this.f2843a = f2;
        this.f2844b = dVar;
        this.f2845c = i2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Float valueOf = Float.valueOf(this.f2843a);
        d dVar = this.f2844b;
        SemanticsPropertiesKt.q((SemanticsPropertyReceiver) obj, new ProgressBarRangeInfo(((Number) a.C(valueOf, dVar)).floatValue(), dVar, this.f2845c));
        return b0.f30125a;
    }
}
