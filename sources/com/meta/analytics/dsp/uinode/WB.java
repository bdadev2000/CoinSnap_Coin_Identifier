package com.meta.analytics.dsp.uinode;

import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class WB implements InterfaceC1156Fo {
    public static String[] A01 = {"HW2qPt5u", "AwGYl2mpYTTxi9jMk2ztyBHwHH9P0uOm", "ziApCMCdbQMQdjd0mTARuvEC3B", "RZTttmRl2v5Rh0lD63G6fj8mov5GfzUW", "CAabTzRSjKw", "MBUj6", "1ELfNFRtAis", "0tjH0VZdGvNSLcI7F3HjH1zffCsfPrCD"};
    public final List<C1155Fn> A00;

    public WB(List<C1155Fn> list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1156Fo
    public final List<C1155Fn> A6Z(long j7) {
        return j7 >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1156Fo
    public final long A70(int i9) {
        AbstractC1192Ha.A03(i9 == 0);
        if (A01[2].length() == 12) {
            throw new RuntimeException();
        }
        A01[2] = "5DVkB5gcIO90TUIp";
        return 0L;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1156Fo
    public final int A71() {
        return 1;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1156Fo
    public final int A7T(long j7) {
        return j7 < 0 ? 0 : -1;
    }
}
