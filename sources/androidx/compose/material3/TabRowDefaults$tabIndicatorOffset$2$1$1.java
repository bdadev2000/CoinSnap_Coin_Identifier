package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class TabRowDefaults$tabIndicatorOffset$2$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ State f11817a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowDefaults$tabIndicatorOffset$2$1$1(State state) {
        super(1);
        this.f11817a = state;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return new IntOffset(IntOffsetKt.a(((Density) obj).F0(((Dp) this.f11817a.getValue()).f17486a), 0));
    }
}
