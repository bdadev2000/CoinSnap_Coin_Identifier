package androidx.compose.ui.graphics;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.Offset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi
/* loaded from: classes4.dex */
final class RenderEffectVerificationHelper {

    /* renamed from: a, reason: collision with root package name */
    public static final RenderEffectVerificationHelper f15016a = new Object();

    @DoNotInline
    @NotNull
    public final android.graphics.RenderEffect a(@Nullable RenderEffect renderEffect, float f2, float f3, int i2) {
        android.graphics.RenderEffect createBlurEffect;
        android.graphics.RenderEffect createBlurEffect2;
        if (renderEffect == null) {
            createBlurEffect2 = android.graphics.RenderEffect.createBlurEffect(f2, f3, AndroidTileMode_androidKt.a(i2));
            return createBlurEffect2;
        }
        createBlurEffect = android.graphics.RenderEffect.createBlurEffect(f2, f3, renderEffect.a(), AndroidTileMode_androidKt.a(i2));
        return createBlurEffect;
    }

    @DoNotInline
    @NotNull
    public final android.graphics.RenderEffect b(@Nullable RenderEffect renderEffect, long j2) {
        android.graphics.RenderEffect createOffsetEffect;
        android.graphics.RenderEffect createOffsetEffect2;
        if (renderEffect == null) {
            createOffsetEffect2 = android.graphics.RenderEffect.createOffsetEffect(Offset.g(j2), Offset.h(j2));
            return createOffsetEffect2;
        }
        createOffsetEffect = android.graphics.RenderEffect.createOffsetEffect(Offset.g(j2), Offset.h(j2), renderEffect.a());
        return createOffsetEffect;
    }
}
