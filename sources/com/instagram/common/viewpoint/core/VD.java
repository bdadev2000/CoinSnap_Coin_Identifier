package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class VD implements MP {
    public static String[] A01 = {"dAENZa04S5kpLZ1505OVGzU", "BCWAX", "x4EBtM5L1", "d5mzvX7vdf5oGTbdkf23a85QS6J33UuP", "T3xMk8xyeuXfnP2cHDF22zgmf4sSWk7a", "D6RnJQb1nSkQk7teZoJG77p", "lMrZ8D5HcAsH09zpnUIM78ubrFXrhoz6", "r7D6OIPJDO7XxyVdFUwVLtQI1zZlrgYr"};
    public final /* synthetic */ VA A00;

    public VD(VA va) {
        this.A00 = va;
    }

    @Override // com.instagram.common.viewpoint.core.MP
    public final void ABX() {
        boolean A0W;
        boolean z2;
        JF jf;
        MR mr;
        N9 n9;
        AtomicBoolean atomicBoolean;
        boolean A0V;
        AtomicBoolean atomicBoolean2;
        OS os;
        A0W = this.A00.A0W();
        if (A0W) {
            atomicBoolean2 = this.A00.A0V;
            if (!atomicBoolean2.get()) {
                os = this.A00.A0T;
                os.A07(this.A00);
                return;
            }
        }
        z2 = this.A00.A0X;
        if (z2) {
            atomicBoolean = this.A00.A0V;
            if (!atomicBoolean.get()) {
                A0V = this.A00.A0V();
                if (A0V) {
                    this.A00.A0a.setToolbarActionMode(0);
                    this.A00.A0L();
                    return;
                }
            }
        }
        jf = this.A00.A0N;
        JE je = JE.A07;
        String[] strArr = A01;
        if (strArr[3].charAt(15) != strArr[7].charAt(15)) {
            throw new RuntimeException();
        }
        A01[6] = "5WAARogjuXxHEWvmKD2XevOhgNSOEUJc";
        jf.A04(je, null);
        mr = this.A00.A0Q;
        n9 = this.A00.A0R;
        mr.A4P(n9.A7I());
    }
}
