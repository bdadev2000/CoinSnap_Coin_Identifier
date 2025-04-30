package R2;

import F2.d;
import F7.l;
import G7.e;
import G7.j;
import G7.s;
import G7.v;
import O5.i;
import O5.k;
import O7.o;
import Q7.n0;
import a5.C0398b;
import a8.f;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.adjust.sdk.Constants;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.appevents.g;
import com.facebook.r;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import e8.W;
import f8.C2276a;
import f8.h;
import f8.p;
import j5.C2398a;
import java.io.Serializable;
import java.net.URL;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import o4.C2495a;
import o4.C2496b;
import o4.C2502h;
import y.C2936d;
import y.C2939g;

/* loaded from: classes.dex */
public abstract class b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [f8.b, f8.p] */
    /* JADX WARN: Type inference failed for: r2v2, types: [f8.f, java.lang.Object] */
    public static p a(l lVar) {
        C2276a c2276a = f8.b.f20369d;
        j.e(c2276a, "from");
        j.e(lVar, "builderAction");
        ?? obj = new Object();
        h hVar = c2276a.f20370a;
        obj.f20375a = hVar.f20385a;
        obj.b = hVar.f20389f;
        obj.f20376c = hVar.b;
        obj.f20377d = hVar.f20386c;
        obj.f20378e = hVar.f20387d;
        boolean z8 = hVar.f20388e;
        obj.f20379f = z8;
        String str = hVar.f20390g;
        obj.f20380g = str;
        obj.f20381h = hVar.f20391h;
        boolean z9 = hVar.f20392i;
        obj.f20382i = z9;
        String str2 = hVar.f20393j;
        obj.f20383j = str2;
        obj.f20384k = hVar.f20394k;
        obj.l = hVar.l;
        obj.m = c2276a.b;
        lVar.invoke(obj);
        if (z9 && !j.a(str2, "type")) {
            throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified".toString());
        }
        if (!z8) {
            if (!j.a(str, "    ")) {
                throw new IllegalArgumentException("Indent should not be specified when default printing mode is used".toString());
            }
        } else if (!j.a(str, "    ")) {
            for (int i9 = 0; i9 < str.length(); i9++) {
                char charAt = str.charAt(i9);
                if (charAt != ' ' && charAt != '\t' && charAt != '\r' && charAt != '\n') {
                    throw new IllegalArgumentException("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ".concat(str).toString());
                }
            }
        }
        h hVar2 = new h(obj.f20375a, obj.f20376c, obj.f20377d, obj.f20378e, obj.f20379f, obj.b, obj.f20380g, obj.f20381h, obj.f20382i, obj.f20383j, obj.f20384k, obj.l);
        C0398b c0398b = obj.m;
        j.e(c0398b, "module");
        return new f8.b(hVar2, c0398b);
    }

    public static void b(k kVar) {
        if (kVar.f2233f) {
            e(kVar);
            return;
        }
        throw new IllegalStateException("AdSession is not started");
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static void d(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
        } else {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void e(k kVar) {
        if (!kVar.f2234g) {
        } else {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public static void i(int i9, Object[] objArr) {
        for (int i10 = 0; i10 < i9; i10++) {
            if (objArr[i10] == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i10);
                throw new NullPointerException(sb.toString());
            }
        }
    }

    public static void j(int i9, int i10, int i11) {
        if (i9 >= 0 && i10 <= i11) {
            if (i9 <= i10) {
            } else {
                throw new IllegalArgumentException(n0.e(i9, i10, "fromIndex: ", " > toIndex: "));
            }
        } else {
            StringBuilder o3 = n0.o(i9, i10, "fromIndex: ", ", toIndex: ", ", size: ");
            o3.append(i11);
            throw new IndexOutOfBoundsException(o3.toString());
        }
    }

    public static C2496b k(String str, String str2) {
        C2398a c2398a = new C2398a(str, str2);
        C2495a a6 = C2496b.a(C2398a.class);
        a6.f21941e = 1;
        a6.f21942f = new d(c2398a, 19);
        return a6.b();
    }

    public static void l(k kVar) {
        if (i.NATIVE == ((i) kVar.b.b)) {
        } else {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    public static final void m(f fVar, d8.d dVar, Object obj) {
        j.e(fVar, "<this>");
        j.e(dVar, "encoder");
        j.e(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        dVar.a().getClass();
        M7.b bVar = fVar.f4083a;
        j.e(bVar, "baseClass");
        if (g.o(bVar).isInstance(obj)) {
            v.c(1, null);
        }
        e a6 = s.a(obj.getClass());
        String b = a6.b();
        if (b == null) {
            b = String.valueOf(a6);
        }
        W.i(bVar, b);
        throw null;
    }

    public static C2496b n(String str, com.applovin.impl.sdk.ad.g gVar) {
        C2495a a6 = C2496b.a(C2398a.class);
        a6.f21941e = 1;
        a6.a(C2502h.b(Context.class));
        a6.f21942f = new F2.e(5, str, gVar);
        return a6.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int o(int r5) {
        /*
            r0 = -1
            if (r5 != r0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            r3 = 6
            r4 = 0
            if (r1 >= r2) goto L15
            switch(r5) {
                case 21: goto L14;
                case 22: goto L12;
                case 23: goto L14;
                case 24: goto L12;
                case 25: goto L10;
                case 26: goto L14;
                case 27: goto L12;
                default: goto Lf;
            }
        Lf:
            goto L15
        L10:
            r5 = r4
            goto L15
        L12:
            r5 = 4
            goto L15
        L14:
            r5 = r3
        L15:
            r2 = 30
            if (r1 >= r2) goto L2e
            r2 = 12
            if (r5 == r2) goto L2c
            r2 = 13
            if (r5 == r2) goto L2f
            r2 = 16
            if (r5 == r2) goto L2c
            r2 = 17
            if (r5 == r2) goto L2a
            goto L2e
        L2a:
            r3 = r4
            goto L2f
        L2c:
            r3 = 1
            goto L2f
        L2e:
            r3 = r5
        L2f:
            r5 = 27
            if (r1 >= r5) goto L3e
            r5 = 7
            if (r3 == r5) goto L3f
            r5 = 8
            if (r3 == r5) goto L3f
            r5 = 9
            if (r3 == r5) goto L3f
        L3e:
            r0 = r3
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.b.o(int):int");
    }

    public static final int p(int i9, int i10, int i11) {
        if (i11 > 0) {
            if (i9 < i10) {
                int i12 = i10 % i11;
                if (i12 < 0) {
                    i12 += i11;
                }
                int i13 = i9 % i11;
                if (i13 < 0) {
                    i13 += i11;
                }
                int i14 = (i12 - i13) % i11;
                if (i14 < 0) {
                    i14 += i11;
                }
                return i10 - i14;
            }
            return i10;
        }
        if (i11 < 0) {
            if (i9 > i10) {
                int i15 = -i11;
                int i16 = i9 % i15;
                if (i16 < 0) {
                    i16 += i15;
                }
                int i17 = i10 % i15;
                if (i17 < 0) {
                    i17 += i15;
                }
                int i18 = (i16 - i17) % i15;
                if (i18 < 0) {
                    i18 += i15;
                }
                return i10 + i18;
            }
            return i10;
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    public static final PublicKey q(String str) {
        byte[] decode = Base64.decode(o.A(o.A(o.A(str, "\n", ""), "-----BEGIN PUBLIC KEY-----", ""), "-----END PUBLIC KEY-----", ""), 0);
        j.d(decode, "decode(pubKeyString, Base64.DEFAULT)");
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode));
        j.d(generatePublic, "kf.generatePublic(x509publicKey)");
        return generatePublic;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [G7.r, java.lang.Object] */
    public static final String r(String str) {
        j.e(str, "kid");
        r rVar = r.f13801a;
        URL url = new URL(Constants.SCHEME, j.j(r.f13814q, "www."), "/.well-known/oauth/openid/keys/");
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        ?? obj = new Object();
        r.c().execute(new a(url, (Object) obj, str, reentrantLock, newCondition, 0));
        reentrantLock.lock();
        try {
            newCondition.await(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, TimeUnit.MILLISECONDS);
            reentrantLock.unlock();
            return (String) obj.b;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static boolean s(Uri uri) {
        if (uri != null && AppLovinEventTypes.USER_VIEWED_CONTENT.equals(uri.getScheme()) && "media".equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [c4.e, c4.g, java.lang.Object] */
    public static c4.e t(c4.e eVar) {
        if (!(eVar instanceof c4.g) && !(eVar instanceof c4.f)) {
            if (eVar instanceof Serializable) {
                return new c4.f(eVar);
            }
            ?? obj = new Object();
            obj.b = eVar;
            return obj;
        }
        return eVar;
    }

    public static final boolean u(String str) {
        j.e(str, "method");
        if (!str.equals("GET") && !str.equals("HEAD")) {
            return true;
        }
        return false;
    }

    public static int x(double d2) {
        if (!Double.isNaN(d2)) {
            if (d2 > 2.147483647E9d) {
                return Integer.MAX_VALUE;
            }
            if (d2 < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d2);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static int y(float f9) {
        if (!Float.isNaN(f9)) {
            return Math.round(f9);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static final boolean z(PublicKey publicKey, String str, String str2) {
        j.e(str, DataSchemeDataSource.SCHEME_DATA);
        j.e(str2, "signature");
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initVerify(publicKey);
            byte[] bytes = str.getBytes(O7.a.f2244a);
            j.d(bytes, "(this as java.lang.String).getBytes(charset)");
            signature.update(bytes);
            byte[] decode = Base64.decode(str2, 8);
            j.d(decode, "decode(signature, Base64.URL_SAFE)");
            return signature.verify(decode);
        } catch (Exception unused) {
            return false;
        }
    }

    public abstract boolean f(y.h hVar, C2936d c2936d, C2936d c2936d2);

    public abstract boolean g(y.h hVar, Object obj, Object obj2);

    public abstract boolean h(y.h hVar, C2939g c2939g, C2939g c2939g2);

    public abstract void v(C2939g c2939g, C2939g c2939g2);

    public abstract void w(C2939g c2939g, Thread thread);
}
