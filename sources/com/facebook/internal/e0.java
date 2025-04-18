package com.facebook.internal;

import com.facebook.ads.internal.util.common.FbValidationUtils;

/* loaded from: classes3.dex */
public final class e0 extends f0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11034b;

    public /* synthetic */ e0(int i10) {
        this.f11034b = i10;
    }

    @Override // com.facebook.internal.f0
    public final String b() {
        switch (this.f11034b) {
            case 0:
                return "com.facebook.arstudio.player";
            case 1:
                return "com.instagram.android";
            case 2:
                return FbValidationUtils.FB_PACKAGE;
            case 3:
                return "com.facebook.orca";
            default:
                return "com.facebook.wakizashi";
        }
    }
}
