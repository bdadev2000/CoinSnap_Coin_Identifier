package androidx.compose.foundation.text;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.intl.LocaleList;
import org.objectweb.asm.Opcodes;

@Immutable
/* loaded from: classes2.dex */
public final class KeyboardOptions {

    /* renamed from: h, reason: collision with root package name */
    public static final KeyboardOptions f6014h;

    /* renamed from: i, reason: collision with root package name */
    public static final KeyboardOptions f6015i;

    /* renamed from: a, reason: collision with root package name */
    public final int f6016a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f6017b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6018c;
    public final int d;
    public final PlatformImeOptions e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f6019f;

    /* renamed from: g, reason: collision with root package name */
    public final LocaleList f6020g;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    static {
        int i2 = 0;
        f6014h = new KeyboardOptions(null, i2, i2, 127);
        f6015i = new KeyboardOptions(Boolean.FALSE, 7, i2, Opcodes.LSHL);
    }

    public KeyboardOptions(int i2, Boolean bool, int i3, int i4, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList) {
        this.f6016a = i2;
        this.f6017b = bool;
        this.f6018c = i3;
        this.d = i4;
        this.e = platformImeOptions;
        this.f6019f = bool2;
        this.f6020g = localeList;
    }

    public final KeyboardOptions a(KeyboardOptions keyboardOptions) {
        if (keyboardOptions == null || keyboardOptions.c() || p0.a.g(keyboardOptions, this)) {
            return this;
        }
        if (c()) {
            return keyboardOptions;
        }
        int i2 = this.f6016a;
        KeyboardCapitalization keyboardCapitalization = new KeyboardCapitalization(i2);
        if (KeyboardCapitalization.a(i2, -1)) {
            keyboardCapitalization = null;
        }
        int i3 = keyboardCapitalization != null ? keyboardCapitalization.f17341a : keyboardOptions.f6016a;
        Boolean bool = this.f6017b;
        if (bool == null) {
            bool = keyboardOptions.f6017b;
        }
        Boolean bool2 = bool;
        int i4 = this.f6018c;
        KeyboardType keyboardType = new KeyboardType(i4);
        if (KeyboardType.a(i4, 0)) {
            keyboardType = null;
        }
        int i5 = keyboardType != null ? keyboardType.f17342a : keyboardOptions.f6018c;
        int i6 = this.d;
        ImeAction imeAction = ImeAction.a(i6, -1) ? null : new ImeAction(i6);
        int i7 = imeAction != null ? imeAction.f17330a : keyboardOptions.d;
        PlatformImeOptions platformImeOptions = this.e;
        if (platformImeOptions == null) {
            platformImeOptions = keyboardOptions.e;
        }
        PlatformImeOptions platformImeOptions2 = platformImeOptions;
        Boolean bool3 = this.f6019f;
        if (bool3 == null) {
            bool3 = keyboardOptions.f6019f;
        }
        Boolean bool4 = bool3;
        LocaleList localeList = this.f6020g;
        return new KeyboardOptions(i3, bool2, i5, i7, platformImeOptions2, bool4, localeList == null ? keyboardOptions.f6020g : localeList);
    }

    public final int b() {
        int i2 = this.d;
        ImeAction imeAction = new ImeAction(i2);
        if (ImeAction.a(i2, -1)) {
            imeAction = null;
        }
        if (imeAction != null) {
            return imeAction.f17330a;
        }
        return 1;
    }

    public final boolean c() {
        return KeyboardCapitalization.a(this.f6016a, -1) && this.f6017b == null && KeyboardType.a(this.f6018c, 0) && ImeAction.a(this.d, -1) && this.e == null && this.f6019f == null && this.f6020g == null;
    }

    public final ImeOptions d(boolean z2) {
        int i2 = this.f6016a;
        KeyboardCapitalization keyboardCapitalization = new KeyboardCapitalization(i2);
        if (KeyboardCapitalization.a(i2, -1)) {
            keyboardCapitalization = null;
        }
        int i3 = keyboardCapitalization != null ? keyboardCapitalization.f17341a : 0;
        Boolean bool = this.f6017b;
        boolean booleanValue = bool != null ? bool.booleanValue() : true;
        int i4 = this.f6018c;
        KeyboardType keyboardType = KeyboardType.a(i4, 0) ? null : new KeyboardType(i4);
        int i5 = keyboardType != null ? keyboardType.f17342a : 1;
        int b2 = b();
        PlatformImeOptions platformImeOptions = this.e;
        LocaleList localeList = this.f6020g;
        if (localeList == null) {
            localeList = LocaleList.f17401c;
        }
        return new ImeOptions(z2, i3, booleanValue, i5, b2, platformImeOptions, localeList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyboardOptions)) {
            return false;
        }
        KeyboardOptions keyboardOptions = (KeyboardOptions) obj;
        return KeyboardCapitalization.a(this.f6016a, keyboardOptions.f6016a) && p0.a.g(this.f6017b, keyboardOptions.f6017b) && KeyboardType.a(this.f6018c, keyboardOptions.f6018c) && ImeAction.a(this.d, keyboardOptions.d) && p0.a.g(this.e, keyboardOptions.e) && p0.a.g(this.f6019f, keyboardOptions.f6019f) && p0.a.g(this.f6020g, keyboardOptions.f6020g);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f6016a) * 31;
        Boolean bool = this.f6017b;
        int c2 = d.c(this.d, d.c(this.f6018c, (hashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31), 961);
        Boolean bool2 = this.f6019f;
        int hashCode2 = (c2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        LocaleList localeList = this.f6020g;
        return hashCode2 + (localeList != null ? localeList.f17402a.hashCode() : 0);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) KeyboardCapitalization.b(this.f6016a)) + ", autoCorrectEnabled=" + this.f6017b + ", keyboardType=" + ((Object) KeyboardType.b(this.f6018c)) + ", imeAction=" + ((Object) ImeAction.b(this.d)) + ", platformImeOptions=" + this.e + "showKeyboardOnFocus=" + this.f6019f + ", hintLocales=" + this.f6020g + ')';
    }

    public /* synthetic */ KeyboardOptions(Boolean bool, int i2, int i3, int i4) {
        this((i4 & 1) != 0 ? -1 : 0, (i4 & 2) != 0 ? null : bool, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? -1 : i3, null, null, null);
    }
}
