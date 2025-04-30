package i5;

import com.google.protobuf.X2;

/* renamed from: i5.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2354i implements X2 {
    public static final C2354i b = new C2354i(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C2354i f20674c = new C2354i(1);

    /* renamed from: d, reason: collision with root package name */
    public static final C2354i f20675d = new C2354i(2);

    /* renamed from: e, reason: collision with root package name */
    public static final C2354i f20676e = new C2354i(3);

    /* renamed from: f, reason: collision with root package name */
    public static final C2354i f20677f = new C2354i(4);

    /* renamed from: g, reason: collision with root package name */
    public static final C2354i f20678g = new C2354i(5);

    /* renamed from: h, reason: collision with root package name */
    public static final C2354i f20679h = new C2354i(6);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20680a;

    public /* synthetic */ C2354i(int i9) {
        this.f20680a = i9;
    }

    @Override // com.google.protobuf.X2
    public final boolean isInRange(int i9) {
        z zVar;
        P p2;
        switch (this.f20680a) {
            case 0:
                if (EnumC2355j.a(i9) != null) {
                    return true;
                }
                return false;
            case 1:
                if (t.a(i9) != null) {
                    return true;
                }
                return false;
            case 2:
                if (u.a(i9) != null) {
                    return true;
                }
                return false;
            case 3:
                if (y.a(i9) != null) {
                    return true;
                }
                return false;
            case 4:
                if (i9 != 0) {
                    if (i9 != 1) {
                        zVar = null;
                    } else {
                        zVar = z.GENERIC_CLIENT_ERROR;
                    }
                } else {
                    zVar = z.NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
                }
                if (zVar != null) {
                    return true;
                }
                return false;
            case 5:
                if (H.a(i9) != null) {
                    return true;
                }
                return false;
            default:
                if (i9 != 0) {
                    if (i9 != 1) {
                        p2 = null;
                    } else {
                        p2 = P.FL_LEGACY_V1;
                    }
                } else {
                    p2 = P.SOURCE_UNKNOWN;
                }
                if (p2 != null) {
                    return true;
                }
                return false;
        }
    }
}
