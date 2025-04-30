package com.facebook.login;

import com.google.android.gms.tasks.OnSuccessListener;
import h.C2310a;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements h.b, OnSuccessListener {
    public final /* synthetic */ F7.l b;

    @Override // h.b
    public void b(Object obj) {
        F7.l lVar = this.b;
        G7.j.e(lVar, "$tmp0");
        lVar.invoke((C2310a) obj);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        F7.l lVar = this.b;
        G7.j.e(lVar, "$tmp0");
        lVar.invoke(obj);
    }
}
