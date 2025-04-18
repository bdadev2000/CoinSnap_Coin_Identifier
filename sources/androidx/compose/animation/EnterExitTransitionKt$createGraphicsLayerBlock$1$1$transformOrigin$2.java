package androidx.compose.animation;

import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransformOrigin f1833a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EnterTransition f1834b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ExitTransition f1835c;

    /* loaded from: classes4.dex */
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
    public EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2(TransformOrigin transformOrigin, EnterTransition enterTransition, ExitTransition exitTransition) {
        super(1);
        this.f1833a = transformOrigin;
        this.f1834b = enterTransition;
        this.f1835c = exitTransition;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        int ordinal = ((EnterExitState) obj).ordinal();
        TransformOrigin transformOrigin = null;
        EnterTransition enterTransition = this.f1834b;
        ExitTransition exitTransition = this.f1835c;
        if (ordinal == 0) {
            Scale scale = enterTransition.a().d;
            if (scale != null) {
                transformOrigin = new TransformOrigin(scale.f1898b);
            } else {
                Scale scale2 = exitTransition.a().d;
                if (scale2 != null) {
                    transformOrigin = new TransformOrigin(scale2.f1898b);
                }
            }
        } else if (ordinal == 1) {
            transformOrigin = this.f1833a;
        } else {
            if (ordinal != 2) {
                throw new RuntimeException();
            }
            Scale scale3 = exitTransition.a().d;
            if (scale3 != null) {
                transformOrigin = new TransformOrigin(scale3.f1898b);
            } else {
                Scale scale4 = enterTransition.a().d;
                if (scale4 != null) {
                    transformOrigin = new TransformOrigin(scale4.f1898b);
                }
            }
        }
        return new TransformOrigin(transformOrigin != null ? transformOrigin.f15061a : TransformOrigin.f15059b);
    }
}
