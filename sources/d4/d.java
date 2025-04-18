package d4;

import a4.j;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f16834b;

    /* renamed from: c, reason: collision with root package name */
    public c f16835c;
    public final byte[] a = new byte[NotificationCompat.FLAG_LOCAL_ONLY];

    /* renamed from: d, reason: collision with root package name */
    public int f16836d = 0;

    public final boolean a() {
        return this.f16835c.f16824b != 0;
    }

    public final c b() {
        boolean z10;
        boolean z11;
        boolean z12;
        byte[] bArr;
        boolean z13;
        if (this.f16834b != null) {
            if (a()) {
                return this.f16835c;
            }
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < 6; i10++) {
                sb2.append((char) c());
            }
            if (!sb2.toString().startsWith("GIF")) {
                this.f16835c.f16824b = 1;
            } else {
                this.f16835c.f16828f = f();
                this.f16835c.f16829g = f();
                int c10 = c();
                c cVar = this.f16835c;
                if ((c10 & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cVar.f16830h = z10;
                cVar.f16831i = (int) Math.pow(2.0d, (c10 & 7) + 1);
                this.f16835c.f16832j = c();
                c cVar2 = this.f16835c;
                c();
                cVar2.getClass();
                if (this.f16835c.f16830h && !a()) {
                    c cVar3 = this.f16835c;
                    cVar3.a = e(cVar3.f16831i);
                    c cVar4 = this.f16835c;
                    cVar4.f16833k = cVar4.a[cVar4.f16832j];
                }
            }
            if (!a()) {
                boolean z14 = false;
                while (!z14 && !a() && this.f16835c.f16825c <= Integer.MAX_VALUE) {
                    int c11 = c();
                    if (c11 != 33) {
                        if (c11 != 44) {
                            if (c11 != 59) {
                                this.f16835c.f16824b = 1;
                            } else {
                                z14 = true;
                            }
                        } else {
                            c cVar5 = this.f16835c;
                            if (cVar5.f16826d == null) {
                                cVar5.f16826d = new b();
                            }
                            cVar5.f16826d.a = f();
                            this.f16835c.f16826d.f16814b = f();
                            this.f16835c.f16826d.f16815c = f();
                            this.f16835c.f16826d.f16816d = f();
                            int c12 = c();
                            if ((c12 & 128) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            int pow = (int) Math.pow(2.0d, (c12 & 7) + 1);
                            b bVar = this.f16835c.f16826d;
                            if ((c12 & 64) != 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            bVar.f16817e = z12;
                            if (z11) {
                                bVar.f16823k = e(pow);
                            } else {
                                bVar.f16823k = null;
                            }
                            this.f16835c.f16826d.f16822j = this.f16834b.position();
                            c();
                            g();
                            if (!a()) {
                                c cVar6 = this.f16835c;
                                cVar6.f16825c++;
                                cVar6.f16827e.add(cVar6.f16826d);
                            }
                        }
                    } else {
                        int c13 = c();
                        if (c13 != 1) {
                            if (c13 != 249) {
                                if (c13 != 254) {
                                    if (c13 != 255) {
                                        g();
                                    } else {
                                        d();
                                        StringBuilder sb3 = new StringBuilder();
                                        int i11 = 0;
                                        while (true) {
                                            bArr = this.a;
                                            if (i11 >= 11) {
                                                break;
                                            }
                                            sb3.append((char) bArr[i11]);
                                            i11++;
                                        }
                                        if (sb3.toString().equals("NETSCAPE2.0")) {
                                            do {
                                                d();
                                                if (bArr[0] == 1) {
                                                    byte b3 = bArr[1];
                                                    byte b10 = bArr[2];
                                                    this.f16835c.getClass();
                                                }
                                                if (this.f16836d > 0) {
                                                }
                                            } while (!a());
                                        } else {
                                            g();
                                        }
                                    }
                                } else {
                                    g();
                                }
                            } else {
                                this.f16835c.f16826d = new b();
                                c();
                                int c14 = c();
                                b bVar2 = this.f16835c.f16826d;
                                int i12 = (c14 & 28) >> 2;
                                bVar2.f16819g = i12;
                                if (i12 == 0) {
                                    bVar2.f16819g = 1;
                                }
                                if ((c14 & 1) != 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                bVar2.f16818f = z13;
                                int f10 = f();
                                if (f10 < 2) {
                                    f10 = 10;
                                }
                                b bVar3 = this.f16835c.f16826d;
                                bVar3.f16821i = f10 * 10;
                                bVar3.f16820h = c();
                                c();
                            }
                        } else {
                            g();
                        }
                    }
                }
                c cVar7 = this.f16835c;
                if (cVar7.f16825c < 0) {
                    cVar7.f16824b = 1;
                }
            }
            return this.f16835c;
        }
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    public final int c() {
        try {
            return this.f16834b.get() & UByte.MAX_VALUE;
        } catch (Exception unused) {
            this.f16835c.f16824b = 1;
            return 0;
        }
    }

    public final void d() {
        int c10 = c();
        this.f16836d = c10;
        if (c10 > 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                try {
                    i11 = this.f16836d;
                    if (i10 < i11) {
                        i11 -= i10;
                        this.f16834b.get(this.a, i10, i11);
                        i10 += i11;
                    } else {
                        return;
                    }
                } catch (Exception e2) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        StringBuilder n10 = j.n("Error Reading Block n: ", i10, " count: ", i11, " blockSize: ");
                        n10.append(this.f16836d);
                        Log.d("GifHeaderParser", n10.toString(), e2);
                    }
                    this.f16835c.f16824b = 1;
                    return;
                }
            }
        }
    }

    public final int[] e(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f16834b.get(bArr);
            iArr = new int[NotificationCompat.FLAG_LOCAL_ONLY];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = i12 + 1;
                int i14 = i13 + 1;
                int i15 = i14 + 1;
                int i16 = i11 + 1;
                iArr[i11] = ((bArr[i12] & UByte.MAX_VALUE) << 16) | ViewCompat.MEASURED_STATE_MASK | ((bArr[i13] & UByte.MAX_VALUE) << 8) | (bArr[i14] & UByte.MAX_VALUE);
                i12 = i15;
                i11 = i16;
            }
        } catch (BufferUnderflowException e2) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e2);
            }
            this.f16835c.f16824b = 1;
        }
        return iArr;
    }

    public final int f() {
        return this.f16834b.getShort();
    }

    public final void g() {
        int c10;
        do {
            c10 = c();
            this.f16834b.position(Math.min(this.f16834b.position() + c10, this.f16834b.limit()));
        } while (c10 > 0);
    }
}
