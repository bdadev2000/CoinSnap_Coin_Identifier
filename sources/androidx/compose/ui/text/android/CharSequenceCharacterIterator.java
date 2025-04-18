package androidx.compose.ui.text.android;

import androidx.compose.runtime.internal.StabilityInferred;
import java.text.CharacterIterator;

@StabilityInferred
/* loaded from: classes2.dex */
public final class CharSequenceCharacterIterator implements CharacterIterator {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f17070a;

    /* renamed from: c, reason: collision with root package name */
    public final int f17072c;

    /* renamed from: b, reason: collision with root package name */
    public final int f17071b = 0;
    public int d = 0;

    public CharSequenceCharacterIterator(CharSequence charSequence, int i2) {
        this.f17070a = charSequence;
        this.f17072c = i2;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i2 = this.d;
        if (i2 == this.f17072c) {
            return (char) 65535;
        }
        return this.f17070a.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.d = this.f17071b;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return this.f17071b;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f17072c;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.d;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i2 = this.f17071b;
        int i3 = this.f17072c;
        if (i2 == i3) {
            this.d = i3;
            return (char) 65535;
        }
        int i4 = i3 - 1;
        this.d = i4;
        return this.f17070a.charAt(i4);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i2 = this.d + 1;
        this.d = i2;
        int i3 = this.f17072c;
        if (i2 < i3) {
            return this.f17070a.charAt(i2);
        }
        this.d = i3;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i2 = this.d;
        if (i2 <= this.f17071b) {
            return (char) 65535;
        }
        int i3 = i2 - 1;
        this.d = i3;
        return this.f17070a.charAt(i3);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i2) {
        if (i2 > this.f17072c || this.f17071b > i2) {
            throw new IllegalArgumentException("invalid position");
        }
        this.d = i2;
        return current();
    }
}
