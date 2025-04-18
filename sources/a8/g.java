package a8;

import com.google.common.collect.m0;
import com.google.common.collect.n0;
import com.google.common.collect.r0;
import com.google.common.collect.z1;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import n9.h0;
import n9.o;
import n9.x;
import s7.q0;

/* loaded from: classes3.dex */
public final class g implements a {
    public final r0 a;

    /* renamed from: b, reason: collision with root package name */
    public final int f342b;

    public g(int i10, z1 z1Var) {
        this.f342b = i10;
        this.a = z1Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0036. Please report as an issue. */
    public static g b(int i10, x xVar) {
        a aVar;
        String str;
        String str2;
        a hVar;
        m0 m0Var = new m0();
        int i11 = xVar.f22600c;
        int i12 = -2;
        while (xVar.f22600c - xVar.f22599b > 8) {
            int i13 = xVar.i();
            int i14 = xVar.f22599b + xVar.i();
            xVar.F(i14);
            if (i13 == 1414744396) {
                aVar = b(xVar.i(), xVar);
            } else {
                switch (i13) {
                    case 1718776947:
                        if (i12 == 2) {
                            xVar.H(4);
                            int i15 = xVar.i();
                            int i16 = xVar.i();
                            xVar.H(4);
                            int i17 = xVar.i();
                            switch (i17) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = MimeTypes.VIDEO_MP4V;
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = MimeTypes.VIDEO_H264;
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.v("Ignoring track with unsupported compression ", i17, "StreamFormatChunk");
                            } else {
                                q0 q0Var = new q0();
                                q0Var.f24672p = i15;
                                q0Var.f24673q = i16;
                                q0Var.f24667k = str2;
                                hVar = new h(new s7.r0(q0Var));
                                aVar = hVar;
                                break;
                            }
                        } else if (i12 == 1) {
                            int n10 = xVar.n();
                            if (n10 != 1) {
                                if (n10 != 85) {
                                    if (n10 != 255) {
                                        if (n10 != 8192) {
                                            if (n10 != 8193) {
                                                str = null;
                                            } else {
                                                str = MimeTypes.AUDIO_DTS;
                                            }
                                        } else {
                                            str = MimeTypes.AUDIO_AC3;
                                        }
                                    } else {
                                        str = MimeTypes.AUDIO_AAC;
                                    }
                                } else {
                                    str = MimeTypes.AUDIO_MPEG;
                                }
                            } else {
                                str = MimeTypes.AUDIO_RAW;
                            }
                            if (str == null) {
                                kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.v("Ignoring track with unsupported format tag ", n10, "StreamFormatChunk");
                            } else {
                                int n11 = xVar.n();
                                int i18 = xVar.i();
                                xVar.H(6);
                                int s5 = h0.s(xVar.A());
                                int n12 = xVar.n();
                                byte[] bArr = new byte[n12];
                                xVar.d(bArr, 0, n12);
                                q0 q0Var2 = new q0();
                                q0Var2.f24667k = str;
                                q0Var2.f24679x = n11;
                                q0Var2.f24680y = i18;
                                if (MimeTypes.AUDIO_RAW.equals(str) && s5 != 0) {
                                    q0Var2.f24681z = s5;
                                }
                                if (MimeTypes.AUDIO_AAC.equals(str) && n12 > 0) {
                                    q0Var2.f24669m = r0.o(bArr);
                                }
                                aVar = new h(new s7.r0(q0Var2));
                                break;
                            }
                        } else {
                            o.f("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + h0.y(i12));
                        }
                        aVar = null;
                        break;
                    case 1751742049:
                        int i19 = xVar.i();
                        xVar.H(8);
                        int i20 = xVar.i();
                        int i21 = xVar.i();
                        xVar.H(4);
                        xVar.i();
                        xVar.H(12);
                        aVar = new d(i19, i20, i21);
                        break;
                    case 1752331379:
                        int i22 = xVar.i();
                        xVar.H(12);
                        xVar.i();
                        int i23 = xVar.i();
                        int i24 = xVar.i();
                        xVar.H(4);
                        int i25 = xVar.i();
                        int i26 = xVar.i();
                        xVar.H(8);
                        hVar = new e(i22, i23, i24, i25, i26);
                        aVar = hVar;
                        break;
                    case 1852994675:
                        aVar = new i(xVar.s(xVar.f22600c - xVar.f22599b));
                        break;
                    default:
                        aVar = null;
                        break;
                }
            }
            if (aVar != null) {
                if (aVar.getType() == 1752331379) {
                    int i27 = ((e) aVar).a;
                    if (i27 != 1935960438) {
                        if (i27 != 1935963489) {
                            if (i27 != 1937012852) {
                                o.f("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i27));
                                i12 = -1;
                            } else {
                                i12 = 3;
                            }
                        } else {
                            i12 = 1;
                        }
                    } else {
                        i12 = 2;
                    }
                }
                m0Var.u(aVar);
            }
            xVar.G(i14);
            xVar.F(i11);
        }
        return new g(i10, m0Var.y());
    }

    public final a a(Class cls) {
        n0 listIterator = this.a.listIterator(0);
        while (listIterator.hasNext()) {
            a aVar = (a) listIterator.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    @Override // a8.a
    public final int getType() {
        return this.f342b;
    }
}
