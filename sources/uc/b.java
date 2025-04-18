package uc;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class b implements ParameterizedType, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Type f25747b;

    /* renamed from: c, reason: collision with root package name */
    public final Type f25748c;

    /* renamed from: d, reason: collision with root package name */
    public final Type[] f25749d;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(java.lang.reflect.Type r4, java.lang.reflect.Type r5, java.lang.reflect.Type... r6) {
        /*
            r3 = this;
            r3.<init>()
            java.util.Objects.requireNonNull(r5)
            r0 = 0
            if (r4 != 0) goto L3a
            boolean r1 = r5 instanceof java.lang.Class
            if (r1 == 0) goto L22
            r1 = r5
            java.lang.Class r1 = (java.lang.Class) r1
            int r2 = r1.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
            if (r2 != 0) goto L22
            java.lang.Class r1 = r1.getDeclaringClass()
            if (r1 == 0) goto L22
            r1 = 1
            goto L23
        L22:
            r1 = r0
        L23:
            if (r1 != 0) goto L26
            goto L3a
        L26:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Must specify owner type for "
            r6.<init>(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L3a:
            if (r4 != 0) goto L3e
            r4 = 0
            goto L42
        L3e:
            java.lang.reflect.Type r4 = com.bumptech.glide.d.c(r4)
        L42:
            r3.f25747b = r4
            java.lang.reflect.Type r4 = com.bumptech.glide.d.c(r5)
            r3.f25748c = r4
            java.lang.Object r4 = r6.clone()
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r3.f25749d = r4
            int r4 = r4.length
        L53:
            if (r0 >= r4) goto L70
            java.lang.reflect.Type[] r5 = r3.f25749d
            r5 = r5[r0]
            java.util.Objects.requireNonNull(r5)
            java.lang.reflect.Type[] r5 = r3.f25749d
            r5 = r5[r0]
            com.bumptech.glide.d.f(r5)
            java.lang.reflect.Type[] r5 = r3.f25749d
            r6 = r5[r0]
            java.lang.reflect.Type r6 = com.bumptech.glide.d.c(r6)
            r5[r0] = r6
            int r0 = r0 + 1
            goto L53
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uc.b.<init>(java.lang.reflect.Type, java.lang.reflect.Type, java.lang.reflect.Type[]):void");
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ParameterizedType) && com.bumptech.glide.d.k(this, (ParameterizedType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f25749d.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f25747b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f25748c;
    }

    public final int hashCode() {
        int i10;
        int hashCode = Arrays.hashCode(this.f25749d) ^ this.f25748c.hashCode();
        Type type = this.f25747b;
        if (type != null) {
            i10 = type.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        Type[] typeArr = this.f25749d;
        int length = typeArr.length;
        Type type = this.f25748c;
        if (length == 0) {
            return com.bumptech.glide.d.H(type);
        }
        StringBuilder sb2 = new StringBuilder((length + 1) * 30);
        sb2.append(com.bumptech.glide.d.H(type));
        sb2.append("<");
        sb2.append(com.bumptech.glide.d.H(typeArr[0]));
        for (int i10 = 1; i10 < length; i10++) {
            sb2.append(", ");
            sb2.append(com.bumptech.glide.d.H(typeArr[i10]));
        }
        sb2.append(">");
        return sb2.toString();
    }
}
