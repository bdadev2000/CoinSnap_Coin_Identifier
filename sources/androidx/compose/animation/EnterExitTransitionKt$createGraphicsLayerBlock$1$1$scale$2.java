package androidx.compose.animation;

import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
final class EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EnterTransition f1830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExitTransition f1831b;

    /* loaded from: classes.dex */
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
    public EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$2(EnterTransition enterTransition, ExitTransition exitTransition) {
        super(1);
        this.f1830a = enterTransition;
        this.f1831b = exitTransition;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        int ordinal = ((EnterExitState) obj).ordinal();
        float f2 = 1.0f;
        if (ordinal == 0) {
            Scale scale = this.f1830a.a().d;
            if (scale != null) {
                f2 = scale.f1897a;
            }
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                throw new RuntimeException();
            }
            Scale scale2 = this.f1831b.a().d;
            if (scale2 != null) {
                f2 = scale2.f1897a;
            }
        }
        return Float.valueOf(f2);
    }
}
