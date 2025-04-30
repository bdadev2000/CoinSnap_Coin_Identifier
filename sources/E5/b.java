package E5;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f1040a;
    public final int[] b;

    public b(a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f1040a = aVar;
            int length = iArr.length;
            int i9 = 1;
            if (length > 1 && iArr[0] == 0) {
                while (i9 < length && iArr[i9] == 0) {
                    i9++;
                }
                if (i9 == length) {
                    this.b = new int[]{0};
                    return;
                }
                int i10 = length - i9;
                int[] iArr2 = new int[i10];
                this.b = iArr2;
                System.arraycopy(iArr, i9, iArr2, 0, i10);
                return;
            }
            this.b = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final b a(b bVar) {
        a aVar = bVar.f1040a;
        a aVar2 = this.f1040a;
        if (aVar2.equals(aVar)) {
            int[] iArr = this.b;
            if (iArr[0] == 0) {
                return bVar;
            }
            int[] iArr2 = bVar.b;
            if (iArr2[0] == 0) {
                return this;
            }
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i9 = length; i9 < iArr.length; i9++) {
                iArr3[i9] = iArr2[i9 - length] ^ iArr[i9];
            }
            return new b(aVar2, iArr3);
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    public final int b() {
        return this.b.length - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(b() * 8);
        for (int b = b(); b >= 0; b--) {
            int[] iArr = this.b;
            int i9 = iArr[(iArr.length - 1) - b];
            if (i9 != 0) {
                if (i9 < 0) {
                    sb.append(" - ");
                    i9 = -i9;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (b == 0 || i9 != 1) {
                    a aVar = this.f1040a;
                    if (i9 != 0) {
                        int i10 = aVar.b[i9];
                        if (i10 == 0) {
                            sb.append('1');
                        } else if (i10 == 1) {
                            sb.append('a');
                        } else {
                            sb.append("a^");
                            sb.append(i10);
                        }
                    } else {
                        aVar.getClass();
                        throw new IllegalArgumentException();
                    }
                }
                if (b != 0) {
                    if (b == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(b);
                    }
                }
            }
        }
        return sb.toString();
    }
}
