package androidx.work;

import android.opengl.GLES20;
import android.util.Log;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p implements y7.n {

    /* renamed from: c, reason: collision with root package name */
    public static p f2226c;

    /* renamed from: b, reason: collision with root package name */
    public int f2227b;

    public p() {
    }

    public static synchronized p e() {
        p pVar;
        synchronized (p.class) {
            if (f2226c == null) {
                f2226c = new p(3);
            }
            pVar = f2226c;
        }
        return pVar;
    }

    public static String g(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public void a() {
        GLES20.glActiveTexture(UInt.m240constructorimpl(33984));
        GLES20.glBindTexture(UInt.m240constructorimpl(36197), UInt.m240constructorimpl(this.f2227b));
        bf.c.b("bind");
    }

    public void b(String str, String str2, Throwable... thArr) {
        if (this.f2227b <= 3) {
            if (thArr.length >= 1) {
                Log.d(str, str2, thArr[0]);
            } else {
                Log.d(str, str2);
            }
        }
    }

    public void c(String str, String str2, Throwable... thArr) {
        if (this.f2227b <= 6) {
            if (thArr.length >= 1) {
                Log.e(str, str2, thArr[0]);
            } else {
                Log.e(str, str2);
            }
        }
    }

    @Override // y7.n
    public void d(y7.x xVar) {
        switch (this.f2227b) {
            case 0:
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // y7.n
    public void endTracks() {
        switch (this.f2227b) {
            case 0:
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public void f(String str, String str2, Throwable... thArr) {
        if (this.f2227b <= 4) {
            if (thArr.length >= 1) {
                Log.i(str, str2, thArr[0]);
            } else {
                Log.i(str, str2);
            }
        }
    }

    public void h(String str, String str2, Throwable... thArr) {
        if (this.f2227b <= 5) {
            if (thArr.length >= 1) {
                Log.w(str, str2, thArr[0]);
            } else {
                Log.w(str, str2);
            }
        }
    }

    @Override // y7.n
    public y7.a0 track(int i10, int i11) {
        switch (this.f2227b) {
            case 0:
                return new y7.k();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public /* synthetic */ p(int i10) {
        this.f2227b = i10;
    }

    public p(int i10, int i11, Integer num) {
        int intValue;
        int i12 = 1;
        if (num == null) {
            int[] m294constructorimpl = UIntArray.m294constructorimpl(1);
            int m301getSizeimpl = UIntArray.m301getSizeimpl(m294constructorimpl);
            int[] iArr = new int[m301getSizeimpl];
            for (int i13 = 0; i13 < m301getSizeimpl; i13++) {
                iArr[i13] = UIntArray.m300getpVg5ArA(m294constructorimpl, i13);
            }
            GLES20.glGenTextures(1, iArr, 0);
            Unit unit = Unit.INSTANCE;
            UIntArray.m305setVXSXFK8(m294constructorimpl, 0, UInt.m240constructorimpl(iArr[0]));
            bf.c.b("glGenTextures");
            intValue = UIntArray.m300getpVg5ArA(m294constructorimpl, 0);
        } else {
            intValue = num.intValue();
        }
        this.f2227b = intValue;
        if (num == null) {
            b1.a block = new b1.a(i12, this, null);
            Intrinsics.checkNotNullParameter(this, "<this>");
            Intrinsics.checkNotNullParameter(block, "block");
            a();
            block.invoke();
            GLES20.glBindTexture(UInt.m240constructorimpl(36197), UInt.m240constructorimpl(0));
            GLES20.glActiveTexture(df.f.f17022c);
            bf.c.b("unbind");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i10, int i11) {
        this(0);
        this.f2227b = i10;
        int i12 = 1;
        if (i10 != 1) {
        } else {
            this(i12);
        }
    }
}
