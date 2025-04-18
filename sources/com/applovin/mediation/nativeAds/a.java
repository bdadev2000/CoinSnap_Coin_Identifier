package com.applovin.mediation.nativeAds;

import android.view.View;
import com.facebook.internal.WebDialog;
import com.facebook.login.DeviceAuthDialog;
import com.facebook.login.widget.ToolTipPopup;
import com.google.android.material.datepicker.MaterialDatePicker;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28459a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28460b;

    public /* synthetic */ a(Object obj, int i2) {
        this.f28459a = i2;
        this.f28460b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i2 = this.f28459a;
        Object obj = this.f28460b;
        switch (i2) {
            case 0:
                ((MaxNativeAd) obj).performClick();
                return;
            case 1:
                WebDialog.a((WebDialog) obj, view);
                return;
            case 2:
                DeviceAuthDialog.l((DeviceAuthDialog) obj, view);
                return;
            case 3:
                ToolTipPopup.c((ToolTipPopup) obj, view);
                return;
            default:
                MaterialDatePicker.h((MaterialDatePicker) obj, view);
                return;
        }
    }
}
