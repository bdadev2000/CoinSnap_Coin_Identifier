package r4;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.applovin.impl.fw;
import com.bytedance.sdk.openadsdk.api.init.BiddingTokenCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.facebook.v;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.common.collect.n0;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.out.SDKInitStatusListener;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import h.s0;
import i8.b0;
import i8.f0;
import i8.h0;
import i8.y;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import m9.p0;
import n0.z;
import n9.e0;
import n9.g;
import n9.x;
import o.q;
import s7.l2;
import s7.q0;
import s7.r0;
import s7.r1;
import s7.s1;
import s7.t1;
import s7.v1;
import s7.w1;
import v8.d0;
import v8.p;
import v8.u;
import v8.u0;
import w7.f;
import x7.r;
import y7.a0;
import y7.c0;
import y7.n;
import z8.h;
import z8.m;

/* loaded from: classes.dex */
public final class c implements SDKInitStatusListener, RewardItem, BiddingTokenCallback, d0, r, y7.d, b0, p0, z {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23998b;

    /* renamed from: c, reason: collision with root package name */
    public Object f23999c;

    /* renamed from: d, reason: collision with root package name */
    public Object f24000d;

    public /* synthetic */ c(int i10, int i11) {
        this.f23998b = i10;
    }

    @Override // x7.r
    public final void B(int i10, v8.z zVar) {
        Pair r6 = r(i10, zVar);
        if (r6 != null) {
            ((e0) ((w1) this.f24000d).f24829i).c(new t1(this, r6, 1));
        }
    }

    @Override // v8.d0
    public final void E(int i10, v8.z zVar, p pVar, u uVar) {
        Pair r6 = r(i10, zVar);
        if (r6 != null) {
            ((e0) ((w1) this.f24000d).f24829i).c(new r1(this, r6, pVar, uVar, 0));
        }
    }

    @Override // v8.d0
    public final void H(int i10, v8.z zVar, u uVar) {
        Pair r6 = r(i10, zVar);
        if (r6 != null) {
            ((e0) ((w1) this.f24000d).f24829i).c(new s1(this, r6, uVar, 1));
        }
    }

    @Override // i8.b0
    public final void a(x xVar) {
        if (xVar.v() != 0 || (xVar.v() & 128) == 0) {
            return;
        }
        xVar.H(6);
        int i10 = (xVar.f22600c - xVar.f22599b) / 4;
        for (int i11 = 0; i11 < i10; i11++) {
            c0 c0Var = (c0) this.f23999c;
            xVar.d(c0Var.f27958d, 0, 4);
            c0Var.o(0);
            int i12 = ((c0) this.f23999c).i(16);
            ((c0) this.f23999c).r(3);
            if (i12 == 0) {
                ((c0) this.f23999c).r(13);
            } else {
                int i13 = ((c0) this.f23999c).i(13);
                if (((f0) this.f24000d).f19291e.get(i13) == null) {
                    f0 f0Var = (f0) this.f24000d;
                    f0Var.f19291e.put(i13, new i8.c0(new i8.e0(f0Var, i13)));
                    ((f0) this.f24000d).f19297k++;
                }
            }
        }
        f0 f0Var2 = (f0) this.f24000d;
        f0Var2.getClass();
        f0Var2.f19291e.remove(0);
    }

    @Override // i8.b0
    public final void b(n9.f0 f0Var, n nVar, h0 h0Var) {
    }

    @Override // x7.r
    public final void c(int i10, v8.z zVar) {
        Pair r6 = r(i10, zVar);
        if (r6 != null) {
            ((e0) ((w1) this.f24000d).f24829i).c(new t1(this, r6, 0));
        }
    }

    @Override // m9.p0
    public final Object d(Uri uri, m9.n nVar) {
        long j3;
        z8.c cVar;
        u8.a aVar = (u8.a) ((p0) this.f23999c).d(uri, nVar);
        List list = (List) this.f24000d;
        if (list != null && !list.isEmpty()) {
            List list2 = (List) this.f24000d;
            z8.c cVar2 = (z8.c) aVar;
            cVar2.getClass();
            LinkedList linkedList = new LinkedList(list2);
            Collections.sort(linkedList);
            linkedList.add(new u8.b(-1, -1, -1));
            ArrayList arrayList = new ArrayList();
            long j10 = 0;
            int i10 = 0;
            while (true) {
                int b3 = cVar2.b();
                j3 = C.TIME_UNSET;
                if (i10 >= b3) {
                    break;
                }
                if (((u8.b) linkedList.peek()).f25740b != i10) {
                    long c10 = cVar2.c(i10);
                    if (c10 != C.TIME_UNSET) {
                        j10 += c10;
                    }
                    cVar = cVar2;
                } else {
                    h a = cVar2.a(i10);
                    List list3 = a.f28622c;
                    u8.b bVar = (u8.b) linkedList.poll();
                    int i11 = bVar.f25740b;
                    ArrayList arrayList2 = new ArrayList();
                    while (true) {
                        int i12 = bVar.f25741c;
                        z8.a aVar2 = (z8.a) list3.get(i12);
                        List list4 = aVar2.f28584c;
                        ArrayList arrayList3 = new ArrayList();
                        do {
                            arrayList3.add((m) list4.get(bVar.f25742d));
                            bVar = (u8.b) linkedList.poll();
                            if (bVar.f25740b != i11) {
                                break;
                            }
                        } while (bVar.f25741c == i12);
                        List list5 = list3;
                        cVar = cVar2;
                        arrayList2.add(new z8.a(aVar2.a, aVar2.f28583b, arrayList3, aVar2.f28585d, aVar2.f28586e, aVar2.f28587f));
                        if (bVar.f25740b != i11) {
                            break;
                        }
                        cVar2 = cVar;
                        list3 = list5;
                    }
                    linkedList.addFirst(bVar);
                    arrayList.add(new h(a.a, a.f28621b - j10, arrayList2, a.f28623d));
                }
                i10++;
                cVar2 = cVar;
            }
            long j11 = cVar2.f28591b;
            if (j11 != C.TIME_UNSET) {
                j3 = j11 - j10;
            }
            return new z8.c(cVar2.a, j3, cVar2.f28592c, cVar2.f28593d, cVar2.f28594e, cVar2.f28595f, cVar2.f28596g, cVar2.f28597h, cVar2.f28601l, cVar2.f28598i, cVar2.f28599j, cVar2.f28600k, arrayList);
        }
        return aVar;
    }

    @Override // v8.d0
    public final void e(int i10, v8.z zVar, p pVar, u uVar) {
        Pair r6 = r(i10, zVar);
        if (r6 != null) {
            ((e0) ((w1) this.f24000d).f24829i).c(new r1(this, r6, pVar, uVar, 2));
        }
    }

    @Override // x7.r
    public final void f(int i10, v8.z zVar, Exception exc) {
        Pair r6 = r(i10, zVar);
        if (r6 != null) {
            ((e0) ((w1) this.f24000d).f24829i).c(new androidx.emoji2.text.n(10, this, r6, exc));
        }
    }

    @Override // y7.d
    public final s0 g(y7.m mVar, long j3) {
        int d10;
        long position = mVar.getPosition();
        int min = (int) Math.min(20000L, mVar.getLength() - position);
        ((x) this.f24000d).D(min);
        mVar.peekFully(((x) this.f24000d).a, 0, min);
        x xVar = (x) this.f24000d;
        int i10 = -1;
        int i11 = -1;
        long j10 = -9223372036854775807L;
        while (true) {
            int i12 = xVar.f22600c;
            int i13 = xVar.f22599b;
            if (i12 - i13 >= 4) {
                if (b8.a.d(i13, xVar.a) != 442) {
                    xVar.H(1);
                } else {
                    xVar.H(4);
                    long c10 = y.c(xVar);
                    if (c10 != C.TIME_UNSET) {
                        long b3 = ((n9.f0) this.f23999c).b(c10);
                        if (b3 > j3) {
                            if (j10 == C.TIME_UNSET) {
                                return new s0(-1, b3, position);
                            }
                            return s0.b(position + i11);
                        }
                        if (100000 + b3 > j3) {
                            return s0.b(position + xVar.f22599b);
                        }
                        i11 = xVar.f22599b;
                        j10 = b3;
                    }
                    int i14 = xVar.f22600c;
                    if (i14 - xVar.f22599b < 10) {
                        xVar.G(i14);
                    } else {
                        xVar.H(9);
                        int v10 = xVar.v() & 7;
                        if (xVar.f22600c - xVar.f22599b < v10) {
                            xVar.G(i14);
                        } else {
                            xVar.H(v10);
                            int i15 = xVar.f22600c;
                            int i16 = xVar.f22599b;
                            if (i15 - i16 < 4) {
                                xVar.G(i14);
                            } else {
                                if (b8.a.d(i16, xVar.a) == 443) {
                                    xVar.H(4);
                                    int A = xVar.A();
                                    if (xVar.f22600c - xVar.f22599b < A) {
                                        xVar.G(i14);
                                    } else {
                                        xVar.H(A);
                                    }
                                }
                                while (true) {
                                    int i17 = xVar.f22600c;
                                    int i18 = xVar.f22599b;
                                    if (i17 - i18 < 4 || (d10 = b8.a.d(i18, xVar.a)) == 442 || d10 == 441 || (d10 >>> 8) != 1) {
                                        break;
                                    }
                                    xVar.H(4);
                                    if (xVar.f22600c - xVar.f22599b < 2) {
                                        xVar.G(i14);
                                        break;
                                    }
                                    xVar.G(Math.min(xVar.f22600c, xVar.f22599b + xVar.A()));
                                }
                            }
                        }
                    }
                    i10 = xVar.f22599b;
                }
            } else {
                if (j10 != C.TIME_UNSET) {
                    return new s0(-2, j10, position + i10);
                }
                return s0.f18659e;
            }
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        switch (this.f23998b) {
            case 4:
                try {
                    return Integer.getInteger(((RewardInfo) this.f23999c).getRewardAmount()).intValue();
                } catch (Exception e2) {
                    Log.w(MintegralMediationAdapter.TAG, "Failed to get reward amount.", e2);
                    return 0;
                }
            default:
                return ((PAGRewardItem) this.f23999c).getRewardAmount();
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        switch (this.f23998b) {
            case 4:
                return ((RewardInfo) this.f23999c).getRewardName();
            default:
                return ((PAGRewardItem) this.f23999c).getRewardName();
        }
    }

    @Override // y7.d
    public final void h() {
        x xVar = (x) this.f24000d;
        byte[] bArr = n9.h0.f22548f;
        xVar.getClass();
        xVar.E(bArr, bArr.length);
    }

    public final void i() {
        this.f23999c = null;
        this.f24000d = null;
    }

    @Override // x7.r
    public final void j(int i10, v8.z zVar, int i11) {
        Pair r6 = r(i10, zVar);
        if (r6 != null) {
            ((e0) ((w1) this.f24000d).f24829i).c(new q(this, r6, i11, 4));
        }
    }

    public final boolean k(int i10) {
        return ((g) this.f23999c).a.get(i10);
    }

    public final void l(n nVar, h0 h0Var) {
        boolean z10;
        for (int i10 = 0; i10 < ((a0[]) this.f24000d).length; i10++) {
            h0Var.a();
            h0Var.b();
            a0 track = nVar.track(h0Var.f19317d, 3);
            r0 r0Var = (r0) ((List) this.f23999c).get(i10);
            String str = r0Var.f24723n;
            if (!MimeTypes.APPLICATION_CEA608.equals(str) && !MimeTypes.APPLICATION_CEA708.equals(str)) {
                z10 = false;
            } else {
                z10 = true;
            }
            u0.e(z10, "Invalid closed caption MIME type provided: " + str);
            String str2 = r0Var.f24712b;
            if (str2 == null) {
                h0Var.b();
                str2 = h0Var.f19318e;
            }
            q0 q0Var = new q0();
            q0Var.a = str2;
            q0Var.f24667k = str;
            q0Var.f24660d = r0Var.f24715f;
            q0Var.f24659c = r0Var.f24714d;
            q0Var.C = r0Var.F;
            q0Var.f24669m = r0Var.f24725p;
            track.f(new r0(q0Var));
            ((a0[]) this.f24000d)[i10] = track;
        }
    }

    @Override // v8.d0
    public final void m(int i10, v8.z zVar, p pVar, u uVar, IOException iOException, boolean z10) {
        Pair r6 = r(i10, zVar);
        if (r6 != null) {
            ((e0) ((w1) this.f24000d).f24829i).c(new fw(this, r6, pVar, uVar, iOException, z10, 1));
        }
    }

    public final void n(f fVar) {
        synchronized (fVar) {
        }
        Object obj = this.f23999c;
        if (((Handler) obj) != null) {
            ((Handler) obj).post(new u7.q(this, fVar, 0));
        }
    }

    public final byte[] o(n8.a aVar) {
        ((ByteArrayOutputStream) this.f23999c).reset();
        try {
            DataOutputStream dataOutputStream = (DataOutputStream) this.f24000d;
            dataOutputStream.writeBytes(aVar.f22507b);
            dataOutputStream.writeByte(0);
            String str = aVar.f22508c;
            if (str == null) {
                str = "";
            }
            DataOutputStream dataOutputStream2 = (DataOutputStream) this.f24000d;
            dataOutputStream2.writeBytes(str);
            dataOutputStream2.writeByte(0);
            ((DataOutputStream) this.f24000d).writeLong(aVar.f22509d);
            ((DataOutputStream) this.f24000d).writeLong(aVar.f22510f);
            ((DataOutputStream) this.f24000d).write(aVar.f22511g);
            ((DataOutputStream) this.f24000d).flush();
            return ((ByteArrayOutputStream) this.f23999c).toByteArray();
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.BiddingTokenCallback
    public final void onBiddingTokenCollected(String str) {
        ((SignalCallbacks) this.f23999c).onSuccess(str);
    }

    @Override // com.mbridge.msdk.out.SDKInitStatusListener
    public final void onInitFail(String str) {
        AdError h10 = c6.c.h(105, str);
        ((InitializationCompleteCallback) this.f23999c).onInitializationFailed(h10.getMessage());
        Log.w(MintegralMediationAdapter.TAG, h10.toString());
    }

    @Override // com.mbridge.msdk.out.SDKInitStatusListener
    public final void onInitSuccess() {
        try {
            Aa aa2 = new Aa();
            Method declaredMethod = Aa.class.getDeclaredMethod(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, String.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(aa2, "Y+H6DFttYrPQYcIBiQKwJQKQYrN=");
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        ((InitializationCompleteCallback) this.f23999c).onInitializationSucceeded();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.datatransport.cct.CctBackendFactory p(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.c.p(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    @Override // v8.d0
    public final void q(int i10, v8.z zVar, p pVar, u uVar) {
        Pair r6 = r(i10, zVar);
        if (r6 != null) {
            ((e0) ((w1) this.f24000d).f24829i).c(new r1(this, r6, pVar, uVar, 1));
        }
    }

    public final Pair r(int i10, v8.z zVar) {
        v8.z zVar2;
        v8.z zVar3 = null;
        if (zVar != null) {
            v1 v1Var = (v1) this.f23999c;
            int i11 = 0;
            while (true) {
                if (i11 < v1Var.f24777c.size()) {
                    if (((v8.z) v1Var.f24777c.get(i11)).f26320d == zVar.f26320d) {
                        Object obj = v1Var.f24776b;
                        int i12 = l2.f24558m;
                        zVar2 = zVar.b(Pair.create(obj, zVar.a));
                        break;
                    }
                    i11++;
                } else {
                    zVar2 = null;
                    break;
                }
            }
            if (zVar2 == null) {
                return null;
            }
            zVar3 = zVar2;
        }
        return Pair.create(Integer.valueOf(i10 + ((v1) this.f23999c).f24778d), zVar3);
    }

    @Override // x7.r
    public final void s(int i10, v8.z zVar) {
        Pair r6 = r(i10, zVar);
        if (r6 != null) {
            ((e0) ((w1) this.f24000d).f24829i).c(new t1(this, r6, 2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    @Override // n0.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final n0.r2 t(android.view.View r17, n0.r2 r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.Object r3 = r0.f23999c
            a4.g0 r3 = (a4.g0) r3
            m9.h0 r4 = new m9.h0
            java.lang.Object r5 = r0.f24000d
            m9.h0 r5 = (m9.h0) r5
            r4.<init>(r5)
            r3.getClass()
            r5 = 7
            g0.f r5 = r2.a(r5)
            r6 = 32
            g0.f r6 = r2.a(r6)
            java.lang.Object r7 = r3.f132b
            com.google.android.material.bottomsheet.BottomSheetBehavior r7 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r7
            int r8 = r5.f17910b
            r7.f11594w = r8
            int r7 = r17.getLayoutDirection()
            r9 = 1
            if (r7 != r9) goto L32
            r7 = r9
            goto L33
        L32:
            r7 = 0
        L33:
            int r10 = r17.getPaddingBottom()
            int r11 = r17.getPaddingLeft()
            int r12 = r17.getPaddingRight()
            java.lang.Object r13 = r3.f132b
            com.google.android.material.bottomsheet.BottomSheetBehavior r13 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r13
            boolean r14 = r13.f11587o
            if (r14 == 0) goto L56
            int r10 = r18.b()
            r13.f11593v = r10
            java.lang.Object r10 = r3.f132b
            com.google.android.material.bottomsheet.BottomSheetBehavior r10 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r10
            int r10 = r10.f11593v
            int r13 = r4.f21669d
            int r10 = r10 + r13
        L56:
            java.lang.Object r13 = r3.f132b
            com.google.android.material.bottomsheet.BottomSheetBehavior r13 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r13
            boolean r14 = r13.f11588p
            int r15 = r4.f21668c
            int r4 = r4.a
            int r8 = r5.a
            if (r14 == 0) goto L6a
            if (r7 == 0) goto L68
            r11 = r15
            goto L69
        L68:
            r11 = r4
        L69:
            int r11 = r11 + r8
        L6a:
            boolean r13 = r13.f11589q
            int r14 = r5.f17911c
            if (r13 == 0) goto L75
            if (r7 == 0) goto L73
            r15 = r4
        L73:
            int r12 = r15 + r14
        L75:
            android.view.ViewGroup$LayoutParams r4 = r17.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            java.lang.Object r7 = r3.f132b
            com.google.android.material.bottomsheet.BottomSheetBehavior r7 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r7
            boolean r13 = r7.f11591s
            if (r13 == 0) goto L8b
            int r13 = r4.leftMargin
            if (r13 == r8) goto L8b
            r4.leftMargin = r8
            r8 = r9
            goto L8c
        L8b:
            r8 = 0
        L8c:
            boolean r13 = r7.f11592t
            if (r13 == 0) goto L97
            int r13 = r4.rightMargin
            if (r13 == r14) goto L97
            r4.rightMargin = r14
            r8 = r9
        L97:
            boolean r7 = r7.u
            if (r7 == 0) goto La4
            int r7 = r4.topMargin
            int r5 = r5.f17910b
            if (r7 == r5) goto La4
            r4.topMargin = r5
            goto La5
        La4:
            r9 = r8
        La5:
            if (r9 == 0) goto Laa
            r1.setLayoutParams(r4)
        Laa:
            int r4 = r17.getPaddingTop()
            r1.setPadding(r11, r4, r12, r10)
            boolean r1 = r3.a
            if (r1 == 0) goto Lbd
            java.lang.Object r4 = r3.f132b
            com.google.android.material.bottomsheet.BottomSheetBehavior r4 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r4
            int r5 = r6.f17912d
            r4.f11585m = r5
        Lbd:
            java.lang.Object r3 = r3.f132b
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r3
            boolean r4 = r3.f11587o
            if (r4 != 0) goto Lc7
            if (r1 == 0) goto Lca
        Lc7:
            r3.P()
        Lca:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.c.t(android.view.View, n0.r2):n0.r2");
    }

    @Override // x7.r
    public final void u(int i10, v8.z zVar) {
        Pair r6 = r(i10, zVar);
        if (r6 != null) {
            ((e0) ((w1) this.f24000d).f24829i).c(new t1(this, r6, 3));
        }
    }

    public final synchronized List v(String str) {
        List list;
        if (!((List) this.f23999c).contains(str)) {
            ((List) this.f23999c).add(str);
        }
        list = (List) ((Map) this.f24000d).get(str);
        if (list == null) {
            list = new ArrayList();
            ((Map) this.f24000d).put(str, list);
        }
        return list;
    }

    public final synchronized ArrayList w(Class cls, Class cls2) {
        ArrayList arrayList;
        boolean z10;
        arrayList = new ArrayList();
        Iterator it = ((List) this.f23999c).iterator();
        while (it.hasNext()) {
            List<d> list = (List) ((Map) this.f24000d).get((String) it.next());
            if (list != null) {
                for (d dVar : list) {
                    if (dVar.a.isAssignableFrom(cls) && cls2.isAssignableFrom(dVar.f24001b)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && !arrayList.contains(dVar.f24001b)) {
                        arrayList.add(dVar.f24001b);
                    }
                }
            }
        }
        return arrayList;
    }

    public final void x(Exception exc, boolean z10) {
        int i10;
        this.f24000d = null;
        com.google.common.collect.r0 i11 = com.google.common.collect.r0.i((Set) this.f23999c);
        ((Set) this.f23999c).clear();
        n0 listIterator = i11.listIterator(0);
        while (listIterator.hasNext()) {
            x7.d dVar = (x7.d) listIterator.next();
            dVar.getClass();
            if (z10) {
                i10 = 1;
            } else {
                i10 = 3;
            }
            dVar.k(i10, exc);
        }
    }

    @Override // v8.d0
    public final void z(int i10, v8.z zVar, u uVar) {
        Pair r6 = r(i10, zVar);
        if (r6 != null) {
            ((e0) ((w1) this.f24000d).f24829i).c(new s1(this, r6, uVar, 0));
        }
    }

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.f23998b = i10;
        this.f24000d = obj;
        this.f23999c = obj2;
    }

    public c(v callable) {
        this.f23998b = 2;
        Intrinsics.checkNotNullParameter(callable, "callable");
        this.f24000d = new CountDownLatch(1);
        com.facebook.x.c().execute(new FutureTask(new m3.f(2, this, callable)));
    }

    public /* synthetic */ c(Object obj, Object obj2, int i10) {
        this.f23998b = i10;
        this.f23999c = obj;
        this.f24000d = obj2;
    }

    public c(int i10) {
        this.f23998b = i10;
        if (i10 == 1) {
            this.f23999c = new ArrayList();
            this.f24000d = new HashMap();
            return;
        }
        if (i10 == 13) {
            this.f24000d = new HashMap();
            return;
        }
        if (i10 != 25) {
            switch (i10) {
                case 7:
                    return;
                case 8:
                    return;
                case 9:
                    return;
                case 10:
                    return;
                case 11:
                    return;
                default:
                    this.f23999c = new AtomicReference();
                    this.f24000d = new r.b();
                    return;
            }
        }
        this.f23999c = new ByteArrayOutputStream(512);
        this.f24000d = new DataOutputStream((ByteArrayOutputStream) this.f23999c);
    }

    public c(List list) {
        this.f23998b = 23;
        this.f23999c = list;
        this.f24000d = new a0[list.size()];
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(n9.f0 f0Var, int i10) {
        this(f0Var);
        this.f23998b = 22;
    }

    public c(n9.f0 f0Var) {
        this.f23998b = 22;
        this.f23999c = f0Var;
        this.f24000d = new x();
    }

    public c(Context context) {
        this.f23998b = 12;
        this.f24000d = null;
        this.f23999c = context;
    }

    public c(g gVar, SparseArray sparseArray) {
        this.f23998b = 17;
        this.f23999c = gVar;
        SparseArray sparseArray2 = new SparseArray(gVar.b());
        for (int i10 = 0; i10 < gVar.b(); i10++) {
            int a = gVar.a(i10);
            t7.b bVar = (t7.b) sparseArray.get(a);
            bVar.getClass();
            sparseArray2.append(a, bVar);
        }
        this.f24000d = sparseArray2;
    }

    public c(Handler handler, s7.f0 f0Var) {
        this.f23998b = 18;
        this.f23999c = handler;
        this.f24000d = f0Var;
    }

    public c(f0 f0Var) {
        this.f23998b = 24;
        this.f24000d = f0Var;
        this.f23999c = new c0(new byte[4], 2, (Object) null);
    }

    public c() {
        this.f23998b = 19;
        this.f23999c = new HashSet();
    }

    public c(Uri uri) {
        this.f23998b = 15;
        this.f23999c = uri;
    }

    public c(x9.h hVar, x9.h hVar2) {
        this.f23998b = 28;
        if (hVar.a <= hVar2.a) {
            this.f23999c = hVar;
            this.f24000d = hVar2;
            return;
        }
        throw new IllegalArgumentException();
    }
}
