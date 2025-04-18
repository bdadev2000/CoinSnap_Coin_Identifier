package y5;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import ei.d0;
import q8.i;
import s7.r0;

/* loaded from: classes3.dex */
public final class f implements d0, l8.c {

    /* renamed from: c, reason: collision with root package name */
    public static final f f27927c = new f();

    /* renamed from: d, reason: collision with root package name */
    public static final f f27928d = new f();

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034 A[Catch: all -> 0x0126, TRY_LEAVE, TryCatch #1 {all -> 0x0126, blocks: (B:6:0x000a, B:9:0x0010, B:14:0x0034, B:18:0x0095, B:22:0x00b2, B:26:0x00cf, B:30:0x00eb, B:50:0x011e, B:58:0x00e5, B:66:0x00c9, B:74:0x00ac, B:104:0x008f, B:114:0x002e, B:52:0x00d9, B:60:0x00bc, B:68:0x009f, B:108:0x001c, B:111:0x0026, B:36:0x00f4, B:39:0x00fe, B:41:0x0104, B:46:0x0110, B:76:0x003e, B:81:0x005c, B:84:0x0061, B:86:0x006e, B:88:0x0074, B:90:0x007a, B:91:0x007d, B:96:0x0086), top: B:5:0x000a, inners: #0, #2, #3, #4, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0095 A[Catch: all -> 0x0126, TRY_LEAVE, TryCatch #1 {all -> 0x0126, blocks: (B:6:0x000a, B:9:0x0010, B:14:0x0034, B:18:0x0095, B:22:0x00b2, B:26:0x00cf, B:30:0x00eb, B:50:0x011e, B:58:0x00e5, B:66:0x00c9, B:74:0x00ac, B:104:0x008f, B:114:0x002e, B:52:0x00d9, B:60:0x00bc, B:68:0x009f, B:108:0x001c, B:111:0x0026, B:36:0x00f4, B:39:0x00fe, B:41:0x0104, B:46:0x0110, B:76:0x003e, B:81:0x005c, B:84:0x0061, B:86:0x006e, B:88:0x0074, B:90:0x007a, B:91:0x007d, B:96:0x0086), top: B:5:0x000a, inners: #0, #2, #3, #4, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2 A[Catch: all -> 0x0126, TRY_LEAVE, TryCatch #1 {all -> 0x0126, blocks: (B:6:0x000a, B:9:0x0010, B:14:0x0034, B:18:0x0095, B:22:0x00b2, B:26:0x00cf, B:30:0x00eb, B:50:0x011e, B:58:0x00e5, B:66:0x00c9, B:74:0x00ac, B:104:0x008f, B:114:0x002e, B:52:0x00d9, B:60:0x00bc, B:68:0x009f, B:108:0x001c, B:111:0x0026, B:36:0x00f4, B:39:0x00fe, B:41:0x0104, B:46:0x0110, B:76:0x003e, B:81:0x005c, B:84:0x0061, B:86:0x006e, B:88:0x0074, B:90:0x007a, B:91:0x007d, B:96:0x0086), top: B:5:0x000a, inners: #0, #2, #3, #4, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cf A[Catch: all -> 0x0126, TRY_LEAVE, TryCatch #1 {all -> 0x0126, blocks: (B:6:0x000a, B:9:0x0010, B:14:0x0034, B:18:0x0095, B:22:0x00b2, B:26:0x00cf, B:30:0x00eb, B:50:0x011e, B:58:0x00e5, B:66:0x00c9, B:74:0x00ac, B:104:0x008f, B:114:0x002e, B:52:0x00d9, B:60:0x00bc, B:68:0x009f, B:108:0x001c, B:111:0x0026, B:36:0x00f4, B:39:0x00fe, B:41:0x0104, B:46:0x0110, B:76:0x003e, B:81:0x005c, B:84:0x0061, B:86:0x006e, B:88:0x0074, B:90:0x007a, B:91:0x007d, B:96:0x0086), top: B:5:0x000a, inners: #0, #2, #3, #4, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00eb A[Catch: all -> 0x0126, TRY_LEAVE, TryCatch #1 {all -> 0x0126, blocks: (B:6:0x000a, B:9:0x0010, B:14:0x0034, B:18:0x0095, B:22:0x00b2, B:26:0x00cf, B:30:0x00eb, B:50:0x011e, B:58:0x00e5, B:66:0x00c9, B:74:0x00ac, B:104:0x008f, B:114:0x002e, B:52:0x00d9, B:60:0x00bc, B:68:0x009f, B:108:0x001c, B:111:0x0026, B:36:0x00f4, B:39:0x00fe, B:41:0x0104, B:46:0x0110, B:76:0x003e, B:81:0x005c, B:84:0x0061, B:86:0x006e, B:88:0x0074, B:90:0x007a, B:91:0x007d, B:96:0x0086), top: B:5:0x000a, inners: #0, #2, #3, #4, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean b(android.view.View r10) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.f.b(android.view.View):boolean");
    }

    public p6.a a(r0 r0Var) {
        String str = r0Var.f24723n;
        if (str != null) {
            str.hashCode();
            int i10 = 0;
            int i11 = 1;
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1354451219:
                    if (str.equals("application/vnd.dvb.ait")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1348231605:
                    if (str.equals("application/x-icy")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1248341703:
                    if (str.equals(MimeTypes.APPLICATION_ID3)) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1154383568:
                    if (str.equals(MimeTypes.APPLICATION_EMSG)) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 1652648887:
                    if (str.equals(MimeTypes.APPLICATION_SCTE35)) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    return new m8.b(i10);
                case 1:
                    return new p8.a();
                case 2:
                    return new i(null);
                case 3:
                    return new m8.b(i11);
                case 4:
                    return new s8.c();
            }
        }
        throw new IllegalArgumentException(vd.e.e("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public boolean c(r0 r0Var) {
        String str = r0Var.f24723n;
        if (!MimeTypes.APPLICATION_ID3.equals(str) && !MimeTypes.APPLICATION_EMSG.equals(str) && !MimeTypes.APPLICATION_SCTE35.equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
            return false;
        }
        return true;
    }
}
