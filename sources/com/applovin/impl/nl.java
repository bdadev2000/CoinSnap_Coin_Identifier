package com.applovin.impl;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes.dex */
public interface nl {
    public static final nl a = new a();

    /* loaded from: classes.dex */
    public class a implements nl {
        @Override // com.applovin.impl.nl
        public boolean a(d9 d9Var) {
            String str = d9Var.f4228m;
            if (!MimeTypes.TEXT_VTT.equals(str) && !MimeTypes.TEXT_SSA.equals(str) && !MimeTypes.APPLICATION_TTML.equals(str) && !MimeTypes.APPLICATION_MP4VTT.equals(str) && !MimeTypes.APPLICATION_SUBRIP.equals(str) && !MimeTypes.APPLICATION_TX3G.equals(str) && !MimeTypes.APPLICATION_CEA608.equals(str) && !MimeTypes.APPLICATION_MP4CEA608.equals(str) && !MimeTypes.APPLICATION_CEA708.equals(str) && !MimeTypes.APPLICATION_DVBSUBS.equals(str) && !MimeTypes.APPLICATION_PGS.equals(str) && !"text/x-exoplayer-cues".equals(str)) {
                return false;
            }
            return true;
        }

        @Override // com.applovin.impl.nl
        public ll b(d9 d9Var) {
            String str = d9Var.f4228m;
            if (str != null) {
                str.hashCode();
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -1351681404:
                        if (str.equals(MimeTypes.APPLICATION_DVBSUBS)) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1248334819:
                        if (str.equals(MimeTypes.APPLICATION_PGS)) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -1026075066:
                        if (str.equals(MimeTypes.APPLICATION_MP4VTT)) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case -1004728940:
                        if (str.equals(MimeTypes.TEXT_VTT)) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 691401887:
                        if (str.equals(MimeTypes.APPLICATION_TX3G)) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case 822864842:
                        if (str.equals(MimeTypes.TEXT_SSA)) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case 930165504:
                        if (str.equals(MimeTypes.APPLICATION_MP4CEA608)) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case 1201784583:
                        if (str.equals("text/x-exoplayer-cues")) {
                            c10 = 7;
                            break;
                        }
                        break;
                    case 1566015601:
                        if (str.equals(MimeTypes.APPLICATION_CEA608)) {
                            c10 = '\b';
                            break;
                        }
                        break;
                    case 1566016562:
                        if (str.equals(MimeTypes.APPLICATION_CEA708)) {
                            c10 = '\t';
                            break;
                        }
                        break;
                    case 1668750253:
                        if (str.equals(MimeTypes.APPLICATION_SUBRIP)) {
                            c10 = '\n';
                            break;
                        }
                        break;
                    case 1693976202:
                        if (str.equals(MimeTypes.APPLICATION_TTML)) {
                            c10 = 11;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        return new h7(d9Var.f4230o);
                    case 1:
                        return new gh();
                    case 2:
                        return new lf();
                    case 3:
                        return new zr();
                    case 4:
                        return new mp(d9Var.f4230o);
                    case 5:
                        return new uk(d9Var.f4230o);
                    case 6:
                    case '\b':
                        return new w2(str, d9Var.E, 16000L);
                    case 7:
                        return new g8();
                    case '\t':
                        return new x2(d9Var.E, d9Var.f4230o);
                    case '\n':
                        return new gl();
                    case 11:
                        return new gp();
                }
            }
            throw new IllegalArgumentException(vd.e.e("Attempted to create decoder for unsupported MIME type: ", str));
        }
    }

    boolean a(d9 d9Var);

    ll b(d9 d9Var);
}
