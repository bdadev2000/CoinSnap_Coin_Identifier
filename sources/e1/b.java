package e1;

import android.widget.EditText;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.lang.reflect.Array;
import n9.h0;
import n9.o;
import n9.x;
import s7.r0;
import u7.p;

/* loaded from: classes.dex */
public final class b implements g8.e {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public int f17069b;

    /* renamed from: c, reason: collision with root package name */
    public int f17070c;

    /* renamed from: d, reason: collision with root package name */
    public Object f17071d;

    public b(int i10, int i11, int i12) {
        this.a = i12;
        if (i12 != 5) {
            this.f17071d = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i11, i10);
            this.f17069b = i10;
            this.f17070c = i11;
        } else {
            this.f17071d = null;
            this.f17069b = i10;
            int i13 = i11 & 7;
            this.f17070c = i13 == 0 ? 8 : i13;
        }
    }

    @Override // g8.e
    public final int a() {
        return this.f17069b;
    }

    public final byte b(int i10, int i11) {
        return ((byte[][]) this.f17071d)[i11][i10];
    }

    public final void c(int i10, int i11, int i12) {
        ((byte[][]) this.f17071d)[i11][i10] = (byte) i12;
    }

    public final void d(int i10, int i11, boolean z10) {
        ((byte[][]) this.f17071d)[i11][i10] = z10 ? (byte) 1 : (byte) 0;
    }

    @Override // g8.e
    public final int getSampleCount() {
        return this.f17070c;
    }

    @Override // g8.e
    public final int readNextSampleSize() {
        int i10 = this.f17069b;
        return i10 == -1 ? ((x) this.f17071d).y() : i10;
    }

    public final String toString() {
        switch (this.a) {
            case 4:
                StringBuilder sb2 = new StringBuilder((this.f17069b * 2 * this.f17070c) + 2);
                for (int i10 = 0; i10 < this.f17070c; i10++) {
                    byte[] bArr = ((byte[][]) this.f17071d)[i10];
                    for (int i11 = 0; i11 < this.f17069b; i11++) {
                        byte b3 = bArr[i11];
                        if (b3 != 0) {
                            if (b3 != 1) {
                                sb2.append("  ");
                            } else {
                                sb2.append(" 1");
                            }
                        } else {
                            sb2.append(" 0");
                        }
                    }
                    sb2.append('\n');
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public b(int i10) {
        this.a = i10;
        if (i10 != 5) {
            this.f17071d = p.a;
            this.f17070c = 0;
            this.f17069b = 2;
        } else {
            this.f17071d = new b[NotificationCompat.FLAG_LOCAL_ONLY];
            this.f17069b = 0;
            this.f17070c = 0;
        }
    }

    public b(EditText editText) {
        this.a = 0;
        this.f17069b = Integer.MAX_VALUE;
        this.f17070c = 0;
        if (editText != null) {
            this.f17071d = new a(editText);
            return;
        }
        throw new NullPointerException("editText cannot be null");
    }

    public b(byte[] bArr, int i10, int i11) {
        this.a = 1;
        this.f17071d = bArr;
        this.f17069b = i10;
        this.f17070c = i11;
    }

    public b(g8.b bVar, r0 r0Var) {
        this.a = 3;
        x xVar = bVar.f18246d;
        this.f17071d = xVar;
        xVar.G(12);
        int y4 = ((x) this.f17071d).y();
        if (MimeTypes.AUDIO_RAW.equals(r0Var.f24723n)) {
            int t5 = h0.t(r0Var.C, r0Var.A);
            if (y4 == 0 || y4 % t5 != 0) {
                o.f("AtomParsers", "Audio sample size mismatch. stsd sample size: " + t5 + ", stsz sample size: " + y4);
                y4 = t5;
            }
        }
        this.f17069b = y4 == 0 ? -1 : y4;
        this.f17070c = ((x) this.f17071d).y();
    }
}
