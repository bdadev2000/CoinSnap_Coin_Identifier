package e5;

import R3.e;
import Y4.p;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.y;
import com.google.firebase.perf.v1.PerfSession;
import h5.C2323d;
import h5.i;
import i5.F;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: e5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2221a implements Parcelable {
    public static final Parcelable.Creator<C2221a> CREATOR = new y(16);
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final i f20110c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20111d;

    public C2221a(String str, e eVar) {
        this.f20111d = false;
        this.b = str;
        this.f20110c = new i();
    }

    public static PerfSession[] d(List list) {
        if (list.isEmpty()) {
            return null;
        }
        PerfSession[] perfSessionArr = new PerfSession[list.size()];
        PerfSession c9 = ((C2221a) list.get(0)).c();
        boolean z8 = false;
        for (int i9 = 1; i9 < list.size(); i9++) {
            PerfSession c10 = ((C2221a) list.get(i9)).c();
            if (!z8 && ((C2221a) list.get(i9)).f20111d) {
                perfSessionArr[0] = c10;
                perfSessionArr[i9] = c9;
                z8 = true;
            } else {
                perfSessionArr[i9] = c10;
            }
        }
        if (!z8) {
            perfSessionArr[0] = c9;
        }
        return perfSessionArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if (Y4.a.p(r5) != false) goto L32;
     */
    /* JADX WARN: Type inference failed for: r4v8, types: [Y4.s, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static e5.C2221a e(java.lang.String r9) {
        /*
            java.lang.String r0 = "-"
            java.lang.String r1 = ""
            java.lang.String r9 = r9.replace(r0, r1)
            e5.a r0 = new e5.a
            R3.e r1 = new R3.e
            r2 = 24
            r1.<init>(r2)
            r0.<init>(r9, r1)
            Y4.a r9 = Y4.a.e()
            boolean r1 = r9.o()
            if (r1 == 0) goto Ld0
            double r1 = java.lang.Math.random()
            java.lang.Class<Y4.s> r3 = Y4.s.class
            monitor-enter(r3)
            Y4.s r4 = Y4.s.f3809j     // Catch: java.lang.Throwable -> L31
            if (r4 != 0) goto L34
            Y4.s r4 = new Y4.s     // Catch: java.lang.Throwable -> L31
            r4.<init>()     // Catch: java.lang.Throwable -> L31
            Y4.s.f3809j = r4     // Catch: java.lang.Throwable -> L31
            goto L34
        L31:
            r9 = move-exception
            goto Lce
        L34:
            Y4.s r4 = Y4.s.f3809j     // Catch: java.lang.Throwable -> L31
            monitor-exit(r3)
            h5.d r3 = r9.i(r4)
            boolean r5 = r3.b()
            if (r5 == 0) goto L56
            java.lang.Object r3 = r3.a()
            java.lang.Double r3 = (java.lang.Double) r3
            double r5 = r3.doubleValue()
            r7 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r5 = r5 / r7
            boolean r3 = Y4.a.p(r5)
            if (r3 == 0) goto L56
            goto Lc8
        L56:
            com.google.firebase.perf.config.RemoteConfigManager r3 = r9.f3790a
            java.lang.String r5 = "fpr_vc_session_sampling_rate"
            h5.d r3 = r3.getDouble(r5)
            boolean r5 = r3.b()
            if (r5 == 0) goto L90
            java.lang.Object r5 = r3.a()
            java.lang.Double r5 = (java.lang.Double) r5
            double r5 = r5.doubleValue()
            boolean r5 = Y4.a.p(r5)
            if (r5 == 0) goto L90
            Y4.w r9 = r9.f3791c
            java.lang.String r4 = "com.google.firebase.perf.SessionSamplingRate"
            java.lang.Object r5 = r3.a()
            java.lang.Double r5 = (java.lang.Double) r5
            double r5 = r5.doubleValue()
            r9.e(r4, r5)
            java.lang.Object r9 = r3.a()
            java.lang.Double r9 = (java.lang.Double) r9
            double r5 = r9.doubleValue()
            goto Lc8
        L90:
            h5.d r3 = r9.b(r4)
            boolean r4 = r3.b()
            if (r4 == 0) goto Lb5
            java.lang.Object r4 = r3.a()
            java.lang.Double r4 = (java.lang.Double) r4
            double r4 = r4.doubleValue()
            boolean r4 = Y4.a.p(r4)
            if (r4 == 0) goto Lb5
            java.lang.Object r9 = r3.a()
            java.lang.Double r9 = (java.lang.Double) r9
            double r5 = r9.doubleValue()
            goto Lc8
        Lb5:
            com.google.firebase.perf.config.RemoteConfigManager r9 = r9.f3790a
            boolean r9 = r9.isLastFetchFailed()
            if (r9 == 0) goto Lc3
            r5 = 4532020583610935537(0x3ee4f8b588e368f1, double:1.0E-5)
            goto Lc8
        Lc3:
            r5 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
        Lc8:
            int r9 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r9 >= 0) goto Ld0
            r9 = 1
            goto Ld1
        Lce:
            monitor-exit(r3)
            throw r9
        Ld0:
            r9 = 0
        Ld1:
            r0.f20111d = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.C2221a.e(java.lang.String):e5.a");
    }

    public final PerfSession c() {
        F newBuilder = PerfSession.newBuilder();
        newBuilder.b(this.b);
        if (this.f20111d) {
            newBuilder.a();
        }
        return (PerfSession) newBuilder.build();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [Y4.p, java.lang.Object] */
    public final boolean f() {
        p pVar;
        long j7;
        long minutes = TimeUnit.MICROSECONDS.toMinutes(this.f20110c.c());
        Y4.a e4 = Y4.a.e();
        e4.getClass();
        synchronized (p.class) {
            try {
                if (p.f3806j == null) {
                    p.f3806j = new Object();
                }
                pVar = p.f3806j;
            } catch (Throwable th) {
                throw th;
            }
        }
        C2323d j9 = e4.j(pVar);
        if (j9.b() && ((Long) j9.a()).longValue() > 0) {
            j7 = ((Long) j9.a()).longValue();
        } else {
            C2323d c2323d = e4.f3790a.getLong("fpr_session_max_duration_min");
            if (c2323d.b() && ((Long) c2323d.a()).longValue() > 0) {
                e4.f3791c.d(((Long) c2323d.a()).longValue(), "com.google.firebase.perf.SessionsMaxDurationMinutes");
                j7 = ((Long) c2323d.a()).longValue();
            } else {
                C2323d c9 = e4.c(pVar);
                if (c9.b() && ((Long) c9.a()).longValue() > 0) {
                    j7 = ((Long) c9.a()).longValue();
                } else {
                    j7 = 240;
                }
            }
        }
        if (minutes > j7) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.b);
        parcel.writeByte(this.f20111d ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f20110c, 0);
    }

    public C2221a(Parcel parcel) {
        this.f20111d = false;
        this.b = parcel.readString();
        this.f20111d = parcel.readByte() != 0;
        this.f20110c = (i) parcel.readParcelable(i.class.getClassLoader());
    }
}
