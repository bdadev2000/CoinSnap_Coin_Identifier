package androidx.activity.result;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.i3;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.datepicker.l;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import h.s0;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import n0.r2;
import n0.z;
import n9.f0;
import n9.h0;
import n9.x;
import v8.u0;
import y7.m;
import z.n;
import z.r;

/* loaded from: classes.dex */
public final class i implements y7.d, z {

    /* renamed from: b, reason: collision with root package name */
    public int f608b;

    /* renamed from: c, reason: collision with root package name */
    public int f609c;

    /* renamed from: d, reason: collision with root package name */
    public Object f610d;

    /* renamed from: f, reason: collision with root package name */
    public Object f611f;

    public i(String str, int i10, int i11, int i12) {
        this.f610d = str;
        this.f609c = i10;
        this.f608b = i11;
        byte[] bArr = new byte[i10 * i11];
        this.f611f = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    public final synchronized void a(long j3, Object obj) {
        if (this.f609c > 0) {
            if (j3 <= ((long[]) this.f610d)[((this.f608b + r0) - 1) % ((Object[]) this.f611f).length]) {
                c();
            }
        }
        d();
        int i10 = this.f608b;
        int i11 = this.f609c;
        Object obj2 = this.f611f;
        int length = (i10 + i11) % ((Object[]) obj2).length;
        ((long[]) this.f610d)[length] = j3;
        ((Object[]) obj2)[length] = obj;
        this.f609c = i11 + 1;
    }

    public final j b() {
        return new j((IntentSender) this.f610d, (Intent) this.f611f, this.f608b, this.f609c);
    }

    public final synchronized void c() {
        this.f608b = 0;
        this.f609c = 0;
        Arrays.fill((Object[]) this.f611f, (Object) null);
    }

    public final void d() {
        int length = ((Object[]) this.f611f).length;
        if (this.f609c < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        Object[] objArr = new Object[i10];
        int i11 = this.f608b;
        int i12 = length - i11;
        System.arraycopy((long[]) this.f610d, i11, jArr, 0, i12);
        System.arraycopy((Object[]) this.f611f, this.f608b, objArr, 0, i12);
        int i13 = this.f608b;
        if (i13 > 0) {
            System.arraycopy((long[]) this.f610d, 0, jArr, i12, i13);
            System.arraycopy((Object[]) this.f611f, 0, objArr, i12, this.f608b);
        }
        this.f610d = jArr;
        this.f611f = objArr;
        this.f608b = 0;
    }

    public final void e(int i10, int i11, int i12, int i13) {
        if (i10 < 0) {
            int i14 = this.f608b;
            i10 += i14;
            i11 += 4 - ((i14 + 4) % 8);
        }
        if (i11 < 0) {
            int i15 = this.f609c;
            i11 += i15;
            i10 += 4 - ((i15 + 4) % 8);
        }
        int i16 = 1;
        if ((((CharSequence) this.f610d).charAt(i12) & (1 << (8 - i13))) == 0) {
            i16 = 0;
        }
        ((byte[]) this.f611f)[(i10 * this.f609c) + i11] = (byte) i16;
    }

    public final Object f(long j3, boolean z10) {
        Object obj = null;
        long j10 = Long.MAX_VALUE;
        while (this.f609c > 0) {
            long j11 = j3 - ((long[]) this.f610d)[this.f608b];
            if (j11 < 0 && (z10 || (-j11) >= j10)) {
                break;
            }
            obj = i();
            j10 = j11;
        }
        return obj;
    }

    @Override // y7.d
    public final s0 g(m mVar, long j3) {
        long position = mVar.getPosition();
        int min = (int) Math.min(this.f609c, mVar.getLength() - position);
        ((x) this.f611f).D(min);
        mVar.peekFully(((x) this.f611f).a, 0, min);
        x xVar = (x) this.f611f;
        int i10 = xVar.f22600c;
        long j10 = -1;
        long j11 = -1;
        long j12 = C.TIME_UNSET;
        while (true) {
            int i11 = xVar.f22600c;
            int i12 = xVar.f22599b;
            if (i11 - i12 < 188) {
                break;
            }
            byte[] bArr = xVar.a;
            while (i12 < i10 && bArr[i12] != 71) {
                i12++;
            }
            int i13 = i12 + 188;
            if (i13 > i10) {
                break;
            }
            long x10 = com.bumptech.glide.d.x(i12, this.f608b, xVar);
            if (x10 != C.TIME_UNSET) {
                long b3 = ((f0) this.f610d).b(x10);
                if (b3 > j3) {
                    if (j12 == C.TIME_UNSET) {
                        return new s0(-1, b3, position);
                    }
                    return s0.b(position + j11);
                }
                if (100000 + b3 > j3) {
                    return s0.b(position + i12);
                }
                j12 = b3;
                j11 = i12;
            }
            xVar.G(i13);
            j10 = i13;
        }
        if (j12 != C.TIME_UNSET) {
            return new s0(-2, j12, position + j10);
        }
        return s0.f18659e;
    }

    @Override // y7.d
    public final void h() {
        x xVar = (x) this.f611f;
        byte[] bArr = h0.f22548f;
        xVar.getClass();
        xVar.E(bArr, bArr.length);
    }

    public final Object i() {
        boolean z10;
        if (this.f609c > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.m(z10);
        Object obj = this.f611f;
        int i10 = this.f608b;
        Object obj2 = ((Object[]) obj)[i10];
        ((Object[]) obj)[i10] = null;
        this.f608b = (i10 + 1) % ((Object[]) obj).length;
        this.f609c--;
        return obj2;
    }

    public final void j(int i10, int i11, int i12) {
        int i13 = i10 - 2;
        int i14 = i11 - 2;
        e(i13, i14, i12, 1);
        int i15 = i11 - 1;
        e(i13, i15, i12, 2);
        int i16 = i10 - 1;
        e(i16, i14, i12, 3);
        e(i16, i15, i12, 4);
        e(i16, i11, i12, 5);
        e(i10, i14, i12, 6);
        e(i10, i15, i12, 7);
        e(i10, i11, i12, 8);
    }

    @Override // n0.z
    public final r2 t(View view, r2 r2Var) {
        int i10 = r2Var.a(7).f17910b;
        if (this.f608b >= 0) {
            ((View) this.f610d).getLayoutParams().height = this.f608b + i10;
            View view2 = (View) this.f610d;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        View view3 = (View) this.f610d;
        view3.setPadding(view3.getPaddingLeft(), this.f609c + i10, ((View) this.f610d).getPaddingRight(), ((View) this.f610d).getPaddingBottom());
        return r2Var;
    }

    public i() {
        this(10, 6);
    }

    public i(IntentSender intentSender) {
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.f610d = intentSender;
    }

    public i(int i10, f0 f0Var, int i11) {
        this.f608b = i10;
        this.f610d = f0Var;
        this.f609c = i11;
        this.f611f = new x();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i(android.app.PendingIntent r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pendingIntent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.content.IntentSender r2 = r2.getIntentSender()
            java.lang.String r0 = "pendingIntent.intentSender"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.result.i.<init>(android.app.PendingIntent):void");
    }

    public i(TextPaint textPaint) {
        this.f610d = textPaint;
        this.f608b = 1;
        this.f609c = 1;
        this.f611f = TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }

    public i(Context context, XmlResourceParser xmlResourceParser) {
        this.f610d = new ArrayList();
        this.f609c = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f28451h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                this.f608b = obtainStyledAttributes.getResourceId(index, this.f608b);
            } else if (index == 1) {
                this.f609c = obtainStyledAttributes.getResourceId(index, this.f609c);
                String resourceTypeName = context.getResources().getResourceTypeName(this.f609c);
                context.getResources().getResourceName(this.f609c);
                if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                    n nVar = new n();
                    this.f611f = nVar;
                    nVar.b((ConstraintLayout) LayoutInflater.from(context).inflate(this.f609c, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public i(int i10, float[] fArr, float[] fArr2, int i11) {
        this.f608b = i10;
        u0.d(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.f610d = fArr;
        this.f611f = fArr2;
        this.f609c = i11;
    }

    public i(i iVar) {
        Object obj = iVar.f610d;
        this.f608b = ((float[]) obj).length / 3;
        this.f610d = com.bumptech.glide.c.p((float[]) obj);
        this.f611f = com.bumptech.glide.c.p((float[]) iVar.f611f);
        int i10 = iVar.f609c;
        if (i10 == 1) {
            this.f609c = 5;
        } else if (i10 != 2) {
            this.f609c = 4;
        } else {
            this.f609c = 6;
        }
    }

    public i(String str, int i10, int i11) {
        this.f610d = str;
        this.f608b = i10;
        this.f609c = i11;
        this.f611f = new float[16];
    }

    public i(l lVar, int i10, View view, int i11) {
        this.f611f = lVar;
        this.f608b = i10;
        this.f610d = view;
        this.f609c = i11;
    }

    public i(na.m mVar, i3 i3Var) {
        this.f610d = new SparseArray();
        this.f611f = mVar;
        this.f608b = i3Var.i(28, 0);
        this.f609c = i3Var.i(52, 0);
    }

    public i(int i10, int i11) {
        if (i11 != 6) {
            this.f610d = new g8.r[i10];
            this.f609c = 0;
        } else {
            this.f610d = new long[i10];
            this.f611f = new Object[i10];
        }
    }
}
