package B3;

import P1.B;
import P1.E;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzhe;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.F;
import com.google.ar.core.InstallActivity;
import com.google.ar.core.exceptions.FatalException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import com.google.ar.core.v;
import g8.y;
import h3.C2318a;

/* loaded from: classes2.dex */
public class e implements v4.j {

    /* renamed from: a, reason: collision with root package name */
    public boolean f283a;
    public Object b;

    public /* synthetic */ e(Object obj) {
        this.b = obj;
        this.f283a = true;
    }

    @Override // v4.j
    public void a(v4.i iVar, int i9) {
        boolean z8 = this.f283a;
        StringBuilder sb = (StringBuilder) this.b;
        if (z8) {
            this.f283a = false;
        } else {
            sb.append(", ");
        }
        sb.append(i9);
    }

    public void b(F f9) {
        synchronized (((InstallActivity) this.b)) {
            try {
                if (this.f283a) {
                    return;
                }
                ((InstallActivity) this.b).f(f9);
                ArCoreApk.UserMessageType userMessageType = ArCoreApk.UserMessageType.APPLICATION;
                ArCoreApk.Availability availability = ArCoreApk.Availability.UNKNOWN_ERROR;
                int ordinal = f9.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            if (!((InstallActivity) this.b).g() && v.m.f14311d) {
                                ((InstallActivity) this.b).e();
                            }
                            ((InstallActivity) this.b).c(null);
                        }
                    } else {
                        ((InstallActivity) this.b).c(new UnavailableUserDeclinedInstallationException());
                    }
                    this.f283a = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(FatalException fatalException) {
        synchronized (((InstallActivity) this.b)) {
            try {
                if (this.f283a) {
                    return;
                }
                this.f283a = true;
                ((InstallActivity) this.b).f(F.f14261c);
                ((InstallActivity) this.b).c(fatalException);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean d() {
        return this.f283a;
    }

    public void e() {
        this.f283a = true;
    }

    public boolean f(CharSequence charSequence, int i9) {
        if (charSequence != null && i9 >= 0 && charSequence.length() - i9 >= 0) {
            R.f fVar = (R.f) this.b;
            if (fVar == null) {
                return d();
            }
            int a6 = fVar.a(charSequence, i9);
            if (a6 == 0) {
                return true;
            }
            if (a6 != 1) {
                return d();
            }
            return false;
        }
        throw new IllegalArgumentException();
    }

    public void g() {
        this.f283a = false;
    }

    public void h(byte b) {
        long j7 = b;
        g gVar = (g) this.b;
        gVar.getClass();
        gVar.i(String.valueOf(j7));
    }

    public void i(char c9) {
        g gVar = (g) this.b;
        gVar.d(gVar.f285c, 1);
        char[] cArr = (char[]) gVar.f286d;
        int i9 = gVar.f285c;
        gVar.f285c = i9 + 1;
        cArr[i9] = c9;
    }

    public void j(int i9) {
        long j7 = i9;
        g gVar = (g) this.b;
        gVar.getClass();
        gVar.i(String.valueOf(j7));
    }

    public void k(long j7) {
        g gVar = (g) this.b;
        gVar.getClass();
        gVar.i(String.valueOf(j7));
    }

    public void l(String str) {
        G7.j.e(str, "v");
        ((g) this.b).i(str);
    }

    public void m(short s5) {
        long j7 = s5;
        g gVar = (g) this.b;
        gVar.getClass();
        gVar.i(String.valueOf(j7));
    }

    public void n(String str) {
        int i9;
        G7.j.e(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        g gVar = (g) this.b;
        gVar.getClass();
        gVar.d(gVar.f285c, str.length() + 2);
        char[] cArr = (char[]) gVar.f286d;
        int i10 = gVar.f285c;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        int i13 = i11;
        while (i13 < i12) {
            char c9 = cArr[i13];
            byte[] bArr = y.b;
            if (c9 < bArr.length && bArr[c9] != 0) {
                int length2 = str.length();
                for (int i14 = i13 - i11; i14 < length2; i14++) {
                    gVar.d(i13, 2);
                    char charAt = str.charAt(i14);
                    byte[] bArr2 = y.b;
                    if (charAt < bArr2.length) {
                        byte b = bArr2[charAt];
                        if (b == 0) {
                            i9 = i13 + 1;
                            ((char[]) gVar.f286d)[i13] = charAt;
                        } else {
                            if (b == 1) {
                                String str2 = y.f20550a[charAt];
                                G7.j.b(str2);
                                gVar.d(i13, str2.length());
                                str2.getChars(0, str2.length(), (char[]) gVar.f286d, i13);
                                int length3 = str2.length() + i13;
                                gVar.f285c = length3;
                                i13 = length3;
                            } else {
                                char[] cArr2 = (char[]) gVar.f286d;
                                cArr2[i13] = '\\';
                                cArr2[i13 + 1] = (char) b;
                                i13 += 2;
                                gVar.f285c = i13;
                            }
                        }
                    } else {
                        i9 = i13 + 1;
                        ((char[]) gVar.f286d)[i13] = charAt;
                    }
                    i13 = i9;
                }
                gVar.d(i13, 1);
                ((char[]) gVar.f286d)[i13] = '\"';
                gVar.f285c = i13 + 1;
                return;
            }
            i13++;
        }
        cArr[i12] = '\"';
        gVar.f285c = i12 + 1;
    }

    public synchronized void o(B b, boolean z8) {
        try {
            if (!this.f283a && !z8) {
                this.f283a = true;
                b.a();
                this.f283a = false;
            }
            ((Handler) this.b).obtainMessage(1, b).sendToTarget();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void r(zzhe zzheVar) {
        if (this.f283a) {
            zzb.zzk("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((k3.r) this.b).a(new C2318a(zzheVar, h3.d.b, null), new com.applovin.impl.sdk.ad.g(25));
        } catch (Throwable unused) {
            zzb.zzk("BillingLogger", "logging failed.");
        }
    }

    public e(int i9) {
        switch (i9) {
            case 3:
                P5.d dVar = P5.d.STANDALONE;
                this.f283a = true;
                this.b = dVar;
                return;
            default:
                this.b = new Handler(Looper.getMainLooper(), new E(0));
                return;
        }
    }

    public e(R.f fVar, boolean z8) {
        this.b = fVar;
        this.f283a = z8;
    }

    public void p() {
    }

    public void q() {
    }
}
