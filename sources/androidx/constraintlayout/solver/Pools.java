package androidx.constraintlayout.solver;

/* loaded from: classes3.dex */
final class Pools {

    /* loaded from: classes3.dex */
    public interface Pool<T> {
    }

    /* loaded from: classes3.dex */
    public static class SimplePool<T> implements Pool<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Object[] f17937a = new Object[256];

        /* renamed from: b, reason: collision with root package name */
        public int f17938b;

        public final Object a() {
            int i2 = this.f17938b;
            if (i2 <= 0) {
                return null;
            }
            int i3 = i2 - 1;
            Object[] objArr = this.f17937a;
            Object obj = objArr[i3];
            objArr[i3] = null;
            this.f17938b = i2 - 1;
            return obj;
        }

        public final boolean b(ArrayRow arrayRow) {
            int i2 = this.f17938b;
            Object[] objArr = this.f17937a;
            if (i2 >= objArr.length) {
                return false;
            }
            objArr[i2] = arrayRow;
            this.f17938b = i2 + 1;
            return true;
        }
    }
}
