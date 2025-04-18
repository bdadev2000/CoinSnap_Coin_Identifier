package com.vungle.ads.internal.util;

import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class a extends d {
    final /* synthetic */ com.vungle.ads.internal.ui.k $adOpenCallback;
    final /* synthetic */ Intent $deepLinkOverrideIntent;
    final /* synthetic */ Intent $defaultIntent;
    final /* synthetic */ c $leftCallback;
    final /* synthetic */ WeakReference<Context> $weakContext;

    public a(WeakReference<Context> weakReference, Intent intent, Intent intent2, com.vungle.ads.internal.ui.k kVar, c cVar) {
        this.$weakContext = weakReference;
        this.$deepLinkOverrideIntent = intent;
        this.$defaultIntent = intent2;
        this.$adOpenCallback = kVar;
        this.$leftCallback = cVar;
    }

    @Override // com.vungle.ads.internal.util.d
    public void onStart() {
        boolean startActivityHandleException;
        super.onStart();
        b bVar = h.Companion;
        bVar.getInstance().removeListener(this);
        Context context = this.$weakContext.get();
        if (context != null) {
            startActivityHandleException = bVar.startActivityHandleException(context, this.$deepLinkOverrideIntent, this.$defaultIntent, this.$adOpenCallback);
            if (startActivityHandleException) {
                bVar.getInstance().addOnNextAppLeftCallback(this.$leftCallback);
            }
        }
    }
}
