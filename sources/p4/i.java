package p4;

import U4.p;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.JsonReader;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.mbridge.msdk.foundation.entity.o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import o4.InterfaceC2498d;
import r3.InterfaceC2664g;
import u3.AbstractC2753a;
import w4.C2881h0;
import w4.F;
import w4.I;
import w4.P0;
import w4.U;
import w4.X;
import x4.C2923a;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements InterfaceC2498d, InterfaceC2664g {
    public final /* synthetic */ int b;

    public /* synthetic */ i(int i9) {
        this.b = i9;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:68:0x010c. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, w4.f0] */
    public Object a(JsonReader jsonReader) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        String str = null;
        switch (this.b) {
            case 11:
                jsonReader.beginObject();
                String str2 = null;
                String str3 = null;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    switch (nextName.hashCode()) {
                        case -609862170:
                            if (nextName.equals("libraryName")) {
                                z8 = false;
                                break;
                            }
                            break;
                        case 3002454:
                            if (nextName.equals("arch")) {
                                z8 = true;
                                break;
                            }
                            break;
                        case 230943785:
                            if (nextName.equals("buildId")) {
                                z8 = 2;
                                break;
                            }
                            break;
                    }
                    z8 = -1;
                    switch (z8) {
                        case false:
                            str2 = jsonReader.nextString();
                            if (str2 == null) {
                                throw new NullPointerException("Null libraryName");
                            }
                            break;
                        case true:
                            String nextString = jsonReader.nextString();
                            if (nextString != null) {
                                str = nextString;
                                break;
                            } else {
                                throw new NullPointerException("Null arch");
                            }
                        case true:
                            str3 = jsonReader.nextString();
                            if (str3 == null) {
                                throw new NullPointerException("Null buildId");
                            }
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (str != null && str2 != null && str3 != null) {
                    return new F(str, str2, str3);
                }
                StringBuilder sb = new StringBuilder();
                if (str == null) {
                    sb.append(" arch");
                }
                if (str2 == null) {
                    sb.append(" libraryName");
                }
                if (str3 == null) {
                    sb.append(" buildId");
                }
                throw new IllegalStateException(o.m(sb, "Missing required properties:"));
            case 12:
                jsonReader.beginObject();
                byte[] bArr = null;
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.getClass();
                    if (!nextName2.equals("filename")) {
                        if (!nextName2.equals("contents")) {
                            jsonReader.skipValue();
                        } else {
                            bArr = Base64.decode(jsonReader.nextString(), 2);
                            if (bArr == null) {
                                throw new NullPointerException("Null contents");
                            }
                        }
                    } else {
                        String nextString2 = jsonReader.nextString();
                        if (nextString2 != null) {
                            str = nextString2;
                        } else {
                            throw new NullPointerException("Null filename");
                        }
                    }
                }
                jsonReader.endObject();
                if (str != null && bArr != null) {
                    return new I(str, bArr);
                }
                StringBuilder sb2 = new StringBuilder();
                if (str == null) {
                    sb2.append(" filename");
                }
                if (bArr == null) {
                    sb2.append(" contents");
                }
                throw new IllegalStateException(o.m(sb2, "Missing required properties:"));
            case 13:
                ?? obj = new Object();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName3 = jsonReader.nextName();
                    nextName3.getClass();
                    switch (nextName3.hashCode()) {
                        case -1536268810:
                            if (nextName3.equals("parameterKey")) {
                                z9 = false;
                                break;
                            }
                            break;
                        case -1027290370:
                            if (nextName3.equals("templateVersion")) {
                                z9 = true;
                                break;
                            }
                            break;
                        case 1098747284:
                            if (nextName3.equals("rolloutVariant")) {
                                z9 = 2;
                                break;
                            }
                            break;
                        case 1124454216:
                            if (nextName3.equals("parameterValue")) {
                                z9 = 3;
                                break;
                            }
                            break;
                    }
                    z9 = -1;
                    switch (z9) {
                        case false:
                            String nextString3 = jsonReader.nextString();
                            if (nextString3 != null) {
                                obj.b = nextString3;
                                break;
                            } else {
                                throw new NullPointerException("Null parameterKey");
                            }
                        case true:
                            obj.f23860d = jsonReader.nextLong();
                            obj.f23861e = (byte) (obj.f23861e | 1);
                            break;
                        case true:
                            jsonReader.beginObject();
                            String str4 = null;
                            String str5 = null;
                            while (jsonReader.hasNext()) {
                                String nextName4 = jsonReader.nextName();
                                nextName4.getClass();
                                if (!nextName4.equals("variantId")) {
                                    if (!nextName4.equals("rolloutId")) {
                                        jsonReader.skipValue();
                                    } else {
                                        str4 = jsonReader.nextString();
                                        if (str4 == null) {
                                            throw new NullPointerException("Null rolloutId");
                                        }
                                    }
                                } else {
                                    str5 = jsonReader.nextString();
                                    if (str5 == null) {
                                        throw new NullPointerException("Null variantId");
                                    }
                                }
                            }
                            jsonReader.endObject();
                            if (str4 != null && str5 != null) {
                                obj.f23858a = new C2881h0(str4, str5);
                                break;
                            } else {
                                StringBuilder sb3 = new StringBuilder();
                                if (str4 == null) {
                                    sb3.append(" rolloutId");
                                }
                                if (str5 == null) {
                                    sb3.append(" variantId");
                                }
                                throw new IllegalStateException(o.m(sb3, "Missing required properties:"));
                            }
                        case true:
                            String nextString4 = jsonReader.nextString();
                            if (nextString4 != null) {
                                obj.f23859c = nextString4;
                                break;
                            } else {
                                throw new NullPointerException("Null parameterValue");
                            }
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return obj.a();
            case 14:
                jsonReader.beginObject();
                List list = null;
                byte b = 0;
                int i9 = 0;
                while (jsonReader.hasNext()) {
                    String nextName5 = jsonReader.nextName();
                    nextName5.getClass();
                    switch (nextName5.hashCode()) {
                        case -1266514778:
                            if (nextName5.equals(com.mbridge.msdk.foundation.entity.b.JSON_KEY_FRAME_ADS)) {
                                z10 = false;
                                break;
                            }
                            break;
                        case 3373707:
                            if (nextName5.equals("name")) {
                                z10 = true;
                                break;
                            }
                            break;
                        case 2125650548:
                            if (nextName5.equals("importance")) {
                                z10 = 2;
                                break;
                            }
                            break;
                    }
                    z10 = -1;
                    switch (z10) {
                        case false:
                            list = C2923a.d(jsonReader, new i(16));
                            if (list == null) {
                                throw new NullPointerException("Null frames");
                            }
                        case true:
                            str = jsonReader.nextString();
                            if (str == null) {
                                throw new NullPointerException("Null name");
                            }
                        case true:
                            i9 = jsonReader.nextInt();
                            b = (byte) (b | 1);
                        default:
                            jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                if (b == 1 && str != null && list != null) {
                    return new X(str, i9, list);
                }
                StringBuilder sb4 = new StringBuilder();
                if (str == null) {
                    sb4.append(" name");
                }
                if ((b & 1) == 0) {
                    sb4.append(" importance");
                }
                if (list == null) {
                    sb4.append(" frames");
                }
                throw new IllegalStateException(o.m(sb4, "Missing required properties:"));
            case 15:
                jsonReader.beginObject();
                String str6 = null;
                String str7 = null;
                byte b8 = 0;
                long j7 = 0;
                long j9 = 0;
                while (jsonReader.hasNext()) {
                    String nextName6 = jsonReader.nextName();
                    nextName6.getClass();
                    switch (nextName6.hashCode()) {
                        case 3373707:
                            if (nextName6.equals("name")) {
                                z11 = false;
                                break;
                            }
                            break;
                        case 3530753:
                            if (nextName6.equals("size")) {
                                z11 = true;
                                break;
                            }
                            break;
                        case 3601339:
                            if (nextName6.equals("uuid")) {
                                z11 = 2;
                                break;
                            }
                            break;
                        case 1153765347:
                            if (nextName6.equals("baseAddress")) {
                                z11 = 3;
                                break;
                            }
                            break;
                    }
                    z11 = -1;
                    switch (z11) {
                        case false:
                            String nextString5 = jsonReader.nextString();
                            if (nextString5 != null) {
                                str6 = nextString5;
                                break;
                            } else {
                                throw new NullPointerException("Null name");
                            }
                        case true:
                            b8 = (byte) (b8 | 2);
                            j9 = jsonReader.nextLong();
                            break;
                        case true:
                            str7 = new String(Base64.decode(jsonReader.nextString(), 2), P0.f23775a);
                            break;
                        case true:
                            b8 = (byte) (b8 | 1);
                            j7 = jsonReader.nextLong();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (b8 == 3 && str6 != null) {
                    return new U(str6, str7, j7, j9);
                }
                StringBuilder sb5 = new StringBuilder();
                if ((b8 & 1) == 0) {
                    sb5.append(" baseAddress");
                }
                if ((b8 & 2) == 0) {
                    sb5.append(" size");
                }
                if (str6 == null) {
                    sb5.append(" name");
                }
                throw new IllegalStateException(o.m(sb5, "Missing required properties:"));
            default:
                return C2923a.a(jsonReader);
        }
    }

    @Override // r3.InterfaceC2664g
    public Object apply(Object obj) {
        byte[] decode;
        boolean z8;
        switch (this.b) {
            case 9:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        C.c a6 = k3.j.a();
                        a6.A(rawQuery.getString(1));
                        a6.f349f = AbstractC2753a.b(rawQuery.getInt(2));
                        String string = rawQuery.getString(3);
                        if (string == null) {
                            decode = null;
                        } else {
                            decode = Base64.decode(string, 0);
                        }
                        a6.f348d = decode;
                        arrayList.add(a6.l());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            default:
                if (((Cursor) obj).getCount() > 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                return Boolean.valueOf(z8);
        }
    }

    @Override // o4.InterfaceC2498d
    public Object f(p pVar) {
        switch (this.b) {
            case 0:
                return (ScheduledExecutorService) ExecutorsRegistrar.f14324c.get();
            case 1:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            case 2:
                o4.l lVar = ExecutorsRegistrar.f14323a;
                return l.b;
            case 3:
                return FirebaseSessionsRegistrar.f(pVar);
            case 4:
                return FirebaseSessionsRegistrar.e(pVar);
            case 5:
                return FirebaseSessionsRegistrar.d(pVar);
            case 6:
                return FirebaseSessionsRegistrar.c(pVar);
            case 7:
                return FirebaseSessionsRegistrar.a(pVar);
            default:
                return FirebaseSessionsRegistrar.b(pVar);
        }
    }
}
