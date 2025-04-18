package ze;

import java.util.HashMap;

/* loaded from: classes4.dex */
public final class a implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f28746d = new HashMap(16);

    /* renamed from: b, reason: collision with root package name */
    public final int f28747b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28748c;

    public a(int i10, int i11) {
        this.f28747b = i10;
        this.f28748c = i11;
    }

    public static a a(int i10, int i11) {
        int i12 = i10;
        int i13 = i11;
        while (i13 != 0) {
            int i14 = i12 % i13;
            i12 = i13;
            i13 = i14;
        }
        if (i12 > 0) {
            i10 /= i12;
        }
        if (i12 > 0) {
            i11 /= i12;
        }
        String str = i10 + ":" + i11;
        HashMap hashMap = f28746d;
        a aVar = (a) hashMap.get(str);
        if (aVar == null) {
            a aVar2 = new a(i10, i11);
            hashMap.put(str, aVar2);
            return aVar2;
        }
        return aVar;
    }

    public static a b(String str) {
        String[] split = str.split(":");
        if (split.length == 2) {
            return a(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
        }
        throw new NumberFormatException("Illegal AspectRatio string. Must be x:y");
    }

    public final float c() {
        return this.f28747b / this.f28748c;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(c(), ((a) obj).c());
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a) || c() != ((a) obj).c()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(c());
    }

    public final String toString() {
        return this.f28747b + ":" + this.f28748c;
    }
}
