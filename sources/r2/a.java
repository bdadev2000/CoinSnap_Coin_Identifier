package r2;

import android.content.Context;
import android.os.Build;
import androidx.work.q;
import s2.f;
import s2.g;
import s2.h;
import u2.j;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f23964e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, x2.a aVar, int i10) {
        super((s2.a) h.o(context, aVar).f24169b);
        this.f23964e = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return;
                    } else {
                        super((g) h.o(context, aVar).f24172f);
                        return;
                    }
                }
                super((f) h.o(context, aVar).f24171d);
                return;
            }
            super((f) h.o(context, aVar).f24171d);
            return;
        }
        super((s2.b) h.o(context, aVar).f24170c);
    }

    @Override // r2.c
    public final boolean a(j jVar) {
        switch (this.f23964e) {
            case 0:
                return jVar.f25460j.f2188b;
            case 1:
                return jVar.f25460j.f2190d;
            case 2:
                if (jVar.f25460j.a == q.CONNECTED) {
                    return true;
                }
                return false;
            case 3:
                q qVar = jVar.f25460j.a;
                if (qVar == q.UNMETERED) {
                    return true;
                }
                if (Build.VERSION.SDK_INT >= 30 && qVar == q.TEMPORARILY_UNMETERED) {
                    return true;
                }
                return false;
            default:
                return jVar.f25460j.f2191e;
        }
    }

    @Override // r2.c
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        switch (this.f23964e) {
            case 0:
                return e((Boolean) obj);
            case 1:
                return e((Boolean) obj);
            case 2:
                return f((q2.a) obj);
            case 3:
                return f((q2.a) obj);
            default:
                return e((Boolean) obj);
        }
    }

    public final boolean e(Boolean bool) {
        boolean booleanValue;
        switch (this.f23964e) {
            case 0:
                booleanValue = bool.booleanValue();
                break;
            case 1:
                booleanValue = bool.booleanValue();
                break;
            default:
                booleanValue = bool.booleanValue();
                break;
        }
        return !booleanValue;
    }

    public final boolean f(q2.a aVar) {
        switch (this.f23964e) {
            case 2:
                if (Build.VERSION.SDK_INT >= 26) {
                    if (aVar.a && aVar.f23674b) {
                        return false;
                    }
                    return true;
                }
                return !aVar.a;
            default:
                if (aVar.a && !aVar.f23675c) {
                    return false;
                }
                return true;
        }
    }
}
