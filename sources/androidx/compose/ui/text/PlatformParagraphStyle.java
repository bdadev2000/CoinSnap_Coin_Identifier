package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes2.dex */
public final class PlatformParagraphStyle {

    /* renamed from: c, reason: collision with root package name */
    public static final PlatformParagraphStyle f16945c = new PlatformParagraphStyle(false, 0);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16946a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16947b;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public PlatformParagraphStyle() {
        this.f16946a = false;
        this.f16947b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformParagraphStyle)) {
            return false;
        }
        PlatformParagraphStyle platformParagraphStyle = (PlatformParagraphStyle) obj;
        return this.f16946a == platformParagraphStyle.f16946a && this.f16947b == platformParagraphStyle.f16947b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16947b) + (Boolean.hashCode(this.f16946a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f16946a + ", emojiSupportMatch=" + ((Object) EmojiSupportMatch.a(this.f16947b)) + ')';
    }

    public PlatformParagraphStyle(boolean z2, int i2) {
        this.f16946a = z2;
        this.f16947b = i2;
    }
}
