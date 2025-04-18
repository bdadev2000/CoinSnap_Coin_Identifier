package h;

import android.content.ClipDescription;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.fragment.app.f1;
import androidx.lifecycle.a1;
import androidx.lifecycle.c1;
import androidx.lifecycle.d1;
import androidx.lifecycle.x0;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bytedance.sdk.component.Sg.YFl.EH;
import com.bytedance.sdk.component.Sg.YFl.vc;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class c implements t0.j, s0.e, x2.a, q4.a, m0.c, i8.b0 {

    /* renamed from: g, reason: collision with root package name */
    public static c f18521g;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18522b;

    /* renamed from: c, reason: collision with root package name */
    public Object f18523c;

    /* renamed from: d, reason: collision with root package name */
    public Object f18524d;

    /* renamed from: f, reason: collision with root package name */
    public Object f18525f;

    public /* synthetic */ c(int i10, Object obj) {
        this.f18522b = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c4, code lost:
    
        throw new a5.h("request header format error, header: ".concat(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0074, code lost:
    
        throw new a5.h("request line format error, line: ".concat(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0154 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static h.c m(java.io.InputStream r19) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.c.m(java.io.InputStream):h.c");
    }

    public final Object A(float f10, float f11, Object obj, Object obj2, float f12, float f13, float f14) {
        z3.b bVar = (z3.b) this.f18523c;
        bVar.a = f10;
        bVar.f28487b = f11;
        bVar.f28488c = obj;
        bVar.f28489d = obj2;
        bVar.f28490e = f12;
        bVar.f28491f = f13;
        bVar.f28492g = f14;
        return z(bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0040, code lost:
    
        if (r6.f27982d != r11) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0065, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0062, code lost:
    
        if (r6.f27982d != r11) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(m9.l r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, y7.n r15) {
        /*
            r7 = this;
            y7.h r6 = new y7.h
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f18525f = r6
            java.lang.Object r8 = r7.f18524d
            y7.l r8 = (y7.l) r8
            if (r8 == 0) goto L12
            return
        L12:
            java.lang.Object r8 = r7.f18523c
            y7.o r8 = (y7.o) r8
            y7.l[] r8 = r8.a(r9, r10)
            int r10 = r8.length
            r13 = 1
            r14 = 0
            if (r10 != r13) goto L25
            r8 = r8[r14]
            r7.f18524d = r8
            goto Lba
        L25:
            int r10 = r8.length
            r0 = r14
        L27:
            if (r0 >= r10) goto L70
            r1 = r8[r0]
            boolean r2 = r1.d(r6)     // Catch: java.lang.Throwable -> L43 java.io.EOFException -> L58
            if (r2 == 0) goto L36
            r7.f18524d = r1     // Catch: java.lang.Throwable -> L43 java.io.EOFException -> L58
            r6.f27984f = r14
            goto L70
        L36:
            java.lang.Object r1 = r7.f18524d
            y7.l r1 = (y7.l) r1
            if (r1 != 0) goto L67
            long r1 = r6.f27982d
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L65
            goto L67
        L43:
            r8 = move-exception
            java.lang.Object r9 = r7.f18524d
            y7.l r9 = (y7.l) r9
            if (r9 != 0) goto L52
            long r9 = r6.f27982d
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L51
            goto L52
        L51:
            r13 = r14
        L52:
            v8.u0.m(r13)
            r6.f27984f = r14
            throw r8
        L58:
            java.lang.Object r1 = r7.f18524d
            y7.l r1 = (y7.l) r1
            if (r1 != 0) goto L67
            long r1 = r6.f27982d
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L65
            goto L67
        L65:
            r1 = r14
            goto L68
        L67:
            r1 = r13
        L68:
            v8.u0.m(r1)
            r6.f27984f = r14
            int r0 = r0 + 1
            goto L27
        L70:
            java.lang.Object r10 = r7.f18524d
            y7.l r10 = (y7.l) r10
            if (r10 != 0) goto Lba
            c8.d r10 = new c8.d
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "None of the available extractors ("
            r11.<init>(r12)
            int r12 = n9.h0.a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
        L86:
            int r13 = r8.length
            if (r14 >= r13) goto La3
            r13 = r8[r14]
            java.lang.Class r13 = r13.getClass()
            java.lang.String r13 = r13.getSimpleName()
            r12.append(r13)
            int r13 = r8.length
            int r13 = r13 + (-1)
            if (r14 >= r13) goto La0
            java.lang.String r13 = ", "
            r12.append(r13)
        La0:
            int r14 = r14 + 1
            goto L86
        La3:
            java.lang.String r8 = r12.toString()
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r9.getClass()
            r10.<init>(r8)
            throw r10
        Lba:
            java.lang.Object r8 = r7.f18524d
            y7.l r8 = (y7.l) r8
            r8.a(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.c.B(m9.l, android.net.Uri, java.util.Map, long, long, y7.n):void");
    }

    public final void C(u2.e eVar) {
        ((v1.f0) this.f18523c).assertNotSuspendingTransaction();
        ((v1.f0) this.f18523c).beginTransaction();
        try {
            ((v1.l) this.f18524d).insert(eVar);
            ((v1.f0) this.f18523c).setTransactionSuccessful();
        } finally {
            ((v1.f0) this.f18523c).endTransaction();
        }
    }

    public final boolean D(int i10, w.e eVar, x.m mVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        x.b bVar = (x.b) this.f18524d;
        int[] iArr = eVar.f26610p0;
        bVar.a = iArr[0];
        boolean z14 = true;
        bVar.f27246b = iArr[1];
        bVar.f27247c = eVar.r();
        ((x.b) this.f18524d).f27248d = eVar.l();
        x.b bVar2 = (x.b) this.f18524d;
        bVar2.f27253i = false;
        bVar2.f27254j = i10;
        if (bVar2.a == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (bVar2.f27246b == 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && eVar.W > 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 && eVar.W > 0.0f) {
            z13 = true;
        } else {
            z13 = false;
        }
        int[] iArr2 = eVar.f26614t;
        if (z12 && iArr2[0] == 4) {
            bVar2.a = 1;
        }
        if (z13 && iArr2[1] == 4) {
            bVar2.f27246b = 1;
        }
        mVar.b(eVar, bVar2);
        eVar.O(((x.b) this.f18524d).f27249e);
        eVar.L(((x.b) this.f18524d).f27250f);
        Object obj = this.f18524d;
        x.b bVar3 = (x.b) obj;
        eVar.E = bVar3.f27252h;
        int i11 = bVar3.f27251g;
        eVar.f26580a0 = i11;
        if (i11 <= 0) {
            z14 = false;
        }
        eVar.E = z14;
        x.b bVar4 = (x.b) obj;
        bVar4.f27254j = 0;
        return bVar4.f27253i;
    }

    public final void E(androidx.lifecycle.n nVar) {
        androidx.lifecycle.w0 w0Var = (androidx.lifecycle.w0) this.f18525f;
        if (w0Var != null) {
            w0Var.run();
        }
        androidx.lifecycle.w0 w0Var2 = new androidx.lifecycle.w0((androidx.lifecycle.x) this.f18523c, nVar);
        this.f18525f = w0Var2;
        Handler handler = (Handler) this.f18524d;
        Intrinsics.checkNotNull(w0Var2);
        handler.postAtFrontOfQueue(w0Var2);
    }

    public final void F(String str) {
        ((v1.f0) this.f18523c).assertNotSuspendingTransaction();
        z1.j acquire = ((v1.n0) this.f18525f).acquire();
        if (str == null) {
            acquire.o(1);
        } else {
            acquire.i(1, str);
        }
        ((v1.f0) this.f18523c).beginTransaction();
        try {
            acquire.D();
            ((v1.f0) this.f18523c).setTransactionSuccessful();
        } finally {
            ((v1.f0) this.f18523c).endTransaction();
            ((v1.n0) this.f18525f).release(acquire);
        }
    }

    public final void G(String str) {
        if (str != null) {
            this.f18523c = str;
            return;
        }
        throw new NullPointerException("Null backendName");
    }

    public final void H(int[] iArr, int[] iArr2, String[] strArr) {
        ((String[][]) this.f18523c)[1] = strArr;
        ((int[][]) this.f18524d)[1] = iArr;
        ((int[][]) this.f18525f)[1] = iArr2;
    }

    public final void I(f7.d dVar) {
        if (dVar != null) {
            this.f18525f = dVar;
            return;
        }
        throw new NullPointerException("Null priority");
    }

    public final void J(w.f fVar, int i10, int i11, int i12) {
        int i13 = fVar.f26582b0;
        int i14 = fVar.f26584c0;
        fVar.f26582b0 = 0;
        fVar.f26584c0 = 0;
        fVar.O(i11);
        fVar.L(i12);
        if (i13 < 0) {
            fVar.f26582b0 = 0;
        } else {
            fVar.f26582b0 = i13;
        }
        if (i14 < 0) {
            fVar.f26584c0 = 0;
        } else {
            fVar.f26584c0 = i14;
        }
        w.f fVar2 = (w.f) this.f18525f;
        fVar2.f26622t0 = i10;
        fVar2.R();
    }

    public final void K(w.f fVar) {
        ((ArrayList) this.f18523c).clear();
        int size = fVar.f26664q0.size();
        for (int i10 = 0; i10 < size; i10++) {
            w.e eVar = (w.e) fVar.f26664q0.get(i10);
            int[] iArr = eVar.f26610p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                ((ArrayList) this.f18523c).add(eVar);
            }
        }
        fVar.f26621s0.a = true;
    }

    public final String L() {
        int tN = ((EH) this.f18525f).tN();
        switch (tN) {
            case 200:
                return "OK";
            case 201:
                return "Created";
            case 202:
                return "Accepted";
            case 203:
                return "Non-Authoritative";
            case 204:
                return "No Content";
            case 205:
                return "Reset Content";
            case 206:
                return "Partial Content";
            default:
                switch (tN) {
                    case 300:
                        return "Multiple Choices";
                    case 301:
                        return "Moved Permanently";
                    case 302:
                        return "Temporary Redirect";
                    case 303:
                        return "See Other";
                    case 304:
                        return "Not Modified";
                    case 305:
                        return "Use Proxy";
                    default:
                        switch (tN) {
                            case 400:
                                return "Bad Request";
                            case 401:
                                return "Unauthorized";
                            case 402:
                                return "Payment Required";
                            case 403:
                                return "Forbidden";
                            case 404:
                                return "Not Found";
                            case 405:
                                return "Method Not Allowed";
                            case 406:
                                return "Not Acceptable";
                            case TTAdConstant.DOWNLOAD_APP_INFO_CODE /* 407 */:
                                return "Proxy Authentication Required";
                            case TTAdConstant.DOWNLOAD_URL_CODE /* 408 */:
                                return "Request Time-Out";
                            case TTAdConstant.IMAGE_LIST_CODE /* 409 */:
                                return "Conflict";
                            case TTAdConstant.IMAGE_LIST_SIZE_CODE /* 410 */:
                                return "Gone";
                            case TTAdConstant.IMAGE_CODE /* 411 */:
                                return "Length Required";
                            case TTAdConstant.IMAGE_URL_CODE /* 412 */:
                                return "Precondition Failed";
                            case TTAdConstant.VIDEO_INFO_CODE /* 413 */:
                                return "Request Entity Too Large";
                            case TTAdConstant.VIDEO_URL_CODE /* 414 */:
                                return "Request-URI Too Large";
                            case TTAdConstant.VIDEO_COVER_URL_CODE /* 415 */:
                                return "Unsupported Media Type";
                            default:
                                switch (tN) {
                                    case 500:
                                        return "Internal Server Error";
                                    case PglCryptUtils.LOAD_SO_FAILED /* 501 */:
                                        return "Not Implemented";
                                    case PglCryptUtils.INPUT_INVALID /* 502 */:
                                        return "Bad Gateway";
                                    case PglCryptUtils.COMPRESS_FAILED /* 503 */:
                                        return "Service Unavailable";
                                    case PglCryptUtils.BASE64_FAILED /* 504 */:
                                        return "Gateway Timeout";
                                    case PglCryptUtils.ENCRYPT_FAILED /* 505 */:
                                        return "HTTP Version Not Supported";
                                    default:
                                        return "";
                                }
                        }
                }
        }
    }

    public final String M() {
        Object obj = this.f18525f;
        if (((EH) obj) != null && ((EH) obj).qsH() != null) {
            return ((EH) this.f18525f).qsH().toString();
        }
        return "http/1.1";
    }

    @Override // i8.b0
    public final void a(n9.x xVar) {
        long c10;
        long j3;
        long j10;
        v8.u0.p((n9.f0) this.f18524d);
        int i10 = n9.h0.a;
        n9.f0 f0Var = (n9.f0) this.f18524d;
        synchronized (f0Var) {
            long j11 = f0Var.f22537c;
            if (j11 != C.TIME_UNSET) {
                c10 = j11 + f0Var.f22536b;
            } else {
                c10 = f0Var.c();
            }
            j3 = c10;
        }
        n9.f0 f0Var2 = (n9.f0) this.f18524d;
        synchronized (f0Var2) {
            j10 = f0Var2.f22536b;
        }
        if (j3 != C.TIME_UNSET && j10 != C.TIME_UNSET) {
            s7.r0 r0Var = (s7.r0) this.f18523c;
            if (j10 != r0Var.f24727r) {
                r0Var.getClass();
                s7.q0 q0Var = new s7.q0(r0Var);
                q0Var.f24671o = j10;
                s7.r0 r0Var2 = new s7.r0(q0Var);
                this.f18523c = r0Var2;
                ((y7.a0) this.f18525f).f(r0Var2);
            }
            int i11 = xVar.f22600c - xVar.f22599b;
            ((y7.a0) this.f18525f).a(i11, xVar);
            ((y7.a0) this.f18525f).d(j3, 1, i11, 0, null);
        }
    }

    @Override // i8.b0
    public final void b(n9.f0 f0Var, y7.n nVar, i8.h0 h0Var) {
        this.f18524d = f0Var;
        h0Var.a();
        h0Var.b();
        y7.a0 track = nVar.track(h0Var.f19317d, 5);
        this.f18525f = track;
        track.f((s7.r0) this.f18523c);
    }

    @Override // m0.c
    public final boolean c(Object obj) {
        if (obj instanceof x4.b) {
            ((x4.b) obj).b().a = true;
        }
        switch (((com.facebook.b) ((x4.c) this.f18524d)).f10983b) {
            case 27:
                break;
            default:
                ((List) obj).clear();
                break;
        }
        return ((m0.c) this.f18525f).c(obj);
    }

    @Override // m0.c
    public final Object d() {
        Object d10 = ((m0.c) this.f18525f).d();
        if (d10 == null) {
            d10 = ((x4.a) this.f18523c).f();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + d10.getClass());
            }
        }
        if (d10 instanceof x4.b) {
            ((x4.b) d10).b().a = false;
        }
        return d10;
    }

    @Override // s0.e
    public final Object e() {
        return null;
    }

    @Override // s0.e
    public final Uri f() {
        return (Uri) this.f18523c;
    }

    @Override // s0.e
    public final void g() {
    }

    @Override // s0.e
    public final ClipDescription getDescription() {
        return (ClipDescription) this.f18524d;
    }

    @Override // s0.e
    public final Uri h() {
        return (Uri) this.f18525f;
    }

    @Override // q4.a
    public final g4.g0 i(g4.g0 g0Var, e4.m mVar) {
        Drawable drawable = (Drawable) g0Var.get();
        if (drawable instanceof BitmapDrawable) {
            return ((q4.a) this.f18524d).i(n4.d.b(((BitmapDrawable) drawable).getBitmap(), (h4.d) this.f18523c), mVar);
        }
        if (drawable instanceof p4.c) {
            return ((q4.a) this.f18525f).i(g0Var, mVar);
        }
        return null;
    }

    public final InputStream j() {
        return ((EH) this.f18525f).vc().tN();
    }

    public final int k() {
        return ((EH) this.f18525f).tN();
    }

    public final a5.i l(String str) {
        List list = (List) this.f18523c;
        if (list != null && list.size() > 0) {
            for (a5.i iVar : (List) this.f18523c) {
                if (str.equals(iVar.a)) {
                    return iVar;
                }
            }
        }
        return null;
    }

    public final String n(String str) {
        if (l(str) != null) {
            return l(str).f197b;
        }
        return null;
    }

    public final i7.i o() {
        String str;
        if (((String) this.f18523c) == null) {
            str = " backendName";
        } else {
            str = "";
        }
        if (((f7.d) this.f18525f) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new i7.i((String) this.f18523c, (byte[]) this.f18524d, (f7.d) this.f18525f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final n7.b p() {
        String str;
        if (((Long) this.f18523c) == null) {
            str = " delta";
        } else {
            str = "";
        }
        if (((Long) this.f18524d) == null) {
            str = str.concat(" maxAllowedDelay");
        }
        if (((Set) this.f18525f) == null) {
            str = eb.j.k(str, " flags");
        }
        if (str.isEmpty()) {
            return new n7.b(((Long) this.f18523c).longValue(), ((Long) this.f18524d).longValue(), (Set) this.f18525f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final Bitmap q(BitmapFactory.Options options) {
        switch (this.f18522b) {
            case 14:
                return BitmapFactory.decodeStream(new w4.a(w4.b.c((ByteBuffer) this.f18523c)), null, options);
            case 15:
                n4.w wVar = (n4.w) ((com.bumptech.glide.load.data.n) this.f18523c).f9710c;
                wVar.reset();
                return BitmapFactory.decodeStream(wVar, null, options);
            default:
                return BitmapFactory.decodeFileDescriptor(((com.bumptech.glide.load.data.n) this.f18525f).a().getFileDescriptor(), null, options);
        }
    }

    public final void r(Runnable runnable) {
        ((v2.i) this.f18523c).execute(runnable);
    }

    public final x0 s(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return t(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final x0 t(Class modelClass, String key) {
        x0 viewModel;
        c1 c1Var;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        d1 d1Var = (d1) this.f18523c;
        d1Var.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        x0 x0Var = (x0) d1Var.a.get(key);
        if (modelClass.isInstance(x0Var)) {
            Object obj = (a1) this.f18524d;
            if (obj instanceof c1) {
                c1Var = (c1) obj;
            } else {
                c1Var = null;
            }
            if (c1Var != null) {
                Intrinsics.checkNotNull(x0Var);
                c1Var.c(x0Var);
            }
            Intrinsics.checkNotNull(x0Var, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return x0Var;
        }
        k1.e eVar = new k1.e((k1.c) this.f18525f);
        eVar.b(c6.m.f2666d, key);
        try {
            viewModel = ((a1) this.f18524d).b(modelClass, eVar);
        } catch (AbstractMethodError unused) {
            viewModel = ((a1) this.f18524d).a(modelClass);
        }
        d1 d1Var2 = (d1) this.f18523c;
        d1Var2.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        x0 x0Var2 = (x0) d1Var2.a.put(key, viewModel);
        if (x0Var2 != null) {
            x0Var2.onCleared();
        }
        return viewModel;
    }

    public final String toString() {
        switch (this.f18522b) {
            case 2:
                String str = "[ ";
                if (((t.i) this.f18523c) != null) {
                    for (int i10 = 0; i10 < 9; i10++) {
                        StringBuilder m10 = eb.j.m(str);
                        m10.append(((t.i) this.f18523c).f25134j[i10]);
                        m10.append(" ");
                        str = m10.toString();
                    }
                }
                StringBuilder n10 = eb.j.n(str, "] ");
                n10.append((t.i) this.f18523c);
                return n10.toString();
            case 19:
                return "Request{requestLine=" + ((a5.j) this.f18523c) + ", headers=" + ((List) this.f18524d) + ", extra=" + ((androidx.core.app.p0) this.f18525f) + AbstractJsonLexerKt.END_OBJ;
            default:
                return super.toString();
        }
    }

    public final long u() {
        Object obj = this.f18525f;
        if (((y7.m) obj) != null) {
            return ((y7.m) obj).getPosition();
        }
        return -1L;
    }

    public final y7.l v(Object... objArr) {
        Constructor constructor;
        synchronized (((AtomicBoolean) this.f18524d)) {
            if (((AtomicBoolean) this.f18524d).get()) {
                constructor = (Constructor) this.f18525f;
            } else {
                try {
                    try {
                        constructor = ((nb.a) ((y7.i) this.f18523c)).h();
                    } catch (Exception e2) {
                        throw new RuntimeException("Error instantiating extension", e2);
                    }
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f18524d).set(true);
                    constructor = (Constructor) this.f18525f;
                }
            }
        }
        if (constructor == null) {
            return null;
        }
        try {
            return (y7.l) constructor.newInstance(objArr);
        } catch (Exception e10) {
            throw new IllegalStateException("Unexpected error creating extractor", e10);
        }
    }

    public final ImageHeaderParser$ImageType w() {
        switch (this.f18522b) {
            case 14:
                return com.facebook.appevents.o.o((List) this.f18524d, w4.b.c((ByteBuffer) this.f18523c));
            case 15:
                List list = (List) this.f18525f;
                n4.w wVar = (n4.w) ((com.bumptech.glide.load.data.n) this.f18523c).f9710c;
                wVar.reset();
                return com.facebook.appevents.o.n((h4.h) this.f18524d, wVar, list);
            default:
                return com.facebook.appevents.o.p((List) this.f18524d, new e4.g((com.bumptech.glide.load.data.n) this.f18525f, (h4.h) this.f18523c));
        }
    }

    public final Location x(String str) {
        try {
            if (((LocationManager) this.f18524d).isProviderEnabled(str)) {
                return ((LocationManager) this.f18524d).getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e2) {
            Log.d("TwilightManager", "Failed to get last known location", e2);
            return null;
        }
    }

    public final u2.e y(String str) {
        u2.e eVar;
        v1.j0 j3 = v1.j0.j(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            j3.o(1);
        } else {
            j3.i(1, str);
        }
        ((v1.f0) this.f18523c).assertNotSuspendingTransaction();
        Cursor G = com.facebook.internal.i.G((v1.f0) this.f18523c, j3);
        try {
            int j10 = com.facebook.appevents.o.j(G, "work_spec_id");
            int j11 = com.facebook.appevents.o.j(G, "system_id");
            if (G.moveToFirst()) {
                eVar = new u2.e(G.getString(j10), G.getInt(j11));
            } else {
                eVar = null;
            }
            return eVar;
        } finally {
            G.close();
            j3.release();
        }
    }

    public Object z(z3.b bVar) {
        return this.f18525f;
    }

    public c(androidx.lifecycle.v provider) {
        this.f18522b = 6;
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f18523c = new androidx.lifecycle.x(provider);
        this.f18524d = new Handler();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(d1 store, f1 factory, int i10) {
        this(store, factory);
        this.f18522b = 7;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
    }

    public c(d1 store, a1 factory, k1.c defaultCreationExtras) {
        this.f18522b = 7;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        this.f18523c = store;
        this.f18524d = factory;
        this.f18525f = defaultCreationExtras;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(androidx.lifecycle.e1 r3, androidx.lifecycle.a1 r4) {
        /*
            r2 = this;
            r0 = 7
            r2.f18522b = r0
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r1 = "factory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            androidx.lifecycle.d1 r1 = r3.getViewModelStore()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r3 instanceof androidx.lifecycle.j
            if (r0 == 0) goto L1f
            androidx.lifecycle.j r3 = (androidx.lifecycle.j) r3
            k1.c r3 = r3.getDefaultViewModelCreationExtras()
            goto L21
        L1f:
            k1.a r3 = k1.a.f20211b
        L21:
            r2.<init>(r1, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.c.<init>(androidx.lifecycle.e1, androidx.lifecycle.a1):void");
    }

    public c(EH eh2, e5.b bVar) {
        this.f18522b = 20;
        this.f18525f = eh2;
        this.f18523c = new ArrayList();
        vc DSW = eh2.DSW();
        if (DSW != null) {
            for (int i10 = 0; i10 < DSW.YFl(); i10++) {
                ((List) this.f18523c).add(new a5.i(DSW.YFl(i10), DSW.Sg(i10)));
            }
        }
        this.f18524d = bVar;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i10) {
        this.f18522b = i10;
        this.f18523c = obj;
        this.f18524d = obj2;
        this.f18525f = obj3;
    }

    public /* synthetic */ c(m0.d dVar, Object obj, com.facebook.b bVar) {
        this.f18522b = 18;
        this.f18525f = dVar;
        this.f18523c = obj;
        this.f18524d = bVar;
    }

    public c(v1.f0 f0Var) {
        this.f18522b = 10;
        this.f18523c = f0Var;
        int i10 = 2;
        this.f18524d = new u2.b(this, f0Var, i10);
        this.f18525f = new u2.h(this, f0Var, i10);
    }

    public c(ExecutorService executorService) {
        this.f18522b = 11;
        this.f18524d = new Handler(Looper.getMainLooper());
        this.f18525f = new x2.b(this, 0);
        this.f18523c = new v2.i(executorService);
    }

    public c(m3.h0 h0Var) {
        this.f18522b = 12;
        this.f18523c = new z3.b();
        this.f18525f = h0Var;
    }

    public c(t.g gVar, t.g gVar2) {
        this.f18522b = 2;
        this.f18525f = gVar;
        this.f18524d = gVar2;
    }

    public c(String str) {
        this.f18522b = 27;
        s7.q0 q0Var = new s7.q0();
        q0Var.f24667k = str;
        this.f18523c = new s7.r0(q0Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d1 d1Var, f1 f1Var) {
        this(d1Var, f1Var, k1.a.f20211b);
        this.f18522b = 7;
    }

    public c(y7.o oVar) {
        this.f18522b = 28;
        this.f18523c = oVar;
    }

    public c(Context context, LocationManager locationManager) {
        this.f18522b = 1;
        this.f18525f = new t0();
        this.f18523c = context;
        this.f18524d = locationManager;
    }

    public c(w.f fVar) {
        this.f18522b = 3;
        this.f18523c = new ArrayList();
        this.f18524d = new x.b();
        this.f18525f = fVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(u7.p[] pVarArr) {
        this(pVarArr, new u7.v0(), new u7.x0());
        this.f18522b = 24;
    }

    public c(u7.p[] pVarArr, u7.v0 v0Var, u7.x0 x0Var) {
        this.f18522b = 24;
        u7.p[] pVarArr2 = new u7.p[pVarArr.length + 2];
        this.f18523c = pVarArr2;
        System.arraycopy(pVarArr, 0, pVarArr2, 0, pVarArr.length);
        this.f18524d = v0Var;
        this.f18525f = x0Var;
        u7.p[] pVarArr3 = (u7.p[]) this.f18523c;
        pVarArr3[pVarArr.length] = v0Var;
        pVarArr3[pVarArr.length + 1] = x0Var;
    }

    public c(h4.h hVar, w4.j jVar, List list) {
        this.f18522b = 15;
        com.bumptech.glide.c.l(hVar);
        this.f18524d = hVar;
        com.bumptech.glide.c.l(list);
        this.f18525f = list;
        this.f18523c = new com.bumptech.glide.load.data.n(jVar, hVar);
    }

    public c(int i10, int i11) {
        this.f18522b = i10;
        if (i10 == 12) {
            this.f18523c = new z3.b();
            this.f18525f = null;
            return;
        }
        if (i10 != 21 && i10 != 22) {
            this.f18523c = Collections.emptyList();
            this.f18524d = Collections.emptyList();
        }
    }

    public c(ParcelFileDescriptor parcelFileDescriptor, List list, h4.h hVar) {
        this.f18522b = 16;
        com.bumptech.glide.c.l(hVar);
        this.f18523c = hVar;
        com.bumptech.glide.c.l(list);
        this.f18524d = list;
        this.f18525f = new com.bumptech.glide.load.data.n(parcelFileDescriptor);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c() {
        this(29, (Object) null);
        this.f18522b = 29;
    }

    public c(nb.a aVar) {
        this.f18522b = 25;
        this.f18523c = aVar;
        this.f18524d = new AtomicBoolean(false);
    }

    public c(int i10) {
        this.f18522b = 5;
        this.f18523c = new String[i10];
        this.f18524d = new int[i10];
        this.f18525f = new int[i10];
    }
}
