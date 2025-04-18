package com.applovin.impl;

/* loaded from: classes2.dex */
public interface ql {

    /* renamed from: a, reason: collision with root package name */
    public static final ql f26192a = new a();

    /* loaded from: classes2.dex */
    public class a implements ql {
        @Override // com.applovin.impl.ql
        public boolean a(f9 f9Var) {
            String str = f9Var.f23840m;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str);
        }

        @Override // com.applovin.impl.ql
        public ol b(f9 f9Var) {
            String str = f9Var.f23840m;
            if (str != null) {
                str.hashCode();
                char c2 = 65535;
                switch (str.hashCode()) {
                    case -1351681404:
                        if (str.equals("application/dvbsubs")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -1248334819:
                        if (str.equals("application/pgs")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case -1026075066:
                        if (str.equals("application/x-mp4-vtt")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case -1004728940:
                        if (str.equals("text/vtt")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 691401887:
                        if (str.equals("application/x-quicktime-tx3g")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 822864842:
                        if (str.equals("text/x-ssa")) {
                            c2 = 5;
                            break;
                        }
                        break;
                    case 930165504:
                        if (str.equals("application/x-mp4-cea-608")) {
                            c2 = 6;
                            break;
                        }
                        break;
                    case 1201784583:
                        if (str.equals("text/x-exoplayer-cues")) {
                            c2 = 7;
                            break;
                        }
                        break;
                    case 1566015601:
                        if (str.equals("application/cea-608")) {
                            c2 = '\b';
                            break;
                        }
                        break;
                    case 1566016562:
                        if (str.equals("application/cea-708")) {
                            c2 = '\t';
                            break;
                        }
                        break;
                    case 1668750253:
                        if (str.equals("application/x-subrip")) {
                            c2 = '\n';
                            break;
                        }
                        break;
                    case 1693976202:
                        if (str.equals("application/ttml+xml")) {
                            c2 = 11;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        return new j7(f9Var.f23842o);
                    case 1:
                        return new jh();
                    case 2:
                        return new qf();
                    case 3:
                        return new yr();
                    case 4:
                        return new lp(f9Var.f23842o);
                    case 5:
                        return new xk(f9Var.f23842o);
                    case 6:
                    case '\b':
                        return new y2(str, f9Var.E, 16000L);
                    case 7:
                        return new i8();
                    case '\t':
                        return new z2(f9Var.E, f9Var.f23842o);
                    case '\n':
                        return new jl();
                    case 11:
                        return new fp();
                }
            }
            throw new IllegalArgumentException(androidx.compose.ui.platform.j.b("Attempted to create decoder for unsupported MIME type: ", str));
        }
    }

    boolean a(f9 f9Var);

    ol b(f9 f9Var);
}
