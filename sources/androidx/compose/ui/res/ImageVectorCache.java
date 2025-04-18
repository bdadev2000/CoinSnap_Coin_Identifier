package androidx.compose.ui.res;

import android.content.res.Resources;
import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.vector.ImageVector;
import java.util.HashMap;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class ImageVectorCache {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f16730a = new HashMap();

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static final class ImageVectorEntry {

        /* renamed from: a, reason: collision with root package name */
        public final ImageVector f16731a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16732b;

        public ImageVectorEntry(ImageVector imageVector, int i2) {
            this.f16731a = imageVector;
            this.f16732b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageVectorEntry)) {
                return false;
            }
            ImageVectorEntry imageVectorEntry = (ImageVectorEntry) obj;
            return a.g(this.f16731a, imageVectorEntry.f16731a) && this.f16732b == imageVectorEntry.f16732b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f16732b) + (this.f16731a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
            sb.append(this.f16731a);
            sb.append(", configFlags=");
            return d.o(sb, this.f16732b, ')');
        }
    }

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static final class Key {

        /* renamed from: a, reason: collision with root package name */
        public final Resources.Theme f16733a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16734b;

        public Key(Resources.Theme theme, int i2) {
            this.f16733a = theme;
            this.f16734b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return a.g(this.f16733a, key.f16733a) && this.f16734b == key.f16734b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f16734b) + (this.f16733a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Key(theme=");
            sb.append(this.f16733a);
            sb.append(", id=");
            return d.o(sb, this.f16734b, ')');
        }
    }
}
