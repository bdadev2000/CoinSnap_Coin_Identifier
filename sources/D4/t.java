package d4;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class t implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object[] b;

    public t(Object[] objArr) {
        this.b = objArr;
    }

    public Object readResolve() {
        Object[] objArr = this.b;
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return u.j(objArr.length, (Object[]) objArr.clone());
            }
            return new M(objArr[0]);
        }
        return K.l;
    }
}
