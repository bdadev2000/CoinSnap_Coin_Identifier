package com.google.android.material.datepicker;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes3.dex */
public final class g extends n0.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11681d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f11682e;

    public /* synthetic */ g(Object obj, int i10) {
        this.f11681d = i10;
        this.f11682e = obj;
    }

    @Override // n0.b
    public final void d(View view, o0.j jVar) {
        String string;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.a;
        int i10 = this.f11681d;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        switch (i10) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                jVar.j(null);
                return;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                jVar.m(false);
                return;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                k kVar = (k) this.f11682e;
                if (kVar.f11697n.getVisibility() == 0) {
                    string = kVar.getString(R.string.mtrl_picker_toggle_to_year_selection);
                } else {
                    string = kVar.getString(R.string.mtrl_picker_toggle_to_day_selection);
                }
                jVar.l(string);
                return;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                jVar.j(null);
                return;
        }
    }
}
