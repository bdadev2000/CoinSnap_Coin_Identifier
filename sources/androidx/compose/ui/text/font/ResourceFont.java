package androidx.compose.ui.text.font;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontVariation;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class ResourceFont implements Font {

    /* renamed from: a, reason: collision with root package name */
    public final int f17280a;

    /* renamed from: b, reason: collision with root package name */
    public final FontWeight f17281b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17282c;
    public final FontVariation.Settings d;
    public final int e;

    public ResourceFont(int i2, FontWeight fontWeight, int i3, FontVariation.Settings settings, int i4) {
        this.f17280a = i2;
        this.f17281b = fontWeight;
        this.f17282c = i3;
        this.d = settings;
        this.e = i4;
    }

    @Override // androidx.compose.ui.text.font.Font
    public final int a() {
        return this.e;
    }

    @Override // androidx.compose.ui.text.font.Font
    public final int b() {
        return this.f17282c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceFont)) {
            return false;
        }
        ResourceFont resourceFont = (ResourceFont) obj;
        if (this.f17280a != resourceFont.f17280a) {
            return false;
        }
        if (!a.g(this.f17281b, resourceFont.f17281b)) {
            return false;
        }
        if (FontStyle.a(this.f17282c, resourceFont.f17282c) && a.g(this.d, resourceFont.d)) {
            return FontLoadingStrategy.a(this.e, resourceFont.e);
        }
        return false;
    }

    @Override // androidx.compose.ui.text.font.Font
    public final FontWeight getWeight() {
        return this.f17281b;
    }

    public final int hashCode() {
        return this.d.f17262a.hashCode() + d.c(this.e, d.c(this.f17282c, ((this.f17280a * 31) + this.f17281b.f17274a) * 31, 31), 31);
    }

    public final String toString() {
        return "ResourceFont(resId=" + this.f17280a + ", weight=" + this.f17281b + ", style=" + ((Object) FontStyle.b(this.f17282c)) + ", loadingStrategy=" + ((Object) FontLoadingStrategy.b(this.e)) + ')';
    }
}
