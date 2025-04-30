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

/* loaded from: classes3.dex */
public class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final a f14436a;

    public c(a aVar) {
        this.f14436a = aVar;
    }

    @NonNull
    public ArrayList<View> a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        com.iab.omid.library.applovin.internal.c c9 = com.iab.omid.library.applovin.internal.c.c();
        if (c9 != null) {
            Collection<com.iab.omid.library.applovin.adsession.a> a6 = c9.a();
            IdentityHashMap identityHashMap = new IdentityHashMap((a6.size() * 2) + 3);
            Iterator<com.iab.omid.library.applovin.adsession.a> it = a6.iterator();
            while (it.hasNext()) {
                View c10 = it.next().c();
                if (c10 != null && h.e(c10) && (rootView = c10.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float c11 = h.c(rootView);
                    int size = arrayList.size();
                    while (size > 0 && h.c(arrayList.get(size - 1)) > c11) {
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
        JSONObject a6 = com.iab.omid.library.applovin.utils.c.a(0, 0, 0, 0);
        com.iab.omid.library.applovin.utils.c.a(a6, e.a());
        return a6;
    }

    @Override // com.iab.omid.library.applovin.processor.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0142a interfaceC0142a, boolean z8, boolean z9) {
        Iterator<View> it = a().iterator();
        while (it.hasNext()) {
            interfaceC0142a.a(it.next(), this.f14436a, jSONObject, z9);
        }
    }
}
