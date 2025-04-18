package h3;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import androidx.activity.result.i;
import c4.d;
import com.bumptech.glide.manager.p;
import com.google.common.collect.e2;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import g4.q;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import k9.o;
import ki.i0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import m9.k;
import m9.w;
import n9.h0;
import ob.c;
import s7.r0;
import u7.e;
import u7.o0;
import v8.u0;
import w4.f;
import x7.a0;
import x7.z;
import zh.g;
import zh.j;

/* loaded from: classes.dex */
public final class a implements f, p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18721b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18722c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f18723d;

    /* renamed from: f, reason: collision with root package name */
    public Object f18724f;

    /* renamed from: g, reason: collision with root package name */
    public Object f18725g;

    public a(j this$0, g entry) {
        this.f18721b = 8;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f18725g = this$0;
        this.f18723d = entry;
        this.f18724f = entry.f28790e ? null : new boolean[this$0.f28808f];
    }

    public static void d(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f10 = fArr2[10];
        float f11 = fArr2[8];
        float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        float f12 = fArr2[10];
        fArr[0] = f12 / sqrt;
        float f13 = fArr2[8];
        fArr[2] = f13 / sqrt;
        fArr[8] = (-f13) / sqrt;
        fArr[10] = f12 / sqrt;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007f A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:5:0x002a, B:6:0x0035, B:8:0x003c, B:10:0x0044, B:23:0x004e, B:32:0x007f, B:41:0x0096, B:42:0x0061, B:44:0x0065, B:46:0x006f, B:48:0x0075), top: B:22:0x004e, outer: #2, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] h(m9.k r8, java.lang.String r9, byte[] r10, java.util.Map r11) {
        /*
            m9.v0 r0 = new m9.v0
            m9.l r8 = r8.createDataSource()
            r0.<init>(r8)
            m9.o r8 = new m9.o
            r8.<init>()
            android.net.Uri r9 = android.net.Uri.parse(r9)
            r8.a = r9
            r8.f21699e = r11
            r9 = 2
            r8.f21697c = r9
            r8.f21698d = r10
            r9 = 1
            r8.f21703i = r9
            m9.p r2 = r8.a()
            r8 = 0
            r11 = r8
            r10 = r2
        L25:
            m9.n r1 = new m9.n     // Catch: java.lang.Exception -> L9d
            r1.<init>(r0, r10)     // Catch: java.lang.Exception -> L9d
            int r3 = n9.h0.a     // Catch: java.lang.Throwable -> L40 m9.f0 -> L42
            r3 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L40 m9.f0 -> L42
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L40 m9.f0 -> L42
            r4.<init>()     // Catch: java.lang.Throwable -> L40 m9.f0 -> L42
        L35:
            int r5 = r1.read(r3)     // Catch: java.lang.Throwable -> L40 m9.f0 -> L42
            r6 = -1
            if (r5 == r6) goto L44
            r4.write(r3, r8, r5)     // Catch: java.lang.Throwable -> L40 m9.f0 -> L42
            goto L35
        L40:
            r8 = move-exception
            goto L97
        L42:
            r3 = move-exception
            goto L4e
        L44:
            byte[] r8 = r4.toByteArray()     // Catch: java.lang.Throwable -> L40 m9.f0 -> L42
            int r9 = n9.h0.a     // Catch: java.lang.Exception -> L9d
            r1.close()     // Catch: java.io.IOException -> L4d java.lang.Exception -> L9d
        L4d:
            return r8
        L4e:
            int r4 = r3.f21658f     // Catch: java.lang.Throwable -> L40
            r5 = 307(0x133, float:4.3E-43)
            if (r4 == r5) goto L58
            r5 = 308(0x134, float:4.32E-43)
            if (r4 != r5) goto L5d
        L58:
            r4 = 5
            if (r11 >= r4) goto L5d
            r4 = r9
            goto L5e
        L5d:
            r4 = r8
        L5e:
            if (r4 != 0) goto L61
            goto L7c
        L61:
            java.util.Map r4 = r3.f21659g     // Catch: java.lang.Throwable -> L40
            if (r4 == 0) goto L7c
            java.lang.String r5 = "Location"
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L40
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L40
            if (r4 == 0) goto L7c
            boolean r5 = r4.isEmpty()     // Catch: java.lang.Throwable -> L40
            if (r5 != 0) goto L7c
            java.lang.Object r4 = r4.get(r8)     // Catch: java.lang.Throwable -> L40
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L40
            goto L7d
        L7c:
            r4 = 0
        L7d:
            if (r4 == 0) goto L96
            int r11 = r11 + 1
            m9.o r3 = new m9.o     // Catch: java.lang.Throwable -> L40
            r3.<init>(r10)     // Catch: java.lang.Throwable -> L40
            android.net.Uri r10 = android.net.Uri.parse(r4)     // Catch: java.lang.Throwable -> L40
            r3.a = r10     // Catch: java.lang.Throwable -> L40
            m9.p r10 = r3.a()     // Catch: java.lang.Throwable -> L40
            int r3 = n9.h0.a     // Catch: java.lang.Exception -> L9d
            r1.close()     // Catch: java.io.IOException -> L25 java.lang.Exception -> L9d
            goto L25
        L96:
            throw r3     // Catch: java.lang.Throwable -> L40
        L97:
            int r9 = n9.h0.a     // Catch: java.lang.Exception -> L9d
            r1.close()     // Catch: java.io.IOException -> L9c java.lang.Exception -> L9d
        L9c:
            throw r8     // Catch: java.lang.Exception -> L9d
        L9d:
            r8 = move-exception
            r7 = r8
            x7.h0 r8 = new x7.h0
            android.net.Uri r3 = r0.f21778c
            r3.getClass()
            java.util.Map r4 = r0.getResponseHeaders()
            long r5 = r0.f21777b
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.a.h(m9.k, java.lang.String, byte[], java.util.Map):byte[]");
    }

    public final void a() {
        switch (this.f18721b) {
            case 2:
                d.d((d) this.f18725g, this, false);
                return;
            default:
                j jVar = (j) this.f18725g;
                synchronized (jVar) {
                    if (!this.f18722c) {
                        if (Intrinsics.areEqual(((g) this.f18723d).f28792g, this)) {
                            jVar.g(this, false);
                        }
                        this.f18722c = true;
                        Unit unit = Unit.INSTANCE;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
                return;
        }
    }

    public final boolean b(r0 r0Var, e eVar) {
        boolean canBeSpatialized;
        boolean equals = MimeTypes.AUDIO_E_AC3_JOC.equals(r0Var.f24723n);
        int i10 = r0Var.A;
        if (equals && i10 == 16) {
            i10 = 12;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(h0.m(i10));
        int i11 = r0Var.B;
        if (i11 != -1) {
            channelMask.setSampleRate(i11);
        }
        canBeSpatialized = ((Spatializer) this.f18723d).canBeSpatialized((AudioAttributes) eVar.a().f20640c, channelMask.build());
        return canBeSpatialized;
    }

    public final void c() {
        switch (this.f18721b) {
            case 2:
                d.d((d) this.f18725g, this, true);
                this.f18722c = true;
                return;
            default:
                j jVar = (j) this.f18725g;
                synchronized (jVar) {
                    if (!this.f18722c) {
                        if (Intrinsics.areEqual(((g) this.f18723d).f28792g, this)) {
                            jVar.g(this, true);
                        }
                        this.f18722c = true;
                        Unit unit = Unit.INSTANCE;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
                return;
        }
    }

    public final void e() {
        Object obj = this.f18723d;
        if (Intrinsics.areEqual(((g) obj).f28792g, this)) {
            Object obj2 = this.f18725g;
            if (((j) obj2).f28818p) {
                ((j) obj2).g(this, false);
            } else {
                ((g) obj).f28791f = true;
            }
        }
    }

    public final void f(o oVar, Looper looper) {
        if (((Spatializer.OnSpatializerStateChangedListener) this.f18725g) == null && ((Handler) this.f18724f) == null) {
            this.f18725g = new k9.j(oVar);
            Handler handler = new Handler(looper);
            this.f18724f = handler;
            ((Spatializer) this.f18723d).addOnSpatializerStateChangedListener(new o0(1, handler), (Spatializer.OnSpatializerStateChangedListener) this.f18725g);
        }
    }

    public final byte[] g(UUID uuid, z zVar) {
        String str;
        String str2 = zVar.f27499b;
        if (this.f18722c || TextUtils.isEmpty(str2)) {
            str2 = (String) this.f18723d;
        }
        if (!TextUtils.isEmpty(str2)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = s7.j.f24443e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else if (s7.j.f24441c.equals(uuid)) {
                str = "application/json";
            } else {
                str = "application/octet-stream";
            }
            hashMap.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (((Map) this.f18725g)) {
                hashMap.putAll((Map) this.f18725g);
            }
            return h((k) this.f18724f, str2, zVar.a, hashMap);
        }
        m9.o oVar = new m9.o();
        oVar.a = Uri.EMPTY;
        throw new x7.h0(oVar.a(), Uri.EMPTY, e2.f11936i, 0L, new IllegalStateException("No license URL"));
    }

    @Override // w4.f
    public final Object get() {
        if (!this.f18722c) {
            Trace.beginSection("Glide registry");
            this.f18722c = true;
            try {
                return d6.g.k((com.bumptech.glide.b) this.f18723d, (List) this.f18724f);
            } finally {
                this.f18722c = false;
                Trace.endSection();
            }
        }
        throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
    }

    public final byte[] i(a0 a0Var) {
        return h((k) this.f18724f, a0Var.f27411b + "&signedRequest=" + h0.l(a0Var.a), null, Collections.emptyMap());
    }

    public final File j() {
        File file;
        synchronized (((d) this.f18725g)) {
            Object obj = this.f18723d;
            if (((c4.b) obj).f2586f == this) {
                if (!((c4.b) obj).f2585e) {
                    ((boolean[]) this.f18724f)[0] = true;
                }
                file = ((c4.b) obj).f2584d[0];
                ((d) this.f18725g).f2594b.mkdirs();
            } else {
                throw new IllegalStateException();
            }
        }
        return file;
    }

    public final i0 k(int i10) {
        j jVar = (j) this.f18725g;
        synchronized (jVar) {
            if (!this.f18722c) {
                if (!Intrinsics.areEqual(((g) this.f18723d).f28792g, this)) {
                    return new ki.f();
                }
                if (!((g) this.f18723d).f28790e) {
                    boolean[] zArr = (boolean[]) this.f18724f;
                    Intrinsics.checkNotNull(zArr);
                    zArr[i10] = true;
                }
                try {
                    return new zh.k(((fi.a) jVar.f28805b).e((File) ((g) this.f18723d).f28789d.get(i10)), new p1.a(5, jVar, this));
                } catch (FileNotFoundException unused) {
                    return new ki.f();
                }
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public a(String str) {
        this.f18721b = 0;
        this.f18723d = "";
        this.f18724f = "";
        this.f18725g = "";
        this.f18722c = true;
        this.f18723d = str;
    }

    public a() {
        this.f18721b = 6;
        this.f18723d = new float[16];
        this.f18724f = new float[16];
        this.f18725g = new i();
    }

    public a(String str, boolean z10, w wVar) {
        this.f18721b = 4;
        u0.d((z10 && TextUtils.isEmpty(str)) ? false : true);
        this.f18724f = wVar;
        this.f18723d = str;
        this.f18722c = z10;
        this.f18725g = new HashMap();
    }

    public a(com.bumptech.glide.b bVar, ArrayList arrayList, s.a aVar) {
        this.f18721b = 1;
        this.f18723d = bVar;
        this.f18724f = arrayList;
        this.f18725g = aVar;
    }

    public a(q qVar, com.bumptech.glide.manager.o oVar) {
        this.f18721b = 3;
        this.f18725g = new s2.e(this, 1);
        this.f18724f = qVar;
        this.f18723d = oVar;
    }

    public a(c cVar, boolean z10) {
        this.f18721b = 7;
        this.f18725g = cVar;
        this.f18724f = new AtomicReference(null);
        this.f18722c = z10;
        this.f18723d = new AtomicMarkableReference(new lb.d(z10 ? 8192 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY), false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(d dVar, c4.b bVar, int i10) {
        this(dVar, bVar);
        this.f18721b = 2;
    }

    public a(d dVar, c4.b bVar) {
        this.f18721b = 2;
        this.f18725g = dVar;
        this.f18723d = bVar;
        this.f18724f = bVar.f2585e ? null : new boolean[dVar.f2600i];
    }

    public a(Spatializer spatializer) {
        int immersiveAudioLevel;
        this.f18721b = 5;
        this.f18723d = spatializer;
        immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
        this.f18722c = immersiveAudioLevel != 0;
    }
}
