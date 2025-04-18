package vc;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.PrivilegedAction;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class d1 implements PrivilegedAction {
    public final /* synthetic */ Class a;

    public d1(Class cls) {
        this.a = cls;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        Field[] declaredFields = this.a.getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            if (field.isEnumConstant()) {
                arrayList.add(field);
            }
        }
        Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
        AccessibleObject.setAccessible(fieldArr, true);
        return fieldArr;
    }
}
