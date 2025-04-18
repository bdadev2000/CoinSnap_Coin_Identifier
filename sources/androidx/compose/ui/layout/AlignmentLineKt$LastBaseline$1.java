package androidx.compose.ui.layout;

import com.applovin.sdk.AppLovinMediationProvider;
import kotlin.jvm.internal.o;
import q0.p;
import s0.a;

/* loaded from: classes.dex */
public /* synthetic */ class AlignmentLineKt$LastBaseline$1 extends o implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final AlignmentLineKt$LastBaseline$1 f15695a = new o(2, a.class, AppLovinMediationProvider.MAX, "max(II)I", 1);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.max(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
