package j3;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class q extends C {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f21082a;
    public final byte[] b;

    public q(byte[] bArr, byte[] bArr2) {
        this.f21082a = bArr;
        this.b = bArr2;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        byte[] bArr2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c9 = (C) obj;
        boolean z8 = c9 instanceof q;
        if (z8) {
            bArr = ((q) c9).f21082a;
        } else {
            bArr = ((q) c9).f21082a;
        }
        if (Arrays.equals(this.f21082a, bArr)) {
            if (z8) {
                bArr2 = ((q) c9).b;
            } else {
                bArr2 = ((q) c9).b;
            }
            if (Arrays.equals(this.b, bArr2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f21082a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f21082a) + ", encryptedBlob=" + Arrays.toString(this.b) + "}";
    }
}
