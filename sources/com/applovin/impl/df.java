package com.applovin.impl;

/* loaded from: classes3.dex */
public interface df {

    /* renamed from: a, reason: collision with root package name */
    public static final df f23482a = new a();

    /* loaded from: classes3.dex */
    public class a implements df {
        @Override // com.applovin.impl.df
        public boolean a(f9 f9Var) {
            String str = f9Var.f23840m;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // com.applovin.impl.df
        public cf b(f9 f9Var) {
            String str = f9Var.f23840m;
            if (str != null) {
                str.hashCode();
                char c2 = 65535;
                switch (str.hashCode()) {
                    case -1354451219:
                        if (str.equals("application/vnd.dvb.ait")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -1348231605:
                        if (str.equals("application/x-icy")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case -1248341703:
                        if (str.equals("application/id3")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 1154383568:
                        if (str.equals("application/x-emsg")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 1652648887:
                        if (str.equals("application/x-scte35")) {
                            c2 = 4;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        return new a1();
                    case 1:
                        return new ua();
                    case 2:
                        return new xa();
                    case 3:
                        return new x7();
                    case 4:
                        return new tk();
                }
            }
            throw new IllegalArgumentException(androidx.compose.ui.platform.j.b("Attempted to create decoder for unsupported MIME type: ", str));
        }
    }

    boolean a(f9 f9Var);

    cf b(f9 f9Var);
}
