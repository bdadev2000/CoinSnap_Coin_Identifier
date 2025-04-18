package androidx.core.util;

import android.util.SizeF;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.facebook.appevents.internal.ViewHierarchyConstants;

/* loaded from: classes.dex */
public final class SizeFCompat {

    /* renamed from: a, reason: collision with root package name */
    public final float f18684a;

    /* renamed from: b, reason: collision with root package name */
    public final float f18685b;

    @RequiresApi
    /* loaded from: classes.dex */
    public static final class Api21Impl {
        @NonNull
        @DoNotInline
        public static SizeF a(@NonNull SizeFCompat sizeFCompat) {
            sizeFCompat.getClass();
            return new SizeF(sizeFCompat.f18684a, sizeFCompat.f18685b);
        }

        @NonNull
        @DoNotInline
        public static SizeFCompat b(@NonNull SizeF sizeF) {
            sizeF.getClass();
            return new SizeFCompat(sizeF.getWidth(), sizeF.getHeight());
        }
    }

    public SizeFCompat(float f2, float f3) {
        Preconditions.b(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, f2);
        this.f18684a = f2;
        Preconditions.b(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, f3);
        this.f18685b = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeFCompat)) {
            return false;
        }
        SizeFCompat sizeFCompat = (SizeFCompat) obj;
        return sizeFCompat.f18684a == this.f18684a && sizeFCompat.f18685b == this.f18685b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f18684a) ^ Float.floatToIntBits(this.f18685b);
    }

    public final String toString() {
        return this.f18684a + "x" + this.f18685b;
    }
}
