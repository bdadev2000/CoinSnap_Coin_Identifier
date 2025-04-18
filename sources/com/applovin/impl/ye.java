package com.applovin.impl;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes.dex */
public interface ye {
    public static final ye a = new a();

    /* loaded from: classes.dex */
    public class a implements ye {
        @Override // com.applovin.impl.ye
        public boolean a(d9 d9Var) {
            String str = d9Var.f4228m;
            if (!MimeTypes.APPLICATION_ID3.equals(str) && !MimeTypes.APPLICATION_EMSG.equals(str) && !MimeTypes.APPLICATION_SCTE35.equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
                return false;
            }
            return true;
        }

        @Override // com.applovin.impl.ye
        public xe b(d9 d9Var) {
            String str = d9Var.f4228m;
            if (str != null) {
                str.hashCode();
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
                        return new z0();
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
            throw new IllegalArgumentException(vd.e.e("Attempted to create decoder for unsupported MIME type: ", str));
        }
    }

    boolean a(d9 d9Var);

    xe b(d9 d9Var);
}
