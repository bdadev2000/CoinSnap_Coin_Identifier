package com.iab.omid.library.bytedance2.processor;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.bytedance2.processor.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class d implements a {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f14538a = new int[2];

    @TargetApi(21)
    private void b(ViewGroup viewGroup, JSONObject jSONObject, a.InterfaceC0146a interfaceC0146a, boolean z8) {
        HashMap hashMap = new HashMap();
        for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
            View childAt = viewGroup.getChildAt(i9);
            ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
            if (arrayList == null) {
                arrayList = new ArrayList();
                hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
            }
            arrayList.add(childAt);
        }
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) hashMap.get((Float) it.next())).iterator();
            while (it2.hasNext()) {
                interfaceC0146a.a((View) it2.next(), this, jSONObject, z8);
            }
        }
    }

    @Override // com.iab.omid.library.bytedance2.processor.a
    public JSONObject a(View view) {
        if (view == null) {
            return com.iab.omid.library.bytedance2.utils.c.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f14538a);
        int[] iArr = this.f14538a;
        return com.iab.omid.library.bytedance2.utils.c.a(iArr[0], iArr[1], width, height);
    }

    @Override // com.iab.omid.library.bytedance2.processor.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0146a interfaceC0146a, boolean z8, boolean z9) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z8) {
                b(viewGroup, jSONObject, interfaceC0146a, z9);
            } else {
                a(viewGroup, jSONObject, interfaceC0146a, z9);
            }
        }
    }

    private void a(ViewGroup viewGroup, JSONObject jSONObject, a.InterfaceC0146a interfaceC0146a, boolean z8) {
        for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
            interfaceC0146a.a(viewGroup.getChildAt(i9), this, jSONObject, z8);
        }
    }
}
