package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRangeKt;
import java.util.NoSuchElementException;

@StabilityInferred
/* loaded from: classes2.dex */
public final class ChangeTracker implements TextFieldBuffer.ChangeList {

    /* renamed from: a, reason: collision with root package name */
    public MutableVector f6369a = new MutableVector(new Change[16]);

    /* renamed from: b, reason: collision with root package name */
    public MutableVector f6370b = new MutableVector(new Change[16]);

    /* loaded from: classes2.dex */
    public static final class Change {

        /* renamed from: a, reason: collision with root package name */
        public int f6371a;

        /* renamed from: b, reason: collision with root package name */
        public int f6372b;

        /* renamed from: c, reason: collision with root package name */
        public int f6373c;
        public int d;

        public Change(int i2, int i3, int i4, int i5) {
            this.f6371a = i2;
            this.f6372b = i3;
            this.f6373c = i4;
            this.d = i5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Change)) {
                return false;
            }
            Change change = (Change) obj;
            return this.f6371a == change.f6371a && this.f6372b == change.f6372b && this.f6373c == change.f6373c && this.d == change.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + android.support.v4.media.d.c(this.f6373c, android.support.v4.media.d.c(this.f6372b, Integer.hashCode(this.f6371a) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Change(preStart=");
            sb.append(this.f6371a);
            sb.append(", preEnd=");
            sb.append(this.f6372b);
            sb.append(", originalStart=");
            sb.append(this.f6373c);
            sb.append(", originalEnd=");
            return android.support.v4.media.d.o(sb, this.d, ')');
        }
    }

    public ChangeTracker(ChangeTracker changeTracker) {
        MutableVector mutableVector;
        int i2;
        if (changeTracker == null || (mutableVector = changeTracker.f6369a) == null || (i2 = mutableVector.f14144c) <= 0) {
            return;
        }
        Object[] objArr = mutableVector.f14142a;
        int i3 = 0;
        do {
            Change change = (Change) objArr[i3];
            this.f6369a.b(new Change(change.f6371a, change.f6372b, change.f6373c, change.d));
            i3++;
        } while (i3 < i2);
    }

    public final void a(Change change, int i2, int i3, int i4) {
        int i5;
        if (this.f6370b.l()) {
            i5 = 0;
        } else {
            MutableVector mutableVector = this.f6370b;
            if (mutableVector.l()) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Change change2 = (Change) mutableVector.f14142a[mutableVector.f14144c - 1];
            i5 = change2.f6372b - change2.d;
        }
        if (change == null) {
            int i6 = i2 - i5;
            change = new Change(i2, i3 + i4, i6, (i3 - i2) + i6);
        } else {
            if (change.f6371a > i2) {
                change.f6371a = i2;
                change.f6373c = i2;
            }
            int i7 = change.f6372b;
            if (i3 > i7) {
                int i8 = i7 - change.d;
                change.f6372b = i3;
                change.d = i3 - i8;
            }
            change.f6372b += i4;
        }
        this.f6370b.b(change);
    }

    public final void b() {
        this.f6369a.g();
    }

    public final long c(int i2) {
        Change change = (Change) this.f6369a.f14142a[i2];
        return TextRangeKt.a(change.f6373c, change.d);
    }

    public final long d(int i2) {
        Change change = (Change) this.f6369a.f14142a[i2];
        return TextRangeKt.a(change.f6371a, change.f6372b);
    }

    public final void e(int i2, int i3, int i4) {
        int i5;
        if (i2 == i3 && i4 == 0) {
            return;
        }
        int min = Math.min(i2, i3);
        int max = Math.max(i2, i3);
        int i6 = i4 - (max - min);
        int i7 = 0;
        Change change = null;
        boolean z2 = false;
        while (true) {
            MutableVector mutableVector = this.f6369a;
            if (i7 >= mutableVector.f14144c) {
                break;
            }
            Change change2 = (Change) mutableVector.f14142a[i7];
            int i8 = change2.f6371a;
            if ((min > i8 || i8 > max) && (min > (i5 = change2.f6372b) || i5 > max)) {
                if (i8 > max && !z2) {
                    a(change, min, max, i6);
                    z2 = true;
                }
                if (z2) {
                    change2.f6371a += i6;
                    change2.f6372b += i6;
                }
                this.f6370b.b(change2);
            } else if (change == null) {
                change = change2;
            } else {
                change.f6372b = change2.f6372b;
                change.d = change2.d;
            }
            i7++;
        }
        if (!z2) {
            a(change, min, max, i6);
        }
        MutableVector mutableVector2 = this.f6369a;
        this.f6369a = this.f6370b;
        this.f6370b = mutableVector2;
        mutableVector2.g();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeList(changes=[");
        MutableVector mutableVector = this.f6369a;
        int i2 = mutableVector.f14144c;
        if (i2 > 0) {
            Object[] objArr = mutableVector.f14142a;
            int i3 = 0;
            do {
                Change change = (Change) objArr[i3];
                sb.append("(" + change.f6373c + ',' + change.d + ")->(" + change.f6371a + ',' + change.f6372b + ')');
                if (i3 < this.f6369a.f14144c - 1) {
                    sb.append(", ");
                }
                i3++;
            } while (i3 < i2);
        }
        sb.append("])");
        String sb2 = sb.toString();
        p0.a.r(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
