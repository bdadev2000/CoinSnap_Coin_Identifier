package m8;

import androidx.core.app.NotificationCompat;
import i8.C2364a;
import i8.C2365b;
import i8.N;
import i8.t;
import i8.u;
import java.io.IOException;
import p8.C2573a;
import p8.E;
import p8.EnumC2574b;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final l f21770a;
    public final C2364a b;

    /* renamed from: c, reason: collision with root package name */
    public final i f21771c;

    /* renamed from: d, reason: collision with root package name */
    public final C2365b f21772d;

    /* renamed from: e, reason: collision with root package name */
    public B3.g f21773e;

    /* renamed from: f, reason: collision with root package name */
    public t f21774f;

    /* renamed from: g, reason: collision with root package name */
    public int f21775g;

    /* renamed from: h, reason: collision with root package name */
    public int f21776h;

    /* renamed from: i, reason: collision with root package name */
    public int f21777i;

    /* renamed from: j, reason: collision with root package name */
    public N f21778j;

    public e(l lVar, C2364a c2364a, i iVar) {
        C2365b c2365b = C2365b.f20810d;
        G7.j.e(lVar, "connectionPool");
        G7.j.e(iVar, NotificationCompat.CATEGORY_CALL);
        this.f21770a = lVar;
        this.b = c2364a;
        this.f21771c = iVar;
        this.f21772d = c2365b;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x032b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final m8.k a(int r14, boolean r15, boolean r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 897
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.e.a(int, boolean, boolean, int, int):m8.k");
    }

    public final boolean b(u uVar) {
        G7.j.e(uVar, "url");
        u uVar2 = this.b.f20805h;
        if (uVar.f20887e == uVar2.f20887e && G7.j.a(uVar.f20886d, uVar2.f20886d)) {
            return true;
        }
        return false;
    }

    public final void c(IOException iOException) {
        G7.j.e(iOException, "e");
        this.f21778j = null;
        if (iOException instanceof E) {
            if (((E) iOException).b == EnumC2574b.REFUSED_STREAM) {
                this.f21775g++;
                return;
            }
        }
        if (iOException instanceof C2573a) {
            this.f21776h++;
        } else {
            this.f21777i++;
        }
    }
}
