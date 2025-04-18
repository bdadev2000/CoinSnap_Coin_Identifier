package androidx.compose.material3.internal;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.q;

/* loaded from: classes.dex */
public final class TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public static final TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 f13100a = new r(3);

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(-543659263);
        TweenSpec d = AnimationSpecKt.d(Opcodes.FCMPG, 0, null, 6);
        composer.D();
        return d;
    }
}
