package G7;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;
import t7.C2726o;
import t7.C2728q;
import t7.C2730s;
import u7.AbstractC2812c;

/* loaded from: classes3.dex */
public class a implements Iterator, H7.a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public int f1320c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1321d;

    public /* synthetic */ a(Object obj, int i9) {
        this.b = i9;
        this.f1321d = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.b) {
            case 0:
                if (this.f1320c < ((Object[]) this.f1321d).length) {
                    return true;
                }
                return false;
            case 1:
                if (this.f1320c < ((ViewGroup) this.f1321d).getChildCount()) {
                    return true;
                }
                return false;
            case 2:
                if (this.f1320c < ((byte[]) this.f1321d).length) {
                    return true;
                }
                return false;
            case 3:
                if (this.f1320c < ((int[]) this.f1321d).length) {
                    return true;
                }
                return false;
            case 4:
                if (this.f1320c < ((long[]) this.f1321d).length) {
                    return true;
                }
                return false;
            case 5:
                if (this.f1320c < ((short[]) this.f1321d).length) {
                    return true;
                }
                return false;
            default:
                if (this.f1320c < ((AbstractC2812c) this.f1321d).b()) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.b) {
            case 0:
                try {
                    Object[] objArr = (Object[]) this.f1321d;
                    int i9 = this.f1320c;
                    this.f1320c = i9 + 1;
                    return objArr[i9];
                } catch (ArrayIndexOutOfBoundsException e4) {
                    this.f1320c--;
                    throw new NoSuchElementException(e4.getMessage());
                }
            case 1:
                int i10 = this.f1320c;
                this.f1320c = i10 + 1;
                View childAt = ((ViewGroup) this.f1321d).getChildAt(i10);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            case 2:
                int i11 = this.f1320c;
                byte[] bArr = (byte[]) this.f1321d;
                if (i11 < bArr.length) {
                    this.f1320c = i11 + 1;
                    return new C2726o(bArr[i11]);
                }
                throw new NoSuchElementException(String.valueOf(this.f1320c));
            case 3:
                int i12 = this.f1320c;
                int[] iArr = (int[]) this.f1321d;
                if (i12 < iArr.length) {
                    this.f1320c = i12 + 1;
                    return new C2728q(iArr[i12]);
                }
                throw new NoSuchElementException(String.valueOf(this.f1320c));
            case 4:
                int i13 = this.f1320c;
                long[] jArr = (long[]) this.f1321d;
                if (i13 < jArr.length) {
                    this.f1320c = i13 + 1;
                    return new C2730s(jArr[i13]);
                }
                throw new NoSuchElementException(String.valueOf(this.f1320c));
            case 5:
                int i14 = this.f1320c;
                short[] sArr = (short[]) this.f1321d;
                if (i14 < sArr.length) {
                    this.f1320c = i14 + 1;
                    return new t7.v(sArr[i14]);
                }
                throw new NoSuchElementException(String.valueOf(this.f1320c));
            default:
                if (hasNext()) {
                    int i15 = this.f1320c;
                    this.f1320c = i15 + 1;
                    return ((AbstractC2812c) this.f1321d).get(i15);
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i9 = this.f1320c - 1;
                this.f1320c = i9;
                ((ViewGroup) this.f1321d).removeViewAt(i9);
                return;
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a(Object[] objArr) {
        this.b = 0;
        j.e(objArr, "array");
        this.f1321d = objArr;
    }
}
