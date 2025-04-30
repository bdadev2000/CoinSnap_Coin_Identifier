package G5;

import q4.C2645d;
import r8.k;

/* loaded from: classes3.dex */
public final class h extends C2645d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1298c;

    public /* synthetic */ h(int i9) {
        this.f1298c = i9;
    }

    @Override // q4.C2645d, G5.c
    public void j(d dVar) {
        switch (this.f1298c) {
            case 1:
                StringBuilder sb = new StringBuilder();
                while (true) {
                    if (dVar.b()) {
                        char a6 = dVar.a();
                        dVar.f1278a++;
                        p(a6, sb);
                        if (sb.length() % 3 == 0) {
                            C2645d.A(dVar, sb);
                            if (k.t(dVar.f1280d, dVar.f1278a, 3) != 3) {
                                dVar.b = 0;
                            }
                        }
                    }
                }
                x(dVar, sb);
                return;
            default:
                super.j(dVar);
                return;
        }
    }

    @Override // q4.C2645d
    public final int p(char c9, StringBuilder sb) {
        switch (this.f1298c) {
            case 0:
                if (c9 == ' ') {
                    sb.append((char) 3);
                    return 1;
                }
                if (c9 >= '0' && c9 <= '9') {
                    sb.append((char) (c9 - ','));
                    return 1;
                }
                if (c9 >= 'a' && c9 <= 'z') {
                    sb.append((char) (c9 - 'S'));
                    return 1;
                }
                if (c9 < ' ') {
                    sb.append((char) 0);
                    sb.append(c9);
                } else if (c9 >= '!' && c9 <= '/') {
                    sb.append((char) 1);
                    sb.append((char) (c9 - '!'));
                } else if (c9 >= ':' && c9 <= '@') {
                    sb.append((char) 1);
                    sb.append((char) (c9 - '+'));
                } else if (c9 >= '[' && c9 <= '_') {
                    sb.append((char) 1);
                    sb.append((char) (c9 - 'E'));
                } else if (c9 == '`') {
                    sb.append((char) 2);
                    sb.append((char) (c9 - '`'));
                } else if (c9 >= 'A' && c9 <= 'Z') {
                    sb.append((char) 2);
                    sb.append((char) (c9 - '@'));
                } else if (c9 >= '{' && c9 <= 127) {
                    sb.append((char) 2);
                    sb.append((char) (c9 - '`'));
                } else {
                    sb.append("\u0001\u001e");
                    return p((char) (c9 - 128), sb) + 2;
                }
                return 2;
            default:
                if (c9 != '\r') {
                    if (c9 != ' ') {
                        if (c9 != '*') {
                            if (c9 != '>') {
                                if (c9 >= '0' && c9 <= '9') {
                                    sb.append((char) (c9 - ','));
                                } else if (c9 >= 'A' && c9 <= 'Z') {
                                    sb.append((char) (c9 - '3'));
                                } else {
                                    k.o(c9);
                                    throw null;
                                }
                            } else {
                                sb.append((char) 2);
                            }
                        } else {
                            sb.append((char) 1);
                        }
                    } else {
                        sb.append((char) 3);
                    }
                } else {
                    sb.append((char) 0);
                }
                return 1;
        }
    }

    @Override // q4.C2645d
    public final int t() {
        switch (this.f1298c) {
            case 0:
                return 2;
            default:
                return 3;
        }
    }

    @Override // q4.C2645d
    public void x(d dVar, StringBuilder sb) {
        switch (this.f1298c) {
            case 1:
                StringBuilder sb2 = (StringBuilder) dVar.f1282f;
                dVar.d(sb2.length());
                int length = ((f) dVar.f1283g).b - sb2.length();
                dVar.f1278a -= sb.length();
                String str = dVar.f1280d;
                if ((str.length() - dVar.f1279c) - dVar.f1278a > 1 || length > 1 || (str.length() - dVar.f1279c) - dVar.f1278a != length) {
                    dVar.e((char) 254);
                }
                if (dVar.b < 0) {
                    dVar.b = 0;
                    return;
                }
                return;
            default:
                super.x(dVar, sb);
                return;
        }
    }
}
