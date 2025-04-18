package com.google.android.datatransport.cct;

import android.content.Context;
import androidx.annotation.Keep;
import j7.c;
import j7.d;
import j7.i;

@Keep
/* loaded from: classes3.dex */
public class CctBackendFactory {
    public i create(d dVar) {
        Context context = ((c) dVar).a;
        c cVar = (c) dVar;
        return new g7.d(context, cVar.f19774b, cVar.f19775c);
    }
}
