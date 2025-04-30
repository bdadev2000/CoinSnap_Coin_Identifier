package com.google.ar.core;

import android.view.View;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;

/* loaded from: classes2.dex */
public final class D implements View.OnClickListener {
    public final /* synthetic */ InstallActivity b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14257c;

    public D(InstallActivity installActivity, int i9) {
        this.f14257c = i9;
        this.b = installActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i9 = this.f14257c;
        InstallActivity installActivity = this.b;
        if (i9 != 0) {
            installActivity.c(new UnavailableUserDeclinedInstallationException());
        } else {
            installActivity.b();
            installActivity.d();
        }
    }
}
