package t;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class e implements m0.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25118b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f25119c;

    /* renamed from: d, reason: collision with root package name */
    public int f25120d;

    public e(int i10, int i11) {
        this.f25118b = i11;
        if (i11 != 1) {
            if (i10 > 0) {
                this.f25119c = new Object[i10];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        if (i10 > 0) {
            this.f25119c = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0".toString());
    }

    @Override // m0.c
    public boolean c(Object instance) {
        boolean z10;
        int i10 = this.f25118b;
        Object[] objArr = this.f25119c;
        switch (i10) {
            case 0:
                int i11 = this.f25120d;
                if (i11 >= objArr.length) {
                    return false;
                }
                objArr[i11] = instance;
                this.f25120d = i11 + 1;
                return true;
            default:
                Intrinsics.checkNotNullParameter(instance, "instance");
                int i12 = this.f25120d;
                int i13 = 0;
                while (true) {
                    if (i13 < i12) {
                        if (objArr[i13] == instance) {
                            z10 = true;
                        } else {
                            i13++;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!z10) {
                    int i14 = this.f25120d;
                    if (i14 >= objArr.length) {
                        return false;
                    }
                    objArr[i14] = instance;
                    this.f25120d = i14 + 1;
                    return true;
                }
                throw new IllegalStateException("Already in the pool!".toString());
        }
    }

    @Override // m0.c
    public Object d() {
        int i10 = this.f25118b;
        Object[] objArr = this.f25119c;
        switch (i10) {
            case 0:
                int i11 = this.f25120d;
                if (i11 <= 0) {
                    return null;
                }
                int i12 = i11 - 1;
                Object obj = objArr[i12];
                objArr[i12] = null;
                this.f25120d = i12;
                return obj;
            default:
                int i13 = this.f25120d;
                if (i13 <= 0) {
                    return null;
                }
                int i14 = i13 - 1;
                Object obj2 = objArr[i14];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                objArr[i14] = null;
                this.f25120d--;
                return obj2;
        }
    }
}
