package androidx.compose.ui.text.input;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.intl.LocaleList;

@Immutable
/* loaded from: classes4.dex */
public final class ImeOptions {

    /* renamed from: h, reason: collision with root package name */
    public static final ImeOptions f17331h = new ImeOptions(false, 0, true, 1, 1, null, LocaleList.f17401c);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f17332a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17333b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17334c;
    public final int d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final PlatformImeOptions f17335f;

    /* renamed from: g, reason: collision with root package name */
    public final LocaleList f17336g;

    /* loaded from: classes4.dex */
    public static final class Companion {
    }

    public ImeOptions(boolean z2, int i2, boolean z3, int i3, int i4, PlatformImeOptions platformImeOptions, LocaleList localeList) {
        this.f17332a = z2;
        this.f17333b = i2;
        this.f17334c = z3;
        this.d = i3;
        this.e = i4;
        this.f17335f = platformImeOptions;
        this.f17336g = localeList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImeOptions)) {
            return false;
        }
        ImeOptions imeOptions = (ImeOptions) obj;
        return this.f17332a == imeOptions.f17332a && KeyboardCapitalization.a(this.f17333b, imeOptions.f17333b) && this.f17334c == imeOptions.f17334c && KeyboardType.a(this.d, imeOptions.d) && ImeAction.a(this.e, imeOptions.e) && p0.a.g(this.f17335f, imeOptions.f17335f) && p0.a.g(this.f17336g, imeOptions.f17336g);
    }

    public final int hashCode() {
        return this.f17336g.f17402a.hashCode() + d.c(this.e, d.c(this.d, d.g(this.f17334c, d.c(this.f17333b, Boolean.hashCode(this.f17332a) * 31, 31), 31), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.f17332a + ", capitalization=" + ((Object) KeyboardCapitalization.b(this.f17333b)) + ", autoCorrect=" + this.f17334c + ", keyboardType=" + ((Object) KeyboardType.b(this.d)) + ", imeAction=" + ((Object) ImeAction.b(this.e)) + ", platformImeOptions=" + this.f17335f + ", hintLocales=" + this.f17336g + ')';
    }
}
