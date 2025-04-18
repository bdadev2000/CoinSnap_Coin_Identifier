package nb;

import a4.n;
import a4.w;
import a4.x;
import android.net.Uri;
import android.os.Bundle;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.common.collect.c1;
import com.google.common.collect.n0;
import com.google.common.collect.r0;
import com.google.common.collect.z1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.plantcare.ai.identifier.plantid.ui.component.iap.IapActivity;
import com.plantcare.ai.identifier.plantid.ui.component.main.MainActivity;
import com.plantcare.ai.identifier.plantid.ui.component.setting.SettingActivity;
import com.plantcare.ai.identifier.plantid.ui.component.splash.SplashActivity;
import com.vungle.ads.internal.util.m;
import eb.j;
import f7.e;
import ic.o;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import jc.f;
import k8.y;
import k8.z;
import kotlin.jvm.internal.Intrinsics;
import mb.s2;
import n9.h0;
import n9.l;
import q8.g;
import s7.d1;
import s7.f1;
import s7.h;
import s7.h1;
import s7.i1;
import s7.j1;
import s7.k1;
import s7.l1;
import s7.m2;
import s7.q2;
import s7.s0;
import s7.t2;
import s7.v2;
import s7.w2;
import s7.y1;
import s7.y2;
import v8.u0;
import v8.w0;
import x7.q;
import x7.t;
import y7.i;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements b, e, Continuation, SuccessContinuation, n, x, w, m, h, n9.m, n9.c, t, i, g, y, l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22717b;

    public /* synthetic */ a(int i10) {
        this.f22717b = i10;
    }

    @Override // a4.x
    public void a(a4.l lVar, List list) {
        switch (this.f22717b) {
            case 13:
                int i10 = SettingActivity.f16736h;
                Intrinsics.checkNotNullParameter(lVar, "<anonymous parameter 0>");
                return;
            default:
                int i11 = SplashActivity.f16739n;
                Intrinsics.checkNotNullParameter(lVar, "<anonymous parameter 0>");
                return;
        }
    }

    @Override // n9.c
    public void accept(Object obj) {
        switch (this.f22717b) {
            case 18:
                ((q) obj).b();
                return;
            case 19:
                ((q) obj).a();
                return;
            case 20:
                ((q) obj).c();
                return;
            default:
                ((w0) obj).f26317b.release();
                return;
        }
    }

    @Override // f7.e
    public Object apply(Object obj) {
        switch (this.f22717b) {
            case 2:
                pb.a.f23561b.getClass();
                return c.a.c((s2) obj).getBytes(Charset.forName("UTF-8"));
            default:
                f fVar = (f) obj;
                fVar.getClass();
                c1 c1Var = o.a;
                c1Var.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    c1Var.l(fVar, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
        }
    }

    @Override // a4.n
    public void b(a4.l billingResult, String str) {
        switch (this.f22717b) {
            case 9:
                int i10 = IapActivity.f16628k;
                Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                Intrinsics.checkNotNullParameter(str, "<anonymous parameter 1>");
                return;
            case 10:
                int i11 = MainActivity.f16644q;
                Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                Intrinsics.checkNotNullParameter(str, "<anonymous parameter 1>");
                return;
            default:
                int i12 = MainActivity.f16644q;
                Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                Intrinsics.checkNotNullParameter(str, "<anonymous parameter 1>");
                billingResult.getClass();
                return;
        }
    }

    @Override // n9.m
    public void c(Object obj, n9.g gVar) {
    }

    @Override // a4.w
    public void d(a4.l billingResult1, List list) {
        switch (this.f22717b) {
            case 14:
                Intrinsics.checkNotNullParameter(billingResult1, "billingResult1");
                Intrinsics.checkNotNullParameter(list, "list");
                if (billingResult1.a == 0 && list.isEmpty()) {
                    g3.c.a().f18018m = false;
                    if (x5.i.l()) {
                        x5.i.r(new cg.a());
                        return;
                    }
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(billingResult1, "billingResult1");
                Intrinsics.checkNotNullParameter(list, "list");
                if (billingResult1.a == 0) {
                    Log.d("duylt", "Check Type Obj Iap Check Sub: " + x5.i.d());
                    Log.d("duylt", "Check List Response: " + list.isEmpty());
                    if (list.isEmpty()) {
                        g3.c.a().f18018m = false;
                        if (x5.i.l()) {
                            x5.i.r(new cg.a());
                            return;
                        }
                        return;
                    }
                    if (!x5.i.l()) {
                        g3.c.a().f18018m = true;
                        x5.i.a();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // nb.b
    public Object e(JsonReader jsonReader) {
        switch (this.f22717b) {
            case 0:
                return c.a(jsonReader);
            default:
                return c.a(jsonReader);
        }
    }

    @Override // k8.y
    public int f(Object obj) {
        switch (this.f22717b) {
            case 25:
                Pattern pattern = z.a;
                String str = ((k8.o) obj).a;
                if (!str.startsWith("OMX.google") && !str.startsWith("c2.android")) {
                    if (h0.a < 26 && str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                        return -1;
                    }
                    return 0;
                }
                return 1;
            default:
                Pattern pattern2 = z.a;
                return ((k8.o) obj).a.startsWith("OMX.google") ? 1 : 0;
        }
    }

    /* JADX WARN: Type inference failed for: r3v104, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v28, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v30, types: [boolean[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v8, types: [boolean[], java.io.Serializable] */
    @Override // s7.h
    public s7.i g(Bundle bundle) {
        z1 v10;
        Integer num;
        Bundle bundle2;
        Bundle bundle3;
        w8.b bVar;
        j1 j1Var;
        boolean z10 = true;
        byte[] bArr = null;
        d1 d1Var = null;
        switch (this.f22717b) {
            case 0:
                h.c cVar = new h.c(23, bArr);
                cVar.f18523c = (Uri) bundle.getParcelable(f1.f24352f);
                cVar.f18524d = bundle.getString(f1.f24353g);
                cVar.f18525f = bundle.getBundle(f1.f24354h);
                return new f1(cVar);
            case 1:
                Uri uri = (Uri) bundle.getParcelable(i1.f24425j);
                uri.getClass();
                String string = bundle.getString(i1.f24426k);
                String string2 = bundle.getString(i1.f24427l);
                int i10 = bundle.getInt(i1.f24428m, 0);
                int i11 = bundle.getInt(i1.f24429n, 0);
                String string3 = bundle.getString(i1.f24430o);
                String string4 = bundle.getString(i1.f24431p);
                h1 h1Var = new h1(uri);
                h1Var.a = string;
                h1Var.f24389e = string2;
                h1Var.f24386b = i10;
                h1Var.f24387c = i11;
                h1Var.f24390f = string3;
                h1Var.f24391g = string4;
                return new i1(h1Var);
            case 2:
                k1 k1Var = new k1();
                k1Var.a = bundle.getCharSequence(l1.L);
                k1Var.f24471b = bundle.getCharSequence(l1.M);
                k1Var.f24472c = bundle.getCharSequence(l1.N);
                k1Var.f24473d = bundle.getCharSequence(l1.O);
                k1Var.f24474e = bundle.getCharSequence(l1.P);
                k1Var.f24475f = bundle.getCharSequence(l1.Q);
                k1Var.f24476g = bundle.getCharSequence(l1.R);
                byte[] byteArray = bundle.getByteArray(l1.U);
                String str = l1.f24529n0;
                if (bundle.containsKey(str)) {
                    num = Integer.valueOf(bundle.getInt(str));
                } else {
                    num = null;
                }
                if (byteArray != null) {
                    bArr = (byte[]) byteArray.clone();
                }
                k1Var.f24479j = bArr;
                k1Var.f24480k = num;
                k1Var.f24481l = (Uri) bundle.getParcelable(l1.V);
                k1Var.f24492x = bundle.getCharSequence(l1.f24522g0);
                k1Var.f24493y = bundle.getCharSequence(l1.f24523h0);
                k1Var.f24494z = bundle.getCharSequence(l1.f24524i0);
                k1Var.C = bundle.getCharSequence(l1.f24527l0);
                k1Var.D = bundle.getCharSequence(l1.f24528m0);
                k1Var.E = bundle.getCharSequence(l1.f24530o0);
                k1Var.G = bundle.getBundle(l1.f24533r0);
                String str2 = l1.S;
                if (bundle.containsKey(str2) && (bundle3 = bundle.getBundle(str2)) != null) {
                    k1Var.f24477h = (m2) m2.f24596c.g(bundle3);
                }
                String str3 = l1.T;
                if (bundle.containsKey(str3) && (bundle2 = bundle.getBundle(str3)) != null) {
                    k1Var.f24478i = (m2) m2.f24596c.g(bundle2);
                }
                String str4 = l1.W;
                if (bundle.containsKey(str4)) {
                    k1Var.f24482m = Integer.valueOf(bundle.getInt(str4));
                }
                String str5 = l1.X;
                if (bundle.containsKey(str5)) {
                    k1Var.f24483n = Integer.valueOf(bundle.getInt(str5));
                }
                String str6 = l1.Y;
                if (bundle.containsKey(str6)) {
                    k1Var.f24484o = Integer.valueOf(bundle.getInt(str6));
                }
                String str7 = l1.f24532q0;
                if (bundle.containsKey(str7)) {
                    k1Var.f24485p = Boolean.valueOf(bundle.getBoolean(str7));
                }
                String str8 = l1.Z;
                if (bundle.containsKey(str8)) {
                    k1Var.f24486q = Boolean.valueOf(bundle.getBoolean(str8));
                }
                String str9 = l1.f24516a0;
                if (bundle.containsKey(str9)) {
                    k1Var.f24487r = Integer.valueOf(bundle.getInt(str9));
                }
                String str10 = l1.f24517b0;
                if (bundle.containsKey(str10)) {
                    k1Var.f24488s = Integer.valueOf(bundle.getInt(str10));
                }
                String str11 = l1.f24518c0;
                if (bundle.containsKey(str11)) {
                    k1Var.f24489t = Integer.valueOf(bundle.getInt(str11));
                }
                String str12 = l1.f24519d0;
                if (bundle.containsKey(str12)) {
                    k1Var.u = Integer.valueOf(bundle.getInt(str12));
                }
                String str13 = l1.f24520e0;
                if (bundle.containsKey(str13)) {
                    k1Var.f24490v = Integer.valueOf(bundle.getInt(str13));
                }
                String str14 = l1.f24521f0;
                if (bundle.containsKey(str14)) {
                    k1Var.f24491w = Integer.valueOf(bundle.getInt(str14));
                }
                String str15 = l1.f24525j0;
                if (bundle.containsKey(str15)) {
                    k1Var.A = Integer.valueOf(bundle.getInt(str15));
                }
                String str16 = l1.f24526k0;
                if (bundle.containsKey(str16)) {
                    k1Var.B = Integer.valueOf(bundle.getInt(str16));
                }
                String str17 = l1.f24531p0;
                if (bundle.containsKey(str17)) {
                    k1Var.F = Integer.valueOf(bundle.getInt(str17));
                }
                return new l1(k1Var);
            case 3:
                String str18 = y1.f24878f;
                if (bundle.getInt(m2.f24595b, -1) != 1) {
                    z10 = false;
                }
                u0.d(z10);
                float f10 = bundle.getFloat(y1.f24878f, -1.0f);
                if (f10 == -1.0f) {
                    return new y1();
                }
                return new y1(f10);
            case 4:
            case 5:
            case 6:
            case 7:
            case 11:
            case 14:
            default:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(v8.i1.f26160h);
                if (parcelableArrayList == null) {
                    n0 n0Var = r0.f12026c;
                    v10 = z1.f12062g;
                } else {
                    v10 = u0.v(s7.r0.f24711r0, parcelableArrayList);
                }
                return new v8.i1(bundle.getString(v8.i1.f26161i, ""), (s7.r0[]) v10.toArray(new s7.r0[0]));
            case 8:
                int i12 = bundle.getInt(m2.f24595b, -1);
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 == 3) {
                                return (m2) t2.f24765i.g(bundle);
                            }
                            throw new IllegalArgumentException(j.i("Unknown RatingType: ", i12));
                        }
                        return (m2) q2.f24684i.g(bundle);
                    }
                    return (m2) y1.f24879g.g(bundle);
                }
                return (m2) s0.f24744i.g(bundle);
            case 9:
                String str19 = q2.f24682g;
                if (bundle.getInt(m2.f24595b, -1) != 2) {
                    z10 = false;
                }
                u0.d(z10);
                int i13 = bundle.getInt(q2.f24682g, 5);
                float f11 = bundle.getFloat(q2.f24683h, -1.0f);
                if (f11 == -1.0f) {
                    return new q2(i13);
                }
                return new q2(i13, f11);
            case 10:
                String str20 = t2.f24763g;
                if (bundle.getInt(m2.f24595b, -1) != 3) {
                    z10 = false;
                }
                u0.d(z10);
                if (bundle.getBoolean(t2.f24763g, false)) {
                    return new t2(bundle.getBoolean(t2.f24764h, false));
                }
                return new t2();
            case 12:
                int i14 = bundle.getInt(v2.f24780j, 0);
                long j3 = bundle.getLong(v2.f24781k, C.TIME_UNSET);
                long j10 = bundle.getLong(v2.f24782l, 0L);
                boolean z11 = bundle.getBoolean(v2.f24783m, false);
                Bundle bundle4 = bundle.getBundle(v2.f24784n);
                if (bundle4 != null) {
                    bVar = (w8.b) w8.b.f26924o.g(bundle4);
                } else {
                    bVar = w8.b.f26918i;
                }
                w8.b bVar2 = bVar;
                v2 v2Var = new v2();
                v2Var.i(null, null, i14, j3, j10, bVar2, z11);
                return v2Var;
            case 13:
                Bundle bundle5 = bundle.getBundle(w2.f24835w);
                if (bundle5 != null) {
                    j1Var = (j1) j1.f24451p.g(bundle5);
                } else {
                    j1Var = j1.f24444i;
                }
                j1 j1Var2 = j1Var;
                long j11 = bundle.getLong(w2.f24836x, C.TIME_UNSET);
                long j12 = bundle.getLong(w2.f24837y, C.TIME_UNSET);
                long j13 = bundle.getLong(w2.f24838z, C.TIME_UNSET);
                boolean z12 = bundle.getBoolean(w2.A, false);
                boolean z13 = bundle.getBoolean(w2.B, false);
                Bundle bundle6 = bundle.getBundle(w2.C);
                if (bundle6 != null) {
                    d1Var = (d1) d1.f24318n.g(bundle6);
                }
                boolean z14 = bundle.getBoolean(w2.D, false);
                long j14 = bundle.getLong(w2.E, 0L);
                long j15 = bundle.getLong(w2.F, C.TIME_UNSET);
                int i15 = bundle.getInt(w2.G, 0);
                int i16 = bundle.getInt(w2.H, 0);
                long j16 = bundle.getLong(w2.I, 0L);
                w2 w2Var = new w2();
                w2Var.b(w2.u, j1Var2, null, j11, j12, j13, z12, z13, d1Var, j14, j15, i15, i16, j16);
                w2Var.f24850n = z14;
                return w2Var;
            case 15:
                String str21 = y2.f24881h;
                a aVar = v8.i1.f26162j;
                Bundle bundle7 = bundle.getBundle(y2.f24881h);
                bundle7.getClass();
                v8.i1 i1Var = (v8.i1) aVar.g(bundle7);
                return new y2(i1Var, bundle.getBoolean(y2.f24884k, false), (int[]) u0.u(bundle.getIntArray(y2.f24882i), new int[i1Var.f26163b]), (boolean[]) u0.u(bundle.getBooleanArray(y2.f24883j), new boolean[i1Var.f26163b]));
        }
    }

    public Constructor h() {
        switch (this.f22717b) {
            case 22:
                int[] iArr = y7.j.f27986c;
                if (!Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                    return null;
                }
                return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(y7.l.class).getConstructor(Integer.TYPE);
            default:
                int[] iArr2 = y7.j.f27986c;
                return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(y7.l.class).getConstructor(new Class[0]);
        }
    }

    @Override // n9.l
    public void invoke(Object obj) {
        switch (this.f22717b) {
            case 0:
                ((t7.c) obj).getClass();
                return;
            case 1:
                ((t7.c) obj).getClass();
                return;
            case 2:
                ((t7.c) obj).getClass();
                return;
            case 3:
                ((t7.c) obj).getClass();
                return;
            default:
                ((t7.c) obj).getClass();
                return;
        }
    }

    @Override // com.vungle.ads.internal.util.m
    public ObjectInputStream provideObjectInputStream(InputStream inputStream) {
        return com.vungle.ads.internal.util.n.m69objectInputStreamProvider$lambda0(inputStream);
    }

    @Override // x7.t
    public void release() {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f22717b) {
            case 3:
                Object obj = ic.i.f19554c;
                return 403;
            default:
                Object obj2 = ic.i.f19554c;
                return -1;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        switch (this.f22717b) {
            case 6:
                return Tasks.forResult(null);
            default:
                return Tasks.forResult(null);
        }
    }
}
