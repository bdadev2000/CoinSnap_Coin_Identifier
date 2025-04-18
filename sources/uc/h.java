package uc;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;

/* loaded from: classes3.dex */
public final class h extends Number {

    /* renamed from: b, reason: collision with root package name */
    public final String f25765b;

    public h(String str) {
        this.f25765b = str;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return com.facebook.appevents.g.E(this.f25765b);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f25765b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return this.f25765b.equals(((h) obj).f25765b);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f25765b);
    }

    public final int hashCode() {
        return this.f25765b.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f25765b;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return com.facebook.appevents.g.E(str).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(str);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f25765b;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return com.facebook.appevents.g.E(str).longValue();
        }
    }

    public final String toString() {
        return this.f25765b;
    }
}
