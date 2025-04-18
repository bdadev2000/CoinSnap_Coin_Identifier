package f0;

import android.content.res.ColorStateList;
import android.graphics.Shader;
import android.util.SparseArray;
import com.applovin.impl.fw;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import h.s0;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.UByte;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import n9.h0;
import n9.x;
import s7.r0;
import v8.b0;
import v8.c0;
import v8.u;
import v8.u0;
import v8.w0;
import v8.z;
import y7.s;

/* loaded from: classes.dex */
public final class c implements y7.d, rb.a {

    /* renamed from: b, reason: collision with root package name */
    public int f17515b;

    /* renamed from: c, reason: collision with root package name */
    public Object f17516c;

    /* renamed from: d, reason: collision with root package name */
    public Object f17517d;

    public /* synthetic */ c() {
        this.f17515b = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x017e, code lost:
    
        if (r8.size() <= 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0180, code lost:
    
        r0 = new d3.g(r8, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0187, code lost:
    
        if (r0 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x018a, code lost:
    
        if (r19 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x018c, code lost:
    
        r0 = new d3.g(r5, r10, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0192, code lost:
    
        r0 = new d3.g(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0198, code lost:
    
        if (r11 == 1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x019b, code lost:
    
        if (r11 == 2) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x019d, code lost:
    
        r16 = (int[]) r0.f16812c;
        r17 = (float[]) r0.f16813d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01ab, code lost:
    
        if (r7 == 1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ad, code lost:
    
        if (r7 == 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01af, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01b7, code lost:
    
        r3 = new android.graphics.LinearGradient(r12, r26, r25, r15, r16, r17, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x020f, code lost:
    
        return new f0.c(0, r3, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01b2, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01b5, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01c4, code lost:
    
        r3 = new android.graphics.SweepGradient(r7, r9, (int[]) r0.f16812c, (float[]) r0.f16813d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01dd, code lost:
    
        if (r8 <= 0.0f) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01df, code lost:
    
        r1 = (int[]) r0.f16812c;
        r21 = (float[]) r0.f16813d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01ec, code lost:
    
        if (r7 == 1) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ef, code lost:
    
        if (r7 == 2) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01f1, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01f9, code lost:
    
        r3 = new android.graphics.RadialGradient(r7, r9, r8, r1, r21, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01f4, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01f7, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0217, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0186, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static f0.c c(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.c.c(android.content.res.Resources, int, android.content.res.Resources$Theme):f0.c");
    }

    @Override // rb.a
    public final StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f17515b) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (rb.a aVar : (rb.a[]) this.f17516c) {
            if (stackTraceElementArr2.length <= this.f17515b) {
                break;
            }
            stackTraceElementArr2 = aVar.a(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > this.f17515b) {
            return ((w3.l) this.f17517d).a(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }

    public final void b(int i10, w0 w0Var) {
        boolean z10;
        boolean z11 = false;
        if (this.f17515b == -1) {
            if (((SparseArray) this.f17516c).size() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            u0.m(z10);
            this.f17515b = 0;
        }
        if (((SparseArray) this.f17516c).size() > 0) {
            SparseArray sparseArray = (SparseArray) this.f17516c;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            if (i10 >= keyAt) {
                z11 = true;
            }
            u0.d(z11);
            if (keyAt == i10) {
                n9.c cVar = (n9.c) this.f17517d;
                SparseArray sparseArray2 = (SparseArray) this.f17516c;
                cVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        ((SparseArray) this.f17516c).append(i10, w0Var);
    }

    public final void d(int i10, r0 r0Var, int i11, Object obj, long j3) {
        e(new u(1, i10, r0Var, i11, obj, h0.Q(j3), C.TIME_UNSET));
    }

    public final void e(u uVar) {
        Iterator it = ((CopyOnWriteArrayList) this.f17517d).iterator();
        while (it.hasNext()) {
            c0 c0Var = (c0) it.next();
            h0.L(c0Var.a, new androidx.emoji2.text.n(13, this, c0Var.f26082b, uVar));
        }
    }

    public final long f(y7.m mVar) {
        int b3;
        while (mVar.getPeekPosition() < mVar.getLength() - 6) {
            s sVar = (s) this.f17516c;
            int i10 = this.f17515b;
            y7.p pVar = (y7.p) this.f17517d;
            long peekPosition = mVar.getPeekPosition();
            byte[] bArr = new byte[2];
            int i11 = 0;
            boolean g10 = false;
            mVar.peekFully(bArr, 0, 2);
            if ((((bArr[0] & UByte.MAX_VALUE) << 8) | (bArr[1] & UByte.MAX_VALUE)) != i10) {
                mVar.resetPeekPosition();
                mVar.advancePeekPosition((int) (peekPosition - mVar.getPosition()));
            } else {
                x xVar = new x(16);
                System.arraycopy(bArr, 0, xVar.a, 0, 2);
                byte[] bArr2 = xVar.a;
                while (i11 < 14 && (b3 = mVar.b(2 + i11, 14 - i11, bArr2)) != -1) {
                    i11 += b3;
                }
                xVar.F(i11);
                mVar.resetPeekPosition();
                mVar.advancePeekPosition((int) (peekPosition - mVar.getPosition()));
                g10 = com.bumptech.glide.c.g(xVar, sVar, i10, pVar);
            }
            if (g10) {
                break;
            }
            mVar.advancePeekPosition(1);
        }
        if (mVar.getPeekPosition() >= mVar.getLength() - 6) {
            mVar.advancePeekPosition((int) (mVar.getLength() - mVar.getPeekPosition()));
            return ((s) this.f17516c).f28002j;
        }
        return ((y7.p) this.f17517d).a;
    }

    @Override // y7.d
    public final s0 g(y7.m mVar, long j3) {
        long position = mVar.getPosition();
        long f10 = f(mVar);
        long peekPosition = mVar.getPeekPosition();
        mVar.advancePeekPosition(Math.max(6, ((s) this.f17516c).f27995c));
        long f11 = f(mVar);
        long peekPosition2 = mVar.getPeekPosition();
        if (f10 <= j3 && f11 > j3) {
            return s0.b(peekPosition);
        }
        if (f11 <= j3) {
            return new s0(-2, f11, peekPosition2);
        }
        return new s0(-1, f10, position);
    }

    public final Object i(int i10) {
        if (this.f17515b == -1) {
            this.f17515b = 0;
        }
        while (true) {
            int i11 = this.f17515b;
            if (i11 <= 0 || i10 >= ((SparseArray) this.f17516c).keyAt(i11)) {
                break;
            }
            this.f17515b--;
        }
        while (this.f17515b < ((SparseArray) this.f17516c).size() - 1 && i10 >= ((SparseArray) this.f17516c).keyAt(this.f17515b + 1)) {
            this.f17515b++;
        }
        return ((SparseArray) this.f17516c).valueAt(this.f17515b);
    }

    public final Object j() {
        return ((SparseArray) this.f17516c).valueAt(((SparseArray) r0).size() - 1);
    }

    public final boolean k() {
        if (((Shader) this.f17516c) == null) {
            Object obj = this.f17517d;
            if (((ColorStateList) obj) != null && ((ColorStateList) obj).isStateful()) {
                return true;
            }
        }
        return false;
    }

    public final void l(v8.p pVar, int i10, int i11, r0 r0Var, int i12, Object obj, long j3, long j10) {
        m(pVar, new u(i10, i11, r0Var, i12, obj, h0.Q(j3), h0.Q(j10)));
    }

    public final void m(v8.p pVar, u uVar) {
        Iterator it = ((CopyOnWriteArrayList) this.f17517d).iterator();
        while (it.hasNext()) {
            c0 c0Var = (c0) it.next();
            h0.L(c0Var.a, new b0(this, c0Var.f26082b, pVar, uVar, 2));
        }
    }

    public final void n(v8.p pVar, int i10, int i11, r0 r0Var, int i12, Object obj, long j3, long j10) {
        o(pVar, new u(i10, i11, r0Var, i12, obj, h0.Q(j3), h0.Q(j10)));
    }

    public final void o(v8.p pVar, u uVar) {
        Iterator it = ((CopyOnWriteArrayList) this.f17517d).iterator();
        while (it.hasNext()) {
            c0 c0Var = (c0) it.next();
            h0.L(c0Var.a, new b0(this, c0Var.f26082b, pVar, uVar, 1));
        }
    }

    public final void p(v8.p pVar, int i10, int i11, r0 r0Var, int i12, Object obj, long j3, long j10, IOException iOException, boolean z10) {
        q(pVar, new u(i10, i11, r0Var, i12, obj, h0.Q(j3), h0.Q(j10)), iOException, z10);
    }

    public final void q(v8.p pVar, u uVar, IOException iOException, boolean z10) {
        Iterator it = ((CopyOnWriteArrayList) this.f17517d).iterator();
        while (it.hasNext()) {
            c0 c0Var = (c0) it.next();
            h0.L(c0Var.a, new fw(this, c0Var.f26082b, pVar, uVar, iOException, z10, 2));
        }
    }

    public final void r(v8.p pVar, int i10, int i11, r0 r0Var, int i12, Object obj, long j3, long j10) {
        s(pVar, new u(i10, i11, r0Var, i12, obj, h0.Q(j3), h0.Q(j10)));
    }

    public final void s(v8.p pVar, u uVar) {
        Iterator it = ((CopyOnWriteArrayList) this.f17517d).iterator();
        while (it.hasNext()) {
            c0 c0Var = (c0) it.next();
            h0.L(c0Var.a, new b0(this, c0Var.f26082b, pVar, uVar, 0));
        }
    }

    public final boolean t(int[] iArr) {
        if (k()) {
            ColorStateList colorStateList = (ColorStateList) this.f17517d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f17515b) {
                this.f17515b = colorForState;
                return true;
            }
        }
        return false;
    }

    public final void u(u uVar) {
        z zVar = (z) this.f17516c;
        zVar.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.f17517d).iterator();
        while (it.hasNext()) {
            c0 c0Var = (c0) it.next();
            h0.L(c0Var.a, new c3.b(9, this, c0Var.f26082b, zVar, uVar));
        }
    }

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.f17516c = obj;
        this.f17517d = obj2;
        this.f17515b = i10;
    }

    public /* synthetic */ c(Object obj, int i10, Serializable serializable) {
        this.f17516c = obj;
        this.f17515b = i10;
        this.f17517d = serializable;
    }

    public c(rb.a... aVarArr) {
        int i10 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        this.f17515b = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        this.f17516c = aVarArr;
        this.f17517d = new w3.l(i10, 1);
    }

    public c(nb.a aVar) {
        this.f17516c = new SparseArray();
        this.f17517d = aVar;
        this.f17515b = -1;
    }

    public c(s sVar, int i10) {
        this.f17516c = sVar;
        this.f17515b = i10;
        this.f17517d = new y7.p();
    }

    public c(CopyOnWriteArrayList copyOnWriteArrayList, int i10, z zVar) {
        this.f17517d = copyOnWriteArrayList;
        this.f17515b = i10;
        this.f17516c = zVar;
    }

    public c(g4.q qVar) {
        this.f17517d = p6.a.w(150, new fb.c(this, 14));
        this.f17516c = qVar;
    }
}
