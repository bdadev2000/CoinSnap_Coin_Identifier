package com.iab.omid.library.applovin.processor;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.applovin.processor.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class d implements a {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f14437a = new int[2];

    @TargetApi(21)
    private void b(ViewGroup viewGroup, JSONObject jSONObject, a.InterfaceC0142a interfaceC0142a, boolean z8) {
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
                interfaceC0142a.a((View) it2.next(), this, jSONObject, z8);
            }
        }
    }

    @Override // com.iab.omid.library.applovin.processor.a
    public JSONObject a(View view) {
        if (view == null) {
            return com.iab.omid.library.applovin.utils.c.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f14437a);
        int[] iArr = this.f14437a;
        return com.iab.omid.library.applovin.utils.c.a(iArr[0], iArr[1], width, height);
    }

    @Override // com.iab.omid.library.applovin.processor.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0142a interfaceC0142a, boolean z8, boolean z9) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z8) {
                b(viewGroup, jSONObject, interfaceC0142a, z9);
            } else {
                a(viewGroup, jSONObject, interfaceC0142a, z9);
            }
        }
    }

    private void a(ViewGroup viewGroup, JSONObject jSONObject, a.InterfaceC0142a interfaceC0142a, boolean z8) {
        for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
            interfaceC0142a.a(viewGroup.getChildAt(i9), this, jSONObject, z8);
        }
    }
}
