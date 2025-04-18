package androidx.compose.foundation.text;

import androidx.compose.animation.core.KeyframesSpec;
import androidx.room.RoomDatabase;
import com.safedk.android.internal.d;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
public final class TextFieldCursorKt$cursorAnimationSpec$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final TextFieldCursorKt$cursorAnimationSpec$1 f6126a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = (KeyframesSpec.KeyframesSpecConfig) obj;
        keyframesSpecConfig.f2132a = 1000;
        keyframesSpecConfig.a(0, Float.valueOf(1.0f));
        keyframesSpecConfig.a(499, Float.valueOf(1.0f));
        keyframesSpecConfig.a(d.f29936c, Float.valueOf(0.0f));
        keyframesSpecConfig.a(RoomDatabase.MAX_BIND_PARAMETER_CNT, Float.valueOf(0.0f));
        return b0.f30125a;
    }
}
