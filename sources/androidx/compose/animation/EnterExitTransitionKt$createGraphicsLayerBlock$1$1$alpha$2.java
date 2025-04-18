package androidx.compose.animation;

import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EnterTransition f1823a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExitTransition f1824b;

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[EnterExitState.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2(EnterTransition enterTransition, ExitTransition exitTransition) {
        super(1);
        this.f1823a = enterTransition;
        this.f1824b = exitTransition;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        int ordinal = ((EnterExitState) obj).ordinal();
        float f2 = 1.0f;
        if (ordinal == 0) {
            Fade fade = this.f1823a.a().f1973a;
            if (fade != null) {
                f2 = fade.f1880a;
            }
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                throw new RuntimeException();
            }
            Fade fade2 = this.f1824b.a().f1973a;
            if (fade2 != null) {
                f2 = fade2.f1880a;
            }
        }
        return Float.valueOf(f2);
    }
}
