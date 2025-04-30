package q4;

import G7.j;
import J1.g;
import N1.f;
import T1.A;
import T1.C;
import T1.k;
import T1.u;
import T1.v;
import W1.F;
import W1.p;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import c2.InterfaceC0596g;
import c2.InterfaceC0598i;
import c2.InterfaceC0602m;
import com.adjust.sdk.AdjustEventFailure;
import com.adjust.sdk.OnEventTrackingFailedListener;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.InterfaceC1826d;
import com.facebook.J;
import com.facebook.internal.C1843l;
import com.facebook.login.x;
import com.facebook.r;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import e0.C2200a;
import e0.InterfaceC2201b;
import java.io.File;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;
import t7.C2720i;
import u0.C2747b;
import u7.AbstractC2829t;

/* renamed from: q4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2645d implements A5.d, G5.c, R1.a, v, p, F, InterfaceC0596g, InterfaceC0602m, InterfaceC1826d, InterfaceC2201b, OnEventTrackingFailedListener {
    public static C2645d b;

    public static void A(G5.d dVar, StringBuilder sb) {
        int charAt = (sb.charAt(1) * '(') + (sb.charAt(0) * 1600) + sb.charAt(2) + 1;
        ((StringBuilder) dVar.f1282f).append(new String(new char[]{(char) (charAt / NotificationCompat.FLAG_LOCAL_ONLY), (char) (charAt % NotificationCompat.FLAG_LOCAL_ONLY)}));
        sb.delete(0, 3);
    }

    public static final Bundle o(String str) {
        int i9 = x.f13785c;
        Bundle bundle = new Bundle();
        bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
        bundle.putString("0_auth_logger_id", str);
        bundle.putString("3_method", "");
        bundle.putString("2_result", "");
        bundle.putString("5_error_message", "");
        bundle.putString("4_error_code", "");
        bundle.putString("6_extras", "");
        return bundle;
    }

    public static E1.a q(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new E1.a(httpURLConnection);
    }

    public static C1843l s() {
        return new C1843l(null, AbstractC2829t.X(new C2720i(2, null), new C2720i(4, null), new C2720i(9, null), new C2720i(17, null), new C2720i(341, null)), AbstractC2829t.X(new C2720i(102, null), new C2720i(190, null), new C2720i(Integer.valueOf(TTAdConstant.IMAGE_URL_CODE), null)), null, null, null);
    }

    public static Path v(float f9, float f10, float f11, float f12) {
        Path path = new Path();
        path.moveTo(f9, f10);
        path.lineTo(f11, f12);
        return path;
    }

    public static void y(g gVar) {
        Log.d("PurchaseEG", "onAcknowledgePurchaseResponse: " + gVar.b);
    }

    public static HashMap z(JSONObject jSONObject) {
        int optInt;
        HashSet hashSet;
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        int length = optJSONArray.length();
        if (length > 0) {
            int i9 = 0;
            while (true) {
                int i10 = i9 + 1;
                JSONObject optJSONObject = optJSONArray.optJSONObject(i9);
                if (optJSONObject != null && (optInt = optJSONObject.optInt("code")) != 0) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                    if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                        hashSet = new HashSet();
                        int length2 = optJSONArray2.length();
                        if (length2 > 0) {
                            int i11 = 0;
                            while (true) {
                                int i12 = i11 + 1;
                                int optInt2 = optJSONArray2.optInt(i11);
                                if (optInt2 != 0) {
                                    hashSet.add(Integer.valueOf(optInt2));
                                }
                                if (i12 >= length2) {
                                    break;
                                }
                                i11 = i12;
                            }
                        }
                    } else {
                        hashSet = null;
                    }
                    hashMap.put(Integer.valueOf(optInt), hashSet);
                }
                if (i10 >= length) {
                    break;
                }
                i9 = i10;
            }
        }
        return hashMap;
    }

    @Override // R1.a
    public File c(f fVar) {
        return null;
    }

    @Override // com.facebook.InterfaceC1826d
    public String e() {
        return "ig_refresh_token";
    }

    @Override // c2.InterfaceC0596g
    public void g(InterfaceC0598i interfaceC0598i) {
        interfaceC0598i.onStart();
    }

    @Override // W1.F
    public void h(MediaExtractor mediaExtractor, Object obj) {
        mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    @Override // T1.v
    public u i(A a6) {
        return new C(a6.b(k.class, InputStream.class), 1);
    }

    public void j(G5.d dVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!dVar.b()) {
                break;
            }
            char a6 = dVar.a();
            dVar.f1278a++;
            int p2 = p(a6, sb);
            int length = ((StringBuilder) dVar.f1282f).length() + ((sb.length() / 3) << 1);
            dVar.d(length);
            int i9 = ((G5.f) dVar.f1283g).b - length;
            if (!dVar.b()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (i9 < 2 || i9 > 2)) {
                    int length2 = sb.length();
                    sb.delete(length2 - p2, length2);
                    dVar.f1278a--;
                    p2 = p(dVar.a(), sb2);
                    dVar.f1283g = null;
                }
                while (sb.length() % 3 == 1 && ((p2 <= 3 && i9 != 1) || p2 > 3)) {
                    int length3 = sb.length();
                    sb.delete(length3 - p2, length3);
                    dVar.f1278a--;
                    p2 = p(dVar.a(), sb2);
                    dVar.f1283g = null;
                }
            } else if (sb.length() % 3 == 0) {
                if (r8.k.t(dVar.f1280d, dVar.f1278a, t()) != t()) {
                    dVar.b = 0;
                    break;
                }
            }
        }
        x(dVar, sb);
    }

    @Override // com.facebook.InterfaceC1826d
    public String l() {
        return "refresh_access_token";
    }

    @Override // W1.F
    public void m(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e9  */
    @Override // A5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public D5.b n(java.lang.String r20, int r21, java.util.EnumMap r22) {
        /*
            Method dump skipped, instructions count: 1109
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.C2645d.n(java.lang.String, int, java.util.EnumMap):D5.b");
    }

    @Override // com.adjust.sdk.OnEventTrackingFailedListener
    public void onFinishedEventTrackingFailed(AdjustEventFailure adjustEventFailure) {
        Log.d("MiaAdjust", "Event failure callback called!");
        Log.d("MiaAdjust", "Event failure data: " + adjustEventFailure.toString());
    }

    public int p(char c9, StringBuilder sb) {
        if (c9 == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c9 >= '0' && c9 <= '9') {
            sb.append((char) (c9 - ','));
            return 1;
        }
        if (c9 >= 'A' && c9 <= 'Z') {
            sb.append((char) (c9 - '3'));
            return 1;
        }
        if (c9 < ' ') {
            sb.append((char) 0);
            sb.append(c9);
            return 2;
        }
        if (c9 >= '!' && c9 <= '/') {
            sb.append((char) 1);
            sb.append((char) (c9 - '!'));
            return 2;
        }
        if (c9 >= ':' && c9 <= '@') {
            sb.append((char) 1);
            sb.append((char) (c9 - '+'));
            return 2;
        }
        if (c9 >= '[' && c9 <= '_') {
            sb.append((char) 1);
            sb.append((char) (c9 - 'E'));
            return 2;
        }
        if (c9 >= '`' && c9 <= 127) {
            sb.append((char) 2);
            sb.append((char) (c9 - '`'));
            return 2;
        }
        sb.append("\u0001\u001e");
        return p((char) (c9 - 128), sb) + 2;
    }

    public synchronized C1843l r() {
        C1843l c1843l;
        try {
            if (C1843l.f13618e == null) {
                C1843l.f13618e = s();
            }
            c1843l = C1843l.f13618e;
            if (c1843l == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
            }
        } catch (Throwable th) {
            throw th;
        }
        return c1843l;
    }

    public int t() {
        return 1;
    }

    public synchronized J u() {
        J j7;
        try {
            if (J.f13425e == null) {
                C2747b a6 = C2747b.a(r.a());
                j.d(a6, "getInstance(applicationContext)");
                J.f13425e = new J(a6, new U4.A());
            }
            j7 = J.f13425e;
            if (j7 == null) {
                j.k("instance");
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return j7;
    }

    public Signature[] w(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public void x(G5.d dVar, StringBuilder sb) {
        int length = (sb.length() / 3) << 1;
        int length2 = sb.length() % 3;
        int length3 = ((StringBuilder) dVar.f1282f).length() + length;
        dVar.d(length3);
        int i9 = ((G5.f) dVar.f1283g).b - length3;
        if (length2 == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                A(dVar, sb);
            }
            if (dVar.b()) {
                dVar.e((char) 254);
            }
        } else if (i9 == 1 && length2 == 1) {
            while (sb.length() >= 3) {
                A(dVar, sb);
            }
            if (dVar.b()) {
                dVar.e((char) 254);
            }
            dVar.f1278a--;
        } else if (length2 == 0) {
            while (sb.length() >= 3) {
                A(dVar, sb);
            }
            if (i9 > 0 || dVar.b()) {
                dVar.e((char) 254);
            }
        } else {
            throw new IllegalStateException("Unexpected case. Please report!");
        }
        dVar.b = 0;
    }

    @Override // W1.p
    public void f() {
    }

    @Override // c2.InterfaceC0596g
    public void d(InterfaceC0598i interfaceC0598i) {
    }

    @Override // e0.InterfaceC2201b
    public Object k(C2200a c2200a) {
        throw c2200a;
    }

    @Override // R1.a
    public void a(f fVar, C.c cVar) {
    }

    @Override // W1.p
    public void b(Q1.a aVar, Bitmap bitmap) {
    }
}
