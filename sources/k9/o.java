package k9;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.text.TextUtils;
import android.util.Pair;
import com.google.common.collect.y1;
import com.google.common.collect.z1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import n9.h0;
import s7.n2;
import s7.o0;
import s7.r0;
import v8.i1;
import v8.j1;

/* loaded from: classes3.dex */
public final class o extends t implements n2 {

    /* renamed from: j, reason: collision with root package name */
    public static final y1 f20461j = y1.a(new k0.b(11));

    /* renamed from: k, reason: collision with root package name */
    public static final y1 f20462k = y1.a(new k0.b(12));

    /* renamed from: c, reason: collision with root package name */
    public final Object f20463c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f20464d;

    /* renamed from: e, reason: collision with root package name */
    public final v5.a f20465e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f20466f;

    /* renamed from: g, reason: collision with root package name */
    public final h f20467g;

    /* renamed from: h, reason: collision with root package name */
    public final h3.a f20468h;

    /* renamed from: i, reason: collision with root package name */
    public u7.e f20469i;

    public o(Context context) {
        Context context2;
        boolean z10;
        Spatializer spatializer;
        v5.a aVar = new v5.a();
        int i10 = h.S;
        h hVar = new h(new g(context));
        this.f20463c = new Object();
        h3.a aVar2 = null;
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.f20464d = context2;
        this.f20465e = aVar;
        this.f20467g = hVar;
        this.f20469i = u7.e.f25551i;
        if (context != null && h0.G(context)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f20466f = z10;
        if (!z10 && context != null && h0.a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            if (audioManager != null) {
                spatializer = audioManager.getSpatializer();
                aVar2 = new h3.a(spatializer);
            }
            this.f20468h = aVar2;
        }
        if (hVar.L && context == null) {
            n9.o.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void a(j1 j1Var, h hVar, HashMap hashMap) {
        for (int i10 = 0; i10 < j1Var.f26181b; i10++) {
            u uVar = (u) hVar.A.get(j1Var.a(i10));
            if (uVar != null) {
                i1 i1Var = uVar.f20480b;
                u uVar2 = (u) hashMap.get(Integer.valueOf(i1Var.f26165d));
                if (uVar2 == null || (uVar2.f20481c.isEmpty() && !uVar.f20481c.isEmpty())) {
                    hashMap.put(Integer.valueOf(i1Var.f26165d), uVar);
                }
            }
        }
    }

    public static int b(r0 r0Var, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(r0Var.f24714d)) {
            return 4;
        }
        String e2 = e(str);
        String e10 = e(r0Var.f24714d);
        if (e10 != null && e2 != null) {
            if (!e10.startsWith(e2) && !e2.startsWith(e10)) {
                int i10 = h0.a;
                if (!e10.split("-", 2)[0].equals(e2.split("-", 2)[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        }
        if (!z10 || e10 != null) {
            return 0;
        }
        return 1;
    }

    public static boolean c(int i10, boolean z10) {
        int i11 = i10 & 7;
        return i11 == 4 || (z10 && i11 == 3);
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    public static Pair f(int i10, s sVar, int[][][] iArr, l lVar, k0.b bVar) {
        RandomAccess randomAccess;
        boolean z10;
        s sVar2 = sVar;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < sVar2.a) {
            if (i10 == sVar2.f20472b[i11]) {
                j1 j1Var = sVar2.f20473c[i11];
                for (int i12 = 0; i12 < j1Var.f26181b; i12++) {
                    i1 a = j1Var.a(i12);
                    z1 b3 = lVar.b(i11, a, iArr[i11][i12]);
                    int i13 = a.f26163b;
                    boolean[] zArr = new boolean[i13];
                    for (int i14 = 0; i14 < i13; i14++) {
                        m mVar = (m) b3.get(i14);
                        int a10 = mVar.a();
                        if (!zArr[i14] && a10 != 0) {
                            if (a10 == 1) {
                                randomAccess = com.google.common.collect.r0.o(mVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(mVar);
                                for (int i15 = i14 + 1; i15 < i13; i15++) {
                                    m mVar2 = (m) b3.get(i15);
                                    if (mVar2.a() == 2 && mVar.b(mVar2)) {
                                        arrayList2.add(mVar2);
                                        z10 = true;
                                        zArr[i15] = true;
                                    } else {
                                        z10 = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                    }
                }
            }
            i11++;
            sVar2 = sVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, bVar);
        int[] iArr2 = new int[list.size()];
        for (int i16 = 0; i16 < list.size(); i16++) {
            iArr2[i16] = ((m) list.get(i16)).f20445d;
        }
        m mVar3 = (m) list.get(0);
        return Pair.create(new p(0, mVar3.f20444c, iArr2), Integer.valueOf(mVar3.f20443b));
    }

    public final void d() {
        boolean z10;
        o0 o0Var;
        h3.a aVar;
        synchronized (this.f20463c) {
            if (this.f20467g.L && !this.f20466f && h0.a >= 32 && (aVar = this.f20468h) != null && aVar.f18722c) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (z10 && (o0Var = this.a) != null) {
            o0Var.f24620j.d(10);
        }
    }
}
