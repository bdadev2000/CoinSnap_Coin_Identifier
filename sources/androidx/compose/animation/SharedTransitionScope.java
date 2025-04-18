package androidx.compose.animation;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.layout.LookaheadScope;

@ExperimentalSharedTransitionApi
@Stable
/* loaded from: classes.dex */
public interface SharedTransitionScope extends LookaheadScope {

    /* loaded from: classes.dex */
    public interface OverlayClip {
        Path a(SharedContentState sharedContentState);
    }

    /* loaded from: classes.dex */
    public interface PlaceHolderSize {

        /* loaded from: classes.dex */
        public static final class Companion {
        }
    }

    /* loaded from: classes.dex */
    public interface ResizeMode {

        /* loaded from: classes.dex */
        public static final class Companion {
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class SharedContentState {
    }
}
