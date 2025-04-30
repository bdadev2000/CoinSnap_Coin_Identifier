package i5;

import com.google.protobuf.V2;

/* loaded from: classes2.dex */
public enum y implements V2 {
    HTTP_METHOD_UNKNOWN(0),
    GET(1),
    PUT(2),
    POST(3),
    DELETE(4),
    HEAD(5),
    PATCH(6),
    OPTIONS(7),
    TRACE(8),
    CONNECT(9);

    public final int b;

    y(int i9) {
        this.b = i9;
    }

    public static y a(int i9) {
        switch (i9) {
            case 0:
                return HTTP_METHOD_UNKNOWN;
            case 1:
                return GET;
            case 2:
                return PUT;
            case 3:
                return POST;
            case 4:
                return DELETE;
            case 5:
                return HEAD;
            case 6:
                return PATCH;
            case 7:
                return OPTIONS;
            case 8:
                return TRACE;
            case 9:
                return CONNECT;
            default:
                return null;
        }
    }

    @Override // com.google.protobuf.V2
    public final int getNumber() {
        return this.b;
    }
}
