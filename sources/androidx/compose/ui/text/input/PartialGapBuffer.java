package androidx.compose.ui.text.input;

import android.support.v4.media.d;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.InternalTextApi;
import e0.q;

@StabilityInferred
@RestrictTo
@InternalTextApi
/* loaded from: classes2.dex */
public final class PartialGapBuffer {

    /* renamed from: a, reason: collision with root package name */
    public String f17346a;

    /* renamed from: b, reason: collision with root package name */
    public GapBuffer f17347b;

    /* renamed from: c, reason: collision with root package name */
    public int f17348c;
    public int d;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public final int a() {
        GapBuffer gapBuffer = this.f17347b;
        if (gapBuffer == null) {
            return this.f17346a.length();
        }
        return (gapBuffer.f17327a - gapBuffer.a()) + (this.f17346a.length() - (this.d - this.f17348c));
    }

    /* JADX WARN: Type inference failed for: r9v22, types: [androidx.compose.ui.text.input.GapBuffer, java.lang.Object] */
    public final void b(int i2, int i3, String str) {
        if (i2 > i3) {
            throw new IllegalArgumentException(d.k("start index must be less than or equal to end index: ", i2, " > ", i3).toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(d.i("start must be non-negative, but was ", i2).toString());
        }
        GapBuffer gapBuffer = this.f17347b;
        if (gapBuffer == null) {
            int max = Math.max(255, str.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i2, 64);
            int min2 = Math.min(this.f17346a.length() - i3, 64);
            String str2 = this.f17346a;
            int i4 = i2 - min;
            p0.a.q(str2, "null cannot be cast to non-null type java.lang.String");
            str2.getChars(i4, i2, cArr, 0);
            String str3 = this.f17346a;
            int i5 = max - min2;
            int i6 = min2 + i3;
            p0.a.q(str3, "null cannot be cast to non-null type java.lang.String");
            str3.getChars(i3, i6, cArr, i5);
            str.getChars(0, str.length(), cArr, min);
            int length = str.length() + min;
            ?? obj = new Object();
            obj.f17327a = max;
            obj.f17328b = cArr;
            obj.f17329c = length;
            obj.d = i5;
            this.f17347b = obj;
            this.f17348c = i4;
            this.d = i6;
            return;
        }
        int i7 = this.f17348c;
        int i8 = i2 - i7;
        int i9 = i3 - i7;
        if (i8 < 0 || i9 > gapBuffer.f17327a - gapBuffer.a()) {
            this.f17346a = toString();
            this.f17347b = null;
            this.f17348c = -1;
            this.d = -1;
            b(i2, i3, str);
            return;
        }
        int length2 = str.length() - (i9 - i8);
        if (length2 > gapBuffer.a()) {
            int a2 = length2 - gapBuffer.a();
            int i10 = gapBuffer.f17327a;
            do {
                i10 *= 2;
            } while (i10 - gapBuffer.f17327a < a2);
            char[] cArr2 = new char[i10];
            q.R(gapBuffer.f17328b, cArr2, 0, 0, gapBuffer.f17329c);
            int i11 = gapBuffer.f17327a;
            int i12 = gapBuffer.d;
            int i13 = i11 - i12;
            int i14 = i10 - i13;
            q.R(gapBuffer.f17328b, cArr2, i14, i12, i13 + i12);
            gapBuffer.f17328b = cArr2;
            gapBuffer.f17327a = i10;
            gapBuffer.d = i14;
        }
        int i15 = gapBuffer.f17329c;
        if (i8 < i15 && i9 <= i15) {
            int i16 = i15 - i9;
            char[] cArr3 = gapBuffer.f17328b;
            q.R(cArr3, cArr3, gapBuffer.d - i16, i9, i15);
            gapBuffer.f17329c = i8;
            gapBuffer.d -= i16;
        } else if (i8 >= i15 || i9 < i15) {
            int a3 = i8 + gapBuffer.a();
            int a4 = i9 + gapBuffer.a();
            int i17 = gapBuffer.d;
            char[] cArr4 = gapBuffer.f17328b;
            q.R(cArr4, cArr4, gapBuffer.f17329c, i17, a3);
            gapBuffer.f17329c += a3 - i17;
            gapBuffer.d = a4;
        } else {
            gapBuffer.d = i9 + gapBuffer.a();
            gapBuffer.f17329c = i8;
        }
        str.getChars(0, str.length(), gapBuffer.f17328b, gapBuffer.f17329c);
        gapBuffer.f17329c = str.length() + gapBuffer.f17329c;
    }

    public final String toString() {
        GapBuffer gapBuffer = this.f17347b;
        if (gapBuffer == null) {
            return this.f17346a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) this.f17346a, 0, this.f17348c);
        sb.append(gapBuffer.f17328b, 0, gapBuffer.f17329c);
        char[] cArr = gapBuffer.f17328b;
        int i2 = gapBuffer.d;
        sb.append(cArr, i2, gapBuffer.f17327a - i2);
        String str = this.f17346a;
        sb.append((CharSequence) str, this.d, str.length());
        return sb.toString();
    }
}
