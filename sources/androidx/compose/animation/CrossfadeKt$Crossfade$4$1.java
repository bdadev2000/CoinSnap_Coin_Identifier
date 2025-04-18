package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class CrossfadeKt$Crossfade$4$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Transition f1794a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$4$1(Transition transition) {
        super(1);
        this.f1794a = transition;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return Boolean.valueOf(!p0.a.g(obj, this.f1794a.d.getValue()));
    }
}
