package com.iab.omid.library.applovin.processor;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.applovin.processor.a;
import com.iab.omid.library.applovin.utils.e;
import com.iab.omid.library.applovin.utils.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class c implements a {
    private final a a;

    public c(a aVar) {
        this.a = aVar;
    }

    @NonNull
    public ArrayList<View> a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        com.iab.omid.library.applovin.internal.c c10 = com.iab.omid.library.applovin.internal.c.c();
        if (c10 != null) {
            Collection<com.iab.omid.library.applovin.adsession.a> a = c10.a();
            IdentityHashMap identityHashMap = new IdentityHashMap((a.size() * 2) + 3);
            Iterator<com.iab.omid.library.applovin.adsession.a> it = a.iterator();
            while (it.hasNext()) {
                View c11 = it.next().c();
                if (c11 != null && h.e(c11) && (rootView = c11.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float c12 = h.c(rootView);
                    int size = arrayList.size();
                    while (size > 0 && h.c(arrayList.get(size - 1)) > c12) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.applovin.processor.a
    public JSONObject a(View view) {
        JSONObject a = com.iab.omid.library.applovin.utils.c.a(0, 0, 0, 0);
        com.iab.omid.library.applovin.utils.c.a(a, e.a());
        return a;
    }

    @Override // com.iab.omid.library.applovin.processor.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0154a interfaceC0154a, boolean z10, boolean z11) {
        Iterator<View> it = a().iterator();
        while (it.hasNext()) {
            interfaceC0154a.a(it.next(), this.a, jSONObject, z11);
        }
    }
}
