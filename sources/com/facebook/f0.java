package com.facebook;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes.dex */
public final class f0 implements c0 {
    public final ArrayList a;

    public /* synthetic */ f0(int i10) {
        if (i10 == 1) {
            this.a = new ArrayList();
        } else if (i10 != 2) {
            this.a = new ArrayList();
        } else {
            this.a = new ArrayList();
        }
    }

    @Override // com.facebook.c0
    public void a(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{key, URLEncoder.encode(value, "UTF-8")}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
        this.a.add(format);
    }

    public synchronized ArrayList b(Class cls, Class cls2) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            q4.b bVar = (q4.b) it.next();
            if (bVar.a.isAssignableFrom(cls) && cls2.isAssignableFrom(bVar.f23683b)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !arrayList.contains(bVar.f23683b)) {
                arrayList.add(bVar.f23683b);
            }
        }
        return arrayList;
    }

    public f0(ArrayList arrayList) {
        this.a = arrayList;
    }
}
