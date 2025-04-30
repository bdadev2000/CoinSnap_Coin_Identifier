package com.meta.analytics.dsp.uinode;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.cb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1820cb<ModelType, StateType> {
    public final ModelType A02;
    public final StateType A03;
    public final String A04;
    public List<InterfaceC1822cd<ModelType, StateType>> A01 = null;
    public C1819ca A00 = C1819ca.A08;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cb != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public C1820cb(ModelType model, StateType state, String str) {
        this.A02 = model;
        this.A03 = state;
        this.A04 = str;
    }

    public static /* synthetic */ C1819ca A00(C1820cb c1820cb) {
        return c1820cb.A00;
    }

    public static /* synthetic */ Object A01(C1820cb c1820cb) {
        return c1820cb.A02;
    }

    public static /* synthetic */ Object A02(C1820cb c1820cb) {
        return c1820cb.A03;
    }

    public static /* synthetic */ String A03(C1820cb c1820cb) {
        return c1820cb.A04;
    }

    public static /* synthetic */ List A04(C1820cb c1820cb) {
        return c1820cb.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cb != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cd != com.instagram.common.viewpoint.core.ViewpointAction<ModelType, StateType> */
    public final C1820cb<ModelType, StateType> A05(InterfaceC1822cd<ModelType, StateType> interfaceC1822cd) {
        if (this.A01 == null) {
            this.A01 = new ArrayList();
        }
        this.A01.add(interfaceC1822cd);
        return this;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cb != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public final C1819ca<ModelType, StateType> A06() {
        return new C1819ca<>(this);
    }
}
