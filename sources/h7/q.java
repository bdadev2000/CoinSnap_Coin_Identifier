package h7;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class q extends c0 {
    public final byte[] a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f18850b;

    public q(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.f18850b = bArr2;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        byte[] bArr2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        boolean z10 = c0Var instanceof q;
        if (z10) {
            bArr = ((q) c0Var).a;
        } else {
            bArr = ((q) c0Var).a;
        }
        if (Arrays.equals(this.a, bArr)) {
            if (z10) {
                bArr2 = ((q) c0Var).f18850b;
            } else {
                bArr2 = ((q) c0Var).f18850b;
            }
            if (Arrays.equals(this.f18850b, bArr2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f18850b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.a) + ", encryptedBlob=" + Arrays.toString(this.f18850b) + "}";
    }
}
