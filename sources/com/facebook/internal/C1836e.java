package com.facebook.internal;

import android.os.Bundle;
import java.util.ArrayList;
import org.json.JSONArray;

/* renamed from: com.facebook.internal.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1836e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13612a;

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Bundle bundle, String str, Object obj) {
        switch (this.f13612a) {
            case 0:
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                return;
            case 1:
                bundle.putInt(str, ((Integer) obj).intValue());
                return;
            case 2:
                bundle.putLong(str, ((Long) obj).longValue());
                return;
            case 3:
                bundle.putDouble(str, ((Double) obj).doubleValue());
                return;
            case 4:
                bundle.putString(str, (String) obj);
                return;
            case 5:
                throw new IllegalArgumentException("Unexpected type from JSON");
            default:
                JSONArray jSONArray = (JSONArray) obj;
                ArrayList arrayList = new ArrayList();
                if (jSONArray.length() == 0) {
                    bundle.putStringArrayList(str, arrayList);
                    return;
                }
                int length = jSONArray.length();
                if (length > 0) {
                    int i9 = 0;
                    while (true) {
                        int i10 = i9 + 1;
                        Object obj2 = jSONArray.get(i9);
                        if (obj2 instanceof String) {
                            arrayList.add(obj2);
                            if (i10 < length) {
                                i9 = i10;
                            }
                        } else {
                            throw new IllegalArgumentException(G7.j.j(obj2.getClass(), "Unexpected type in an array: "));
                        }
                    }
                }
                bundle.putStringArrayList(str, arrayList);
                return;
        }
    }
}
