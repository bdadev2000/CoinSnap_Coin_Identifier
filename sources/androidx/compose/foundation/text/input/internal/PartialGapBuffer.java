package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import e0.q;

@StabilityInferred
/* loaded from: classes4.dex */
public final class PartialGapBuffer implements CharSequence {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f6467a;

    /* renamed from: b, reason: collision with root package name */
    public GapBuffer f6468b;

    /* renamed from: c, reason: collision with root package name */
    public int f6469c = -1;
    public int d = -1;

    /* loaded from: classes4.dex */
    public static final class Companion {
    }

    public PartialGapBuffer(CharSequence charSequence) {
        this.f6467a = charSequence;
    }

    /* JADX WARN: Type inference failed for: r9v28, types: [androidx.compose.foundation.text.input.internal.GapBuffer, java.lang.Object] */
    public final void a(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        if (i2 > i3) {
            throw new IllegalArgumentException(android.support.v4.media.d.k("start=", i2, " > end=", i3).toString());
        }
        if (i4 > i5) {
            throw new IllegalArgumentException(android.support.v4.media.d.k("textStart=", i4, " > textEnd=", i5).toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.d.i("start must be non-negative, but was ", i2).toString());
        }
        if (i4 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.d.i("textStart must be non-negative, but was ", i4).toString());
        }
        GapBuffer gapBuffer = this.f6468b;
        int i6 = i5 - i4;
        if (gapBuffer == null) {
            int max = Math.max(255, i6 + 128);
            char[] cArr = new char[max];
            int min = Math.min(i2, 64);
            int min2 = Math.min(this.f6467a.length() - i3, 64);
            int i7 = i2 - min;
            ToCharArray_androidKt.a(this.f6467a, cArr, 0, i7, i2);
            int i8 = max - min2;
            int i9 = min2 + i3;
            ToCharArray_androidKt.a(this.f6467a, cArr, i8, i3, i9);
            ToCharArray_androidKt.a(charSequence, cArr, min, i4, i5);
            ?? obj = new Object();
            obj.f6405a = max;
            obj.f6406b = cArr;
            obj.f6407c = min + i6;
            obj.d = i8;
            this.f6468b = obj;
            this.f6469c = i7;
            this.d = i9;
            return;
        }
        int i10 = this.f6469c;
        int i11 = i2 - i10;
        int i12 = i3 - i10;
        if (i11 < 0 || i12 > gapBuffer.f6405a - gapBuffer.a()) {
            this.f6467a = toString();
            this.f6468b = null;
            this.f6469c = -1;
            this.d = -1;
            a(i2, i3, charSequence, i4, i5);
            return;
        }
        int i13 = i6 - (i12 - i11);
        if (i13 > gapBuffer.a()) {
            int a2 = i13 - gapBuffer.a();
            int i14 = gapBuffer.f6405a;
            do {
                i14 *= 2;
            } while (i14 - gapBuffer.f6405a < a2);
            char[] cArr2 = new char[i14];
            q.R(gapBuffer.f6406b, cArr2, 0, 0, gapBuffer.f6407c);
            int i15 = gapBuffer.f6405a;
            int i16 = gapBuffer.d;
            int i17 = i15 - i16;
            int i18 = i14 - i17;
            q.R(gapBuffer.f6406b, cArr2, i18, i16, i17 + i16);
            gapBuffer.f6406b = cArr2;
            gapBuffer.f6405a = i14;
            gapBuffer.d = i18;
        }
        int i19 = gapBuffer.f6407c;
        if (i11 < i19 && i12 <= i19) {
            int i20 = i19 - i12;
            char[] cArr3 = gapBuffer.f6406b;
            q.R(cArr3, cArr3, gapBuffer.d - i20, i12, i19);
            gapBuffer.f6407c = i11;
            gapBuffer.d -= i20;
        } else if (i11 >= i19 || i12 < i19) {
            int a3 = i11 + gapBuffer.a();
            int a4 = i12 + gapBuffer.a();
            int i21 = gapBuffer.d;
            char[] cArr4 = gapBuffer.f6406b;
            q.R(cArr4, cArr4, gapBuffer.f6407c, i21, a3);
            gapBuffer.f6407c += a3 - i21;
            gapBuffer.d = a4;
        } else {
            gapBuffer.d = i12 + gapBuffer.a();
            gapBuffer.f6407c = i11;
        }
        ToCharArray_androidKt.a(charSequence, gapBuffer.f6406b, gapBuffer.f6407c, i4, i5);
        gapBuffer.f6407c += i6;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i2) {
        GapBuffer gapBuffer = this.f6468b;
        if (gapBuffer != null && i2 >= this.f6469c) {
            int a2 = gapBuffer.f6405a - gapBuffer.a();
            int i3 = this.f6469c;
            if (i2 >= a2 + i3) {
                return this.f6467a.charAt(i2 - ((a2 - this.d) + i3));
            }
            int i4 = i2 - i3;
            int i5 = gapBuffer.f6407c;
            return i4 < i5 ? gapBuffer.f6406b[i4] : gapBuffer.f6406b[(i4 - i5) + gapBuffer.d];
        }
        return this.f6467a.charAt(i2);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        GapBuffer gapBuffer = this.f6468b;
        if (gapBuffer == null) {
            return this.f6467a.length();
        }
        return (gapBuffer.f6405a - gapBuffer.a()) + (this.f6467a.length() - (this.d - this.f6469c));
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i2, int i3) {
        return toString().subSequence(i2, i3);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        GapBuffer gapBuffer = this.f6468b;
        if (gapBuffer == null) {
            return this.f6467a.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6467a, 0, this.f6469c);
        sb.append(gapBuffer.f6406b, 0, gapBuffer.f6407c);
        char[] cArr = gapBuffer.f6406b;
        int i2 = gapBuffer.d;
        sb.append(cArr, i2, gapBuffer.f6405a - i2);
        CharSequence charSequence = this.f6467a;
        sb.append(charSequence, this.d, charSequence.length());
        return sb.toString();
    }
}
