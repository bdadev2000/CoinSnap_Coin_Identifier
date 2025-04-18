package androidx.compose.foundation.gestures;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class ScrollableStateKt$rememberScrollableState$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ State f3481a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableStateKt$rememberScrollableState$1$1(MutableState mutableState) {
        super(1);
        this.f3481a = mutableState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return (Float) ((l) this.f3481a.getValue()).invoke(Float.valueOf(((Number) obj).floatValue()));
    }
}
