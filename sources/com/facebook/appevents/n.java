package com.facebook.appevents;

import a.AbstractC0325a;
import android.animation.ValueAnimator;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import com.facebook.C;
import com.facebook.C1849l;
import com.facebook.F;
import com.facebook.internal.H;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.facebook.v;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import k.AbstractActivityC2417f;
import m1.C2463c;
import n1.C2475f;
import o1.C2492a;
import o1.C2493b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p1.C2538b;
import q.J0;
import t7.C2728q;
import u7.AbstractC2818i;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static UiModeManager f13498a;
    public static C2493b b;

    /* renamed from: c, reason: collision with root package name */
    public static C2493b f13499c;

    /* renamed from: d, reason: collision with root package name */
    public static C2493b f13500d;

    /* renamed from: e, reason: collision with root package name */
    public static C2493b f13501e;

    /* renamed from: f, reason: collision with root package name */
    public static C2493b f13502f;

    /* renamed from: g, reason: collision with root package name */
    public static C2492a f13503g;

    /* renamed from: h, reason: collision with root package name */
    public static C2492a f13504h;

    /* renamed from: i, reason: collision with root package name */
    public static a7.b f13505i;

    public static int a(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static ArrayList b(List list, HttpURLConnection httpURLConnection, C1849l c1849l) {
        G7.j.e(list, "requests");
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC2818i.E(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new F((C) it.next(), httpURLConnection, new com.facebook.p(c1849l)));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.F c(com.facebook.C r22, java.net.HttpURLConnection r23, java.lang.Object r24, java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.n.c(com.facebook.C, java.net.HttpURLConnection, java.lang.Object, java.lang.Object):com.facebook.F");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList d(java.io.InputStream r9, java.net.HttpURLConnection r10, com.facebook.E r11) {
        /*
            r0 = 1
            java.lang.String r1 = "requests"
            G7.j.e(r11, r1)
            java.lang.String r9 = com.facebook.internal.H.J(r9)
            L4.f r1 = com.facebook.internal.z.f13680c
            com.facebook.H r1 = com.facebook.H.f13412d
            com.facebook.r.h(r1)
            org.json.JSONTokener r1 = new org.json.JSONTokener
            r1.<init>(r9)
            java.lang.Object r9 = r1.nextValue()
            java.lang.String r1 = "resultObject"
            G7.j.d(r9, r1)
            java.util.ArrayList r1 = r11.f13403d
            int r1 = r1.size()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            r3 = 0
            if (r1 != r0) goto L6e
            java.lang.Object r4 = r11.get(r3)
            com.facebook.C r4 = (com.facebook.C) r4
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.io.IOException -> L4f org.json.JSONException -> L51
            r5.<init>()     // Catch: java.io.IOException -> L4f org.json.JSONException -> L51
            java.lang.String r6 = "body"
            r5.put(r6, r9)     // Catch: java.io.IOException -> L4f org.json.JSONException -> L51
            int r6 = r10.getResponseCode()     // Catch: java.io.IOException -> L4f org.json.JSONException -> L51
            java.lang.String r7 = "code"
            r5.put(r7, r6)     // Catch: java.io.IOException -> L4f org.json.JSONException -> L51
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch: java.io.IOException -> L4f org.json.JSONException -> L51
            r6.<init>()     // Catch: java.io.IOException -> L4f org.json.JSONException -> L51
            r6.put(r5)     // Catch: java.io.IOException -> L4f org.json.JSONException -> L51
            goto L6f
        L4f:
            r5 = move-exception
            goto L53
        L51:
            r5 = move-exception
            goto L61
        L53:
            com.facebook.F r6 = new com.facebook.F
            com.facebook.p r7 = new com.facebook.p
            r7.<init>(r5)
            r6.<init>(r4, r10, r7)
            r2.add(r6)
            goto L6e
        L61:
            com.facebook.F r6 = new com.facebook.F
            com.facebook.p r7 = new com.facebook.p
            r7.<init>(r5)
            r6.<init>(r4, r10, r7)
            r2.add(r6)
        L6e:
            r6 = r9
        L6f:
            boolean r4 = r6 instanceof org.json.JSONArray
            if (r4 == 0) goto Lca
            r4 = r6
            org.json.JSONArray r4 = (org.json.JSONArray) r4
            int r5 = r4.length()
            if (r5 != r1) goto Lca
            int r1 = r4.length()
            if (r1 <= 0) goto Lc2
        L82:
            int r4 = r3 + 1
            java.lang.Object r5 = r11.get(r3)
            com.facebook.C r5 = (com.facebook.C) r5
            r7 = r6
            org.json.JSONArray r7 = (org.json.JSONArray) r7     // Catch: com.facebook.C1849l -> L9e org.json.JSONException -> La0
            java.lang.Object r3 = r7.get(r3)     // Catch: com.facebook.C1849l -> L9e org.json.JSONException -> La0
            java.lang.String r7 = "obj"
            G7.j.d(r3, r7)     // Catch: com.facebook.C1849l -> L9e org.json.JSONException -> La0
            com.facebook.F r3 = c(r5, r10, r3, r9)     // Catch: com.facebook.C1849l -> L9e org.json.JSONException -> La0
            r2.add(r3)     // Catch: com.facebook.C1849l -> L9e org.json.JSONException -> La0
            goto Lbd
        L9e:
            r3 = move-exception
            goto La2
        La0:
            r3 = move-exception
            goto Lb0
        La2:
            com.facebook.F r7 = new com.facebook.F
            com.facebook.p r8 = new com.facebook.p
            r8.<init>(r3)
            r7.<init>(r5, r10, r8)
            r2.add(r7)
            goto Lbd
        Lb0:
            com.facebook.F r7 = new com.facebook.F
            com.facebook.p r8 = new com.facebook.p
            r8.<init>(r3)
            r7.<init>(r5, r10, r8)
            r2.add(r7)
        Lbd:
            if (r4 < r1) goto Lc0
            goto Lc2
        Lc0:
            r3 = r4
            goto L82
        Lc2:
            L4.f r9 = com.facebook.internal.z.f13680c
            com.facebook.H r9 = com.facebook.H.b
            com.facebook.r.h(r9)
            return r2
        Lca:
            com.facebook.l r9 = new com.facebook.l
            java.lang.String r10 = "Unexpected number of results"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.n.d(java.io.InputStream, java.net.HttpURLConnection, com.facebook.E):java.util.ArrayList");
    }

    public static final void e(String str) {
        File h6 = h();
        if (h6 != null && str != null) {
            new File(h6, str).delete();
        }
    }

    public static Drawable g(Context context, int i9) {
        return J0.c().e(context, i9);
    }

    public static final File h() {
        File file = new File(com.facebook.r.a().getCacheDir(), "instrument");
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        return file;
    }

    public static final boolean j(StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        G7.j.d(className, "element.className");
        if (!O7.o.C(className, "com.facebook", false)) {
            String className2 = stackTraceElement.getClassName();
            G7.j.d(className2, "element.className");
            if (!O7.o.C(className2, "com.meta", false)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean k(Thread thread) {
        StackTraceElement[] stackTrace = thread.getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                G7.j.d(stackTraceElement, "element");
                if (j(stackTraceElement)) {
                    String className = stackTraceElement.getClassName();
                    G7.j.d(className, "element.className");
                    if (!O7.o.C(className, "com.facebook.appevents.codeless", false)) {
                        String className2 = stackTraceElement.getClassName();
                        G7.j.d(className2, "element.className");
                        if (!O7.o.C(className2, "com.facebook.appevents.suggestedevents", false)) {
                            return true;
                        }
                    }
                    String methodName = stackTraceElement.getMethodName();
                    G7.j.d(methodName, "element.methodName");
                    if (O7.o.C(methodName, "onClick", false)) {
                        continue;
                    } else {
                        String methodName2 = stackTraceElement.getMethodName();
                        G7.j.d(methodName2, "element.methodName");
                        if (O7.o.C(methodName2, "onItemClick", false)) {
                            continue;
                        } else {
                            String methodName3 = stackTraceElement.getMethodName();
                            G7.j.d(methodName3, "element.methodName");
                            if (!O7.o.C(methodName3, "onTouch", false)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void l(AbstractActivityC2417f abstractActivityC2417f, String str, FrameLayout frameLayout, boolean z8) {
        G7.j.e(abstractActivityC2417f, "activity");
        G7.j.e(frameLayout, "frAds");
        if (AbstractC0325a.i(abstractActivityC2417f) && z8 && !C2538b.a().m) {
            C2475f.p().getClass();
            m1.g b8 = m1.g.b();
            b8.getClass();
            FrameLayout frameLayout2 = (FrameLayout) abstractActivityC2417f.findViewById(R.id.banner_container);
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) abstractActivityC2417f.findViewById(R.id.shimmer_container_banner);
            if (C2538b.a().m) {
                shimmerFrameLayout.setVisibility(8);
                return;
            }
            shimmerFrameLayout.setVisibility(0);
            com.facebook.shimmer.d dVar = shimmerFrameLayout.f13817c;
            ValueAnimator valueAnimator = dVar.f13841e;
            if (valueAnimator != null && !valueAnimator.isStarted() && dVar.getCallback() != null) {
                dVar.f13841e.start();
            }
            try {
                AdView adView = new AdView(abstractActivityC2417f);
                adView.setAdUnitId(str);
                frameLayout2.addView(adView);
                AdSize a6 = m1.g.a(abstractActivityC2417f, "BANNER_INLINE_LARGE_STYLE");
                shimmerFrameLayout.getLayoutParams().height = (int) ((a6.getHeight() * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
                adView.setAdSize(a6);
                adView.setLayerType(1, null);
                adView.setAdListener(new C2463c(b8, shimmerFrameLayout, frameLayout2, adView, str));
                adView.loadAd(new AdRequest.Builder().build());
                return;
            } catch (Exception e4) {
                e4.printStackTrace();
                return;
            }
        }
        frameLayout.removeAllViews();
        com.bumptech.glide.d.M(frameLayout);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static i8.C2371h m(i8.s r25) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.n.m(i8.s):i8.h");
    }

    public static B1.a n(G1.d dVar, v1.i iVar) {
        return new B1.a(F1.q.a(dVar, iVar, 1.0f, F1.f.f1076c, false), 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [B1.f, B1.b] */
    public static B1.b o(G1.c cVar, v1.i iVar, boolean z8) {
        float f9;
        if (z8) {
            f9 = H1.i.c();
        } else {
            f9 = 1.0f;
        }
        return new B1.f(F1.q.a(cVar, iVar, f9, F1.f.f1077d, false), 0);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [F1.E, java.lang.Object, androidx.work.o] */
    public static B1.a p(G1.d dVar, v1.i iVar, int i9) {
        ?? obj = new Object();
        obj.b = i9;
        ArrayList a6 = F1.q.a(dVar, iVar, 1.0f, obj, false);
        for (int i10 = 0; i10 < a6.size(); i10++) {
            I1.a aVar = (I1.a) a6.get(i10);
            C1.c cVar = (C1.c) aVar.b;
            C1.c cVar2 = (C1.c) aVar.f1409c;
            if (cVar != null && cVar2 != null) {
                float[] fArr = cVar.f425a;
                int length = fArr.length;
                float[] fArr2 = cVar2.f425a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f9 = Float.NaN;
                    int i11 = 0;
                    for (int i12 = 0; i12 < length2; i12++) {
                        float f10 = fArr3[i12];
                        if (f10 != f9) {
                            fArr3[i11] = f10;
                            i11++;
                            f9 = fArr3[i12];
                        }
                    }
                    float[] copyOfRange = Arrays.copyOfRange(fArr3, 0, i11);
                    aVar = new I1.a(cVar.b(copyOfRange), cVar2.b(copyOfRange));
                }
            }
            a6.set(i10, aVar);
        }
        return new B1.a(a6, 1);
    }

    public static B1.a q(G1.d dVar, v1.i iVar) {
        return new B1.a(F1.q.a(dVar, iVar, 1.0f, F1.f.f1078f, false), 2);
    }

    public static B1.a r(G1.d dVar, v1.i iVar) {
        return new B1.a(F1.q.a(dVar, iVar, H1.i.c(), F1.f.f1080h, true), 3);
    }

    public static final JSONObject s(String str) {
        File h6 = h();
        if (h6 != null) {
            try {
                return new JSONObject(H.J(new FileInputStream(new File(h6, str))));
            } catch (Exception unused) {
                e(str);
            }
        }
        return null;
    }

    public static final void t(String str, JSONArray jSONArray, v vVar) {
        if (jSONArray.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, jSONArray.toString());
            JSONObject n2 = H.n();
            if (n2 != null) {
                Iterator<String> keys = n2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, n2.get(next));
                }
            }
            String str2 = C.f13380j;
            R3.e.x(null, String.format("%s/instruments", Arrays.copyOf(new Object[]{com.facebook.r.b()}, 1)), jSONObject, vVar).d();
        } catch (JSONException unused) {
        }
    }

    public static final C2728q u(String str) {
        int i9;
        int i10;
        g.a(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char charAt = str.charAt(0);
        if (G7.j.f(charAt, 48) < 0) {
            i9 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i9 = 0;
        }
        int i12 = 119304647;
        int i13 = 119304647;
        while (i9 < length) {
            int digit = Character.digit((int) str.charAt(i9), 10);
            if (digit < 0) {
                return null;
            }
            int i14 = i11 ^ Integer.MIN_VALUE;
            if (Integer.compare(i14, i13 ^ Integer.MIN_VALUE) > 0) {
                if (i13 == i12) {
                    i10 = i9;
                    i13 = (int) (((-1) & 4294967295L) / (10 & 4294967295L));
                    if (Integer.compare(i14, i13 ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            i10 = i9;
            int i15 = i11 * 10;
            int i16 = i15 + digit;
            if (Integer.compare(i16 ^ Integer.MIN_VALUE, i15 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i9 = i10 + 1;
            i11 = i16;
            i12 = 119304647;
        }
        return new C2728q(i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0012 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final t7.C2730s v(java.lang.String r23) {
        /*
            r0 = r23
            java.lang.String r1 = "<this>"
            G7.j.e(r0, r1)
            r1 = 10
            com.facebook.appevents.g.a(r1)
            int r2 = r23.length()
            if (r2 != 0) goto L15
        L12:
            r3 = 0
            goto Lb4
        L15:
            r4 = 0
            char r5 = r0.charAt(r4)
            r6 = 48
            int r6 = G7.j.f(r5, r6)
            r7 = 1
            if (r6 >= 0) goto L2c
            if (r2 == r7) goto L12
            r6 = 43
            if (r5 == r6) goto L2a
            goto L12
        L2a:
            r5 = r7
            goto L2d
        L2c:
            r5 = r4
        L2d:
            long r8 = (long) r1
            r10 = 0
            r12 = 512409557603043100(0x71c71c71c71c71c, double:2.0539100454284282E-274)
            r14 = r10
            r16 = r12
        L38:
            if (r5 >= r2) goto Laf
            char r6 = r0.charAt(r5)
            int r6 = java.lang.Character.digit(r6, r1)
            if (r6 >= 0) goto L45
            goto L12
        L45:
            r18 = -9223372036854775808
            r20 = r2
            long r1 = r14 ^ r18
            long r3 = r16 ^ r18
            int r3 = java.lang.Long.compare(r1, r3)
            if (r3 <= 0) goto L8e
            int r3 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r3 != 0) goto L12
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 >= 0) goto L6e
            long r3 = r8 ^ r18
            int r3 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r3 >= 0) goto L69
            r16 = r10
            goto L85
        L69:
            r3 = 1
        L6b:
            r16 = r3
            goto L85
        L6e:
            long r16 = r16 / r8
            long r3 = r16 << r7
            long r16 = r3 * r8
            r21 = -1
            long r21 = r21 - r16
            long r16 = r21 ^ r18
            long r21 = r8 ^ r18
            int r16 = (r16 > r21 ? 1 : (r16 == r21 ? 0 : -1))
            if (r16 < 0) goto L81
            goto L82
        L81:
            r7 = 0
        L82:
            long r10 = (long) r7
            long r3 = r3 + r10
            goto L6b
        L85:
            long r3 = r16 ^ r18
            int r1 = java.lang.Long.compare(r1, r3)
            if (r1 <= 0) goto L8e
            goto L12
        L8e:
            long r14 = r14 * r8
            long r1 = (long) r6
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            long r1 = r1 + r14
            long r3 = r1 ^ r18
            long r6 = r14 ^ r18
            int r3 = java.lang.Long.compare(r3, r6)
            if (r3 >= 0) goto La3
            goto L12
        La3:
            int r5 = r5 + 1
            r14 = r1
            r2 = r20
            r1 = 10
            r4 = 0
            r7 = 1
            r10 = 0
            goto L38
        Laf:
            t7.s r3 = new t7.s
            r3.<init>(r14)
        Lb4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.n.v(java.lang.String):t7.s");
    }

    public static final void w(String str, String str2) {
        File h6 = h();
        if (h6 != null && str != null && str2 != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(h6, str));
                byte[] bytes = str2.getBytes(O7.a.f2244a);
                G7.j.d(bytes, "(this as java.lang.String).getBytes(charset)");
                fileOutputStream.write(bytes);
                fileOutputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    public String f() {
        return null;
    }

    public String i() {
        return null;
    }
}
