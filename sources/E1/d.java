package E1;

import B3.e;
import F7.p;
import G7.j;
import J1.y;
import L4.f;
import N1.l;
import Q1.i;
import W1.C0320d;
import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC0505o;
import androidx.lifecycle.B;
import androidx.lifecycle.C;
import androidx.work.o;
import androidx.work.q;
import androidx.work.s;
import androidx.work.t;
import c2.C0597h;
import c2.C0599j;
import com.adjust.sdk.Constants;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.C1849l;
import com.facebook.appevents.g;
import com.facebook.internal.J;
import com.facebook.r;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzga;
import com.google.android.gms.internal.play_billing.zzge;
import com.google.android.gms.internal.play_billing.zzgu;
import com.google.android.gms.internal.play_billing.zzhd;
import com.google.android.gms.internal.play_billing.zzhe;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d1.C2161b;
import d1.C2162c;
import e2.C2215c;
import e8.C2242q;
import e8.V;
import f1.C2262k;
import g4.C2296f;
import h5.C2326g;
import i3.C2342a;
import j0.n;
import j0.u;
import j0.v;
import j0.x;
import j5.C2400c;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import org.json.JSONException;
import org.json.JSONObject;
import r.C2650a;
import t7.AbstractC2712a;
import t7.C2722k;
import v1.F;
import v1.m;
import v1.z;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public class d implements C4.a, y, t, l, OnCompleteListener, InstallReferrerStateListener, J, n {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public Object f973c;

    /* renamed from: d, reason: collision with root package name */
    public Object f974d;

    public /* synthetic */ d(int i9, Object obj, Object obj2) {
        this.b = i9;
        this.f973c = obj;
        this.f974d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static E1.d e(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L29 java.lang.Error -> L2c java.io.IOException -> L2e
            E1.d r2 = new E1.d     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            r3 = 8
            r2.<init>(r3, r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            return r2
        L23:
            r2 = move-exception
            goto L38
        L25:
            r2 = move-exception
            goto L38
        L27:
            r2 = move-exception
            goto L38
        L29:
            r2 = move-exception
        L2a:
            r0 = r1
            goto L38
        L2c:
            r2 = move-exception
            goto L2a
        L2e:
            r2 = move-exception
            goto L2a
        L30:
            r2 = move-exception
        L31:
            r5 = r1
            r0 = r5
            goto L38
        L34:
            r2 = move-exception
            goto L31
        L36:
            r2 = move-exception
            goto L31
        L38:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L44
            r0.release()     // Catch: java.io.IOException -> L44
        L44:
            if (r5 == 0) goto L49
            r5.close()     // Catch: java.io.IOException -> L49
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: E1.d.e(android.content.Context):E1.d");
    }

    public Object A() {
        int i9;
        Q1.c cVar = (Q1.c) this.f973c;
        Q1.c cVar2 = cVar.f2470d;
        while (true) {
            Object obj = null;
            if (cVar2.equals(cVar)) {
                return null;
            }
            ArrayList arrayList = cVar2.b;
            if (arrayList != null) {
                i9 = arrayList.size();
            } else {
                i9 = 0;
            }
            if (i9 > 0) {
                obj = cVar2.b.remove(i9 - 1);
            }
            if (obj != null) {
                return obj;
            }
            Q1.c cVar3 = cVar2.f2470d;
            cVar3.f2469c = cVar2.f2469c;
            cVar2.f2469c.f2470d = cVar3;
            HashMap hashMap = (HashMap) this.f974d;
            Object obj2 = cVar2.f2468a;
            hashMap.remove(obj2);
            ((i) obj2).a();
            cVar2 = cVar2.f2470d;
        }
    }

    public void B(com.facebook.appevents.i iVar) {
        boolean z8;
        C c9 = (C) this.f973c;
        synchronized (c9.f4819a) {
            if (c9.f4823f == B.f4818k) {
                z8 = true;
            } else {
                z8 = false;
            }
            c9.f4823f = iVar;
        }
        if (z8) {
            C2650a.v().w(c9.f4827j);
        }
        if (iVar instanceof s) {
            ((C2262k) this.f974d).i((s) iVar);
        } else if (iVar instanceof q) {
            ((C2262k) this.f974d).j(((q) iVar).f5250d);
        }
    }

    public void C(zzga zzgaVar) {
        if (zzgaVar == null) {
            return;
        }
        try {
            zzhd zzy = zzhe.zzy();
            zzy.zzn((zzgu) this.f973c);
            zzy.zzl(zzgaVar);
            ((e) this.f974d).r((zzhe) zzy.zzf());
        } catch (Throwable th) {
            zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }

    public void D(zzge zzgeVar) {
        if (zzgeVar == null) {
            return;
        }
        try {
            zzhd zzy = zzhe.zzy();
            zzy.zzn((zzgu) this.f973c);
            zzy.zzm(zzgeVar);
            ((e) this.f974d).r((zzhe) zzy.zzf());
        } catch (Throwable th) {
            zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.facebook.internal.J
    public void a(Bundle bundle, C1849l c1849l) {
        com.facebook.login.C c9 = (com.facebook.login.C) this.f973c;
        c9.getClass();
        com.facebook.login.q qVar = (com.facebook.login.q) this.f974d;
        j.e(qVar, com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA);
        c9.r(qVar, bundle, c1849l);
    }

    @Override // j0.n
    public Object b() {
        return (x) this.f973c;
    }

    @Override // C4.a
    public StackTraceElement[] c(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (C4.a aVar : (C4.a[]) this.f973c) {
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.c(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > 1024) {
            return ((o) this.f974d).c(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }

    @Override // j0.n
    public boolean d(CharSequence charSequence, int i9, int i10, u uVar) {
        Spannable spannableString;
        if ((uVar.f21005c & 4) > 0) {
            return true;
        }
        if (((x) this.f973c) == null) {
            if (charSequence instanceof Spannable) {
                spannableString = (Spannable) charSequence;
            } else {
                spannableString = new SpannableString(charSequence);
            }
            this.f973c = new x(spannableString);
        }
        ((f) this.f974d).getClass();
        ((x) this.f973c).setSpan(new v(uVar), i9, i10, 33);
        return true;
    }

    public boolean equals(Object obj) {
        switch (this.b) {
            case 1:
                if (!(obj instanceof S.b)) {
                    return false;
                }
                S.b bVar = (S.b) obj;
                Object obj2 = bVar.f2767a;
                Object obj3 = this.f973c;
                if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
                    return false;
                }
                Object obj4 = this.f974d;
                Object obj5 = bVar.b;
                if (obj5 != obj4 && (obj5 == null || !obj5.equals(obj4))) {
                    return false;
                }
                return true;
            default:
                return super.equals(obj);
        }
    }

    public void f(int i9, int[] iArr) {
        E5.b bVar;
        E5.b bVar2;
        E5.b bVar3;
        if (i9 != 0) {
            int length = iArr.length - i9;
            if (length > 0) {
                ArrayList arrayList = (ArrayList) this.f974d;
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 1;
                E5.a aVar = (E5.a) this.f973c;
                if (i9 >= size) {
                    E5.b bVar4 = (E5.b) com.mbridge.msdk.foundation.entity.o.g(arrayList, 1);
                    int size2 = arrayList.size();
                    while (size2 <= i9) {
                        int[] iArr2 = {i11, aVar.f1035a[(size2 - 1) + aVar.f1039f]};
                        if (iArr2[i10] == 0) {
                            int i12 = i11;
                            while (i12 < 2 && iArr2[i12] == 0) {
                                i12++;
                            }
                            if (i12 == 2) {
                                iArr2 = new int[]{i10};
                            } else {
                                int i13 = 2 - i12;
                                int[] iArr3 = new int[i13];
                                System.arraycopy(iArr2, i12, iArr3, i10, i13);
                                iArr2 = iArr3;
                            }
                        }
                        bVar4.getClass();
                        E5.a aVar2 = bVar4.f1040a;
                        if (aVar2.equals(aVar)) {
                            int[] iArr4 = bVar4.b;
                            if (iArr4[i10] == 0 || iArr2[i10] == 0) {
                                bVar4 = aVar2.f1036c;
                            } else {
                                int length2 = iArr4.length;
                                int length3 = iArr2.length;
                                int[] iArr5 = new int[(length2 + length3) - i11];
                                for (int i14 = i10; i14 < length2; i14++) {
                                    int i15 = iArr4[i14];
                                    int i16 = 0;
                                    while (i16 < length3) {
                                        int i17 = i14 + i16;
                                        iArr5[i17] = iArr5[i17] ^ aVar2.a(i15, iArr2[i16]);
                                        i16++;
                                        iArr4 = iArr4;
                                    }
                                }
                                bVar4 = new E5.b(aVar2, iArr5);
                            }
                            arrayList.add(bVar4);
                            size2++;
                            i10 = 0;
                            i11 = 1;
                        } else {
                            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                        }
                    }
                }
                E5.b bVar5 = (E5.b) arrayList.get(i9);
                int[] iArr6 = new int[length];
                System.arraycopy(iArr, 0, iArr6, 0, length);
                if (length != 0) {
                    if (length > 1 && iArr6[0] == 0) {
                        int i18 = 1;
                        while (i18 < length && iArr6[i18] == 0) {
                            i18++;
                        }
                        if (i18 == length) {
                            iArr6 = new int[]{0};
                        } else {
                            int i19 = length - i18;
                            int[] iArr7 = new int[i19];
                            System.arraycopy(iArr6, i18, iArr7, 0, i19);
                            iArr6 = iArr7;
                        }
                    }
                    if (i9 >= 0) {
                        int length4 = iArr6.length;
                        int[] iArr8 = new int[length4 + i9];
                        for (int i20 = 0; i20 < length4; i20++) {
                            iArr8[i20] = aVar.a(iArr6[i20], 1);
                        }
                        E5.b bVar6 = new E5.b(aVar, iArr8);
                        if (aVar.equals(bVar5.f1040a)) {
                            int[] iArr9 = bVar5.b;
                            if (iArr9[0] != 0) {
                                int i21 = iArr9[(iArr9.length - 1) - bVar5.b()];
                                if (i21 != 0) {
                                    int i22 = aVar.f1035a[(aVar.f1037d - aVar.b[i21]) - 1];
                                    E5.b bVar7 = aVar.f1036c;
                                    E5.b bVar8 = bVar7;
                                    while (bVar6.b() >= bVar5.b()) {
                                        int[] iArr10 = bVar6.b;
                                        if (iArr10[0] == 0) {
                                            break;
                                        }
                                        int b = bVar6.b() - bVar5.b();
                                        int a6 = aVar.a(iArr10[(iArr10.length - 1) - bVar6.b()], i22);
                                        if (b >= 0) {
                                            E5.a aVar3 = bVar5.f1040a;
                                            if (a6 == 0) {
                                                bVar2 = aVar3.f1036c;
                                                bVar = bVar5;
                                            } else {
                                                int length5 = iArr9.length;
                                                int[] iArr11 = new int[length5 + b];
                                                int i23 = 0;
                                                while (i23 < length5) {
                                                    iArr11[i23] = aVar3.a(iArr9[i23], a6);
                                                    i23++;
                                                    bVar5 = bVar5;
                                                }
                                                bVar = bVar5;
                                                bVar2 = new E5.b(aVar3, iArr11);
                                            }
                                            if (b >= 0) {
                                                if (a6 == 0) {
                                                    bVar3 = bVar7;
                                                } else {
                                                    int[] iArr12 = new int[b + 1];
                                                    iArr12[0] = a6;
                                                    bVar3 = new E5.b(aVar, iArr12);
                                                }
                                                bVar8 = bVar8.a(bVar3);
                                                bVar6 = bVar6.a(bVar2);
                                                bVar5 = bVar;
                                            } else {
                                                throw new IllegalArgumentException();
                                            }
                                        } else {
                                            throw new IllegalArgumentException();
                                        }
                                    }
                                    int[] iArr13 = new E5.b[]{bVar8, bVar6}[1].b;
                                    int length6 = i9 - iArr13.length;
                                    for (int i24 = 0; i24 < length6; i24++) {
                                        iArr[length + i24] = 0;
                                    }
                                    System.arraycopy(iArr13, 0, iArr, length + length6, iArr13.length);
                                    return;
                                }
                                throw new ArithmeticException();
                            }
                            throw new IllegalArgumentException("Divide by 0");
                        }
                        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                    }
                    throw new IllegalArgumentException();
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }

    public z g(Context context, String str, InputStream inputStream, String str2, String str3) {
        z f9;
        z zVar;
        b bVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        boolean contains = str2.contains("application/zip");
        c cVar = (c) this.f973c;
        if (!contains && !str2.contains("application/x-zip") && !str2.contains("application/x-zip-compressed") && !str.split("\\?")[0].endsWith(".lottie")) {
            if (!str2.contains("application/gzip") && !str2.contains("application/x-gzip") && !str.split("\\?")[0].endsWith(".tgs")) {
                H1.c.a();
                bVar = b.JSON;
                if (str3 != null && cVar != null) {
                    zVar = m.c(new FileInputStream(cVar.D(str, inputStream, bVar).getAbsolutePath()), str);
                } else {
                    zVar = m.c(inputStream, null);
                }
            } else {
                H1.c.a();
                bVar = b.GZIP;
                if (str3 != null && cVar != null) {
                    zVar = m.c(new GZIPInputStream(new FileInputStream(cVar.D(str, inputStream, bVar))), str);
                } else {
                    zVar = m.c(new GZIPInputStream(inputStream), null);
                }
            }
        } else {
            H1.c.a();
            b bVar2 = b.ZIP;
            if (str3 != null && cVar != null) {
                f9 = m.f(context, new ZipInputStream(new FileInputStream(cVar.D(str, inputStream, bVar2))), str);
            } else {
                f9 = m.f(context, new ZipInputStream(inputStream), null);
            }
            zVar = f9;
            bVar = bVar2;
        }
        if (str3 != null && zVar.f23601a != null && cVar != null) {
            File file = new File(cVar.B(), c.r(str, bVar, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean renameTo = file.renameTo(file2);
            file2.toString();
            H1.c.a();
            if (!renameTo) {
                H1.c.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return zVar;
    }

    public Object h(i iVar) {
        int i9;
        HashMap hashMap = (HashMap) this.f974d;
        Q1.c cVar = (Q1.c) hashMap.get(iVar);
        if (cVar == null) {
            cVar = new Q1.c(iVar);
            hashMap.put(iVar, cVar);
        } else {
            iVar.a();
        }
        Q1.c cVar2 = cVar.f2470d;
        cVar2.f2469c = cVar.f2469c;
        cVar.f2469c.f2470d = cVar2;
        Q1.c cVar3 = (Q1.c) this.f973c;
        cVar.f2470d = cVar3;
        Q1.c cVar4 = cVar3.f2469c;
        cVar.f2469c = cVar4;
        cVar4.f2470d = cVar;
        cVar.f2470d.f2469c = cVar;
        ArrayList arrayList = cVar.b;
        if (arrayList != null) {
            i9 = arrayList.size();
        } else {
            i9 = 0;
        }
        if (i9 > 0) {
            return cVar.b.remove(i9 - 1);
        }
        return null;
    }

    public int hashCode() {
        int hashCode;
        switch (this.b) {
            case 1:
                Object obj = this.f973c;
                int i9 = 0;
                if (obj == null) {
                    hashCode = 0;
                } else {
                    hashCode = obj.hashCode();
                }
                Object obj2 = this.f974d;
                if (obj2 != null) {
                    i9 = obj2.hashCode();
                }
                return hashCode ^ i9;
            default:
                return super.hashCode();
        }
    }

    public Object i(M7.b bVar, ArrayList arrayList) {
        Object b;
        Object b8;
        Object putIfAbsent;
        switch (this.b) {
            case 27:
                ConcurrentHashMap concurrentHashMap = ((V) A0.b.o((C2242q) this.f974d, g.n(bVar))).f20140a;
                Object obj = concurrentHashMap.get(arrayList);
                if (obj == null) {
                    try {
                        b = (a8.b) ((p) this.f973c).g(bVar, arrayList);
                    } catch (Throwable th) {
                        b = AbstractC2712a.b(th);
                    }
                    obj = new C2722k(b);
                    Object putIfAbsent2 = concurrentHashMap.putIfAbsent(arrayList, obj);
                    if (putIfAbsent2 != null) {
                        obj = putIfAbsent2;
                    }
                }
                return ((C2722k) obj).b;
            default:
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.f974d;
                Class n2 = g.n(bVar);
                Object obj2 = concurrentHashMap2.get(n2);
                if (obj2 == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(n2, (obj2 = new V()))) != null) {
                    obj2 = putIfAbsent;
                }
                ConcurrentHashMap concurrentHashMap3 = ((V) obj2).f20140a;
                Object obj3 = concurrentHashMap3.get(arrayList);
                if (obj3 == null) {
                    try {
                        b8 = (a8.b) ((p) this.f973c).g(bVar, arrayList);
                    } catch (Throwable th2) {
                        b8 = AbstractC2712a.b(th2);
                    }
                    obj3 = new C2722k(b8);
                    Object putIfAbsent3 = concurrentHashMap3.putIfAbsent(arrayList, obj3);
                    if (putIfAbsent3 != null) {
                        obj3 = putIfAbsent3;
                    }
                }
                return ((C2722k) obj3).b;
        }
    }

    public File j() {
        if (((File) this.f973c) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f973c) == null) {
                        C2296f c2296f = (C2296f) this.f974d;
                        c2296f.a();
                        this.f973c = new File(c2296f.f20433a.getFilesDir(), "PersistedInstallation." + ((C2296f) this.f974d).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f973c;
    }

    public Long k(String str) {
        D0.m c9 = D0.m.c(1, "SELECT long_value FROM Preference where `key`=?");
        c9.j(1, str);
        D0.j jVar = (D0.j) this.f973c;
        jVar.b();
        Cursor g9 = jVar.g(c9);
        try {
            Long l = null;
            if (g9.moveToFirst() && !g9.isNull(0)) {
                l = Long.valueOf(g9.getLong(0));
            }
            return l;
        } finally {
            g9.close();
            c9.release();
        }
    }

    public synchronized List l(String str) {
        List list;
        if (!((ArrayList) this.f973c).contains(str)) {
            ((ArrayList) this.f973c).add(str);
        }
        list = (List) ((HashMap) this.f974d).get(str);
        if (list == null) {
            list = new ArrayList();
            ((HashMap) this.f974d).put(str, list);
        }
        return list;
    }

    @Override // N1.b
    public boolean m(Object obj, File file, N1.i iVar) {
        return ((l) this.f974d).m(new C0320d((Q1.a) this.f973c, ((BitmapDrawable) ((P1.B) obj).get()).getBitmap()), file, iVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [c2.m, java.lang.Object] */
    public com.bumptech.glide.m n(Context context, com.bumptech.glide.b bVar, AbstractC0505o abstractC0505o, FragmentManager fragmentManager, boolean z8) {
        j2.n.a();
        j2.n.a();
        HashMap hashMap = (HashMap) this.f973c;
        com.bumptech.glide.m mVar = (com.bumptech.glide.m) hashMap.get(abstractC0505o);
        if (mVar == null) {
            C0597h c0597h = new C0597h(abstractC0505o);
            ?? obj = new Object();
            ((f) this.f974d).getClass();
            com.bumptech.glide.m mVar2 = new com.bumptech.glide.m(bVar, c0597h, obj, context);
            hashMap.put(abstractC0505o, mVar2);
            c0597h.g(new C0599j(this, abstractC0505o));
            if (z8) {
                mVar2.onStart();
            }
            return mVar2;
        }
        return mVar;
    }

    public synchronized ArrayList o(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f973c).iterator();
        while (it.hasNext()) {
            List<C2215c> list = (List) ((HashMap) this.f974d).get((String) it.next());
            if (list != null) {
                for (C2215c c2215c : list) {
                    if (c2215c.f20069a.isAssignableFrom(cls) && cls2.isAssignableFrom(c2215c.b) && !arrayList.contains(c2215c.b)) {
                        arrayList.add(c2215c.b);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Y3.j jVar = (Y3.j) this.f973c;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f974d;
        synchronized (jVar.f3781f) {
            jVar.f3780e.remove(taskCompletionSource);
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerSetupFinished(int i9) {
        if (O2.a.b(this)) {
            return;
        }
        InstallReferrerClient installReferrerClient = (InstallReferrerClient) this.f973c;
        try {
            if (i9 != 0) {
                if (i9 == 2) {
                    r.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
                }
            } else {
                try {
                    ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                    j.d(installReferrer, "{\n                      referrerClient.installReferrer\n                    }");
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null) {
                        if (!O7.g.E("fb", installReferrer2)) {
                            if (O7.g.E("facebook", installReferrer2)) {
                            }
                        }
                        ((R3.e) this.f974d).getClass();
                        String str = com.facebook.appevents.l.f13492c;
                        r.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString(Constants.INSTALL_REFERRER, installReferrer2).apply();
                    }
                    r.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
                } catch (RemoteException unused) {
                    return;
                }
            }
            try {
                installReferrerClient.endConnection();
            } catch (Exception unused2) {
            }
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }

    @Override // N1.l
    public int p(N1.i iVar) {
        return ((l) this.f974d).p(iVar);
    }

    public String q(N1.f fVar) {
        String str;
        synchronized (((C2326g) this.f973c)) {
            str = (String) ((C2326g) this.f973c).a(fVar);
        }
        if (str == null) {
            R1.g gVar = (R1.g) ((C.c) this.f974d).g();
            try {
                fVar.b(gVar.b);
                byte[] digest = gVar.b.digest();
                char[] cArr = j2.n.b;
                synchronized (cArr) {
                    for (int i9 = 0; i9 < digest.length; i9++) {
                        byte b = digest[i9];
                        int i10 = i9 * 2;
                        char[] cArr2 = j2.n.f21025a;
                        cArr[i10] = cArr2[(b & 255) >>> 4];
                        cArr[i10 + 1] = cArr2[b & Ascii.SI];
                    }
                    str = new String(cArr);
                }
            } finally {
                ((C.c) this.f974d).b(gVar);
            }
        }
        synchronized (((C2326g) this.f973c)) {
            ((C2326g) this.f973c).d(fVar, str);
        }
        return str;
    }

    public ArrayList r(String str) {
        D0.m c9 = D0.m.c(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            c9.i(1);
        } else {
            c9.j(1, str);
        }
        D0.j jVar = (D0.j) this.f973c;
        jVar.b();
        Cursor g9 = jVar.g(c9);
        try {
            ArrayList arrayList = new ArrayList(g9.getCount());
            while (g9.moveToNext()) {
                arrayList.add(g9.getString(0));
            }
            return arrayList;
        } finally {
            g9.close();
            c9.release();
        }
    }

    public Object s(I1.b bVar) {
        return this.f974d;
    }

    public Object t(float f9, float f10, Object obj, Object obj2, float f11, float f12, float f13) {
        I1.b bVar = (I1.b) this.f973c;
        bVar.f1421a = f9;
        bVar.b = f10;
        bVar.f1422c = obj;
        bVar.f1423d = obj2;
        bVar.f1424e = f11;
        bVar.f1425f = f12;
        bVar.f1426g = f13;
        return s(bVar);
    }

    public String toString() {
        int i9;
        switch (this.b) {
            case 1:
                return "Pair{" + this.f973c + " " + this.f974d + "}";
            case 11:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                Q1.c cVar = (Q1.c) this.f973c;
                Q1.c cVar2 = cVar.f2469c;
                boolean z8 = false;
                while (!cVar2.equals(cVar)) {
                    sb.append('{');
                    sb.append(cVar2.f2468a);
                    sb.append(':');
                    ArrayList arrayList = cVar2.b;
                    if (arrayList != null) {
                        i9 = arrayList.size();
                    } else {
                        i9 = 0;
                    }
                    sb.append(i9);
                    sb.append("}, ");
                    cVar2 = cVar2.f2469c;
                    z8 = true;
                }
                if (z8) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            case 14:
                return "Bounds{lower=" + ((L.e) this.f973c) + " upper=" + ((L.e) this.f974d) + "}";
            default:
                return super.toString();
        }
    }

    public void u(P4.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f2421a);
            jSONObject.put("Status", AbstractC2965e.d(bVar.b));
            jSONObject.put("AuthToken", bVar.f2422c);
            jSONObject.put("RefreshToken", bVar.f2423d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f2425f);
            jSONObject.put("ExpiresInSecs", bVar.f2424e);
            jSONObject.put("FisError", bVar.f2426g);
            C2296f c2296f = (C2296f) this.f974d;
            c2296f.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", c2296f.f20433a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(j())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public void v(C2162c c2162c) {
        D0.j jVar = (D0.j) this.f973c;
        jVar.b();
        jVar.c();
        try {
            ((C2161b) this.f974d).e(c2162c);
            jVar.h();
        } finally {
            jVar.f();
        }
    }

    public void w(i iVar, Object obj) {
        HashMap hashMap = (HashMap) this.f974d;
        Q1.c cVar = (Q1.c) hashMap.get(iVar);
        if (cVar == null) {
            cVar = new Q1.c(iVar);
            cVar.f2469c = cVar;
            cVar.f2470d = cVar;
            Q1.c cVar2 = (Q1.c) this.f973c;
            cVar.f2470d = cVar2.f2470d;
            cVar.f2469c = cVar2;
            cVar2.f2470d = cVar;
            cVar.f2470d.f2469c = cVar;
            hashMap.put(iVar, cVar);
        } else {
            iVar.a();
        }
        if (cVar.b == null) {
            cVar.b = new ArrayList();
        }
        cVar.b.add(obj);
    }

    public P4.b x() {
        JSONObject jSONObject;
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(j());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i9 = AbstractC2965e.e(5)[optInt];
        if (i9 != 0) {
            Long valueOf = Long.valueOf(optLong);
            Long valueOf2 = Long.valueOf(optLong2);
            if (i9 == 0) {
                str = " registrationStatus";
            } else {
                str = "";
            }
            if (str.isEmpty()) {
                return new P4.b(optString, i9, optString2, optString3, valueOf2.longValue(), valueOf.longValue(), optString4);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
        throw new NullPointerException("Null registrationStatus");
    }

    public void y(String str) {
        R1.b bVar;
        synchronized (this) {
            try {
                Object obj = ((HashMap) this.f973c).get(str);
                j2.g.c(obj, "Argument must not be null");
                bVar = (R1.b) obj;
                int i9 = bVar.b;
                if (i9 >= 1) {
                    int i10 = i9 - 1;
                    bVar.b = i10;
                    if (i10 == 0) {
                        R1.b bVar2 = (R1.b) ((HashMap) this.f973c).remove(str);
                        if (bVar2.equals(bVar)) {
                            c cVar = (c) this.f974d;
                            synchronized (((ArrayDeque) cVar.f972c)) {
                                if (((ArrayDeque) cVar.f972c).size() < 10) {
                                    ((ArrayDeque) cVar.f972c).offer(bVar2);
                                }
                            }
                        } else {
                            throw new IllegalStateException("Removed the wrong lock, expected to remove: " + bVar + ", but actually removed: " + bVar2 + ", safeKey: " + str);
                        }
                    }
                } else {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + bVar.b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        bVar.f2624a.unlock();
    }

    public void z() {
        try {
            ((FileLock) this.f974d).release();
            ((FileChannel) this.f973c).close();
        } catch (IOException e4) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e4);
        }
    }

    public /* synthetic */ d(int i9, boolean z8) {
        this.b = i9;
    }

    public d(X3.g gVar) {
        this.b = 17;
        this.f974d = new Handler(Looper.getMainLooper());
        this.f973c = gVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [B3.e, java.lang.Object] */
    public d(Context context, zzgu zzguVar) {
        this.b = 6;
        ?? obj = new Object();
        try {
            k3.s.b(context);
            obj.b = k3.s.a().c(C2342a.f20645e).a("PLAY_BILLING_LIBRARY", new h3.c("proto"), new f(6));
        } catch (Throwable unused) {
            obj.f283a = true;
        }
        this.f974d = obj;
        this.f973c = zzguVar;
    }

    public d(D0.j jVar, int i9) {
        this.b = i9;
        switch (i9) {
            case 25:
                this.f973c = jVar;
                this.f974d = new C2161b(jVar, 6);
                return;
            default:
                this.f973c = jVar;
                this.f974d = new C2161b(jVar, 1);
                return;
        }
    }

    public d(f fVar) {
        this.b = 20;
        this.f973c = new HashMap();
        this.f974d = fVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, androidx.work.o] */
    public d(C4.a[] aVarArr) {
        this.b = 2;
        this.f973c = aVarArr;
        ?? obj = new Object();
        obj.b = 1024;
        this.f974d = obj;
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerServiceDisconnected() {
    }

    public d(E5.a aVar) {
        this.b = 3;
        this.f973c = aVar;
        ArrayList arrayList = new ArrayList();
        this.f974d = arrayList;
        arrayList.add(new E5.b(aVar, new int[]{1}));
    }

    public d(int i9) {
        this.b = i9;
        switch (i9) {
            case 9:
                this.f973c = new HashMap();
                this.f974d = new HashMap();
                return;
            case 11:
                this.f973c = new Q1.c(null);
                this.f974d = new HashMap();
                return;
            case 12:
                this.f973c = new HashMap();
                this.f974d = new c(10);
                return;
            case 13:
                this.f973c = new C2326g(1000L);
                this.f974d = k2.d.a(10, new f(10));
                return;
            case 15:
                this.f973c = new B();
                this.f974d = new Object();
                B(t.f5252Z7);
                return;
            case 21:
                C2400c c2400c = new C2400c(27);
                this.f973c = c2400c;
                this.f974d = new c(c2400c, 29);
                return;
            case 26:
                this.f973c = new ArrayList();
                this.f974d = new HashMap();
                return;
            default:
                this.f973c = new Object();
                this.f974d = null;
                return;
        }
    }

    public d(F f9) {
        this.b = 4;
        this.f973c = new Object();
        this.f974d = f9;
    }

    public d(p pVar, int i9) {
        this.b = i9;
        switch (i9) {
            case 28:
                this.f973c = pVar;
                this.f974d = new ConcurrentHashMap();
                return;
            default:
                this.f973c = pVar;
                this.f974d = new C2242q();
                return;
        }
    }

    public d(C2296f c2296f) {
        this.b = 10;
        this.f974d = c2296f;
    }

    public d(ArrayList arrayList, ArrayList arrayList2) {
        this.b = 7;
        int size = arrayList.size();
        this.f973c = new int[size];
        this.f974d = new float[size];
        for (int i9 = 0; i9 < size; i9++) {
            ((int[]) this.f973c)[i9] = ((Integer) arrayList.get(i9)).intValue();
            ((float[]) this.f974d)[i9] = ((Float) arrayList2.get(i9)).floatValue();
        }
    }

    public d(int i9, int i10) {
        this.b = 7;
        this.f973c = new int[]{i9, i10};
        this.f974d = new float[]{0.0f, 1.0f};
    }

    public d(int i9, int i10, int i11) {
        this.b = 7;
        this.f973c = new int[]{i9, i10, i11};
        this.f974d = new float[]{0.0f, 0.5f, 1.0f};
    }
}
