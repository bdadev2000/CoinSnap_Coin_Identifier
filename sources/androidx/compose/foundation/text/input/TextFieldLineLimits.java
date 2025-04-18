package androidx.compose.foundation.text.input;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.api.Api;

@Stable
/* loaded from: classes3.dex */
public interface TextFieldLineLimits {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f6300a = Companion.f6301a;

    /* loaded from: classes3.dex */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f6301a = new Object();

        /* renamed from: b, reason: collision with root package name */
        public static final MultiLine f6302b = new MultiLine();
    }

    @Immutable
    /* loaded from: classes3.dex */
    public static final class MultiLine implements TextFieldLineLimits {

        /* renamed from: b, reason: collision with root package name */
        public final int f6303b = 1;

        /* renamed from: c, reason: collision with root package name */
        public final int f6304c = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || MultiLine.class != obj.getClass()) {
                return false;
            }
            MultiLine multiLine = (MultiLine) obj;
            return this.f6303b == multiLine.f6303b && this.f6304c == multiLine.f6304c;
        }

        public final int hashCode() {
            return (this.f6303b * 31) + this.f6304c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MultiLine(minHeightInLines=");
            sb.append(this.f6303b);
            sb.append(", maxHeightInLines=");
            return d.o(sb, this.f6304c, ')');
        }
    }

    @StabilityInferred
    /* loaded from: classes3.dex */
    public static final class SingleLine implements TextFieldLineLimits {

        /* renamed from: b, reason: collision with root package name */
        public static final SingleLine f6305b = new Object();

        public final String toString() {
            return "TextFieldLineLimits.SingleLine";
        }
    }
}
