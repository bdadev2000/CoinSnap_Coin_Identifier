package androidx.compose.foundation.content;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ClipEntry;

@StabilityInferred
@ExperimentalFoundationApi
/* loaded from: classes2.dex */
public final class TransferableContent {

    /* renamed from: a, reason: collision with root package name */
    public final ClipEntry f2894a;

    @ExperimentalFoundationApi
    /* loaded from: classes2.dex */
    public static final class Source {

        /* loaded from: classes2.dex */
        public static final class Companion {
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Source)) {
                return false;
            }
            ((Source) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return "Source.Keyboard";
        }
    }

    public TransferableContent(ClipEntry clipEntry) {
        this.f2894a = clipEntry;
    }
}
