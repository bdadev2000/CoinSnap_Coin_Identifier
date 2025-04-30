package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class LL extends KT {
    public static String[] A02 = {"NpaKE5UdtAyMHqvaLPx4AGtZ31wY3C1j", "hZ", "QvlAFGERqyhtEWGueXr2oEhguGRVkueU", "1PB7Q2A0OVus1FFgj1K4N07XZBnviAmq", "QCLV5siYIKSB8enqXDrdMSWnSISBhPag", "u71qdrqstjoPYAgdzxDuhzTAB45rQyDC", "tsgBYsPi1Izoi1wW5rl36QAscdyZX4HE", "imzaDMEG6ltP9AayN9N6Pvq8SnbIyMdS"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ QW A01;

    public LL(QW qw, int i9) {
        this.A01 = qw;
        this.A00 = i9;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        SA videoView;
        SA videoView2;
        videoView = this.A01.A00.A00.getVideoView();
        if (videoView != null) {
            int i9 = this.A00;
            if (A02[1].length() == 23) {
                throw new RuntimeException();
            }
            A02[5] = "iSSYmESuchF7uAVhXaEYpov3466pRlYS";
            if (i9 <= 0) {
                videoView2 = this.A01.A00.A00.getVideoView();
                videoView2.A0e(false, 9);
            }
        }
    }
}
