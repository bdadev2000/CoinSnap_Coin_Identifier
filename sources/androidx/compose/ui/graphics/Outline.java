package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.graphics.Path;

/* loaded from: classes.dex */
public abstract class Outline {

    /* loaded from: classes.dex */
    public static final class Generic extends Outline {

        /* renamed from: a, reason: collision with root package name */
        public final Path f15000a;

        public Generic(Path path) {
            this.f15000a = path;
        }

        @Override // androidx.compose.ui.graphics.Outline
        public final Rect a() {
            return this.f15000a.b();
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class Rectangle extends Outline {

        /* renamed from: a, reason: collision with root package name */
        public final Rect f15001a;

        public Rectangle(Rect rect) {
            this.f15001a = rect;
        }

        @Override // androidx.compose.ui.graphics.Outline
        public final Rect a() {
            return this.f15001a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Rectangle) {
                return p0.a.g(this.f15001a, ((Rectangle) obj).f15001a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f15001a.hashCode();
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class Rounded extends Outline {

        /* renamed from: a, reason: collision with root package name */
        public final RoundRect f15002a;

        /* renamed from: b, reason: collision with root package name */
        public final AndroidPath f15003b;

        public Rounded(RoundRect roundRect) {
            AndroidPath androidPath;
            this.f15002a = roundRect;
            if (RoundRectKt.a(roundRect)) {
                androidPath = null;
            } else {
                androidPath = AndroidPath_androidKt.a();
                androidPath.v(roundRect, Path.Direction.f15004a);
            }
            this.f15003b = androidPath;
        }

        @Override // androidx.compose.ui.graphics.Outline
        public final Rect a() {
            RoundRect roundRect = this.f15002a;
            return new Rect(roundRect.f14917a, roundRect.f14918b, roundRect.f14919c, roundRect.d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Rounded) {
                return p0.a.g(this.f15002a, ((Rounded) obj).f15002a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f15002a.hashCode();
        }
    }

    public abstract Rect a();
}
