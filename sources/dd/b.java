package dd;

/* loaded from: classes4.dex */
public final class b {
    public final a a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f17001b;

    public b(a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.a = aVar;
            int length = iArr.length;
            if (length > 1 && iArr[0] == 0) {
                int i10 = 1;
                while (i10 < length && iArr[i10] == 0) {
                    i10++;
                }
                if (i10 == length) {
                    this.f17001b = new int[]{0};
                    return;
                }
                int i11 = length - i10;
                int[] iArr2 = new int[i11];
                this.f17001b = iArr2;
                System.arraycopy(iArr, i10, iArr2, 0, i11);
                return;
            }
            this.f17001b = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final b a(b bVar) {
        a aVar = bVar.a;
        a aVar2 = this.a;
        if (aVar2.equals(aVar)) {
            if (b()) {
                return bVar;
            }
            if (bVar.b()) {
                return this;
            }
            int[] iArr = this.f17001b;
            int length = iArr.length;
            int[] iArr2 = bVar.f17001b;
            if (length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length2 = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length2);
            for (int i10 = length2; i10 < iArr.length; i10++) {
                iArr3[i10] = iArr2[i10 - length2] ^ iArr[i10];
            }
            return new b(aVar2, iArr3);
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    public final boolean b() {
        return this.f17001b[0] == 0;
    }

    public final b c(int i10, int i11) {
        if (i10 >= 0) {
            a aVar = this.a;
            if (i11 == 0) {
                return aVar.f16997c;
            }
            int[] iArr = this.f17001b;
            int length = iArr.length;
            int[] iArr2 = new int[i10 + length];
            for (int i12 = 0; i12 < length; i12++) {
                iArr2[i12] = aVar.a(iArr[i12], i11);
            }
            return new b(aVar, iArr2);
        }
        throw new IllegalArgumentException();
    }

    public final String toString() {
        int[] iArr = this.f17001b;
        StringBuilder sb2 = new StringBuilder((iArr.length - 1) * 8);
        int length = iArr.length;
        while (true) {
            length--;
            if (length >= 0) {
                int i10 = iArr[(iArr.length - 1) - length];
                if (i10 != 0) {
                    if (i10 < 0) {
                        sb2.append(" - ");
                        i10 = -i10;
                    } else if (sb2.length() > 0) {
                        sb2.append(" + ");
                    }
                    if (length == 0 || i10 != 1) {
                        a aVar = this.a;
                        if (i10 != 0) {
                            int i11 = aVar.f16996b[i10];
                            if (i11 == 0) {
                                sb2.append('1');
                            } else if (i11 == 1) {
                                sb2.append('a');
                            } else {
                                sb2.append("a^");
                                sb2.append(i11);
                            }
                        } else {
                            aVar.getClass();
                            throw new IllegalArgumentException();
                        }
                    }
                    if (length != 0) {
                        if (length == 1) {
                            sb2.append('x');
                        } else {
                            sb2.append("x^");
                            sb2.append(length);
                        }
                    }
                }
            } else {
                return sb2.toString();
            }
        }
    }
}
