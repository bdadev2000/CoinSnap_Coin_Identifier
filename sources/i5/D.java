package i5;

import com.google.protobuf.InterfaceC1870a3;

/* loaded from: classes2.dex */
public final class D implements InterfaceC1870a3 {
    @Override // com.google.protobuf.InterfaceC1870a3
    public final Object convert(Object obj) {
        H a6 = H.a(((Integer) obj).intValue());
        if (a6 == null) {
            return H.SESSION_VERBOSITY_NONE;
        }
        return a6;
    }
}
