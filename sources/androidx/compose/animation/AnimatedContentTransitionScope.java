package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Immutable;

/* loaded from: classes.dex */
public interface AnimatedContentTransitionScope<S> extends Transition.Segment<S> {

    @Immutable
    /* loaded from: classes.dex */
    public static final class SlideDirection {

        /* loaded from: classes.dex */
        public static final class Companion {
        }

        public static final boolean a(int i2) {
            return i2 == 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SlideDirection)) {
                return false;
            }
            ((SlideDirection) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return a(0) ? "Left" : a(1) ? "Right" : a(2) ? "Up" : a(3) ? "Down" : a(4) ? "Start" : a(5) ? "End" : "Invalid";
        }
    }

    ContentTransform b(ContentTransform contentTransform, SizeTransform sizeTransform);
}
