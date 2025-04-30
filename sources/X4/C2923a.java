package x4;

import I4.d;
import android.util.Base64;
import android.util.JsonReader;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.o;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n1.C2475f;
import p4.i;
import w4.C2862A;
import w4.C2864C;
import w4.C2869b0;
import w4.C2875e0;
import w4.C2883i0;
import w4.C2889l0;
import w4.E;
import w4.G;
import w4.H;
import w4.L;
import w4.P0;
import w4.Q;
import w4.S;
import w4.T;
import w4.V;
import w4.W;

/* renamed from: x4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2923a {

    /* renamed from: a, reason: collision with root package name */
    public static final C2475f f24234a;

    static {
        d dVar = new d();
        C2862A.f23685a.a(dVar);
        dVar.f1462d = true;
        f24234a = new C2475f(dVar, 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, w4.Y] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static w4.Z a(android.util.JsonReader r7) {
        /*
            r0 = 4
            r1 = 2
            r2 = 1
            w4.Y r3 = new w4.Y
            r3.<init>()
            r7.beginObject()
        Lb:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L9e
            java.lang.String r4 = r7.nextName()
            r4.getClass()
            r5 = -1
            int r6 = r4.hashCode()
            switch(r6) {
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
            java.lang.String r6 = "importance"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L2a
            goto L57
        L2a:
            r5 = r0
            goto L57
        L2c:
            java.lang.String r6 = "file"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L35
            goto L57
        L35:
            r5 = 3
            goto L57
        L37:
            java.lang.String r6 = "pc"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L40
            goto L57
        L40:
            r5 = r1
            goto L57
        L42:
            java.lang.String r6 = "symbol"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L4b
            goto L57
        L4b:
            r5 = r2
            goto L57
        L4d:
            java.lang.String r6 = "offset"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L56
            goto L57
        L56:
            r5 = 0
        L57:
            switch(r5) {
                case 0: goto L90;
                case 1: goto L7f;
                case 2: goto L72;
                case 3: goto L6b;
                case 4: goto L5e;
                default: goto L5a;
            }
        L5a:
            r7.skipValue()
            goto Lb
        L5e:
            int r4 = r7.nextInt()
            r3.f23805e = r4
            byte r4 = r3.f23806f
            r4 = r4 | r0
            byte r4 = (byte) r4
            r3.f23806f = r4
            goto Lb
        L6b:
            java.lang.String r4 = r7.nextString()
            r3.f23803c = r4
            goto Lb
        L72:
            long r4 = r7.nextLong()
            r3.f23802a = r4
            byte r4 = r3.f23806f
            r4 = r4 | r2
            byte r4 = (byte) r4
            r3.f23806f = r4
            goto Lb
        L7f:
            java.lang.String r4 = r7.nextString()
            if (r4 == 0) goto L88
            r3.b = r4
            goto Lb
        L88:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "Null symbol"
            r7.<init>(r0)
            throw r7
        L90:
            long r4 = r7.nextLong()
            r3.f23804d = r4
            byte r4 = r3.f23806f
            r4 = r4 | r1
            byte r4 = (byte) r4
            r3.f23806f = r4
            goto Lb
        L9e:
            r7.endObject()
            w4.Z r7 = r3.a()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.C2923a.a(android.util.JsonReader):w4.Z");
    }

    public static G b(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("key")) {
                if (!nextName.equals(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                    jsonReader.skipValue();
                } else {
                    str2 = jsonReader.nextString();
                    if (str2 == null) {
                        throw new NullPointerException("Null value");
                    }
                }
            } else {
                str = jsonReader.nextString();
                if (str == null) {
                    throw new NullPointerException("Null key");
                }
            }
        }
        jsonReader.endObject();
        if (str != null && str2 != null) {
            return new G(str, str2);
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            sb.append(" key");
        }
        if (str2 == null) {
            sb.append(" value");
        }
        throw new IllegalStateException(o.m(sb, "Missing required properties:"));
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
    /* JADX WARN: Type inference failed for: r4v0, types: [w4.D, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static w4.E c(android.util.JsonReader r8) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.C2923a.c(android.util.JsonReader):w4.E");
    }

    public static List d(JsonReader jsonReader, i iVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(iVar.a(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0063. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, w4.c0] */
    /* JADX WARN: Type inference failed for: r8v0, types: [w4.P, java.lang.Object] */
    public static Q e(JsonReader jsonReader) {
        char c9;
        char c10;
        char c11;
        char c12;
        char c13;
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c9 = 0;
                        break;
                    }
                    break;
                case -259312414:
                    if (nextName.equals("rollouts")) {
                        c9 = 1;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals(MBridgeConstans.DYNAMIC_VIEW_WX_APP)) {
                        c9 = 2;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c9 = 3;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c9 = 4;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals(CampaignEx.JSON_KEY_TIMESTAMP)) {
                        c9 = 5;
                        break;
                    }
                    break;
            }
            c9 = 65535;
            switch (c9) {
                case 0:
                    ?? obj2 = new Object();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        switch (nextName2.hashCode()) {
                            case -1708606089:
                                if (nextName2.equals("batteryLevel")) {
                                    c13 = 0;
                                    break;
                                }
                                break;
                            case -1455558134:
                                if (nextName2.equals("batteryVelocity")) {
                                    c13 = 1;
                                    break;
                                }
                                break;
                            case -1439500848:
                                if (nextName2.equals("orientation")) {
                                    c13 = 2;
                                    break;
                                }
                                break;
                            case 279795450:
                                if (nextName2.equals("diskUsed")) {
                                    c13 = 3;
                                    break;
                                }
                                break;
                            case 976541947:
                                if (nextName2.equals("ramUsed")) {
                                    c13 = 4;
                                    break;
                                }
                                break;
                            case 1516795582:
                                if (nextName2.equals("proximityOn")) {
                                    c13 = 5;
                                    break;
                                }
                                break;
                        }
                        c13 = 65535;
                        switch (c13) {
                            case 0:
                                obj2.f23832a = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case 1:
                                obj2.b = jsonReader.nextInt();
                                obj2.f23837g = (byte) (obj2.f23837g | 1);
                                break;
                            case 2:
                                obj2.f23834d = jsonReader.nextInt();
                                obj2.f23837g = (byte) (obj2.f23837g | 4);
                                break;
                            case 3:
                                obj2.f23836f = jsonReader.nextLong();
                                obj2.f23837g = (byte) (obj2.f23837g | Ascii.DLE);
                                break;
                            case 4:
                                obj2.f23835e = jsonReader.nextLong();
                                obj2.f23837g = (byte) (obj2.f23837g | 8);
                                break;
                            case 5:
                                obj2.f23833c = jsonReader.nextBoolean();
                                obj2.f23837g = (byte) (obj2.f23837g | 2);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    obj.f23771d = obj2.a();
                case 1:
                    jsonReader.beginObject();
                    List list = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        if (!nextName3.equals("assignments")) {
                            jsonReader.skipValue();
                        } else {
                            List d2 = d(jsonReader, new i(13));
                            if (d2 != null) {
                                list = d2;
                            } else {
                                throw new NullPointerException("Null rolloutAssignments");
                            }
                        }
                    }
                    jsonReader.endObject();
                    if (list != null) {
                        obj.f23773f = new C2883i0(list);
                    } else {
                        throw new IllegalStateException("Missing required properties: rolloutAssignments");
                    }
                case 2:
                    jsonReader.beginObject();
                    byte b = 0;
                    T t9 = null;
                    List list2 = null;
                    List list3 = null;
                    Boolean bool = null;
                    C2869b0 c2869b0 = null;
                    List list4 = null;
                    int i9 = 0;
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
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(g(jsonReader));
                                }
                                jsonReader.endArray();
                                list4 = Collections.unmodifiableList(arrayList);
                                break;
                            case 1:
                                bool = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            case 2:
                                jsonReader.beginObject();
                                List list5 = null;
                                V v6 = null;
                                E e4 = null;
                                W w2 = null;
                                List list6 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -1375141843:
                                            if (nextName5.equals("appExitInfo")) {
                                                c11 = 0;
                                                break;
                                            }
                                            break;
                                        case -1337936983:
                                            if (nextName5.equals("threads")) {
                                                c11 = 1;
                                                break;
                                            }
                                            break;
                                        case -902467928:
                                            if (nextName5.equals("signal")) {
                                                c11 = 2;
                                                break;
                                            }
                                            break;
                                        case 937615455:
                                            if (nextName5.equals("binaries")) {
                                                c11 = 3;
                                                break;
                                            }
                                            break;
                                        case 1481625679:
                                            if (nextName5.equals("exception")) {
                                                c11 = 4;
                                                break;
                                            }
                                            break;
                                    }
                                    c11 = 65535;
                                    switch (c11) {
                                        case 0:
                                            e4 = c(jsonReader);
                                            break;
                                        case 1:
                                            list5 = d(jsonReader, new i(14));
                                            break;
                                        case 2:
                                            jsonReader.beginObject();
                                            long j7 = 0;
                                            byte b8 = 0;
                                            String str = null;
                                            String str2 = null;
                                            while (jsonReader.hasNext()) {
                                                String nextName6 = jsonReader.nextName();
                                                nextName6.getClass();
                                                switch (nextName6.hashCode()) {
                                                    case -1147692044:
                                                        if (nextName6.equals("address")) {
                                                            c12 = 0;
                                                            break;
                                                        }
                                                        break;
                                                    case 3059181:
                                                        if (nextName6.equals("code")) {
                                                            c12 = 1;
                                                            break;
                                                        }
                                                        break;
                                                    case 3373707:
                                                        if (nextName6.equals("name")) {
                                                            c12 = 2;
                                                            break;
                                                        }
                                                        break;
                                                }
                                                c12 = 65535;
                                                switch (c12) {
                                                    case 0:
                                                        b8 = (byte) (b8 | 1);
                                                        j7 = jsonReader.nextLong();
                                                        break;
                                                    case 1:
                                                        str2 = jsonReader.nextString();
                                                        if (str2 == null) {
                                                            throw new NullPointerException("Null code");
                                                        }
                                                        break;
                                                    case 2:
                                                        str = jsonReader.nextString();
                                                        if (str == null) {
                                                            throw new NullPointerException("Null name");
                                                        }
                                                        break;
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            if (b8 == 1 && str != null && str2 != null) {
                                                w2 = new W(str, str2, j7);
                                                break;
                                            } else {
                                                StringBuilder sb = new StringBuilder();
                                                if (str == null) {
                                                    sb.append(" name");
                                                }
                                                if (str2 == null) {
                                                    sb.append(" code");
                                                }
                                                if ((b8 & 1) == 0) {
                                                    sb.append(" address");
                                                }
                                                throw new IllegalStateException(o.m(sb, "Missing required properties:"));
                                            }
                                        case 3:
                                            list6 = d(jsonReader, new i(15));
                                            if (list6 == null) {
                                                throw new NullPointerException("Null binaries");
                                            }
                                            break;
                                        case 4:
                                            v6 = f(jsonReader);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (w2 != null && list6 != null) {
                                    t9 = new T(list5, v6, e4, w2, list6);
                                    break;
                                } else {
                                    StringBuilder sb2 = new StringBuilder();
                                    if (w2 == null) {
                                        sb2.append(" signal");
                                    }
                                    if (list6 == null) {
                                        sb2.append(" binaries");
                                    }
                                    throw new IllegalStateException(o.m(sb2, "Missing required properties:"));
                                }
                                break;
                            case 3:
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                list3 = Collections.unmodifiableList(arrayList2);
                                break;
                            case 4:
                                ArrayList arrayList3 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList3.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                list2 = Collections.unmodifiableList(arrayList3);
                                break;
                            case 5:
                                i9 = jsonReader.nextInt();
                                b = (byte) 1;
                                break;
                            case 6:
                                c2869b0 = g(jsonReader);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    if (b == 1 && t9 != null) {
                        obj.f23770c = new S(t9, list2, list3, bool, c2869b0, list4, i9);
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        if (t9 == null) {
                            sb3.append(" execution");
                        }
                        if (b == 0) {
                            sb3.append(" uiOrientation");
                        }
                        throw new IllegalStateException(o.m(sb3, "Missing required properties:"));
                    }
                    break;
                case 3:
                    jsonReader.beginObject();
                    String str3 = null;
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals(AppLovinEventTypes.USER_VIEWED_CONTENT)) {
                            String nextString = jsonReader.nextString();
                            if (nextString != null) {
                                str3 = nextString;
                            } else {
                                throw new NullPointerException("Null content");
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (str3 != null) {
                        obj.f23772e = new C2875e0(str3);
                    } else {
                        throw new IllegalStateException("Missing required properties: content");
                    }
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 != null) {
                        obj.b = nextString2;
                    } else {
                        throw new NullPointerException("Null type");
                    }
                case 5:
                    obj.f23769a = jsonReader.nextLong();
                    obj.f23774g = (byte) (obj.f23774g | 1);
                default:
                    jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x005b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static w4.V f(android.util.JsonReader r11) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.C2923a.f(android.util.JsonReader):w4.V");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [w4.a0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static w4.C2869b0 g(android.util.JsonReader r6) {
        /*
            r0 = 2
            r1 = 1
            w4.a0 r2 = new w4.a0
            r2.<init>()
            r6.beginObject()
        La:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L8c
            java.lang.String r3 = r6.nextName()
            r3.getClass()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case 110987: goto L41;
                case 202325402: goto L36;
                case 1694598382: goto L2b;
                case 2125650548: goto L20;
                default: goto L1f;
            }
        L1f:
            goto L4b
        L20:
            java.lang.String r5 = "importance"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L29
            goto L4b
        L29:
            r4 = 3
            goto L4b
        L2b:
            java.lang.String r5 = "defaultProcess"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L4b
        L34:
            r4 = r0
            goto L4b
        L36:
            java.lang.String r5 = "processName"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L3f
            goto L4b
        L3f:
            r4 = r1
            goto L4b
        L41:
            java.lang.String r5 = "pid"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L4a
            goto L4b
        L4a:
            r4 = 0
        L4b:
            switch(r4) {
                case 0: goto L7e;
                case 1: goto L6d;
                case 2: goto L5f;
                case 3: goto L52;
                default: goto L4e;
            }
        L4e:
            r6.skipValue()
            goto La
        L52:
            int r3 = r6.nextInt()
            r2.f23815c = r3
            byte r3 = r2.f23817e
            r3 = r3 | r0
            byte r3 = (byte) r3
            r2.f23817e = r3
            goto La
        L5f:
            boolean r3 = r6.nextBoolean()
            r2.f23816d = r3
            byte r3 = r2.f23817e
            r3 = r3 | 4
            byte r3 = (byte) r3
            r2.f23817e = r3
            goto La
        L6d:
            java.lang.String r3 = r6.nextString()
            if (r3 == 0) goto L76
            r2.f23814a = r3
            goto La
        L76:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "Null processName"
            r6.<init>(r0)
            throw r6
        L7e:
            int r3 = r6.nextInt()
            r2.b = r3
            byte r3 = r2.f23817e
            r3 = r3 | r1
            byte r3 = (byte) r3
            r2.f23817e = r3
            goto La
        L8c:
            r6.endObject()
            w4.b0 r6 = r2.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.C2923a.g(android.util.JsonReader):w4.b0");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x017e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:182:0x03ea. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x00be. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v31, types: [java.lang.Object, w4.J] */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r12v100, types: [w4.j0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, w4.N] */
    /* JADX WARN: Type inference failed for: r4v0, types: [w4.B, java.lang.Object] */
    public static C2864C h(JsonReader jsonReader) {
        ?? r10;
        byte b;
        byte b8;
        byte b9;
        byte b10;
        byte b11;
        char c9;
        byte b12;
        byte b13 = 4;
        boolean z8 = false;
        Charset charset = P0.f23775a;
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        r10 = z8;
                        break;
                    }
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        r10 = 1;
                        break;
                    }
                    break;
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        r10 = 2;
                        break;
                    }
                    break;
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        r10 = 3;
                        break;
                    }
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        r10 = b13;
                        break;
                    }
                    break;
                case -401988390:
                    if (nextName.equals("firebaseAuthenticationToken")) {
                        r10 = 5;
                        break;
                    }
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        r10 = 6;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        r10 = 7;
                        break;
                    }
                    break;
                case 1047652060:
                    if (nextName.equals("firebaseInstallationId")) {
                        r10 = 8;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        r10 = 9;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        r10 = 10;
                        break;
                    }
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        r10 = 11;
                        break;
                    }
                    break;
            }
            r10 = -1;
            switch (r10) {
                case 0:
                    b = b13;
                    jsonReader.beginObject();
                    List list = null;
                    String str = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (!nextName2.equals("files")) {
                            if (!nextName2.equals("orgId")) {
                                jsonReader.skipValue();
                            } else {
                                str = jsonReader.nextString();
                            }
                        } else {
                            list = d(jsonReader, new i(12));
                            if (list == null) {
                                throw new NullPointerException("Null files");
                            }
                        }
                    }
                    jsonReader.endObject();
                    if (list != null) {
                        obj.f23695k = new H(list, str);
                        b13 = b;
                        z8 = false;
                    } else {
                        throw new IllegalStateException("Missing required properties: files");
                    }
                case 1:
                    b = b13;
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.f23686a = nextString;
                        b13 = b;
                        z8 = false;
                    } else {
                        throw new NullPointerException("Null sdkVersion");
                    }
                case 2:
                    b = b13;
                    obj.f23691g = jsonReader.nextString();
                    b13 = b;
                    z8 = false;
                case 3:
                    b = b13;
                    obj.l = c(jsonReader);
                    b13 = b;
                    z8 = false;
                case 4:
                    b = b13;
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 != null) {
                        obj.f23692h = nextString2;
                        b13 = b;
                        z8 = false;
                    } else {
                        throw new NullPointerException("Null buildVersion");
                    }
                case 5:
                    b = b13;
                    obj.f23690f = jsonReader.nextString();
                    b13 = b;
                    z8 = false;
                case 6:
                    b = b13;
                    String nextString3 = jsonReader.nextString();
                    if (nextString3 != null) {
                        obj.b = nextString3;
                        b13 = b;
                        z8 = false;
                    } else {
                        throw new NullPointerException("Null gmpAppId");
                    }
                case 7:
                    b = b13;
                    String nextString4 = jsonReader.nextString();
                    if (nextString4 != null) {
                        obj.f23688d = nextString4;
                        b13 = b;
                        z8 = false;
                    } else {
                        throw new NullPointerException("Null installationUuid");
                    }
                case 8:
                    b = b13;
                    obj.f23689e = jsonReader.nextString();
                    b13 = b;
                    z8 = false;
                case 9:
                    b = b13;
                    obj.f23687c = jsonReader.nextInt();
                    obj.m = (byte) (obj.m | 1);
                    b13 = b;
                    z8 = false;
                case 10:
                    b = b13;
                    String nextString5 = jsonReader.nextString();
                    if (nextString5 != null) {
                        obj.f23693i = nextString5;
                        b13 = b;
                        z8 = false;
                    } else {
                        throw new NullPointerException("Null displayVersion");
                    }
                case 11:
                    ?? obj2 = new Object();
                    obj2.f23731f = z8;
                    obj2.m = (byte) (obj2.m | 2);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -2128794476:
                                if (nextName3.equals("startedAt")) {
                                    b8 = 0;
                                    break;
                                }
                                break;
                            case -1907185581:
                                if (nextName3.equals("appQualitySessionId")) {
                                    b8 = 1;
                                    break;
                                }
                                break;
                            case -1618432855:
                                if (nextName3.equals("identifier")) {
                                    b8 = 2;
                                    break;
                                }
                                break;
                            case -1606742899:
                                if (nextName3.equals("endedAt")) {
                                    b8 = 3;
                                    break;
                                }
                                break;
                            case -1335157162:
                                if (nextName3.equals("device")) {
                                    b8 = b13;
                                    break;
                                }
                                break;
                            case -1291329255:
                                if (nextName3.equals("events")) {
                                    b8 = 5;
                                    break;
                                }
                                break;
                            case 3556:
                                if (nextName3.equals("os")) {
                                    b8 = 6;
                                    break;
                                }
                                break;
                            case 96801:
                                if (nextName3.equals(MBridgeConstans.DYNAMIC_VIEW_WX_APP)) {
                                    b8 = 7;
                                    break;
                                }
                                break;
                            case 3599307:
                                if (nextName3.equals("user")) {
                                    b8 = 8;
                                    break;
                                }
                                break;
                            case 286956243:
                                if (nextName3.equals("generator")) {
                                    b8 = 9;
                                    break;
                                }
                                break;
                            case 1025385094:
                                if (nextName3.equals("crashed")) {
                                    b8 = 10;
                                    break;
                                }
                                break;
                            case 2047016109:
                                if (nextName3.equals("generatorType")) {
                                    b8 = Ascii.VT;
                                    break;
                                }
                                break;
                        }
                        b8 = -1;
                        switch (b8) {
                            case 0:
                                b9 = b13;
                                obj2.f23729d = jsonReader.nextLong();
                                obj2.m = (byte) (obj2.m | 1);
                                b13 = b9;
                            case 1:
                                b9 = b13;
                                obj2.f23728c = jsonReader.nextString();
                                b13 = b9;
                            case 2:
                                b9 = b13;
                                obj2.b = new String(Base64.decode(jsonReader.nextString(), 2), P0.f23775a);
                                b13 = b9;
                            case 3:
                                b9 = b13;
                                obj2.f23730e = Long.valueOf(jsonReader.nextLong());
                                b13 = b9;
                            case 4:
                                ?? obj3 = new Object();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    switch (nextName4.hashCode()) {
                                        case -1981332476:
                                            if (nextName4.equals("simulator")) {
                                                b10 = 0;
                                                break;
                                            }
                                            break;
                                        case -1969347631:
                                            if (nextName4.equals("manufacturer")) {
                                                b10 = 1;
                                                break;
                                            }
                                            break;
                                        case 112670:
                                            if (nextName4.equals("ram")) {
                                                b10 = 2;
                                                break;
                                            }
                                            break;
                                        case 3002454:
                                            if (nextName4.equals("arch")) {
                                                b10 = 3;
                                                break;
                                            }
                                            break;
                                        case 81784169:
                                            if (nextName4.equals("diskSpace")) {
                                                b10 = b13;
                                                break;
                                            }
                                            break;
                                        case 94848180:
                                            if (nextName4.equals("cores")) {
                                                b10 = 5;
                                                break;
                                            }
                                            break;
                                        case 104069929:
                                            if (nextName4.equals("model")) {
                                                b10 = 6;
                                                break;
                                            }
                                            break;
                                        case 109757585:
                                            if (nextName4.equals("state")) {
                                                b10 = 7;
                                                break;
                                            }
                                            break;
                                        case 2078953423:
                                            if (nextName4.equals("modelClass")) {
                                                b10 = 8;
                                                break;
                                            }
                                            break;
                                    }
                                    b10 = -1;
                                    switch (b10) {
                                        case 0:
                                            b11 = b13;
                                            obj3.f23756f = jsonReader.nextBoolean();
                                            obj3.f23760j = (byte) (obj3.f23760j | Ascii.DLE);
                                            b13 = b11;
                                        case 1:
                                            b11 = b13;
                                            String nextString6 = jsonReader.nextString();
                                            if (nextString6 != null) {
                                                obj3.f23758h = nextString6;
                                                b13 = b11;
                                            } else {
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                        case 2:
                                            obj3.f23754d = jsonReader.nextLong();
                                            b11 = 4;
                                            obj3.f23760j = (byte) (obj3.f23760j | 4);
                                            b13 = b11;
                                        case 3:
                                            obj3.f23752a = jsonReader.nextInt();
                                            obj3.f23760j = (byte) (obj3.f23760j | 1);
                                            b11 = b13;
                                            b13 = b11;
                                        case 4:
                                            obj3.f23755e = jsonReader.nextLong();
                                            obj3.f23760j = (byte) (obj3.f23760j | 8);
                                            b11 = b13;
                                            b13 = b11;
                                        case 5:
                                            obj3.f23753c = jsonReader.nextInt();
                                            obj3.f23760j = (byte) (obj3.f23760j | 2);
                                            b11 = b13;
                                            b13 = b11;
                                        case 6:
                                            String nextString7 = jsonReader.nextString();
                                            if (nextString7 != null) {
                                                obj3.b = nextString7;
                                                b11 = b13;
                                                b13 = b11;
                                            } else {
                                                throw new NullPointerException("Null model");
                                            }
                                        case 7:
                                            obj3.f23757g = jsonReader.nextInt();
                                            obj3.f23760j = (byte) (obj3.f23760j | 32);
                                            b11 = b13;
                                            b13 = b11;
                                        case 8:
                                            String nextString8 = jsonReader.nextString();
                                            if (nextString8 != null) {
                                                obj3.f23759i = nextString8;
                                                b11 = b13;
                                                b13 = b11;
                                            } else {
                                                throw new NullPointerException("Null modelClass");
                                            }
                                        default:
                                            jsonReader.skipValue();
                                            b11 = b13;
                                            b13 = b11;
                                    }
                                }
                                b9 = b13;
                                jsonReader.endObject();
                                obj2.f23735j = obj3.a();
                                b13 = b9;
                            case 5:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(e(jsonReader));
                                }
                                jsonReader.endArray();
                                obj2.f23736k = Collections.unmodifiableList(arrayList);
                                b9 = b13;
                                b13 = b9;
                            case 6:
                                ?? obj4 = new Object();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -911706486:
                                            if (nextName5.equals("buildVersion")) {
                                                c9 = 0;
                                                break;
                                            }
                                            break;
                                        case -293026577:
                                            if (nextName5.equals("jailbroken")) {
                                                c9 = 1;
                                                break;
                                            }
                                            break;
                                        case 351608024:
                                            if (nextName5.equals("version")) {
                                                c9 = 2;
                                                break;
                                            }
                                            break;
                                        case 1874684019:
                                            if (nextName5.equals("platform")) {
                                                c9 = 3;
                                                break;
                                            }
                                            break;
                                    }
                                    c9 = 65535;
                                    switch (c9) {
                                        case 0:
                                            String nextString9 = jsonReader.nextString();
                                            if (nextString9 != null) {
                                                obj4.f23895c = nextString9;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null buildVersion");
                                            }
                                        case 1:
                                            obj4.f23896d = jsonReader.nextBoolean();
                                            obj4.f23897e = (byte) (obj4.f23897e | 2);
                                            break;
                                        case 2:
                                            String nextString10 = jsonReader.nextString();
                                            if (nextString10 != null) {
                                                obj4.b = nextString10;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null version");
                                            }
                                        case 3:
                                            obj4.f23894a = jsonReader.nextInt();
                                            obj4.f23897e = (byte) (obj4.f23897e | 1);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                obj2.f23734i = obj4.a();
                                b9 = b13;
                                b13 = b9;
                            case 7:
                                jsonReader.beginObject();
                                String str2 = null;
                                String str3 = null;
                                String str4 = null;
                                String str5 = null;
                                String str6 = null;
                                String str7 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName6 = jsonReader.nextName();
                                    nextName6.getClass();
                                    switch (nextName6.hashCode()) {
                                        case -1618432855:
                                            if (nextName6.equals("identifier")) {
                                                b12 = 0;
                                                break;
                                            }
                                            break;
                                        case -519438642:
                                            if (nextName6.equals("developmentPlatform")) {
                                                b12 = 1;
                                                break;
                                            }
                                            break;
                                        case 213652010:
                                            if (nextName6.equals("developmentPlatformVersion")) {
                                                b12 = 2;
                                                break;
                                            }
                                            break;
                                        case 351608024:
                                            if (nextName6.equals("version")) {
                                                b12 = 3;
                                                break;
                                            }
                                            break;
                                        case 719853845:
                                            if (nextName6.equals("installationUuid")) {
                                                b12 = b13;
                                                break;
                                            }
                                            break;
                                        case 1975623094:
                                            if (nextName6.equals("displayVersion")) {
                                                b12 = 5;
                                                break;
                                            }
                                            break;
                                    }
                                    b12 = -1;
                                    switch (b12) {
                                        case 0:
                                            str2 = jsonReader.nextString();
                                            if (str2 == null) {
                                                throw new NullPointerException("Null identifier");
                                            }
                                            break;
                                        case 1:
                                            str6 = jsonReader.nextString();
                                            break;
                                        case 2:
                                            str7 = jsonReader.nextString();
                                            break;
                                        case 3:
                                            str3 = jsonReader.nextString();
                                            if (str3 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            break;
                                        case 4:
                                            str5 = jsonReader.nextString();
                                            break;
                                        case 5:
                                            str4 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (str2 != null && str3 != null) {
                                    obj2.f23732g = new L(str2, str3, str4, str5, str6, str7);
                                    b9 = b13;
                                    b13 = b9;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    if (str2 == null) {
                                        sb.append(" identifier");
                                    }
                                    if (str3 == null) {
                                        sb.append(" version");
                                    }
                                    throw new IllegalStateException(o.m(sb, "Missing required properties:"));
                                }
                                break;
                            case 8:
                                jsonReader.beginObject();
                                String str8 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        str8 = jsonReader.nextString();
                                        if (str8 == null) {
                                            throw new NullPointerException("Null identifier");
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (str8 != null) {
                                    obj2.f23733h = new C2889l0(str8);
                                    b9 = b13;
                                    b13 = b9;
                                } else {
                                    throw new IllegalStateException("Missing required properties: identifier");
                                }
                            case 9:
                                String nextString11 = jsonReader.nextString();
                                if (nextString11 != null) {
                                    obj2.f23727a = nextString11;
                                    b9 = b13;
                                    b13 = b9;
                                } else {
                                    throw new NullPointerException("Null generator");
                                }
                            case 10:
                                obj2.f23731f = jsonReader.nextBoolean();
                                obj2.m = (byte) (obj2.m | 2);
                                b9 = b13;
                                b13 = b9;
                            case 11:
                                obj2.l = jsonReader.nextInt();
                                obj2.m = (byte) (obj2.m | b13);
                                b9 = b13;
                                b13 = b9;
                            default:
                                jsonReader.skipValue();
                                b9 = b13;
                                b13 = b9;
                        }
                    }
                    b = b13;
                    jsonReader.endObject();
                    obj.f23694j = obj2.a();
                    b13 = b;
                    z8 = false;
                    break;
                default:
                    jsonReader.skipValue();
                    b = b13;
                    b13 = b;
                    z8 = false;
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    public static C2864C i(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                C2864C h6 = h(jsonReader);
                jsonReader.close();
                return h6;
            } finally {
            }
        } catch (IllegalStateException e4) {
            throw new IOException(e4);
        }
    }
}
