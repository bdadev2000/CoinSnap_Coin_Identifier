package com.applovin.impl;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public interface ye {

    /* renamed from: a, reason: collision with root package name */
    public static final ye f12401a = new a();

    /* loaded from: classes.dex */
    public class a implements ye {
        @Override // com.applovin.impl.ye
        public boolean a(d9 d9Var) {
            String str = d9Var.m;
            if (!MimeTypes.APPLICATION_ID3.equals(str) && !MimeTypes.APPLICATION_EMSG.equals(str) && !MimeTypes.APPLICATION_SCTE35.equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
                return false;
            }
            return true;
        }

        @Override // com.applovin.impl.ye
        public xe b(d9 d9Var) {
            String str = d9Var.m;
            if (str != null) {
                char c9 = 65535;
                switch (str.hashCode()) {
                    case -1354451219:
                        if (str.equals("application/vnd.dvb.ait")) {
                            c9 = 0;
                            break;
                        }
                        break;
                    case -1348231605:
                        if (str.equals("application/x-icy")) {
                            c9 = 1;
                            break;
                        }
                        break;
                    case -1248341703:
                        if (str.equals(MimeTypes.APPLICATION_ID3)) {
                            c9 = 2;
                            break;
                        }
                        break;
                    case 1154383568:
                        if (str.equals(MimeTypes.APPLICATION_EMSG)) {
                            c9 = 3;
                            break;
                        }
                        break;
                    case 1652648887:
                        if (str.equals(MimeTypes.APPLICATION_SCTE35)) {
                            c9 = 4;
                            break;
                        }
                        break;
                }
                switch (c9) {
                    case 0:
                        return new C0782z0();
                    case 1:
                        return new qa();
                    case 2:
                        return new ta();
                    case 3:
                        return new v7();
                    case 4:
                        return new qk();
                }
            }
            throw new IllegalArgumentException(AbstractC2914a.d("Attempted to create decoder for unsupported MIME type: ", str));
        }
    }

    boolean a(d9 d9Var);

    xe b(d9 d9Var);
}
