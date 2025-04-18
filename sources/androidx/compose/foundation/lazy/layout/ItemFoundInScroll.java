package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationState;
import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
final class ItemFoundInScroll extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final int f4660a;

    /* renamed from: b, reason: collision with root package name */
    public final AnimationState f4661b;

    public ItemFoundInScroll(int i2, AnimationState animationState) {
        this.f4660a = i2;
        this.f4661b = animationState;
    }
}
