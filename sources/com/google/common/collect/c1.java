package com.google.common.collect;

import android.content.Context;
import android.graphics.PointF;
import android.text.TextUtils;
import com.otaliastudios.cameraview.CameraView;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class c1 implements lb.j, he.y, se.c {

    /* renamed from: b, reason: collision with root package name */
    public Object f11923b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11924c;

    /* renamed from: d, reason: collision with root package name */
    public Object f11925d;

    public c1(HashMap hashMap, HashMap hashMap2, xb.a aVar) {
        this.f11923b = hashMap;
        this.f11924c = hashMap2;
        this.f11925d = aVar;
    }

    public static void b(c1 c1Var, qb.d dVar) {
        c(c1Var, "X-CRASHLYTICS-GOOGLE-APP-ID", dVar.a);
        c(c1Var, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(c1Var, "X-CRASHLYTICS-API-CLIENT-VERSION", "19.2.1");
        c(c1Var, "Accept", "application/json");
        c(c1Var, "X-CRASHLYTICS-DEVICE-MODEL", dVar.f23745b);
        c(c1Var, "X-CRASHLYTICS-OS-BUILD-VERSION", dVar.f23746c);
        c(c1Var, "X-CRASHLYTICS-OS-DISPLAY-VERSION", dVar.f23747d);
        c(c1Var, "X-CRASHLYTICS-INSTALLATION-ID", ((jb.x) dVar.f23748e).c().a);
    }

    public static void c(c1 c1Var, String str, String str2) {
        if (str2 != null) {
            ((Map) c1Var.f11925d).put(str, str2);
        }
    }

    public static String e(String str, Map map) {
        String str2;
        String str3;
        StringBuilder sb2 = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb2.append((String) entry.getKey());
        sb2.append("=");
        if (entry.getValue() == null) {
            str2 = "";
        } else {
            str2 = URLEncoder.encode((String) entry.getValue(), "UTF-8");
        }
        sb2.append(str2);
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb2.append("&");
            sb2.append((String) entry2.getKey());
            sb2.append("=");
            if (entry2.getValue() == null) {
                str3 = "";
            } else {
                str3 = URLEncoder.encode((String) entry2.getValue(), "UTF-8");
            }
            sb2.append(str3);
        }
        String sb3 = sb2.toString();
        if (sb3.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith("&")) {
                sb3 = "&".concat(sb3);
            }
            return eb.j.k(str, sb3);
        }
        return kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.m(str, "?", sb3);
    }

    public static HashMap n(qb.d dVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", dVar.f23751h);
        hashMap.put("display_version", dVar.f23750g);
        hashMap.put("source", Integer.toString(dVar.f23752i));
        String str = dVar.f23749f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    @Override // lb.j
    public final void a(lb.i iVar, int i10) {
        try {
            iVar.read((byte[]) this.f11923b, ((int[]) this.f11924c)[0], i10);
            int[] iArr = (int[]) this.f11924c;
            iArr[0] = iArr[0] + i10;
        } finally {
            iVar.close();
        }
    }

    public final fc.b d() {
        String str;
        if (((Long) this.f11924c) == null) {
            str = " tokenExpirationTimestamp";
        } else {
            str = "";
        }
        if (str.isEmpty()) {
            return new fc.b((String) this.f11923b, ((Long) this.f11924c).longValue(), (fc.f) this.f11925d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final void f(fe.a aVar) {
        ((fe.c) this.f11924c).a(1, "dispatchError", aVar);
        ((CameraView) this.f11925d).f16484l.post(new androidx.appcompat.widget.j(24, this, aVar));
    }

    public final void g(re.c cVar) {
        ((fe.c) this.f11924c).a(0, "dispatchFrame:", Long.valueOf(cVar.a()), "processors:", Integer.valueOf(((CameraView) this.f11925d).u.size()));
        if (((CameraView) this.f11925d).u.isEmpty()) {
            cVar.b();
        } else {
            ((CameraView) this.f11925d).f16485m.execute(new androidx.appcompat.widget.j(23, this, cVar));
        }
    }

    public final void h(float f10, float[] fArr, PointF[] pointFArr) {
        ((fe.c) this.f11924c).a(1, "dispatchOnExposureCorrectionChanged", Float.valueOf(f10));
        ((CameraView) this.f11925d).f16484l.post(new fe.h(this, f10, fArr, pointFArr));
    }

    public final void i(se.a aVar, boolean z10, PointF pointF) {
        ((fe.c) this.f11924c).a(1, "dispatchOnFocusEnd", aVar, Boolean.valueOf(z10), pointF);
        ((CameraView) this.f11925d).f16484l.post(new fe.j(this, z10, aVar, pointF));
    }

    public final void j(se.a aVar, PointF pointF) {
        ((fe.c) this.f11924c).a(1, "dispatchOnFocusStart", aVar, pointF);
        ((CameraView) this.f11925d).f16484l.post(new k0.a(14, this, pointF, aVar));
    }

    public final void k(float f10, PointF[] pointFArr) {
        ((fe.c) this.f11924c).a(1, "dispatchOnZoomChanged", Float.valueOf(f10));
        ((CameraView) this.f11925d).f16484l.post(new fe.g(this, f10, pointFArr));
    }

    public final void l(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        Map map = (Map) this.f11923b;
        yb.f fVar = new yb.f(byteArrayOutputStream, map, (Map) this.f11924c, (vb.d) this.f11925d);
        if (obj != null) {
            vb.d dVar = (vb.d) map.get(obj.getClass());
            if (dVar != null) {
                dVar.a(obj, fVar);
            } else {
                throw new vb.b("No encoder for " + obj.getClass());
            }
        }
    }

    public final a4.k m() {
        Throwable th2;
        HttpsURLConnection httpsURLConnection;
        kb.c.a(new kb.b(1), b6.c.f2301f);
        InputStream inputStream = null;
        String sb2 = null;
        inputStream = null;
        try {
            String e2 = e((String) this.f11924c, (Map) this.f11923b);
            b6.a.f2288f.h("GET Request URL: " + e2);
            httpsURLConnection = (HttpsURLConnection) new URL(e2).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : ((Map) this.f11925d).entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                        char[] cArr = new char[8192];
                        StringBuilder sb3 = new StringBuilder();
                        while (true) {
                            int read = bufferedReader.read(cArr);
                            if (read == -1) {
                                break;
                            }
                            sb3.append(cArr, 0, read);
                        }
                        sb2 = sb3.toString();
                    } catch (Throwable th3) {
                        th2 = th3;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th2;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new a4.k(responseCode, sb2);
            } catch (Throwable th4) {
                th2 = th4;
            }
        } catch (Throwable th5) {
            th2 = th5;
            httpsURLConnection = null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(83:23|(82:284|285|(1:27)|28|29|30|(1:32)|281|34|(3:36|37|(78:39|(71:41|(1:43)|44|(1:46)|47|(1:49)|50|(60:52|(1:247)|56|(1:58)|59|(1:61)(2:237|(1:242)(1:241))|(1:63)|64|(1:66)(5:225|(1:227)|228|(1:230)(1:236)|(1:232)(2:233|(1:235)))|67|(1:69)(6:204|(5:207|(1:219)(1:213)|(2:215|216)(1:218)|217|205)|220|221|(1:223)|224)|70|(1:72)(1:203)|(1:74)|75|(43:199|200|(1:81)|82|(1:84)|85|(37:87|(1:193)|(1:92)|93|(33:95|(1:191)|(1:100)|101|(29:103|(1:105)|(1:107)|108|(25:186|187|(1:112)|113|(3:176|177|(22:179|(1:181)|182|(1:117)|118|(4:120|121|122|(2:124|(16:126|(3:128|(1:133)(1:131)|132)|134|(1:136)|137|(1:139)|140|(1:142)|143|(1:145)|146|(6:153|154|(1:156)(1:163)|157|(1:159)(1:162)|160)|148|(1:150)|151|152)(2:168|169))(2:170|171))|175|(0)|134|(0)|137|(0)|140|(0)|143|(0)|146|(0)|148|(0)|151|152)(2:183|184))|115|(0)|118|(0)|175|(0)|134|(0)|137|(0)|140|(0)|143|(0)|146|(0)|148|(0)|151|152)|110|(0)|113|(0)|115|(0)|118|(0)|175|(0)|134|(0)|137|(0)|140|(0)|143|(0)|146|(0)|148|(0)|151|152)|190|(0)|108|(0)|110|(0)|113|(0)|115|(0)|118|(0)|175|(0)|134|(0)|137|(0)|140|(0)|143|(0)|146|(0)|148|(0)|151|152)|192|(0)|101|(0)|190|(0)|108|(0)|110|(0)|113|(0)|115|(0)|118|(0)|175|(0)|134|(0)|137|(0)|140|(0)|143|(0)|146|(0)|148|(0)|151|152)|194|(0)|93|(0)|192|(0)|101|(0)|190|(0)|108|(0)|110|(0)|113|(0)|115|(0)|118|(0)|175|(0)|134|(0)|137|(0)|140|(0)|143|(0)|146|(0)|148|(0)|151|152)|77|(43:195|196|(0)|82|(0)|85|(0)|194|(0)|93|(0)|192|(0)|101|(0)|190|(0)|108|(0)|110|(0)|113|(0)|115|(0)|118|(0)|175|(0)|134|(0)|137|(0)|140|(0)|143|(0)|146|(0)|148|(0)|151|152)|79|(0)|82|(0)|85|(0)|194|(0)|93|(0)|192|(0)|101|(0)|190|(0)|108|(0)|110|(0)|113|(0)|115|(0)|118|(0)|175|(0)|134|(0)|137|(0)|140|(0)|143|(0)|146|(0)|148|(0)|151|152)|248|(62:257|258|259|(1:256)|56|(0)|59|(0)(0)|(0)|64|(0)(0)|67|(0)(0)|70|(0)(0)|(0)|75|(0)|77|(0)|79|(0)|82|(0)|85|(0)|194|(0)|93|(0)|192|(0)|101|(0)|190|(0)|108|(0)|110|(0)|113|(0)|115|(0)|118|(0)|175|(0)|134|(0)|137|(0)|140|(0)|143|(0)|146|(0)|148|(0)|151|152)|252|(1:254)|256|56|(0)|59|(0)(0)|(0)|64|(0)(0)|67|(0)(0)|70|(0)(0)|(0)|75|(0)|77|(0)|79|(0)|82|(0)|85|(0)|194|(0)|93|(0)|192|(0)|101|(0)|190|(0)|108|(0)|110|(0)|113|(0)|115|(0)|118|(0)|175|(0)|134|(0)|137|(0)|140|(0)|143|(0)|146|(0)|148|(0)|151|152)|263|(73:265|(1:267)|44|(0)|47|(0)|50|(0)|248|(1:250)|257|258|259|(0)|256|56|(0)|59|(0)(0)|(0)|64|(0)(0)|67|(0)(0)|70|(0)(0)|(0)|75|(0)|77|(0)|79|(0)|82|(0)|85|(0)|194|(0)|93|(0)|192|(0)|101|(0)|190|(0)|108|(0)|110|(0)|113|(0)|115|(0)|118|(0)|175|(0)|134|(0)|137|(0)|140|(0)|143|(0)|146|(0)|148|(0)|151|152)(1:276)|268|(3:270|(1:272)(1:274)|273)|275|44|(0)|47|(0)|50|(0)|248|(0)|257|258|259|(0)|256|56|(0)|59|(0)(0)|(0)|64|(0)(0)|67|(0)(0)|70|(0)(0)|(0)|75|(0)|77|(0)|79|(0)|82|(0)|85|(0)|194|(0)|93|(0)|192|(0)|101|(0)|190|(0)|108|(0)|110|(0)|113|(0)|115|(0)|118|(0)|175|(0)|134|(0)|137|(0)|140|(0)|143|(0)|146|(0)|148|(0)|151|152))|277|44|(0)|47|(0)|50|(0)|248|(0)|257|258|259|(0)|256|56|(0)|59|(0)(0)|(0)|64|(0)(0)|67|(0)(0)|70|(0)(0)|(0)|75|(0)|77|(0)|79|(0)|82|(0)|85|(0)|194|(0)|93|(0)|192|(0)|101|(0)|190|(0)|108|(0)|110|(0)|113|(0)|115|(0)|118|(0)|175|(0)|134|(0)|137|(0)|140|(0)|143|(0)|146|(0)|148|(0)|151|152)|25|(0)|28|29|30|(0)|281|34|(0)|277|44|(0)|47|(0)|50|(0)|248|(0)|257|258|259|(0)|256|56|(0)|59|(0)(0)|(0)|64|(0)(0)|67|(0)(0)|70|(0)(0)|(0)|75|(0)|77|(0)|79|(0)|82|(0)|85|(0)|194|(0)|93|(0)|192|(0)|101|(0)|190|(0)|108|(0)|110|(0)|113|(0)|115|(0)|118|(0)|175|(0)|134|(0)|137|(0)|140|(0)|143|(0)|146|(0)|148|(0)|151|152) */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0219, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x021a, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x00d5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x00d6, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d2, code lost:
    
        if (r0 != null) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x05fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x049c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0393 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0 A[Catch: NameNotFoundException -> 0x00d5, TRY_LEAVE, TryCatch #3 {NameNotFoundException -> 0x00d5, blocks: (B:30:0x00ca, B:32:0x00d0), top: B:29:0x00ca }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0435  */
    /* JADX WARN: Type inference failed for: r0v104, types: [int] */
    /* JADX WARN: Type inference failed for: r0v128 */
    /* JADX WARN: Type inference failed for: r0v197 */
    /* JADX WARN: Type inference failed for: r0v198 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean o() {
        /*
            Method dump skipped, instructions count: 1694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.c1.o():boolean");
    }

    public final JSONObject p(a4.k kVar) {
        boolean z10;
        int i10 = kVar.f151c;
        ((b6.a) this.f11925d).h("Settings response code was: " + i10);
        if (i10 != 200 && i10 != 201 && i10 != 202 && i10 != 203) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            String str = kVar.f150b;
            try {
                return new JSONObject(str);
            } catch (Exception e2) {
                ((b6.a) this.f11925d).i("Failed to parse settings JSON from " + ((String) this.f11923b), e2);
                ((b6.a) this.f11925d).i("Settings response " + str, null);
                return null;
            }
        }
        b6.a aVar = (b6.a) this.f11925d;
        StringBuilder m10 = a4.j.m("Settings request failed; (status: ", i10, ") from ");
        m10.append((String) this.f11923b);
        aVar.e(m10.toString(), null);
        return null;
    }

    public final void q() {
        int i10 = 3;
        ze.b e2 = ((CameraView) this.f11925d).f16489q.e(3);
        if (e2 != null) {
            if (e2.equals(((CameraView) this.f11925d).f16490r)) {
                ((fe.c) this.f11924c).a(1, "onCameraPreviewStreamSizeChanged:", "swallowing because the preview size has not changed.", e2);
                return;
            } else {
                ((fe.c) this.f11924c).a(1, "onCameraPreviewStreamSizeChanged: posting a requestLayout call.", "Preview stream size:", e2);
                ((CameraView) this.f11925d).f16484l.post(new fe.i(this, i10));
                return;
            }
        }
        throw new RuntimeException("Preview stream size should not be null here.");
    }

    public c1(String str, HashMap hashMap) {
        this.f11924c = str;
        this.f11923b = hashMap;
        this.f11925d = new HashMap();
    }

    public c1(Context context, hb.d dVar, ExecutorService executorService) {
        this.f11923b = executorService;
        this.f11924c = context;
        this.f11925d = dVar;
    }

    public c1(ni.a aVar, String str) {
        b6.a aVar2 = b6.a.f2288f;
        if (str != null) {
            this.f11925d = aVar2;
            this.f11924c = aVar;
            this.f11923b = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c1(qa.a r4) {
        /*
            r3 = this;
            r3.f11925d = r4
            r3.<init>()
            java.lang.Object r0 = r4.f23736c
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r1 = "com.google.firebase.crashlytics.unity_version"
            java.lang.String r2 = "string"
            int r0 = jb.g.h(r0, r1, r2)
            b6.a r1 = b6.a.f2288f
            if (r0 == 0) goto L3d
            java.lang.String r2 = "Unity"
            r3.f11923b = r2
            java.lang.Object r4 = r4.f23736c
            android.content.Context r4 = (android.content.Context) r4
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getString(r0)
            r3.f11924c = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Unity Editor version is: "
            r4.<init>(r0)
            java.lang.Object r0 = r3.f11924c
            java.lang.String r0 = (java.lang.String) r0
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r1.h(r4)
            goto L71
        L3d:
            java.lang.String r0 = "flutter_assets/NOTICES.Z"
            java.lang.Object r2 = r4.f23736c
            android.content.Context r2 = (android.content.Context) r2
            android.content.res.AssetManager r2 = r2.getAssets()
            if (r2 != 0) goto L4a
            goto L5d
        L4a:
            java.lang.Object r4 = r4.f23736c     // Catch: java.io.IOException -> L5d
            android.content.Context r4 = (android.content.Context) r4     // Catch: java.io.IOException -> L5d
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch: java.io.IOException -> L5d
            java.io.InputStream r4 = r4.open(r0)     // Catch: java.io.IOException -> L5d
            if (r4 == 0) goto L5b
            r4.close()     // Catch: java.io.IOException -> L5d
        L5b:
            r4 = 1
            goto L5e
        L5d:
            r4 = 0
        L5e:
            r0 = 0
            if (r4 == 0) goto L6d
            java.lang.String r4 = "Flutter"
            r3.f11923b = r4
            r3.f11924c = r0
            java.lang.String r4 = "Development platform is: Flutter"
            r1.h(r4)
            goto L71
        L6d:
            r3.f11923b = r0
            r3.f11924c = r0
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.c1.<init>(qa.a):void");
    }

    public c1(lb.m mVar, byte[] bArr, int[] iArr) {
        this.f11925d = mVar;
        this.f11923b = bArr;
        this.f11924c = iArr;
    }

    public c1(int i10) {
        if (i10 != 6 && i10 != 7) {
            this.f11923b = new c0();
        }
    }

    public c1(p000if.f fVar, p000if.c cVar) {
        this.f11923b = fVar;
        this.f11924c = cVar;
    }

    public c1(CameraView cameraView) {
        this.f11925d = cameraView;
        String simpleName = c1.class.getSimpleName();
        this.f11923b = simpleName;
        this.f11924c = new fe.c(simpleName);
    }
}
