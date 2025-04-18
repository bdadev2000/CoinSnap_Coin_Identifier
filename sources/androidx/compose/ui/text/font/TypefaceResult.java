package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;

/* loaded from: classes2.dex */
public interface TypefaceResult extends State<Object> {

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static final class Async implements TypefaceResult, State<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final AsyncFontListLoader f17293a;

        public Async(AsyncFontListLoader asyncFontListLoader) {
            this.f17293a = asyncFontListLoader;
        }

        @Override // androidx.compose.runtime.State
        public final Object getValue() {
            return this.f17293a.getValue();
        }

        @Override // androidx.compose.ui.text.font.TypefaceResult
        public final boolean h() {
            return this.f17293a.f17196h;
        }
    }

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static final class Immutable implements TypefaceResult {

        /* renamed from: a, reason: collision with root package name */
        public final Object f17294a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f17295b;

        public Immutable(Object obj, boolean z2) {
            this.f17294a = obj;
            this.f17295b = z2;
        }

        @Override // androidx.compose.runtime.State
        public final Object getValue() {
            return this.f17294a;
        }

        @Override // androidx.compose.ui.text.font.TypefaceResult
        public final boolean h() {
            return this.f17295b;
        }
    }

    boolean h();
}
