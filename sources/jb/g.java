package jb;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Debug;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.SavedStateHandleAttacher;
import androidx.lifecycle.e1;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import com.facebook.f0;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.common.collect.r0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import kotlin.UByte;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import n0.l1;

/* loaded from: classes3.dex */
public abstract class g {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b, reason: collision with root package name */
    public static final b6.a f19884b = new b6.a();

    /* renamed from: c, reason: collision with root package name */
    public static final b6.a f19885c = new b6.a();

    /* renamed from: d, reason: collision with root package name */
    public static final b6.a f19886d = new b6.a();

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f19887e = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* renamed from: f, reason: collision with root package name */
    public static final i7.m f19888f = new i7.m(2);

    /* renamed from: g, reason: collision with root package name */
    public static final x.b f19889g = new x.b();

    public static q8.n A(int i10, n9.x xVar, String str) {
        int f10 = xVar.f();
        if (xVar.f() == 1684108385 && f10 >= 22) {
            xVar.H(10);
            int A = xVar.A();
            if (A > 0) {
                String i11 = eb.j.i("", A);
                int A2 = xVar.A();
                if (A2 > 0) {
                    i11 = i11 + "/" + A2;
                }
                return new q8.n(str, null, r0.o(i11));
            }
        }
        n9.o.f("MetadataUtil", "Failed to parse index/count attribute: " + w7.a.b(i10));
        return null;
    }

    public static q8.n B(int i10, n9.x xVar, String str) {
        int f10 = xVar.f();
        if (xVar.f() == 1684108385) {
            xVar.H(8);
            return new q8.n(str, null, r0.o(xVar.q(f10 - 16)));
        }
        n9.o.f("MetadataUtil", "Failed to parse text attribute: " + w7.a.b(i10));
        return null;
    }

    public static q8.j C(int i10, String str, n9.x xVar, boolean z10, boolean z11) {
        int D = D(xVar);
        if (z11) {
            D = Math.min(1, D);
        }
        if (D >= 0) {
            if (z10) {
                return new q8.n(str, null, r0.o(Integer.toString(D)));
            }
            return new q8.e(C.LANGUAGE_UNDETERMINED, str, Integer.toString(D));
        }
        n9.o.f("MetadataUtil", "Failed to parse uint8 attribute: " + w7.a.b(i10));
        return null;
    }

    public static int D(n9.x xVar) {
        xVar.H(4);
        if (xVar.f() == 1684108385) {
            xVar.H(8);
            return xVar.v();
        }
        n9.o.f("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static String E(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes);
            return k(messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            b6.a.f2288f.e("Could not create hashing algorithm: SHA-1, returning empty string.", e2);
            return "";
        }
    }

    public static void F(int i10, w.e eVar, x.m mVar, boolean z10) {
        float f10;
        float f11 = eVar.f26586d0;
        w.d dVar = eVar.I;
        int d10 = dVar.f26576f.d();
        w.d dVar2 = eVar.K;
        int d11 = dVar2.f26576f.d();
        int e2 = dVar.e() + d10;
        int e10 = d11 - dVar2.e();
        if (d10 == d11) {
            f11 = 0.5f;
        } else {
            d10 = e2;
            d11 = e10;
        }
        int r6 = eVar.r();
        int i11 = (d11 - d10) - r6;
        if (d10 > d11) {
            i11 = (d10 - d11) - r6;
        }
        if (i11 > 0) {
            f10 = (f11 * i11) + 0.5f;
        } else {
            f10 = f11 * i11;
        }
        int i12 = ((int) f10) + d10;
        int i13 = i12 + r6;
        if (d10 > d11) {
            i13 = i12 - r6;
        }
        eVar.J(i12, i13);
        l(i10 + 1, eVar, mVar, z10);
    }

    public static void G(int i10, w.e eVar, x.m mVar, w.e eVar2, boolean z10) {
        int r6;
        float f10 = eVar2.f26586d0;
        w.d dVar = eVar2.I;
        int e2 = dVar.e() + dVar.f26576f.d();
        w.d dVar2 = eVar2.K;
        int d10 = dVar2.f26576f.d() - dVar2.e();
        if (d10 >= e2) {
            int r10 = eVar2.r();
            if (eVar2.f26592g0 != 8) {
                int i11 = eVar2.f26612r;
                if (i11 == 2) {
                    if (eVar instanceof w.f) {
                        r6 = eVar.r();
                    } else {
                        r6 = eVar.T.r();
                    }
                    r10 = (int) (eVar2.f26586d0 * 0.5f * r6);
                } else if (i11 == 0) {
                    r10 = d10 - e2;
                }
                r10 = Math.max(eVar2.u, r10);
                int i12 = eVar2.f26615v;
                if (i12 > 0) {
                    r10 = Math.min(i12, r10);
                }
            }
            int i13 = e2 + ((int) ((f10 * ((d10 - e2) - r10)) + 0.5f));
            eVar2.J(i13, r10 + i13);
            l(i10 + 1, eVar2, mVar, z10);
        }
    }

    public static void H(int i10, w.e eVar, x.m mVar) {
        float f10;
        float f11 = eVar.f26588e0;
        w.d dVar = eVar.J;
        int d10 = dVar.f26576f.d();
        w.d dVar2 = eVar.L;
        int d11 = dVar2.f26576f.d();
        int e2 = dVar.e() + d10;
        int e10 = d11 - dVar2.e();
        if (d10 == d11) {
            f11 = 0.5f;
        } else {
            d10 = e2;
            d11 = e10;
        }
        int l10 = eVar.l();
        int i11 = (d11 - d10) - l10;
        if (d10 > d11) {
            i11 = (d10 - d11) - l10;
        }
        if (i11 > 0) {
            f10 = (f11 * i11) + 0.5f;
        } else {
            f10 = f11 * i11;
        }
        int i12 = (int) f10;
        int i13 = d10 + i12;
        int i14 = i13 + l10;
        if (d10 > d11) {
            i13 = d10 - i12;
            i14 = i13 - l10;
        }
        eVar.K(i13, i14);
        K(i10 + 1, eVar, mVar);
    }

    public static void I(int i10, w.e eVar, x.m mVar, w.e eVar2) {
        int l10;
        float f10 = eVar2.f26588e0;
        w.d dVar = eVar2.J;
        int e2 = dVar.e() + dVar.f26576f.d();
        w.d dVar2 = eVar2.L;
        int d10 = dVar2.f26576f.d() - dVar2.e();
        if (d10 >= e2) {
            int l11 = eVar2.l();
            if (eVar2.f26592g0 != 8) {
                int i11 = eVar2.f26613s;
                if (i11 == 2) {
                    if (eVar instanceof w.f) {
                        l10 = eVar.l();
                    } else {
                        l10 = eVar.T.l();
                    }
                    l11 = (int) (f10 * 0.5f * l10);
                } else if (i11 == 0) {
                    l11 = d10 - e2;
                }
                l11 = Math.max(eVar2.f26617x, l11);
                int i12 = eVar2.f26618y;
                if (i12 > 0) {
                    l11 = Math.min(i12, l11);
                }
            }
            int i13 = e2 + ((int) ((f10 * ((d10 - e2) - l11)) + 0.5f));
            eVar2.K(i13, l11 + i13);
            K(i10 + 1, eVar2, mVar);
        }
    }

    public static String J(FileInputStream fileInputStream) {
        Scanner useDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
        if (useDelimiter.hasNext()) {
            return useDelimiter.next();
        }
        return "";
    }

    public static void K(int i10, w.e eVar, x.m mVar) {
        w.d dVar;
        boolean z10;
        w.d dVar2;
        w.d dVar3;
        boolean z11;
        w.d dVar4;
        w.d dVar5;
        if (eVar.f26605n) {
            return;
        }
        if (!(eVar instanceof w.f) && eVar.A() && b(eVar)) {
            w.f.V(eVar, mVar, new x.b());
        }
        w.d j3 = eVar.j(w.c.TOP);
        w.d j10 = eVar.j(w.c.BOTTOM);
        int d10 = j3.d();
        int d11 = j10.d();
        HashSet hashSet = j3.a;
        if (hashSet != null && j3.f26573c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                w.d dVar6 = (w.d) it.next();
                w.e eVar2 = dVar6.f26574d;
                int i11 = i10 + 1;
                boolean b3 = b(eVar2);
                if (eVar2.A() && b3) {
                    w.f.V(eVar2, mVar, new x.b());
                }
                w.d dVar7 = eVar2.J;
                w.d dVar8 = eVar2.L;
                if ((dVar6 == dVar7 && (dVar5 = dVar8.f26576f) != null && dVar5.f26573c) || (dVar6 == dVar8 && (dVar4 = dVar7.f26576f) != null && dVar4.f26573c)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i12 = eVar2.f26610p0[1];
                if (i12 == 3 && !b3) {
                    if (i12 == 3 && eVar2.f26618y >= 0 && eVar2.f26617x >= 0 && (eVar2.f26592g0 == 8 || (eVar2.f26613s == 0 && eVar2.W == 0.0f))) {
                        if (!eVar2.z() && !eVar2.F && z11 && !eVar2.z()) {
                            I(i11, eVar, mVar, eVar2);
                        }
                    }
                } else if (!eVar2.A()) {
                    if (dVar6 == dVar7 && dVar8.f26576f == null) {
                        int e2 = dVar7.e() + d10;
                        eVar2.K(e2, eVar2.l() + e2);
                        K(i11, eVar2, mVar);
                    } else if (dVar6 == dVar8 && dVar7.f26576f == null) {
                        int e10 = d10 - dVar8.e();
                        eVar2.K(e10 - eVar2.l(), e10);
                        K(i11, eVar2, mVar);
                    } else if (z11 && !eVar2.z()) {
                        H(i11, eVar2, mVar);
                    }
                }
            }
        }
        if (eVar instanceof w.i) {
            return;
        }
        HashSet hashSet2 = j10.a;
        if (hashSet2 != null && j10.f26573c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                w.d dVar9 = (w.d) it2.next();
                w.e eVar3 = dVar9.f26574d;
                int i13 = i10 + 1;
                boolean b10 = b(eVar3);
                if (eVar3.A() && b10) {
                    w.f.V(eVar3, mVar, new x.b());
                }
                w.d dVar10 = eVar3.J;
                w.d dVar11 = eVar3.L;
                if ((dVar9 == dVar10 && (dVar3 = dVar11.f26576f) != null && dVar3.f26573c) || (dVar9 == dVar11 && (dVar2 = dVar10.f26576f) != null && dVar2.f26573c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i14 = eVar3.f26610p0[1];
                if (i14 == 3 && !b10) {
                    if (i14 == 3 && eVar3.f26618y >= 0 && eVar3.f26617x >= 0) {
                        if (eVar3.f26592g0 != 8) {
                            if (eVar3.f26613s == 0) {
                                if (eVar3.W == 0.0f) {
                                }
                            }
                        }
                        if (!eVar3.z() && !eVar3.F && z10 && !eVar3.z()) {
                            I(i13, eVar, mVar, eVar3);
                        }
                    }
                } else if (!eVar3.A()) {
                    if (dVar9 == dVar10 && dVar11.f26576f == null) {
                        int e11 = dVar10.e() + d11;
                        eVar3.K(e11, eVar3.l() + e11);
                        K(i13, eVar3, mVar);
                    } else if (dVar9 == dVar11 && dVar10.f26576f == null) {
                        int e12 = d11 - dVar11.e();
                        eVar3.K(e12 - eVar3.l(), e12);
                        K(i13, eVar3, mVar);
                    } else if (z10 && !eVar3.z()) {
                        H(i13, eVar3, mVar);
                    }
                }
            }
        }
        w.d j11 = eVar.j(w.c.BASELINE);
        if (j11.a != null && j11.f26573c) {
            int d12 = j11.d();
            Iterator it3 = j11.a.iterator();
            while (it3.hasNext()) {
                w.d dVar12 = (w.d) it3.next();
                w.e eVar4 = dVar12.f26574d;
                int i15 = i10 + 1;
                boolean b11 = b(eVar4);
                if (eVar4.A() && b11) {
                    w.f.V(eVar4, mVar, new x.b());
                }
                if (eVar4.f26610p0[1] != 3 || b11) {
                    if (!eVar4.A() && dVar12 == (dVar = eVar4.M)) {
                        int e13 = dVar12.e() + d12;
                        if (eVar4.E) {
                            int i16 = e13 - eVar4.f26580a0;
                            int i17 = eVar4.V + i16;
                            eVar4.Z = i16;
                            eVar4.J.l(i16);
                            eVar4.L.l(i17);
                            dVar.l(e13);
                            eVar4.f26601l = true;
                        }
                        K(i15, eVar4, mVar);
                    }
                }
            }
        }
        eVar.f26605n = true;
    }

    public static synchronized long a(Context context) {
        long j3;
        synchronized (g.class) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            j3 = memoryInfo.totalMem;
        }
        return j3;
    }

    public static boolean b(w.e eVar) {
        w.f fVar;
        boolean z10;
        boolean z11;
        int[] iArr = eVar.f26610p0;
        int i10 = iArr[0];
        int i11 = iArr[1];
        w.e eVar2 = eVar.T;
        if (eVar2 != null) {
            fVar = (w.f) eVar2;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            int i12 = fVar.f26610p0[0];
        }
        if (fVar != null) {
            int i13 = fVar.f26610p0[1];
        }
        if (i10 != 1 && !eVar.B() && i10 != 2 && ((i10 != 3 || eVar.f26612r != 0 || eVar.W != 0.0f || !eVar.u(0)) && (i10 != 3 || eVar.f26612r != 1 || !eVar.v(0, eVar.r())))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i11 != 1 && !eVar.C() && i11 != 2 && ((i11 != 3 || eVar.f26613s != 0 || eVar.W != 0.0f || !eVar.u(1)) && (i11 != 3 || eVar.f26613s != 1 || !eVar.v(1, eVar.l())))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (eVar.W > 0.0f && (z10 || z11)) {
            return true;
        }
        if (!z10 || !z11) {
            return false;
        }
        return true;
    }

    public static void c(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                b6.a.f2288f.e(str, e2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        if (r5.isEmpty() == true) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.lifecycle.q0 d(k1.e r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            b6.a r1 = jb.g.f19884b
            java.lang.Object r1 = r7.a(r1)
            y1.f r1 = (y1.f) r1
            if (r1 == 0) goto L9d
            b6.a r2 = jb.g.f19885c
            java.lang.Object r2 = r7.a(r2)
            androidx.lifecycle.e1 r2 = (androidx.lifecycle.e1) r2
            if (r2 == 0) goto L95
            b6.a r3 = jb.g.f19886d
            java.lang.Object r3 = r7.a(r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            c6.m r4 = c6.m.f2666d
            java.lang.Object r7 = r7.a(r4)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L8d
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            y1.d r0 = r1.getSavedStateRegistry()
            y1.c r0 = r0.b()
            boolean r1 = r0 instanceof androidx.lifecycle.s0
            r4 = 0
            if (r1 == 0) goto L3e
            androidx.lifecycle.s0 r0 = (androidx.lifecycle.s0) r0
            goto L3f
        L3e:
            r0 = r4
        L3f:
            if (r0 == 0) goto L85
            androidx.lifecycle.t0 r1 = i(r2)
            java.util.LinkedHashMap r2 = r1.a
            java.lang.Object r2 = r2.get(r7)
            androidx.lifecycle.q0 r2 = (androidx.lifecycle.q0) r2
            if (r2 != 0) goto L84
            java.lang.Class[] r2 = androidx.lifecycle.q0.f1813f
            java.lang.String r2 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            r0.b()
            android.os.Bundle r2 = r0.f1821c
            if (r2 == 0) goto L62
            android.os.Bundle r2 = r2.getBundle(r7)
            goto L63
        L62:
            r2 = r4
        L63:
            android.os.Bundle r5 = r0.f1821c
            if (r5 == 0) goto L6a
            r5.remove(r7)
        L6a:
            android.os.Bundle r5 = r0.f1821c
            if (r5 == 0) goto L76
            boolean r5 = r5.isEmpty()
            r6 = 1
            if (r5 != r6) goto L76
            goto L77
        L76:
            r6 = 0
        L77:
            if (r6 == 0) goto L7b
            r0.f1821c = r4
        L7b:
            androidx.lifecycle.q0 r2 = ac.e.b(r2, r3)
            java.util.LinkedHashMap r0 = r1.a
            r0.put(r7, r2)
        L84:
            return r2
        L85:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call"
            r7.<init>(r0)
            throw r7
        L8d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "CreationExtras must have a value by `VIEW_MODEL_KEY`"
            r7.<init>(r0)
            throw r7
        L95:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`"
            r7.<init>(r0)
            throw r7
        L9d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.g.d(k1.e):androidx.lifecycle.q0");
    }

    public static final void e(y1.f fVar) {
        boolean z10;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        androidx.lifecycle.o oVar = ((androidx.lifecycle.x) fVar.getLifecycle()).f1835d;
        if (oVar != androidx.lifecycle.o.INITIALIZED && oVar != androidx.lifecycle.o.CREATED) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (fVar.getSavedStateRegistry().b() == null) {
                s0 s0Var = new s0(fVar.getSavedStateRegistry(), (e1) fVar);
                fVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", s0Var);
                fVar.getLifecycle().a(new SavedStateHandleAttacher(s0Var));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int f() {
        boolean z10;
        boolean m10 = m();
        ?? r02 = m10;
        if (n()) {
            r02 = (m10 ? 1 : 0) | 2;
        }
        if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return r02 | 4;
        }
        return r02;
    }

    public static String g(Context context) {
        int h10 = h(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (h10 == 0) {
            h10 = h(context, "com.crashlytics.android.build_id", "string");
        }
        if (h10 != 0) {
            return context.getResources().getString(h10);
        }
        return null;
    }

    public static int h(Context context, String str, String str2) {
        String packageName;
        Resources resources = context.getResources();
        int i10 = context.getApplicationContext().getApplicationInfo().icon;
        if (i10 > 0) {
            try {
                packageName = context.getResources().getResourcePackageName(i10);
                if ("android".equals(packageName)) {
                    packageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
        } else {
            packageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, packageName);
    }

    public static final t0 i(e1 e1Var) {
        Intrinsics.checkNotNullParameter(e1Var, "<this>");
        f0 f0Var = new f0(0);
        l1 initializer = l1.f22311g;
        KClass clazz = Reflection.getOrCreateKotlinClass(t0.class);
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        ArrayList arrayList = f0Var.a;
        arrayList.add(new k1.f(JvmClassMappingKt.getJavaClass(clazz), initializer));
        k1.f[] fVarArr = (k1.f[]) arrayList.toArray(new k1.f[0]);
        return (t0) new h.c(e1Var, new k1.d((k1.f[]) Arrays.copyOf(fVarArr, fVarArr.length))).t(t0.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static String k(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = bArr[i10] & UByte.MAX_VALUE;
            int i12 = i10 * 2;
            char[] cArr2 = a;
            cArr[i12] = cArr2[i11 >>> 4];
            cArr[i12 + 1] = cArr2[i11 & 15];
        }
        return new String(cArr);
    }

    public static void l(int i10, w.e eVar, x.m mVar, boolean z10) {
        boolean z11;
        w.d dVar;
        w.d dVar2;
        Iterator it;
        boolean z12;
        w.d dVar3;
        w.d dVar4;
        if (eVar.f26603m) {
            return;
        }
        if (!(eVar instanceof w.f) && eVar.A() && b(eVar)) {
            w.f.V(eVar, mVar, new x.b());
        }
        w.d j3 = eVar.j(w.c.LEFT);
        w.d j10 = eVar.j(w.c.RIGHT);
        int d10 = j3.d();
        int d11 = j10.d();
        HashSet hashSet = j3.a;
        if (hashSet != null && j3.f26573c) {
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                w.d dVar5 = (w.d) it2.next();
                w.e eVar2 = dVar5.f26574d;
                int i11 = i10 + 1;
                boolean b3 = b(eVar2);
                if (eVar2.A() && b3) {
                    w.f.V(eVar2, mVar, new x.b());
                }
                w.d dVar6 = eVar2.I;
                w.d dVar7 = eVar2.K;
                if ((dVar5 == dVar6 && (dVar4 = dVar7.f26576f) != null && dVar4.f26573c) || (dVar5 == dVar7 && (dVar3 = dVar6.f26576f) != null && dVar3.f26573c)) {
                    it = it2;
                    z12 = true;
                } else {
                    it = it2;
                    z12 = false;
                }
                int i12 = eVar2.f26610p0[0];
                if (i12 == 3 && !b3) {
                    if (i12 == 3 && eVar2.f26615v >= 0 && eVar2.u >= 0 && ((eVar2.f26592g0 == 8 || (eVar2.f26612r == 0 && eVar2.W == 0.0f)) && !eVar2.y() && !eVar2.F && z12 && !eVar2.y())) {
                        G(i11, eVar, mVar, eVar2, z10);
                    }
                } else if (!eVar2.A()) {
                    if (dVar5 == dVar6 && dVar7.f26576f == null) {
                        int e2 = dVar6.e() + d10;
                        eVar2.J(e2, eVar2.r() + e2);
                        l(i11, eVar2, mVar, z10);
                    } else if (dVar5 == dVar7 && dVar6.f26576f == null) {
                        int e10 = d10 - dVar7.e();
                        eVar2.J(e10 - eVar2.r(), e10);
                        l(i11, eVar2, mVar, z10);
                    } else if (z12 && !eVar2.y()) {
                        F(i11, eVar2, mVar, z10);
                    }
                }
                it2 = it;
            }
        }
        if (eVar instanceof w.i) {
            return;
        }
        HashSet hashSet2 = j10.a;
        if (hashSet2 != null && j10.f26573c) {
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                w.d dVar8 = (w.d) it3.next();
                w.e eVar3 = dVar8.f26574d;
                int i13 = i10 + 1;
                boolean b10 = b(eVar3);
                if (eVar3.A() && b10) {
                    w.f.V(eVar3, mVar, new x.b());
                }
                w.d dVar9 = eVar3.I;
                w.d dVar10 = eVar3.K;
                if ((dVar8 == dVar9 && (dVar2 = dVar10.f26576f) != null && dVar2.f26573c) || (dVar8 == dVar10 && (dVar = dVar9.f26576f) != null && dVar.f26573c)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i14 = eVar3.f26610p0[0];
                if (i14 == 3 && !b10) {
                    if (i14 == 3 && eVar3.f26615v >= 0 && eVar3.u >= 0) {
                        if (eVar3.f26592g0 != 8) {
                            if (eVar3.f26612r == 0) {
                                if (eVar3.W == 0.0f) {
                                }
                            }
                        }
                        if (!eVar3.y() && !eVar3.F && z11 && !eVar3.y()) {
                            G(i13, eVar, mVar, eVar3, z10);
                        }
                    }
                } else if (!eVar3.A()) {
                    if (dVar8 == dVar9 && dVar10.f26576f == null) {
                        int e11 = dVar9.e() + d11;
                        eVar3.J(e11, eVar3.r() + e11);
                        l(i13, eVar3, mVar, z10);
                    } else if (dVar8 == dVar10 && dVar9.f26576f == null) {
                        int e12 = d11 - dVar10.e();
                        eVar3.J(e12 - eVar3.r(), e12);
                        l(i13, eVar3, mVar, z10);
                    } else if (z11 && !eVar3.y()) {
                        F(i13, eVar3, mVar, z10);
                    }
                }
            }
        }
        eVar.f26603m = true;
    }

    public static boolean m() {
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            if (!str.contains("goldfish") && !str.contains("ranchu")) {
                return false;
            }
        }
        return true;
    }

    public static boolean n() {
        boolean m10 = m();
        String str = Build.TAGS;
        if ((!m10 && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (!m10 && file.exists()) {
            return true;
        }
        return false;
    }

    public static q8.e y(int i10, n9.x xVar) {
        int f10 = xVar.f();
        if (xVar.f() == 1684108385) {
            xVar.H(8);
            String q10 = xVar.q(f10 - 16);
            return new q8.e(C.LANGUAGE_UNDETERMINED, q10, q10);
        }
        n9.o.f("MetadataUtil", "Failed to parse comment attribute: " + w7.a.b(i10));
        return null;
    }

    public static q8.a z(n9.x xVar) {
        String str;
        int f10 = xVar.f();
        if (xVar.f() == 1684108385) {
            int f11 = xVar.f() & ViewCompat.MEASURED_SIZE_MASK;
            if (f11 == 13) {
                str = "image/jpeg";
            } else if (f11 == 14) {
                str = "image/png";
            } else {
                str = null;
            }
            if (str == null) {
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.v("Unrecognized cover art flags: ", f11, "MetadataUtil");
                return null;
            }
            xVar.H(4);
            int i10 = f10 - 16;
            byte[] bArr = new byte[i10];
            xVar.d(bArr, 0, i10);
            return new q8.a(str, null, 3, bArr);
        }
        n9.o.f("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public abstract Object j(t1.a aVar, Continuation continuation);

    public void o() {
    }

    public void p() {
    }

    public void q(LoadAdError loadAdError) {
    }

    public void r(AdError adError) {
    }

    public void s() {
    }

    public void t(InterstitialAd interstitialAd) {
    }

    public void u() {
    }

    public void v(e3.b bVar) {
    }

    public void w() {
    }

    public void x(NativeAd nativeAd) {
    }
}
