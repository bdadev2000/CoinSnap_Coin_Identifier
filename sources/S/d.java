package S;

import G7.j;
import androidx.core.app.NotificationCompat;

/* loaded from: classes.dex */
public class d implements c {
    public final Object[] b;

    /* renamed from: c, reason: collision with root package name */
    public int f2768c;

    public d(int i9) {
        if (i9 > 0) {
            this.b = new Object[i9];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0".toString());
    }

    public void a(Object obj) {
        int i9 = this.f2768c;
        Object[] objArr = this.b;
        if (i9 < objArr.length) {
            objArr[i9] = obj;
            this.f2768c = i9 + 1;
        }
    }

    @Override // S.c
    public boolean b(Object obj) {
        Object[] objArr;
        boolean z8;
        j.e(obj, "instance");
        int i9 = this.f2768c;
        int i10 = 0;
        while (true) {
            objArr = this.b;
            if (i10 < i9) {
                if (objArr[i10] == obj) {
                    z8 = true;
                    break;
                }
                i10++;
            } else {
                z8 = false;
                break;
            }
        }
        if (!z8) {
            int i11 = this.f2768c;
            if (i11 >= objArr.length) {
                return false;
            }
            objArr[i11] = obj;
            this.f2768c = i11 + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!".toString());
    }

    @Override // S.c
    public Object g() {
        int i9 = this.f2768c;
        if (i9 <= 0) {
            return null;
        }
        int i10 = i9 - 1;
        Object[] objArr = this.b;
        Object obj = objArr[i10];
        j.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i10] = null;
        this.f2768c--;
        return obj;
    }

    public d() {
        this.b = new Object[NotificationCompat.FLAG_LOCAL_ONLY];
    }
}
