package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes3.dex */
public abstract class RenderEffect {

    /* renamed from: a, reason: collision with root package name */
    public android.graphics.RenderEffect f15015a;

    public final android.graphics.RenderEffect a() {
        android.graphics.RenderEffect renderEffect = this.f15015a;
        if (renderEffect != null) {
            return renderEffect;
        }
        android.graphics.RenderEffect b2 = b();
        this.f15015a = b2;
        return b2;
    }

    public abstract android.graphics.RenderEffect b();
}
