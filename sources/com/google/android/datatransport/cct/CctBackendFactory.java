package com.google.android.datatransport.cct;

import android.content.Context;
import androidx.annotation.Keep;
import i3.C2344c;
import l3.AbstractC2438c;
import l3.C2437b;
import l3.InterfaceC2443h;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory {
    public InterfaceC2443h create(AbstractC2438c abstractC2438c) {
        Context context = ((C2437b) abstractC2438c).f21555a;
        C2437b c2437b = (C2437b) abstractC2438c;
        return new C2344c(context, c2437b.b, c2437b.f21556c);
    }
}
