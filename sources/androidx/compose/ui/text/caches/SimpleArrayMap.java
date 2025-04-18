package androidx.compose.ui.text.caches;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.AsyncTypefaceCache;
import com.applovin.impl.sdk.utils.JsonUtils;
import e0.q;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import org.objectweb.asm.signature.SignatureVisitor;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class SimpleArrayMap<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public int[] f17180a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f17181b;

    /* renamed from: c, reason: collision with root package name */
    public int f17182c;

    public final Object a(Object obj) {
        int c2 = obj == null ? c() : b(obj.hashCode(), obj);
        if (c2 >= 0) {
            return this.f17181b[(c2 << 1) + 1];
        }
        return null;
    }

    public final int b(int i2, Object obj) {
        int i3 = this.f17182c;
        if (i3 == 0) {
            return -1;
        }
        int a2 = ContainerHelpersKt.a(i3, i2, this.f17180a);
        if (a2 < 0 || a.g(obj, this.f17181b[a2 << 1])) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i3 && this.f17180a[i4] == i2) {
            if (a.g(obj, this.f17181b[i4 << 1])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = a2 - 1; i5 >= 0 && this.f17180a[i5] == i2; i5--) {
            if (a.g(obj, this.f17181b[i5 << 1])) {
                return i5;
            }
        }
        return ~i4;
    }

    public final int c() {
        int i2 = this.f17182c;
        if (i2 == 0) {
            return -1;
        }
        int a2 = ContainerHelpersKt.a(i2, 0, this.f17180a);
        if (a2 < 0 || this.f17181b[a2 << 1] == null) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.f17180a[i3] == 0) {
            if (this.f17181b[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a2 - 1; i4 >= 0 && this.f17180a[i4] == 0; i4--) {
            if (this.f17181b[i4 << 1] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    public final Object d(AsyncTypefaceCache.Key key, AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult) {
        int hashCode;
        int b2;
        int i2 = this.f17182c;
        if (key == null) {
            b2 = c();
            hashCode = 0;
        } else {
            hashCode = key.hashCode();
            b2 = b(hashCode, key);
        }
        if (b2 >= 0) {
            int i3 = (b2 << 1) + 1;
            Object[] objArr = this.f17181b;
            Object obj = objArr[i3];
            objArr[i3] = asyncTypefaceResult;
            return obj;
        }
        int i4 = ~b2;
        int[] iArr = this.f17180a;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i5);
            a.r(copyOf, "copyOf(this, newSize)");
            this.f17180a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f17181b, i5 << 1);
            a.r(copyOf2, "copyOf(this, newSize)");
            this.f17181b = copyOf2;
            if (i2 != this.f17182c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr2 = this.f17180a;
            int i6 = i4 + 1;
            q.O(i6, i4, i2, iArr2, iArr2);
            Object[] objArr2 = this.f17181b;
            q.P(i6 << 1, i4 << 1, objArr2, this.f17182c << 1, objArr2);
        }
        int i7 = this.f17182c;
        if (i2 == i7) {
            int[] iArr3 = this.f17180a;
            if (i4 < iArr3.length) {
                iArr3[i4] = hashCode;
                Object[] objArr3 = this.f17181b;
                int i8 = i4 << 1;
                objArr3[i8] = key;
                objArr3[i8 + 1] = asyncTypefaceResult;
                this.f17182c = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof SimpleArrayMap) {
                SimpleArrayMap simpleArrayMap = (SimpleArrayMap) obj;
                int i2 = this.f17182c;
                if (i2 != simpleArrayMap.f17182c) {
                    return false;
                }
                for (int i3 = 0; i3 < i2; i3++) {
                    Object[] objArr = this.f17181b;
                    int i4 = i3 << 1;
                    Object obj2 = objArr[i4];
                    Object obj3 = objArr[i4 + 1];
                    Object a2 = simpleArrayMap.a(obj2);
                    if (obj3 == null) {
                        if (a2 == null) {
                            if ((obj2 == null ? simpleArrayMap.c() : simpleArrayMap.b(obj2.hashCode(), obj2)) >= 0) {
                            }
                        }
                        return false;
                    }
                    if (!a.g(obj3, a2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f17182c != ((Map) obj).size()) {
                return false;
            }
            int i5 = this.f17182c;
            for (int i6 = 0; i6 < i5; i6++) {
                Object[] objArr2 = this.f17181b;
                int i7 = i6 << 1;
                Object obj4 = objArr2[i7];
                Object obj5 = objArr2[i7 + 1];
                Object obj6 = ((Map) obj).get(obj4);
                if (obj5 == null) {
                    if (obj6 != null || !((Map) obj).containsKey(obj4)) {
                        return false;
                    }
                } else if (!a.g(obj5, obj6)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f17180a;
        Object[] objArr = this.f17181b;
        int i2 = this.f17182c;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            i5 += (obj != null ? obj.hashCode() : 0) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public final String toString() {
        int i2 = this.f17182c;
        if (i2 <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(i2 * 28);
        sb.append('{');
        int i3 = this.f17182c;
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            int i5 = i4 << 1;
            Object obj = this.f17181b[i5];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
            sb.append(SignatureVisitor.INSTANCEOF);
            Object obj2 = this.f17181b[i5 + 1];
            if (obj2 != this) {
                sb.append(obj2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
