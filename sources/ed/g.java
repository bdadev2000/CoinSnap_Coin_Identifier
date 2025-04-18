package ed;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import wh.a0;

/* loaded from: classes4.dex */
public final class g extends a0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17327d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10) {
        super(12);
        this.f17327d = i10;
    }

    @Override // wh.a0, ed.b
    public final void d(c cVar) {
        switch (this.f17327d) {
            case 1:
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    if (cVar.c()) {
                        char b3 = cVar.b();
                        cVar.f17308d++;
                        o(sb2, b3);
                        if (sb2.length() % 3 == 0) {
                            a0.H(cVar, sb2);
                            if (com.facebook.appevents.g.A(cVar.a, cVar.f17308d, t()) != t()) {
                                cVar.f17309e = 0;
                            }
                        }
                    }
                }
                w(cVar, sb2);
                return;
            default:
                super.d(cVar);
                return;
        }
    }

    @Override // wh.a0
    public final int o(StringBuilder sb2, char c10) {
        switch (this.f17327d) {
            case 0:
                if (c10 == ' ') {
                    sb2.append((char) 3);
                } else if (c10 >= '0' && c10 <= '9') {
                    sb2.append((char) ((c10 - '0') + 4));
                } else if (c10 >= 'a' && c10 <= 'z') {
                    sb2.append((char) ((c10 - 'a') + 14));
                } else {
                    if (c10 < ' ') {
                        sb2.append((char) 0);
                        sb2.append(c10);
                        return 2;
                    }
                    if (c10 >= '!' && c10 <= '/') {
                        sb2.append((char) 1);
                        sb2.append((char) (c10 - '!'));
                        return 2;
                    }
                    if (c10 >= ':' && c10 <= '@') {
                        sb2.append((char) 1);
                        sb2.append((char) ((c10 - AbstractJsonLexerKt.COLON) + 15));
                        return 2;
                    }
                    if (c10 >= '[' && c10 <= '_') {
                        sb2.append((char) 1);
                        sb2.append((char) ((c10 - AbstractJsonLexerKt.BEGIN_LIST) + 22));
                        return 2;
                    }
                    if (c10 == '`') {
                        sb2.append((char) 2);
                        sb2.append((char) (c10 - '`'));
                        return 2;
                    }
                    if (c10 >= 'A' && c10 <= 'Z') {
                        sb2.append((char) 2);
                        sb2.append((char) ((c10 - 'A') + 1));
                        return 2;
                    }
                    if (c10 >= '{' && c10 <= 127) {
                        sb2.append((char) 2);
                        sb2.append((char) ((c10 - AbstractJsonLexerKt.BEGIN_OBJ) + 27));
                        return 2;
                    }
                    sb2.append("\u0001\u001e");
                    return 2 + o(sb2, (char) (c10 - 128));
                }
                return 1;
            default:
                if (c10 != '\r') {
                    if (c10 != ' ') {
                        if (c10 != '*') {
                            if (c10 != '>') {
                                if (c10 >= '0' && c10 <= '9') {
                                    sb2.append((char) ((c10 - '0') + 4));
                                } else if (c10 >= 'A' && c10 <= 'Z') {
                                    sb2.append((char) ((c10 - 'A') + 14));
                                } else {
                                    com.facebook.appevents.g.r(c10);
                                    throw null;
                                }
                            } else {
                                sb2.append((char) 2);
                            }
                        } else {
                            sb2.append((char) 1);
                        }
                    } else {
                        sb2.append((char) 3);
                    }
                } else {
                    sb2.append((char) 0);
                }
                return 1;
        }
    }

    @Override // wh.a0
    public final int t() {
        switch (this.f17327d) {
            case 0:
                return 2;
            default:
                return 3;
        }
    }

    @Override // wh.a0
    public final void w(c cVar, StringBuilder sb2) {
        switch (this.f17327d) {
            case 1:
                cVar.d(cVar.a());
                int a = cVar.f17310f.f17316b - cVar.a();
                cVar.f17308d -= sb2.length();
                String str = cVar.a;
                if ((str.length() - cVar.f17311g) - cVar.f17308d > 1 || a > 1 || (str.length() - cVar.f17311g) - cVar.f17308d != a) {
                    cVar.e((char) 254);
                }
                if (cVar.f17309e < 0) {
                    cVar.f17309e = 0;
                    return;
                }
                return;
            default:
                super.w(cVar, sb2);
                return;
        }
    }
}
