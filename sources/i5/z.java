package i5;

import com.google.protobuf.V2;

/* loaded from: classes2.dex */
public enum z implements V2 {
    NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
    GENERIC_CLIENT_ERROR(1);

    public final int b;

    z(int i9) {
        this.b = i9;
    }

    @Override // com.google.protobuf.V2
    public final int getNumber() {
        return this.b;
    }
}
