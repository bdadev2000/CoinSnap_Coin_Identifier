package nb;

import a4.m;
import a4.y;
import android.util.Base64;
import android.util.JsonReader;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l7.e;
import mb.a0;
import mb.b0;
import mb.f0;
import mb.f1;
import mb.g0;
import mb.h1;
import mb.i0;
import mb.l1;
import mb.m0;
import mb.m1;
import mb.o0;
import mb.o1;
import mb.p0;
import mb.q0;
import mb.s2;
import mb.x0;
import n0.h;
import xb.d;
import y7.u;

/* loaded from: classes3.dex */
public final class c {
    public static final u a;

    static {
        d dVar = new d();
        b6.a.f2289g.c(dVar);
        dVar.f27622d = true;
        a = new u(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static mb.c1 a(android.util.JsonReader r7) {
        /*
            mb.b1 r0 = new mb.b1
            r0.<init>()
            r7.beginObject()
        L8:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L9e
            java.lang.String r1 = r7.nextName()
            r1.getClass()
            int r2 = r1.hashCode()
            r3 = 4
            r4 = 2
            r5 = 1
            r6 = -1
            switch(r2) {
                case -1019779949: goto L4d;
                case -887523944: goto L42;
                case 3571: goto L37;
                case 3143036: goto L2c;
                case 2125650548: goto L21;
                default: goto L20;
            }
        L20:
            goto L57
        L21:
            java.lang.String r2 = "importance"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L2a
            goto L57
        L2a:
            r6 = r3
            goto L57
        L2c:
            java.lang.String r2 = "file"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L35
            goto L57
        L35:
            r6 = 3
            goto L57
        L37:
            java.lang.String r2 = "pc"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L40
            goto L57
        L40:
            r6 = r4
            goto L57
        L42:
            java.lang.String r2 = "symbol"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L4b
            goto L57
        L4b:
            r6 = r5
            goto L57
        L4d:
            java.lang.String r2 = "offset"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L56
            goto L57
        L56:
            r6 = 0
        L57:
            switch(r6) {
                case 0: goto L90;
                case 1: goto L7f;
                case 2: goto L72;
                case 3: goto L6b;
                case 4: goto L5e;
                default: goto L5a;
            }
        L5a:
            r7.skipValue()
            goto L8
        L5e:
            int r1 = r7.nextInt()
            r0.f21857e = r1
            byte r1 = r0.f21858f
            r1 = r1 | r3
            byte r1 = (byte) r1
            r0.f21858f = r1
            goto L8
        L6b:
            java.lang.String r1 = r7.nextString()
            r0.f21855c = r1
            goto L8
        L72:
            long r1 = r7.nextLong()
            r0.a = r1
            byte r1 = r0.f21858f
            r1 = r1 | r5
            byte r1 = (byte) r1
            r0.f21858f = r1
            goto L8
        L7f:
            java.lang.String r1 = r7.nextString()
            if (r1 == 0) goto L88
            r0.f21854b = r1
            goto L8
        L88:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "Null symbol"
            r7.<init>(r0)
            throw r7
        L90:
            long r1 = r7.nextLong()
            r0.f21856d = r1
            byte r1 = r0.f21858f
            r1 = r1 | r4
            byte r1 = (byte) r1
            r0.f21858f = r1
            goto L8
        L9e:
            r7.endObject()
            mb.c1 r7 = r0.a()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.c.a(android.util.JsonReader):mb.c1");
    }

    public static f0 b(JsonReader jsonReader) {
        y yVar = new y(3);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("key")) {
                if (!nextName.equals(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                    jsonReader.skipValue();
                } else {
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        yVar.f171c = nextString;
                    } else {
                        throw new NullPointerException("Null value");
                    }
                }
            } else {
                String nextString2 = jsonReader.nextString();
                if (nextString2 != null) {
                    yVar.f170b = nextString2;
                } else {
                    throw new NullPointerException("Null key");
                }
            }
        }
        jsonReader.endObject();
        return yVar.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x008b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static mb.d0 c(android.util.JsonReader r8) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.c.c(android.util.JsonReader):mb.d0");
    }

    public static List d(JsonReader jsonReader, b bVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(bVar.e(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    public static p0 e(JsonReader jsonReader) {
        boolean z10;
        boolean z11;
        char c10;
        boolean z12;
        boolean z13;
        o0 o0Var = new o0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        z10 = false;
                        break;
                    }
                    break;
                case -259312414:
                    if (nextName.equals("rollouts")) {
                        z10 = true;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals(MBridgeConstans.DYNAMIC_VIEW_WX_APP)) {
                        z10 = 2;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        z10 = 3;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        z10 = 4;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals(CampaignEx.JSON_KEY_TIMESTAMP)) {
                        z10 = 5;
                        break;
                    }
                    break;
            }
            z10 = -1;
            switch (z10) {
                case false:
                    f1 f1Var = new f1();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        switch (nextName2.hashCode()) {
                            case -1708606089:
                                if (nextName2.equals("batteryLevel")) {
                                    z11 = false;
                                    break;
                                }
                                break;
                            case -1455558134:
                                if (nextName2.equals("batteryVelocity")) {
                                    z11 = true;
                                    break;
                                }
                                break;
                            case -1439500848:
                                if (nextName2.equals("orientation")) {
                                    z11 = 2;
                                    break;
                                }
                                break;
                            case 279795450:
                                if (nextName2.equals("diskUsed")) {
                                    z11 = 3;
                                    break;
                                }
                                break;
                            case 976541947:
                                if (nextName2.equals("ramUsed")) {
                                    z11 = 4;
                                    break;
                                }
                                break;
                            case 1516795582:
                                if (nextName2.equals("proximityOn")) {
                                    z11 = 5;
                                    break;
                                }
                                break;
                        }
                        z11 = -1;
                        switch (z11) {
                            case false:
                                f1Var.a = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case true:
                                f1Var.f21908b = jsonReader.nextInt();
                                f1Var.f21913g = (byte) (f1Var.f21913g | 1);
                                break;
                            case true:
                                f1Var.f21910d = jsonReader.nextInt();
                                f1Var.f21913g = (byte) (f1Var.f21913g | 4);
                                break;
                            case true:
                                f1Var.f21912f = jsonReader.nextLong();
                                f1Var.f21913g = (byte) (f1Var.f21913g | Ascii.DLE);
                                break;
                            case true:
                                f1Var.f21911e = jsonReader.nextLong();
                                f1Var.f21913g = (byte) (f1Var.f21913g | 8);
                                break;
                            case true:
                                f1Var.f21909c = jsonReader.nextBoolean();
                                f1Var.f21913g = (byte) (f1Var.f21913g | 2);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    o0Var.f22035d = f1Var.a();
                    break;
                case true:
                    androidx.viewpager2.adapter.c cVar = new androidx.viewpager2.adapter.c(2);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        if (!nextName3.equals("assignments")) {
                            jsonReader.skipValue();
                        } else {
                            List d10 = d(jsonReader, new h(23));
                            if (d10 != null) {
                                cVar.f2129b = d10;
                            } else {
                                throw new NullPointerException("Null rolloutAssignments");
                            }
                        }
                    }
                    jsonReader.endObject();
                    List list = cVar.f2129b;
                    if (list != null) {
                        o0Var.f22037f = new l1(list);
                        break;
                    } else {
                        throw new IllegalStateException("Missing required properties: rolloutAssignments");
                    }
                case true:
                    q0 q0Var = new q0();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName4 = jsonReader.nextName();
                        nextName4.getClass();
                        switch (nextName4.hashCode()) {
                            case -1405314732:
                                if (nextName4.equals("appProcessDetails")) {
                                    c10 = 0;
                                    break;
                                }
                                break;
                            case -1332194002:
                                if (nextName4.equals("background")) {
                                    c10 = 1;
                                    break;
                                }
                                break;
                            case -1090974952:
                                if (nextName4.equals("execution")) {
                                    c10 = 2;
                                    break;
                                }
                                break;
                            case -80231855:
                                if (nextName4.equals("internalKeys")) {
                                    c10 = 3;
                                    break;
                                }
                                break;
                            case 555169704:
                                if (nextName4.equals("customAttributes")) {
                                    c10 = 4;
                                    break;
                                }
                                break;
                            case 928737948:
                                if (nextName4.equals("uiOrientation")) {
                                    c10 = 5;
                                    break;
                                }
                                break;
                            case 1847730860:
                                if (nextName4.equals("currentProcessDetails")) {
                                    c10 = 6;
                                    break;
                                }
                                break;
                        }
                        c10 = 65535;
                        switch (c10) {
                            case 0:
                                q0Var.f22058f = d(jsonReader, new h(26));
                                break;
                            case 1:
                                q0Var.f22056d = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            case 2:
                                w3.h hVar = new w3.h();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -1375141843:
                                            if (nextName5.equals("appExitInfo")) {
                                                z12 = false;
                                                break;
                                            }
                                            break;
                                        case -1337936983:
                                            if (nextName5.equals("threads")) {
                                                z12 = true;
                                                break;
                                            }
                                            break;
                                        case -902467928:
                                            if (nextName5.equals("signal")) {
                                                z12 = 2;
                                                break;
                                            }
                                            break;
                                        case 937615455:
                                            if (nextName5.equals("binaries")) {
                                                z12 = 3;
                                                break;
                                            }
                                            break;
                                        case 1481625679:
                                            if (nextName5.equals("exception")) {
                                                z12 = 4;
                                                break;
                                            }
                                            break;
                                    }
                                    z12 = -1;
                                    switch (z12) {
                                        case false:
                                            hVar.f26700c = c(jsonReader);
                                            break;
                                        case true:
                                            hVar.a = d(jsonReader, new h(28));
                                            break;
                                        case true:
                                            x0 x0Var = new x0();
                                            jsonReader.beginObject();
                                            while (jsonReader.hasNext()) {
                                                String nextName6 = jsonReader.nextName();
                                                nextName6.getClass();
                                                switch (nextName6.hashCode()) {
                                                    case -1147692044:
                                                        if (nextName6.equals("address")) {
                                                            z13 = false;
                                                            break;
                                                        }
                                                        break;
                                                    case 3059181:
                                                        if (nextName6.equals("code")) {
                                                            z13 = true;
                                                            break;
                                                        }
                                                        break;
                                                    case 3373707:
                                                        if (nextName6.equals("name")) {
                                                            z13 = 2;
                                                            break;
                                                        }
                                                        break;
                                                }
                                                z13 = -1;
                                                switch (z13) {
                                                    case false:
                                                        x0Var.f22127c = jsonReader.nextLong();
                                                        x0Var.f22128d = (byte) (x0Var.f22128d | 1);
                                                        break;
                                                    case true:
                                                        String nextString = jsonReader.nextString();
                                                        if (nextString != null) {
                                                            x0Var.f22126b = nextString;
                                                            break;
                                                        } else {
                                                            throw new NullPointerException("Null code");
                                                        }
                                                    case true:
                                                        String nextString2 = jsonReader.nextString();
                                                        if (nextString2 != null) {
                                                            x0Var.a = nextString2;
                                                            break;
                                                        } else {
                                                            throw new NullPointerException("Null name");
                                                        }
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            hVar.f26701d = x0Var.a();
                                            break;
                                        case true:
                                            List d11 = d(jsonReader, new h(29));
                                            if (d11 != null) {
                                                hVar.f26702e = d11;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null binaries");
                                            }
                                        case true:
                                            hVar.f26699b = f(jsonReader);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                q0Var.a = hVar.b();
                                break;
                            case 3:
                                q0Var.f22055c = d(jsonReader, new h(25));
                                break;
                            case 4:
                                q0Var.f22054b = d(jsonReader, new h(24));
                                break;
                            case 5:
                                q0Var.f22059g = jsonReader.nextInt();
                                q0Var.f22060h = (byte) (q0Var.f22060h | 1);
                                break;
                            case 6:
                                q0Var.f22057e = g(jsonReader);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    o0Var.f22034c = q0Var.a();
                    break;
                case true:
                    a4.b bVar = new a4.b();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals(AppLovinEventTypes.USER_VIEWED_CONTENT)) {
                            String nextString3 = jsonReader.nextString();
                            if (nextString3 != null) {
                                bVar.a = nextString3;
                            } else {
                                throw new NullPointerException("Null content");
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    String str = bVar.a;
                    if (str != null) {
                        o0Var.f22036e = new h1(str);
                        break;
                    } else {
                        throw new IllegalStateException("Missing required properties: content");
                    }
                case true:
                    String nextString4 = jsonReader.nextString();
                    if (nextString4 != null) {
                        o0Var.f22033b = nextString4;
                        break;
                    } else {
                        throw new NullPointerException("Null type");
                    }
                case true:
                    o0Var.a = jsonReader.nextLong();
                    o0Var.f22038g = (byte) (o0Var.f22038g | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return o0Var.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0058 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static mb.w0 f(android.util.JsonReader r5) {
        /*
            mb.v0 r0 = new mb.v0
            r0.<init>()
            r5.beginObject()
        L8:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L9f
            java.lang.String r1 = r5.nextName()
            r1.getClass()
            int r2 = r1.hashCode()
            r3 = 1
            r4 = -1
            switch(r2) {
                case -1266514778: goto L4b;
                case -934964668: goto L40;
                case 3575610: goto L35;
                case 91997906: goto L2a;
                case 581754413: goto L1f;
                default: goto L1e;
            }
        L1e:
            goto L55
        L1f:
            java.lang.String r2 = "overflowCount"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L28
            goto L55
        L28:
            r4 = 4
            goto L55
        L2a:
            java.lang.String r2 = "causedBy"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L33
            goto L55
        L33:
            r4 = 3
            goto L55
        L35:
            java.lang.String r2 = "type"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L3e
            goto L55
        L3e:
            r4 = 2
            goto L55
        L40:
            java.lang.String r2 = "reason"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L49
            goto L55
        L49:
            r4 = r3
            goto L55
        L4b:
            java.lang.String r2 = "frames"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L54
            goto L55
        L54:
            r4 = 0
        L55:
            switch(r4) {
                case 0: goto L88;
                case 1: goto L81;
                case 2: goto L70;
                case 3: goto L69;
                case 4: goto L5c;
                default: goto L58;
            }
        L58:
            r5.skipValue()
            goto L8
        L5c:
            int r1 = r5.nextInt()
            r0.f22117e = r1
            byte r1 = r0.f22118f
            r1 = r1 | r3
            byte r1 = (byte) r1
            r0.f22118f = r1
            goto L8
        L69:
            mb.w0 r1 = f(r5)
            r0.f22116d = r1
            goto L8
        L70:
            java.lang.String r1 = r5.nextString()
            if (r1 == 0) goto L79
            r0.a = r1
            goto L8
        L79:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "Null type"
            r5.<init>(r0)
            throw r5
        L81:
            java.lang.String r1 = r5.nextString()
            r0.f22114b = r1
            goto L8
        L88:
            nb.a r1 = new nb.a
            r1.<init>(r3)
            java.util.List r1 = d(r5, r1)
            if (r1 == 0) goto L97
            r0.f22115c = r1
            goto L8
        L97:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "Null frames"
            r5.<init>(r0)
            throw r5
        L9f:
            r5.endObject()
            mb.w0 r5 = r0.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.c.f(android.util.JsonReader):mb.w0");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static mb.e1 g(android.util.JsonReader r6) {
        /*
            mb.d1 r0 = new mb.d1
            r0.<init>()
            r6.beginObject()
        L8:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L8c
            java.lang.String r1 = r6.nextName()
            r1.getClass()
            int r2 = r1.hashCode()
            r3 = 2
            r4 = 1
            r5 = -1
            switch(r2) {
                case 110987: goto L41;
                case 202325402: goto L36;
                case 1694598382: goto L2b;
                case 2125650548: goto L20;
                default: goto L1f;
            }
        L1f:
            goto L4b
        L20:
            java.lang.String r2 = "importance"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L29
            goto L4b
        L29:
            r5 = 3
            goto L4b
        L2b:
            java.lang.String r2 = "defaultProcess"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L34
            goto L4b
        L34:
            r5 = r3
            goto L4b
        L36:
            java.lang.String r2 = "processName"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L3f
            goto L4b
        L3f:
            r5 = r4
            goto L4b
        L41:
            java.lang.String r2 = "pid"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L4a
            goto L4b
        L4a:
            r5 = 0
        L4b:
            switch(r5) {
                case 0: goto L7e;
                case 1: goto L6d;
                case 2: goto L5f;
                case 3: goto L52;
                default: goto L4e;
            }
        L4e:
            r6.skipValue()
            goto L8
        L52:
            int r1 = r6.nextInt()
            r0.f21895c = r1
            byte r1 = r0.f21897e
            r1 = r1 | r3
            byte r1 = (byte) r1
            r0.f21897e = r1
            goto L8
        L5f:
            boolean r1 = r6.nextBoolean()
            r0.f21896d = r1
            byte r1 = r0.f21897e
            r1 = r1 | 4
            byte r1 = (byte) r1
            r0.f21897e = r1
            goto L8
        L6d:
            java.lang.String r1 = r6.nextString()
            if (r1 == 0) goto L76
            r0.a = r1
            goto L8
        L76:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "Null processName"
            r6.<init>(r0)
            throw r6
        L7e:
            int r1 = r6.nextInt()
            r0.f21894b = r1
            byte r1 = r0.f21897e
            r1 = r1 | r4
            byte r1 = (byte) r1
            r0.f21897e = r1
            goto L8
        L8c:
            r6.endObject()
            mb.e1 r6 = r0.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.c.g(android.util.JsonReader):mb.e1");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x00e8. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0181. Please report as an issue. */
    public static b0 h(JsonReader jsonReader) {
        char c10;
        byte b3;
        char c11;
        char c12;
        char c13;
        Charset charset = s2.a;
        a0 a0Var = new a0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            byte b10 = 2;
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case -401988390:
                    if (nextName.equals("firebaseAuthenticationToken")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 1047652060:
                    if (nextName.equals("firebaseInstallationId")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c10 = '\t';
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c10 = '\n';
                        break;
                    }
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c10 = 11;
                        break;
                    }
                    break;
            }
            c10 = 65535;
            switch (c10) {
                case 0:
                    e eVar = new e(1);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (!nextName2.equals("files")) {
                            if (!nextName2.equals("orgId")) {
                                jsonReader.skipValue();
                            } else {
                                eVar.f21154b = jsonReader.nextString();
                            }
                        } else {
                            List d10 = d(jsonReader, new h(22));
                            if (d10 != null) {
                                eVar.a = d10;
                            } else {
                                throw new NullPointerException("Null files");
                            }
                        }
                    }
                    jsonReader.endObject();
                    List list = eVar.a;
                    if (list != null) {
                        a0Var.f21828k = new g0(list, eVar.f21154b);
                        break;
                    } else {
                        throw new IllegalStateException("Missing required properties: files");
                    }
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        a0Var.a = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null sdkVersion");
                    }
                case 2:
                    a0Var.f21824g = jsonReader.nextString();
                    break;
                case 3:
                    a0Var.f21829l = c(jsonReader);
                    break;
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 != null) {
                        a0Var.f21825h = nextString2;
                        break;
                    } else {
                        throw new NullPointerException("Null buildVersion");
                    }
                case 5:
                    a0Var.f21823f = jsonReader.nextString();
                    break;
                case 6:
                    String nextString3 = jsonReader.nextString();
                    if (nextString3 != null) {
                        a0Var.f21819b = nextString3;
                        break;
                    } else {
                        throw new NullPointerException("Null gmpAppId");
                    }
                case 7:
                    String nextString4 = jsonReader.nextString();
                    if (nextString4 != null) {
                        a0Var.f21821d = nextString4;
                        break;
                    } else {
                        throw new NullPointerException("Null installationUuid");
                    }
                case '\b':
                    a0Var.f21822e = jsonReader.nextString();
                    break;
                case '\t':
                    a0Var.f21820c = jsonReader.nextInt();
                    a0Var.f21830m = (byte) (a0Var.f21830m | 1);
                    break;
                case '\n':
                    String nextString5 = jsonReader.nextString();
                    if (nextString5 != null) {
                        a0Var.f21826i = nextString5;
                        break;
                    } else {
                        throw new NullPointerException("Null displayVersion");
                    }
                case 11:
                    i0 i0Var = new i0();
                    i0Var.f21941f = false;
                    i0Var.f21948m = (byte) (i0Var.f21948m | 2);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -2128794476:
                                if (nextName3.equals("startedAt")) {
                                    b3 = 0;
                                    break;
                                }
                                b3 = -1;
                                break;
                            case -1907185581:
                                if (nextName3.equals("appQualitySessionId")) {
                                    b3 = 1;
                                    break;
                                }
                                b3 = -1;
                                break;
                            case -1618432855:
                                if (nextName3.equals("identifier")) {
                                    b3 = b10;
                                    break;
                                }
                                b3 = -1;
                                break;
                            case -1606742899:
                                if (nextName3.equals("endedAt")) {
                                    b3 = 3;
                                    break;
                                }
                                b3 = -1;
                                break;
                            case -1335157162:
                                if (nextName3.equals("device")) {
                                    b3 = 4;
                                    break;
                                }
                                b3 = -1;
                                break;
                            case -1291329255:
                                if (nextName3.equals("events")) {
                                    b3 = 5;
                                    break;
                                }
                                b3 = -1;
                                break;
                            case 3556:
                                if (nextName3.equals("os")) {
                                    b3 = 6;
                                    break;
                                }
                                b3 = -1;
                                break;
                            case 96801:
                                if (nextName3.equals(MBridgeConstans.DYNAMIC_VIEW_WX_APP)) {
                                    b3 = 7;
                                    break;
                                }
                                b3 = -1;
                                break;
                            case 3599307:
                                if (nextName3.equals("user")) {
                                    b3 = 8;
                                    break;
                                }
                                b3 = -1;
                                break;
                            case 286956243:
                                if (nextName3.equals("generator")) {
                                    b3 = 9;
                                    break;
                                }
                                b3 = -1;
                                break;
                            case 1025385094:
                                if (nextName3.equals("crashed")) {
                                    b3 = 10;
                                    break;
                                }
                                b3 = -1;
                                break;
                            case 2047016109:
                                if (nextName3.equals("generatorType")) {
                                    b3 = Ascii.VT;
                                    break;
                                }
                                b3 = -1;
                                break;
                            default:
                                b3 = -1;
                                break;
                        }
                        switch (b3) {
                            case 0:
                                i0Var.f21939d = jsonReader.nextLong();
                                i0Var.f21948m = (byte) (i0Var.f21948m | 1);
                            case 1:
                                i0Var.f21938c = jsonReader.nextString();
                            case 2:
                                b10 = 2;
                                i0Var.f21937b = new String(Base64.decode(jsonReader.nextString(), 2), s2.a);
                            case 3:
                                i0Var.f21940e = Long.valueOf(jsonReader.nextLong());
                                b10 = 2;
                            case 4:
                                m0 m0Var = new m0();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    switch (nextName4.hashCode()) {
                                        case -1981332476:
                                            if (nextName4.equals("simulator")) {
                                                c11 = 0;
                                                break;
                                            }
                                            break;
                                        case -1969347631:
                                            if (nextName4.equals("manufacturer")) {
                                                c11 = 1;
                                                break;
                                            }
                                            break;
                                        case 112670:
                                            if (nextName4.equals("ram")) {
                                                c11 = 2;
                                                break;
                                            }
                                            break;
                                        case 3002454:
                                            if (nextName4.equals("arch")) {
                                                c11 = 3;
                                                break;
                                            }
                                            break;
                                        case 81784169:
                                            if (nextName4.equals("diskSpace")) {
                                                c11 = 4;
                                                break;
                                            }
                                            break;
                                        case 94848180:
                                            if (nextName4.equals("cores")) {
                                                c11 = 5;
                                                break;
                                            }
                                            break;
                                        case 104069929:
                                            if (nextName4.equals("model")) {
                                                c11 = 6;
                                                break;
                                            }
                                            break;
                                        case 109757585:
                                            if (nextName4.equals("state")) {
                                                c11 = 7;
                                                break;
                                            }
                                            break;
                                        case 2078953423:
                                            if (nextName4.equals("modelClass")) {
                                                c11 = '\b';
                                                break;
                                            }
                                            break;
                                    }
                                    c11 = 65535;
                                    switch (c11) {
                                        case 0:
                                            m0Var.f22005f = jsonReader.nextBoolean();
                                            m0Var.f22009j = (byte) (m0Var.f22009j | Ascii.DLE);
                                            break;
                                        case 1:
                                            String nextString6 = jsonReader.nextString();
                                            if (nextString6 != null) {
                                                m0Var.f22007h = nextString6;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                        case 2:
                                            m0Var.f22003d = jsonReader.nextLong();
                                            m0Var.f22009j = (byte) (m0Var.f22009j | 4);
                                            break;
                                        case 3:
                                            m0Var.a = jsonReader.nextInt();
                                            m0Var.f22009j = (byte) (m0Var.f22009j | 1);
                                            break;
                                        case 4:
                                            m0Var.f22004e = jsonReader.nextLong();
                                            m0Var.f22009j = (byte) (m0Var.f22009j | 8);
                                            break;
                                        case 5:
                                            m0Var.f22002c = jsonReader.nextInt();
                                            m0Var.f22009j = (byte) (m0Var.f22009j | 2);
                                            break;
                                        case 6:
                                            String nextString7 = jsonReader.nextString();
                                            if (nextString7 != null) {
                                                m0Var.f22001b = nextString7;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null model");
                                            }
                                        case 7:
                                            m0Var.f22006g = jsonReader.nextInt();
                                            m0Var.f22009j = (byte) (m0Var.f22009j | 32);
                                            break;
                                        case '\b':
                                            String nextString8 = jsonReader.nextString();
                                            if (nextString8 != null) {
                                                m0Var.f22008i = nextString8;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null modelClass");
                                            }
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                i0Var.f21945j = m0Var.a();
                                b10 = 2;
                            case 5:
                                i0Var.f21946k = d(jsonReader, new h(21));
                                b10 = 2;
                            case 6:
                                m1 m1Var = new m1();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -911706486:
                                            if (nextName5.equals("buildVersion")) {
                                                c12 = 0;
                                                break;
                                            }
                                            break;
                                        case -293026577:
                                            if (nextName5.equals("jailbroken")) {
                                                c12 = 1;
                                                break;
                                            }
                                            break;
                                        case 351608024:
                                            if (nextName5.equals("version")) {
                                                c12 = 2;
                                                break;
                                            }
                                            break;
                                        case 1874684019:
                                            if (nextName5.equals("platform")) {
                                                c12 = 3;
                                                break;
                                            }
                                            break;
                                    }
                                    c12 = 65535;
                                    switch (c12) {
                                        case 0:
                                            String nextString9 = jsonReader.nextString();
                                            if (nextString9 != null) {
                                                m1Var.f22011c = nextString9;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null buildVersion");
                                            }
                                        case 1:
                                            m1Var.f22012d = jsonReader.nextBoolean();
                                            m1Var.f22013e = (byte) (m1Var.f22013e | 2);
                                            break;
                                        case 2:
                                            String nextString10 = jsonReader.nextString();
                                            if (nextString10 != null) {
                                                m1Var.f22010b = nextString10;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null version");
                                            }
                                        case 3:
                                            m1Var.a = jsonReader.nextInt();
                                            m1Var.f22013e = (byte) (m1Var.f22013e | 1);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                i0Var.f21944i = m1Var.a();
                                b10 = 2;
                            case 7:
                                ob.c cVar = new ob.c();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName6 = jsonReader.nextName();
                                    nextName6.getClass();
                                    switch (nextName6.hashCode()) {
                                        case -1618432855:
                                            if (nextName6.equals("identifier")) {
                                                c13 = 0;
                                                break;
                                            }
                                            break;
                                        case -519438642:
                                            if (nextName6.equals("developmentPlatform")) {
                                                c13 = 1;
                                                break;
                                            }
                                            break;
                                        case 213652010:
                                            if (nextName6.equals("developmentPlatformVersion")) {
                                                c13 = 2;
                                                break;
                                            }
                                            break;
                                        case 351608024:
                                            if (nextName6.equals("version")) {
                                                c13 = 3;
                                                break;
                                            }
                                            break;
                                        case 719853845:
                                            if (nextName6.equals("installationUuid")) {
                                                c13 = 4;
                                                break;
                                            }
                                            break;
                                        case 1975623094:
                                            if (nextName6.equals("displayVersion")) {
                                                c13 = 5;
                                                break;
                                            }
                                            break;
                                    }
                                    c13 = 65535;
                                    switch (c13) {
                                        case 0:
                                            String nextString11 = jsonReader.nextString();
                                            if (nextString11 != null) {
                                                cVar.a = nextString11;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null identifier");
                                            }
                                        case 1:
                                            cVar.f23296f = jsonReader.nextString();
                                            break;
                                        case 2:
                                            cVar.f23297g = jsonReader.nextString();
                                            break;
                                        case 3:
                                            String nextString12 = jsonReader.nextString();
                                            if (nextString12 != null) {
                                                cVar.f23292b = nextString12;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null version");
                                            }
                                        case 4:
                                            cVar.f23295e = jsonReader.nextString();
                                            break;
                                        case 5:
                                            cVar.f23293c = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                i0Var.f21942g = cVar.k();
                                b10 = 2;
                            case 8:
                                m mVar = new m();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        String nextString13 = jsonReader.nextString();
                                        if (nextString13 != null) {
                                            mVar.f153b = nextString13;
                                        } else {
                                            throw new NullPointerException("Null identifier");
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                String str = mVar.f153b;
                                if (str != null) {
                                    i0Var.f21943h = new o1(str);
                                } else {
                                    throw new IllegalStateException("Missing required properties: identifier");
                                }
                            case 9:
                                String nextString14 = jsonReader.nextString();
                                if (nextString14 != null) {
                                    i0Var.a = nextString14;
                                } else {
                                    throw new NullPointerException("Null generator");
                                }
                            case 10:
                                i0Var.f21941f = jsonReader.nextBoolean();
                                i0Var.f21948m = (byte) (i0Var.f21948m | b10);
                            case 11:
                                i0Var.f21947l = jsonReader.nextInt();
                                i0Var.f21948m = (byte) (i0Var.f21948m | 4);
                            default:
                                jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    a0Var.f21827j = i0Var.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a0Var.a();
    }

    public static b0 i(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                b0 h10 = h(jsonReader);
                jsonReader.close();
                return h10;
            } finally {
            }
        } catch (IllegalStateException e2) {
            throw new IOException(e2);
        }
    }
}
