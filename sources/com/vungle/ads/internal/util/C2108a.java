package com.vungle.ads.internal.util;

import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* renamed from: com.vungle.ads.internal.util.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2108a extends C2111d {
    final /* synthetic */ com.vungle.ads.internal.ui.k $adOpenCallback;
    final /* synthetic */ Intent $deepLinkOverrideIntent;
    final /* synthetic */ Intent $defaultIntent;
    final /* synthetic */ InterfaceC2110c $leftCallback;
    final /* synthetic */ WeakReference<Context> $weakContext;

    public C2108a(WeakReference<Context> weakReference, Intent intent, Intent intent2, com.vungle.ads.internal.ui.k kVar, InterfaceC2110c interfaceC2110c) {
        this.$weakContext = weakReference;
        this.$deepLinkOverrideIntent = intent;
        this.$defaultIntent = intent2;
        this.$adOpenCallback = kVar;
        this.$leftCallback = interfaceC2110c;
    }

    @Override // com.vungle.ads.internal.util.C2111d
    public void onStart() {
        boolean startActivityHandleException;
        super.onStart();
        C2109b c2109b = h.Companion;
        c2109b.getInstance().removeListener(this);
        Context context = this.$weakContext.get();
        if (context != null) {
            startActivityHandleException = c2109b.startActivityHandleException(context, this.$deepLinkOverrideIntent, this.$defaultIntent, this.$adOpenCallback);
            if (startActivityHandleException) {
                c2109b.getInstance().addOnNextAppLeftCallback(this.$leftCallback);
            }
        }
    }
}
