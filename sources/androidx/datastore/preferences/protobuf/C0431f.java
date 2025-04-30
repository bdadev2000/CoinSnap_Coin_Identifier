package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0431f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4557a;

    public final byte[] a(byte[] bArr, int i9, int i10) {
        switch (this.f4557a) {
            case 0:
                return Arrays.copyOfRange(bArr, i9, i10 + i9);
            default:
                byte[] bArr2 = new byte[i10];
                System.arraycopy(bArr, i9, bArr2, 0, i10);
                return bArr2;
        }
    }
}
