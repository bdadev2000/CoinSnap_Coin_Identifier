package n0;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.Layout;
import com.applovin.impl.qb;
import com.applovin.impl.ql;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.ur;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.components.ComponentRegistrar;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements f2.s, qb.b, n.a, com.facebook.internal.s, n9.l, n9.c, s7.h, na.x, kc.e, db.e, cc.a, OnFailureListener, nb.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22278b;

    public /* synthetic */ h(int i10) {
        this.f22278b = i10;
    }

    @Override // com.applovin.impl.qb.b
    public void a(Object obj) {
        ur.b((com.applovin.impl.adview.b) obj);
    }

    @Override // n9.c
    public void accept(Object obj) {
        ((x7.q) obj).d(this.f22278b);
    }

    @Override // n.a, o7.h
    public Object apply(Object obj) {
        switch (this.f22278b) {
            case 8:
                return com.applovin.impl.sdk.ad.b.U((ql) obj);
            case 9:
                return com.applovin.impl.sdk.ad.b.E((ql) obj);
            case 10:
                return com.applovin.impl.sdk.ad.b.I((ql) obj);
            case 11:
                return com.applovin.impl.sdk.ad.b.Q((ql) obj);
            case 12:
                return com.applovin.impl.sdk.ad.b.y((ql) obj);
            case 13:
                return com.applovin.impl.sdk.ad.b.K((ql) obj);
            case 14:
                return com.applovin.impl.sdk.ad.b.x((ql) obj);
            case 15:
                return com.applovin.impl.sdk.ad.b.O((ql) obj);
            case 16:
                return com.applovin.impl.sdk.ad.b.H((ql) obj);
            case 17:
                return com.applovin.impl.sdk.ad.b.F((ql) obj);
            default:
                return AppLovinNativeAdImpl.x((ql) obj);
        }
    }

    @Override // com.facebook.internal.s
    public void b(boolean z10) {
        int i10 = 5;
        switch (this.f22278b) {
            case 19:
                com.facebook.x xVar = com.facebook.x.a;
                if (z10 && com.facebook.u0.b()) {
                    com.facebook.internal.v vVar = com.facebook.internal.v.a;
                    com.facebook.internal.v.a(new com.facebook.appevents.m(4), com.facebook.internal.t.CrashReport);
                    com.facebook.internal.v.a(new com.facebook.appevents.m(i10), com.facebook.internal.t.ErrorReport);
                    com.facebook.internal.v.a(new com.facebook.appevents.m(6), com.facebook.internal.t.AnrReport);
                    return;
                }
                return;
            case 20:
                com.facebook.x xVar2 = com.facebook.x.a;
                if (z10 && !m6.a.b(com.facebook.appevents.o.class)) {
                    try {
                        com.facebook.internal.z zVar = com.facebook.internal.z.a;
                        com.facebook.appevents.n callback = new com.facebook.appevents.n();
                        Intrinsics.checkNotNullParameter(callback, "callback");
                        com.facebook.internal.z.f11143e.add(callback);
                        com.facebook.internal.z.c();
                        return;
                    } catch (Throwable th2) {
                        m6.a.a(com.facebook.appevents.o.class, th2);
                        return;
                    }
                }
                return;
            case 21:
                if (z10) {
                    com.facebook.x.f11432l = true;
                    return;
                } else {
                    com.facebook.x xVar3 = com.facebook.x.a;
                    return;
                }
            case 22:
                if (z10) {
                    com.facebook.x.f11433m = true;
                    return;
                } else {
                    com.facebook.x xVar4 = com.facebook.x.a;
                    return;
                }
            case 23:
                if (z10) {
                    com.facebook.x.f11434n = true;
                    return;
                } else {
                    com.facebook.x xVar5 = com.facebook.x.a;
                    return;
                }
            case 24:
            default:
                if (z10) {
                    a6.i iVar = a6.i.a;
                    if (!m6.a.b(a6.i.class)) {
                        try {
                            a6.i.f285b.set(true);
                            a6.i.a();
                            return;
                        } catch (Throwable th3) {
                            m6.a.a(a6.i.class, th3);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 25:
                if (z10) {
                    v5.a aVar = v5.a.f26027b;
                    if (!m6.a.b(v5.a.class)) {
                        try {
                            try {
                                com.facebook.x.c().execute(new com.applovin.impl.sdk.g0(i10));
                                return;
                            } catch (Exception unused) {
                                com.facebook.x xVar6 = com.facebook.x.a;
                                return;
                            }
                        } catch (Throwable th4) {
                            m6.a.a(v5.a.class, th4);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 26:
                if (z10) {
                    f6.b bVar = f6.b.a;
                    if (!m6.a.b(f6.b.class)) {
                        try {
                            f6.b.f17682b = true;
                            f6.b.a.b();
                            return;
                        } catch (Throwable th5) {
                            m6.a.a(f6.b.class, th5);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 27:
                if (z10) {
                    d6.f fVar = d6.f.a;
                    if (!m6.a.b(d6.f.class)) {
                        try {
                            try {
                                com.facebook.x.c().execute(new com.applovin.impl.sdk.g0(11));
                                return;
                            } catch (Exception unused2) {
                                return;
                            }
                        } catch (Throwable th6) {
                            m6.a.a(d6.f.class, th6);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 28:
                if (z10) {
                    z5.b bVar2 = z5.b.a;
                    if (!m6.a.b(z5.b.class)) {
                        try {
                            z5.b.f28521b = true;
                            z5.b.a.a();
                            return;
                        } catch (Throwable th7) {
                            m6.a.a(z5.b.class, th7);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x017a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x018b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0303 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0315 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0322 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x02f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00d7 A[SYNTHETIC] */
    @Override // nb.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(android.util.JsonReader r7) {
        /*
            Method dump skipped, instructions count: 954
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.h.e(android.util.JsonReader):java.lang.Object");
    }

    @Override // s7.h
    public s7.i g(Bundle bundle) {
        w8.a[] aVarArr;
        Uri[] uriArr;
        long[] jArr;
        List aVar;
        boolean z10 = true;
        switch (this.f22278b) {
            case 0:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(v8.j1.f26180g);
                if (parcelableArrayList == null) {
                    return new v8.j1(new v8.i1[0]);
                }
                return new v8.j1((v8.i1[]) v8.u0.v(v8.i1.f26162j, parcelableArrayList).toArray(new v8.i1[0]));
            case 1:
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(w8.b.f26920k);
                if (parcelableArrayList2 == null) {
                    aVarArr = new w8.a[0];
                } else {
                    w8.a[] aVarArr2 = new w8.a[parcelableArrayList2.size()];
                    for (int i10 = 0; i10 < parcelableArrayList2.size(); i10++) {
                        aVarArr2[i10] = (w8.a) w8.a.f26909s.g((Bundle) parcelableArrayList2.get(i10));
                    }
                    aVarArr = aVarArr2;
                }
                return new w8.b(null, aVarArr, bundle.getLong(w8.b.f26921l, 0L), bundle.getLong(w8.b.f26922m, C.TIME_UNSET), bundle.getInt(w8.b.f26923n, 0));
            case 2:
                long j3 = bundle.getLong(w8.a.f26901k);
                int i11 = bundle.getInt(w8.a.f26902l);
                int i12 = bundle.getInt(w8.a.f26908r);
                ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(w8.a.f26903m);
                int[] intArray = bundle.getIntArray(w8.a.f26904n);
                long[] longArray = bundle.getLongArray(w8.a.f26905o);
                long j10 = bundle.getLong(w8.a.f26906p);
                boolean z11 = bundle.getBoolean(w8.a.f26907q);
                if (intArray == null) {
                    intArray = new int[0];
                }
                int[] iArr = intArray;
                if (parcelableArrayList3 == null) {
                    uriArr = new Uri[0];
                } else {
                    uriArr = (Uri[]) parcelableArrayList3.toArray(new Uri[0]);
                }
                Uri[] uriArr2 = uriArr;
                if (longArray == null) {
                    jArr = new long[0];
                } else {
                    jArr = longArray;
                }
                return new w8.a(j3, i11, i12, iArr, uriArr2, jArr, j10, z11);
            case 3:
            case 5:
            case 6:
            case 9:
            case 10:
            default:
                return new o9.z(bundle.getInt(o9.z.f23276h, 0), bundle.getInt(o9.z.f23277i, 0), bundle.getInt(o9.z.f23278j, 0), bundle.getFloat(o9.z.f23279k, 1.0f));
            case 4:
                a9.a aVar2 = new a9.a();
                CharSequence charSequence = bundle.getCharSequence(a9.b.u);
                if (charSequence != null) {
                    aVar2.a = charSequence;
                }
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(a9.b.f360v);
                if (alignment != null) {
                    aVar2.f344c = alignment;
                }
                Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(a9.b.f361w);
                if (alignment2 != null) {
                    aVar2.f345d = alignment2;
                }
                Bitmap bitmap = (Bitmap) bundle.getParcelable(a9.b.f362x);
                if (bitmap != null) {
                    aVar2.f343b = bitmap;
                }
                String str = a9.b.f363y;
                if (bundle.containsKey(str)) {
                    String str2 = a9.b.f364z;
                    if (bundle.containsKey(str2)) {
                        float f10 = bundle.getFloat(str);
                        int i13 = bundle.getInt(str2);
                        aVar2.f346e = f10;
                        aVar2.f347f = i13;
                    }
                }
                String str3 = a9.b.A;
                if (bundle.containsKey(str3)) {
                    aVar2.f348g = bundle.getInt(str3);
                }
                String str4 = a9.b.B;
                if (bundle.containsKey(str4)) {
                    aVar2.f349h = bundle.getFloat(str4);
                }
                String str5 = a9.b.C;
                if (bundle.containsKey(str5)) {
                    aVar2.f350i = bundle.getInt(str5);
                }
                String str6 = a9.b.E;
                if (bundle.containsKey(str6)) {
                    String str7 = a9.b.D;
                    if (bundle.containsKey(str7)) {
                        float f11 = bundle.getFloat(str6);
                        int i14 = bundle.getInt(str7);
                        aVar2.f352k = f11;
                        aVar2.f351j = i14;
                    }
                }
                String str8 = a9.b.F;
                if (bundle.containsKey(str8)) {
                    aVar2.f353l = bundle.getFloat(str8);
                }
                String str9 = a9.b.G;
                if (bundle.containsKey(str9)) {
                    aVar2.f354m = bundle.getFloat(str9);
                }
                String str10 = a9.b.H;
                if (bundle.containsKey(str10)) {
                    aVar2.f356o = bundle.getInt(str10);
                    aVar2.f355n = true;
                }
                if (!bundle.getBoolean(a9.b.I, false)) {
                    aVar2.f355n = false;
                }
                String str11 = a9.b.J;
                if (bundle.containsKey(str11)) {
                    aVar2.f357p = bundle.getInt(str11);
                }
                String str12 = a9.b.K;
                if (bundle.containsKey(str12)) {
                    aVar2.f358q = bundle.getFloat(str12);
                }
                return aVar2.a();
            case 7:
                int i15 = bundle.getInt(k9.i.f20428f, -1);
                int[] intArray2 = bundle.getIntArray(k9.i.f20429g);
                int i16 = bundle.getInt(k9.i.f20430h, -1);
                if (i15 < 0 || i16 < 0) {
                    z10 = false;
                }
                v8.u0.d(z10);
                intArray2.getClass();
                return new k9.i(i15, intArray2, i16);
            case 8:
                Bundle bundle2 = bundle.getBundle(k9.u.f20478d);
                bundle2.getClass();
                v8.i1 i1Var = (v8.i1) v8.i1.f26162j.g(bundle2);
                int[] intArray3 = bundle.getIntArray(k9.u.f20479f);
                intArray3.getClass();
                if (intArray3.length == 0) {
                    aVar = Collections.emptyList();
                } else {
                    aVar = new ta.a(intArray3, 0, intArray3.length);
                }
                return new k9.u(i1Var, aVar);
            case 11:
                return new o9.b(bundle.getInt(o9.b.f23180i, -1), bundle.getInt(o9.b.f23181j, -1), bundle.getInt(o9.b.f23182k, -1), bundle.getByteArray(o9.b.f23183l));
        }
    }

    @Override // cc.a
    public void h(cc.c cVar) {
    }

    @Override // n9.l
    public void invoke(Object obj) {
        ((s7.f2) obj).onRepeatModeChanged(this.f22278b);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        b6.a.f2288f.e("Error fetching settings.", exc);
    }

    @Override // db.e
    public List a(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }
}
