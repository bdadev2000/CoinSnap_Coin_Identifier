package M1;

import Q7.n0;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class c {
    public ByteBuffer b;

    /* renamed from: c, reason: collision with root package name */
    public b f1963c;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1962a = new byte[NotificationCompat.FLAG_LOCAL_ONLY];

    /* renamed from: d, reason: collision with root package name */
    public int f1964d = 0;

    public final boolean a() {
        if (this.f1963c.b != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r6v29, types: [M1.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v37, types: [M1.a, java.lang.Object] */
    public final b b() {
        boolean z8;
        boolean z9;
        boolean z10;
        byte[] bArr;
        boolean z11;
        if (this.b != null) {
            if (a()) {
                return this.f1963c;
            }
            StringBuilder sb = new StringBuilder();
            for (int i9 = 0; i9 < 6; i9++) {
                sb.append((char) c());
            }
            if (!sb.toString().startsWith("GIF")) {
                this.f1963c.b = 1;
            } else {
                this.f1963c.f1956f = this.b.getShort();
                this.f1963c.f1957g = this.b.getShort();
                int c9 = c();
                b bVar = this.f1963c;
                if ((c9 & 128) != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                bVar.f1958h = z8;
                bVar.f1959i = (int) Math.pow(2.0d, (c9 & 7) + 1);
                this.f1963c.f1960j = c();
                b bVar2 = this.f1963c;
                c();
                bVar2.getClass();
                if (this.f1963c.f1958h && !a()) {
                    b bVar3 = this.f1963c;
                    bVar3.f1952a = e(bVar3.f1959i);
                    b bVar4 = this.f1963c;
                    bVar4.f1961k = bVar4.f1952a[bVar4.f1960j];
                }
            }
            if (!a()) {
                boolean z12 = false;
                while (!z12 && !a() && this.f1963c.f1953c <= Integer.MAX_VALUE) {
                    int c10 = c();
                    if (c10 != 33) {
                        if (c10 != 44) {
                            if (c10 != 59) {
                                this.f1963c.b = 1;
                            } else {
                                z12 = true;
                            }
                        } else {
                            b bVar5 = this.f1963c;
                            if (bVar5.f1954d == null) {
                                bVar5.f1954d = new Object();
                            }
                            bVar5.f1954d.f1942a = this.b.getShort();
                            this.f1963c.f1954d.b = this.b.getShort();
                            this.f1963c.f1954d.f1943c = this.b.getShort();
                            this.f1963c.f1954d.f1944d = this.b.getShort();
                            int c11 = c();
                            if ((c11 & 128) != 0) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            int pow = (int) Math.pow(2.0d, (c11 & 7) + 1);
                            a aVar = this.f1963c.f1954d;
                            if ((c11 & 64) != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            aVar.f1945e = z10;
                            if (z9) {
                                aVar.f1951k = e(pow);
                            } else {
                                aVar.f1951k = null;
                            }
                            this.f1963c.f1954d.f1950j = this.b.position();
                            c();
                            f();
                            if (!a()) {
                                b bVar6 = this.f1963c;
                                bVar6.f1953c++;
                                bVar6.f1955e.add(bVar6.f1954d);
                            }
                        }
                    } else {
                        int c12 = c();
                        if (c12 != 1) {
                            if (c12 != 249) {
                                if (c12 != 254) {
                                    if (c12 != 255) {
                                        f();
                                    } else {
                                        d();
                                        StringBuilder sb2 = new StringBuilder();
                                        int i10 = 0;
                                        while (true) {
                                            bArr = this.f1962a;
                                            if (i10 >= 11) {
                                                break;
                                            }
                                            sb2.append((char) bArr[i10]);
                                            i10++;
                                        }
                                        if (sb2.toString().equals("NETSCAPE2.0")) {
                                            do {
                                                d();
                                                if (bArr[0] == 1) {
                                                    byte b = bArr[1];
                                                    byte b8 = bArr[2];
                                                    this.f1963c.getClass();
                                                }
                                                if (this.f1964d > 0) {
                                                }
                                            } while (!a());
                                        } else {
                                            f();
                                        }
                                    }
                                } else {
                                    f();
                                }
                            } else {
                                this.f1963c.f1954d = new Object();
                                c();
                                int c13 = c();
                                a aVar2 = this.f1963c.f1954d;
                                int i11 = (c13 & 28) >> 2;
                                aVar2.f1947g = i11;
                                if (i11 == 0) {
                                    aVar2.f1947g = 1;
                                }
                                if ((c13 & 1) != 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                aVar2.f1946f = z11;
                                short s5 = this.b.getShort();
                                if (s5 < 2) {
                                    s5 = 10;
                                }
                                a aVar3 = this.f1963c.f1954d;
                                aVar3.f1949i = s5 * 10;
                                aVar3.f1948h = c();
                                c();
                            }
                        } else {
                            f();
                        }
                    }
                }
                b bVar7 = this.f1963c;
                if (bVar7.f1953c < 0) {
                    bVar7.b = 1;
                }
            }
            return this.f1963c;
        }
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    public final int c() {
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.f1963c.b = 1;
            return 0;
        }
    }

    public final void d() {
        int c9 = c();
        this.f1964d = c9;
        if (c9 > 0) {
            int i9 = 0;
            int i10 = 0;
            while (true) {
                try {
                    i10 = this.f1964d;
                    if (i9 < i10) {
                        i10 -= i9;
                        this.b.get(this.f1962a, i9, i10);
                        i9 += i10;
                    } else {
                        return;
                    }
                } catch (Exception e4) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        StringBuilder o3 = n0.o(i9, i10, "Error Reading Block n: ", " count: ", " blockSize: ");
                        o3.append(this.f1964d);
                        Log.d("GifHeaderParser", o3.toString(), e4);
                    }
                    this.f1963c.b = 1;
                    return;
                }
            }
        }
    }

    public final int[] e(int i9) {
        byte[] bArr = new byte[i9 * 3];
        int[] iArr = null;
        try {
            this.b.get(bArr);
            iArr = new int[NotificationCompat.FLAG_LOCAL_ONLY];
            int i10 = 0;
            int i11 = 0;
            while (i10 < i9) {
                int i12 = bArr[i11] & 255;
                int i13 = i11 + 2;
                int i14 = bArr[i11 + 1] & 255;
                i11 += 3;
                int i15 = i10 + 1;
                iArr[i10] = (i14 << 8) | (i12 << 16) | ViewCompat.MEASURED_STATE_MASK | (bArr[i13] & 255);
                i10 = i15;
            }
        } catch (BufferUnderflowException e4) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e4);
            }
            this.f1963c.b = 1;
        }
        return iArr;
    }

    public final void f() {
        int c9;
        do {
            c9 = c();
            this.b.position(Math.min(this.b.position() + c9, this.b.limit()));
        } while (c9 > 0);
    }
}
